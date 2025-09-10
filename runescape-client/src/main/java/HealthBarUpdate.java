import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 389094465
	)
	static int field1113;
	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	@Export("localPlayer")
	static Player localPlayer;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 876498697
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1520805869
	)
	@Export("health")
	int health;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1702229519
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1463772141
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "2"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}
}
