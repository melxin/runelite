import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
public class class152 extends class148 {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1109048411
	)
	int field1733;
	@ObfuscatedName("an")
	byte field1734;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	final class151 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfd;)V"
	)
	class152(class151 var1) {
		this.this$0 = var1;
		this.field1733 = -1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lve;B)V",
		garbageValue = "53"
	)
	void vmethod3749(Buffer var1) {
		this.field1733 = var1.readUnsignedShort();
		this.field1734 = var1.readByte();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lgw;I)V",
		garbageValue = "1984465176"
	)
	void vmethod3750(ClanSettings var1) {
		var1.method3617(this.field1733, this.field1734);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "-16"
	)
	static final int method3502(int var0, int var1, int var2, int var3) {
		return var0 * var2 - var3 * var1 >> 16;
	}
}
