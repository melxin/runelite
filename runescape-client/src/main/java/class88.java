import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
public class class88 {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class88 field1235;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class88 field1232;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class88 field1233;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class88 field1246;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class88 field1247;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class88 field1236;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class88 field1237;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class88 field1238;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class88 field1243;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class88 field1240;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class88 field1241;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class88 field1242;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class88 field1239;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	@Export("field1390")
	static final class88 field1390;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class88 field1245;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class88 field1234;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 142977173
	)
	int field1231;

	static {
		field1235 = new class88(0);
		field1232 = new class88(1);
		field1233 = new class88(2);
		field1246 = new class88(3);
		field1247 = new class88(4);
		field1236 = new class88(5);
		field1237 = new class88(6);
		field1238 = new class88(7);
		field1243 = new class88(8);
		field1240 = new class88(9);
		field1241 = new class88(10);
		field1242 = new class88(11);
		field1239 = new class88(12);
		field1390 = new class88(13);
		field1245 = new class88(14);
		field1234 = new class88(15);
	}

	class88(int var1) {
		this.field1231 = var1;
	}

	@ObfuscatedName("oz")
	@ObfuscatedSignature(
		descriptor = "(Lof;I)V",
		garbageValue = "-1166894490"
	)
	static final void method2983(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 324) {
			if (Client.field548 == -1) {
				Client.field548 = var0.spriteId2;
				Client.field385 = var0.spriteId;
			}

			if (Client.playerAppearance.gender == 1) {
				var0.spriteId2 = Client.field548;
			} else {
				var0.spriteId2 = Client.field385;
			}

		} else if (var1 == 325) {
			if (Client.field548 == -1) {
				Client.field548 = var0.spriteId2;
				Client.field385 = var0.spriteId;
			}

			if (Client.playerAppearance.gender == 1) {
				var0.spriteId2 = Client.field385;
			} else {
				var0.spriteId2 = Client.field548;
			}

		} else if (var1 == 327) {
			var0.modelAngleX = 150;
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
			var0.modelType = 5;
			var0.modelId = 0;
		} else if (var1 == 328) {
			var0.modelAngleX = 150;
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
			var0.modelType = 5;
			var0.modelId = 1;
		}
	}
}
