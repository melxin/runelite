import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -182720187
	)
	@Export("x")
	int x;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 850764827
	)
	@Export("y")
	int y;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 290545899
	)
	@Export("z")
	int z;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 545193269
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	}

	@ObfuscatedSignature(
		descriptor = "(Ljo;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x;
		this.y = var1.y;
		this.z = var1.z;
		this.magnitude = var1.magnitude;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "794047741"
	)
	public static int method5706(int var0) {
		return class526.field5366[var0 & 2047];
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(FFFFLfg;I)V",
		garbageValue = "1146599658"
	)
	static void method5708(float var0, float var1, float var2, float var3, class136 var4) {
		float var5 = var1 - var0;
		float var6 = var2 - var1;
		float var7 = var3 - var2;
		float var8 = var6 - var5;
		var4.field1603 = var7 - var6 - var8;
		var4.field1602 = var8 + var8 + var8;
		var4.field1601 = var5 + var5 + var5;
		var4.field1595 = var0;
	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIII)I",
		garbageValue = "1486832800"
	)
	static final int method5709(String var0, String var1, int var2, int var3, int var4, int var5, int var6) {
		return GrandExchangeOfferOwnWorldComparator.insertMenuItem(var0, var1, var2, var3, var4, var5, var6, false, -1);
	}

	@ObfuscatedName("nu")
	@ObfuscatedSignature(
		descriptor = "(IIILwd;I)V",
		garbageValue = "1726827372"
	)
	static void method5707(int var0, int var1, int var2, SpritePixels var3) {
		int var4 = var2 * 128;
		var4 += Client.camAngleY;
		var4 &= 2047;
		byte var5 = 30;
		int var6 = var0 - (int)(class517.method10079(var4) * (double)var5);
		double var8 = (double)method5706(var4) / 65536.0D;
		int var10 = (int)(var8 * (double)var5) + var1;
		int var11 = Math.max(var3.subWidth, var3.subHeight);
		int var12 = var11 / 2;
		int var14 = var6 - var12;
		int var15 = var10 - var12;
		int var16 = var3.subWidth;
		int var17 = var3.subHeight;
		int var18 = var3.subWidth / 2;
		int var19 = var3.subHeight / 2;
		int var21 = var4 & 2047;
		float var20 = (float)(6.283185307179586D * (double)((float)var21 / 2048.0F));
		var3.method11340(var14, var15, var16, var17, var18, var19, (double)var20, 256);
	}
}
