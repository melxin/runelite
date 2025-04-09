import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rq")
@Implements("FadeInTask")
public class FadeInTask extends SongTask {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	MidiRequest field5035;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -560686561
	)
	int field5034;

	@ObfuscatedSignature(
		descriptor = "(Lro;IZI)V"
	)
	public FadeInTask(SongTask var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field5035 = null;
		this.field5034 = 0;
		super.field5039 = "FadeInTask";
		if (var2 >= 0) {
			if (var3 && var2 < class335.field3694.size()) {
				this.field5035 = (MidiRequest)class335.field3694.get(var2);
			} else if (!var3 && var2 < class335.midiRequests.size()) {
				this.field5035 = (MidiRequest)class335.midiRequests.get(var2);
			}

			this.field5034 = var4;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1093204820"
	)
	public boolean vmethod8938() {
		if (this.field5035 != null && this.field5035.midiPcmStream != null) {
			this.field5035.field3819 = true;

			try {
				if (this.field5035.field3815 < (float)this.field5035.musicTrackVolume && this.field5035.midiPcmStream.isReady()) {
					float var1 = this.field5034 == 0 ? (float)this.field5034 : (float)this.field5035.musicTrackVolume / (float)this.field5034;
					MidiRequest var10000 = this.field5035;
					var10000.field3815 += 0.0F == var1 ? (float)this.field5035.musicTrackVolume : var1;
					if (this.field5035.field3815 > (float)this.field5035.musicTrackVolume) {
						this.field5035.field3815 = (float)this.field5035.musicTrackVolume;
					}

					this.field5035.midiPcmStream.setPcmStreamVolume((int)this.field5035.field3815);
					return false;
				}
			} catch (Exception var3) {
				this.method8920(var3.getMessage());
				return true;
			}

			this.field5035.field3819 = false;
			return true;
		} else {
			return true;
		}
	}
}
