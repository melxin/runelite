import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nu")
class class342 implements ThreadFactory {
	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "Lrv;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	final MidiPcmStream this$0;

	@ObfuscatedSignature(
		descriptor = "(Lnf;)V"
	)
	class342(MidiPcmStream var1) {
		this.this$0 = var1;
	}

	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS WAV Load");
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lpx;III)Lxc;",
		garbageValue = "-1617159462"
	)
	static IndexedSprite method7322(AbstractArchive var0, int var1, int var2) {
		return !class587.method11132(var0, var1, var2) ? null : class447.method8930();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lny;IIIII)Lny;",
		garbageValue = "-350539562"
	)
	public static WidgetConfigNode method7325(WidgetConfigNode var0, int var1, int var2, int var3, int var4) {
		WidgetConfigNode var5 = var0;

		WidgetConfigNode var6;
		for (var6 = null; var5 != null; var5 = var5.nextWidgetConfigNode) {
			if (var5.end >= var1 && var5.start <= var2) {
				if (var6 != null) {
					var6.nextWidgetConfigNode = var5.nextWidgetConfigNode;
				} else {
					var0 = var5.nextWidgetConfigNode;
				}

				WidgetConfigNode var7;
				if (var5.start < var1) {
					var7 = new WidgetConfigNode(var5.start, var1 - 1, var5.clickMask, var5.opMask);
					if (var6 != null) {
						var7.nextWidgetConfigNode = var6.nextWidgetConfigNode;
					} else {
						var7.nextWidgetConfigNode = var0;
					}

					if (var6 != null) {
						var6.nextWidgetConfigNode = var7;
					} else {
						var0 = var7;
					}

					var6 = var7;
				}

				if (var5.end > var2) {
					var7 = new WidgetConfigNode(var2 + 1, var5.end, var5.clickMask, var5.opMask);
					if (var6 != null) {
						var7.nextWidgetConfigNode = var6.nextWidgetConfigNode;
					} else {
						var7.nextWidgetConfigNode = var0;
					}

					if (var6 != null) {
						var6.nextWidgetConfigNode = var7;
					} else {
						var0 = var7;
					}
				}
			}

			var6 = var5;
		}

		var5 = null;

		for (var6 = var0; var6 != null && var6.start <= var1; var6 = var6.nextWidgetConfigNode) {
			var5 = var6;
		}

		var6 = new WidgetConfigNode(var1, var2, var3, var4);
		if (var5 != null) {
			var6.nextWidgetConfigNode = var5.nextWidgetConfigNode;
		} else {
			var6.nextWidgetConfigNode = var0;
		}

		if (var5 != null) {
			var5.nextWidgetConfigNode = var6;
		} else {
			var0 = var6;
		}

		return var0;
	}
}
