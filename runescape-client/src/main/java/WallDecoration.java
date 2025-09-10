import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jr")
@Implements("WallDecoration")
public final class WallDecoration {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = 1018809780381384529L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1386950097
	)
	@Export("z")
	int z;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1302913785
	)
	@Export("x")
	int x;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1143420041
	)
	@Export("y")
	int y;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -310888395
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -264803905
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1356146427
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 15695633
	)
	int field3044;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 512076447
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1572389463
	)
	int field3035;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1154018501
	)
	@Export("flags")
	int flags;

	WallDecoration() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1304137704"
	)
	void method5789(int var1, int var2) {
		this.yOffset = var1;
		this.field3044 = var2;
		switch(this.orientation) {
		case 1:
			++var1;
			break;
		case 2:
			--var2;
		case 3:
		case 5:
		case 6:
		case 7:
		default:
			break;
		case 4:
			--var1;
			break;
		case 8:
			++var2;
		}

		this.xOffset = var1;
		this.field3035 = var2;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IZI)Ljava/lang/String;",
		garbageValue = "1586972230"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		if (var1 && var0 >= 0) {
			int var3 = var0;
			String var2;
			if (var1 && var0 >= 0) {
				int var4 = 2;

				for (int var5 = var0 / 10; var5 != 0; ++var4) {
					var5 /= 10;
				}

				char[] var6 = new char[var4];
				var6[0] = '+';

				for (int var7 = var4 - 1; var7 > 0; --var7) {
					int var8 = var3;
					var3 /= 10;
					int var9 = var8 - var3 * 10;
					if (var9 >= 10) {
						var6[var7] = (char)(var9 + 87);
					} else {
						var6[var7] = (char)(var9 + 48);
					}
				}

				var2 = new String(var6);
			} else {
				var2 = Integer.toString(var0, 10);
			}

			return var2;
		} else {
			return Integer.toString(var0);
		}
	}

	@ObfuscatedName("mh")
	@ObfuscatedSignature(
		descriptor = "(Loi;III)V",
		garbageValue = "-1761196560"
	)
	@Export("alignWidgetPosition")
	static void alignWidgetPosition(Widget var0, int var1, int var2) {
		if (var0.xAlignment == 0) {
			var0.x = var0.rawX;
		} else if (var0.xAlignment == 1) {
			var0.x = (var1 - var0.width * 469894397) / 2 + var0.rawX;
		} else if (var0.xAlignment == 2) {
			var0.x = var1 - var0.width * 469894397 - var0.rawX;
		} else if (var0.xAlignment == 3) {
			var0.x = var0.rawX * var1 >> 14;
		} else if (var0.xAlignment == 4) {
			var0.x = (var0.rawX * var1 >> 14) + (var1 - var0.width * 469894397) / 2;
		} else {
			var0.x = var1 - var0.width * 469894397 - (var0.rawX * var1 >> 14);
		}

		if (var0.yAlignment == 0) {
			var0.y = var0.rawY;
		} else if (var0.yAlignment == 1) {
			var0.y = (var2 - var0.height * 1156037777) / 2 + var0.rawY;
		} else if (var0.yAlignment == 2) {
			var0.y = var2 - var0.height * 1156037777 - var0.rawY;
		} else if (var0.yAlignment == 3) {
			var0.y = var2 * var0.rawY >> 14;
		} else if (var0.yAlignment == 4) {
			var0.y = (var2 - var0.height * 1156037777) / 2 + (var2 * var0.rawY >> 14);
		} else {
			var0.y = var2 - var0.height * 1156037777 - (var2 * var0.rawY >> 14);
		}

	}
}
