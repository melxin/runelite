import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jj")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 945087929
	)
	@Export("x")
	int x;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 44300847
	)
	@Export("y")
	int y;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1101225631
	)
	@Export("z")
	int z;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 713480281
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	}

	@ObfuscatedSignature(
		descriptor = "(Ljj;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x;
		this.y = var1.y;
		this.z = var1.z;
		this.magnitude = var1.magnitude;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2013294913"
	)
	static void method5725() {
		class586.field5967[0] = 0;

		for (int var0 = 0; var0 < 2048; var0 += 128) {
			int var1 = (var0 >> 7) + 1;
			int var3 = 0;
			if (var0 > 0 && var0 < 1024) {
				var3 |= 272;
			}

			if (var0 > 512 && var0 < 1536) {
				var3 |= 1088;
			}

			if (var0 > 1024) {
				var3 |= 544;
			}

			if (var0 > 1536 || var0 < 512) {
				var3 |= 2176;
			}

			if (var0 == 0 || var0 == 1024) {
				var3 |= 48;
			}

			if (var0 == 512 || var0 == 1536) {
				var3 |= 1152;
			}

			class586.field5967[var1] = var3;
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1944780185"
	)
	@Export("clearItemContainer")
	static void clearItemContainer(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.ids.length; ++var2) {
				var1.ids[var2] = -1;
				var1.quantities[var2] = 0;
			}

		}
	}
}
