import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ba")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	@ObfuscatedName("nq")
	static boolean field226;
	@ObfuscatedName("nn")
	@ObfuscatedSignature(
		descriptor = "Luw;"
	)
	static GraphicsDefaults field225;

	ApproximateRouteStrategy() {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIILkk;B)Z",
		garbageValue = "64"
	)
	@Export("hasArrived")
	protected boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY;
	}

	@ObfuscatedName("at")
	public static String method782(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (0L == var0 % 37L) {
				return null;
			} else {
				int var2 = 0;

				for (long var3 = var0; var3 != 0L; var3 /= 37L) {
					++var2;
				}

				StringBuilder var5 = new StringBuilder(var2);

				while (0L != var0) {
					long var6 = var0;
					var0 /= 37L;
					var5.append(class455.base37Table[(int)(var6 - 37L * var0)]);
				}

				return var5.reverse().toString();
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)[Lcz;",
		garbageValue = "549661167"
	)
	static class67[] method785() {
		return new class67[]{class67.field895, class67.field891, class67.field888, class67.field894, class67.field887, class67.field885, class67.field886};
	}

	@ObfuscatedName("nn")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "10"
	)
	static final int method784() {
		float var0 = 200.0F * ((float)class468.clientPreferences.getBrightness() - 0.5F);
		return 100 - Math.round(var0);
	}
}
