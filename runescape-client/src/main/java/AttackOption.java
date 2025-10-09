import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
@Implements("AttackOption")
public enum AttackOption implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	field1210(2),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	field1211(4);

	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1991112439
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1012656358"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ldm;[BIIIIIIIIII)V",
		garbageValue = "1637829027"
	)
	static final void method2881(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		CollisionMap[] var11 = var0.collisionMaps;
		int var13;
		int var14;
		if (var11 != null && var2 >= 0 && var2 < var11.length) {
			CollisionMap var12 = var11[var2];

			for (var13 = var3; var13 < var3 + 8; ++var13) {
				for (var14 = var4; var14 < var4 + 8; ++var14) {
					if (var12.method6182(var13, var14)) {
						var12.method6216(var13, var14, 1073741824);
					}
				}
			}
		}

		Buffer var20 = new Buffer(var1);

		int var15;
		int var16;
		int var17;
		for (var13 = 0; var13 < 4; ++var13) {
			for (var14 = 0; var14 < 64; ++var14) {
				for (var15 = 0; var15 < 64; ++var15) {
					if (var5 == var13 && var14 >= var6 && var14 < var6 + 8 && var15 >= var7 && var15 < var7 + 8) {
						var16 = var3 + AsyncHttpResponse.method278(var14 & 7, var15 & 7, var8);
						var17 = var4 + BufferedSink.method10371(var14 & 7, var15 & 7, var8);
						int var18 = var3 + (var14 & 7) + var9;
						int var19 = var10 + (var15 & 7) + var4;
						HealthBarDefinition.loadTerrain(var0, var20, var2, var16, var17, var18, var19, var8);
					} else {
						HealthBarDefinition.loadTerrain(var0, var20, 0, -1, -1, 0, 0, 0);
					}
				}
			}
		}

		var13 = var20.offset < var20.array.length ? var20.readUnsignedByte() : 0;
		boolean var21 = (var13 & 1) != 0;
		if (var21) {
			for (var15 = 0; var15 < 64; ++var15) {
				for (var16 = 0; var16 < 64; ++var16) {
					while (true) {
						var17 = var20.readUnsignedShort();
						if (var17 == 0) {
							break;
						}

						if (var17 == 1) {
							var20.readUnsignedByte();
							break;
						}

						if (var17 <= 49) {
							var20.readShort();
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "58"
	)
	static void method2876(int var0, int var1, int var2, int var3, int var4, int var5) {
		HealthBarDefinition.field2044 = (var3 + var0) / 2;
		StructComposition.field2267 = (var4 + var1) / 2;
		class114.field1517 = (var5 + var2) / 2;
		LoginType.field5842 = (var3 - var0) / 2;
		class82.field1206 = (var4 - var1) / 2;
		class182.field1981 = (var5 - var2) / 2;
		class139.field1691 = Math.abs(LoginType.field5842);
		LoginState.field291 = Math.abs(class82.field1206);
		class107.field1425 = Math.abs(class182.field1981);
		ViewportMouse.field2955.method9066((float)(var3 - var0), (float)(var4 - var1), (float)(var5 - var2));
		ViewportMouse.field2955.method9070();
		ViewportMouse.ViewportMouse_false0 = true;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)Z",
		garbageValue = "746978829"
	)
	static final boolean method2883(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = ViewportMouse.ViewportMouse_y + var6;
		if (var7 < var0 && var7 < var1 && var7 < var2) {
			return false;
		} else {
			var7 = ViewportMouse.ViewportMouse_y - var6;
			if (var7 > var0 && var7 > var1 && var7 > var2) {
				return false;
			} else {
				var7 = ViewportMouse.ViewportMouse_x + var6;
				if (var7 < var3 && var7 < var4 && var7 < var5) {
					return false;
				} else {
					var7 = ViewportMouse.ViewportMouse_x - var6;
					return var7 <= var3 || var7 <= var4 || var7 <= var5;
				}
			}
		}
	}

	@ObfuscatedName("od")
	@ObfuscatedSignature(
		descriptor = "(Ldm;IIILnt;B)V",
		garbageValue = "33"
	)
	static void method2882(WorldView var0, int var1, int var2, int var3, SpriteMask var4) {
		for (int var5 = 0; var5 < var0.field1169.method9887(); ++var5) {
			NPC var6 = (NPC)var0.npcs.get((long)var0.field1169.method9886(var5));
			if (var6 != null && var6.isVisible()) {
				NPCComposition var7 = var6.definition;
				if (var7 != null && var7.transforms != null) {
					var7 = var7.transform();
				}

				if (var7 != null && var7.drawMapDot && var7.isInteractable) {
					class450 var8 = Varcs.method3022(var0, var6.x, var6.y);
					int var9 = (int)var8.field5216;
					int var10 = (int)var8.field5219;
					var8.method9065();
					int var11 = var9 / 32 - Client.field484 / 32;
					int var12 = var10 / 32 - Client.field377 / 32;
					class445.drawSpriteOnMinimap(var1, var2, var11, var12, var3, class199.field2176[1], var4);
				}
			}
		}

	}
}
