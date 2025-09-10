import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
public class class264 extends class270 {
	@ObfuscatedName("af")
	String field3131;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	final class267 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lkm;Ljava/lang/String;Ljava/lang/String;)V"
	)
	class264(class267 var1, String var2, String var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field3131 = var3;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-11589271"
	)
	public int vmethod6058() {
		return 1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1657302888"
	)
	public String vmethod6059() {
		return this.field3131;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-171654730"
	)
	public static int method5949(int var0, int var1, int var2) {
		var2 &= 3;
		if (var2 == 0) {
			return var0;
		} else if (var2 == 1) {
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 : 7 - var1;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(JJLmx;I)D",
		garbageValue = "-1665603147"
	)
	public static double method5958(long var0, long var2, class337 var4) {
		float var5;
		if (var2 > 0L) {
			float var7 = (float)var0 / (float)var2;
			float var6 = Math.max(0.0F, Math.min(var7, 1.0F));
			var5 = var6;
		} else {
			var5 = 1.0F;
		}

		double var12 = (double)var5;
		if (var12 > 0.0D && var12 < 1.0D) {
			double var8;
			double var10;
			switch(var4.field3874) {
			case 0:
			default:
				return var12;
			case 1:
				return 1.0D - Math.cos(3.141592653589793D * var12 / 2.0D);
			case 2:
				return Math.sin(3.141592653589793D * var12 / 2.0D);
			case 3:
				return -(Math.cos(3.141592653589793D * var12) - 1.0D) / 2.0D;
			case 4:
				return var12 * var12;
			case 5:
				return 1.0D - (1.0D - var12) * (1.0D - var12);
			case 6:
				return var12 < 0.5D ? var12 * 2.0D * var12 : 1.0D - Math.pow(2.0D + -2.0D * var12, 2.0D) / 2.0D;
			case 7:
				return var12 * var12 * var12;
			case 8:
				return 1.0D - Math.pow(1.0D - var12, 3.0D);
			case 9:
				return var12 < 0.5D ? var12 * var12 * 4.0D * var12 : 1.0D - Math.pow(2.0D + -2.0D * var12, 3.0D) / 2.0D;
			case 10:
				return var12 * var12 * var12 * var12;
			case 11:
				return 1.0D - Math.pow(1.0D - var12, 4.0D);
			case 12:
				return var12 < 0.5D ? var12 * var12 * 8.0D * var12 * var12 : 1.0D - Math.pow(var12 * -2.0D + 2.0D, 4.0D) / 2.0D;
			case 13:
				return var12 * var12 * var12 * var12 * var12;
			case 14:
				return 1.0D - Math.pow(1.0D - var12, 5.0D);
			case 15:
				return var12 < 0.5D ? var12 * var12 * var12 * 8.0D * var12 * var12 : 1.0D - Math.pow(var12 * -2.0D + 2.0D, 5.0D) / 2.0D;
			case 16:
				return Math.pow(2.0D, 10.0D * var12 - 10.0D);
			case 17:
				return 1.0D - Math.pow(2.0D, -10.0D * var12);
			case 18:
				return var12 < 0.5D ? Math.pow(2.0D, 10.0D + 20.0D * var12) / 2.0D : (2.0D - Math.pow(2.0D, 10.0D + var12 * -20.0D)) / 2.0D;
			case 19:
				return 1.0D - Math.sqrt(1.0D - Math.pow(var12, 2.0D));
			case 20:
				return Math.sqrt(1.0D - Math.pow(var12 - 1.0D, 2.0D));
			case 21:
				return var12 < 0.5D ? (1.0D - Math.sqrt(1.0D - Math.pow(var12 * 2.0D, 2.0D))) / 2.0D : (Math.sqrt(1.0D - Math.pow(2.0D + var12 * -2.0D, 2.0D)) + 1.0D) / 2.0D;
			case 22:
				var8 = 1.70158D;
				var10 = 2.70158D;
				return var12 * var12 * 2.70158D * var12 - var12 * 1.70158D * var12;
			case 23:
				var8 = 1.70158D;
				var10 = 2.70158D;
				return 1.0D + 2.70158D * Math.pow(var12 - 1.0D, 3.0D) + 1.70158D * Math.pow(var12 - 1.0D, 2.0D);
			case 24:
				var8 = 1.70158D;
				var10 = 2.5949095D;
				return var12 < 0.5D ? Math.pow(2.0D * var12, 2.0D) * (var12 * 7.189819D - 2.5949095D) / 2.0D : (Math.pow(var12 * 2.0D - 2.0D, 2.0D) * (2.5949095D + 3.5949095D * (var12 * 2.0D - 2.0D)) + 2.0D) / 2.0D;
			case 25:
				var8 = 2.0943951023931953D;
				return -Math.pow(2.0D, var12 * 10.0D - 10.0D) * Math.sin((var12 * 10.0D - 10.75D) * 2.0943951023931953D);
			case 26:
				var8 = 2.0943951023931953D;
				return Math.pow(2.0D, var12 * -10.0D) * Math.sin(2.0943951023931953D * (10.0D * var12 - 0.75D)) + 1.0D;
			case 27:
				var8 = 1.3962634015954636D;
				var10 = Math.sin((20.0D * var12 - 11.125D) * 1.3962634015954636D);
				return var12 < 0.5D ? -(Math.pow(2.0D, var12 * 20.0D - 10.0D) * var10) / 2.0D : Math.pow(2.0D, 10.0D + var12 * -20.0D) * var10 / 2.0D + 1.0D;
			}
		} else {
			return var12 <= 0.0D ? 0.0D : 1.0D;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-271206630"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0;
		if (FloatProjection.garbageCollector == null || !FloatProjection.garbageCollector.isValid()) {
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next();
					if (var2.isValid()) {
						FloatProjection.garbageCollector = var2;
						GameEngine.garbageCollectorLastCheckTimeMs = -1L;
						GameEngine.garbageCollectorLastCollectionTime = -1L;
					}
				}
			} catch (Throwable var11) {
			}
		}

		if (FloatProjection.garbageCollector != null) {
			long var9 = class189.method4284();
			long var3 = FloatProjection.garbageCollector.getCollectionTime();
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
}
