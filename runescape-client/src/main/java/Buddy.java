import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("st")
@Implements("Buddy")
public class Buddy extends User {
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 504337945
	)
	@Export("world")
	public int world;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -2133670385
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1034335627
	)
	@Export("rank")
	public int rank;

	Buddy() {
		this.world = -1;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-122412232"
	)
	@Export("set")
	void set(int var1, int var2) {
		this.world = var1;
		this.int2 = var2;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1742868420"
	)
	@Export("getWorld")
	public int getWorld() {
		return this.world;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "102"
	)
	@Export("hasWorld")
	public boolean hasWorld() {
		return this.world > 0;
	}
}
