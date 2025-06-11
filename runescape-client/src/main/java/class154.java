import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
public class class154 extends class149 {
	@ObfuscatedName("lp")
	static String field1749;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -337065149
	)
	int field1750;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1771614471
	)
	int field1754;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1292494811
	)
	int field1753;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -199953475
	)
	int field1752;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	final class152 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfp;)V"
	)
	class154(class152 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "-1635342078"
	)
	void vmethod3913(Buffer var1) {
		this.field1750 = var1.readInt();
		this.field1752 = var1.readInt();
		this.field1754 = var1.readUnsignedByte();
		this.field1753 = var1.readUnsignedByte();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lgu;I)V",
		garbageValue = "-1572789515"
	)
	void vmethod3914(ClanSettings var1) {
		var1.method3805(this.field1750, this.field1752, this.field1754, this.field1753);
	}
}
