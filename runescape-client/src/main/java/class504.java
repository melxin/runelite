import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tr")
public class class504 extends class503 {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1119543187
	)
	static final int field5336;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	final WorldEntityCoord field5333;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	final WorldEntityCoord field5334;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -920631977
	)
	int field5332;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1141711793
	)
	int field5337;

	static {
		field5336 = Client.revision + 3;
	}

	class504() {
		this.field5333 = new WorldEntityCoord();
		this.field5334 = new WorldEntityCoord();
		this.field5332 = 0;
		this.field5337 = 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lkm;Ltj;II)V",
		garbageValue = "1180625178"
	)
	void vmethod10176(WorldEntityCoord var1, class502 var2, int var3) {
		this.field5333.method6255(var1);
		this.field5334.method6255(var2.field5331);
		this.field5332 = var3 - 1;
		this.field5337 = var2.field5328 + field5336;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lkm;IIB)Z",
		garbageValue = "116"
	)
	boolean vmethod10174(WorldEntityCoord var1, int var2, int var3) {
		if (this.field5332 >= this.field5337) {
			var1.method6255(this.field5334);
			return true;
		} else {
			int var5 = this.field5332;
			int var6 = this.field5337;
			float var4 = (float)(var2 - var5) / (float)(var6 - var5);
			class263.method5968(this.field5333, this.field5334, var4, var1);
			return var4 >= 1.0F;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-466918095"
	)
	void vmethod10175(int var1, int var2) {
		this.field5333.setDirection(var1, var2);
		this.field5334.setDirection(var1, var2);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1448804696"
	)
	public static void method10190(int var0) {
		Varps.Varps_temp = new int[var0];
		Varps.Varps_main = new int[var0];
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ltn;ILjava/lang/Object;B)V",
		garbageValue = "6"
	)
	public static void method10191(DynamicArray var0, int var1, Object var2) {
		class150.method3792(var0, (class570)null, true);
		if (var1 >= 0 && var1 <= var0.size * -519676011) {
			var0.method10398(var0.size * -519676011 + 1);
			if (var1 < var0.size * -519676011) {
				class401.method8272(var0, var1, var0, var1 + 1, var0.size * -519676011 - var1);
			}

			var0.method10361(var1, var2);
			var0.size += 1527641021;
		} else {
			throw new RuntimeException();
		}
	}
}
