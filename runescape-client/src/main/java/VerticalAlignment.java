import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ht")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	field2155(1, 0),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("VerticalAlignment_centered")
	VerticalAlignment_centered(2, 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	field2154(0, 2);

	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1522337653
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 867299273
	)
	@Export("id")
	final int id;

	VerticalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1012656358"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILcr;I)Lcs;",
		garbageValue = "438437420"
	)
	public static Player method4463(int var0, WorldViewManager var1) {
		Player var2 = null;
		Iterator var3 = var1.iterator();

		while (var3.hasNext()) {
			WorldView var4 = (WorldView)var3.next();
			Player var5 = (Player)var4.players.get((long)var0);
			if (var5 != null) {
				if (var4.id != -1) {
					return var5;
				}

				var2 = var5;
			}
		}

		return var2;
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(Ldm;IIIIB)I",
		garbageValue = "34"
	)
	static int method4455(WorldView var0, int var1, int var2, int var3, int var4) {
		if (var4 == 0) {
			return class280.getTileHeight(var0, var1, var2, var3);
		} else {
			int var5 = var4 / 2;
			int var6 = var1 - var5;
			int var7 = var2 - var5;
			int var8 = var5 + var1;
			int var9 = var5 + var2;
			int var10 = var6 >> 7;
			int var11 = var10 + 1;
			int var12 = var7 >> 7;
			int var13 = var12 + 1;
			int var14 = var8 >> 7;
			int var15 = var14;
			int var16 = var9 >> 7;
			int var17 = var16;
			int var18 = Integer.MAX_VALUE;

			for (int var19 = var11; var19 <= var15; ++var19) {
				for (int var20 = var13; var20 <= var17; ++var20) {
					var18 = Math.min(var18, class280.getTileHeight(var0, Coord.method7440(var19), Coord.method7440(var20), var3));
				}
			}

			var18 = Math.min(var18, class280.getTileHeight(var0, var1, var2, var3));
			var18 = Math.min(var18, class280.getTileHeight(var0, var1 - var5, var2 - var5, var3));
			var18 = Math.min(var18, class280.getTileHeight(var0, var1 - var5, var5 + var2, var3));
			var18 = Math.min(var18, class280.getTileHeight(var0, var5 + var1, var2 - var5, var3));
			var18 = Math.min(var18, class280.getTileHeight(var0, var5 + var1, var5 + var2, var3));
			return var18;
		}
	}
}
