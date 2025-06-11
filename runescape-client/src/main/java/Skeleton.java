import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jx")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "[Lwd;"
	)
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1997181401
	)
	@Export("count")
	int count;
	@ObfuscatedName("aa")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("am")
	@Export("labels")
	int[][] labels;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	class242 field2684;

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
				this.field2684 = new class242(var3, var4);
			}
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "654571513"
	)
	public int method5172() {
		return this.count;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Ljp;",
		garbageValue = "-1523283031"
	)
	public class242 method5173() {
		return this.field2684;
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(Ldk;I)V",
		garbageValue = "-1728643350"
	)
	static void method5174(NPC var0) {
		var0.size = var0.definition.size;
		var0.field1079 = var0.definition.rotation;
		var0.walkSequence = var0.definition.walkSequence;
		var0.walkBackSequence = var0.definition.walkBackSequence;
		var0.walkLeftSequence = var0.definition.walkLeftSequence;
		var0.walkRightSequence = var0.definition.walkRightSequence;
		var0.idleSequence = var0.definition.idleSequence;
		var0.turnLeftSequence = var0.definition.turnLeftSequence;
		var0.turnRightSequence = var0.definition.turnRightSequence;
		var0.runSequence = var0.definition.field2047;
		var0.field1043 = var0.definition.field2042;
		var0.field1052 = var0.definition.field2043;
		var0.field1045 = var0.definition.field2044;
		var0.field1046 = var0.definition.field2049;
		var0.field1047 = var0.definition.field2046;
		var0.field1074 = var0.definition.field2029;
		var0.field1038 = var0.definition.field2048;
	}
}
