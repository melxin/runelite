import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bn")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("HitSplatDefinition_archive")
	public static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "Lbr;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "Lpw;"
	)
	static Archive field280;

	ApproximateRouteStrategy() {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIILkb;I)Z",
		garbageValue = "164670435"
	)
	@Export("hasArrived")
	protected boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY;
	}
}
