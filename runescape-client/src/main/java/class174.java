import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
public class class174 extends class150 {
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = 576972339
	)
	static int field1826;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -454105821
	)
	int field1827;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = 207816209040186409L
	)
	long field1825;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfd;)V"
	)
	class174(class153 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvj;B)V",
		garbageValue = "-83"
	)
	void vmethod3694(Buffer var1) {
		this.field1827 = var1.readInt();
		this.field1825 = var1.readLong();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgv;I)V",
		garbageValue = "2002935935"
	)
	void vmethod3695(ClanSettings var1) {
		var1.method3573(this.field1827, this.field1825);
	}
}
