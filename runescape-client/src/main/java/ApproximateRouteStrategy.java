import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lbq;"
	)
	@Export("soundSystem")
	static SoundSystem soundSystem;
	@ObfuscatedName("ub")
	@ObfuscatedGetter(
		intValue = 1695596837
	)
	static int field474;

	ApproximateRouteStrategy() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIILka;B)Z",
		garbageValue = "-43"
	)
	@Export("hasArrived")
	protected boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpi;Lpi;Lpi;Ljava/util/ArrayList;I)Z",
		garbageValue = "1602906898"
	)
	public static boolean method1208(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, ArrayList var3) {
		class333.field3631 = var0;
		class333.field3623 = var1;
		class333.field3625 = var2;
		class333.field3635 = var3;
		return true;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIII)D",
		garbageValue = "1426827112"
	)
	static double method1203(int var0, int var1, int var2) {
		double var3 = var1 > 0 ? (double)Math.max(0.0F, Math.min(1.0F, (float)var0 / (float)var1)) : 1.0D;
		if (var3 > 0.0D && var3 < 1.0D) {
			double var5;
			double var7;
			switch(var2) {
			case 0:
				return var3;
			case 1:
				return 1.0D - Math.cos(var3 * 3.141592653589793D / 2.0D);
			case 2:
				return Math.sin(var3 * 3.141592653589793D / 2.0D);
			case 3:
				return -(Math.cos(3.141592653589793D * var3) - 1.0D) / 2.0D;
			case 4:
				return var3 * var3;
			case 5:
				return 1.0D - (1.0D - var3) * (1.0D - var3);
			case 6:
				return var3 < 0.5D ? 2.0D * var3 * var3 : 1.0D - Math.pow(2.0D + var3 * -2.0D, 2.0D) / 2.0D;
			case 7:
				return var3 * var3 * var3;
			case 8:
				return 1.0D - Math.pow(1.0D - var3, 3.0D);
			case 9:
				return var3 < 0.5D ? var3 * var3 * 4.0D * var3 : 1.0D - Math.pow(var3 * -2.0D + 2.0D, 3.0D) / 2.0D;
			case 10:
				return var3 * var3 * var3 * var3;
			case 11:
				return 1.0D - Math.pow(1.0D - var3, 4.0D);
			case 12:
				return var3 < 0.5D ? var3 * var3 * 8.0D * var3 * var3 : 1.0D - Math.pow(var3 * -2.0D + 2.0D, 4.0D) / 2.0D;
			case 13:
				return var3 * var3 * var3 * var3 * var3;
			case 14:
				return 1.0D - Math.pow(1.0D - var3, 5.0D);
			case 15:
				return var3 < 0.5D ? var3 * var3 * var3 * 8.0D * var3 * var3 : 1.0D - Math.pow(2.0D + var3 * -2.0D, 5.0D) / 2.0D;
			case 16:
				return Math.pow(2.0D, 10.0D * var3 - 10.0D);
			case 17:
				return 1.0D - Math.pow(2.0D, -10.0D * var3);
			case 18:
				return var3 < 0.5D ? Math.pow(2.0D, 20.0D * var3 + 10.0D) / 2.0D : (2.0D - Math.pow(2.0D, var3 * -20.0D + 10.0D)) / 2.0D;
			case 19:
				return 1.0D - Math.sqrt(1.0D - Math.pow(var3, 2.0D));
			case 20:
				return Math.sqrt(1.0D - Math.pow(var3 - 1.0D, 2.0D));
			case 21:
				return var3 < 0.5D ? (1.0D - Math.sqrt(1.0D - Math.pow(2.0D * var3, 2.0D))) / 2.0D : (Math.sqrt(1.0D - Math.pow(-2.0D * var3 + 2.0D, 2.0D)) + 1.0D) / 2.0D;
			case 22:
				var5 = 1.70158D;
				var7 = 2.70158D;
				return var3 * var3 * 2.70158D * var3 - var3 * 1.70158D * var3;
			case 23:
				var5 = 1.70158D;
				var7 = 2.70158D;
				return 1.0D + 2.70158D * Math.pow(var3 - 1.0D, 3.0D) + 1.70158D * Math.pow(var3 - 1.0D, 2.0D);
			case 24:
				var5 = 1.70158D;
				var7 = 2.5949095D;
				return var3 < 0.5D ? Math.pow(2.0D * var3, 2.0D) * (7.189819D * var3 - 2.5949095D) / 2.0D : (Math.pow(var3 * 2.0D - 2.0D, 2.0D) * (3.5949095D * (var3 * 2.0D - 2.0D) + 2.5949095D) + 2.0D) / 2.0D;
			case 25:
				var5 = 2.0943951023931953D;
				return -Math.pow(2.0D, var3 * 10.0D - 10.0D) * Math.sin((var3 * 10.0D - 10.75D) * 2.0943951023931953D);
			case 26:
				var5 = 2.0943951023931953D;
				return Math.pow(2.0D, var3 * -10.0D) * Math.sin(2.0943951023931953D * (10.0D * var3 - 0.75D)) + 1.0D;
			case 27:
				var5 = 1.3962634015954636D;
				var7 = Math.sin(1.3962634015954636D * (20.0D * var3 - 11.125D));
				return var3 < 0.5D ? -(Math.pow(2.0D, 20.0D * var3 - 10.0D) * var7) / 2.0D : Math.pow(2.0D, 10.0D + -20.0D * var3) * var7 / 2.0D + 1.0D;
			default:
				return var3;
			}
		} else {
			return var3 <= 0.0D ? 0.0D : 1.0D;
		}
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(I)Ltv;",
		garbageValue = "122857459"
	)
	@Export("getPlatformInfo")
	static PlatformInfo getPlatformInfo() {
		return ObjectComposition.platformInfo;
	}
}
