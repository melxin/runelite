import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("ab")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("at")
	@Export("lock")
	Object lock;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 68614331
	)
	@Export("index")
	int index;
	@ObfuscatedName("aj")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("ah")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("af")
	@Export("millis")
	long[] millis;

	MouseRecorder() {
		this.isRunning = true;
		this.lock = new Object();
		this.index = 0;
		this.xs = new int[500];
		this.ys = new int[500];
		this.millis = new long[500];
	}

	public void run() {
		for (; this.isRunning; GrandExchangeOfferOwnWorldComparator.method789(50L)) {
			synchronized(this.lock) {
				if (this.index < 500) {
					this.xs[this.index] = MouseHandler.MouseHandler_x;
					this.ys[this.index] = MouseHandler.MouseHandler_y;
					this.millis[this.index] = MouseHandler.MouseHandler_millis;
					++this.index;
				}
			}
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "656865036"
	)
	static int method2180(int var0, int var1) {
		FloorOverlayDefinition var2 = ClientPreferences.method2731(var0);
		if (var2 == null) {
			return var1;
		} else {
			int var4;
			int var5;
			int var6;
			int var7;
			int var8;
			if (var2.secondaryRgb >= 0) {
				var4 = var2.secondaryHue;
				var5 = var2.secondarySaturation;
				var6 = var2.secondaryLightness;
				if (var6 > 179) {
					var5 /= 2;
				}

				if (var6 > 192) {
					var5 /= 2;
				}

				if (var6 > 217) {
					var5 /= 2;
				}

				if (var6 > 243) {
					var5 /= 2;
				}

				var7 = (var5 / 32 << 7) + var6 / 2 + (var4 / 4 << 10);
				var8 = Skills.method8167(var7, 96);
				return Rasterizer3D.Rasterizer3D_colorPalette[var8] | -16777216;
			} else if (var2.texture >= 0) {
				int var3 = Skills.method8167(Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture), 96);
				return Rasterizer3D.Rasterizer3D_colorPalette[var3] | -16777216;
			} else if (var2.primaryRgb == 16711935) {
				return var1;
			} else {
				var4 = var2.hue;
				var5 = var2.saturation;
				var6 = var2.lightness;
				if (var6 > 179) {
					var5 /= 2;
				}

				if (var6 > 192) {
					var5 /= 2;
				}

				if (var6 > 217) {
					var5 /= 2;
				}

				if (var6 > 243) {
					var5 /= 2;
				}

				var7 = (var5 / 32 << 7) + var6 / 2 + (var4 / 4 << 10);
				var8 = Skills.method8167(var7, 96);
				return Rasterizer3D.Rasterizer3D_colorPalette[var8] | -16777216;
			}
		}
	}

	@ObfuscatedName("oh")
	@ObfuscatedSignature(
		descriptor = "(Lok;I)I",
		garbageValue = "2138577218"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		WidgetConfigNode var1 = (WidgetConfigNode)Client.widgetFlags.get((long)var0.id);
		int var3 = var0.childIndex * -2066937045;
		WidgetConfigNode var4 = var1;

		WidgetConfigNode var2;
		while (true) {
			if (var4 == null) {
				var2 = null;
				break;
			}

			if (var3 >= var4.start && var3 <= var4.end) {
				var2 = var4;
				break;
			}

			var4 = var4.nextWidgetConfigNode;
		}

		return var2 != null ? var2.method7506() : var0.flags;
	}
}
