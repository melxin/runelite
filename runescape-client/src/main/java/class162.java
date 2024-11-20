import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gh")
public class class162 extends class166 {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -140162681
	)
	static int field1770;
	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "Lvr;"
	)
	@Export("redHintArrowSprite")
	static SpritePixels redHintArrowSprite;
	@ObfuscatedName("ab")
	String field1768;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1600571609
	)
	int field1766;
	@ObfuscatedName("at")
	byte field1767;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgl;"
	)
	final class167 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgl;)V"
	)
	class162(class167 var1) {
		this.this$0 = var1;
		this.field1768 = null;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvj;B)V",
		garbageValue = "13"
	)
	void vmethod3691(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

		this.field1768 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1766 = var1.readUnsignedShort();
		this.field1767 = var1.readByte();
		var1.readLong();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgc;I)V",
		garbageValue = "-1736476566"
	)
	void vmethod3688(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember();
		var2.username = new Username(this.field1768);
		var2.world = this.field1766;
		var2.rank = this.field1767;
		var1.addMember(var2);
	}
}
