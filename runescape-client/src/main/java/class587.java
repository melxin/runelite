import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wd")
public class class587 {
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 165190197
	)
	int field5717;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 366641829
	)
	int field5727;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -233720013
	)
	int field5719;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1828932981
	)
	int field5718;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1708184901
	)
	int field5721;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1092282579
	)
	int field5720;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1662409451
	)
	int field5723;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1864145387
	)
	int field5716;
	@ObfuscatedName("ap")
	boolean field5725;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1734714601
	)
	int field5726;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1392459471
	)
	int field5728;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1805773765
	)
	int field5730;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 590300781
	)
	int field5729;

	public class587() {
		this.field5723 = 0;
		this.field5716 = 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZI)V",
		garbageValue = "87426125"
	)
	public void method10927(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		this.field5717 = var1;
		this.field5727 = var2;
		this.field5719 = var3;
		this.field5718 = var4;
		this.field5721 = var5;
		this.field5720 = var6;
		this.field5723 = var7;
		this.field5716 = var8;
		this.field5725 = var9;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-481490549"
	)
	public void method10934(int var1, int var2, int var3, int var4) {
		this.field5726 = var1;
		this.field5728 = var2;
		this.field5730 = var3;
		this.field5729 = var4;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lre;Lrk;I)V",
		garbageValue = "-1647154693"
	)
	public void method10930(class452 var1, Font var2) {
		if (var2 != null) {
			int var3 = var2.ascent;
			int var4 = Math.min(this.field5718, (int)((float)var3 * 0.9F));
			int var5 = var1.method8623(this.field5719);
			int var6 = var1.method8648(this.field5718);
			int var7 = var5 + (this.field5717 - this.field5721);
			int var8 = var6 + var3 + (this.field5727 - this.field5720);
			Rasterizer2D.Rasterizer2D_setClip(this.field5717, this.field5727, this.field5719 + this.field5717, this.field5727 + this.field5718);
			int var9 = this.field5716;
			int var10 = this.field5723;
			if (var9 > var10) {
				int var11 = var9;
				var9 = var10;
				var10 = var11;
			}

			class456 var21 = var1.method8619(0, var9);
			class456 var12 = var1.method8619(var9, var10);
			class456 var13 = var1.method8619(var10, var1.method8598());
			class456 var14 = var1.method8619(0, this.field5723);
			int var16;
			int var18;
			if (!var12.method8856()) {
				int var15 = var2.maxAscent + var2.maxDescent;

				for (var16 = 0; var16 < var12.method8857(); ++var16) {
					class454 var23 = var12.method8873(var16);
					var18 = var7 + var23.field4987;
					int var19 = var2.charWidth(var23.field4990);
					int var20 = var8 + var23.field4988 - var3;
					Rasterizer2D.Rasterizer2D_fillRectangle(var18, var20, var19, var15, this.field5729);
				}
			}

			if (!var21.method8856()) {
				var2.method8748(var21, var7, var8, this.field5726, this.field5728, -1);
			}

			if (!var12.method8856()) {
				var2.method8748(var12, var7, var8, this.field5730, this.field5728, -1);
			}

			if (!var13.method8856()) {
				var2.method8748(var13, var7, var8, this.field5726, this.field5728, -1);
			}

			if (this.field5725) {
				class541 var22 = var14.method8853();
				var16 = var7 + (Integer)var22.field5466;
				int var17 = var8 + (Integer)var22.field5467;
				var18 = var17 - var4;
				Rasterizer2D.Rasterizer2D_drawLine(var16, var17, var16, var18, this.field5726);
				if (this.field5728 != -1) {
					Rasterizer2D.Rasterizer2D_drawLine(var16 + 1, var17 + 1, var16 + 1, var18 + 1, this.field5728);
				}
			}

		}
	}
}
