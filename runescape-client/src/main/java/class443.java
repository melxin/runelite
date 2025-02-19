import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rc")
public final class class443 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lrc;"
	)
	static class443[] field4905;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1832256025
	)
	static int field4902;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1447305771
	)
	static int field4903;
	@ObfuscatedName("ad")
	float field4901;
	@ObfuscatedName("ah")
	float field4907;
	@ObfuscatedName("ac")
	float field4906;
	@ObfuscatedName("ao")
	float field4904;

	static {
		field4905 = new class443[0];
		class440.method8291(16);
		new class443();
	}

	class443() {
		this.method8355();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2140173130"
	)
	public void method8366() {
		synchronized(field4905) {
			if (field4903 < field4902) {
				field4905[++field4903 - 1] = this;
			}

		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(FFFFB)V",
		garbageValue = "1"
	)
	void method8354(float var1, float var2, float var3, float var4) {
		this.field4901 = var1;
		this.field4907 = var2;
		this.field4906 = var3;
		this.field4904 = var4;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(FFFFB)V",
		garbageValue = "-104"
	)
	public void method8384(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin((double)(var4 * 0.5F));
		float var6 = (float)Math.cos((double)(var4 * 0.5F));
		this.field4901 = var5 * var1;
		this.field4907 = var2 * var5;
		this.field4906 = var5 * var3;
		this.field4904 = var6;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "70982560"
	)
	public void method8363(float var1, float var2, float var3) {
		this.method8384(0.0F, 1.0F, 0.0F, var1);
		class443 var4 = class433.method8185();
		var4.method8384(1.0F, 0.0F, 0.0F, var2);
		this.method8356(var4);
		var4.method8384(0.0F, 0.0F, 1.0F, var3);
		this.method8356(var4);
		var4.method8366();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2113359088"
	)
	final void method8355() {
		this.field4906 = 0.0F;
		this.field4907 = 0.0F;
		this.field4901 = 0.0F;
		this.field4904 = 1.0F;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lrc;I)V",
		garbageValue = "-289066235"
	)
	public final void method8356(class443 var1) {
		this.method8354(this.field4901 * var1.field4904 + this.field4904 * var1.field4901 + this.field4906 * var1.field4907 - this.field4907 * var1.field4906, var1.field4906 * this.field4901 + this.field4907 * var1.field4904 - this.field4906 * var1.field4901 + var1.field4907 * this.field4904, this.field4904 * var1.field4906 + (this.field4907 * var1.field4901 + var1.field4904 * this.field4906 - this.field4901 * var1.field4907), var1.field4904 * this.field4904 - this.field4901 * var1.field4901 - var1.field4907 * this.field4907 - this.field4906 * var1.field4906);
	}

	public int hashCode() {
		boolean var1 = true;
		float var2 = 1.0F;
		var2 = this.field4901 + var2 * 31.0F;
		var2 = this.field4907 + 31.0F * var2;
		var2 = this.field4906 + 31.0F * var2;
		var2 = 31.0F * var2 + this.field4904;
		return (int)var2;
	}

	public String toString() {
		return this.field4901 + "," + this.field4907 + "," + this.field4906 + "," + this.field4904;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class443)) {
			return false;
		} else {
			class443 var2 = (class443)var1;
			return var2.field4901 == this.field4901 && this.field4907 == var2.field4907 && var2.field4906 == this.field4906 && var2.field4904 == this.field4904;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1633760204"
	)
	static final void method8380(int var0, int var1, int var2, int var3) {
		if (!ViewportMouse.ViewportMouse_false0) {
			byte var8 = 50;
			int var9 = AbstractRasterizer.method4881();
			int var10 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.getClipMidX()) * var8 / Rasterizer3D.get3dZoom();
			int var11 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.getClipMidY()) * var8 / Rasterizer3D.get3dZoom();
			int var12 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.getClipMidX()) * var9 / Rasterizer3D.get3dZoom();
			int var13 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.getClipMidY()) * var9 / Rasterizer3D.get3dZoom();
			int var15 = var1 * var11 + var8 * var0 >> 16;
			int var16 = var8 * var1 - var0 * var11 >> 16;
			int var17 = var9 * var0 + var13 * var1 >> 16;
			int var18 = var1 * var9 - var0 * var13 >> 16;
			int var19 = var3 * var10 - var2 * var16 >> 16;
			int var20 = var3 * var16 + var2 * var10 >> 16;
			int var21 = var12 * var3 - var2 * var18 >> 16;
			int var22 = var18 * var3 + var12 * var2 >> 16;
			ViewportMouse.field2952 = (var19 + var21) / 2;
			ViewportMouse.field2953 = (var17 + var15) / 2;
			class202.field2160 = (var20 + var22) / 2;
			ClanChannelMember.field1737 = (var21 - var19) / 2;
			class376.field4168 = (var17 - var15) / 2;
			ViewportMouse.field2960 = (var22 - var20) / 2;
			ViewportMouse.field2955 = Math.abs(ClanChannelMember.field1737);
			class95.field1188 = Math.abs(class376.field4168);
			class159.field1784 = Math.abs(ViewportMouse.field2960);
			ViewportMouse.field2956.method8296((float)(var21 - var19), (float)(var17 - var15), (float)(var22 - var20));
			ViewportMouse.field2956.method8300();
			ViewportMouse.ViewportMouse_false0 = true;
		}
	}
}
