import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("xz")
public class class598 {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1080496113
	)
	int field5830;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 723292139
	)
	int field5835;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 936209579
	)
	int field5834;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -690267689
	)
	int field5825;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1489897217
	)
	int field5826;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1948185163
	)
	int field5827;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -337444751
	)
	int field5828;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1554532757
	)
	int field5829;
	@ObfuscatedName("ag")
	boolean field5822;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1940884173
	)
	int field5831;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 534093545
	)
	int field5832;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1154874669
	)
	int field5833;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1945757375
	)
	int field5824;

	public class598() {
		this.field5828 = 0;
		this.field5829 = 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZB)V",
		garbageValue = "103"
	)
	public void method11483(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		this.field5830 = var1;
		this.field5835 = var2;
		this.field5834 = var3;
		this.field5825 = var4;
		this.field5826 = var5;
		this.field5827 = var6;
		this.field5828 = var7;
		this.field5829 = var8;
		this.field5822 = var9;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-128998646"
	)
	public void method11484(int var1, int var2, int var3, int var4) {
		this.field5831 = var1;
		this.field5832 = var2;
		this.field5833 = var3;
		this.field5824 = var4;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lrk;Lrf;B)V",
		garbageValue = "-38"
	)
	public void method11485(class455 var1, Font var2) {
		if (var2 != null) {
			int var3 = var2.ascent;
			int var4 = Math.min(this.field5825, (int)((float)var3 * 0.9F));
			int var5 = var1.method8974(this.field5834);
			int var6 = var1.method8991(this.field5825);
			int var7 = var5 + (this.field5830 - this.field5826);
			int var8 = var6 + var3 + (this.field5835 - this.field5827);
			Rasterizer2D.Rasterizer2D_setClip(this.field5830, this.field5835, this.field5830 + this.field5834, this.field5835 + this.field5825);
			int var9 = this.field5829;
			int var10 = this.field5828;
			if (var9 > var10) {
				int var11 = var9;
				var9 = var10;
				var10 = var11;
			}

			class459 var21 = var1.method9058(0, var9);
			class459 var12 = var1.method9058(var9, var10);
			class459 var13 = var1.method9058(var10, var1.method8946());
			class459 var14 = var1.method9058(0, this.field5828);
			int var16;
			int var18;
			if (!var12.method9200()) {
				int var15 = var2.maxAscent + var2.maxDescent;

				for (var16 = 0; var16 < var12.method9220(); ++var16) {
					class457 var23 = var12.method9209(var16);
					var18 = var7 + var23.field5046;
					int var19 = var2.charWidth(var23.field5045);
					int var20 = var8 + var23.field5047 - var3;
					Rasterizer2D.Rasterizer2D_fillRectangle(var18, var20, var19, var15, this.field5824);
				}
			}

			if (!var21.method9200()) {
				var2.method9103(var21, var7, var8, this.field5831, this.field5832, -1);
			}

			if (!var12.method9200()) {
				var2.method9103(var12, var7, var8, this.field5833, this.field5832, -1);
			}

			if (!var13.method9200()) {
				var2.method9103(var13, var7, var8, this.field5831, this.field5832, -1);
			}

			if (this.field5822) {
				class547 var22 = var14.method9204();
				var16 = var7 + (Integer)var22.field5539;
				int var17 = var8 + (Integer)var22.field5538;
				var18 = var17 - var4;
				Rasterizer2D.Rasterizer2D_drawLine(var16, var17, var16, var18, this.field5831);
				if (this.field5832 != -1) {
					Rasterizer2D.Rasterizer2D_drawLine(var16 + 1, var17 + 1, var16 + 1, var18 + 1, this.field5832);
				}
			}

		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)Ljava/lang/String;",
		garbageValue = "105"
	)
	public static String method11493(CharSequence var0) {
		int var1 = var0.length();
		StringBuilder var2 = new StringBuilder(var1);

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') {
				if (var4 == ' ') {
					var2.append('+');
				} else {
					byte var5 = class527.charToByteCp1252(var4);
					var2.append('%');
					int var6 = var5 >> 4 & 15;
					if (var6 >= 10) {
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48));
					}

					var6 = var5 & 15;
					if (var6 >= 10) {
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48));
					}
				}
			} else {
				var2.append(var4);
			}
		}

		return var2.toString();
	}
}
