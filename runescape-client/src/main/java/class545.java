import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uo")
public class class545 extends class547 {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1751071209
	)
	int field5553;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -76950071
	)
	int field5554;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -895619547
	)
	int field5555;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1724055963
	)
	int field5556;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 658666225
	)
	int field5557;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 890011019
	)
	int field5558;

	public class545(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		super(var7, var8);
		this.field5553 = 0;
		this.field5554 = 0;
		this.field5555 = 0;
		this.field5556 = 0;
		this.field5557 = 0;
		this.field5558 = 0;
		this.field5553 = var1;
		this.field5554 = var2;
		this.field5555 = var3;
		this.field5556 = var4;
		this.field5557 = var5;
		this.field5558 = var6;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	public int vmethod10662() {
		double var1 = this.method10664();
		return (int)Math.round((double)this.field5553 + var1 * (double)(this.field5556 - this.field5553));
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "31"
	)
	public int vmethod10660() {
		double var1 = this.method10664();
		return (int)Math.round(var1 * (double)(this.field5557 - this.field5554) + (double)this.field5554);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-170491900"
	)
	public int vmethod10654() {
		double var1 = this.method10664();
		return (int)Math.round(var1 * (double)(this.field5558 - this.field5555) + (double)this.field5555);
	}

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(Lda;B)V",
		garbageValue = "6"
	)
	static void method10646(NPC var0) {
		var0.size = var0.definition.size;
		var0.field1041 = var0.definition.rotation;
		var0.walkSequence = var0.definition.walkSequence;
		var0.walkBackSequence = var0.definition.walkBackSequence;
		var0.walkLeftSequence = var0.definition.walkLeftSequence;
		var0.walkRightSequence = var0.definition.walkRightSequence;
		var0.idleSequence = var0.definition.idleSequence;
		var0.turnLeftSequence = var0.definition.turnLeftSequence;
		var0.turnRightSequence = var0.definition.turnRightSequence;
		var0.runSequence = var0.definition.field2086;
		var0.field1077 = var0.definition.field2101;
		var0.field1050 = var0.definition.field2073;
		var0.field1051 = var0.definition.field2089;
		var0.field1052 = var0.definition.field2090;
		var0.field1020 = var0.definition.field2091;
		var0.field1061 = var0.definition.field2092;
		var0.field1055 = var0.definition.field2093;
	}
}
