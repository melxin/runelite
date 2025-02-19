import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
@Implements("Occluder")
public final class Occluder {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -153009487
	)
	@Export("minTileX")
	int minTileX;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1250264971
	)
	@Export("maxTileX")
	int maxTileX;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -287717153
	)
	@Export("minTileY")
	int minTileY;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 200962715
	)
	@Export("maxTileY")
	int maxTileY;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1789228277
	)
	@Export("type")
	int type;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1195769427
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 2025500967
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1352278635
	)
	@Export("minZ")
	int minZ;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 61801091
	)
	@Export("maxZ")
	int maxZ;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 400004585
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1000608105
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -535054525
	)
	int field2828;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -548004249
	)
	int field2823;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -40008293
	)
	int field2830;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -627743349
	)
	int field2826;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1162791225
	)
	int field2832;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -375008077
	)
	int field2824;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -81897851
	)
	int field2829;

	Occluder() {
	}

	@ObfuscatedName("ou")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1395152891"
	)
	static void method5202() {
		if (Client.oculusOrbState == 1) {
			Client.field614 = true;
		}

	}
}
