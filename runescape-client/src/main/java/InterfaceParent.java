import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cz")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Lwd;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -450283911
	)
	@Export("group")
	int group;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -2106237637
	)
	@Export("type")
	int type;
	@ObfuscatedName("an")
	boolean field886;

	InterfaceParent() {
		this.field886 = false;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfx;",
		garbageValue = "785229831"
	)
	static class138[] method2107() {
		return new class138[]{class138.field1648, class138.field1631, class138.field1632, class138.field1646, class138.field1651, class138.field1635, class138.field1636, class138.field1637, class138.field1638, class138.field1639, class138.field1643, class138.field1641, class138.field1642, class138.field1633, class138.field1644, class138.field1645, class138.field1630};
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(Lce;I)V",
		garbageValue = "-1451334217"
	)
	static void method2108(class70 var0) {
		if (Client.field392 != var0) {
			Client.field392 = var0;
		}
	}
}
