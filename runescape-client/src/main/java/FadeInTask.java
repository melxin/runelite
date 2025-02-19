import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ry")
@Implements("FadeInTask")
public class FadeInTask extends SongTask {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	MidiRequest field5027;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 331286883
	)
	int field5025;

	@ObfuscatedSignature(
		descriptor = "(Lrt;IZI)V"
	)
	public FadeInTask(SongTask var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field5027 = null;
		this.field5025 = 0;
		super.field5028 = "FadeInTask";
		if (var2 >= 0) {
			if (var3 && var2 < class335.field3687.size()) {
				this.field5027 = (MidiRequest)class335.field3687.get(var2);
			} else if (!var3 && var2 < class335.midiRequests.size()) {
				this.field5027 = (MidiRequest)class335.midiRequests.get(var2);
			}

			this.field5025 = var4;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2115930134"
	)
	public boolean vmethod8896() {
		if (this.field5027 != null && this.field5027.midiPcmStream != null) {
			this.field5027.field3807 = true;

			try {
				if (this.field5027.field3803 < (float)this.field5027.musicTrackVolume && this.field5027.midiPcmStream.isReady()) {
					float var1 = this.field5025 == 0 ? (float)this.field5025 : (float)this.field5027.musicTrackVolume / (float)this.field5025;
					MidiRequest var10000 = this.field5027;
					var10000.field3803 += 0.0F == var1 ? (float)this.field5027.musicTrackVolume : var1;
					if (this.field5027.field3803 > (float)this.field5027.musicTrackVolume) {
						this.field5027.field3803 = (float)this.field5027.musicTrackVolume;
					}

					this.field5027.midiPcmStream.setPcmStreamVolume((int)this.field5027.field3803);
					return false;
				}
			} catch (Exception var3) {
				this.method8875(var3.getMessage());
				return true;
			}

			this.field5027.field3807 = false;
			return true;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1291069355"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var1 == null ? 0 : var1.size();
	}
}
