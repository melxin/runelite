import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lr")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("nd")
	static boolean field3472;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1136783843
	)
	@Export("width")
	int width;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 632501093
	)
	@Export("height")
	int height;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1445175755
	)
	@Export("x")
	int x;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1674979267
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	final WorldMapRenderer this$0;

	@ObfuscatedSignature(
		descriptor = "(Lle;)V"
	)
	WorldMapRectangle(WorldMapRenderer var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILof;IIIII[FI)Lof;",
		garbageValue = "-175760280"
	)
	static Widget method7007(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
		Widget var8 = new Widget();
		var8.type = var0;
		var8.parentId = var1.id;
		var8.childIndex = var2 * 1657618603;
		var8.isIf3 = true;
		var8.xAlignment = var3;
		var8.yAlignment = var4;
		var8.widthAlignment = var5;
		var8.heightAlignment = var6;
		var8.rawX = (int)(var7[0] * (float)(var1.width * -1946208531));
		var8.rawY = (int)((float)(var1.height * -905446999) * var7[1]);
		var8.rawWidth = (int)((float)(var1.width * -1946208531) * var7[2]);
		var8.rawHeight = (int)((float)(var1.height * -905446999) * var7[3]);
		return var8;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lof;ZI)V",
		garbageValue = "-605910890"
	)
	static void method7006(Widget var0, boolean var1) {
		if (var0 != null) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 1;
			if (var1) {
				UserComparator3.scriptDotWidget = var0;
			} else {
				class222.scriptActiveWidget = var0;
			}
		} else {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
		}

	}
}
