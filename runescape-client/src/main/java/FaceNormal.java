import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("it")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 26729961
	)
	@Export("x")
	int x;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -507317839
	)
	@Export("y")
	int y;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -394486121
	)
	@Export("z")
	int z;

	FaceNormal() {
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILox;IIIII[FB)Lox;",
		garbageValue = "-58"
	)
	static Widget method5365(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
		Widget var8 = new Widget();
		var8.type = var0;
		var8.parentId = var1.id;
		var8.childIndex = var2 * 814750319;
		var8.isIf3 = true;
		var8.xAlignment = var3;
		var8.yAlignment = var4;
		var8.widthAlignment = var5;
		var8.heightAlignment = var6;
		var8.rawX = (int)((float)var1.width * var7[0]);
		var8.rawY = (int)(var7[1] * (float)(var1.height * -1326764757));
		var8.rawWidth = (int)((float)var1.width * var7[2]);
		var8.rawHeight = (int)(var7[3] * (float)(var1.height * -1326764757));
		return var8;
	}
}
