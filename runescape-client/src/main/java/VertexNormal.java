import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jh")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 2021150823
	)
	@Export("x")
	int x;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1101315455
	)
	@Export("y")
	int y;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 2035190653
	)
	@Export("z")
	int z;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 757047759
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	}

	@ObfuscatedSignature(
		descriptor = "(Ljh;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x;
		this.y = var1.y;
		this.z = var1.z;
		this.magnitude = var1.magnitude;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lpx;B)V",
		garbageValue = "17"
	)
	public static void method5648(AbstractArchive var0) {
		VarbitComposition.VarbitDefinition_archive = var0;
	}
}
