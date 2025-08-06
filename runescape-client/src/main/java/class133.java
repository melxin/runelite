import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
public class class133 {
	@ObfuscatedName("av")
	public static final float field1600;
	@ObfuscatedName("au")
	public static final float field1598;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 1700819033
	)
	@Export("loginBoxCenter")
	static int loginBoxCenter;

	static {
		field1600 = Math.ulp(1.0F);
		field1598 = field1600 * 2.0F;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)J",
		garbageValue = "-1788739749"
	)
	public static long method3575(int var0) {
		return ViewportMouse.ViewportMouse_entityTags[var0];
	}
}
