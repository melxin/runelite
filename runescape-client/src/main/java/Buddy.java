import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("su")
@Implements("Buddy")
public class Buddy extends User {
	@ObfuscatedName("ko")
	@ObfuscatedGetter(
		intValue = 130611919
	)
	@Export("cameraX")
	static int cameraX;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -609922555
	)
	@Export("world")
	public int world;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1806970475
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 364975233
	)
	@Export("rank")
	public int rank;

	Buddy() {
		this.world = -1;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "391643508"
	)
	@Export("set")
	void set(int var1, int var2) {
		this.world = var1;
		this.int2 = var2;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "29"
	)
	@Export("getWorld")
	public int getWorld() {
		return this.world;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "11"
	)
	@Export("hasWorld")
	public boolean hasWorld() {
		return this.world > 0;
	}
}
