import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mq")
public class class322 {
	@ObfuscatedName("oz")
	@ObfuscatedSignature(
		descriptor = "(Lov;B)Ljava/lang/String;",
		garbageValue = "21"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (class187.method4098(class255.method5526(var0)) == 0) {
			return null;
		} else {
			return var0.spellActionName != null && !var0.spellActionName.trim().isEmpty() ? var0.spellActionName : null;
		}
	}
}
