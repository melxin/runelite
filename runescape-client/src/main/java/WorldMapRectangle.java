import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lx")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	static Archive field3283;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -2126470515
	)
	@Export("width")
	int width;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1866073183
	)
	@Export("height")
	int height;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -461915513
	)
	@Export("x")
	int x;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1761956193
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	final WorldMapRenderer this$0;

	@ObfuscatedSignature(
		descriptor = "(Llk;)V"
	)
	WorldMapRectangle(WorldMapRenderer var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-119"
	)
	static final boolean method6612(int var0) {
		return var0 == 14 || var0 == 15 || var0 >= 44 && var0 <= 51;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ltp;Ltp;II)V",
		garbageValue = "1694522883"
	)
	public static void method6613(class509 var0, class509 var1, int var2) {
		class573.method10775(var0);
		class563 var3 = var0.field5288;
		DelayFadeTask.method9245(var1, var3, false);
		if (var2 >= 0 && var2 <= var0.field5287 * 935110769) {
			if (var1.field5287 * 935110769 != 0) {
				var0.method9941(var1.field5287 * 935110769 + var0.field5287 * 935110769);
				if (var2 < var0.field5287 * 935110769) {
					ClanChannel.method3879(var0, var2, var0, var2 + var1.field5287 * 935110769, var0.field5287 * 935110769 - var2);
				}

				ClanChannel.method3879(var1, 0, var0, var2, var1.field5287 * 935110769);
				var0.field5287 += var1.field5287;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1589849533"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1, int var2) {
		NpcOverrides.updateItemPile2(class330.worldView, var0, var1, var2);
	}

	@ObfuscatedName("mx")
	@ObfuscatedSignature(
		descriptor = "(ILtr;Ldl;I)I",
		garbageValue = "-243816846"
	)
	static int method6614(int var0, WorldEntity var1, WorldView var2) {
		int var3 = -1;
		if (var0 == Client.field337) {
			var3 = var2.plane;
		} else if (Client.field337 == -1) {
			var3 = var1.field5213.method4291();
		} else {
			WorldEntity var4 = Client.worldViewManager.method2217();
			WorldView var5 = var4.worldView;
			if (var5.plane == var4.field5213.method4291()) {
				if (var0 == -1) {
					var3 = var4.getX();
				} else {
					var3 = var1.field5213.method4291();
				}
			}
		}

		return var3;
	}
}
