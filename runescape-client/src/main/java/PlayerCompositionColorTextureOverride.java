import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
@Implements("PlayerCompositionColorTextureOverride")
public class PlayerCompositionColorTextureOverride {
	@ObfuscatedName("ad")
	@Export("playerCompositionRecolorTo")
	public short[] playerCompositionRecolorTo;
	@ObfuscatedName("an")
	@Export("playerCompositionRetextureTo")
	public short[] playerCompositionRetextureTo;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -82315899
	)
	public int field2482;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -625907211
	)
	public int field2472;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1797823235
	)
	public int field2480;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -547761083
	)
	public int field2481;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1223269621
	)
	public int field2474;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	public Model field2483;

	public PlayerCompositionColorTextureOverride(int var1) {
		this.field2482 = -1;
		this.field2472 = -1;
		this.field2480 = -1;
		this.field2481 = -1;
		ItemComposition var2 = FaceNormal.ItemDefinition_get(var1);
		if (var2.method5611()) {
			this.playerCompositionRecolorTo = new short[var2.recolorTo.length];
			System.arraycopy(var2.recolorTo, 0, this.playerCompositionRecolorTo, 0, this.playerCompositionRecolorTo.length);
		}

		if (var2.method5579()) {
			this.playerCompositionRetextureTo = new short[var2.retextureTo.length];
			System.arraycopy(var2.retextureTo, 0, this.playerCompositionRetextureTo, 0, this.playerCompositionRetextureTo.length);
		}

		this.field2474 = var2.model;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1997637316"
	)
	public boolean method5081() {
		return this.playerCompositionRecolorTo != null;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "119"
	)
	public boolean method5082() {
		return this.playerCompositionRetextureTo != null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-10"
	)
	boolean method5083(int var1) {
		return var1 == 0 && this.field2482 != -1 || var1 == 1 && this.field2472 != -1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1072478042"
	)
	boolean method5084(int var1) {
		return var1 == 0 && this.field2480 != -1 || var1 == 1 && this.field2481 != -1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "100"
	)
	int method5099(int var1) {
		return var1 == 0 ? this.field2482 : this.field2472;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-47"
	)
	int method5080(int var1) {
		return var1 == 0 ? this.field2480 : this.field2481;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-318781679"
	)
	public static boolean method5106(int var0) {
		return var0 == WorldMapDecorationType.field4088.id;
	}

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "12"
	)
	static final void method5107(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0;
		int var7 = var3 - var1;
		int var8 = var6 >= 0 ? var6 : -var6;
		int var9 = var7 >= 0 ? var7 : -var7;
		int var10 = var8;
		if (var8 < var9) {
			var10 = var9;
		}

		if (var10 != 0) {
			int var11 = (var6 << 16) / var10;
			int var12 = (var7 << 16) / var10;
			if (var12 <= var11) {
				var11 = -var11;
			} else {
				var12 = -var12;
			}

			int var13 = var5 * var12 >> 17;
			int var14 = var5 * var12 + 1 >> 17;
			int var15 = var5 * var11 >> 17;
			int var16 = var5 * var11 + 1 >> 17;
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart;
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart;
			int var17 = var0 + var13;
			int var18 = var0 - var14;
			int var19 = var0 + var6 - var14;
			int var20 = var0 + var13 + var6;
			int var21 = var15 + var1;
			int var22 = var1 - var16;
			int var23 = var7 + var1 - var16;
			int var24 = var7 + var15 + var1;
			Rasterizer3D.setClipping(var17, var18, var19);
			Rasterizer3D.rasterFlat(var21, var22, var23, var17, var18, var19, 0.0F, 0.0F, 0.0F, var4);
			Rasterizer3D.setClipping(var17, var19, var20);
			Rasterizer3D.rasterFlat(var21, var23, var24, var17, var19, var20, 0.0F, 0.0F, 0.0F, var4);
		}
	}
}
