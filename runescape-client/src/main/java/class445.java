import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rz")
public class class445 extends SongTask {
	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("textureProvider")
	static TextureProvider textureProvider;

	@ObfuscatedSignature(
		descriptor = "(Lrg;)V"
	)
	public class445(SongTask var1) {
		super(var1);
		super.field4876 = "StartSongTask";
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-1"
	)
	public boolean vmethod8722() {
		Iterator var1 = class333.musicSongs.iterator();

		while (var1.hasNext()) {
			MusicSong var2 = (MusicSong)var1.next();
			if (var2 != null && !var2.field3743 && var2.midiPcmStream != null) {
				try {
					var2.midiPcmStream.method6558();
					var2.midiPcmStream.setPcmStreamVolume(0);
					if (var2.field3747 != null) {
						var2.midiPcmStream.setMusicTrack(var2.field3747, var2.musicTrackBoolean);
					}

					var2.field3747 = null;
					var2.field3746 = null;
					var2.musicTrackArchive = null;
					var2.field3743 = true;
				} catch (Exception var4) {
					ArchiveLoader.RunException_sendStackTrace((String)null, var4);
					this.method8702(var4.getMessage());
					return true;
				}
			}
		}

		super.field4879 = true;
		return true;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZB)V",
		garbageValue = "-26"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		ArchiveLoader.method2442(var0, var1, "openjs", var2);
	}
}
