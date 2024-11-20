import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mm")
public class class327 {
	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-980124054"
	)
	static void method6473(int var0, int var1, int var2, int var3, int var4) {
		NodeDeque var5 = Projection.worldView.groundItems[var0][var1][var2];
		if (var5 != null) {
			for (TileItem var6 = (TileItem)var5.last(); var6 != null; var6 = (TileItem)var5.previous()) {
				if ((var3 & 32767) == var6.id && var4 == var6.quantity) {
					var6.method2997();
					break;
				}
			}

			class173.updateItemPile(var0, var1, var2);
		}

	}

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIII)I",
		garbageValue = "-841409912"
	)
	@Export("insertMenuItemNoShift")
	public static final int insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		return LoginScreenAnimation.insertMenuItem(var0, var1, var2, var3, var4, var5, -1, false, -1);
	}
}
