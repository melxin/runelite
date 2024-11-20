import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
public class class149 extends class150 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -181557671
	)
	int field1674;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfd;)V"
	)
	class149(class153 var1) {
		this.this$0 = var1;
		this.field1674 = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvj;B)V",
		garbageValue = "-83"
	)
	void vmethod3694(Buffer var1) {
		this.field1674 = var1.readUnsignedShort();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgv;I)V",
		garbageValue = "2002935935"
	)
	void vmethod3695(ClanSettings var1) {
		var1.method3541(this.field1674);
	}
}
