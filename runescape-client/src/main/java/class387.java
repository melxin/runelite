import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oa")
public enum class387 implements Enum {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	field4578(-1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	field4581(0),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	field4583(1),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	field4580(2);

	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -9896187
	)
	static int field4577;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -847991053
	)
	@Export("loginBoxCenter")
	static int loginBoxCenter;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1579179329
	)
	final int field4584;

	class387(int var3) {
		this.field4584 = var3;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1746725635"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4584;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([BB)Lwc;",
		garbageValue = "17"
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

		return new SpritePixels(0, 0);
	}
}
