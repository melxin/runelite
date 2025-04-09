import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
@Implements("Sound")
public class Sound extends class148 {
	@ObfuscatedName("ao")
	boolean field1751;
	@ObfuscatedName("an")
	byte field1750;
	@ObfuscatedName("ae")
	byte field1754;
	@ObfuscatedName("af")
	byte field1752;
	@ObfuscatedName("as")
	byte field1753;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	final class151 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfd;)V"
	)
	Sound(class151 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lve;B)V",
		garbageValue = "53"
	)
	void vmethod3749(Buffer var1) {
		this.field1751 = var1.readUnsignedByte() == 1;
		this.field1750 = var1.readByte();
		this.field1754 = var1.readByte();
		this.field1752 = var1.readByte();
		this.field1753 = var1.readByte();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lgw;I)V",
		garbageValue = "1984465176"
	)
	void vmethod3750(ClanSettings var1) {
		var1.allowGuests = this.field1751;
		var1.field1803 = this.field1750;
		var1.field1784 = this.field1754;
		var1.field1773 = this.field1752;
		var1.field1786 = this.field1753;
	}
}
