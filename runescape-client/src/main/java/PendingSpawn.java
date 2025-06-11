import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "Lgd;"
	)
	@Export("guestClanChannel")
	static ClanChannel guestClanChannel;
	@ObfuscatedName("lx")
	@ObfuscatedGetter(
		intValue = -896334133
	)
	static int field992;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1209225183
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 2100731413
	)
	@Export("type")
	int type;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 55581095
	)
	@Export("x")
	int x;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1626548053
	)
	@Export("y")
	int y;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1164039879
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -166971769
	)
	int field1000;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -968275809
	)
	int field999;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 895143665
	)
	int field1008;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1823725945
	)
	int field1001;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 762403611
	)
	int field1002;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -99312829
	)
	int field1003;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1217862617
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1567800059
	)
	@Export("hitpoints")
	int hitpoints;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1501047539
	)
	int field1006;
	@ObfuscatedName("az")
	String[] field1007;

	PendingSpawn() {
		this.delay = 0;
		this.hitpoints = -1;
		this.field1006 = 31;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "4"
	)
	void method2278(int var1) {
		this.field1006 = var1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;I)V",
		garbageValue = "-1655417762"
	)
	void method2292(String[] var1) {
		this.field1007 = var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-833030301"
	)
	boolean method2282(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1006 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "269484304"
	)
	boolean method2281(int var1) {
		return this.field1007 != null && var1 >= 0 && var1 < this.field1007.length && this.field1007[var1] != null;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1924785581"
	)
	String method2277(int var1) {
		return this.field1007 != null && var1 >= 0 && var1 < this.field1007.length ? this.field1007[var1] : null;
	}
}
