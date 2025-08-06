import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
public class class190 extends DualNode {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("field2023")
	public static EvictingDualNodeHashTable field2023;

	static {
		field2023 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lkg;",
		garbageValue = "1098645621"
	)
	public static class263 method4289() {
		return class263.field3059;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lwj;II)Ljava/lang/String;",
		garbageValue = "1253027938"
	)
	static String method4291(Buffer var0, int var1) {
		try {
			int var2 = var0.readUShortSmart();
			if (var2 > var1) {
				var2 = var1;
			}

			byte[] var3 = new byte[var2];
			var0.field5818 += class374.huffman.decompress(var0.offset, var0.field5818, var3, 0, var2);
			String var4 = WorldMapData_0.decodeStringCp1252(var3, 0, var2);
			return var4;
		} catch (Exception var6) {
			return "Cabbage";
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lrm;Lrm;I)F",
		garbageValue = "-477624241"
	)
	public static final float method4290(class448 var0, class448 var1) {
		return var0.method9060(var1);
	}
}
