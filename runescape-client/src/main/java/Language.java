import java.util.Iterator;
import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qq")
@Implements("Language")
public class Language implements Enum {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[Lqq;"
	)
	@Export("Language_valuesOrdered")
	static final Language[] Language_valuesOrdered;
	@ObfuscatedName("fn")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	static Client client;
	@ObfuscatedName("lg")
	@ObfuscatedGetter(
		intValue = 1252753073
	)
	@Export("cameraX")
	static int cameraX;
	@ObfuscatedName("ap")
	final String field4981;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1225522277
	)
	@Export("id")
	final int id;
	@ObfuscatedName("ag")
	@Export("language")
	final String language;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field5003, 0, "GB");
		Language_DE = new Language("DE", "de", "German", ModeWhere.field5003, 1, "DE");
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field5003, 2, "FR");
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field5003, 3, "BR");
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field4992, 4, "NL");
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field4992, 5, "ES");
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field5003, 6, "MX");
		Language[] var0 = method8704();
		Language_valuesOrdered = new Language[var0.length];
		Language[] var1 = var0;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			Language var3 = var1[var2];
			if (Language_valuesOrdered[var3.id] != null) {
				throw new IllegalStateException();
			}

			Language_valuesOrdered[var3.id] = var3;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqc;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field4981 = var1;
		this.language = var2;
		this.id = var5;
		if (var6 != null) {
			new Locale(var2.substring(0, 2), var6);
		} else {
			new Locale(var2.substring(0, 2));
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-164877066"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "1"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language;
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)[Lqq;",
		garbageValue = "210968808"
	)
	static Language[] method8704() {
		return new Language[]{Language_EN, Language_ES_MX, Language_NL, Language_DE, Language_ES, Language_PT, Language_FR};
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Lqq;",
		garbageValue = "-1488793007"
	)
	public static Language method8690(int var0) {
		return var0 >= 0 && var0 < Language_valuesOrdered.length ? Language_valuesOrdered[var0] : null;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1154672390"
	)
	static void method8699() {
		Script.Script_cached.clear();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-56"
	)
	static final int method8707(int var0, int var1, int var2) {
		int var3 = var0 / var2;
		int var4 = var0 & var2 - 1;
		int var5 = var1 / var2;
		int var6 = var1 & var2 - 1;
		int var7 = AsyncHttpResponse.method283(var3, var5);
		int var8 = AsyncHttpResponse.method283(var3 + 1, var5);
		int var9 = AsyncHttpResponse.method283(var3, var5 + 1);
		int var10 = AsyncHttpResponse.method283(var3 + 1, var5 + 1);
		int var11 = ReflectionCheck.method757(var7, var8, var4, var2);
		int var12 = ReflectionCheck.method757(var9, var10, var4, var2);
		return ReflectionCheck.method757(var11, var12, var6, var2);
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(Ldj;Lca;IB)V",
		garbageValue = "0"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(WorldView var0, Actor var1, int var2) {
		SequenceDefinition var3;
		int var4;
		int var5;
		int var6;
		int var8;
		int var9;
		int var12;
		if (var1.spotAnimation >= Client.cycle) {
			var12 = Math.max(1, var1.spotAnimation - Client.cycle);
			var4 = var1.size * -821821440 + var1.field1070 * 128;
			var5 = var1.size * -821821440 + var1.field1072 * 128;
			var1.x += (var4 - var1.x) / var12;
			var1.y += (var5 - var1.y) / var12;
			var1.field1085 = 0;
			var1.orientation = var1.field1076;
		} else if (var1.field1075 >= Client.cycle) {
			class516.method10473(var1);
		} else {
			var1.method2383(var1.idleSequence);
			if (var1.pathLength == 0) {
				var1.field1085 = 0;
			} else {
				label577: {
					if (var1.method2386()) {
						var3 = var1.field1065.method9571();
						if (var1.field1086 > 0 && var3.field2438 == 0) {
							++var1.field1085;
							break label577;
						}

						if (var1.field1086 <= 0 && var3.field2439 == 0) {
							++var1.field1085;
							break label577;
						}
					}

					var12 = var1.x;
					var4 = var1.y;
					var5 = var1.size * -821821440 + var1.pathX[var1.pathLength - 1] * 128;
					var6 = var1.pathY[var1.pathLength - 1] * 128 + var1.size * -821821440;
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
						var8 = var1.orientation - var1.rotation & 2047;
						if (var8 > 1024) {
							var8 -= 2048;
						}

						var9 = var1.walkBackSequence;
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

						var1.method2383(var9);
						int var10 = 4;
						boolean var11 = true;
						if (var1 instanceof NPC) {
							var11 = ((NPC)var1).definition.isClipped;
						}

						if (var11) {
							if (var1.orientation != var1.rotation && var1.targetIndex == -1 && var1.field1041 != 0) {
								var10 = 2;
							}

							if (var1.pathLength > 2) {
								var10 = 6;
							}

							if (var1.pathLength > 3) {
								var10 = 8;
							}

							if (var1.field1085 > 0 && var1.pathLength > 1) {
								var10 = 8;
								--var1.field1085;
							}
						} else {
							if (var1.pathLength > 1) {
								var10 = 6;
							}

							if (var1.pathLength > 2) {
								var10 = 8;
							}

							if (var1.field1085 > 0 && var1.pathLength > 1) {
								var10 = 8;
								--var1.field1085;
							}
						}

						if (var7 == MoveSpeed.field3197) {
							var10 <<= 1;
						} else if (var7 == MoveSpeed.field3192) {
							var10 >>= 1;
						}

						if (var10 >= 8) {
							if (var1.method2382() == var1.walkSequence && var1.runSequence != -1) {
								var1.method2383(var1.runSequence);
							} else if (var1.method2382() == var1.walkBackSequence && var1.field1077 != -1) {
								var1.method2383(var1.field1077);
							} else if (var1.method2382() == var1.walkLeftSequence && var1.field1050 != -1) {
								var1.method2383(var1.field1050);
							} else if (var1.method2382() == var1.walkRightSequence && var1.field1051 != -1) {
								var1.method2383(var1.field1051);
							}
						} else if (var10 <= 2) {
							if (var1.method2382() == var1.walkSequence && var1.field1052 != -1) {
								var1.method2383(var1.field1052);
							} else if (var1.method2382() == var1.walkBackSequence && var1.field1020 != -1) {
								var1.method2383(var1.field1020);
							} else if (var1.method2382() == var1.walkLeftSequence && var1.field1061 != -1) {
								var1.method2383(var1.field1061);
							} else if (var1.method2382() == var1.walkRightSequence && var1.field1055 != -1) {
								var1.method2383(var1.field1055);
							}
						}

						if (var5 != var12 || var4 != var6) {
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
							if (var1.field1086 > 0) {
								--var1.field1086;
							}
						}
					} else {
						var1.x = var5;
						var1.y = var6;
						--var1.pathLength;
						if (var1.field1086 > 0) {
							--var1.field1086;
						}
					}
				}
			}
		}

		if (var1.x < 128 || 13184 <= var1.x || var1.y < 128 || 13184 <= var1.y) {
			var1.method2385();
			var1.spotAnimation = 0;
			var1.field1075 = 0;
			var1.clearSpotAnimations();
			var1.x = var1.size * -821821440 + var1.pathX[0] * 128;
			var1.y = var1.pathY[0] * 128 + var1.size * -821821440;
			var1.method2391();
		}

		if (var1 == class27.localPlayer && (var1.x < 1536 || 11776 <= var1.x || var1.y < 1536 || 11776 <= var1.y)) {
			var1.method2385();
			var1.spotAnimation = 0;
			var1.field1075 = 0;
			var1.clearSpotAnimations();
			var1.x = var1.size * -821821440 + var1.pathX[0] * 128;
			var1.y = var1.size * -821821440 + var1.pathY[0] * 128;
			var1.method2391();
		}

		int var18;
		if (var1.targetIndex != -1) {
			var3 = null;
			Actor var13 = null;
			var5 = 65536;
			WorldViewManager var14;
			Iterator var15;
			WorldView var16;
			WorldView var21;
			if (var1.targetIndex < var5) {
				var18 = var1.targetIndex;
				var14 = Client.worldViewManager;
				var15 = var14.iterator();

				WorldView var19;
				while (true) {
					if (var15.hasNext()) {
						var16 = (WorldView)var15.next();
						if (var16.npcs.get((long)var18) == null) {
							continue;
						}

						var19 = var16;
						break;
					}

					var19 = var14.method2314();
					break;
				}

				var21 = var19;
				var13 = (Actor)var19.npcs.get((long)var1.targetIndex);
			} else {
				var6 = var1.targetIndex - var5;
				var14 = Client.worldViewManager;
				var15 = var14.iterator();

				WorldView var24;
				while (true) {
					if (var15.hasNext()) {
						var16 = (WorldView)var15.next();
						Player var17 = (Player)var16.players.get((long)var6);
						if (var17 == null || var16.id == -1) {
							continue;
						}

						var24 = var16;
						break;
					}

					var24 = var14.method2314();
					break;
				}

				var21 = var24;
				var13 = (Actor)var24.players.get((long)var6);
			}

			if (var13 != null) {
				class448 var31 = ClientPreferences.method2599((float)var1.x, 0.0F, (float)var1.y);
				class448 var25;
				if (var0.id != var21.id) {
					WorldEntity var27;
					if (var0.id == -1) {
						var27 = (WorldEntity)class7.topLevelWorldView.worldEntities.get((long)var21.id);
						var25 = var27.method10109(var13.x, var13.y);
					} else if (var21.id == -1) {
						var27 = (WorldEntity)class7.topLevelWorldView.worldEntities.get((long)var0.id);
						var25 = var27.method10110(var13.x, var13.y);
					} else {
						var27 = (WorldEntity)class7.topLevelWorldView.worldEntities.get((long)var21.id);
						WorldEntity var28 = (WorldEntity)class7.topLevelWorldView.worldEntities.get((long)var0.id);
						class448 var29 = var27.method10109(var13.x, var13.y);
						var25 = var28.method10110((int)var29.field5059, (int)var29.field5054);
						var29.method9038();
					}
				} else {
					var25 = ClientPreferences.method2599((float)var13.x, 0.0F, (float)var13.y);
				}

				var8 = (int)(var31.field5059 - var25.field5059);
				var9 = (int)(var31.field5054 - var25.field5054);
				if (var8 != 0 || var9 != 0) {
					var1.orientation = ModeWhere.method8711(var8, var9);
				}

				var31.method9038();
				var25.method9038();
			} else if (var1.false0) {
				var1.targetIndex = -1;
				var1.false0 = false;
			}
		}

		if (var1.pathLength == 0 || var1.field1085 > 0) {
			var12 = -1;
			if (var1.field1062 != -1) {
				var12 = var1.field1062;
			}

			if (var12 != -1) {
				var1.orientation = var12;
				if (var1.field1068) {
					var1.rotation = var1.orientation;
				}
			}

			var1.method2397();
		}

		var12 = var1.orientation - var1.rotation & 2047;
		if (var12 != 0) {
			boolean var22 = true;
			boolean var23 = true;
			++var1.field1079;
			var6 = var12 > 1024 ? -1 : 1;
			var1.rotation += var1.field1041 * var6;
			boolean var30 = true;
			if (var12 < var1.field1041 || var12 > 2048 - var1.field1041) {
				var1.rotation = var1.orientation;
				var30 = false;
			}

			if (var1.field1041 > 0 && var1.method2382() == var1.idleSequence && (var1.field1079 > 25 || var30)) {
				if (var6 == -1 && var1.turnLeftSequence != -1) {
					var1.method2383(var1.turnLeftSequence);
				} else if (var6 == 1 && var1.turnRightSequence != -1) {
					var1.method2383(var1.turnRightSequence);
				} else {
					var1.method2383(var1.walkSequence);
				}
			}

			var1.rotation &= 2047;
		} else {
			if (var1.false0) {
				var1.targetIndex = -1;
				var1.false0 = false;
			}

			var1.field1079 = 0;
		}

		Client.field426.method10913(var0, var1.x, var1.y, var1 == class27.localPlayer);
		var12 = AttackOption.method2764(var1.field1064, 1, Client.field426);
		if ((var12 & 2) != 0) {
			var1.field1064.method9576();
		}

		var1.field1081.method9569(var1.idleSequence);
		if (var1.field1064.method9597() > 0 && var1.field1081.method9597() < 30) {
			if (var1.field1064.method9595() == var1.field1081.method9595()) {
				var1.field1081.method9591(var1.field1064);
			} else {
				var4 = AttackOption.method2764(var1.field1081, 1, (class464)null);
				if ((var4 & 2) != 0) {
					var1.field1081.method9576();
				}
			}
		}

		IterableNodeHashTableIterator var26 = new IterableNodeHashTableIterator(var1.method2404());

		for (class506 var20 = (class506)var26.method8621(); var20 != null; var20 = (class506)var26.next()) {
			if (var20.field5342 != -1 && Client.cycle >= var20.field5339) {
				class465 var32 = var20.field5340;
				if (!var32.method9570()) {
					var20.vmethod10593();
					--var1.graphicsCount;
				} else {
					var18 = AttackOption.method2764(var32, 1, Client.field426);
					if ((var18 & 1) != 0) {
						var20.vmethod10593();
						--var1.graphicsCount;
					}
				}
			}
		}

		if (var1.field1065.method9570() && var1.field1059 <= 1) {
			SequenceDefinition var33 = var1.field1065.method9571();
			if (var33.field2438 == 1 && var1.field1086 > 0 && var1.spotAnimation <= Client.cycle && var1.field1075 < Client.cycle) {
				var1.field1059 = 1;
				return;
			}
		}

		if (var1.field1059 > 0) {
			--var1.field1059;
		} else {
			var5 = AttackOption.method2764(var1.field1065, 1, Client.field426);
			if ((var5 & 2) != 0) {
				var1.field1065.method9604();
			}
		}

		var1.isWalking = var1.field1065.method9570() && var1.field1065.method9571().field2409;
		Client.field426.method10914();
	}
}
