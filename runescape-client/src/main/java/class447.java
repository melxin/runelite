import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rg")
public class class447 extends RuntimeException {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("VarpDefinition_archive")
	public static AbstractArchive VarpDefinition_archive;
	@ObfuscatedName("as")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("bm")
	static String field4932;
	@ObfuscatedName("om")
	@ObfuscatedGetter(
		intValue = 128703985
	)
	static int field4935;

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([BZI)Ljava/lang/Object;",
		garbageValue = "127840739"
	)
	public static Object method8504(byte[] var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0.length > 136) {
			DirectByteArrayCopier var2 = new DirectByteArrayCopier();
			var2.set(var0);
			return var2;
		} else {
			return var0;
		}
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(IIIIISISIII)V",
		garbageValue = "-83080715"
	)
	static void method8503(int var0, int var1, int var2, int var3, int var4, short var5, int var6, short var7, int var8, int var9) {
		NodeDeque var10 = class376.worldView.groundItems[var0][var1][var2];
		if (var10 != null) {
			for (TileItem var11 = (TileItem)var10.last(); var11 != null; var11 = (TileItem)var10.previous()) {
				if ((var3 & 32767) == var11.id && var4 == var11.quantity) {
					PlayerCompositionColorTextureOverride var12 = var11.method2958();
					if (var12 == null) {
						var12 = new PlayerCompositionColorTextureOverride(var3);
					}

					if (var12.method3709() && var6 > -1 && var6 < var12.playerCompositionRecolorTo.length) {
						var12.playerCompositionRecolorTo[var6] = var5;
					}

					if (var12.method3715() && var8 > -1 && var8 < var12.playerCompositionRetextureTo.length) {
						var12.playerCompositionRetextureTo[var8] = var7;
					}

					if (var9 > -1) {
						var12.field1894 = var9;
						var12.field1895 = null;
					}

					var11.method2957(var12);
					break;
				}
			}

			Language.updateItemPile(var0, var1, var2);
		}

	}
}
