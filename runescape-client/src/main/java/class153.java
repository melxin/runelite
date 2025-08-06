import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
public class class153 extends class149 {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 456235581
	)
	int field1775;
	@ObfuscatedName("ab")
	byte field1774;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	final class152 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfg;)V"
	)
	class153(class152 var1) {
		this.this$0 = var1;
		this.field1775 = -1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "1324754926"
	)
	void vmethod4086(Buffer var1) {
		this.field1775 = var1.readUnsignedShort();
		this.field1774 = var1.readByte();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lgk;I)V",
		garbageValue = "1924878263"
	)
	void vmethod4088(ClanSettings var1) {
		var1.method3902(this.field1775, this.field1774);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2084845139"
	)
	static final boolean method3821(int var0) {
		return var0 == 16 || var0 == 17 || var0 >= 18 && var0 <= 22;
	}
}
