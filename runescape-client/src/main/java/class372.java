import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oh")
public class class372 {
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Lxv;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Lox;Lox;B)V",
		garbageValue = "0"
	)
	static void method8108(Widget var0, Widget var1) {
		if (var0.type == 0) {
			for (int var2 = var0.field4148; var2 <= var0.field4090; ++var2) {
				Widget var3 = var1.children[var2];
				if (var3 != null && var0.childIndex * -64977777 == var3.field4117) {
					method8108(var3, var1);
				}
			}
		}

		var1.children[var0.childIndex * -64977777] = null;
	}
}
