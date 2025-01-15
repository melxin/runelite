import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kx")
public class class261 {
	@ObfuscatedName("wl")
	static Iterator field2784;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 565345345
	)
	public int field2785;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 940153151
	)
	public int field2780;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1837690773
	)
	public int field2781;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1384611761
	)
	public int field2782;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1467658147
	)
	public int field2783;

	class261(int var1, int var2, int var3, int var4, int var5) {
		this.field2785 = 0;
		this.field2780 = 1;
		this.field2781 = 0;
		this.field2782 = 0;
		this.field2783 = 0;
		this.field2785 = var1;
		this.field2780 = var2;
		this.field2781 = var3;
		this.field2782 = var4;
		this.field2783 = var5;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)Ljava/lang/String;",
		garbageValue = "2012062527"
	)
	public static String method5505(Buffer var0) {
		String var1;
		try {
			int var2 = var0.readUShortSmart();
			if (var2 > 32767) {
				var2 = 32767;
			}

			byte[] var3 = new byte[var2];
			var0.offset += class364.huffman.decompress(var0.array, var0.offset, var3, 0, var2);
			String var4 = GrandExchangeOfferTotalQuantityComparator.decodeStringCp1252(var3, 0, var2);
			var1 = var4;
		} catch (Exception var6) {
			var1 = "Cabbage";
		}

		return var1;
	}
}
