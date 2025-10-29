import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("xw")
public class class618 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1080544815
	)
	int field6141;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1921097201
	)
	int field6142;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -365850535
	)
	int field6146;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 805216797
	)
	int field6144;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1695381625
	)
	int field6145;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1559677145
	)
	int field6152;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 306135809
	)
	int field6147;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 390881283
	)
	int field6148;
	@ObfuscatedName("ay")
	boolean field6149;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 900951639
	)
	int field6140;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1874703679
	)
	int field6151;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -546987219
	)
	int field6143;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1256935427
	)
	int field6153;

	public class618() {
		this.field6147 = 0;
		this.field6148 = 0;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZB)V",
		garbageValue = "-62"
	)
	public void method12276(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		this.field6141 = var1;
		this.field6142 = var2;
		this.field6146 = var3;
		this.field6144 = var4;
		this.field6145 = var5;
		this.field6152 = var6;
		this.field6147 = var7;
		this.field6148 = var8;
		this.field6149 = var9;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1425856690"
	)
	public void method12277(int var1, int var2, int var3, int var4) {
		this.field6140 = var1;
		this.field6151 = var2;
		this.field6143 = var3;
		this.field6153 = var4;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lsf;Lsu;B)V",
		garbageValue = "-35"
	)
	public void method12278(class470 var1, Font var2) {
		if (var2 != null) {
			int var3 = var2.ascent;
			int var4 = Math.min(this.field6144, (int)((float)var3 * 0.9F));
			int var5 = var1.method9649(this.field6146);
			int var6 = var1.method9606(this.field6144);
			int var7 = var5 + (this.field6141 - this.field6145);
			int var8 = var6 + var3 + (this.field6142 - this.field6152);
			Rasterizer2D.Rasterizer2D_setClip(this.field6141, this.field6142, this.field6146 + this.field6141, this.field6142 + this.field6144);
			int var9 = this.field6148;
			int var10 = this.field6147;
			if (var9 > var10) {
				int var11 = var9;
				var9 = var10;
				var10 = var11;
			}

			class474 var21 = var1.method9655(0, var9);
			class474 var12 = var1.method9655(var9, var10);
			class474 var13 = var1.method9655(var10, var1.method9660());
			class474 var14 = var1.method9655(0, this.field6147);
			int var16;
			int var18;
			if (!var12.method9836()) {
				int var15 = var2.maxDescent + var2.maxAscent;

				for (var16 = 0; var16 < var12.method9833(); ++var16) {
					class472 var23 = var12.method9837(var16);
					var18 = var7 + var23.field5324;
					int var19 = var2.charWidth(var23.field5322);
					int var20 = var8 + var23.field5323 - var3;
					Rasterizer2D.Rasterizer2D_fillRectangle(var18, var20, var19, var15, this.field6153);
				}
			}

			if (!var21.method9836()) {
				var2.method9809(var21, var7, var8, this.field6140, this.field6151, -1);
			}

			if (!var12.method9836()) {
				var2.method9809(var12, var7, var8, this.field6143, this.field6151, -1);
			}

			if (!var13.method9836()) {
				var2.method9809(var13, var7, var8, this.field6140, this.field6151, -1);
			}

			if (this.field6149) {
				class569 var22 = var14.method9855();
				var16 = var7 + (Integer)var22.field5876;
				int var17 = var8 + (Integer)var22.field5875;
				var18 = var17 - var4;
				Rasterizer2D.Rasterizer2D_drawLine(var16, var17, var16, var18, this.field6140);
				if (this.field6151 != -1) {
					Rasterizer2D.Rasterizer2D_drawLine(var16 + 1, var17 + 1, var16 + 1, var18 + 1, this.field6151);
				}
			}

		}
	}
}
