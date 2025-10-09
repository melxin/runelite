import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	static Archive field1023;
	@ObfuscatedName("pc")
	@ObfuscatedSignature(
		descriptor = "[Lxc;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1246535827
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -2084342841
	)
	@Export("type")
	int type;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1120115229
	)
	@Export("x")
	int x;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -415042087
	)
	@Export("y")
	int y;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -186853367
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -246777475
	)
	int field1011;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 847903801
	)
	int field1012;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1545330595
	)
	int field1025;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1219776691
	)
	int field1019;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1418182061
	)
	int field1015;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1413251517
	)
	int field1009;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 949173411
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1077543053
	)
	@Export("hitpoints")
	int hitpoints;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -2122542349
	)
	int field1008;
	@ObfuscatedName("az")
	String[] field1020;

	PendingSpawn() {
		this.delay = 0;
		this.hitpoints = -1;
		this.field1008 = 31;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1516724090"
	)
	void method2427(int var1) {
		this.field1008 = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;B)V",
		garbageValue = "91"
	)
	void method2426(String[] var1) {
		this.field1020 = var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "841241458"
	)
	boolean method2429(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1008 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1713930980"
	)
	boolean method2430(int var1) {
		return this.field1020 != null && var1 >= 0 && var1 < this.field1020.length && this.field1020[var1] != null;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "7"
	)
	String method2431(int var1) {
		return this.field1020 != null && var1 >= 0 && var1 < this.field1020.length ? this.field1020[var1] : null;
	}
}
