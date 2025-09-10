import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("xp")
public class class609 {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -853322987
	)
	int field6048;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1820231657
	)
	int field6037;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 391317103
	)
	int field6040;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1431390251
	)
	int field6038;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 2026602715
	)
	int field6042;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -979484899
	)
	int field6043;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -761202801
	)
	int field6044;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1219684877
	)
	int field6045;
	@ObfuscatedName("au")
	boolean field6046;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1404931067
	)
	int field6041;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -2011876041
	)
	int field6039;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1801049627
	)
	int field6047;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -50531073
	)
	int field6050;

	public class609() {
		this.field6044 = 0;
		this.field6045 = 0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZI)V",
		garbageValue = "660784403"
	)
	public void method11846(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		this.field6048 = var1;
		this.field6037 = var2;
		this.field6040 = var3;
		this.field6038 = var4;
		this.field6042 = var5;
		this.field6043 = var6;
		this.field6044 = var7;
		this.field6045 = var8;
		this.field6046 = var9;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "82"
	)
	public void method11850(int var1, int var2, int var3, int var4) {
		this.field6041 = var1;
		this.field6039 = var2;
		this.field6047 = var3;
		this.field6050 = var4;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lrb;Lrv;I)V",
		garbageValue = "-1328379932"
	)
	public void method11848(class462 var1, Font var2) {
		if (var2 != null) {
			int var3 = var2.ascent;
			int var4 = Math.min(this.field6038, (int)((float)var3 * 0.9F));
			int var5 = var1.method9299(this.field6040);
			int var6 = var1.method9298(this.field6038);
			int var7 = var5 + (this.field6048 - this.field6042);
			int var8 = var6 + var3 + (this.field6037 - this.field6043);
			Rasterizer2D.Rasterizer2D_setClip(this.field6048, this.field6037, this.field6048 + this.field6040, this.field6037 + this.field6038);
			int var9 = this.field6045;
			int var10 = this.field6044;
			if (var9 > var10) {
				int var11 = var9;
				var9 = var10;
				var10 = var11;
			}

			class466 var21 = var1.method9277(0, var9);
			class466 var12 = var1.method9277(var9, var10);
			class466 var13 = var1.method9277(var10, var1.method9375());
			class466 var14 = var1.method9277(0, this.field6044);
			int var16;
			int var18;
			if (!var12.method9533()) {
				int var15 = var2.maxDescent + var2.maxAscent;

				for (var16 = 0; var16 < var12.method9532(); ++var16) {
					class464 var23 = var12.method9525(var16);
					var18 = var7 + var23.field5241;
					int var19 = var2.charWidth(var23.field5242);
					int var20 = var8 + var23.field5244 - var3;
					Rasterizer2D.Rasterizer2D_fillRectangle(var18, var20, var19, var15, this.field6050);
				}
			}

			if (!var21.method9533()) {
				var2.method9426(var21, var7, var8, this.field6041, this.field6039, -1);
			}

			if (!var12.method9533()) {
				var2.method9426(var12, var7, var8, this.field6047, this.field6039, -1);
			}

			if (!var13.method9533()) {
				var2.method9426(var13, var7, var8, this.field6041, this.field6039, -1);
			}

			if (this.field6046) {
				class557 var22 = var14.method9524();
				var16 = var7 + (Integer)var22.field5757;
				int var17 = var8 + (Integer)var22.field5756;
				var18 = var17 - var4;
				Rasterizer2D.Rasterizer2D_drawLine(var16, var17, var16, var18, this.field6041);
				if (this.field6039 != -1) {
					Rasterizer2D.Rasterizer2D_drawLine(var16 + 1, var17 + 1, var16 + 1, var18 + 1, this.field6039);
				}
			}

		}
	}
}
