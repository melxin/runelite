import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
public class class155 extends class165 {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lwg;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("pj")
	@ObfuscatedGetter(
		intValue = -637801523
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 2095831663
	)
	int field1759;
	@ObfuscatedName("ay")
	byte field1758;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1327625655
	)
	int field1757;
	@ObfuscatedName("ad")
	String field1756;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgl;"
	)
	final class166 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgl;)V"
	)
	class155(class166 var1) {
		this.this$0 = var1;
		this.field1759 = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "1818142003"
	)
	void vmethod3695(Buffer var1) {
		this.field1759 = var1.readUnsignedShort();
		this.field1758 = var1.readByte();
		this.field1757 = var1.readUnsignedShort();
		var1.readLong();
		this.field1756 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgd;I)V",
		garbageValue = "488725669"
	)
	void vmethod3696(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1759);
		var2.rank = this.field1758;
		var2.world = this.field1757;
		var2.username = new Username(this.field1756);
	}
}
