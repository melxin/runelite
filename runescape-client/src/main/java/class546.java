import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vb")
public class class546 extends class548 {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("VarpDefinition_archive")
	public static AbstractArchive VarpDefinition_archive;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 165563203
	)
	int field5560;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 19077985
	)
	int field5561;

	public class546(int var1, int var2, int var3, int var4) {
		super(var3, var4);
		this.field5560 = 0;
		this.field5561 = 0;
		this.field5560 = var1;
		this.field5561 = var2;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "842089418"
	)
	public int method10650() {
		double var1 = this.method10664();
		return (int)Math.round(var1 * (double)(this.field5561 - this.field5560) + (double)this.field5560);
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(Lvf;I)Ljava/lang/Object;",
		garbageValue = "-99487114"
	)
	static Object method10651(class570 var0) {
		if (var0 == null) {
			throw new IllegalStateException("popValueOfType() failure - null baseVarType");
		} else {
			switch(var0.field5720) {
			case 0:
				return Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
			case 3:
				return Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type");
			}
		}
	}
}
