import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ak")
@Implements("RestClientThreadFactory")
public class RestClientThreadFactory implements ThreadFactory {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 529459537
	)
	public static int field72;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;
	@ObfuscatedName("ul")
	@ObfuscatedGetter(
		intValue = 774686405
	)
	static int field76;
	@ObfuscatedName("ab")
	final ThreadGroup field75;
	@ObfuscatedName("aw")
	final AtomicInteger field71;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	final AsyncRestClient this$0;

	@ObfuscatedSignature(
		descriptor = "(Las;)V"
	)
	RestClientThreadFactory(AsyncRestClient var1) {
		this.this$0 = var1;
		this.field71 = new AtomicInteger(1);
		SecurityManager var2 = System.getSecurityManager();
		this.field75 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
	}

	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field75, var1, this.this$0.threadNamePrefix + "-rest-request-" + this.field71.getAndIncrement(), 0L);
		var2.setDaemon(true);
		var2.setPriority(5);
		return var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpi;IB)Lni;",
		garbageValue = "36"
	)
	static MusicPatch method192(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1);
		return var2 == null ? null : new MusicPatch(var2);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Lvr;",
		garbageValue = "70"
	)
	static SpritePixels method194(int var0, int var1, int var2) {
		return (SpritePixels)WorldMapRegion.WorldMapRegion_cachedSprites.get(AsyncRestClient.method165(var0, var1, var2));
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(Ldi;I)V",
		garbageValue = "-641759980"
	)
	static final void method195(Actor var0) {
		boolean var1 = var0.field1252 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0;
		if (!var1) {
			SequenceDefinition var2 = HealthBarDefinition.SequenceDefinition_get(var0.sequence);
			if (var2 != null && !var2.isCachedModelIdSet()) {
				var1 = var0.sequenceFrameCycle + 1 > var2.frameLengths[var0.sequenceFrame];
			} else {
				var1 = true;
			}
		}

		if (var1) {
			int var8 = var0.field1252 - var0.spotAnimation;
			int var3 = Client.cycle - var0.spotAnimation;
			int var4 = var0.field1199 * -742859456 + var0.field1247 * 128;
			int var5 = var0.field1199 * -742859456 + var0.field1249 * 128;
			int var6 = var0.field1199 * -742859456 + var0.field1248 * 128;
			int var7 = var0.field1199 * -742859456 + var0.field1250 * 128;
			var0.x = (var6 * var3 + var4 * (var8 - var3)) / var8;
			var0.y = (var3 * var7 + var5 * (var8 - var3)) / var8;
		}

		var0.field1269 = 0;
		var0.orientation = var0.field1253;
		var0.rotation = var0.orientation;
	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(Ldm;Ldi;II)V",
		garbageValue = "-1423403727"
	)
	static void method193(WorldView var0, Actor var1, int var2) {
		Coord var3 = var1.method2653(var0);
		int var5 = var1.x;
		int var6 = var1.field1199 * -1018240139 - 1;
		int var4 = var5 + (var6 << 6);
		int var9 = var1.y;
		int var10 = var1.field1199 * -1018240139 - 1;
		int var8 = var9 + (var10 << 6);
		class228.worldToScreen(var0, var3.x, var3.y, var4, var8, var2);
	}
}
