import java.awt.FontMetrics;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hp")
public class class201 {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	public static final class201 field2172;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	public static final class201 field2168;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	public static final class201 field2167;
	@ObfuscatedName("al")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;
	@ObfuscatedName("am")
	static String[] field2173;
	@ObfuscatedName("sk")
	@ObfuscatedGetter(
		intValue = 1375819053
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;

	static {
		field2172 = new class201();
		field2168 = new class201();
		field2167 = new class201();
	}

	class201() {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([BB)Lxt;",
		garbageValue = "-37"
	)
	@Export("readSpritePixelsFromBytes")
	public static final SpritePixels readSpritePixelsFromBytes(byte[] var0) {
		BufferedImage var1 = null;

		try {
			Class var2 = ImageIO.class;
			synchronized(ImageIO.class) {
				var1 = ImageIO.read(new ByteArrayInputStream(var0));
			}

			if (var1 != null) {
				int var6 = var1.getWidth();
				int var7 = var1.getHeight();
				int[] var4 = new int[var6 * var7];
				PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var6, var7, var4, 0, var6);
				var5.grabPixels();
				return new SpritePixels(var4, var6, var7);
			}
		} catch (IOException var9) {
		} catch (InterruptedException var10) {
		}

		return null;
	}
}
