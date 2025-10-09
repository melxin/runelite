import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rf")
public final class class445 {
	@ObfuscatedName("ab")
	@Export("base37Table")
	static final char[] base37Table;
	@ObfuscatedName("at")
	static long[] field5184;
	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "Lsy;"
	)
	@Export("friendsChat")
	static FriendsChat friendsChat;
	@ObfuscatedName("pk")
	@ObfuscatedSignature(
		descriptor = "Lxl;"
	)
	@Export("redHintArrowSprite")
	static SpritePixels redHintArrowSprite;

	static {
		base37Table = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		field5184 = new long[12];

		for (int var0 = 0; var0 < field5184.length; ++var0) {
			field5184[var0] = (long)Math.pow(37.0D, (double)var0);
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-118122552"
	)
	static int method9002() {
		return Login.loginIndex;
	}

	@ObfuscatedName("ow")
	@ObfuscatedSignature(
		descriptor = "(IIIIILxl;Lnt;I)V",
		garbageValue = "-296793548"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, int var4, SpritePixels var5, SpriteMask var6) {
		if (var5 != null) {
			int var7 = var3 * var3 + var2 * var2;
			if (var7 <= 6400) {
				int var8 = Rasterizer3D.Rasterizer3D_sine[var4];
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var4];
				int var10 = var3 * var8 + var9 * var2 >> 16;
				int var11 = var3 * var9 - var8 * var2 >> 16;
				if (var7 > 2500) {
					var5.method11881(var10 + var6.width / 2 - var5.width / 2, var6.height / 2 - var11 - var5.height / 2, var0, var1, var6.width, var6.height, var6.xStarts, var6.xWidths);
				} else {
					var5.drawTransBgAt(var0 + var10 + var6.width / 2 - var5.width / 2, var6.height / 2 + var1 - var11 - var5.height / 2);
				}

			}
		}
	}
}
