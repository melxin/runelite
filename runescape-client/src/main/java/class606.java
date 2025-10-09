import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("xd")
public class class606 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1577542211
	)
	int field6111;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1092358971
	)
	int field6113;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1172479113
	)
	int field6104;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1843254149
	)
	int field6107;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -64066299
	)
	int field6108;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1725595131
	)
	int field6106;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1425373249
	)
	int field6110;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1821489877
	)
	int field6105;
	@ObfuscatedName("aa")
	boolean field6112;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1993101881
	)
	int field6103;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 772601053
	)
	int field6114;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 2096497517
	)
	int field6115;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 2106814691
	)
	int field6116;

	public class606() {
		this.field6110 = 0;
		this.field6105 = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZI)V",
		garbageValue = "-1611996605"
	)
	public void method12012(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		this.field6111 = var1;
		this.field6113 = var2;
		this.field6104 = var3;
		this.field6107 = var4;
		this.field6108 = var5;
		this.field6106 = var6;
		this.field6110 = var7;
		this.field6105 = var8;
		this.field6112 = var9;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1898389374"
	)
	public void method12013(int var1, int var2, int var3, int var4) {
		this.field6103 = var1;
		this.field6114 = var2;
		this.field6115 = var3;
		this.field6116 = var4;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lrs;Lri;S)V",
		garbageValue = "243"
	)
	public void method12018(class460 var1, Font var2) {
		if (var2 != null) {
			int var3 = var2.ascent;
			int var4 = Math.min(this.field6107, (int)(0.9F * (float)var3));
			int var5 = var1.method9364(this.field6104);
			int var6 = var1.method9365(this.field6107);
			int var7 = var5 + (this.field6111 - this.field6108);
			int var8 = var6 + var3 + (this.field6113 - this.field6106);
			Rasterizer2D.Rasterizer2D_setClip(this.field6111, this.field6113, this.field6111 + this.field6104, this.field6113 + this.field6107);
			int var9 = this.field6105;
			int var10 = this.field6110;
			if (var9 > var10) {
				int var11 = var9;
				var9 = var10;
				var10 = var11;
			}

			class464 var21 = var1.method9342(0, var9);
			class464 var12 = var1.method9342(var9, var10);
			class464 var13 = var1.method9342(var10, var1.method9437());
			class464 var14 = var1.method9342(0, this.field6110);
			int var16;
			int var18;
			if (!var12.method9591()) {
				int var15 = var2.maxAscent + var2.maxDescent;

				for (var16 = 0; var16 < var12.method9586(); ++var16) {
					class462 var23 = var12.method9590(var16);
					var18 = var7 + var23.field5292;
					int var19 = var2.charWidth(var23.field5293);
					int var20 = var8 + var23.field5294 - var3;
					Rasterizer2D.Rasterizer2D_fillRectangle(var18, var20, var19, var15, this.field6116);
				}
			}

			if (!var21.method9591()) {
				var2.method9517(var21, var7, var8, this.field6103, this.field6114, -1);
			}

			if (!var12.method9591()) {
				var2.method9517(var12, var7, var8, this.field6115, this.field6114, -1);
			}

			if (!var13.method9591()) {
				var2.method9517(var13, var7, var8, this.field6103, this.field6114, -1);
			}

			if (this.field6112) {
				class555 var22 = var14.method9589();
				var16 = var7 + (Integer)var22.field5821;
				int var17 = var8 + (Integer)var22.field5819;
				var18 = var17 - var4;
				Rasterizer2D.Rasterizer2D_drawLine(var16, var17, var16, var18, this.field6103);
				if (this.field6114 != -1) {
					Rasterizer2D.Rasterizer2D_drawLine(var16 + 1, var17 + 1, var16 + 1, var18 + 1, this.field6114);
				}
			}

		}
	}
}
