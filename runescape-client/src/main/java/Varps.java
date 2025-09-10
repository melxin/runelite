import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("nw")
@Implements("Varps")
public class Varps {
	@ObfuscatedName("aw")
	@Export("Varps_main")
	public static int[] Varps_main;
	@ObfuscatedName("at")
	@Export("Varps_masks")
	static int[] Varps_masks;

	static {
		Varps_masks = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			Varps_masks[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Ltz;",
		garbageValue = "-1409044849"
	)
	public static class516[] method7406() {
		return new class516[]{class516.field5483, class516.field5485, class516.field5475, class516.field5476};
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lti;Ljava/lang/Object;IIB)V",
		garbageValue = "1"
	)
	public static void method7409(DynamicArray var0, Object var1, int var2, int var3) {
		class374.method8144(var0);
		if (var2 < 0) {
			var2 = 0;
		}

		int var4 = var3 + var2;
		if (var3 < 0 || var4 < 0 || var4 > var0.method10322()) {
			var4 = var0.method10322();
		}

		if (var0.field5504 == class574.field5820) {
			Arrays.fill(var0.method10318(), var2, var4, (Integer)var1);
		} else if (var0.field5504 == class574.field5816) {
			Arrays.fill(var0.method10320(), var2, var4, (Long)var1);
		} else {
			Arrays.fill(var0.method10321(), var2, var4, var1);
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILcg;ZI)I",
		garbageValue = "215792805"
	)
	static int method7403(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = UrlRequester.widgetDefinition.method7476(Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? HttpRequestTask.scriptDotWidget : class141.scriptActiveWidget;
		}

		class89.invalidateWidget(var3);
		int var4;
		int var5;
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) {
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) {
				var3.modelType = 2;
				var3.modelId = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) {
				var3.modelType = 3;
				var3.modelId = HealthBarUpdate.localPlayer.appearance.getChatHeadId();
				return 1;
			} else if (var0 == 1207) {
				boolean var7 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
				var3.method7977(HealthBarUpdate.localPlayer.appearance, var7);
				return 1;
			} else if (var0 == 1208) {
				var4 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
				if (var3.field4206 == null) {
					throw new RuntimeException("");
				} else {
					var3.field4206.method7541(var4);
					return 1;
				}
			} else if (var0 == 1209) {
				UserComparator7.Interpreter_intStackSize -= 2;
				var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
				var5 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
				if (var3.field4206 == null) {
					throw new RuntimeException("");
				} else {
					var3.field4206.method7533(var4, var5);
					return 1;
				}
			} else if (var0 == 1210) {
				var4 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
				if (var3.field4206 == null) {
					throw new RuntimeException("");
				} else {
					var3.field4206.method7562(HealthBarUpdate.localPlayer.appearance.gender, var4);
					return 1;
				}
			} else if (var0 == 1214) {
				var3.modelType = 8;
				var3.modelId = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
				return 1;
			} else if (var0 == 1215) {
				var3.modelType = 9;
				var3.modelId = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
				return 1;
			} else {
				return 2;
			}
		} else {
			UserComparator7.Interpreter_intStackSize -= 2;
			var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
			var5 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
			var3.itemId = var4;
			var3.itemQuantity = var5;
			ItemComposition var6 = AttackOption.ItemDefinition_get(var4);
			var3.modelAngleX = var6.xan2d;
			var3.modelAngleY = var6.yan2d;
			var3.modelAngleZ = var6.zan2d;
			var3.modelOffsetX = var6.offsetX2d;
			var3.modelOffsetY = var6.offsetY2d;
			var3.modelZoom = var6.zoom2d;
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) {
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | 1 == var6.isStackable) {
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2;
			}

			if (var3.field4152 > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.field4152;
			} else if (var3.rawWidth > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "432950031"
	)
	@Export("updateLoginStatusUsernameRemembered")
	static void updateLoginStatusUsernameRemembered(boolean var0) {
		byte var1 = 0;
		boolean var2 = class36.clientPreferences.getEULA() >= Client.field388;
		if (!var2) {
			var1 = 12;
		} else if (class521.client.containsAccessAndRefreshToken() || class521.client.otlTokenRequesterInitialized() || class521.client.containsSessionAndCharacterId()) {
			var1 = 10;
		}

		ClientPreferences.method2677(var1);
		if (var0) {
			Login.Login_username = "";
			Login.Login_password = "";
			ScriptFrame.otpMedium = 0;
			class464.otp = "";
		}

		if (Login.Login_username == null || Login.Login_username.isEmpty()) {
			if (class36.clientPreferences.getRememberedUsername() != null) {
				Login.Login_username = class36.clientPreferences.getRememberedUsername();
				Client.Login_isUsernameRemembered = true;
			} else {
				Client.Login_isUsernameRemembered = false;
			}
		}

		if (Client.Login_isUsernameRemembered && Login.Login_username != null && !Login.Login_username.isEmpty()) {
			Login.currentLoginField = 1;
		} else {
			Login.currentLoginField = 0;
		}

	}
}
