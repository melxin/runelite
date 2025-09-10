import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("up")
public class class521 {
	@ObfuscatedName("fy")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	static Client client;

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "99"
	)
	static void method10431() {
		if (Login.loginIndex == 34) {
			class265.Login_promptCredentials(false);
		}

		Login.worldSelectOpen = false;
		Rasterizer2D.Rasterizer2D_fillRectangle(0, 0, Rasterizer2D.Rasterizer2D_width, Rasterizer2D.Rasterizer2D_height, 0);
		Projectile.leftTitleSprite.drawAt(Login.xPadding, 0);
		class406.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
		class139.logoSprite.drawAt(Login.xPadding + 382 - class139.logoSprite.subWidth / 2, 18);
	}
}
