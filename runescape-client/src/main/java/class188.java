import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hk")
public class class188 extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("field2007")
	static EvictingDualNodeHashTable field2007;

	static {
		field2007 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-904257168"
	)
	public static int method4106(int var0) {
		return var0 >> 1 & 3;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "-22"
	)
	static void method4104(int var0, int var1, int var2, int var3, int var4, int var5) {
		class150.field1719 = (var3 + var0) / 2;
		IntHashTable.field5140 = (var4 + var1) / 2;
		class168.field1846 = (var5 + var2) / 2;
		JagexCache.field2431 = (var3 - var0) / 2;
		Message.field257 = (var4 - var1) / 2;
		EnumComposition.field1991 = (var5 - var2) / 2;
		class159.field1777 = Math.abs(JagexCache.field2431);
		class218.field2407 = Math.abs(Message.field257);
		Interpreter.field680 = Math.abs(EnumComposition.field1991);
		ViewportMouse.field2951.method8688((float)(var3 - var0), (float)(var4 - var1), (float)(var5 - var2));
		ViewportMouse.field2951.method8697();
		ViewportMouse.ViewportMouse_false0 = true;
	}
}
