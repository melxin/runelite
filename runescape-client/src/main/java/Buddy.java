import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sl")
@Implements("Buddy")
public class Buddy extends User {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -654684761
	)
	@Export("world")
	public int world;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1974840189
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -727339729
	)
	@Export("rank")
	public int rank;

	Buddy() {
		this.world = -1;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-986901278"
	)
	@Export("set")
	void set(int var1, int var2) {
		this.world = var1;
		this.int2 = var2;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1193390800"
	)
	@Export("getWorld")
	public int getWorld() {
		return this.world;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "446402877"
	)
	@Export("hasWorld")
	public boolean hasWorld() {
		return this.world > 0;
	}
}
