import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("in")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 242744719
	)
	@Export("count")
	int count;
	@ObfuscatedName("ao")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("as")
	@Export("labels")
	int[][] labels;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	class227 field2674;

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

		if (var3.offset * 1216585693 < var3.array.length) {
			var4 = var3.readUnsignedShort();
			if (var4 > 0) {
				this.field2674 = new class227(var3, var4);
			}
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-54"
	)
	public int method5094() {
		return this.count;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lig;",
		garbageValue = "1507591030"
	)
	public class227 method5095() {
		return this.field2674;
	}
}
