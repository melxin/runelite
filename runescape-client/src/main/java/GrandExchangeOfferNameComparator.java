import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Comparator;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pk")
@Implements("GrandExchangeOfferNameComparator")
final class GrandExchangeOfferNameComparator implements Comparator {
	@ObfuscatedName("jm")
	@Export("regionLandArchiveIds")
	static int[] regionLandArchiveIds;

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lpj;Lpj;I)I",
		garbageValue = "1628934117"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.getOfferName().compareTo(var2.getOfferName());
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([BB)Lvf;",
		garbageValue = "-35"
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[Lsl;",
		garbageValue = "1209003518"
	)
	public static class491[] method7881() {
		return new class491[]{class491.field5089, class491.field5087, class491.field5088};
	}
}
