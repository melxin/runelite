import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("xg")
public class class605 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1159830663
	)
	int field5942;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1900728943
	)
	int field5939;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 902927243
	)
	int field5937;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1759219289
	)
	int field5941;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -715264999
	)
	int field5938;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1465219837
	)
	int field5943;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 937212123
	)
	int field5950;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 532710199
	)
	int field5945;
	@ObfuscatedName("aj")
	boolean field5940;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -287773255
	)
	int field5947;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 457983807
	)
	int field5948;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 373049215
	)
	int field5949;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1139435273
	)
	int field5946;

	public class605() {
		this.field5950 = 0;
		this.field5945 = 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZB)V",
		garbageValue = "-50"
	)
	public void method11847(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		this.field5942 = var1;
		this.field5939 = var2;
		this.field5937 = var3;
		this.field5941 = var4;
		this.field5938 = var5;
		this.field5943 = var6;
		this.field5950 = var7;
		this.field5945 = var8;
		this.field5940 = var9;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-897170206"
	)
	public void method11848(int var1, int var2, int var3, int var4) {
		this.field5947 = var1;
		this.field5948 = var2;
		this.field5949 = var3;
		this.field5946 = var4;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lrx;Lru;I)V",
		garbageValue = "-66574983"
	)
	public void method11849(class458 var1, Font var2) {
		if (var2 != null) {
			int var3 = var2.ascent;
			int var4 = Math.min(this.field5941, (int)((float)var3 * 0.9F));
			int var5 = var1.method9306(this.field5937);
			int var6 = var1.method9293(this.field5941);
			int var7 = var5 + (this.field5942 - this.field5938);
			int var8 = var3 + var6 + (this.field5939 - this.field5943);
			Rasterizer2D.Rasterizer2D_setClip(this.field5942, this.field5939, this.field5937 + this.field5942, this.field5941 + this.field5939);
			int var9 = this.field5945;
			int var10 = this.field5950;
			if (var9 > var10) {
				int var11 = var9;
				var9 = var10;
				var10 = var11;
			}

			class462 var21 = var1.method9378(0, var9);
			class462 var12 = var1.method9378(var9, var10);
			class462 var13 = var1.method9378(var10, var1.method9264());
			class462 var14 = var1.method9378(0, this.field5950);
			int var16;
			int var18;
			if (!var12.method9533()) {
				int var15 = var2.maxDescent + var2.maxAscent;

				for (var16 = 0; var16 < var12.method9534(); ++var16) {
					class460 var23 = var12.method9546(var16);
					var18 = var7 + var23.field5124;
					int var19 = var2.charWidth(var23.field5125);
					int var20 = var8 + var23.field5126 - var3;
					Rasterizer2D.Rasterizer2D_fillRectangle(var18, var20, var19, var15, this.field5946);
				}
			}

			if (!var21.method9533()) {
				var2.method9433(var21, var7, var8, this.field5947, this.field5948, -1);
			}

			if (!var12.method9533()) {
				var2.method9433(var12, var7, var8, this.field5949, this.field5948, -1);
			}

			if (!var13.method9533()) {
				var2.method9433(var13, var7, var8, this.field5947, this.field5948, -1);
			}

			if (this.field5940) {
				class553 var22 = var14.method9537();
				var16 = var7 + (Integer)var22.field5652;
				int var17 = var8 + (Integer)var22.field5651;
				var18 = var17 - var4;
				Rasterizer2D.Rasterizer2D_drawLine(var16, var17, var16, var18, this.field5947);
				if (this.field5948 != -1) {
					Rasterizer2D.Rasterizer2D_drawLine(var16 + 1, var17 + 1, var16 + 1, var18 + 1, this.field5948);
				}
			}

		}
	}
}
