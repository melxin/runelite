import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("so")
@Implements("FadeInTask")
public class FadeInTask extends SongTask {
	@ObfuscatedName("ag")
	@Export("ByteArrayPool_altSizeArrayCounts")
	public static int[] ByteArrayPool_altSizeArrayCounts;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	MidiRequest field5296;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -677210511
	)
	int field5298;

	@ObfuscatedSignature(
		descriptor = "(Lsi;IZI)V"
	)
	public FadeInTask(SongTask var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field5296 = null;
		this.field5298 = 0;
		super.field5303 = "FadeInTask";
		if (var2 >= 0) {
			if (var3 && var2 < class339.field3895.size()) {
				this.field5296 = (MidiRequest)class339.field3895.get(var2);
			} else if (!var3 && var2 < class339.midiRequests.size()) {
				this.field5296 = (MidiRequest)class339.midiRequests.get(var2);
			}

			this.field5298 = var4;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "40"
	)
	public boolean vmethod9673() {
		if (this.field5296 != null && this.field5296.midiPcmStream != null) {
			this.field5296.field4010 = true;

			try {
				if (this.field5296.field4002 < (float)this.field5296.musicTrackVolume && this.field5296.midiPcmStream.isReady()) {
					float var1 = this.field5298 == 0 ? (float)this.field5298 : (float)this.field5296.musicTrackVolume / (float)this.field5298;
					MidiRequest var10000 = this.field5296;
					var10000.field4002 += 0.0F == var1 ? (float)this.field5296.musicTrackVolume : var1;
					if (this.field5296.field4002 > (float)this.field5296.musicTrackVolume) {
						this.field5296.field4002 = (float)this.field5296.musicTrackVolume;
					}

					this.field5296.midiPcmStream.setPcmStreamVolume((int)this.field5296.field4002);
					return false;
				}
			} catch (Exception var3) {
				this.method9659(var3.getMessage());
				return true;
			}

			this.field5296.field4010 = false;
			return true;
		} else {
			return true;
		}
	}
}
