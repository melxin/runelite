import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
public enum class92 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	field1108(0, -1),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	field1106(1, 1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	field1105(2, 7),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	field1107(3, 8),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	field1109(4, 9);

	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -207271665
	)
	final int field1110;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1030165311
	)
	final int field1111;

	class92(int var3, int var4) {
		this.field1110 = var3;
		this.field1111 = var4;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1071289392"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1111;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvj;II)V",
		garbageValue = "-491381211"
	)
	public static void method2511(Buffer var0, int var1) {
		if (JagexCache.JagexCache_randomDat != null) {
			try {
				JagexCache.JagexCache_randomDat.seek(0L);
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24);
			} catch (Exception var3) {
			}
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Lia;",
		garbageValue = "-1435331392"
	)
	public static Clock method2513() {
		try {
			return new NanoClock();
		} catch (Throwable var1) {
			return new MilliClock();
		}
	}

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(Ldm;IIIB)V",
		garbageValue = "0"
	)
	@Export("updateItemPile2")
	static final void updateItemPile2(WorldView var0, int var1, int var2, int var3) {
		NodeDeque var4 = var0.groundItems[var1][var2][var3];
		if (var4 == null) {
			var0.scene.removeGroundItemPile(var1, var2, var3);
		} else {
			long var5 = -99999999L;
			TileItem var7 = null;

			TileItem var8;
			for (var8 = (TileItem)var4.last(); var8 != null; var8 = (TileItem)var4.previous()) {
				ItemComposition var9 = WorldEntityCoord.ItemDefinition_get(var8.id);
				long var13 = (long)var9.price;
				if (var9.isStackable == 1) {
					var13 *= var8.quantity < Integer.MAX_VALUE ? (long)(var8.quantity + 1) : (long)var8.quantity;
				}

				if (var13 > var5) {
					var5 = var13;
					var7 = var8;
				}
			}

			if (var7 == null) {
				var0.scene.removeGroundItemPile(var1, var2, var3);
			} else {
				var4.addLast(var7);
				TileItem var15 = null;
				TileItem var10 = null;

				for (var8 = (TileItem)var4.last(); var8 != null; var8 = (TileItem)var4.previous()) {
					if (var7.id != var8.id) {
						if (var15 == null) {
							var15 = var8;
						}

						if (var15.id != var8.id && var10 == null) {
							var10 = var8;
						}
					}
				}

				long var11 = WorldMapScaleHandler.calculateTag(var2, var3, 3, false, 0, var0.id);
				var0.scene.newGroundItemPile(var1, var2, var3, class77.getTileHeight(var0, Coord.method6843(var2), Coord.method6843(var3), var1), var7, var11, var15, var10);
			}
		}
	}
}
