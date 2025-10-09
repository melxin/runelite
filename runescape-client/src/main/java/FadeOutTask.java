import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("si")
@Implements("FadeOutTask")
public class FadeOutTask extends SongTask {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	MidiRequest field5347;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -739306893
	)
	int field5346;

	@ObfuscatedSignature(
		descriptor = "(Lsw;IZI)V"
	)
	public FadeOutTask(SongTask var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field5347 = null;
		this.field5346 = 0;
		super.field5350 = "FadeOutTask";
		if (var2 >= 0) {
			if (var3 && var2 < class338.field3893.size()) {
				this.field5347 = (MidiRequest)class338.field3893.get(var2);
			} else if (!var3 && var2 < class338.midiRequests.size()) {
				this.field5347 = (MidiRequest)class338.midiRequests.get(var2);
			}

			this.field5346 = var4;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1369867803"
	)
	public boolean vmethod9763() {
		if (this.field5347 != null && this.field5347.midiPcmStream != null) {
			this.field5347.field4023 = true;

			try {
				if (this.field5347.field4019 > 0.0F && this.field5347.midiPcmStream.isReady()) {
					float var1 = this.field5346 == 0 ? (float)this.field5346 : (float)this.field5347.musicTrackVolume / (float)this.field5346;
					MidiRequest var10000 = this.field5347;
					var10000.field4019 -= 0.0F == var1 ? (float)this.field5347.musicTrackVolume : var1;
					if (this.field5347.field4019 < 0.0F) {
						this.field5347.field4019 = 0.0F;
					}

					this.field5347.midiPcmStream.setPcmStreamVolume((int)this.field5347.field4019);
					return false;
				}
			} catch (Exception var3) {
				this.method9741(var3.getMessage());
				return true;
			}

			this.field5347.field4023 = false;
			return true;
		} else {
			return true;
		}
	}
}
