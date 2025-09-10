import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("nt")
	static boolean field860;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpw;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1091941097
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1815336057
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Lpw;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0;
		this.archive = var1;
		this.groupCount = var1.getGroupCount();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-310205211"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0;

		for (int var1 = 0; var1 < this.groupCount; ++var1) {
			if (!this.archive.method8298(var1) || this.archive.method8297(var1)) {
				++this.loadedCount;
			}
		}

		return this.loadedCount >= this.groupCount;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "57"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null;

		try {
			var0 = class33.getPreferencesFile("", class429.field5084.name, true);
			Buffer var1 = class36.clientPreferences.toBuffer();
			var0.write(var1.field5916, 0, var1.array * 1216585693);
		} catch (Exception var3) {
		}

		try {
			if (var0 != null) {
				var0.closeSync(true);
			}
		} catch (Exception var2) {
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "22196"
	)
	static void method2093() {
		Tiles.Tiles_minPlane = 99;
		Message.Tiles_underlays = new short[4][104][104];
		Tiles.Tiles_overlays = new short[4][104][104];
		Tiles.Tiles_shapes = new byte[4][104][104];
		Tiles.field848 = new byte[4][104][104];
		PlayerType.field4837 = new int[4][105][105];
		Tiles.Tiles_underlays2 = new byte[4][105][105];
		class159.field1828 = new int[105][105];
		UserComparator7.Tiles_hue = new int[104];
		class256.Tiles_saturation = new int[104];
		Tiles.Tiles_lightness = new int[104];
		Tiles.Tiles_hueMultiplier = new int[104];
		Frames.field2814 = new int[104];
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1138437912"
	)
	public static int method2087(int var0) {
		return var0 >> 1 & 3;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lpx;Ljava/lang/String;Ljava/lang/String;I)Lxc;",
		garbageValue = "-230403327"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) {
			return null;
		} else {
			int var3 = var0.getGroupId(var1);
			int var4 = var0.getFileId(var3, var2);
			return class342.method7322(var0, var3, var4);
		}
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(Ldr;IIIIII)V",
		garbageValue = "-2035876549"
	)
	static void method2091(WorldView var0, int var1, int var2, int var3, int var4, int var5) {
		NodeDeque var6 = var0.groundItems[var1][var2][var3];
		if (var6 != null) {
			for (TileItem var7 = (TileItem)var6.last(); var7 != null; var7 = (TileItem)var6.previous()) {
				if ((var4 & 32767) == var7.id) {
					var7.setFlag(var5);
					break;
				}
			}
		}

	}
}
