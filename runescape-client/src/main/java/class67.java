import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cz")
public enum class67 implements Enum {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lcz;"
	)
	field887(0, -1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lcz;"
	)
	field886(1, 2),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lcz;"
	)
	field885(2, 3),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lcz;"
	)
	field888(3, 4),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lcz;"
	)
	field895(4, 5),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lcz;"
	)
	field894(5, 6),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lcz;"
	)
	field891(6, 21);

	@ObfuscatedName("ar")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -2045284843
	)
	static int field890;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1194397097
	)
	final int field892;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1252580619
	)
	final int field893;

	class67(int var3, int var4) {
		this.field892 = var3;
		this.field893 = var4;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "20"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field893;
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(Ldd;IIIII)I",
		garbageValue = "1558970585"
	)
	static int method2215(WorldView var0, int var1, int var2, int var3, int var4) {
		if (var4 == 0) {
			return NPCComposition.getTileHeight(var0, var1, var2, var3);
		} else {
			int var5 = var4 / 2;
			int var6 = var1 - var5;
			int var7 = var2 - var5;
			int var8 = var5 + var1;
			int var9 = var5 + var2;
			int var10 = Coord.method7692(var6) + 1;
			int var11 = Coord.method7692(var7) + 1;
			int var12 = Coord.method7692(var8);
			int var13 = Coord.method7692(var9);
			int var14 = Integer.MAX_VALUE;

			for (int var15 = var10; var15 <= var12; ++var15) {
				for (int var16 = var11; var16 <= var13; ++var16) {
					var14 = Math.min(var14, NPCComposition.getTileHeight(var0, Coord.method7702(var15), Coord.method7702(var16), var3));
				}
			}

			var14 = Math.min(var14, NPCComposition.getTileHeight(var0, var1, var2, var3));
			var14 = Math.min(var14, NPCComposition.getTileHeight(var0, var1 - var5, var2 - var5, var3));
			var14 = Math.min(var14, NPCComposition.getTileHeight(var0, var1 - var5, var5 + var2, var3));
			var14 = Math.min(var14, NPCComposition.getTileHeight(var0, var5 + var1, var2 - var5, var3));
			var14 = Math.min(var14, NPCComposition.getTileHeight(var0, var5 + var1, var5 + var2, var3));
			return var14;
		}
	}

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(Ldd;IIIII)Lcw;",
		garbageValue = "650148394"
	)
	static final PendingSpawn method2209(WorldView var0, int var1, int var2, int var3, int var4) {
		for (PendingSpawn var5 = (PendingSpawn)var0.pendingSpawns.last(); var5 != null; var5 = (PendingSpawn)var0.pendingSpawns.previous()) {
			if (var5.plane == var1 && var2 == var5.x && var3 == var5.y && var4 == var5.type) {
				return var5;
			}
		}

		return null;
	}
}
