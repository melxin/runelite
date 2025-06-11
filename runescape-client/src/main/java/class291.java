import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lg")
public class class291 {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1853390031"
	)
	public static void method6522() {
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lbg;I)V",
		garbageValue = "1938024718"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) {
			Client.isMembersWorld = var0.isMembersOnly();
			ObjectComposition.method4445(var0.isMembersOnly());
		}

		if (var0.properties != Client.worldProperties) {
			class378.method7920(GrandExchangeOfferAgeComparator.archive8, var0.properties);
		}

		RouteStrategy.worldHost = var0.host;
		Client.worldId = var0.id;
		Client.worldProperties = var0.properties;
		class399.field4678 = var0.field626;
		class30.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000;
		class338.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000;
		FloatProjection.currentPort = class30.worldPort;
	}
}
