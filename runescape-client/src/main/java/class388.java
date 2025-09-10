import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oy")
public class class388 {
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1700822083"
	)
	public static void method8205() {
		LoginPacket.SpriteBuffer_xOffsets = null;
		class191.SpriteBuffer_yOffsets = null;
		class255.SpriteBuffer_spriteWidths = null;
		FriendLoginUpdate.field5390 = null;
		TriBool.SpriteBuffer_spritePalette = null;
		SpriteBufferProperties.SpriteBuffer_pixels = null;
	}

	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		descriptor = "(IIIILxt;Lnq;I)V",
		garbageValue = "1988121128"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2;
		if (var6 > 4225 && var6 < 90000) {
			int var7 = Client.camAngleY & 2047;
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7];
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7];
			int var10 = var9 * var2 + var3 * var8 >> 16;
			int var11 = var3 * var9 - var8 * var2 >> 16;
			double var12 = Math.atan2((double)var10, (double)var11);
			int var14 = var5.width / 2 - 25;
			int var15 = (int)(Math.sin(var12) * (double)var14);
			int var16 = (int)(Math.cos(var12) * (double)var14);
			byte var17 = 20;
			class181.redHintArrowSprite.method11727(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
		} else {
			AttackOption.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5);
		}

	}

	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "(Loi;S)I",
		garbageValue = "255"
	)
	@Export("getWidgetFlags2")
	static int getWidgetFlags2(Widget var0) {
		WidgetConfigNode var1 = (WidgetConfigNode)Client.widgetFlags.get((long)var0.id);
		WidgetConfigNode var2 = class518.method10317(var1, var0.childIndex * -217986249);
		if (var2 != null) {
			return var2.method7499();
		} else {
			int var4 = var0.flags;
			int var3 = var4 >> 1 & 1023;
			return var3;
		}
	}
}
