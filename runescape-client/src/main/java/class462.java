import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rd")
public class class462 {
	@ObfuscatedName("ab")
	public char field5293;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -518246117
	)
	public int field5292;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 41113153
	)
	public int field5294;

	class462() {
		this.field5292 = 0;
		this.field5294 = 0;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "79"
	)
	static void method9467() {
		if (Login.loginIndex == 34) {
			class146.Login_promptCredentials(false);
		}

		Login.worldSelectOpen = false;
		Rasterizer2D.Rasterizer2D_fillRectangle(0, 0, Rasterizer2D.Rasterizer2D_width, Rasterizer2D.Rasterizer2D_height, 0);
		HttpMethod.leftTitleSprite.drawAt(Login.xPadding, 0);
		class156.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
		class1.logoSprite.drawAt(Login.xPadding + 382 - class1.logoSprite.subWidth / 2, 18);
	}
}
