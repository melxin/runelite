import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kn")
public class class267 {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	static final class267 field3032;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	static final class267 field3035;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	static final class267 field3033;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	public static final class267 field3036;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	static final class267 field3040;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	public static final class267 field3043;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	static final class267 field3037;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	static final class267 field3034;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	static final class267 field3038;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	static final class267 field3039;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	static final class267 field3041;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	public static final class267 field3042;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	static final class267 field3044;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	static final class267 field3031;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 147463163
	)
	public final int field3045;

	static {
		field3032 = new class267(0);
		field3035 = new class267(1);
		field3033 = new class267(2);
		field3036 = new class267(3);
		field3040 = new class267(4);
		field3043 = new class267(5);
		field3037 = new class267(6);
		field3034 = new class267(7);
		field3038 = new class267(8);
		field3039 = new class267(9);
		field3041 = new class267(10);
		field3042 = new class267(11);
		field3044 = new class267(12);
		field3031 = new class267(13);
	}

	class267(int var1) {
		this.field3045 = var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIIS)I",
		garbageValue = "484"
	)
	static final int method5631(int var0, int var1, int var2, int var3) {
		return var2 * var1 - var3 * var0 >> 16;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "144182080"
	)
	static void method5632() {
		ItemContainer.itemContainers = new NodeHashTable(32);
	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(IIIIISISIIB)V",
		garbageValue = "-117"
	)
	static void method5630(int var0, int var1, int var2, int var3, int var4, short var5, int var6, short var7, int var8, int var9) {
		NodeDeque var10 = DevicePcmPlayerProvider.worldView.groundItems[var0][var1][var2];
		if (var10 != null) {
			for (TileItem var11 = (TileItem)var10.last(); var11 != null; var11 = (TileItem)var10.previous()) {
				if ((var3 & 32767) == var11.id && var4 == var11.quantity) {
					PlayerCompositionColorTextureOverride var12 = var11.method2977();
					if (var12 == null) {
						var12 = new PlayerCompositionColorTextureOverride(var3);
					}

					if (var12.method4984() && var6 > -1 && var6 < var12.playerCompositionRecolorTo.length) {
						var12.playerCompositionRecolorTo[var6] = var5;
					}

					if (var12.method4990() && var8 > -1 && var8 < var12.playerCompositionRetextureTo.length) {
						var12.playerCompositionRetextureTo[var8] = var7;
					}

					if (var9 > -1) {
						var12.field2540 = var9;
						var12.field2533 = null;
					}

					var11.method2978(var12);
					break;
				}
			}

			WorldMapCacheName.updateItemPile(var0, var1, var2);
		}

	}
}
