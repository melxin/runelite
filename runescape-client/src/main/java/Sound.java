import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
@Implements("Sound")
public class Sound extends class149 {
	@ObfuscatedName("ct")
	static String field1770;
	@ObfuscatedName("gt")
	@Export("characterId")
	static String characterId;
	@ObfuscatedName("ab")
	boolean field1763;
	@ObfuscatedName("ay")
	byte field1766;
	@ObfuscatedName("au")
	byte field1767;
	@ObfuscatedName("ad")
	byte field1764;
	@ObfuscatedName("ah")
	byte field1765;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class152 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfv;)V"
	)
	Sound(class152 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvy;B)V",
		garbageValue = "25"
	)
	void vmethod3702(Buffer var1) {
		this.field1763 = var1.readUnsignedByte() == 1;
		this.field1766 = var1.readByte();
		this.field1767 = var1.readByte();
		this.field1764 = var1.readByte();
		this.field1765 = var1.readByte();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgg;I)V",
		garbageValue = "2011970201"
	)
	void vmethod3705(ClanSettings var1) {
		var1.allowGuests = this.field1763;
		var1.field1795 = this.field1766;
		var1.field1805 = this.field1767;
		var1.field1797 = this.field1764;
		var1.field1796 = this.field1765;
	}
}
