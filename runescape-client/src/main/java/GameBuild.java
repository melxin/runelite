import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("op")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	@Export("LIVE")
	static final GameBuild LIVE;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	@Export("BUILDLIVE")
	static final GameBuild BUILDLIVE;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	@Export("RC")
	static final GameBuild RC;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	@Export("WIP")
	static final GameBuild WIP;
	@ObfuscatedName("gj")
	@ObfuscatedGetter(
		intValue = 1633296427
	)
	static int field4437;
	@ObfuscatedName("ah")
	@Export("name")
	public final String name;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -2084306011
	)
	@Export("buildId")
	public final int buildId;

	static {
		LIVE = new GameBuild("LIVE", 0);
		BUILDLIVE = new GameBuild("BUILDLIVE", 3);
		RC = new GameBuild("RC", 1);
		WIP = new GameBuild("WIP", 2);
	}

	GameBuild(String var1, int var2) {
		this.name = var1;
		this.buildId = var2;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1180647087"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0;
		if (BufferedSink.garbageCollector == null || !BufferedSink.garbageCollector.isValid()) {
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next();
					if (var2.isValid()) {
						BufferedSink.garbageCollector = var2;
						GameEngine.garbageCollectorLastCheckTimeMs = -1L;
						GameEngine.garbageCollectorLastCollectionTime = -1L;
					}
				}
			} catch (Throwable var11) {
			}
		}

		if (BufferedSink.garbageCollector != null) {
			long var9 = class281.method6373();
			long var3 = BufferedSink.garbageCollector.getCollectionTime();
			if (GameEngine.garbageCollectorLastCollectionTime != -1L) {
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime;
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs;
				if (0L != var7) {
					var0 = (int)(100L * var5 / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3;
			GameEngine.garbageCollectorLastCheckTimeMs = var9;
		}

		return var0;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([I[Ljava/lang/Object;III)V",
		garbageValue = "912938172"
	)
	public static void method8194(int[] var0, Object[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			int var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			Object var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;
			int var8 = var6 == Integer.MAX_VALUE ? 0 : 1;

			for (int var9 = var2; var9 < var3; ++var9) {
				if (var0[var9] < (var9 & var8) + var6) {
					int var10 = var0[var9];
					var0[var9] = var0[var5];
					var0[var5] = var10;
					Object var11 = var1[var9];
					var1[var9] = var1[var5];
					var1[var5++] = var11;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method8194(var0, var1, var2, var5 - 1);
			method8194(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)Z",
		garbageValue = "-127"
	)
	static boolean method8193(int var0, int var1, int var2, int var3, int var4, int var5) {
		return UserComparator6.method3659(class32.worldView.plane, var0, var1, var2, var3, var4, var5);
	}
}
