import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sc")
@Implements("FadeOutTask")
public class FadeOutTask extends SongTask {
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Lxa;"
	)
	static IndexedSprite field5182;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	MidiRequest field5183;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1107094251
	)
	int field5184;

	@ObfuscatedSignature(
		descriptor = "(Lsj;IZI)V"
	)
	public FadeOutTask(SongTask var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field5183 = null;
		this.field5184 = 0;
		super.field5191 = "FadeOutTask";
		if (var2 >= 0) {
			if (var3 && var2 < class337.field3791.size()) {
				this.field5183 = (MidiRequest)class337.field3791.get(var2);
			} else if (!var3 && var2 < class337.midiRequests.size()) {
				this.field5183 = (MidiRequest)class337.midiRequests.get(var2);
			}

			this.field5184 = var4;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1329200530"
	)
	public boolean vmethod9672() {
		if (this.field5183 != null && this.field5183.midiPcmStream != null) {
			this.field5183.field3914 = true;

			try {
				if (this.field5183.field3912 > 0.0F && this.field5183.midiPcmStream.isReady()) {
					float var1 = this.field5184 == 0 ? (float)this.field5184 : (float)this.field5183.musicTrackVolume / (float)this.field5184;
					MidiRequest var10000 = this.field5183;
					var10000.field3912 -= var1 == 0.0F ? (float)this.field5183.musicTrackVolume : var1;
					if (this.field5183.field3912 < 0.0F) {
						this.field5183.field3912 = 0.0F;
					}

					this.field5183.midiPcmStream.setPcmStreamVolume((int)this.field5183.field3912);
					return false;
				}
			} catch (Exception var3) {
				this.method9654(var3.getMessage());
				return true;
			}

			this.field5183.field3914 = false;
			return true;
		} else {
			return true;
		}
	}
}
