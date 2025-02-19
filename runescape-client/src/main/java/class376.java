import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("on")
public class class376 {
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1189957685
	)
	static int field4168;
	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	@Export("widgetDefinition")
	static WidgetDefinition widgetDefinition;
	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	@Export("worldView")
	static WorldView worldView;

	static {
		Math.sqrt(8192.0D);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(CLqt;B)I",
		garbageValue = "91"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4;
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
			var0 = Character.toLowerCase(var0);
			var2 = (var0 << 4) + 1;
		}

		if (var0 == 241 && var1 == Language.Language_ES) {
			var2 = 1762;
		}

		return var2;
	}
}
