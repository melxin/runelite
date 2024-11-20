import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
public class class151 extends class150 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -653171623
	)
	int field1682;
	@ObfuscatedName("aw")
	boolean field1683;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfd;)V"
	)
	class151(class153 var1) {
		this.this$0 = var1;
		this.field1682 = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvj;B)V",
		garbageValue = "-83"
	)
	void vmethod3694(Buffer var1) {
		this.field1682 = var1.readUnsignedShort();
		this.field1683 = var1.readUnsignedByte() == 1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgv;I)V",
		garbageValue = "2002935935"
	)
	void vmethod3695(ClanSettings var1) {
		var1.method3547(this.field1682, this.field1683);
	}
}
