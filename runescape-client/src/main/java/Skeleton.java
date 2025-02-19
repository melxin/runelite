import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jg")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1258680517
	)
	@Export("count")
	int count;
	@ObfuscatedName("ao")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("af")
	int[][] field2679;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ljq;"
	)
	class241 field2676;

	public Skeleton(int var1, byte[] var2) {
		Buffer var3 = new Buffer(var2);
		this.count = var3.readUnsignedByte();
		this.transformTypes = new int[this.count];
		this.field2679 = new int[this.count][];

		int var4;
		for (var4 = 0; var4 < this.count; ++var4) {
			this.transformTypes[var4] = var3.readUnsignedByte();
		}

		for (var4 = 0; var4 < this.count; ++var4) {
			this.field2679[var4] = new int[var3.readUnsignedByte()];
		}

		for (var4 = 0; var4 < this.count; ++var4) {
			for (int var5 = 0; var5 < this.field2679[var4].length; ++var5) {
				this.field2679[var4][var5] = var3.readUnsignedByte();
			}
		}

		if (var3.field5570 < var3.field5573.length) {
			var4 = var3.readUnsignedShort();
			if (var4 > 0) {
				this.field2676 = new class241(var3, var4);
			}
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1694021201"
	)
	public int method4899() {
		return this.count;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Ljq;",
		garbageValue = "-30"
	)
	public class241 method4900() {
		return this.field2676;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "-1680902473"
	)
	static byte[] method4903(byte[] var0) {
		int var1 = var0.length;
		byte[] var2 = new byte[var1];
		System.arraycopy(var0, 0, var2, 0, var1);
		return var2;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-44"
	)
	public static boolean method4902() {
		return !class335.field3689.isEmpty();
	}
}
