import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jc")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	static Archive field2836;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1593543125
	)
	@Export("count")
	int count;
	@ObfuscatedName("ak")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("aw")
	@Export("labels")
	int[][] labels;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ljq;"
	)
	class251 field2831;

	public Skeleton(int var1, byte[] var2) {
		Buffer var3 = new Buffer(var2);
		this.count = var3.readUnsignedByte();
		this.transformTypes = new int[this.count];
		this.labels = new int[this.count][];

		int var4;
		for (var4 = 0; var4 < this.count; ++var4) {
			this.transformTypes[var4] = var3.readUnsignedByte();
		}

		for (var4 = 0; var4 < this.count; ++var4) {
			this.labels[var4] = new int[var3.readUnsignedByte()];
		}

		for (var4 = 0; var4 < this.count; ++var4) {
			for (int var5 = 0; var5 < this.labels[var4].length; ++var5) {
				this.labels[var4][var5] = var3.readUnsignedByte();
			}
		}

		if (var3.offset * 2108391709 < var3.array.length) {
			var4 = var3.readUnsignedShort();
			if (var4 > 0) {
				this.field2831 = new class251(var3, var4);
			}
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-10"
	)
	public int method5544() {
		return this.count;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Ljq;",
		garbageValue = "-510419997"
	)
	public class251 method5545() {
		return this.field2831;
	}
}
