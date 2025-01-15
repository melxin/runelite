import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hu")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -986149625
	)
	@Export("id")
	int id;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 771980369
	)
	@Export("count")
	int count;
	@ObfuscatedName("ax")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("at")
	@Export("labels")
	int[][] labels;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lhn;"
	)
	class184 field1991;

	public Skeleton(int var1, byte[] var2) {
		this.id = var1;
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
				this.field1991 = new class184(var3, var4);
			}
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1958480408"
	)
	public int method4164() {
		return this.count;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Lhn;",
		garbageValue = "11"
	)
	public class184 method4168() {
		return this.field1991;
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "21389"
	)
	static final boolean method4171() {
		return Client.isMenuOpen;
	}

	@ObfuscatedName("ov")
	@ObfuscatedSignature(
		descriptor = "([BII)V",
		garbageValue = "904018870"
	)
	static void method4172(byte[] var0, int var1) {
		if (Client.randomDatData == null) {
			Client.randomDatData = new byte[24];
		}

		class451.writeRandomDat(var0, var1, Client.randomDatData, 0, 24);
	}
}
