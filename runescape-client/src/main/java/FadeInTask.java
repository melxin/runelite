import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rt")
@Implements("FadeInTask")
public class FadeInTask extends SongTask {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	MusicSong field4874;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -642862975
	)
	int field4873;

	@ObfuscatedSignature(
		descriptor = "(Lrg;IZI)V"
	)
	public FadeInTask(SongTask var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field4874 = null;
		this.field4873 = 0;
		super.field4876 = "FadeInTask";
		if (var2 >= 0) {
			if (var3 && var2 < class333.field3624.size()) {
				this.field4874 = (MusicSong)class333.field3624.get(var2);
			} else if (!var3 && var2 < class333.musicSongs.size()) {
				this.field4874 = (MusicSong)class333.musicSongs.get(var2);
			}

			this.field4873 = var4;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-1"
	)
	public boolean vmethod8722() {
		if (this.field4874 != null && this.field4874.midiPcmStream != null) {
			this.field4874.field3742 = true;

			try {
				if (this.field4874.field3739 < (float)this.field4874.musicTrackVolume && this.field4874.midiPcmStream.isReady()) {
					float var1 = this.field4873 == 0 ? (float)this.field4873 : (float)this.field4874.musicTrackVolume / (float)this.field4873;
					MusicSong var10000 = this.field4874;
					var10000.field3739 += 0.0F == var1 ? (float)this.field4874.musicTrackVolume : var1;
					if (this.field4874.field3739 > (float)this.field4874.musicTrackVolume) {
						this.field4874.field3739 = (float)this.field4874.musicTrackVolume;
					}

					this.field4874.midiPcmStream.setPcmStreamVolume((int)this.field4874.field3739);
					return false;
				}
			} catch (Exception var3) {
				this.method8702(var3.getMessage());
				return true;
			}

			this.field4874.field3742 = false;
			return true;
		} else {
			return true;
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "1347144383"
	)
	static int method8692(int var0, Script var1, boolean var2) {
		if (var0 == 7463) {
			boolean var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
			class178.method3744(var3);
			return 1;
		} else {
			return 2;
		}
	}
}
