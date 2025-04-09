import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("ig")
	static Iterator field1208;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1575427197
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 272621353
	)
	@Export("type")
	int type;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1618527891
	)
	@Export("x")
	int x;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -467138871
	)
	@Export("y")
	int y;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -19075741
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -902870055
	)
	int field1198;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 103645929
	)
	int field1199;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 908337675
	)
	int field1200;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -825251557
	)
	int field1201;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1203107331
	)
	int field1204;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1904836213
	)
	int field1207;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -242785355
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1423170841
	)
	@Export("hitpoints")
	int hitpoints;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1657770637
	)
	int field1192;
	@ObfuscatedName("al")
	String[] field1202;

	PendingSpawn() {
		this.delay = 0;
		this.hitpoints = -1;
		this.field1192 = 31;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "5"
	)
	void method2620(int var1) {
		this.field1192 = var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;B)V",
		garbageValue = "113"
	)
	void method2618(String[] var1) {
		this.field1202 = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-37"
	)
	boolean method2622(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1192 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1405501473"
	)
	boolean method2634(int var1) {
		return this.field1202 != null && var1 >= 0 && var1 < this.field1202.length && this.field1202[var1] != null;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1587892207"
	)
	String method2621(int var1) {
		return this.field1202 != null && var1 >= 0 && var1 < this.field1202.length ? this.field1202[var1] : null;
	}
}
