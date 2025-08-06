import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ab")
public class class1 implements Callable {
	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	public static class419 field2;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lwj;"
	)
	final Buffer field1;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lav;"
	)
	final class3 field0;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	final class7 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lap;Lwj;Lav;)V"
	)
	class1(class7 var1, Buffer var2, class3 var3) {
		this.this$0 = var1;
		this.field1 = var2;
		this.field0 = var3;
	}

	public Object call() {
		return this.field0.vmethod11(this.field1);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "-1318464309"
	)
	public static float method9(int var0) {
		var0 &= 16383;
		return (float)(3.834951969714103E-4D * (double)((float)var0));
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwj;BIB)I",
		garbageValue = "4"
	)
	static int method8(Buffer var0, byte var1, int var2) {
		int var3 = var1 >> var2 & 3;
		if (var3 == 3) {
			return var0.readInt();
		} else if (var3 == 2) {
			return var0.readShort();
		} else {
			return var3 == 1 ? var0.readByte() : 0;
		}
	}
}
