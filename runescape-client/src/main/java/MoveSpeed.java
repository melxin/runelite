import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ko")
@Implements("MoveSpeed")
public enum MoveSpeed implements Enum {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	field3279((byte)-1),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	field3280((byte)0),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	field3281((byte)1),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	field3282((byte)2);

	@ObfuscatedName("ap")
	@Export("id")
	final byte id;

	MoveSpeed(byte var3) {
		this.id = var3;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1935172756"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lti;IIIIB)V",
		garbageValue = "3"
	)
	public static void method6323(DynamicArray var0, int var1, int var2, int var3, int var4) {
		class574 var5 = class574.field5820;
		ItemLayer.method4826(var0, var5, true);
		if (var3 < 0) {
			var3 = 0;
		}

		int var6 = var3 + var4;
		if (var4 < 0 || var6 < 0 || var6 > var0.method10322()) {
			var6 = var0.method10322();
		}

		int[] var7 = var0.method10318();
		int var8 = var1;

		for (int var9 = var3; var9 < var6; ++var9) {
			var7[var9] = var8;
			var8 += var2;
		}

	}
}
