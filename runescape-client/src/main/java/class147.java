import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
public class class147 extends class150 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 670118587
	)
	int field1668;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -2142548403
	)
	int field1664;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1465134227
	)
	int field1666;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1776962749
	)
	int field1667;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfd;)V"
	)
	class147(class153 var1) {
		this.this$0 = var1;
		this.field1668 = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvj;B)V",
		garbageValue = "-83"
	)
	void vmethod3694(Buffer var1) {
		this.field1668 = var1.readUnsignedShort();
		this.field1664 = var1.readInt();
		this.field1666 = var1.readUnsignedByte();
		this.field1667 = var1.readUnsignedByte();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgv;I)V",
		garbageValue = "2002935935"
	)
	void vmethod3695(ClanSettings var1) {
		var1.method3598(this.field1668, this.field1664, this.field1666, this.field1667);
	}
}
