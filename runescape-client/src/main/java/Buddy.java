import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("se")
@Implements("Buddy")
public class Buddy extends User {
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1111657969
	)
	@Export("world")
	public int world;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1144215399
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -540940597
	)
	@Export("rank")
	public int rank;

	Buddy() {
		this.world = -1;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "601035497"
	)
	@Export("set")
	void set(int var1, int var2) {
		this.world = var1;
		this.int2 = var2;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "751229728"
	)
	@Export("getWorld")
	public int getWorld() {
		return this.world;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "16706"
	)
	@Export("hasWorld")
	public boolean hasWorld() {
		return this.world > 0;
	}
}
