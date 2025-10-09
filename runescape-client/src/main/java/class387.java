import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ob")
public class class387 {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "216872979"
	)
	static void method8213() {
		if (class226.clearLoginScreen) {
			class546.titleboxSprite = null;
			Huffman.titlebuttonSprite = null;
			class255.runesSprite = null;
			HttpMethod.leftTitleSprite = null;
			class156.rightTitleSprite = null;
			class1.logoSprite = null;
			VarpDefinition.title_muteSprite = null;
			GrandExchangeOfferOwnWorldComparator.options_buttons_0Sprite = null;
			WorldViewManager.options_buttons_2Sprite = null;
			class85.worldSelectBackSprites = null;
			class456.worldSelectFlagSprites = null;
			Huffman.worldSelectArrows = null;
			UserList.worldSelectStars = null;
			Login.field731 = null;
			JagNetThread.loginScreenRunesAnimation.method2565();
			Clock.method6092(0, 100);
			class486.method9899().method8489(true);
			class226.clearLoginScreen = false;
		}
	}
}
