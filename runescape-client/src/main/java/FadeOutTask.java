import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rm")
@Implements("FadeOutTask")
public class FadeOutTask extends SongTask {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	MidiRequest field5083;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 736120137
	)
	int field5082;

	@ObfuscatedSignature(
		descriptor = "(Lrh;IZI)V"
	)
	public FadeOutTask(SongTask var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field5083 = null;
		this.field5082 = 0;
		super.field5090 = "FadeOutTask";
		if (var2 >= 0) {
			if (var3 && var2 < class335.field3704.size()) {
				this.field5083 = (MidiRequest)class335.field3704.get(var2);
			} else if (!var3 && var2 < class335.midiRequests.size()) {
				this.field5083 = (MidiRequest)class335.midiRequests.get(var2);
			}

			this.field5082 = var4;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1822823713"
	)
	public boolean vmethod9290() {
		if (this.field5083 != null && this.field5083.midiPcmStream != null) {
			this.field5083.field3818 = true;

			try {
				if (this.field5083.field3814 > 0.0F && this.field5083.midiPcmStream.isReady()) {
					float var1 = this.field5082 == 0 ? (float)this.field5082 : (float)this.field5083.musicTrackVolume / (float)this.field5082;
					MidiRequest var10000 = this.field5083;
					var10000.field3814 -= 0.0F == var1 ? (float)this.field5083.musicTrackVolume : var1;
					if (this.field5083.field3814 < 0.0F) {
						this.field5083.field3814 = 0.0F;
					}

					this.field5083.midiPcmStream.setPcmStreamVolume((int)this.field5083.field3814);
					return false;
				}
			} catch (Exception var3) {
				this.method9268(var3.getMessage());
				return true;
			}

			this.field5083.field3818 = false;
			return true;
		} else {
			return true;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1358238848"
	)
	public static int method9257(int var0) {
		return (var0 & class569.field5624) - 1;
	}
}
