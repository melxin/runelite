import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cv")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("vc")
	@ObfuscatedGetter(
		intValue = 696445253
	)
	static int field1090;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1516623161
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1917374019
	)
	@Export("health")
	int health;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -969200747
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -498551571
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-873430464"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1425716591"
	)
	public static int method2361(int var0, int var1) {
		return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "133623512"
	)
	public static int method2362(int var0) {
		--var0;
		var0 |= var0 >>> 1;
		var0 |= var0 >>> 2;
		var0 |= var0 >>> 4;
		var0 |= var0 >>> 8;
		var0 |= var0 >>> 16;
		return var0 + 1;
	}
}
