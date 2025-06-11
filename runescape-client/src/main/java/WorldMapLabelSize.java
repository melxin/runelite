import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ki")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -295661391
	)
	final int field3143;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1477585423
	)
	final int field3144;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -774051667
	)
	final int field3147;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(0, 0, 4);
		WorldMapLabelSize_medium = new WorldMapLabelSize(2, 1, 2);
		WorldMapLabelSize_large = new WorldMapLabelSize(1, 2, 0);
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field3143 = var1;
		this.field3144 = var2;
		this.field3147 = var3;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(FI)Z",
		garbageValue = "1702933590"
	)
	boolean method6160(float var1) {
		return var1 >= (float)this.field3147;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[Lki;",
		garbageValue = "520118040"
	)
	static WorldMapLabelSize[] method6167() {
		return new WorldMapLabelSize[]{WorldMapLabelSize_large, WorldMapLabelSize_medium, WorldMapLabelSize_small};
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Lki;",
		garbageValue = "-1977501003"
	)
	static WorldMapLabelSize method6158(int var0) {
		WorldMapLabelSize[] var1 = method6167();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			WorldMapLabelSize var3 = var1[var2];
			if (var0 == var3.field3144) {
				return var3;
			}
		}

		return null;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "100"
	)
	static final int method6163(int var0, int var1, int var2, int var3) {
		return var3 * var0 + var2 * var1 >> 16;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "480647835"
	)
	static void method6173() {
		class85.method2689(24);
		MenuAction.setLoginResponseString("", "You were disconnected from the server.", "");
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ILcr;ZI)I",
		garbageValue = "638556091"
	)
	static int method6172(int var0, Script var1, boolean var2) {
		String var3;
		int var10;
		if (var0 == ScriptOpcodes.APPEND_NUM) {
			var3 = (String)Interpreter.Interpreter_objectStack[--class175.Interpreter_objectStackSize];
			var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = var3 + var10;
			return 1;
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) {
				class175.Interpreter_objectStackSize -= 2;
				var3 = (String)Interpreter.Interpreter_objectStack[class175.Interpreter_objectStackSize];
				var4 = (String)Interpreter.Interpreter_objectStack[class175.Interpreter_objectStackSize + 1];
				Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = var3 + var4;
				return 1;
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) {
				var3 = (String)Interpreter.Interpreter_objectStack[--class175.Interpreter_objectStackSize];
				var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = var3 + UrlRequest.intToString(var10, true);
				return 1;
			} else if (var0 == ScriptOpcodes.LOWERCASE) {
				var3 = (String)Interpreter.Interpreter_objectStack[--class175.Interpreter_objectStackSize];
				Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = var3.toLowerCase();
				return 1;
			} else {
				int var6;
				int var11;
				if (var0 == ScriptOpcodes.FROMDATE) {
					var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					long var14 = (11745L + (long)var11) * 86400000L;
					Interpreter.Interpreter_calendar.setTime(new Date(var14));
					var6 = Interpreter.Interpreter_calendar.get(5);
					int var17 = Interpreter.Interpreter_calendar.get(2);
					int var8 = Interpreter.Interpreter_calendar.get(1);
					Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8;
					return 1;
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) {
					if (var0 == ScriptOpcodes.TOSTRING) {
						var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = Integer.toString(var11);
						return 1;
					} else if (var0 == ScriptOpcodes.COMPARE) {
						class175.Interpreter_objectStackSize -= 2;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = VarbitComposition.method4309(ScriptEvent.compareStrings((String)Interpreter.Interpreter_objectStack[class175.Interpreter_objectStackSize], (String)Interpreter.Interpreter_objectStack[class175.Interpreter_objectStackSize + 1], class28.clientLanguage));
						return 1;
					} else {
						int var9;
						byte[] var12;
						Font var13;
						if (var0 == ScriptOpcodes.PARAHEIGHT) {
							var3 = (String)Interpreter.Interpreter_objectStack[--class175.Interpreter_objectStackSize];
							Interpreter.Interpreter_intStackSize -= 2;
							var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							var12 = class361.archive13.takeFile(var9, 0);
							var13 = new Font(var12);
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13.lineCount(var3, var10);
							return 1;
						} else if (var0 == ScriptOpcodes.PARAWIDTH) {
							var3 = (String)Interpreter.Interpreter_objectStack[--class175.Interpreter_objectStackSize];
							Interpreter.Interpreter_intStackSize -= 2;
							var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							var12 = class361.archive13.takeFile(var9, 0);
							var13 = new Font(var12);
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13.lineWidth(var3, var10);
							return 1;
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) {
							class175.Interpreter_objectStackSize -= 2;
							var3 = (String)Interpreter.Interpreter_objectStack[class175.Interpreter_objectStackSize];
							var4 = (String)Interpreter.Interpreter_objectStack[class175.Interpreter_objectStackSize + 1];
							if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
								Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = var4;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ESCAPE) {
							var3 = (String)Interpreter.Interpreter_objectStack[--class175.Interpreter_objectStackSize];
							Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = AbstractFont.escapeBrackets(var3);
							return 1;
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) {
							var3 = (String)Interpreter.Interpreter_objectStack[--class175.Interpreter_objectStackSize];
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = var3 + (char)var10;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) {
							var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class140.isCharPrintable((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) {
							var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SoundCache.isAlphaNumeric((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) {
							var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = TaskHandler.isCharAlphabetic((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) {
							var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class195.isDigit((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) {
							var3 = (String)Interpreter.Interpreter_objectStack[--class175.Interpreter_objectStackSize];
							if (var3 != null) {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.SUBSTRING) {
							var3 = (String)Interpreter.Interpreter_objectStack[--class175.Interpreter_objectStackSize];
							Interpreter.Interpreter_intStackSize -= 2;
							var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = var3.substring(var10, var9);
							return 1;
						} else if (var0 == ScriptOpcodes.REMOVETAGS) {
							var3 = (String)Interpreter.Interpreter_objectStack[--class175.Interpreter_objectStackSize];
							StringBuilder var16 = new StringBuilder(var3.length());
							boolean var18 = false;

							for (var6 = 0; var6 < var3.length(); ++var6) {
								char var7 = var3.charAt(var6);
								if (var7 == '<') {
									var18 = true;
								} else if (var7 == '>') {
									var18 = false;
								} else if (!var18) {
									var16.append(var7);
								}
							}

							Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = var16.toString();
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) {
							var3 = (String)Interpreter.Interpreter_objectStack[--class175.Interpreter_objectStackSize];
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.indexOf(var10);
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) {
							class175.Interpreter_objectStackSize -= 2;
							var3 = (String)Interpreter.Interpreter_objectStack[class175.Interpreter_objectStackSize];
							var4 = (String)Interpreter.Interpreter_objectStack[class175.Interpreter_objectStackSize + 1];
							var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.indexOf(var4, var9);
							return 1;
						} else if (var0 == 4122) {
							var3 = (String)Interpreter.Interpreter_objectStack[--class175.Interpreter_objectStackSize];
							Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = var3.toUpperCase();
							return 1;
						} else if (var0 == 4123) {
							class175.Interpreter_objectStackSize -= 3;
							var3 = (String)Interpreter.Interpreter_objectStack[class175.Interpreter_objectStackSize];
							var4 = (String)Interpreter.Interpreter_objectStack[class175.Interpreter_objectStackSize + 1];
							String var5 = (String)Interpreter.Interpreter_objectStack[class175.Interpreter_objectStackSize + 2];
							if (class152.localPlayer.appearance == null) {
								Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = var5;
								return 1;
							} else {
								switch(class152.localPlayer.appearance.field3915) {
								case 0:
									Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = var3;
									break;
								case 1:
									Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = var4;
									break;
								case 2:
								default:
									Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = var5;
								}

								return 1;
							}
						} else if (var0 == 4124) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class152.localPlayer.appearance != null ? class152.localPlayer.appearance.field3915 : -1;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					class175.Interpreter_objectStackSize -= 2;
					var3 = (String)Interpreter.Interpreter_objectStack[class175.Interpreter_objectStackSize];
					var4 = (String)Interpreter.Interpreter_objectStack[class175.Interpreter_objectStackSize + 1];
					if (class152.localPlayer.appearance != null && class152.localPlayer.appearance.gender != 0) {
						Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = var4;
					} else {
						Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = var3;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("oj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "368561288"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		class182.method3994();
		if (class187.friendsChat != null) {
			class187.friendsChat.invalidateIgnoreds();
		}

	}
}
