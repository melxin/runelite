import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fh")
public enum class134 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	field1596(0, 0),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	field1594(1, 1),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	field1595(2, 2),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	field1597(3, 3),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	field1598(4, 4);

	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1223434599
	)
	final int field1599;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1229066887
	)
	final int field1600;

	class134(int var3, int var4) {
		this.field1599 = var3;
		this.field1600 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "32"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1600;
	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "(I)Luq;",
		garbageValue = "-291422392"
	)
	@Export("getPlatformInfo")
	static PlatformInfo getPlatformInfo() {
		return Decimator.platformInfo;
	}

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;IIIIIII)V",
		garbageValue = "-61207080"
	)
	static final void method3337(int var0, String var1, String var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (!Client.isMenuOpen) {
			if (LoginPacket.method3469(var8, var3)) {
				if (var0 >= 0 && var0 < Client.menu.subMenus.length) {
					if (Client.menu.subMenus[var0] == null) {
						Client.menu.subMenus[var0] = new Menu(false);
					}

					Client.menu.subMenus[var0].insertMenuItem(var1, var2, var3, var4, var5, var6, var7, false, var8);
				}
			}
		}
	}
}
