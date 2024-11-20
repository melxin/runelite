import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "[Lvr;"
	)
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1281878903
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 746230633
	)
	@Export("health")
	int health;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 468089283
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1266051079
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
		descriptor = "(IIIIB)V",
		garbageValue = "14"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Lmc;",
		garbageValue = "-1292475441"
	)
	public static PacketBufferNode method2700() {
		PacketBufferNode var0 = Interpreter.method2155();
		var0.clientPacket = null;
		var0.clientPacketLength = 0;
		var0.packetBuffer = new PacketBuffer(5000);
		return var0;
	}
}
