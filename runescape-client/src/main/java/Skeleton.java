import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("lm")
	@ObfuscatedGetter(
		intValue = -1503822345
	)
	static int field2034;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 974602179
	)
	@Export("count")
	int count;
	@ObfuscatedName("av")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("am")
	@Export("labels")
	int[][] labels;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	class182 field2035;

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

		if (var3.offset * -2066221813 < var3.array.length) {
			var4 = var3.readUnsignedShort();
			if (var4 > 0) {
				this.field2035 = new class182(var3, var4);
			}
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1046596733"
	)
	public int method4041() {
		return this.count;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Lhs;",
		garbageValue = "16"
	)
	public class182 method4046() {
		return this.field2035;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Lkp;",
		garbageValue = "-111"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = (StructComposition)StructComposition.StructDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = StructComposition.StructDefinition_archive.takeFile(34, var0);
			var1 = new StructComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			StructComposition.StructDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldg;",
		garbageValue = "-1240838613"
	)
	static class91[] method4040() {
		return new class91[]{class91.field1107, class91.field1108, class91.field1110, class91.field1112, class91.field1105};
	}
}
