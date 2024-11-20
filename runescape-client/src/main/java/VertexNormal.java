import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jf")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -2134179721
	)
	@Export("x")
	int x;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 2073571793
	)
	@Export("y")
	int y;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1702880519
	)
	@Export("z")
	int z;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1628575481
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	}

	@ObfuscatedSignature(
		descriptor = "(Ljf;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x;
		this.y = var1.y;
		this.z = var1.z;
		this.magnitude = var1.magnitude;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "-7219"
	)
	public static int method5429(int var0) {
		return var0 != 0 && var0 != 1 ? -1 : 0;
	}
}
