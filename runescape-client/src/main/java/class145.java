import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
class class145 implements Callable {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	final class146 this$0;
	// $FF: synthetic field
	final int val$workStart;
	// $FF: synthetic field
	final int val$workEnd;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "[Lfg;"
	)
	final class138[] val$curveLoadJobs;

	@ObfuscatedSignature(
		descriptor = "(Lfy;II[Lfg;)V"
	)
	class145(class146 var1, int var2, int var3, class138[] var4) {
		this.this$0 = var1;
		this.val$workStart = var2;
		this.val$workEnd = var3;
		this.val$curveLoadJobs = var4;
	}

	public Object call() {
		for (int var1 = this.val$workStart; var1 < this.val$workEnd; ++var1) {
			this.val$curveLoadJobs[var1].call();
		}

		return null;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "165"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0;
		if (Timer.garbageCollector == null || !Timer.garbageCollector.isValid()) {
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next();
					if (var2.isValid()) {
						Timer.garbageCollector = var2;
						GameEngine.garbageCollectorLastCheckTimeMs = -1L;
						GameEngine.garbageCollectorLastCollectionTime = -1L;
					}
				}
			} catch (Throwable var11) {
			}
		}

		if (Timer.garbageCollector != null) {
			long var9 = ParamComposition.method4708();
			long var3 = Timer.garbageCollector.getCollectionTime();
			if (-1L != GameEngine.garbageCollectorLastCollectionTime) {
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime;
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs;
				if (var7 != 0L) {
					var0 = (int)(var5 * 100L / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3;
			GameEngine.garbageCollectorLastCheckTimeMs = var9;
		}

		return var0;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[Lxt;",
		garbageValue = "-270079415"
	)
	static SpritePixels[] method3902() {
		SpritePixels[] var0 = new SpritePixels[class615.SpriteBuffer_spriteCount];

		for (int var1 = 0; var1 < class615.SpriteBuffer_spriteCount; ++var1) {
			SpritePixels var2 = var0[var1] = new SpritePixels();
			var2.width = class208.SpriteBuffer_spriteWidth;
			var2.height = class144.SpriteBuffer_spriteHeight;
			var2.xOffset = class615.SpriteBuffer_xOffsets[var1];
			var2.yOffset = class615.SpriteBuffer_yOffsets[var1];
			var2.subWidth = IntHashTable.SpriteBuffer_spriteWidths[var1];
			var2.subHeight = class615.SpriteBuffer_spriteHeights[var1];
			int var3 = var2.subHeight * var2.subWidth;
			byte[] var4 = class320.SpriteBuffer_pixels[var1];
			var2.pixels = new int[var3];

			for (int var5 = 0; var5 < var3; ++var5) {
				int var6 = var4[var5] & 255;
				var2.pixels[var5] = BufferedSource.SpriteBuffer_spritePalette[var6];
			}
		}

		class615.SpriteBuffer_xOffsets = null;
		class615.SpriteBuffer_yOffsets = null;
		IntHashTable.SpriteBuffer_spriteWidths = null;
		class615.SpriteBuffer_spriteHeights = null;
		BufferedSource.SpriteBuffer_spritePalette = null;
		class320.SpriteBuffer_pixels = null;
		return var0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-112"
	)
	static boolean method3901(char var0) {
		return "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var0) != -1;
	}
}
