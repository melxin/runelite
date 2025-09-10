import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ty")
@Implements("Buddy")
public class Buddy extends User {
	@ObfuscatedName("vm")
	@ObfuscatedGetter(
		intValue = -101585215
	)
	static int field5413;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 584845755
	)
	@Export("world")
	public int world;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 500734603
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 440043511
	)
	@Export("rank")
	public int rank;

	Buddy() {
		this.world = -21363 * 584845755;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1080849893"
	)
	@Export("set")
	void set(int var1, int var2) {
		this.world = var1 * 21363 * 584845755;
		this.int2 = var2;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "71"
	)
	@Export("getWorld")
	public int getWorld() {
		return this.world;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "57"
	)
	@Export("hasWorld")
	public boolean hasWorld() {
		return this.world > 0;
	}
}
