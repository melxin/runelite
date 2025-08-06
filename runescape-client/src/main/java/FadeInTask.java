import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sa")
@Implements("FadeInTask")
public class FadeInTask extends SongTask {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	MidiRequest field5187;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -33349077
	)
	int field5186;

	@ObfuscatedSignature(
		descriptor = "(Lsj;IZI)V"
	)
	public FadeInTask(SongTask var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field5187 = null;
		this.field5186 = 0;
		super.field5191 = "FadeInTask";
		if (var2 >= 0) {
			if (var3 && var2 < class337.field3791.size()) {
				this.field5187 = (MidiRequest)class337.field3791.get(var2);
			} else if (!var3 && var2 < class337.midiRequests.size()) {
				this.field5187 = (MidiRequest)class337.midiRequests.get(var2);
			}

			this.field5186 = var4;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1329200530"
	)
	public boolean vmethod9672() {
		if (this.field5187 != null && this.field5187.midiPcmStream != null) {
			this.field5187.field3914 = true;

			try {
				if (this.field5187.field3912 < (float)this.field5187.musicTrackVolume && this.field5187.midiPcmStream.isReady()) {
					float var1 = this.field5186 == 0 ? (float)this.field5186 : (float)this.field5187.musicTrackVolume / (float)this.field5186;
					MidiRequest var10000 = this.field5187;
					var10000.field3912 += 0.0F == var1 ? (float)this.field5187.musicTrackVolume : var1;
					if (this.field5187.field3912 > (float)this.field5187.musicTrackVolume) {
						this.field5187.field3912 = (float)this.field5187.musicTrackVolume;
					}

					this.field5187.midiPcmStream.setPcmStreamVolume((int)this.field5187.field3912);
					return false;
				}
			} catch (Exception var3) {
				this.method9654(var3.getMessage());
				return true;
			}

			this.field5187.field3914 = false;
			return true;
		} else {
			return true;
		}
	}
}
