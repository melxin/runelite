import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ra")
@Implements("FadeOutTask")
public class FadeOutTask extends SongTask {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	MusicSong field4871;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1490327839
	)
	int field4872;

	@ObfuscatedSignature(
		descriptor = "(Lrg;IZI)V"
	)
	public FadeOutTask(SongTask var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field4871 = null;
		this.field4872 = 0;
		super.field4876 = "FadeOutTask";
		if (var2 >= 0) {
			if (var3 && var2 < class333.field3624.size()) {
				this.field4871 = (MusicSong)class333.field3624.get(var2);
			} else if (!var3 && var2 < class333.musicSongs.size()) {
				this.field4871 = (MusicSong)class333.musicSongs.get(var2);
			}

			this.field4872 = var4;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-1"
	)
	public boolean vmethod8722() {
		if (this.field4871 != null && this.field4871.midiPcmStream != null) {
			this.field4871.field3742 = true;

			try {
				if (this.field4871.field3739 > 0.0F && this.field4871.midiPcmStream.isReady()) {
					float var1 = this.field4872 == 0 ? (float)this.field4872 : (float)this.field4871.musicTrackVolume / (float)this.field4872;
					MusicSong var10000 = this.field4871;
					var10000.field3739 -= var1 == 0.0F ? (float)this.field4871.musicTrackVolume : var1;
					if (this.field4871.field3739 < 0.0F) {
						this.field4871.field3739 = 0.0F;
					}

					this.field4871.midiPcmStream.setPcmStreamVolume((int)this.field4871.field3739);
					return false;
				}
			} catch (Exception var3) {
				this.method8702(var3.getMessage());
				return true;
			}

			this.field4871.field3742 = false;
			return true;
		} else {
			return true;
		}
	}
}
