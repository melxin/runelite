import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qp")
public class class425 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("clock")
	static Clock clock;

	@ObfuscatedName("nj")
	@ObfuscatedSignature(
		descriptor = "(Lnp;B)V",
		garbageValue = "1"
	)
	static final void method8096(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 324) {
			if (Client.field624 == -1) {
				Client.field624 = var0.spriteId2;
				Client.field794 = var0.spriteId;
			}

			if (Client.playerAppearance.gender == 1) {
				var0.spriteId2 = Client.field624;
			} else {
				var0.spriteId2 = Client.field794;
			}

		} else if (var1 == 325) {
			if (Client.field624 == -1) {
				Client.field624 = var0.spriteId2;
				Client.field794 = var0.spriteId;
			}

			if (Client.playerAppearance.gender == 1) {
				var0.spriteId2 = Client.field794;
			} else {
				var0.spriteId2 = Client.field624;
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
