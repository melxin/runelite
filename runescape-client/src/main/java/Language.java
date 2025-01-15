import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ph")
@Implements("Language")
public class Language implements Enum {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lph;"
	)
	@Export("Language_valuesOrdered")
	public static final Language[] Language_valuesOrdered;
	@ObfuscatedName("cq")
	static String field4674;
	@ObfuscatedName("ax")
	final String field4670;
	@ObfuscatedName("at")
	@Export("language")
	final String language;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1375478211
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field4684, 0, "GB");
		Language_DE = new Language("DE", "de", "German", ModeWhere.field4684, 1, "DE");
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field4684, 2, "FR");
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field4684, 3, "BR");
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field4681, 4, "NL");
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field4681, 5, "ES");
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field4684, 6, "MX");
		Language[] var0 = method7969();
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
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpg;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field4670 = var1;
		this.language = var2;
		this.id = var5;
		if (var6 != null) {
			new Locale(var2.substring(0, 2), var6);
		} else {
			new Locale(var2.substring(0, 2));
		}

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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-439268539"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language;
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[Lph;",
		garbageValue = "-1245891173"
	)
	static Language[] method7969() {
		return new Language[]{Language_FR, Language_ES, Language_PT, Language_EN, Language_DE, Language_ES_MX, Language_NL};
	}

	@ObfuscatedName("ah")
	static boolean method7967(long var0) {
		int var2 = (int)(var0 >>> 14 & 3L);
		return var2 == 2;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ldz;[BIIIII)V",
		garbageValue = "1521949636"
	)
	static final void method7975(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5) {
		int var7;
		int var8;
		if (var0.collisionMaps != null) {
			for (int var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 64; ++var7) {
					for (var8 = 0; var8 < 64; ++var8) {
						if (var7 + var2 > 0 && var7 + var2 < var0.collisionMaps[var6].flags.length && var3 + var8 > 0 && var3 + var8 < var0.collisionMaps[var6].flags[var7 + var2].length) {
							int[] var10000 = var0.collisionMaps[var6].flags[var7 + var2];
							var10000[var8 + var3] &= -1073741825;
						}
					}
				}
			}
		}

		Buffer var12 = new Buffer(var1);

		for (var7 = 0; var7 < 4; ++var7) {
			for (var8 = 0; var8 < 64; ++var8) {
				for (int var9 = 0; var9 < 64; ++var9) {
					int var10 = var8 + var2;
					int var11 = var3 + var9;
					class28.loadTerrain(var0, var12, var7, var10, var11, var10 + var4, var5 + var11, 0);
				}
			}
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lcx;I)V",
		garbageValue = "-1719770110"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) {
			Client.isMembersWorld = var0.isMembersOnly();
			class267.method5746(var0.isMembersOnly());
		}

		if (var0.properties != Client.worldProperties) {
			Archive var1 = PcmPlayer.archive8;
			int var2 = var0.properties;
			if ((var2 & class552.field5431.rsOrdinal()) != 0) {
				Login.logoSprite = AttackOption.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "");
			} else if ((var2 & class552.field5456.rsOrdinal()) != 0) {
				Login.logoSprite = AttackOption.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "");
			} else if ((var2 & class552.field5441.rsOrdinal()) != 0) {
				Login.logoSprite = AttackOption.SpriteBuffer_getIndexedSpriteByName(var1, "logo_speedrunning", "");
			} else {
				Login.logoSprite = AttackOption.SpriteBuffer_getIndexedSpriteByName(var1, "logo", "");
			}
		}

		FontName.worldHost = var0.host;
		Client.worldId = var0.id;
		Client.worldProperties = var0.properties;
		class255.field2724 = var0.field819;
		PlayerComposition.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000;
		class173.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000;
		class340.currentPort = PlayerComposition.worldPort;
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(Ldz;I)V",
		garbageValue = "-706406186"
	)
	static final void method7980(WorldView var0) {
		for (Projectile var1 = (Projectile)var0.projectiles.last(); var1 != null; var1 = (Projectile)var0.projectiles.previous()) {
			if (var0.plane == var1.plane && Client.cycle <= var1.cycleEnd) {
				if (Client.cycle >= var1.cycleStart) {
					NPC var2;
					int var3;
					Player var4;
					if (!var1.isMoving && var1.field975 != 0) {
						if (var1.field975 > 0) {
							var2 = class30.worldView.npcs[var1.field975 - 1];
							if (var2 != null && 0 <= var2.x && var2.x < 13312 && 0 <= var2.y && var2.y < 13312) {
								var1.sourceX = var2.x;
								var1.sourceY = var2.y;
								var1.setDestination(var1.field985, var1.field967, var1.field964, Client.cycle);
							}
						} else {
							var3 = -var1.field975 - 1;
							if (var3 == Client.localPlayerIndex) {
								var4 = ModeWhere.localPlayer;
							} else {
								var4 = class30.worldView.players[var3];
							}

							if (var4 != null && 0 <= var4.x && var4.x < 13312 && 0 <= var4.y && var4.y < 13312) {
								var1.sourceX = var4.x;
								var1.sourceY = var4.y;
								var1.setDestination(var1.field985, var1.field967, var1.field964, Client.cycle);
							}
						}
					}

					if (var1.targetIndex > 0) {
						var2 = var0.npcs[var1.targetIndex - 1];
						if (var2 != null && 0 <= var2.x && var2.x < 13312 && 0 <= var2.y && var2.y < 13312) {
							var1.setDestination(var2.x, var2.y, Canvas.getTileHeight(var0, var2.x, var2.y, var1.plane) - var1.endHeight, Client.cycle);
						}
					}

					if (var1.targetIndex < 0) {
						var3 = -var1.targetIndex - 1;
						if (var3 == Client.localPlayerIndex) {
							var4 = ModeWhere.localPlayer;
						} else {
							var4 = var0.players[var3];
						}

						if (var4 != null && 0 <= var4.x && var4.x < 13312 && 0 <= var4.y && var4.y < 13312) {
							var1.setDestination(var4.x, var4.y, Canvas.getTileHeight(var0, var4.x, var4.y, var1.plane) - var1.endHeight, Client.cycle);
						}
					}

					var1.advance(Client.graphicsCycle);
					var0.scene.drawEntity(var0.plane, (int)var1.x, (int)var1.y, (int)var1.z, 60, var1, var1.yaw, -1L, false);
				}
			} else {
				var1.remove();
			}
		}

	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(Ldz;Lvv;II)V",
		garbageValue = "-484128573"
	)
	@Export("updateWorldEntitiesFromPacketBuffer")
	static void updateWorldEntitiesFromPacketBuffer(WorldView var0, PacketBuffer var1, int var2) {
		int var3 = var1.readUnsignedByte();
		if (var3 < var0.worldEntityCount) {
			throw new RuntimeException("dang");
		} else if (var3 > var0.worldEntityCount) {
			throw new RuntimeException("dang!");
		} else {
			var0.worldEntityCount = 0;
			WorldEntityCoord var4 = new WorldEntityCoord();

			int var5;
			int var6;
			int var8;
			for (var5 = 0; var5 < var3; ++var5) {
				var6 = var0.worldEntityIndices[var5];
				WorldEntity var15 = var0.worldEntities[var6];
				var8 = var1.readUnsignedByte();
				if (var8 == 0) {
					Client.worldViewManager.method2737(var15.worldView);
					var0.worldEntities[var6] = null;
				} else {
					var0.worldEntityIndices[++var0.worldEntityCount - 1] = var6;
					if (var8 != 1) {
						var4.method5899(var15.method9293());
						class36.method722(var1, var4);
						if (var8 == 2) {
							var15.method9298(var4);
						} else {
							var15.method9316(var4);
						}
					}
				}
			}

			while (var1.method10230(Client.packetWriter.serverPacketLength) >= 10) {
				var5 = var1.readUnsignedShort();
				var0.worldEntityIndices[++var0.worldEntityCount - 1] = var5;
				var6 = var1.readUnsignedByte();
				int var7 = var1.readUnsignedByte();
				var8 = var6 * 8;
				int var9 = var7 * 8;
				WorldView var10 = Client.worldViewManager.method2713(var5, var8, var9, class544.clientPreferences.getDrawDistance(), class175.field1838);
				WorldEntity var11 = new WorldEntity(var5, var10);
				var0.worldEntities[var5] = var11;
				var11.field5027 = var1.readByte();
				WorldEntityCoord var12 = var11.worldEntityCoord;
				var12.method5900(0, 0);
				var12.setZ(0);
				var12.setCurrentRotationAngle(0);
				class36.method722(var1, var12);
				var11.method9298(var11.worldEntityCoord);
				if (var2 >= 4) {
					int var13 = var1.readShort();
					int var14 = var1.readShort();
					var11.method9334(var13, var14);
				}
			}

		}
	}
}
