import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hp")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements Enum {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	field2089(2, 0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(0, 1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	field2088(1, 2);

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "Lpw;"
	)
	static Archive field2091;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1646399517
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 173630741
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1935172756"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1168196192"
	)
	public static void method4316() {
		FileSystem.FileSystem_cacheFiles.clear();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Z",
		garbageValue = "34"
	)
	static final boolean method4320(byte[] var0, int var1, int var2) {
		boolean var3 = true;
		Buffer var4 = new Buffer(var0);
		int var5 = -1;

		label72:
		while (true) {
			int var6 = var4.readIncrSmallSmart();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;

			while (true) {
				int var9;
				while (!var8) {
					var9 = var4.readShortSmartSub();
					if (var9 == 0) {
						continue label72;
					}

					var7 += var9 - 1;
					int var10 = var7 & 63;
					int var11 = var7 >> 6 & 63;
					int var12 = var4.readUnsignedByte() >> 2;
					int var13 = var11 + var1;
					int var14 = var10 + var2;
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) {
						ObjectComposition var15 = ModeWhere.getObjectDefinition(var5);
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) {
							if (!var15.needsModelFiles()) {
								++Client.field329;
								var3 = false;
							}

							var8 = true;
						}
					}
				}

				var9 = var4.readShortSmartSub();
				if (var9 == 0) {
					break;
				}

				var4.readUnsignedByte();
			}
		}
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(Ldt;B)V",
		garbageValue = "52"
	)
	static void method4319(NPC var0) {
		var0.size = var0.definition.size * 64;
		var0.field1099 = var0.definition.rotation;
		var0.walkSequence = var0.definition.walkSequence;
		var0.walkBackSequence = var0.definition.walkBackSequence;
		var0.walkLeftSequence = var0.definition.walkLeftSequence;
		var0.walkRightSequence = var0.definition.walkRightSequence;
		var0.idleSequence = var0.definition.idleSequence;
		var0.turnLeftSequence = var0.definition.turnLeftSequence;
		var0.turnRightSequence = var0.definition.turnRightSequence;
		var0.runSequence = var0.definition.field2121;
		var0.field1068 = var0.definition.field2133;
		var0.field1065 = var0.definition.field2155;
		var0.field1090 = var0.definition.field2124;
		var0.field1071 = var0.definition.field2125;
		var0.field1069 = var0.definition.field2126;
		var0.field1061 = var0.definition.field2115;
		var0.field1105 = var0.definition.field2122;
	}
}
