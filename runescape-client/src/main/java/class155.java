import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
public class class155 extends class150 {
	@ObfuscatedName("qj")
	@ObfuscatedSignature(
		descriptor = "Ltd;"
	)
	static class496 field1711;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -38860949
	)
	int field1708;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 665389735
	)
	int field1707;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -418972997
	)
	int field1706;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 695939607
	)
	int field1709;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfd;)V"
	)
	class155(class153 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvj;B)V",
		garbageValue = "-83"
	)
	void vmethod3694(Buffer var1) {
		this.field1708 = var1.readInt();
		this.field1709 = var1.readInt();
		this.field1707 = var1.readUnsignedByte();
		this.field1706 = var1.readUnsignedByte();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgv;I)V",
		garbageValue = "2002935935"
	)
	void vmethod3695(ClanSettings var1) {
		var1.method3560(this.field1708, this.field1709, this.field1707, this.field1706);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-973356497"
	)
	static final int method3495() {
		return ViewportMouse.ViewportMouse_x;
	}
}
