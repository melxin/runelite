import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lf")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	static final WorldMapID field3508;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	static final WorldMapID field3503;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1166744947
	)
	@Export("value")
	final int value;

	static {
		field3508 = new WorldMapID(0);
		field3503 = new WorldMapID(1);
	}

	WorldMapID(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[IIII)V",
		garbageValue = "1060942896"
	)
	@Export("quicksortStringsWithCorrespondingIntegers")
	public static void quicksortStringsWithCorrespondingIntegers(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					int var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			quicksortStringsWithCorrespondingIntegers(var0, var1, var2, var5 - 1);
			quicksortStringsWithCorrespondingIntegers(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfu;",
		garbageValue = "-1895878343"
	)
	static class147[] method7020() {
		return new class147[]{class147.field1730, class147.field1728, class147.field1729, class147.field1734, class147.field1731, class147.field1732, class147.field1727, class147.field1735, class147.field1733};
	}
}
