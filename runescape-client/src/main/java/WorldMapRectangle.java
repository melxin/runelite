import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("la")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 969059261
	)
	@Export("width")
	int width;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -247160933
	)
	@Export("height")
	int height;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1455202723
	)
	@Export("x")
	int x;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1752729869
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	final WorldMapRenderer this$0;

	@ObfuscatedSignature(
		descriptor = "(Lln;)V"
	)
	WorldMapRectangle(WorldMapRenderer var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZI)V",
		garbageValue = "-1654093091"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		if (var1) {
			if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI(var0));
					return;
				} catch (Exception var4) {
				}
			}

			if (class31.field137.startsWith("win")) {
				class163.method3775(var0, 0);
			} else if (class31.field137.startsWith("mac")) {
				class440.method8813(var0, 1, "openjs");
			} else {
				class163.method3775(var0, 2);
			}
		} else {
			class163.method3775(var0, 3);
		}

	}

	@ObfuscatedName("az")
	@Export("base37DecodeLong")
	public static String base37DecodeLong(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (var0 % 37L == 0L) {
				return null;
			} else {
				int var2 = 0;

				for (long var3 = var0; 0L != var3; var3 /= 37L) {
					++var2;
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); var0 != 0L; var5.append(var8)) {
					long var6 = var0;
					var0 /= 37L;
					var8 = class421.base37Table[(int)(var6 - var0 * 37L)];
					if (var8 == '_') {
						int var9 = var5.length() - 1;
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
						var8 = 160;
					}
				}

				var5.reverse();
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
				return var5.toString();
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "2120766497"
	)
	static int method6391(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class280.loadWorlds() ? 1 : 0;
			return 1;
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) {
				var9 = WorldMapLabelSize.worldListStart();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) {
				var9 = class329.getNextWorldListWorld();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) {
					var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
					var7 = null;

					for (var8 = 0; var8 < World.World_count; ++var8) {
						if (var3 == World.World_worlds[var8].id) {
							var7 = World.World_worlds[var8];
							break;
						}
					}

					if (var7 != null) {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) {
					ScriptFrame.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
					boolean var10 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1] == 1;
					var8 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
					boolean var6 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 3] == 1;
					class133.sortWorldList(var3, var10, var8, var6);
					return 1;
				} else if (var0 != 6511) {
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) {
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
						return 1;
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) {
							ScriptFrame.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
							var5 = VerticalAlignment.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = FadeOutTask.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = FadeOutTask.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.LC_PARAM) {
							ScriptFrame.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
							var5 = VerticalAlignment.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = class142.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class142.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.OC_PARAM) {
							ScriptFrame.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
							var5 = VerticalAlignment.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = FaceNormal.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = FaceNormal.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) {
							ScriptFrame.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
							var5 = VerticalAlignment.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = ItemContainer.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = ItemContainer.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ON_MOBILE) {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.clientType;
							return 1;
						} else if (var0 == 6520) {
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) {
							return 1;
						} else if (var0 == 6522) {
							--HealthBarConfig.Interpreter_stringStackSize;
							--ScriptFrame.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 6523) {
							--HealthBarConfig.Interpreter_stringStackSize;
							--ScriptFrame.Interpreter_intStackSize;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == 6527) {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.field498;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
					if (var3 >= 0 && var3 < World.World_count) {
						var7 = World.World_worlds[var3];
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				}
			}
		}
	}
}
