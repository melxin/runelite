import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "Ldr;"
	)
	static WorldView field2978;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1325188909
	)
	@Export("x")
	int x;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1711867357
	)
	@Export("y")
	int y;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1576361895
	)
	@Export("z")
	int z;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 2029642655
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	}

	@ObfuscatedSignature(
		descriptor = "(Lje;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x;
		this.y = var1.y;
		this.z = var1.z;
		this.magnitude = var1.magnitude;
	}
}
