import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ip")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 857920721
	)
	@Export("count")
	int count;
	@ObfuscatedName("ae")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("aq")
	@Export("labels")
	int[][] labels;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	class226 field2679;

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

		if (var3.offset < var3.array.length) {
			var4 = var3.readUnsignedShort();
			if (var4 > 0) {
				this.field2679 = new class226(var3, var4);
			}
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1225850290"
	)
	public int method5152() {
		return this.count;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Lii;",
		garbageValue = "7"
	)
	public class226 method5147() {
		return this.field2679;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(FFFFLfu;I)V",
		garbageValue = "-920807804"
	)
	static void method5146(float var0, float var1, float var2, float var3, class137 var4) {
		float var5 = var1 - var0;
		float var6 = var2 - var1;
		float var7 = var3 - var2;
		float var8 = var6 - var5;
		var4.field1662 = var7 - var6 - var8;
		var4.field1667 = var8 + var8 + var8;
		var4.field1657 = var5 + var5 + var5;
		var4.field1664 = var0;
	}
}
