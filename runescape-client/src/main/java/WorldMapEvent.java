import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("le")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	static AbstractArchive field3518;
	@ObfuscatedName("lu")
	@ObfuscatedGetter(
		intValue = -603478347
	)
	static int field3520;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -673818735
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILny;Lny;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1;
		this.coord1 = var2;
		this.coord2 = var3;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "302826270"
	)
	public static int method6973(int var0) {
		return var0 >> 1 & 3;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[Ljava/lang/Object;IIB)V",
		garbageValue = "53"
	)
	public static void method6974(String[] var0, Object[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			Object var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					Object var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method6974(var0, var1, var2, var5 - 1);
			method6974(var0, var1, var5 + 1, var3);
		}

	}
}
