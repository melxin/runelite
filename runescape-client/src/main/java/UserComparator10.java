import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ea")
@Implements("UserComparator10")
public class UserComparator10 extends AbstractUserComparator {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lvr;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;
	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	static Archive field1505;
	@ObfuscatedName("ab")
	@Export("reversed")
	final boolean reversed;

	public UserComparator10(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lsi;Lsi;I)I",
		garbageValue = "-1701400289"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) {
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lcu;I)V",
		garbageValue = "-108661919"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) {
			Client.isMembersWorld = var0.isMembersOnly();
			boolean var1 = var0.isMembersOnly();
			if (var1 != ItemComposition.ItemDefinition_inMembersWorld) {
				ItemComposition.ItemDefinition_cached.clear();
				ItemComposition.ItemDefinition_cachedModels.clear();
				ItemComposition.ItemDefinition_cachedSprites.clear();
				ItemComposition.ItemDefinition_inMembersWorld = var1;
			}
		}

		if (var0.properties != Client.worldProperties) {
			Frames.method5162(AttackOption.archive8, var0.properties);
		}

		class172.worldHost = var0.host;
		Client.worldId = var0.id;
		Client.worldProperties = var0.properties;
		class47.field323 = var0.field822;
		class150.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000;
		InvDefinition.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000;
		class372.currentPort = class150.worldPort;
	}
}
