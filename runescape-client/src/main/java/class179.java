import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
public class class179 extends DualNode {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("field1915")
	static EvictingDualNodeHashTable field1915;

	static {
		field1915 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljx;IIIILrr;IIII)Z",
		garbageValue = "2119831854"
	)
	static final boolean method4147(Model var0, int var1, int var2, int var3, int var4, TransformationMatrix var5, int var6, int var7, int var8) {
		boolean var9 = ViewportMouse.ViewportMouse_isInViewport;
		if (!var9) {
			return false;
		} else {
			Projectile.method1950(var5, var6, var7, var8);
			return MenuAction.method1866(var0, var1, var2, var3, var4);
		}
	}
}
