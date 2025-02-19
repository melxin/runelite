import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gs")
public class class159 extends class149 {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1455535601
	)
	static int field1784;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lwu;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;
	@ObfuscatedName("je")
	static byte[][] field1785;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -595760045
	)
	int field1781;
	@ObfuscatedName("ay")
	String field1782;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class152 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfv;)V"
	)
	class159(class152 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvy;B)V",
		garbageValue = "25"
	)
	void vmethod3702(Buffer var1) {
		this.field1781 = var1.readInt();
		this.field1782 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgg;I)V",
		garbageValue = "2011970201"
	)
	void vmethod3705(ClanSettings var1) {
		var1.method3590(this.field1781, this.field1782);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-117"
	)
	public static int method3544(int var0, int var1) {
		return (var0 << 8) + var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "-1959271403"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2];
		int var4 = 0;

		for (int var5 = 0; var5 < var2; ++var5) {
			int var6 = var0[var5 + var1] & 255;
			if (var6 != 0) {
				if (var6 >= 128 && var6 < 160) {
					char var7 = class433.cp1252AsciiExtension[var6 - 128];
					if (var7 == 0) {
						var7 = '?';
					}

					var6 = var7;
				}

				var3[var4++] = (char)var6;
			}
		}

		return new String(var3, 0, var4);
	}
}
