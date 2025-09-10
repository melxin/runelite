import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nb")
public class class343 {
	@ObfuscatedName("so")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	@Export("mousedOverWidgetIf1")
	static Widget mousedOverWidgetIf1;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -334449371
	)
	int field3949;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	class108 field3948;

	@ObfuscatedSignature(
		descriptor = "(ILec;)V"
	)
	class343(int var1, class108 var2) {
		this.field3949 = var1;
		this.field3948 = var2;
	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(Ldr;Lct;II)V",
		garbageValue = "2105103989"
	)
	static void method7327(WorldView var0, Actor var1, int var2) {
		Coord var3 = var1.method2435(var0);
		int var5 = var1.x;
		int var6 = var1.size * -1542062016 - 1;
		int var4 = var5 + (var6 << 6);
		int var8 = Coord.method7418(var1.y, var1.size * -1542062016 - 1);
		class41.worldToScreen(var0, var3.x, var3.y, var4, var8, var2, var1.vmethod2763());
	}
}
