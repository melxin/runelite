import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hq")
public class class203 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	static final class203 field2201;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	static final class203 field2193;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	static final class203 field2196;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	static final class203 field2194;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	static final class203 field2195;
	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "Les;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;

	static {
		field2201 = new class203(0);
		field2193 = new class203(1);
		field2196 = new class203(2);
		field2194 = new class203(3);
		field2195 = new class203(4);
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "0"
	)
	class203(int var1) {
	}

	@ObfuscatedName("oy")
	@ObfuscatedSignature(
		descriptor = "(Lox;I)Ljava/lang/String;",
		garbageValue = "149675780"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (class255.Widget_unpackTargetMask(class516.getWidgetFlags(var0)) == 0) {
			return null;
		} else {
			return var0.spellActionName != null && !var0.spellActionName.trim().isEmpty() ? var0.spellActionName : null;
		}
	}
}
