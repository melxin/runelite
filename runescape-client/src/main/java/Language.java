import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pw")
@Implements("Language")
public class Language implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpw;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpw;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpw;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpw;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lpw;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpw;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpw;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[Lpw;"
	)
	@Export("Language_valuesOrdered")
	public static final Language[] Language_valuesOrdered;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	static StudioGame field4687;
	@ObfuscatedName("dd")
	static boolean field4683;
	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	static Archive field4688;
	@ObfuscatedName("us")
	@ObfuscatedGetter(
		intValue = -1509097703
	)
	static int field4677;
	@ObfuscatedName("av")
	final String field4681;
	@ObfuscatedName("au")
	@Export("language")
	final String language;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -278516869
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field4701, 0, "GB");
		Language_DE = new Language("DE", "de", "German", ModeWhere.field4701, 1, "DE");
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field4701, 2, "FR");
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field4701, 3, "BR");
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field4700, 4, "NL");
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field4700, 5, "ES");
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field4701, 6, "MX");
		Language[] var0 = new Language[]{Language_EN, Language_ES, Language_ES_MX, Language_PT, Language_FR, Language_NL, Language_DE};
		Language_valuesOrdered = new Language[var0.length];
		Language[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			Language var4 = var2[var3];
			if (Language_valuesOrdered[var4.id] != null) {
				throw new IllegalStateException();
			}

			Language_valuesOrdered[var4.id] = var4;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpz;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field4681 = var1;
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
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1048337287"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1071289392"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[Lmg;",
		garbageValue = "-593463299"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.NPC_HEADICON_SPECIFIC, ServerPacket.EVENT_WORLDHOP, ServerPacket.CLAN_SETTINGS_FULL, ServerPacket.MINIMAP_TOGGLE, ServerPacket.CAM_SHAKE, ServerPacket.OBJ_ADD, ServerPacket.SET_ACTIVE_WORLD, ServerPacket.IF_SETCOLOUR, ServerPacket.IF_SETHIDE, ServerPacket.CAM_RESET, ServerPacket.IF_RESYNC, ServerPacket.IF_SETMODEL, ServerPacket.RUNCLIENTSCRIPT, ServerPacket.IF_SET_TEXT, ServerPacket.field3456, ServerPacket.field3458, ServerPacket.CAM_LOOKAT_EASED_COORD, ServerPacket.UPDATE_SITE_SETTINGS, ServerPacket.CAM_TARGET, ServerPacket.REFLECTION_CHECKER, ServerPacket.UPDATE_INV_CLEAR, ServerPacket.IF_SETNPCHEAD_ACTIVE, ServerPacket.REBUILD_NORMAL, ServerPacket.SERVER_TICK_END, ServerPacket.REBUILD_WORLDENTITY, ServerPacket.UPDATE_RUN_ENERGY, ServerPacket.VAR_CLAN_ENABLE, ServerPacket.IF_SETNPCHEAD, ServerPacket.MIDI_SONG_WITH_SECONDARY, ServerPacket.SET_PRIVCHATMODE, ServerPacket.UPDATE_UID192, ServerPacket.FRIENDS_LIST_LOADED, ServerPacket.OBJ_COUNT, ServerPacket.PLAYER_SPOTANIM, ServerPacket.field3476, ServerPacket.OBJ_DEL, ServerPacket.MESSAGE_PRIVATE, ServerPacket.HINT_ARROW, ServerPacket.RESET_CLIENT_VARCACHE, ServerPacket.UPDATE_FRIENDLIST, ServerPacket.CLEAR_ENTITIES, ServerPacket.UPDATE_TRADING_POST, ServerPacket.IF_MOVESUB, ServerPacket.UPDATE_ZONE_FULL_FOLLOWS, ServerPacket.CLAN_CHANNEL_FULL, ServerPacket.VARP_SMALL, ServerPacket.PLAYER_INFO, ServerPacket.LOC_DEL, ServerPacket.UPDATE_RUN_WEIGHT, ServerPacket.IF_SETANGLE, ServerPacket.UPDATE_INV_STOP_TRANSIT, ServerPacket.IF_SET_PLAYERMODEL_SELF, ServerPacket.CAM_LOOKAT, ServerPacket.field3495, ServerPacket.UPDATE_STOCKMARKET_SLOT, ServerPacket.CAM_MOVE_TO, ServerPacket.MAP_PROJANIM, ServerPacket.SET_NPC_UPDATE_ORIGIN, ServerPacket.SET_PLAYER_OP, ServerPacket.MESSAGE_CLAN_CHANNEL_SYSTEM, ServerPacket.IF_SETANIM, ServerPacket.IF_SETPOSITION, ServerPacket.UPDATE_ZONE_PARTIAL_FOLLOWS_LEVEL, ServerPacket.CAM_MOVETO, ServerPacket.MIDI_SWAP, ServerPacket.VARP_LARGE, ServerPacket.NPC_SET_SEQUENCE, ServerPacket.IF_SET_PLAYERMODEL_BASECOLOUR, ServerPacket.CAM_MODE, ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED, ServerPacket.TRIGGER_ONDIALOG_ABORT, ServerPacket.SYNC_CLIENT_VARCACHE, ServerPacket.MIDI_SONG_STOP, ServerPacket.REBUILD_REGION, ServerPacket.HEAT_MAP, ServerPacket.MAP_ANIM, ServerPacket.IF_SETOBJECT, ServerPacket.UPDATE_FRIEND_CHAT_CHANNEL_SINGLE_USER, ServerPacket.field3520, ServerPacket.field3462, ServerPacket.RESET_ANIMS, ServerPacket.MIDI_JINGLE, ServerPacket.UPDATE_IGNORELIST, ServerPacket.PLAYER_ANIM_SPECIFIC, ServerPacket.URL_OPEN, ServerPacket.CAM_MOVETO_EASED_CIRCULAR, ServerPacket.MESSAGE_GAME, ServerPacket.IF_SET_EVENTS, ServerPacket.CLAN_SETTINGS_DELTA, ServerPacket.UPDATE_STAT, ServerPacket.CLAN_CHANNEL_DELTA, ServerPacket.CAM_SMOOTH_RESET, ServerPacket.IF_SET_PLAYERMODEL_BODYTYPE, ServerPacket.DYNAMICOBJECT_SPAWN, ServerPacket.CAM_LOOKAT_EASED_ANGLE_RELATIVE, ServerPacket.MINIMAP_FLAG_SET, ServerPacket.CHAT_FILTER_SETTINGS, ServerPacket.NPC_SPOTANIM, ServerPacket.IF_SETPLAYERHEAD, ServerPacket.IF_OPENTOP, ServerPacket.OCULUS_SYNC, ServerPacket.LOC_MERGEPLAYER, ServerPacket.IF_CLOSESUB, ServerPacket.GRAPHICSOBJECT_SPAWN, ServerPacket.MESSAGE_FRIENDS_CHAT, ServerPacket.LOGOUT_FULL, ServerPacket.UPDATE_INV_FULL, ServerPacket.VAR_CLAN_DISABLE, ServerPacket.PROJECTILE_SPAWN, ServerPacket.field3551, ServerPacket.field3471, ServerPacket.UPDATE_REBOOT_TIMER, ServerPacket.IF_SET_ROTATE_SPEED, ServerPacket.field3555, ServerPacket.VAR_CLAN, ServerPacket.PING_STATISTICS_REQUEST, ServerPacket.IF_OPENSUB, ServerPacket.CAM_SETANGLE, ServerPacket.MESSAGE_PRIVATE_ECHO, ServerPacket.LOGOUT, ServerPacket.LOC_ANIM, ServerPacket.IF_SETSCROLLPOS, ServerPacket.field3564, ServerPacket.IF_SET_PLAYERMODEL_OBJ, ServerPacket.UPDATE_INV_PARTIAL, ServerPacket.LOC_ADD_CHANGE, ServerPacket.MIDI_SONG, ServerPacket.OBJ_OPFILTER, ServerPacket.field3457, ServerPacket.RESET_INTERACTION_MODE, ServerPacket.field3572, ServerPacket.OBJ_SET_CUSTOMIZATION, ServerPacket.OBJ_RESET_CUSTOMIZATION, ServerPacket.field3550, ServerPacket.field3576, ServerPacket.field3511};
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lnd;B)V",
		garbageValue = "78"
	)
	public static void method7799(class339 var0) {
		class333.field3628.remove(var0);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ldm;I)V",
		garbageValue = "-199874318"
	)
	static final void method7792(WorldView var0) {
		int var1 = var0.sizeX;
		int var2 = var0.sizeY;
		int[][][] var3 = var0.tileHeights;
		byte[][][] var4 = var0.tileSettings;
		Scene var5 = var0.scene;
		CollisionMap[] var6 = var0.collisionMaps;

		int var7;
		int var8;
		int var9;
		int var10;
		for (var7 = 0; var7 < 4; ++var7) {
			for (var8 = 0; var8 < var1; ++var8) {
				for (var9 = 0; var9 < var2; ++var9) {
					if ((var0.tileSettings[var7][var8][var9] & 1) == 1) {
						var10 = var7;
						if ((var0.tileSettings[1][var8][var9] & 2) == 2) {
							var10 = var7 - 1;
						}

						if (var10 >= 0 && var6 != null) {
							var6[var10].setBlockedByFloor(var8, var9);
						}
					}
				}
			}
		}

		Tiles.rndHue += (int)(Math.random() * 5.0D) - 2;
		if (Tiles.rndHue < -8) {
			Tiles.rndHue = -8;
		}

		if (Tiles.rndHue > 8) {
			Tiles.rndHue = 8;
		}

		Tiles.rndLightness += (int)(Math.random() * 5.0D) - 2;
		if (Tiles.rndLightness < -16) {
			Tiles.rndLightness = -16;
		}

		if (Tiles.rndLightness > 16) {
			Tiles.rndLightness = 16;
		}

		int var14;
		int var15;
		int var16;
		int[] var10000;
		int var17;
		int var18;
		int var19;
		int var20;
		int var21;
		int var22;
		int var23;
		for (var7 = 0; var7 < 4; ++var7) {
			byte[][] var48 = DirectByteArrayCopier.Tiles_underlays2[var7];
			boolean var52 = true;
			boolean var53 = true;
			boolean var11 = true;
			boolean var12 = true;
			boolean var13 = true;
			var14 = (int)Math.sqrt(5100.0D);
			var15 = var14 * 768 >> 8;

			int var24;
			int var25;
			for (var16 = 1; var16 < var2 - 1; ++var16) {
				for (var17 = 1; var17 < var1 - 1; ++var17) {
					var18 = var3[var7][var17 + 1][var16] - var3[var7][var17 - 1][var16];
					var19 = var3[var7][var17][var16 + 1] - var3[var7][var17][var16 - 1];
					var20 = (int)Math.sqrt((double)(var18 * var18 + var19 * var19 + 65536));
					var21 = (var18 << 8) / var20;
					var22 = 65536 / var20;
					var23 = (var19 << 8) / var20;
					var24 = (var21 * -50 + var23 * -50 + var22 * -10) / var15 + 96;
					var25 = (var48[var17][var16 + 1] >> 3) + (var48[var17 - 1][var16] >> 2) + (var48[var17][var16 - 1] >> 2) + (var48[var17 + 1][var16] >> 3) + (var48[var17][var16] >> 1);
					class416.field4723[var17][var16] = var24 - var25;
				}
			}

			for (var16 = 0; var16 < var2; ++var16) {
				HttpRequestTask.Tiles_hue[var16] = 0;
				class208.Tiles_saturation[var16] = 0;
				Tiles.Tiles_lightness[var16] = 0;
				class376.Tiles_hueMultiplier[var16] = 0;
				class229.field2468[var16] = 0;
			}

			for (var16 = -5; var16 < var1 + 5; ++var16) {
				for (var17 = 0; var17 < var2; ++var17) {
					var18 = var16 + 5;
					int var10002;
					if (var18 >= 0 && var18 < var1) {
						var19 = (int)WorldMapData_0.method5775(15);
						var20 = class277.Tiles_underlays[var7][var18][var17] & var19;
						if (var20 > 0) {
							FloorUnderlayDefinition var50 = class254.method5238(var20 - 1);
							var10000 = HttpRequestTask.Tiles_hue;
							var10000[var17] += var50.hue;
							var10000 = class208.Tiles_saturation;
							var10000[var17] += var50.saturation;
							var10000 = Tiles.Tiles_lightness;
							var10000[var17] += var50.lightness;
							var10000 = class376.Tiles_hueMultiplier;
							var10000[var17] += var50.hueMultiplier;
							var10002 = class229.field2468[var17]++;
						}
					}

					var19 = var16 - 5;
					if (var19 >= 0 && var19 < var1) {
						var20 = (int)WorldMapData_0.method5775(15);
						var21 = class277.Tiles_underlays[var7][var19][var17] & var20;
						if (var21 > 0) {
							FloorUnderlayDefinition var51 = class254.method5238(var21 - 1);
							var10000 = HttpRequestTask.Tiles_hue;
							var10000[var17] -= var51.hue;
							var10000 = class208.Tiles_saturation;
							var10000[var17] -= var51.saturation;
							var10000 = Tiles.Tiles_lightness;
							var10000[var17] -= var51.lightness;
							var10000 = class376.Tiles_hueMultiplier;
							var10000[var17] -= var51.hueMultiplier;
							var10002 = class229.field2468[var17]--;
						}
					}
				}

				if (var16 >= 1 && var16 < var1 - 1) {
					var17 = 0;
					var18 = 0;
					var19 = 0;
					var20 = 0;
					var21 = 0;

					for (var22 = -5; var22 < var2 + 5; ++var22) {
						var23 = var22 + 5;
						if (var23 >= 0 && var23 < var2) {
							var17 += HttpRequestTask.Tiles_hue[var23];
							var18 += class208.Tiles_saturation[var23];
							var19 += Tiles.Tiles_lightness[var23];
							var20 += class376.Tiles_hueMultiplier[var23];
							var21 += class229.field2468[var23];
						}

						var24 = var22 - 5;
						if (var24 >= 0 && var24 < var2) {
							var17 -= HttpRequestTask.Tiles_hue[var24];
							var18 -= class208.Tiles_saturation[var24];
							var19 -= Tiles.Tiles_lightness[var24];
							var20 -= class376.Tiles_hueMultiplier[var24];
							var21 -= class229.field2468[var24];
						}

						if (var22 >= 1 && var22 < var2 - 1 && (!Client.isLowDetail || (var4[0][var16][var22] & 2) != 0 || (var4[var7][var16][var22] & 16) == 0)) {
							if (var7 < Tiles.Tiles_minPlane) {
								Tiles.Tiles_minPlane = var7;
							}

							var25 = (int)WorldMapData_0.method5775(15);
							int var26 = class277.Tiles_underlays[var7][var16][var22] & var25;
							int var27 = ModelData0.Tiles_overlays[var7][var16][var22] & var25;
							if (var26 > 0 || var27 > 0) {
								int var28 = var3[var7][var16][var22];
								int var29 = var3[var7][var16 + 1][var22];
								int var30 = var3[var7][var16 + 1][var22 + 1];
								int var31 = var3[var7][var16][var22 + 1];
								int var32 = class416.field4723[var16][var22];
								int var33 = class416.field4723[var16 + 1][var22];
								int var34 = class416.field4723[var16 + 1][var22 + 1];
								int var35 = class416.field4723[var16][var22 + 1];
								int var36 = -1;
								int var37 = -1;
								int var38;
								int var39;
								if (var26 > 0) {
									var38 = var17 * 256 / var20;
									var39 = var18 / var21;
									int var40 = var19 / var21;
									var36 = MoveSpeed.method5741(var38, var39, var40);
									var38 = var38 + Tiles.rndHue & 255;
									var40 += Tiles.rndLightness;
									if (var40 < 0) {
										var40 = 0;
									} else if (var40 > 255) {
										var40 = 255;
									}

									var37 = MoveSpeed.method5741(var38, var39, var40);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var26 == 0 && class110.Tiles_shapes[var7][var16][var22] != 0) {
										var58 = false;
									}

									if (var27 > 0 && !class180.method3751(var27 - 1).hideUnderlay) {
										var58 = false;
									}

									if (var58 && var29 == var28 && var30 == var28 && var28 == var31) {
										var10000 = UserComparator2.field5534[var7][var16];
										var10000[var22] |= 2340;
									}
								}

								var38 = 0;
								if (var37 != -1) {
									var38 = Rasterizer3D.Rasterizer3D_colorPalette[Decimator.method1119(var37, 96)];
								}

								if (var27 == 0) {
									var5.addTile(var7, var16, var22, 0, 0, -1, var28, var29, var30, var31, Decimator.method1119(var36, var32), Decimator.method1119(var36, var33), Decimator.method1119(var36, var34), Decimator.method1119(var36, var35), 0, 0, 0, 0, var38, 0);
								} else {
									var39 = class110.Tiles_shapes[var7][var16][var22] + 1;
									byte var59 = Tiles.field1038[var7][var16][var22];
									FloorOverlayDefinition var41 = class180.method3751(var27 - 1);
									int var42 = var41.texture;
									int var43;
									int var44;
									int var45;
									int var46;
									if (var42 >= 0) {
										var44 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var42);
										var43 = -1;
									} else if (var41.primaryRgb == 16711935) {
										var43 = -2;
										var42 = -1;
										var44 = -2;
									} else {
										var43 = MoveSpeed.method5741(var41.hue, var41.saturation, var41.lightness);
										var45 = var41.hue + Tiles.rndHue & 255;
										var46 = var41.lightness + Tiles.rndLightness;
										if (var46 < 0) {
											var46 = 0;
										} else if (var46 > 255) {
											var46 = 255;
										}

										var44 = MoveSpeed.method5741(var45, var41.saturation, var46);
									}

									var45 = 0;
									if (var44 != -2) {
										var45 = Rasterizer3D.Rasterizer3D_colorPalette[FloorOverlayDefinition.method4256(var44, 96)];
									}

									if (var41.secondaryRgb != -1) {
										var46 = var41.secondaryHue + Tiles.rndHue & 255;
										int var47 = var41.secondaryLightness + Tiles.rndLightness;
										if (var47 < 0) {
											var47 = 0;
										} else if (var47 > 255) {
											var47 = 255;
										}

										var44 = MoveSpeed.method5741(var46, var41.secondarySaturation, var47);
										var45 = Rasterizer3D.Rasterizer3D_colorPalette[FloorOverlayDefinition.method4256(var44, 96)];
									}

									var5.addTile(var7, var16, var22, var39, var59, var42, var28, var29, var30, var31, Decimator.method1119(var36, var32), Decimator.method1119(var36, var33), Decimator.method1119(var36, var34), Decimator.method1119(var36, var35), FloorOverlayDefinition.method4256(var43, var32), FloorOverlayDefinition.method4256(var43, var33), FloorOverlayDefinition.method4256(var43, var34), FloorOverlayDefinition.method4256(var43, var35), var38, var45);
								}
							}
						}
					}
				}
			}

			for (var16 = 1; var16 < var2 - 1; ++var16) {
				for (var17 = 1; var17 < var1 - 1; ++var17) {
					if ((var0.tileSettings[var7][var17][var16] & 8) != 0) {
						var22 = 0;
					} else if (var7 > 0 && (var0.tileSettings[1][var17][var16] & 2) != 0) {
						var22 = var7 - 1;
					} else {
						var22 = var7;
					}

					var5.setTileMinPlane(var7, var17, var16, var22);
				}
			}

			class277.Tiles_underlays[var7] = null;
			ModelData0.Tiles_overlays[var7] = null;
			class110.Tiles_shapes[var7] = null;
			Tiles.field1038[var7] = null;
			DirectByteArrayCopier.Tiles_underlays2[var7] = null;
		}

		var5.method4906(-50, -10, -50);

		for (var7 = 0; var7 < var1; ++var7) {
			for (var8 = 0; var8 < var2; ++var8) {
				if ((var4[1][var7][var8] & 2) == 2) {
					var5.setLinkBelow(var7, var8);
				}
			}
		}

		var7 = 1;
		var8 = 2;
		var9 = 4;

		for (var10 = 0; var10 < 4; ++var10) {
			if (var10 > 0) {
				var7 <<= 3;
				var8 <<= 3;
				var9 <<= 3;
			}

			for (int var54 = 0; var54 <= var10; ++var54) {
				for (int var55 = 0; var55 <= var2; ++var55) {
					for (int var56 = 0; var56 <= var1; ++var56) {
						short var57;
						if ((UserComparator2.field5534[var54][var56][var55] & var7) != 0) {
							var14 = var55;
							var15 = var55;
							var16 = var54;

							for (var17 = var54; var14 > 0 && (UserComparator2.field5534[var54][var56][var14 - 1] & var7) != 0; --var14) {
							}

							while (var15 < var2 && (UserComparator2.field5534[var54][var56][var15 + 1] & var7) != 0) {
								++var15;
							}

							label437:
							while (var16 > 0) {
								for (var18 = var14; var18 <= var15; ++var18) {
									if ((UserComparator2.field5534[var16 - 1][var56][var18] & var7) == 0) {
										break label437;
									}
								}

								--var16;
							}

							label426:
							while (var17 < var10) {
								for (var18 = var14; var18 <= var15; ++var18) {
									if ((UserComparator2.field5534[var17 + 1][var56][var18] & var7) == 0) {
										break label426;
									}
								}

								++var17;
							}

							var18 = (var17 + 1 - var16) * (var15 - var14 + 1);
							if (var18 >= 8) {
								var57 = 240;
								var20 = var3[var17][var56][var14] - var57;
								var21 = var3[var16][var56][var14];
								var5.Scene_addOccluder(var10, 1, var56 * 128, var56 * 128, var14 * 128, var15 * 128 + 128, var20, var21);

								for (var22 = var16; var22 <= var17; ++var22) {
									for (var23 = var14; var23 <= var15; ++var23) {
										var10000 = UserComparator2.field5534[var22][var56];
										var10000[var23] &= ~var7;
									}
								}
							}
						}

						if ((UserComparator2.field5534[var54][var56][var55] & var8) != 0) {
							var14 = var56;
							var15 = var56;
							var16 = var54;

							for (var17 = var54; var14 > 0 && (UserComparator2.field5534[var54][var14 - 1][var55] & var8) != 0; --var14) {
							}

							while (var15 < var1 && (UserComparator2.field5534[var54][var15 + 1][var55] & var8) != 0) {
								++var15;
							}

							label490:
							while (var16 > 0) {
								for (var18 = var14; var18 <= var15; ++var18) {
									if ((UserComparator2.field5534[var16 - 1][var18][var55] & var8) == 0) {
										break label490;
									}
								}

								--var16;
							}

							label479:
							while (var17 < var10) {
								for (var18 = var14; var18 <= var15; ++var18) {
									if ((UserComparator2.field5534[var17 + 1][var18][var55] & var8) == 0) {
										break label479;
									}
								}

								++var17;
							}

							var18 = (var15 - var14 + 1) * (var17 + 1 - var16);
							if (var18 >= 8) {
								var57 = 240;
								var20 = var3[var17][var14][var55] - var57;
								var21 = var3[var16][var14][var55];
								var5.Scene_addOccluder(var10, 2, var14 * 128, var15 * 128 + 128, var55 * 128, var55 * 128, var20, var21);

								for (var22 = var16; var22 <= var17; ++var22) {
									for (var23 = var14; var23 <= var15; ++var23) {
										var10000 = UserComparator2.field5534[var22][var23];
										var10000[var55] &= ~var8;
									}
								}
							}
						}

						if ((UserComparator2.field5534[var54][var56][var55] & var9) != 0) {
							var14 = var56;
							var15 = var56;
							var16 = var55;

							for (var17 = var55; var16 > 0 && (UserComparator2.field5534[var54][var56][var16 - 1] & var9) != 0; --var16) {
							}

							while (var17 < var2 && (UserComparator2.field5534[var54][var56][var17 + 1] & var9) != 0) {
								++var17;
							}

							label543:
							while (var14 > 0) {
								for (var18 = var16; var18 <= var17; ++var18) {
									if ((UserComparator2.field5534[var54][var14 - 1][var18] & var9) == 0) {
										break label543;
									}
								}

								--var14;
							}

							label532:
							while (var15 < var1) {
								for (var18 = var16; var18 <= var17; ++var18) {
									if ((UserComparator2.field5534[var54][var15 + 1][var18] & var9) == 0) {
										break label532;
									}
								}

								++var15;
							}

							if ((var17 - var16 + 1) * (var15 - var14 + 1) >= 4) {
								var18 = var3[var54][var14][var16];
								var5.Scene_addOccluder(var10, 4, var14 * 128, var15 * 128 + 128, var16 * 128, var17 * 128 + 128, var18, var18);

								for (var19 = var14; var19 <= var15; ++var19) {
									for (var20 = var16; var20 <= var17; ++var20) {
										var10000 = UserComparator2.field5534[var54][var19];
										var10000[var20] &= ~var9;
									}
								}
							}
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(Ldm;IIIIIIIIB)V",
		garbageValue = "26"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Scene var9 = var0.scene;
		if (var3 >= 1 && var4 >= 1 && var3 <= var0.sizeX - 1 && var4 <= var0.sizeY - 1) {
			if (Client.isLowDetail && var0.plane != var1) {
				return;
			}

			long var10 = 0L;
			boolean var12 = true;
			boolean var13 = false;
			boolean var14 = false;
			if (var2 == 0) {
				var10 = var9.getBoundaryObjectTag(var1, var3, var4);
			}

			if (var2 == 1) {
				var10 = var9.getWallDecorationTag(var1, var3, var4);
			}

			if (var2 == 2) {
				var10 = var9.getGameObjectTag(var1, var3, var4);
			}

			if (var2 == 3) {
				var10 = var9.getFloorDecorationTag(var1, var3, var4);
			}

			int var15;
			if (var10 != 0L) {
				var15 = var9.getObjectFlags(var1, var3, var4, var10);
				int var42 = class137.Entity_unpackID(var10);
				int var43 = var15 & 31;
				int var44 = var15 >> 6 & 3;
				ObjectComposition var16 = HttpMethod.getObjectDefinition(var42);
				Client.method1865(var1, var3, var4, var16, var44);
				if (var2 == 0) {
					var9.removeBoundaryObject(var1, var3, var4);
					if (var16.interactType != 0) {
						var0.collisionMaps[var1].method5612(var3, var4, var43, var44, var16.boolean1);
					}
				}

				if (var2 == 1) {
					var9.removeWallDecoration(var1, var3, var4);
				}

				if (var2 == 2) {
					var9.removeGameObject(var1, var3, var4);
					if (var3 + var16.sizeX > var0.sizeX - 1 || var4 + var16.sizeX > var0.sizeY - 1 || var3 + var16.sizeY > var0.sizeX - 1 || var4 + var16.sizeY > var0.sizeY - 1) {
						return;
					}

					if (var16.interactType != 0) {
						var0.collisionMaps[var1].setFlagOffNonSquare(var3, var4, var16.sizeX, var16.sizeY, var44, var16.boolean1);
					}
				}

				if (var2 == 3) {
					var9.removeFloorDecoration(var1, var3, var4);
					if (var16.interactType == 1) {
						var0.collisionMaps[var1].method5614(var3, var4);
					}
				}
			}

			if (var5 >= 0) {
				var15 = var1;
				if (var1 < 3 && (var0.tileSettings[1][var3][var4] & 2) == 2) {
					var15 = var1 + 1;
				}

				CollisionMap var45 = var0.collisionMaps[var1];
				ObjectComposition var17 = HttpMethod.getObjectDefinition(var5);
				int var18 = var8 >= 0 ? var8 : var17.animationId;
				int var19;
				int var20;
				if (var6 != 1 && var6 != 3) {
					var19 = var17.sizeX;
					var20 = var17.sizeY;
				} else {
					var19 = var17.sizeY;
					var20 = var17.sizeX;
				}

				int var21;
				int var22;
				if (var3 + var19 <= var0.sizeX) {
					var21 = var3 + (var19 >> 1);
					var22 = var3 + (var19 + 1 >> 1);
				} else {
					var21 = var3;
					var22 = var3 + 1;
				}

				int var23;
				int var24;
				if (var20 + var4 <= var0.sizeY) {
					var23 = (var20 >> 1) + var4;
					var24 = var4 + (var20 + 1 >> 1);
				} else {
					var23 = var4;
					var24 = var4 + 1;
				}

				int[][] var25 = var0.tileHeights[var15];
				int var26 = var25[var22][var24] + var25[var21][var24] + var25[var22][var23] + var25[var21][var23] >> 2;
				int var27 = (var3 << 7) + (var19 << 6);
				int var28 = (var4 << 7) + (var20 << 6);
				Scene var29 = var0.scene;
				long var30 = WorldMapScaleHandler.calculateTag(var3, var4, 2, var17.int1 == 0, var5, var0.id);
				int var32 = (var6 << 6) + var7;
				if (var17.int3 == 1) {
					var32 += 256;
				}

				Object var40;
				if (var7 == 22) {
					if (var18 == -1 && var17.transforms == null) {
						var40 = var17.getModel(22, var6, var25, var27, var26, var28);
					} else {
						var40 = new DynamicObject(var0, var5, 22, var6, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
					}

					var29.newFloorDecoration(var1, var3, var4, var26, (Renderable)var40, var30, var32);
					if (var17.interactType == 1 && var45 != null) {
						var45.setBlockedByFloorDec(var3, var4);
					}
				} else if (var7 != 10 && var7 != 11) {
					if (var7 >= 12) {
						if (var18 == -1 && var17.transforms == null) {
							var40 = var17.getModel(var7, var6, var25, var27, var26, var28);
						} else {
							var40 = new DynamicObject(var0, var5, var7, var6, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
						}

						var29.method4885(var1, var3, var4, var26, 1, 1, (Renderable)var40, 0, var30, var32);
						if (var17.interactType != 0 && var45 != null) {
							var45.addGameObject(var3, var4, var19, var20, var17.boolean1);
						}
					} else if (var7 == 0) {
						if (var18 == -1 && var17.transforms == null) {
							var40 = var17.getModel(0, var6, var25, var27, var26, var28);
						} else {
							var40 = new DynamicObject(var0, var5, 0, var6, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
						}

						var29.newBoundaryObject(var1, var3, var4, var26, (Renderable)var40, (Renderable)null, Tiles.field1037[var6], 0, var30, var32);
						if (var17.interactType != 0 && var45 != null) {
							var45.method5607(var3, var4, var7, var6, var17.boolean1);
						}
					} else if (var7 == 1) {
						if (var18 == -1 && var17.transforms == null) {
							var40 = var17.getModel(1, var6, var25, var27, var26, var28);
						} else {
							var40 = new DynamicObject(var0, var5, 1, var6, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
						}

						var29.newBoundaryObject(var1, var3, var4, var26, (Renderable)var40, (Renderable)null, Tiles.field1047[var6], 0, var30, var32);
						if (var17.interactType != 0 && var45 != null) {
							var45.method5607(var3, var4, var7, var6, var17.boolean1);
						}
					} else {
						int var33;
						if (var7 == 2) {
							var33 = var6 + 1 & 3;
							Object var35;
							Object var41;
							if (var18 == -1 && var17.transforms == null) {
								var41 = var17.getModel(2, var6 + 4, var25, var27, var26, var28);
								var35 = var17.getModel(2, var33, var25, var27, var26, var28);
							} else {
								var41 = new DynamicObject(var0, var5, 2, var6 + 4, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
								var35 = new DynamicObject(var0, var5, 2, var33, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
							}

							var29.newBoundaryObject(var1, var3, var4, var26, (Renderable)var41, (Renderable)var35, Tiles.field1037[var6], Tiles.field1037[var33], var30, var32);
							if (var17.interactType != 0 && var45 != null) {
								var45.method5607(var3, var4, var7, var6, var17.boolean1);
							}
						} else if (var7 == 3) {
							if (var18 == -1 && var17.transforms == null) {
								var40 = var17.getModel(3, var6, var25, var27, var26, var28);
							} else {
								var40 = new DynamicObject(var0, var5, 3, var6, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
							}

							var29.newBoundaryObject(var1, var3, var4, var26, (Renderable)var40, (Renderable)null, Tiles.field1047[var6], 0, var30, var32);
							if (var17.interactType != 0 && var45 != null) {
								var45.method5607(var3, var4, var7, var6, var17.boolean1);
							}
						} else if (var7 == 9) {
							if (var18 == -1 && var17.transforms == null) {
								var40 = var17.getModel(var7, var6, var25, var27, var26, var28);
							} else {
								var40 = new DynamicObject(var0, var5, var7, var6, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
							}

							var29.method4885(var1, var3, var4, var26, 1, 1, (Renderable)var40, 0, var30, var32);
							if (var17.interactType != 0 && var45 != null) {
								var45.addGameObject(var3, var4, var19, var20, var17.boolean1);
							}
						} else if (var7 == 4) {
							if (var18 == -1 && var17.transforms == null) {
								var40 = var17.getModel(4, var6, var25, var27, var26, var28);
							} else {
								var40 = new DynamicObject(var0, var5, 4, var6, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
							}

							var29.newWallDecoration(var1, var3, var4, var26, (Renderable)var40, (Renderable)null, Tiles.field1037[var6], 0, 0, 0, var30, var32);
						} else {
							long var34;
							Object var36;
							if (var7 == 5) {
								var33 = 16;
								var34 = var29.getBoundaryObjectTag(var1, var3, var4);
								if (var34 != 0L) {
									var33 = HttpMethod.getObjectDefinition(class137.Entity_unpackID(var34)).int2;
								}

								if (var18 == -1 && var17.transforms == null) {
									var36 = var17.getModel(4, var6, var25, var27, var26, var28);
								} else {
									var36 = new DynamicObject(var0, var5, 4, var6, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
								}

								var29.newWallDecoration(var1, var3, var4, var26, (Renderable)var36, (Renderable)null, Tiles.field1037[var6], 0, Tiles.field1044[var6] * var33, Tiles.field1045[var6] * var33, var30, var32);
							} else if (var7 == 6) {
								var33 = 8;
								var34 = var29.getBoundaryObjectTag(var1, var3, var4);
								if (0L != var34) {
									var33 = HttpMethod.getObjectDefinition(class137.Entity_unpackID(var34)).int2 / 2;
								}

								if (var18 == -1 && var17.transforms == null) {
									var36 = var17.getModel(4, var6 + 4, var25, var27, var26, var28);
								} else {
									var36 = new DynamicObject(var0, var5, 4, var6 + 4, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
								}

								var29.newWallDecoration(var1, var3, var4, var26, (Renderable)var36, (Renderable)null, 256, var6, Tiles.field1046[var6] * var33, Tiles.field1050[var6] * var33, var30, var32);
							} else if (var7 == 7) {
								int var39 = var6 + 2 & 3;
								if (var18 == -1 && var17.transforms == null) {
									var40 = var17.getModel(4, var39 + 4, var25, var27, var26, var28);
								} else {
									var40 = new DynamicObject(var0, var5, 4, var39 + 4, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
								}

								var29.newWallDecoration(var1, var3, var4, var26, (Renderable)var40, (Renderable)null, 256, var39, 0, 0, var30, var32);
							} else if (var7 == 8) {
								var33 = 8;
								var34 = var29.getBoundaryObjectTag(var1, var3, var4);
								if (var34 != 0L) {
									var33 = HttpMethod.getObjectDefinition(class137.Entity_unpackID(var34)).int2 / 2;
								}

								int var38 = var6 + 2 & 3;
								Object var37;
								if (var18 == -1 && var17.transforms == null) {
									var36 = var17.getModel(4, var6 + 4, var25, var27, var26, var28);
									var37 = var17.getModel(4, var38 + 4, var25, var27, var26, var28);
								} else {
									var36 = new DynamicObject(var0, var5, 4, var6 + 4, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
									var37 = new DynamicObject(var0, var5, 4, var38 + 4, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
								}

								var29.newWallDecoration(var1, var3, var4, var26, (Renderable)var36, (Renderable)var37, 256, var6, Tiles.field1046[var6] * var33, Tiles.field1050[var6] * var33, var30, var32);
							}
						}
					}
				} else {
					if (var18 == -1 && var17.transforms == null) {
						var40 = var17.getModel(10, var6, var25, var27, var26, var28);
					} else {
						var40 = new DynamicObject(var0, var5, 10, var6, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
					}

					if (var40 != null) {
						var29.method4885(var1, var3, var4, var26, var19, var20, (Renderable)var40, var7 == 11 ? 256 : 0, var30, var32);
					}

					if (var17.interactType != 0 && var45 != null) {
						var45.addGameObject(var3, var4, var19, var20, var17.boolean1);
					}
				}

				var17 = HttpMethod.getObjectDefinition(var5);
				if (var17 != null && var17.hasSound()) {
					class202.createObjectSound(var15, var3, var4, var17, var6);
				}
			}
		}

	}
}
