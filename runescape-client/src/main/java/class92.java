import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
public enum class92 implements Enum {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	field1108(0, -1),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	field1102(1, 1),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	field1099(2, 7),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	field1100(3, 8),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	field1097(4, 9);

	@ObfuscatedName("jn")
	@Export("regionMapArchiveIds")
	static int[] regionMapArchiveIds;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1023890417
	)
	final int field1107;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 532784169
	)
	final int field1098;

	class92(int var3, int var4) {
		this.field1107 = var3;
		this.field1098 = var4;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "118"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1098;
	}

	@ObfuscatedName("ah")
	public static String method2641(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (var0 % 37L == 0L) {
				return null;
			} else {
				int var2 = 0;

				for (long var3 = var0; var3 != 0L; var3 /= 37L) {
					++var2;
				}

				StringBuilder var5 = new StringBuilder(var2);

				while (0L != var0) {
					long var6 = var0;
					var0 /= 37L;
					var5.append(class421.base37Table[(int)(var6 - 37L * var0)]);
				}

				return var5.reverse().toString();
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ldz;[BIIIIIIIIIB)V",
		garbageValue = "29"
	)
	static final void method2646(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		CollisionMap[] var11 = var0.collisionMaps;
		int var13;
		if (var11 != null) {
			for (int var12 = 0; var12 < 8; ++var12) {
				for (var13 = 0; var13 < 8; ++var13) {
					if (var3 + var12 > 0 && var3 + var12 < var11[var2].flags.length && var13 + var4 > 0 && var13 + var4 < var11[var2].flags[var3 + var12].length) {
						int[] var10000 = var11[var2].flags[var3 + var12];
						var10000[var13 + var4] &= -1073741825;
					}
				}
			}
		}

		Buffer var30 = new Buffer(var1);

		for (var13 = 0; var13 < 4; ++var13) {
			for (int var14 = 0; var14 < 64; ++var14) {
				for (int var15 = 0; var15 < 64; ++var15) {
					if (var5 == var13 && var14 >= var6 && var14 < var6 + 8 && var15 >= var7 && var15 < var7 + 8) {
						int var18 = var14 & 7;
						int var19 = var15 & 7;
						int var20 = var8 & 3;
						int var17;
						if (var20 == 0) {
							var17 = var18;
						} else if (var20 == 1) {
							var17 = var19;
						} else if (var20 == 2) {
							var17 = 7 - var18;
						} else {
							var17 = 7 - var19;
						}

						int var21 = var3 + var17;
						int var24 = var14 & 7;
						int var25 = var15 & 7;
						int var26 = var8 & 3;
						int var23;
						if (var26 == 0) {
							var23 = var25;
						} else if (var26 == 1) {
							var23 = 7 - var24;
						} else if (var26 == 2) {
							var23 = 7 - var25;
						} else {
							var23 = var24;
						}

						int var27 = var23 + var4;
						int var28 = var3 + (var14 & 7) + var9;
						int var29 = var10 + (var15 & 7) + var4;
						class28.loadTerrain(var0, var30, var2, var21, var27, var28, var29, var8);
					} else {
						class28.loadTerrain(var0, var30, 0, -1, -1, 0, 0, 0);
					}
				}
			}
		}

	}

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(IZZZZI)Lok;",
		garbageValue = "2090910213"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
		ArchiveDisk var5 = null;
		if (JagexCache.JagexCache_dat2File != null) {
			var5 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, UserComparator4.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var5, ReflectionCheck.masterDisk, HitSplatDefinition.field2760, var0, var1, var2, var3, var4, false);
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "686864867"
	)
	static final void method2637() {
		KitDefinition.KitDefinition_archive = null;
		KitDefinition.KitDefinition_modelsArchive = null;
		KitDefinition.KitDefinition_fileCount = 0;
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "5"
	)
	static final void method2645() {
		class374.method7623(HorizontalAlignment.field2603, PcmPlayer.field275, class27.field118);
		GraphicsObject.method2358(FriendSystem.field830, class340.field3703);
		if (Buddy.cameraX == HorizontalAlignment.field2603 && PcmPlayer.field275 == Message.cameraY && class27.field118 == class31.cameraZ && FriendSystem.field830 == class159.cameraPitch && IntProjection.cameraYaw == class340.field3703) {
			Client.field762 = false;
			Client.isCameraLocked = false;
			Client.field669 = false;
			Client.field757 = false;
			class280.field3067 = 0;
			Client.field801 = 0;
			class416.field4710 = 0;
			class383.field4491 = 0;
			HttpQueryParams.field5142 = 0;
			class544.field5398 = 0;
			WorldMapSectionType.field3187 = 0;
			LoginScreenAnimation.field1293 = 0;
			WorldMapAreaData.field3274 = 0;
			class95.field1167 = 0;
			Client.field657 = null;
			Client.field761 = null;
			Client.field725 = null;
		}

	}
}
