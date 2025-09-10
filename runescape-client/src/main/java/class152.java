import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
public class class152 extends class151 {
	@ObfuscatedName("tc")
	@ObfuscatedSignature(
		descriptor = "[Loi;"
	)
	static Widget[] field1777;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 2042967231
	)
	int field1774;
	@ObfuscatedName("aw")
	boolean field1776;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class154 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfz;)V"
	)
	class152(class154 var1) {
		this.this$0 = var1;
		this.field1774 = -1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)V",
		garbageValue = "-2943315"
	)
	void vmethod4111(Buffer var1) {
		this.field1774 = var1.readUnsignedShort();
		this.field1776 = var1.readUnsignedByte() == 1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgs;I)V",
		garbageValue = "2108880901"
	)
	void vmethod4112(ClanSettings var1) {
		var1.method3928(this.field1774, this.field1776);
	}
}
