import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kq")
@Implements("MoveSpeed")
public enum MoveSpeed implements Enum {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	field3048((byte)-1, 0.0F),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	field3044((byte)0, 0.5F),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	field3045((byte)1, 1.0F),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	field3046((byte)2, 2.0F),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	field3047((byte)3, 1.5F),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	field3049((byte)4, 2.5F),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	field3050((byte)5, 3.0F),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	field3043((byte)6, 3.5F),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	field3051((byte)7, 4.0F);

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lkq;"
	)
	static MoveSpeed[] field3053;
	@ObfuscatedName("ac")
	@Export("id")
	final byte id;

	static {
		MoveSpeed[] var0 = new MoveSpeed[]{field3049, field3047, field3048, field3044, field3045, field3051, field3050, field3043, field3046};
		field3053 = var0;
		VarpDefinition.method5158();
	}

	@ObfuscatedSignature(
		descriptor = "(BF)V",
		garbageValue = "0.0"
	)
	MoveSpeed(byte var3, float var4) {
		this.id = var3;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "118"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(Ldz;Lda;II)V",
		garbageValue = "214683550"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(WorldView var0, Actor var1, int var2) {
		if (var1.spotAnimation >= Client.cycle) {
			WorldMapSection2.method6018(var1);
		} else if (var1.field1199 >= Client.cycle) {
			class329.method6646(var1);
		} else {
			var1.movementSequence = var1.idleSequence;
			if (var1.pathLength == 0) {
				var1.field1269 = 0;
			} else {
				label334: {
					if (var1.sequence != -1 && var1.sequenceDelay == 0) {
						SequenceDefinition var3 = class33.SequenceDefinition_get(var1.sequence);
						if (var1.field1270 > 0 && var3.field2941 == 0) {
							++var1.field1269;
							break label334;
						}

						if (var1.field1270 <= 0 && var3.field2942 == 0) {
							++var1.field1269;
							break label334;
						}
					}

					int var12 = var1.x;
					int var4 = var1.y;
					int var5 = var1.pathX[var1.pathLength - 1] * 128 + var1.field1268 * 936633408;
					int var6 = var1.pathY[var1.pathLength - 1] * 128 + var1.field1268 * 936633408;
					if (var12 < var5) {
						if (var4 < var6) {
							var1.orientation = 1280;
						} else if (var4 > var6) {
							var1.orientation = 1792;
						} else {
							var1.orientation = 1536;
						}
					} else if (var12 > var5) {
						if (var4 < var6) {
							var1.orientation = 768;
						} else if (var4 > var6) {
							var1.orientation = 256;
						} else {
							var1.orientation = 512;
						}
					} else if (var4 < var6) {
						var1.orientation = 1024;
					} else if (var4 > var6) {
						var1.orientation = 0;
					}

					MoveSpeed var7 = var1.pathTraversed[var1.pathLength - 1];
					if (var5 - var12 <= 256 && var5 - var12 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
						int var8 = var1.orientation - var1.rotation & 2047;
						if (var8 > 1024) {
							var8 -= 2048;
						}

						int var9 = var1.walkBackSequence;
						if (var8 >= -256 && var8 <= 256) {
							var9 = var1.walkSequence;
						} else if (var8 >= 256 && var8 < 768) {
							var9 = var1.walkRightSequence;
						} else if (var8 >= -768 && var8 <= -256) {
							var9 = var1.walkLeftSequence;
						}

						if (var9 == -1) {
							var9 = var1.walkSequence;
						}

						var1.movementSequence = var9;
						int var10 = 4;
						boolean var11 = true;
						if (var1 instanceof NPC) {
							var11 = ((NPC)var1).definition.isClipped;
						}

						if (var11) {
							if (var1.rotation != var1.orientation && var1.targetIndex == -1 && var1.field1200 != 0) {
								var10 = 2;
							}

							if (var1.pathLength > 2) {
								var10 = 6;
							}

							if (var1.pathLength > 3) {
								var10 = 8;
							}

							if (var1.field1269 > 0 && var1.pathLength > 1) {
								var10 = 8;
								--var1.field1269;
							}
						} else {
							if (var1.pathLength > 1) {
								var10 = 6;
							}

							if (var1.pathLength > 2) {
								var10 = 8;
							}

							if (var1.field1269 > 0 && var1.pathLength > 1) {
								var10 = 8;
								--var1.field1269;
							}
						}

						if (var7 == field3046) {
							var10 <<= 1;
						} else if (var7 == field3044) {
							var10 >>= 1;
						}

						if (var10 >= 8) {
							if (var1.walkSequence == var1.movementSequence && var1.runSequence != -1) {
								var1.movementSequence = var1.runSequence;
							} else if (var1.movementSequence == var1.walkBackSequence && var1.field1198 != -1) {
								var1.movementSequence = var1.field1198;
							} else if (var1.movementSequence == var1.walkLeftSequence && var1.field1210 != -1) {
								var1.movementSequence = var1.field1210;
							} else if (var1.movementSequence == var1.walkRightSequence && var1.field1251 != -1) {
								var1.movementSequence = var1.field1251;
							}
						} else if (var10 <= 2) {
							if (var1.movementSequence == var1.walkSequence && var1.field1212 != -1) {
								var1.movementSequence = var1.field1212;
							} else if (var1.movementSequence == var1.walkBackSequence && var1.field1234 != -1) {
								var1.movementSequence = var1.field1234;
							} else if (var1.walkLeftSequence == var1.movementSequence && var1.field1214 != -1) {
								var1.movementSequence = var1.field1214;
							} else if (var1.movementSequence == var1.walkRightSequence && var1.field1220 != -1) {
								var1.movementSequence = var1.field1220;
							}
						}

						if (var12 != var5 || var6 != var4) {
							if (var12 < var5) {
								var1.x += var10;
								if (var1.x > var5) {
									var1.x = var5;
								}
							} else if (var12 > var5) {
								var1.x -= var10;
								if (var1.x < var5) {
									var1.x = var5;
								}
							}

							if (var4 < var6) {
								var1.y += var10;
								if (var1.y > var6) {
									var1.y = var6;
								}
							} else if (var4 > var6) {
								var1.y -= var10;
								if (var1.y < var6) {
									var1.y = var6;
								}
							}
						}

						if (var5 == var1.x && var6 == var1.y) {
							--var1.pathLength;
							if (var1.field1270 > 0) {
								--var1.field1270;
							}
						}
					} else {
						var1.x = var5;
						var1.y = var6;
						--var1.pathLength;
						if (var1.field1270 > 0) {
							--var1.field1270;
						}
					}
				}
			}
		}

		if (var1.x < 128 || 13184 <= var1.x || var1.y < 128 || 13184 <= var1.y) {
			var1.sequence = -1;
			var1.spotAnimation = 0;
			var1.field1199 = 0;
			var1.clearSpotAnimations();
			var1.x = var1.pathX[0] * 128 + var1.field1268 * 936633408;
			var1.y = var1.pathY[0] * 128 + var1.field1268 * 936633408;
			var1.method2774();
		}

		if (var1 == ModeWhere.localPlayer && (var1.x < 1536 || 11776 <= var1.x || var1.y < 1536 || 11776 <= var1.y)) {
			var1.sequence = -1;
			var1.spotAnimation = 0;
			var1.field1199 = 0;
			var1.clearSpotAnimations();
			var1.x = var1.pathX[0] * 128 + var1.field1268 * 936633408;
			var1.y = var1.pathY[0] * 128 + var1.field1268 * 936633408;
			var1.method2774();
		}

		class96.method2710(var0, var1);
		SpotAnimationDefinition.method5375(var1);
	}
}
