import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nh")
public class class339 {
	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("textureProvider")
	static TextureProvider textureProvider;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -172465173
	)
	int field3753;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lcd;"
	)
	class53 field3750;

	@ObfuscatedSignature(
		descriptor = "(ILcd;)V"
	)
	class339(int var1, class53 var2) {
		this.field3753 = var1;
		this.field3750 = var2;
	}

	@ObfuscatedName("ax")
	static final void method6784(long var0) {
		ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var0;
	}
}
