import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cm")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = -1977504741
	)
	static int field1098;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1925944051
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1984338053
	)
	@Export("health")
	int health;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1764641457
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1245082597
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-618496349"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}
}
