import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wk")
public class class587 {
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1680762139
	)
	final int field5903;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1278733913
	)
	final int field5898;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 185103673
	)
	final int field5900;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 2096932439
	)
	final int field5901;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1333227139
	)
	final int field5902;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 933497009
	)
	final int field5899;

	class587(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field5903 = var1;
		this.field5898 = var2;
		this.field5902 = var3;
		this.field5899 = var4;
		this.field5900 = var1 / 2;
		this.field5901 = var2 / 2;
	}

	public String toString() {
		return String.format("%dx%d (offset %d,%d)", this.field5903, this.field5898, this.field5902, this.field5899);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lpx;III)Z",
		garbageValue = "693945151"
	)
	public static boolean method11132(AbstractArchive var0, int var1, int var2) {
		byte[] var3 = var0.takeFile(var1, var2);
		if (var3 == null) {
			return false;
		} else {
			class265.SpriteBuffer_decode(var3);
			return true;
		}
	}
}
