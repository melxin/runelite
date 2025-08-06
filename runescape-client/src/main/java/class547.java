import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ve")
public abstract class class547 extends class548 {
	class547(int var1, int var2) {
		super(var1, var2);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	public abstract int vmethod10662();

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "31"
	)
	public abstract int vmethod10660();

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-170491900"
	)
	public abstract int vmethod10654();

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IZIZI)V",
		garbageValue = "-575010336"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (World.World_worlds != null) {
			class567.doWorldSorting(0, World.World_worlds.length - 1, var0, var1, var2, var3);
		}

	}
}
