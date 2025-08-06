import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fq")
public class class150 extends class149 {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1004476319
	)
	int field1756;
	@ObfuscatedName("ab")
	boolean field1751;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	final class152 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfg;)V"
	)
	class150(class152 var1) {
		this.this$0 = var1;
		this.field1756 = -1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "1324754926"
	)
	void vmethod4086(Buffer var1) {
		this.field1756 = var1.readUnsignedShort();
		this.field1751 = var1.readUnsignedByte() == 1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lgk;I)V",
		garbageValue = "1924878263"
	)
	void vmethod4088(ClanSettings var1) {
		var1.method3904(this.field1756, this.field1751);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-264401289"
	)
	public static void method3801() {
		class179.field1915.clear();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ltn;Lvf;ZS)V",
		garbageValue = "19307"
	)
	static void method3792(class515 var0, class570 var1, boolean var2) {
		if (var0 == null) {
			throw new RuntimeException();
		} else if (var1 != null && var0.field5399 != var1) {
			throw new RuntimeException();
		} else if (var2 && !var0.field5400) {
			throw new RuntimeException();
		}
	}
}
