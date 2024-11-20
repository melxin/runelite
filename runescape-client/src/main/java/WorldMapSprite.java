import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lw")
@Implements("WorldMapSprite")
public final class WorldMapSprite {
	@ObfuscatedName("aw")
	@Export("tileColors")
	final int[] tileColors;

	WorldMapSprite() {
		this.tileColors = new int[4096];
	}

	WorldMapSprite(int[] var1) {
		this.tileColors = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "1612"
	)
	@Export("getTileColor")
	final int getTileColor(int var1, int var2) {
		return this.tileColors[var1 + var2 * 64];
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1218883081"
	)
	public static void method6235(int var0, int var1) {
		StructComposition.method4069(var0, var1, 0, 0);
		class333.field3626.clear();
		class333.field3627.clear();
		if (class333.musicSongs.isEmpty() || var0 == 0 && var1 == 0) {
			class136.method3325();
		} else {
			class333.field3627.add(new DelayFadeTask((SongTask)null, class333.musicPlayerStatus));
			class333.field3627.add(new FadeOutTask((SongTask)null, 0, false, class333.field3630));
			ArrayList var3 = new ArrayList();
			Iterator var4 = class333.musicSongs.iterator();

			while (var4.hasNext()) {
				MusicSong var5 = (MusicSong)var4.next();
				var3.add(var5);
			}

			class333.field3627.add(new class443((SongTask)null, var3));
		}

	}
}
