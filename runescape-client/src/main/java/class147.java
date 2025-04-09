import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
public class class147 extends class148 {
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Lws;"
	)
	@Export("options_buttons_0Sprite")
	static IndexedSprite options_buttons_0Sprite;
	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("archive4")
	static Archive archive4;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 2008512059
	)
	int field1702;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	final class151 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfd;)V"
	)
	class147(class151 var1) {
		this.this$0 = var1;
		this.field1702 = -1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lve;B)V",
		garbageValue = "53"
	)
	void vmethod3749(Buffer var1) {
		this.field1702 = var1.readUnsignedShort();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lgw;I)V",
		garbageValue = "1984465176"
	)
	void vmethod3750(ClanSettings var1) {
		var1.method3562(this.field1702);
	}
}
