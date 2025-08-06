import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
public class class173 extends class149 {
	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	static Archive field1915;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 58547053
	)
	int field1913;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = -49561878339763589L
	)
	long field1912;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	final class152 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfg;)V"
	)
	class173(class152 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "1324754926"
	)
	void vmethod4086(Buffer var1) {
		this.field1913 = var1.readInt();
		this.field1912 = var1.readLong();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lgk;I)V",
		garbageValue = "1924878263"
	)
	void vmethod4088(ClanSettings var1) {
		var1.method3941(this.field1913, this.field1912);
	}
}
