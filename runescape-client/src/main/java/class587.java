import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wa")
public class class587 {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1307301897
	)
	int field5691;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 2004648339
	)
	int field5698;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1340562407
	)
	int field5693;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1235104417
	)
	int field5694;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1869441313
	)
	int field5700;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -372304335
	)
	int field5696;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1535514095
	)
	int field5697;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1597480413
	)
	int field5701;
	@ObfuscatedName("as")
	boolean field5699;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1044914055
	)
	int field5690;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1730263863
	)
	int field5692;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1312920305
	)
	int field5702;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 552416777
	)
	int field5703;

	public class587() {
		this.field5697 = 0;
		this.field5701 = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZB)V",
		garbageValue = "3"
	)
	public void method10865(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		this.field5691 = var1;
		this.field5698 = var2;
		this.field5693 = var3;
		this.field5694 = var4;
		this.field5700 = var5;
		this.field5696 = var6;
		this.field5697 = var7;
		this.field5701 = var8;
		this.field5699 = var9;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1370036554"
	)
	public void method10864(int var1, int var2, int var3, int var4) {
		this.field5690 = var1;
		this.field5692 = var2;
		this.field5702 = var3;
		this.field5703 = var4;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lrn;Lrf;B)V",
		garbageValue = "127"
	)
	public void method10861(class452 var1, Font var2) {
		if (var2 != null) {
			int var3 = var2.ascent;
			int var4 = Math.min(this.field5694, (int)((float)var3 * 0.9F));
			int var5 = var1.method8569(this.field5693);
			int var6 = var1.method8633(this.field5694);
			int var7 = var5 + (this.field5691 - this.field5700);
			int var8 = var3 + var6 + (this.field5698 - this.field5696);
			Rasterizer2D.Rasterizer2D_setClip(this.field5691, this.field5698, this.field5693 + this.field5691, this.field5694 + this.field5698);
			int var9 = this.field5701;
			int var10 = this.field5697;
			if (var9 > var10) {
				int var11 = var9;
				var9 = var10;
				var10 = var11;
			}

			class456 var21 = var1.method8553(0, var9);
			class456 var12 = var1.method8553(var9, var10);
			class456 var13 = var1.method8553(var10, var1.method8563());
			class456 var14 = var1.method8553(0, this.field5697);
			int var16;
			int var18;
			if (!var12.method8805()) {
				int var15 = var2.maxAscent + var2.maxDescent;

				for (var16 = 0; var16 < var12.method8802(); ++var16) {
					class454 var23 = var12.method8821(var16);
					var18 = var7 + var23.field4972;
					int var19 = var2.charWidth(var23.field4974);
					int var20 = var8 + var23.field4971 - var3;
					Rasterizer2D.Rasterizer2D_fillRectangle(var18, var20, var19, var15, this.field5703);
				}
			}

			if (!var21.method8805()) {
				var2.method8697(var21, var7, var8, this.field5690, this.field5692, -1);
			}

			if (!var12.method8805()) {
				var2.method8697(var12, var7, var8, this.field5702, this.field5692, -1);
			}

			if (!var13.method8805()) {
				var2.method8697(var13, var7, var8, this.field5690, this.field5692, -1);
			}

			if (this.field5699) {
				class541 var22 = var14.method8808();
				var16 = var7 + (Integer)var22.field5443;
				int var17 = var8 + (Integer)var22.field5444;
				var18 = var17 - var4;
				Rasterizer2D.Rasterizer2D_drawLine(var16, var17, var16, var18, this.field5690);
				if (this.field5692 != -1) {
					Rasterizer2D.Rasterizer2D_drawLine(var16 + 1, var17 + 1, var16 + 1, var18 + 1, this.field5692);
				}
			}

		}
	}
}
