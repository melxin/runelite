import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("if")
public class class231 extends DualNode {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("field1913")
	static EvictingDualNodeHashTable field1913;

	static {
		field1913 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(III)Lkv;",
		garbageValue = "-436780710"
	)
	static RouteStrategy method5129(int var0, int var1) {
		Client.field798.approxDestinationX = var0;
		Client.field798.approxDestinationY = var1;
		Client.field798.approxDestinationSizeX = 1;
		Client.field798.approxDestinationSizeY = 1;
		return Client.field798;
	}

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZII)I",
		garbageValue = "414685391"
	)
	@Export("insertMenuItem")
	static final int insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7, int var8) {
		if (Client.isMenuOpen) {
			return -1;
		} else {
			return !AbstractWorldMapIcon.method6465(var8, var2) ? -1 : Client.menu.insertMenuItem(var0, var1, var2, var3, var4, var5, var6, var7, var8);
		}
	}
}
