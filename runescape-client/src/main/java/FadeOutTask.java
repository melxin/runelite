import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sk")
@Implements("FadeOutTask")
public class FadeOutTask extends SongTask {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1038172093
	)
	static int field5372;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "[Lxm;"
	)
	@Export("title_muteSprite")
	static IndexedSprite[] title_muteSprite;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	MidiRequest field5373;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -174756867
	)
	int field5371;

	@ObfuscatedSignature(
		descriptor = "(Lsz;IZI)V"
	)
	public FadeOutTask(SongTask var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field5373 = null;
		this.field5371 = 0;
		super.field5378 = "FadeOutTask";
		if (var2 >= 0) {
			if (var3 && var2 < class345.field3933.size()) {
				this.field5373 = (MidiRequest)class345.field3933.get(var2);
			} else if (!var3 && var2 < class345.midiRequests.size()) {
				this.field5373 = (MidiRequest)class345.midiRequests.get(var2);
			}

			this.field5371 = var4;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "111"
	)
	public boolean vmethod9974() {
		if (this.field5373 != null && this.field5373.midiPcmStream != null) {
			this.field5373.field4050 = true;

			try {
				if (this.field5373.field4046 > 0.0F && this.field5373.midiPcmStream.isReady()) {
					float var1 = this.field5371 == 0 ? (float)this.field5371 : (float)this.field5373.musicTrackVolume / (float)this.field5371;
					MidiRequest var10000 = this.field5373;
					var10000.field4046 -= 0.0F == var1 ? (float)this.field5373.musicTrackVolume : var1;
					if (this.field5373.field4046 < 0.0F) {
						this.field5373.field4046 = 0.0F;
					}

					this.field5373.midiPcmStream.setPcmStreamVolume((int)this.field5373.field4046);
					return false;
				}
			} catch (Exception var3) {
				this.method9950(var3.getMessage());
				return true;
			}

			this.field5373.field4050 = false;
			return true;
		} else {
			return true;
		}
	}
}
