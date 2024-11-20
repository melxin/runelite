import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
public class class156 extends class166 {
	@ObfuscatedName("ir")
	@ObfuscatedGetter(
		longValue = -4939559019755432497L
	)
	static long field1716;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1229503591
	)
	int field1715;
	@ObfuscatedName("aw")
	byte field1713;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1403669193
	)
	int field1712;
	@ObfuscatedName("ae")
	String field1714;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgl;"
	)
	final class167 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgl;)V"
	)
	class156(class167 var1) {
		this.this$0 = var1;
		this.field1715 = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvj;B)V",
		garbageValue = "13"
	)
	void vmethod3691(Buffer var1) {
		this.field1715 = var1.readUnsignedShort();
		this.field1713 = var1.readByte();
		this.field1712 = var1.readUnsignedShort();
		var1.readLong();
		this.field1714 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgc;I)V",
		garbageValue = "-1736476566"
	)
	void vmethod3688(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1715);
		var2.rank = this.field1713;
		var2.world = this.field1712;
		var2.username = new Username(this.field1714);
	}
}
