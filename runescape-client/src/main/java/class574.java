import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("we")
public class class574 {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -933590689
	)
	int field5593;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 121947731
	)
	int field5597;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1222692495
	)
	int field5592;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1396624005
	)
	int field5595;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1252504137
	)
	int field5594;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 416241351
	)
	int field5598;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1942659703
	)
	int field5596;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 272589497
	)
	int field5600;
	@ObfuscatedName("an")
	boolean field5589;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1829854513
	)
	int field5591;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -997578333
	)
	int field5590;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1689026881
	)
	int field5601;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -466893115
	)
	int field5602;

	public class574() {
		this.field5596 = 0;
		this.field5600 = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZI)V",
		garbageValue = "2127607644"
	)
	public void method10722(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		this.field5593 = var1;
		this.field5597 = var2;
		this.field5592 = var3;
		this.field5595 = var4;
		this.field5594 = var5;
		this.field5598 = var6;
		this.field5596 = var7;
		this.field5600 = var8;
		this.field5589 = var9;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-608488185"
	)
	public void method10723(int var1, int var2, int var3, int var4) {
		this.field5591 = var1;
		this.field5590 = var2;
		this.field5601 = var3;
		this.field5602 = var4;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lqj;Lqu;I)V",
		garbageValue = "429194018"
	)
	public void method10724(class436 var1, Font var2) {
		if (var2 != null) {
			int var3 = var2.ascent;
			int var4 = Math.min(this.field5595, (int)(0.9F * (float)var3));
			int var5 = var1.method8399(this.field5592);
			int var6 = var1.method8411(this.field5595);
			int var7 = var5 + (this.field5593 - this.field5594);
			int var8 = var6 + var3 + (this.field5597 - this.field5598);
			Rasterizer2D.Rasterizer2D_setClip(this.field5593, this.field5597, this.field5592 + this.field5593, this.field5597 + this.field5595);
			int var9 = this.field5600;
			int var10 = this.field5596;
			if (var9 > var10) {
				int var11 = var9;
				var9 = var10;
				var10 = var11;
			}

			class440 var21 = var1.method8391(0, var9);
			class440 var12 = var1.method8391(var9, var10);
			class440 var13 = var1.method8391(var10, var1.method8382());
			class440 var14 = var1.method8391(0, this.field5596);
			int var16;
			int var18;
			if (!var12.method8652()) {
				int var15 = var2.maxAscent + var2.maxDescent;

				for (var16 = 0; var16 < var12.method8636(); ++var16) {
					class438 var23 = var12.method8638(var16);
					var18 = var7 + var23.field4824;
					int var19 = var2.charWidth(var23.field4825);
					int var20 = var8 + var23.field4826 - var3;
					Rasterizer2D.Rasterizer2D_fillRectangle(var18, var20, var19, var15, this.field5602);
				}
			}

			if (!var21.method8652()) {
				var2.method8617(var21, var7, var8, this.field5591, this.field5590, -1);
			}

			if (!var12.method8652()) {
				var2.method8617(var12, var7, var8, this.field5601, this.field5590, -1);
			}

			if (!var13.method8652()) {
				var2.method8617(var13, var7, var8, this.field5591, this.field5590, -1);
			}

			if (this.field5589) {
				class527 var22 = var14.method8661();
				var16 = var7 + (Integer)var22.field5325;
				int var17 = var8 + (Integer)var22.field5323;
				var18 = var17 - var4;
				Rasterizer2D.Rasterizer2D_drawLine(var16, var17, var16, var18, this.field5591);
				if (this.field5590 != -1) {
					Rasterizer2D.Rasterizer2D_drawLine(var16 + 1, var17 + 1, var16 + 1, var18 + 1, this.field5590);
				}
			}

		}
	}
}
