import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	@ObfuscatedName("ir")
	@ObfuscatedGetter(
		intValue = 1768568553
	)
	static int field476;
	@ObfuscatedName("kz")
	@ObfuscatedGetter(
		intValue = -634553563
	)
	@Export("cameraZ")
	static int cameraZ;

	ApproximateRouteStrategy() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIILkj;B)Z",
		garbageValue = "82"
	)
	@Export("hasArrived")
	protected boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lcw;I)V",
		garbageValue = "279287509"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) {
			Client.isMembersWorld = var0.isMembersOnly();
			boolean var1 = var0.isMembersOnly();
			if (var1 != class129.ItemDefinition_inMembersWorld) {
				ItemComposition.ItemDefinition_cached.clear();
				ItemComposition.ItemDefinition_cachedModels.clear();
				ItemComposition.ItemDefinition_cachedSprites.clear();
				class129.ItemDefinition_inMembersWorld = var1;
			}
		}

		if (var0.properties != Client.worldProperties) {
			Archive var3 = PendingSpawn.archive8;
			int var2 = var0.properties;
			if ((var2 & class563.field5529.rsOrdinal()) != 0) {
				class87.logoSprite = ClanChannel.SpriteBuffer_getIndexedSpriteByName(var3, "logo_deadman_mode", "");
			} else if ((var2 & class563.field5550.rsOrdinal()) != 0) {
				class87.logoSprite = ClanChannel.SpriteBuffer_getIndexedSpriteByName(var3, "logo_seasonal_mode", "");
			} else if ((var2 & class563.field5528.rsOrdinal()) != 0) {
				class87.logoSprite = ClanChannel.SpriteBuffer_getIndexedSpriteByName(var3, "logo_speedrunning", "");
			} else {
				class87.logoSprite = ClanChannel.SpriteBuffer_getIndexedSpriteByName(var3, "logo", "");
			}
		}

		HttpResponse.worldHost = var0.host;
		Client.worldId = var0.id;
		Client.worldProperties = var0.properties;
		class154.field1752 = var0.field836;
		class132.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000;
		class246.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000;
		Frames.currentPort = class132.worldPort;
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-54"
	)
	static final void method1212() {
		KitDefinition.KitDefinition_archive = null;
		KitDefinition.KitDefinition_modelsArchive = null;
		KitDefinition.KitDefinition_fileCount = 0;
	}
}
