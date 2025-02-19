import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bh")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("ws")
	static Iterator field244;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1260100485
	)
	@Export("id")
	int id;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1500159869
	)
	@Export("size")
	int size;
	@ObfuscatedName("au")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("ad")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("ah")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("ac")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("ao")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("af")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "7020766"
	)
	static void method670() {
		Login.Login_username = Login.Login_username.trim();
		if (Login.Login_username.length() == 0) {
			class401.setLoginResponseString("", "Please enter your username/email address.", "");
		} else if (Login.Login_password.length() == 0) {
			class401.setLoginResponseString("", "Please enter your password.", "");
		} else {
			class401.setLoginResponseString("", "Connecting to server...", "");
			Projection.method5234(false);
			class511.updateGameState(20);
		}
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(Ldp;Lof;I)V",
		garbageValue = "-795980749"
	)
	static void method671(WorldView var0, class386 var1) {
		int var2 = 0;

		for (int var3 = 0; var3 < var0.field1357.method9005(); ++var3) {
			class492 var4 = (class492)var0.field1358.get((long)var0.field1357.method9007(var3));
			if (var4 != null && var4.method9294() == var1) {
				boolean var5 = var4.field5148.field1354 == Client.field780;
				boolean var6;
				if (!var5) {
					var6 = var2 < Client.field778;
					if (!var6) {
						continue;
					}

					++var2;
				}

				var6 = false;
				if (var1 == class386.field4553) {
					var6 = class194.method3975(var4, var0);
				}

				boolean var7 = var4.field5149.field2135 && !var6;
				int var9 = var4.getX();
				int var8 = var9 >> 7;
				int var12 = var4.getY();
				int var11 = var12 >> 7;
				long var13 = HttpRequestTask.calculateTag(var8, var11, 4, var7, var4.field5147, var0.field1354);
				var4.field5150.setZ(DevicePcmPlayerProvider.getTileHeight(var0, var4.getX(), var4.getY(), var0.plane));
				var4.field5148.scene.baseY = Client.cycle;
				var4.method9284(var6);
				var0.scene.drawEntity(var0.plane, var4.getX(), var4.getY(), var4.method9322(), 60, var4.field5148.scene, var4.method9290(), var13, false);
				if (!var6) {
					UserComparator3.method3217(var4.field5148);
					class248.method5192(var4.field5148);
					class138.method3391(var4.field5148, true);
					class138.method3392(var4.field5148);
					class138.method3391(var4.field5148, false);
					class1.method12(var4.field5148);
					WorldView var15 = var4.field5148;

					for (class73 var16 = (class73)var15.field1342.last(); var16 != null; var16 = (class73)var15.field1342.previous()) {
						if (var15.plane == var16.field901 && !var16.field900) {
							if (Client.cycle >= var16.field899) {
								var16.method2210(Client.graphicsCycle);
								if (var16.field900) {
									var16.remove();
								} else {
									var15.scene.drawEntity(var16.field901, var16.field902, var16.field903, var16.field904, 60, var16, 0, -1L, false);
								}
							}
						} else {
							var16.remove();
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(Ldp;IIIIB)V",
		garbageValue = "29"
	)
	static final void method669(WorldView var0, int var1, int var2, int var3, int var4) {
		Client.overheadTextCount = 0;
		boolean var5 = false;
		int var6 = -1;
		int var7 = -1;
		int var8 = Client.playerUpdateManager.playerCount;
		int[] var9 = Client.playerUpdateManager.playerIndices;

		int var10;
		for (var10 = 0; var10 < var8 + var0.field1355.method9005(); ++var10) {
			Actor var23;
			if (var10 < var8) {
				var23 = (Actor)var0.field1353.method7890((long)var9[var10]);
				if (var9[var10] == Client.combatTargetPlayerIndex) {
					var5 = true;
					var6 = var10;
					continue;
				}

				if (var23 == class132.localPlayer) {
					var7 = var10;
					continue;
				}
			} else {
				var23 = (Actor)var0.field1356.method7890((long)var0.field1355.method9007(var10 - var8));
			}

			MouseRecorder.drawActor2d(var0, var23, var10, var1, var2, var3, var4);
		}

		if (Client.renderSelf && var7 != -1) {
			MouseRecorder.drawActor2d(var0, class132.localPlayer, var7, var1, var2, var3, var4);
		}

		if (var5) {
			MouseRecorder.drawActor2d(var0, (Actor)var0.field1353.method7890((long)Client.combatTargetPlayerIndex), var6, var1, var2, var3, var4);
		}

		for (var10 = 0; var10 < Client.overheadTextCount; ++var10) {
			int var11 = Client.overheadTextXs[var10];
			int var12 = Client.field621[var10];
			int var13 = Client.field623[var10];
			int var14 = Client.field622[var10];
			boolean var15 = true;

			while (var15) {
				var15 = false;

				for (int var22 = 0; var22 < var10; ++var22) {
					if (var12 + 2 > Client.field621[var22] - Client.field622[var22] && var12 - var14 < Client.field621[var22] + 2 && var11 - var13 < Client.field623[var22] + Client.overheadTextXs[var22] && var13 + var11 > Client.overheadTextXs[var22] - Client.field623[var22] && Client.field621[var22] - Client.field622[var22] < var12) {
						var12 = Client.field621[var22] - Client.field622[var22];
						var15 = true;
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var10];
			Client.viewportTempY = Client.field621[var10] = var12;
			String var16 = Client.overheadText[var10];
			if (Client.chatEffects == 0) {
				int var17 = 16776960;
				if (Client.field624[var10] < 6) {
					var17 = Client.field803[Client.field624[var10]];
				}

				if (Client.field624[var10] == 6) {
					var17 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.field624[var10] == 7) {
					var17 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.field624[var10] == 8) {
					var17 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var18;
				if (Client.field624[var10] == 9) {
					var18 = 150 - Client.field525[var10];
					if (var18 < 50) {
						var17 = var18 * 1280 + 16711680;
					} else if (var18 < 100) {
						var17 = 16776960 - (var18 - 50) * 327680;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 65280;
					}
				}

				if (Client.field624[var10] == 10) {
					var18 = 150 - Client.field525[var10];
					if (var18 < 50) {
						var17 = var18 * 5 + 16711680;
					} else if (var18 < 100) {
						var17 = 16711935 - (var18 - 50) * 327680;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 327680 + 255 - (var18 - 100) * 5;
					}
				}

				if (Client.field624[var10] == 11) {
					var18 = 150 - Client.field525[var10];
					if (var18 < 50) {
						var17 = 16777215 - var18 * 327685;
					} else if (var18 < 100) {
						var17 = (var18 - 50) * 327685 + 65280;
					} else if (var18 < 150) {
						var17 = 16777215 - (var18 - 100) * 327680;
					}
				}

				int var19;
				if (Client.field624[var10] == 12 && Client.field547[var10] == null) {
					var18 = var16.length();
					Client.field547[var10] = new int[var18];

					for (var19 = 0; var19 < var18; ++var19) {
						int var20 = (int)(64.0F * ((float)var19 / (float)var18));
						int var21 = var20 << 10 | 896 | 64;
						Client.field547[var10][var19] = class521.field5286[var21];
					}
				}

				if (Client.field775[var10] == 0) {
					UserComparator7.fontBold12.method8701(var16, Client.viewportTempX + var1, var2 + Client.viewportTempY, var17, 0, Client.field547[var10]);
				}

				if (Client.field775[var10] == 1) {
					UserComparator7.fontBold12.method8698(var16, Client.viewportTempX + var1, var2 + Client.viewportTempY, var17, 0, Client.viewportDrawCount, Client.field547[var10]);
				}

				if (Client.field775[var10] == 2) {
					UserComparator7.fontBold12.method8699(var16, Client.viewportTempX + var1, var2 + Client.viewportTempY, var17, 0, Client.viewportDrawCount, Client.field547[var10]);
				}

				if (Client.field775[var10] == 3) {
					UserComparator7.fontBold12.method8706(var16, Client.viewportTempX + var1, var2 + Client.viewportTempY, var17, 0, Client.viewportDrawCount, 150 - Client.field525[var10], Client.field547[var10]);
				}

				if (Client.field775[var10] == 4) {
					var18 = (150 - Client.field525[var10]) * (UserComparator7.fontBold12.stringWidth(var16) + 100) / 150;
					Rasterizer2D.Rasterizer2D_expandClip(Client.viewportTempX + var1 - 50, var2, Client.viewportTempX + var1 + 50, var2 + var4);
					UserComparator7.fontBold12.method8716(var16, Client.viewportTempX + var1 + 50 - var18, var2 + Client.viewportTempY, var17, 0, Client.field547[var10]);
					Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4);
				}

				if (Client.field775[var10] == 5) {
					var18 = 150 - Client.field525[var10];
					var19 = 0;
					if (var18 < 25) {
						var19 = var18 - 25;
					} else if (var18 > 125) {
						var19 = var18 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var1, var2 + Client.viewportTempY - UserComparator7.fontBold12.ascent - 1, var3 + var1, var2 + Client.viewportTempY + 5);
					UserComparator7.fontBold12.method8701(var16, Client.viewportTempX + var1, var19 + var2 + Client.viewportTempY, var17, 0, Client.field547[var10]);
					Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4);
				}
			} else {
				UserComparator7.fontBold12.drawCentered(var16, Client.viewportTempX + var1, var2 + Client.viewportTempY, 16776960, 0);
			}
		}

	}
}
