import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("to")
@Implements("Buddy")
public class Buddy extends User {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 372329187
	)
	@Export("world")
	public int world;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1604326975
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1073770257
	)
	@Export("rank")
	public int rank;

	Buddy() {
		this.world = -1;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-329272669"
	)
	@Export("set")
	void set(int var1, int var2) {
		this.world = var1;
		this.int2 = var2;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1863516603"
	)
	@Export("getWorld")
	public int getWorld() {
		return this.world;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1008212230"
	)
	@Export("hasWorld")
	public boolean hasWorld() {
		return this.world > 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-947195806"
	)
	public static int method10089(int var0) {
		long var2 = ViewportMouse.ViewportMouse_entityTags[var0];
		int var1 = (int)(var2 >>> 7 & 127L);
		return var1;
	}
}
