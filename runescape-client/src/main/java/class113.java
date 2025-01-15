import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
public class class113 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	static final class113 field1419;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	static final class113 field1423;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	static final class113 field1417;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	static final class113 field1418;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	static final class113 field1429;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	static final class113 field1428;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	static final class113 field1421;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	static final class113 field1422;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	static final class113 field1431;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	static final class113 field1424;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	static final class113 field1425;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	static final class113 field1426;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	static final class113 field1420;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	@Export("field1390")
	static final class113 field1390;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	static final class113 field1427;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	static final class113 field1430;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -2070727753
	)
	int field1415;

	static {
		field1419 = new class113(0);
		field1423 = new class113(1);
		field1417 = new class113(2);
		field1418 = new class113(3);
		field1429 = new class113(4);
		field1428 = new class113(5);
		field1421 = new class113(6);
		field1422 = new class113(7);
		field1431 = new class113(8);
		field1424 = new class113(9);
		field1425 = new class113(10);
		field1426 = new class113(11);
		field1420 = new class113(12);
		field1390 = new class113(13);
		field1427 = new class113(14);
		field1430 = new class113(15);
	}

	class113(int var1) {
		this.field1415 = var1;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lkl;I)Z",
		garbageValue = "622915463"
	)
	static boolean method3177(ObjectComposition var0) {
		if (var0.transforms != null) {
			int[] var1 = var0.transforms;

			for (int var2 = 0; var2 < var1.length; ++var2) {
				int var3 = var1[var2];
				ObjectComposition var4 = class142.getObjectDefinition(var3);
				if (var4.mapIconId != -1) {
					return true;
				}
			}
		} else if (var0.mapIconId != -1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	static final void method3178() {
		if (class328.pcmPlayer1 != null) {
			class328.pcmPlayer1.run();
		}

	}
}
