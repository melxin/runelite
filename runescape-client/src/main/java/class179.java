import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
public class class179 extends DualNode {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("field1913")
	static EvictingDualNodeHashTable field1913;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1238400531
	)
	static int field1967;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1896617167
	)
	static int field1965;
	@ObfuscatedName("kn")
	@ObfuscatedGetter(
		longValue = 8155561508855884499L
	)
	static long field1970;

	static {
		field1913 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([BI)Lxt;",
		garbageValue = "1671643171"
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
				int[] var4 = new int[var7 * var6];
				PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var6, var7, var4, 0, var6);
				var5.grabPixels();
				return new SpritePixels(var4, var6, var7);
			}
		} catch (IOException var9) {
		} catch (InterruptedException var10) {
		}

		return new SpritePixels(0, 0);
	}
}
