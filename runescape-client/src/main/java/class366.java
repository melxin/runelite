import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("or")
public class class366 {
	@ObfuscatedName("nb")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	@Export("pcmStreamMixer")
	static PcmStreamMixer pcmStreamMixer;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	Widget field4048;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -573449613
	)
	int field4049;
	@ObfuscatedName("as")
	int[] field4046;
	@ObfuscatedName("ah")
	int[] field4052;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 394304167
	)
	int field4053;

	public class366() {
		this.field4046 = new int[32];
		this.field4052 = new int[32];
		this.field4053 = 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILox;II)V",
		garbageValue = "1067413133"
	)
	public void method7875(int var1, Widget var2, int var3) {
		this.field4048 = var2;
		this.field4049 = 0;
		this.field4053 = 0;
		if (var1 >= 0 && var1 < 3) {
			if (var2 == null || var2.childIndex * -64977777 == -1 && var2.type == 0) {
				if (var2 != null && var2.children != null) {
					if (var1 == 0) {
						Widget[] var7 = var2.children;

						for (int var5 = 0; var5 < var7.length; ++var5) {
							Widget var6 = var7[var5];
							if (var6 != null) {
								this.method7853(var6.childIndex * -64977777);
							}
						}
					} else {
						boolean var4 = var1 != 1;
						if (var3 == -1) {
							this.method7881(var2, var4);
						} else if (var3 >= 0 && var3 < var2.children.length && var2.children[var3] != null) {
							this.method7881(var2.children[var3], var4);
						}
					}

				}
			} else {
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-78"
	)
	final void method7853(int var1) {
		if (this.field4046.length == this.field4049) {
			this.field4046 = Arrays.copyOf(this.field4046, this.field4046.length * 2);
		}

		this.field4046[++this.field4049 - 1] = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lox;ZB)V",
		garbageValue = "-38"
	)
	final void method7881(Widget var1, boolean var2) {
		int var3 = var1 == this.field4048 ? 0 : var1.field4148;
		int var4 = var1 == this.field4048 ? var1.children.length - 1 : var1.field4090;

		for (int var5 = var3; var5 <= var4; ++var5) {
			Widget var6 = this.field4048.children[var5];
			if (var6 != null && var1.childIndex * -64977777 == var6.field4117) {
				this.method7853(var6.childIndex * -64977777);
				if (var2 && var6.field4148 <= var6.field4090) {
					this.method7881(var6, true);
				}
			}
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "421865772"
	)
	public int method7854() {
		return this.field4049;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Lox;",
		garbageValue = "123"
	)
	public Widget method7868() {
		int var1 = this.method7880();
		return var1 >= 0 ? this.field4048.children[var1] : null;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1057002095"
	)
	public int method7880() {
		return this.field4053 >= this.field4049 ? -1 : this.field4046[++this.field4053 - 1];
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1704130733"
	)
	public int[] method7857() {
		return Arrays.copyOf(this.field4046, this.field4049);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;Ljava/lang/Object;I)V",
		garbageValue = "927865376"
	)
	public void method7852(int var1, Object var2, Object var3) {
		int[] var4 = this.field4046;
		int var5 = this.field4049;
		this.field4046 = this.field4052;
		this.field4049 = 0;
		this.field4052 = var4;

		for (int var6 = 0; var6 < var5; ++var6) {
			Widget var7 = this.field4048.children[var4[var6]];
			if (var7 != null) {
				Object var8 = var7.method7907(var1, var3);
				if (var2 == var8 || var8 != null && var8.equals(var2)) {
					this.method7853(var4[var6]);
				}
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lrm;Lrm;B)Lrm;",
		garbageValue = "10"
	)
	public static final class448 method7865(class448 var0, class448 var1) {
		class448 var2 = class85.method2788(var0);
		var2.method9026(var1);
		return var2;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "507312364"
	)
	static final int method7884(int var0, int var1) {
		int var2 = var1 * 57 + var0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 255;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "975855453"
	)
	static void method7855() {
		if (Login.loginIndex == 34) {
			Varcs.Login_promptCredentials(false);
		}

		Login.worldSelectOpen = false;
		Rasterizer2D.Rasterizer2D_fillRectangle(0, 0, Rasterizer2D.Rasterizer2D_width, Rasterizer2D.Rasterizer2D_height, 0);
		class372.leftTitleSprite.drawAt(Login.xPadding, 0);
		class524.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
		class205.logoSprite.drawAt(Login.xPadding + 382 - class205.logoSprite.subWidth / 2, 18);
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(Ldj;IIIIII)V",
		garbageValue = "-146532074"
	)
	static void method7885(WorldView var0, int var1, int var2, int var3, int var4, int var5) {
		NodeDeque var6 = var0.groundItems[var1][var2][var3];
		if (var6 != null) {
			for (TileItem var7 = (TileItem)var6.last(); var7 != null; var7 = (TileItem)var6.previous()) {
				if ((var4 & 32767) == var7.id && var5 == var7.quantity) {
					var7.method2780();
					break;
				}
			}

			class167.updateItemPile(var1, var2, var3);
		}

	}

	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-585546467"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
			class88.method2837(var0 - var2, var1 - var3);
		}

		long var4 = -1L;
		int var6 = 0;
		long var7 = -1L;
		int var9 = 0;

		while (true) {
			int var11 = ViewportMouse.ViewportMouse_entityCount;
			if (var9 >= var11) {
				if (-1L != var4) {
					var9 = (int)(var4 >>> 0 & 127L);
					var11 = (int)(var4 >>> 7 & 127L);
					Player var13 = (Player)class7.topLevelWorldView.players.get((long)Client.combatTargetPlayerIndex);
					HttpMethod.addPlayerToMenu(var13, Client.combatTargetPlayerIndex, var9, var11, var6);
				}

				return;
			}

			long var30 = class133.method3575(var9);
			if (var7 != var30) {
				label455: {
					var7 = var30;
					long var16 = ViewportMouse.ViewportMouse_entityTags[var9];
					int var15 = (int)(var16 >>> 0 & 127L);
					var15 = var15;
					int var32 = Buddy.method10089(var9);
					int var17 = class162.method3976(ViewportMouse.ViewportMouse_entityTags[var9]);
					int var19 = class46.method1840(var9);
					int var20 = class149.method3789(var9);
					WorldEntity var21 = null;
					WorldView var22 = null;
					var21 = (WorldEntity)class7.topLevelWorldView.worldEntities.get((long)var20);
					if (var20 >= 0 && var21 != null) {
						if (var21.method10138()) {
							break label455;
						}

						var22 = var21.worldView;
					} else if (var20 == -1) {
						var21 = null;
						var22 = class7.topLevelWorldView;
					}

					if (var22 != null) {
						int var23 = HealthBarDefinition.method4252(var20, var21, var22);
						if (var23 != -1) {
							label436: {
								int var27;
								if (var17 == 2 && var22.scene.getObjectFlags(var23, var15, var32, var30) >= 0) {
									ObjectComposition var24 = SpriteMask.getObjectDefinition(var19);
									if (var24.transforms != null) {
										var24 = var24.transform();
									}

									if (var24 == null) {
										break label436;
									}

									PendingSpawn var25 = null;

									for (PendingSpawn var26 = (PendingSpawn)var22.pendingSpawns.last(); var26 != null; var26 = (PendingSpawn)var22.pendingSpawns.previous()) {
										if (var23 == var26.plane && var15 == var26.x && var32 == var26.y && var19 == var26.field1011) {
											var25 = var26;
											break;
										}
									}

									if (!Player.field923 && Client.isItemSelected == 1) {
										ClanSettings.insertMenuItem("Use", Client.field501 + " " + "->" + " " + ObjectSound.colorStartTag(65535) + var24.name, 1, var19, var15, var32, -1, false, var20);
									} else if (Client.isSpellSelected) {
										if (!Player.field923 && (class533.selectedSpellFlags & 4) == 4) {
											ClanSettings.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + ObjectSound.colorStartTag(65535) + var24.name, 2, var19, var15, var32, -1, false, var20);
										}
									} else {
										String[] var40 = var24.actions;
										if (var40 != null) {
											for (var27 = 4; var27 >= 0; --var27) {
												if (!Player.field923 && (var25 == null || var25.method2372(var27))) {
													String var28 = var40[var27];
													if (var25 != null && var25.method2365(var27)) {
														var28 = var25.method2369(var27);
													}

													if (var28 != null) {
														short var29 = 0;
														if (var27 == 0) {
															var29 = 3;
														}

														if (var27 == 1) {
															var29 = 4;
														}

														if (var27 == 2) {
															var29 = 5;
														}

														if (var27 == 3) {
															var29 = 6;
														}

														if (var27 == 4) {
															var29 = 1001;
														}

														ClanSettings.insertMenuItem(var28, ObjectSound.colorStartTag(65535) + var24.name, var29, var19, var15, var32, -1, false, var20);
													}
												}
											}
										}

										ClanSettings.insertMenuItem("Examine", ObjectSound.colorStartTag(65535) + var24.name, 1002, var24.id, var15, var32, -1, false, var20);
									}
								}

								int var33;
								NPC var41;
								int[] var42;
								Player var44;
								if (var17 == 1) {
									NPC var36 = (NPC)var22.npcs.get((long)var19);
									if (var36 == null) {
										break label436;
									}

									if (var36.definition.size == 1 && (var36.x & 127) == 64 && (var36.y & 127) == 64) {
										for (var33 = 0; var33 < var22.field1150.method9810(); ++var33) {
											var41 = (NPC)var22.npcs.get((long)var22.field1150.method9817(var33));
											if (var41 != null && var36 != var41 && var41.definition.size == 1 && var41.x == var36.x && var36.y == var41.y) {
												MouseHandler.addNpcToMenu(var41, var41.index, var15, var32, var20);
											}
										}

										var33 = Client.playerUpdateManager.playerCount;
										var42 = Client.playerUpdateManager.playerIndices;

										for (var27 = 0; var27 < var33; ++var27) {
											var44 = (Player)var22.players.get((long)var42[var27]);
											if (var44 != null && var44.x == var36.x && var44.y == var36.y) {
												HttpMethod.addPlayerToMenu(var44, var42[var27], var15, var32, var20);
											}
										}
									}

									MouseHandler.addNpcToMenu(var36, var19, var15, var32, var20);
								}

								if (var17 == 0) {
									Player var37 = (Player)var22.players.get((long)var19);
									if (var37 == null) {
										break label436;
									}

									if ((var37.x & 127) == 64 && (var37.y & 127) == 64) {
										for (var33 = 0; var33 < var22.field1150.method9810(); ++var33) {
											var41 = (NPC)var22.npcs.get((long)var22.field1150.method9817(var33));
											if (var41 != null && var41.definition.size == 1 && var41.x == var37.x && var41.y == var37.y) {
												MouseHandler.addNpcToMenu(var41, var22.field1150.method9817(var33), var15, var32, var20);
											}
										}

										var33 = Client.playerUpdateManager.playerCount;
										var42 = Client.playerUpdateManager.playerIndices;

										for (var27 = 0; var27 < var33; ++var27) {
											var44 = (Player)var22.players.get((long)var42[var27]);
											if (var44 != null && var37 != var44 && var44.x == var37.x && var37.y == var44.y) {
												HttpMethod.addPlayerToMenu(var44, var42[var27], var15, var32, var20);
											}
										}
									}

									if (var19 != Client.combatTargetPlayerIndex) {
										HttpMethod.addPlayerToMenu(var37, var19, var15, var32, var20);
									} else {
										var4 = var30;
										var6 = var20;
									}
								}

								if (var17 == 3) {
									NodeDeque var38 = var22.groundItems[var23][var15][var32];
									if (var38 != null) {
										for (TileItem var39 = (TileItem)var38.first(); var39 != null; var39 = (TileItem)var38.next()) {
											ItemComposition var43 = ObjectComposition.ItemDefinition_get(var39.id);
											if (!WorldMapIcon_1.field3231 && Client.isItemSelected == 1) {
												ClanSettings.insertMenuItem("Use", Client.field501 + " " + "->" + " " + ObjectSound.colorStartTag(16748608) + var43.name, 16, var39.id, var15, var32, -1, false, var20);
											} else if (Client.isSpellSelected) {
												if (!WorldMapIcon_1.field3231 && (class533.selectedSpellFlags & 1) == 1) {
													ClanSettings.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + ObjectSound.colorStartTag(16748608) + var43.name, 17, var39.id, var15, var32, -1, false, var20);
												}
											} else {
												String[] var34 = var43.groundActions;

												for (int var35 = 4; var35 >= 0; --var35) {
													if (!WorldMapIcon_1.field3231 && var39.method2771(var35)) {
														if (var34 != null && var34[var35] != null) {
															byte var45 = 0;
															if (var35 == 0) {
																var45 = 18;
															}

															if (var35 == 1) {
																var45 = 19;
															}

															if (var35 == 2) {
																var45 = 20;
															}

															if (var35 == 3) {
																var45 = 21;
															}

															if (var35 == 4) {
																var45 = 22;
															}

															ClanSettings.insertMenuItem(var34[var35], ObjectSound.colorStartTag(16748608) + var43.name, var45, var39.id, var15, var32, -1, false, var20);
														} else if (var35 == 2) {
															ClanSettings.insertMenuItem("Take", ObjectSound.colorStartTag(16748608) + var43.name, 20, var39.id, var15, var32, -1, false, var20);
														}
													}
												}

												ClanSettings.insertMenuItem("Examine", ObjectSound.colorStartTag(16748608) + var43.name, 1004, var39.id, var15, var32, -1, false, var20);
											}
										}
									}
								}
							}
						}
					}
				}
			}

			++var9;
		}
	}
}
