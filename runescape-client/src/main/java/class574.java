import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ww")
public class class574 {
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1377942857
	)
	int field5609;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1512434257
	)
	int field5598;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 977849859
	)
	int field5599;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1014335183
	)
	int field5600;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2067185287
	)
	int field5605;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1966637571
	)
	int field5597;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -362394515
	)
	int field5601;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -753631595
	)
	int field5604;
	@ObfuscatedName("ac")
	boolean field5608;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -2136755735
	)
	int field5606;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1550802973
	)
	int field5607;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -267529311
	)
	int field5602;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 993786395
	)
	int field5603;

	public class574() {
		this.field5601 = 0;
		this.field5604 = 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZB)V",
		garbageValue = "7"
	)
	public void method10905(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		this.field5609 = var1;
		this.field5598 = var2;
		this.field5599 = var3;
		this.field5600 = var4;
		this.field5605 = var5;
		this.field5597 = var6;
		this.field5601 = var7;
		this.field5604 = var8;
		this.field5608 = var9;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "2039845081"
	)
	public void method10906(int var1, int var2, int var3, int var4) {
		this.field5606 = var1;
		this.field5607 = var2;
		this.field5602 = var3;
		this.field5603 = var4;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lqi;Lqw;S)V",
		garbageValue = "-20924"
	)
	public void method10907(class436 var1, Font var2) {
		if (var2 != null) {
			int var3 = var2.ascent;
			int var4 = Math.min(this.field5600, (int)(0.9F * (float)var3));
			int var5 = var1.method8559(this.field5599);
			int var6 = var1.method8560(this.field5600);
			int var7 = var5 + (this.field5609 - this.field5605);
			int var8 = var6 + var3 + (this.field5598 - this.field5597);
			Rasterizer2D.Rasterizer2D_setClip(this.field5609, this.field5598, this.field5599 + this.field5609, this.field5598 + this.field5600);
			int var9 = this.field5604;
			int var10 = this.field5601;
			if (var9 > var10) {
				int var11 = var9;
				var9 = var10;
				var10 = var11;
			}

			class440 var21 = var1.method8629(0, var9);
			class440 var12 = var1.method8629(var9, var10);
			class440 var13 = var1.method8629(var10, var1.method8532());
			class440 var14 = var1.method8629(0, this.field5601);
			int var16;
			int var18;
			if (!var12.method8788()) {
				int var15 = var2.maxDescent + var2.maxAscent;

				for (var16 = 0; var16 < var12.method8808(); ++var16) {
					class438 var23 = var12.method8786(var16);
					var18 = var7 + var23.field4821;
					int var19 = var2.charWidth(var23.field4824);
					int var20 = var8 + var23.field4822 - var3;
					Rasterizer2D.Rasterizer2D_fillRectangle(var18, var20, var19, var15, this.field5603);
				}
			}

			if (!var21.method8788()) {
				var2.method8689(var21, var7, var8, this.field5606, this.field5607, -1);
			}

			if (!var12.method8788()) {
				var2.method8689(var12, var7, var8, this.field5602, this.field5607, -1);
			}

			if (!var13.method8788()) {
				var2.method8689(var13, var7, var8, this.field5606, this.field5607, -1);
			}

			if (this.field5608) {
				class527 var22 = var14.method8792();
				var16 = var7 + (Integer)var22.field5326;
				int var17 = var8 + (Integer)var22.field5327;
				var18 = var17 - var4;
				Rasterizer2D.Rasterizer2D_drawLine(var16, var17, var16, var18, this.field5606);
				if (this.field5607 != -1) {
					Rasterizer2D.Rasterizer2D_drawLine(var16 + 1, var17 + 1, var16 + 1, var18 + 1, this.field5607);
				}
			}

		}
	}
}
