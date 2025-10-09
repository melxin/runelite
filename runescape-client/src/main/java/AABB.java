import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iu")
@Implements("AABB")
public class AABB {
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 1836746501
	)
	@Export("otpMedium")
	static int otpMedium;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1532191657
	)
	@Export("orientation")
	final int orientation;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1499831733
	)
	@Export("xMid")
	int xMid;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1697834177
	)
	@Export("yMid")
	int yMid;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1450421863
	)
	@Export("zMid")
	int zMid;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -331204281
	)
	@Export("xMidOffset")
	int xMidOffset;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 81692539
	)
	@Export("yMidOffset")
	int yMidOffset;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 257748505
	)
	@Export("zMidOffset")
	int zMidOffset;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	@Export("aabb")
	AABB aabb;

	AABB(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.orientation = var1;
		this.xMid = var2;
		this.yMid = var3;
		this.zMid = var4;
		this.xMidOffset = var5;
		this.yMidOffset = var6;
		this.zMidOffset = var7;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)[Ljava/lang/Object;",
		garbageValue = "492600461"
	)
	static Object[] method5432() {
		String var0 = (String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
		Object[] var1 = new Object[var0.length()];

		for (int var2 = var0.length() - 1; var2 >= 0; --var2) {
			if (var0.charAt(var2) == 'i') {
				var1[var2] = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
			} else {
				var1[var2] = Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
			}
		}

		return var1;
	}

	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "(Lok;IIII)V",
		garbageValue = "1864335336"
	)
	static final void method5431(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.method8091(class35.widgetDefinition, false);
		if (var4 != null) {
			if (Client.minimapState < 3) {
				ItemComposition.compass.method11882(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var1, var2, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

		}
	}
}
