import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
public class class53 extends Node {
	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	static Model field338;
	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	@Export("entity")
	static Entity entity;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lbo;"
	)
	class47 field340;

	public class53() {
		this.field340 = null;
	}

	@ObfuscatedSignature(
		descriptor = "(Lcc;)V"
	)
	class53(VorbisSample var1) {
		if (var1 != null) {
			this.field340 = new class47(var1, (RawSound)null);
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Lbc;)V"
	)
	public class53(RawSound var1) {
		this.field340 = new class47((VorbisSample)null, var1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-39"
	)
	public boolean method1117() {
		return this.field340 == null;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lbc;",
		garbageValue = "1940326458"
	)
	public RawSound method1130() {
		if (this.field340 != null && this.field340.field305.tryLock()) {
			RawSound var1;
			try {
				var1 = this.method1128();
			} finally {
				this.field340.field305.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(S)Lbc;",
		garbageValue = "-2570"
	)
	public RawSound method1119() {
		if (this.field340 != null) {
			this.field340.field305.lock();

			RawSound var1;
			try {
				var1 = this.method1128();
			} finally {
				this.field340.field305.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lbc;",
		garbageValue = "-1373017010"
	)
	RawSound method1128() {
		if (this.field340.field306 == null) {
			this.field340.field306 = this.field340.field304.toRawSound((int[])null);
			this.field340.field304 = null;
		}

		return this.field340.field306;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZB)Z",
		garbageValue = "-25"
	)
	static boolean method1131(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			boolean var3 = false;
			boolean var4 = false;
			int var5 = 0;
			int var6 = var0.length();

			for (int var7 = 0; var7 < var6; ++var7) {
				char var8 = var0.charAt(var7);
				if (var7 == 0) {
					if (var8 == '-') {
						var3 = true;
						continue;
					}

					if (var8 == '+') {
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') {
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') {
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') {
						return false;
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) {
					return false;
				}

				if (var3) {
					var10 = -var10;
				}

				int var9 = var5 * var1 + var10;
				if (var9 / var1 != var5) {
					return false;
				}

				var5 = var9;
				var4 = true;
			}

			return var4;
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "1825257480"
	)
	static int method1129(int var0, Script var1, boolean var2) {
		if (var0 < 1000) {
			return GameObject.method4821(var0, var1, var2);
		} else if (var0 < 1100) {
			return HttpRequestTask.method285(var0, var1, var2);
		} else if (var0 < 1200) {
			return class454.method8934(var0, var1, var2);
		} else if (var0 < 1300) {
			return FaceNormal.method4464(var0, var1, var2);
		} else if (var0 < 1400) {
			return class273.method5890(var0, var1, var2);
		} else if (var0 < 1500) {
			return UserComparator10.method3361(var0, var1, var2);
		} else if (var0 < 1600) {
			return GameObject.method4823(var0, var1, var2);
		} else if (var0 < 1700) {
			return class508.method9608(var0, var1, var2);
		} else if (var0 < 1800) {
			return class165.method3793(var0, var1, var2);
		} else if (var0 < 1900) {
			return WallDecoration.method4820(var0, var1, var2);
		} else if (var0 < 2000) {
			return class166.method3800(var0, var1, var2);
		} else if (var0 < 2100) {
			return HttpRequestTask.method285(var0, var1, var2);
		} else if (var0 < 2200) {
			return class454.method8934(var0, var1, var2);
		} else if (var0 < 2300) {
			return FaceNormal.method4464(var0, var1, var2);
		} else if (var0 < 2400) {
			return class273.method5890(var0, var1, var2);
		} else if (var0 < 2500) {
			return UserComparator10.method3361(var0, var1, var2);
		} else if (var0 < 2600) {
			return WorldMapData_0.method5988(var0, var1, var2);
		} else if (var0 < 2700) {
			return class27.method426(var0, var1, var2);
		} else if (var0 < 2800) {
			return SoundCache.method896(var0, var1, var2);
		} else if (var0 < 2900) {
			return class298.method6400(var0, var1, var2);
		} else if (var0 < 3000) {
			return class166.method3800(var0, var1, var2);
		} else if (var0 < 3200) {
			return SoundCache.method872(var0, var1, var2);
		} else if (var0 < 3300) {
			return HealthBarConfig.method3000(var0, var1, var2);
		} else if (var0 < 3400) {
			return SoundSystem.method869(var0, var1, var2);
		} else if (var0 < 3500) {
			return ReflectionCheck.method726(var0, var1, var2);
		} else if (var0 < 3600) {
			return class30.method484(var0, var1, var2);
		} else if (var0 < 3700) {
			return class379.method7638(var0, var1, var2);
		} else if (var0 < 3800) {
			return ClanSettings.method3755(var0, var1, var2);
		} else if (var0 < 3900) {
			return class539.method10085(var0, var1, var2);
		} else if (var0 < 4000) {
			return GrandExchangeOfferOwnWorldComparator.method1269(var0, var1, var2);
		} else if (var0 < 4100) {
			return class344.method6944(var0, var1, var2);
		} else if (var0 < 4200) {
			return class140.method3501(var0, var1, var2);
		} else if (var0 < 4300) {
			return class374.method7621(var0, var1, var2);
		} else if (var0 < 5100) {
			return Sound.method3656(var0, var1, var2);
		} else if (var0 < 5400) {
			return Canvas.method339(var0, var1, var2);
		} else if (var0 < 5600) {
			return TaskHandler.method4922(var0, var1, var2);
		} else if (var0 < 5700) {
			return Tiles.method2544(var0, var1, var2);
		} else if (var0 < 6300) {
			return UserComparator9.method3354(var0, var1, var2);
		} else if (var0 < 6600) {
			return WorldMapRectangle.method6391(var0, var1, var2);
		} else if (var0 < 6700) {
			return Archive.method7721(var0, var1, var2);
		} else if (var0 < 6800) {
			return PendingSpawn.method2755(var0, var1, var2);
		} else if (var0 < 6900) {
			return FileSystem.method4954(var0, var1, var2);
		} else if (var0 < 7000) {
			return class31.method494(var0, var1, var2);
		} else if (var0 < 7100) {
			return VerticalAlignment.method5355(var0, var1, var2);
		} else if (var0 < 7200) {
			return SpotAnimationDefinition.method5382(var0, var1, var2);
		} else if (var0 < 7500) {
			return NpcOverrides.method5295(var0, var1, var2);
		} else if (var0 < 7600) {
			return class156.method3638(var0, var1, var2);
		} else if (var0 < 7700) {
			return GameEngine.method549(var0, var1, var2);
		} else if (var0 < 8000) {
			return class28.method459(var0, var1, var2);
		} else {
			return var0 < 8100 ? HealthBarDefinition.method5247(var0, var1, var2) : 2;
		}
	}

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIIII)V",
		garbageValue = "-1177802429"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3, int var4) {
		if (var0.index != Client.localPlayerIndex) {
			if (Client.menu.menuOptionsCount < 400) {
				String var5;
				if (var0.skillLevel == 0) {
					var5 = var0.actions[0] + var0.username + var0.actions[1] + ArchiveLoader.method2584(var0.combatLevel, ModeWhere.localPlayer.combatLevel) + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2];
				} else {
					var5 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2];
				}

				int var6;
				if (Client.isItemSelected == 1) {
					class231.insertMenuItem("Use", Client.field570 + " " + "->" + " " + WorldViewManager.colorStartTag(16777215) + var5, 14, var1, var2, var3, -1, false, var4);
				} else if (Client.isSpellSelected) {
					if ((class106.selectedSpellFlags & 8) == 8) {
						class231.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + WorldViewManager.colorStartTag(16777215) + var5, 15, var1, var2, var3, -1, false, var4);
					}
				} else {
					for (var6 = 7; var6 >= 0; --var6) {
						if (Client.playerMenuActions[var6] != null) {
							short var7 = 0;
							if (Client.playerMenuActions[var6].equalsIgnoreCase("Attack")) {
								if (AttackOption.AttackOption_hidden == Client.playerAttackOption) {
									continue;
								}

								if (Client.playerAttackOption == AttackOption.AttackOption_alwaysRightClick || AttackOption.AttackOption_dependsOnCombatLevels == Client.playerAttackOption && var0.combatLevel > ModeWhere.localPlayer.combatLevel) {
									var7 = 2000;
								}

								if (ModeWhere.localPlayer.team != 0 && var0.team != 0) {
									if (var0.team == ModeWhere.localPlayer.team) {
										var7 = 2000;
									} else {
										var7 = 0;
									}
								} else if (Client.playerAttackOption == AttackOption.field1378 && var0.isClanMember()) {
									var7 = 2000;
								}
							} else if (Client.playerOptionsPriorities[var6]) {
								var7 = 2000;
							}

							boolean var8 = false;
							int var9 = Client.playerMenuOpcodes[var6] + var7;
							class231.insertMenuItem(Client.playerMenuActions[var6], WorldViewManager.colorStartTag(16777215) + var5, var9, var1, var2, var3, -1, false, var4);
						}
					}
				}

				for (var6 = 0; var6 < Client.menu.menuOptionsCount; ++var6) {
					if (Client.menu.menuOpcodes[var6] == 23) {
						Client.menu.menuTargets[var6] = WorldViewManager.colorStartTag(16777215) + var5;
						break;
					}
				}

			}
		}
	}

	@ObfuscatedName("mg")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1410523996"
	)
	static void method1124(int var0) {
		class318.tempMenuAction = new MenuAction();
		class318.tempMenuAction.param0 = Client.menu.menuArguments1[var0];
		class318.tempMenuAction.param1 = Client.menu.menuArguments2[var0];
		class318.tempMenuAction.opcode = Client.menu.menuOpcodes[var0];
		class318.tempMenuAction.identifier = Client.menu.menuIdentifiers[var0];
		class318.tempMenuAction.itemId = Client.menu.menuItemIds[var0];
		class318.tempMenuAction.action = Client.menu.menuActions[var0];
		class318.tempMenuAction.target = Client.menu.menuTargets[var0];
		class318.tempMenuAction.worldViewId = Client.menu.menuWorldViewIds[var0];
		class318.tempMenuAction.field912 = Client.menu.menuShiftClick[var0];
	}

	@ObfuscatedName("nd")
	@ObfuscatedSignature(
		descriptor = "(IIIILvf;Lnf;I)V",
		garbageValue = "-985042487"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2;
		if (var6 > 4225 && var6 < 90000) {
			int var7 = Client.camAngleY & 2047;
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7];
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7];
			int var10 = var9 * var2 + var3 * var8 >> 16;
			int var11 = var3 * var9 - var8 * var2 >> 16;
			double var12 = Math.atan2((double)var10, (double)var11);
			int var14 = var5.width / 2 - 25;
			int var15 = (int)(Math.sin(var12) * (double)var14);
			int var16 = (int)(Math.cos(var12) * (double)var14);
			byte var17 = 20;
			class213.redHintArrowSprite.method10761(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
		} else {
			FontName.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5);
		}

	}
}
