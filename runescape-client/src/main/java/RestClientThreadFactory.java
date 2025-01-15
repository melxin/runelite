import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("al")
@Implements("RestClientThreadFactory")
public class RestClientThreadFactory implements ThreadFactory {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("clock")
	static Clock clock;
	@ObfuscatedName("ay")
	final ThreadGroup field67;
	@ObfuscatedName("ah")
	final AtomicInteger field69;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	final AsyncRestClient this$0;

	@ObfuscatedSignature(
		descriptor = "(Laa;)V"
	)
	RestClientThreadFactory(AsyncRestClient var1) {
		this.this$0 = var1;
		this.field69 = new AtomicInteger(1);
		SecurityManager var2 = System.getSecurityManager();
		this.field67 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
	}

	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field67, var1, this.this$0.threadNamePrefix + "-rest-request-" + this.field69.getAndIncrement(), 0L);
		var2.setDaemon(true);
		var2.setPriority(5);
		return var2;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lpq;III)[Lvi;",
		garbageValue = "591347831"
	)
	public static IndexedSprite[] method213(AbstractArchive var0, int var1, int var2) {
		if (!WorldMapSprite.method6397(var0, var1, var2)) {
			return null;
		} else {
			IndexedSprite[] var4 = new IndexedSprite[SpriteBufferProperties.SpriteBuffer_spriteCount];

			for (int var5 = 0; var5 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var5) {
				IndexedSprite var6 = var4[var5] = new IndexedSprite();
				var6.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
				var6.height = class174.SpriteBuffer_spriteHeight;
				var6.xOffset = class241.SpriteBuffer_xOffsets[var5];
				var6.yOffset = SpriteBufferProperties.SpriteBuffer_yOffsets[var5];
				var6.subWidth = SpriteBufferProperties.SpriteBuffer_spriteWidths[var5];
				var6.subHeight = class403.SpriteBuffer_spriteHeights[var5];
				var6.palette = KeyHandler.SpriteBuffer_spritePalette;
				var6.pixels = class240.SpriteBuffer_pixels[var5];
			}

			class241.SpriteBuffer_xOffsets = null;
			SpriteBufferProperties.SpriteBuffer_yOffsets = null;
			SpriteBufferProperties.SpriteBuffer_spriteWidths = null;
			class403.SpriteBuffer_spriteHeights = null;
			KeyHandler.SpriteBuffer_spritePalette = null;
			class240.SpriteBuffer_pixels = null;
			return var4;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "595905120"
	)
	public static void method209() {
		HealthBarDefinition.HealthBarDefinition_cached.clear();
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear();
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(Ldz;I)V",
		garbageValue = "790177061"
	)
	static final void method208(WorldView var0) {
		for (GraphicsObject var1 = (GraphicsObject)var0.graphicsObjects.last(); var1 != null; var1 = (GraphicsObject)var0.graphicsObjects.previous()) {
			if (var0.plane == var1.plane && !var1.isFinished) {
				if (Client.cycle >= var1.cycleStart) {
					var1.advance(Client.graphicsCycle);
					if (var1.isFinished) {
						var1.remove();
					} else {
						var0.scene.drawEntity(var1.plane, var1.x, var1.y, var1.z, 60, var1, 0, -1L, false);
					}
				}
			} else {
				var1.remove();
			}
		}

	}

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1734456775"
	)
	static final void method211(int var0) {
		if (ClanChannel.widgetDefinition.loadInterface(var0)) {
			Widget[] var1 = ClanChannel.widgetDefinition.Widget_interfaceComponents[var0];

			for (int var2 = 0; var2 < var1.length; ++var2) {
				Widget var3 = var1[var2];
				if (var3 != null) {
					var3.modelFrame = 0;
					var3.modelFrameCycle = 0;
				}
			}

		}
	}
}
