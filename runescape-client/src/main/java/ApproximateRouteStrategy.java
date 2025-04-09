import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	ApproximateRouteStrategy() {
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIILkd;I)Z",
		garbageValue = "-1264400829"
	)
	@Export("hasArrived")
	protected boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lbi;I)V",
		garbageValue = "-411609902"
	)
	public static final void method1230(class51 var0) {
		GameEngine.pcmPlayerProvider = var0;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ILdb;ZB)I",
		garbageValue = "-63"
	)
	static int method1229(int var0, Script var1, boolean var2) {
		return 2;
	}
}
