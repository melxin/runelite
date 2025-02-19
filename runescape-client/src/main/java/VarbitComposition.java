import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("VarbitDefinition_archive")
	public static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("VarbitDefinition_cached")
	public static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("ac")
	static final int[] field2167;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1314595785
	)
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1029926835
	)
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 634373511
	)
	@Export("endBit")
	public int endBit;

	static {
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64);
		field2167 = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			field2167[var1] = var0 - 1;
			var0 += var0;
		}

	}

	VarbitComposition() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvy;B)V",
		garbageValue = "-4"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lvy;IB)V",
		garbageValue = "-12"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.baseVar = var1.readUnsignedShort();
			this.startBit = var1.readUnsignedByte();
			this.endBit = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1409451485"
	)
	public static int method4068(int var0) {
		long var2 = ViewportMouse.ViewportMouse_entityTags[var0];
		int var1 = (int)(var2 >>> 7 & 127L);
		return var1;
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(Ldp;IZS)V",
		garbageValue = "280"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(WorldView var0, int var1, boolean var2) {
		Player var3 = (Player)var0.field1353.method7890((long)var1);
		if (var3 != null && var3.isVisible() && !var3.isHidden) {
			int var4 = var3.plane;
			var3.isUnanimated = false;
			if ((Client.isLowDetail && Client.playerUpdateManager.playerCount > 50 || Client.playerUpdateManager.playerCount > 200) && var2 && var3.field1261 == var3.idleSequence) {
				var3.isUnanimated = true;
			}

			int var5 = var3.x >> 7;
			int var6 = var3.y >> 7;
			if (0 <= var5 && var5 < 104 && 0 <= var6 && var6 < 104) {
				long var7 = HttpRequestTask.calculateTag(0, 0, 0, false, var3.field1271, var0.field1354);
				if (var3.field1147 != null && Client.cycle >= var3.field1143 && Client.cycle < var3.field1144) {
					var3.isUnanimated = false;
					var3.field1142 = DevicePcmPlayerProvider.getTileHeight(var0, var3.x, var3.y, var4);
					var3.field1225 = Client.cycle;
					var0.scene.addNullableObject(var4, var3.x, var3.y, var3.field1142, 60, var3, var3.field1222, var7, var3.field1149, var3.field1150, var3.headIconPk, var3.field1157);
				} else {
					if ((var3.x & 127) == 64 && (var3.y & 127) == 64) {
						if (var0.tileLastDrawnActor[var5][var6] == Client.viewportDrawCount) {
							return;
						}

						var0.tileLastDrawnActor[var5][var6] = Client.viewportDrawCount;
					}

					var3.field1142 = DevicePcmPlayerProvider.getTileHeight(var0, var3.x, var3.y, var4);
					var3.field1225 = Client.cycle;
					var0.scene.drawEntity(var4, var3.x, var3.y, var3.field1142, 60, var3, var3.field1222, var7, var3.field1223);
				}
			}
		}

	}

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "(Ldp;Lvu;I)V",
		garbageValue = "-1162791225"
	)
	static final void method4069(WorldView var0, PacketBuffer var1) {
		var1.importIndex();
		int var2 = var1.readBits(8);
		int var3;
		int var4;
		NPC var5;
		if (var2 < var0.field1355.method9005()) {
			for (var3 = var2; var3 < var0.field1355.method9005(); ++var3) {
				var4 = var0.field1355.method9007(var3);
				Client.field653[++Client.field709 - 1] = var4;
				var5 = (NPC)var0.field1356.method7890((long)var4);
				var5.field1371 = true;
			}
		}

		if (var2 > var0.field1355.method9005()) {
			throw new RuntimeException("");
		} else {
			var0.field1355.method9009();

			for (var3 = 0; var3 < var2; ++var3) {
				var4 = var0.field1355.method9007(var3);
				var5 = (NPC)var0.field1356.method7890((long)var4);
				int var6 = var1.readBits(1);
				if (var6 == 0) {
					var0.field1355.method9006(var4);
				} else {
					int var7 = var1.readBits(2);
					if (var7 == 0) {
						var0.field1355.method9006(var4);
						Client.npcIndices[++Client.npcCount - 1] = var4;
					} else {
						int var8;
						int var9;
						if (var7 == 1) {
							var0.field1355.method9006(var4);
							var8 = var1.readBits(3);
							var5.method2856(var8, MoveSpeed.field3122);
							var9 = var1.readBits(1);
							if (var9 == 1) {
								Client.npcIndices[++Client.npcCount - 1] = var4;
							}
						} else if (var7 == 2) {
							var0.field1355.method9006(var4);
							if (var1.readBits(1) == 1) {
								var8 = var1.readBits(3);
								var5.method2856(var8, MoveSpeed.field3123);
								var9 = var1.readBits(3);
								var5.method2856(var9, MoveSpeed.field3123);
							} else {
								var8 = var1.readBits(3);
								var5.method2856(var8, MoveSpeed.field3128);
							}

							var8 = var1.readBits(1);
							if (var8 == 1) {
								Client.npcIndices[++Client.npcCount - 1] = var4;
							}
						} else if (var7 == 3) {
							Client.field653[++Client.field709 - 1] = var4;
							var5.field1371 = true;
						}
					}
				}
			}

		}
	}
}
