import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cw")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1465889165
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1527879103
	)
	@Export("type")
	int type;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1691331269
	)
	@Export("x")
	int x;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -7912037
	)
	@Export("y")
	int y;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 847037549
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1747226177
	)
	int field1007;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -123256363
	)
	int field992;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1096388433
	)
	int field998;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -912982729
	)
	int field999;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1575345691
	)
	int field1000;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1226895039
	)
	int field1001;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 524219655
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 517473543
	)
	@Export("hitpoints")
	int hitpoints;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 492194811
	)
	int field1004;
	@ObfuscatedName("ac")
	String[] field1005;

	PendingSpawn() {
		this.delay = 0;
		this.hitpoints = -1;
		this.field1004 = 31;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-25"
	)
	void method2456(int var1) {
		this.field1004 = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;I)V",
		garbageValue = "2114463419"
	)
	void method2457(String[] var1) {
		this.field1005 = var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1344631797"
	)
	boolean method2473(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1004 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "89"
	)
	boolean method2459(int var1) {
		return this.field1005 != null && var1 >= 0 && var1 < this.field1005.length && this.field1005[var1] != null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-504336118"
	)
	String method2460(int var1) {
		return this.field1005 != null && var1 >= 0 && var1 < this.field1005.length ? this.field1005[var1] : null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1036292581"
	)
	public static void method2476() {
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
	}
}
