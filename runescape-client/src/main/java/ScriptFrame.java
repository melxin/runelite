import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hk")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ZZI)Lxc;",
		garbageValue = "1014942154"
	)
	static IndexedSprite method4283(boolean var0, boolean var1) {
		return var0 ? (var1 ? class178.field1964 : class199.options_buttons_2Sprite) : (var1 ? class386.field4416 : WorldMapArea.options_buttons_0Sprite);
	}
}
