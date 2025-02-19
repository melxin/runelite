import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
public class class154 extends class149 {
	@ObfuscatedName("hf")
	static String field1752;
	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	static Task field1750;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1734846357
	)
	int field1751;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -987381149
	)
	int field1749;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1533822785
	)
	int field1754;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 300378323
	)
	int field1748;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class152 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfv;)V"
	)
	class154(class152 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvy;B)V",
		garbageValue = "25"
	)
	void vmethod3702(Buffer var1) {
		this.field1751 = var1.readInt();
		this.field1748 = var1.readInt();
		this.field1749 = var1.readUnsignedByte();
		this.field1754 = var1.readUnsignedByte();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgg;I)V",
		garbageValue = "2011970201"
	)
	void vmethod3705(ClanSettings var1) {
		var1.method3563(this.field1751, this.field1748, this.field1749, this.field1754);
	}
}
