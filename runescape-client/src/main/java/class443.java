import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rc")
public class class443 extends SongTask {
	@ObfuscatedName("li")
	@ObfuscatedGetter(
		intValue = -636850797
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;
	@ObfuscatedName("ab")
	ArrayList field4863;

	@ObfuscatedSignature(
		descriptor = "(Lrg;Ljava/util/ArrayList;)V"
	)
	public class443(SongTask var1, ArrayList var2) {
		super(var1);
		super.field4876 = "ClearRequestTask";
		this.field4863 = var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-1"
	)
	public boolean vmethod8722() {
		if (this.field4863.isEmpty()) {
			return true;
		} else {
			Iterator var1 = this.field4863.iterator();

			while (var1.hasNext()) {
				MusicSong var2 = (MusicSong)var1.next();

				try {
					if (class333.musicSongs.contains(var2)) {
						if (var2 == null) {
							class333.musicSongs.remove(var2);
						} else {
							if (var2.midiPcmStream.field3667 > 0) {
								--var2.midiPcmStream.field3667;
							}

							if (var2.midiPcmStream.field3667 == 0) {
								var2.midiPcmStream.clear();
								var2.midiPcmStream.method6594();
								var2.midiPcmStream.setPcmStreamVolume(0);
							}

							Projection.method5195(var2.musicTrackGroupId, var2.musicTrackFileId);
							class333.musicSongs.remove(var2);
						}
					}
				} catch (Exception var4) {
					ArchiveLoader.RunException_sendStackTrace((String)null, var4);
					this.method8702(var4.getMessage());
					class333.musicSongs.clear();
					return true;
				}
			}

			return true;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "312537844"
	)
	public static boolean method8679() {
		return !class333.field3626.isEmpty();
	}
}
