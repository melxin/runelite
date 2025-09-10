import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cu")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1081489017
	)
	@Export("group")
	int group;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1117596947
	)
	@Export("type")
	int type;
	@ObfuscatedName("at")
	boolean field887;

	InterfaceParent() {
		this.field887 = false;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1740673703"
	)
	static void method2132() {
		Login.Login_username = Login.Login_username.trim();
		if (Login.Login_username.isEmpty()) {
			MouseRecorder.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
		} else {
			long var1;
			try {
				URL var3 = new URL(FloorOverlayDefinition.method4756("services", false) + "m=accountappeal/login.ws");
				URLConnection var4 = var3.openConnection();
				var4.setRequestProperty("connection", "close");
				var4.setDoInput(true);
				var4.setDoOutput(true);
				var4.setConnectTimeout(5000);
				OutputStreamWriter var5 = new OutputStreamWriter(var4.getOutputStream());
				var5.write("data1=req");
				var5.flush();
				InputStream var6 = var4.getInputStream();
				Buffer var7 = new Buffer(new byte[1000]);

				while (true) {
					int var8 = var6.read(var7.array, var7.offset * 1216585693, 1000 - var7.offset * 1216585693);
					if (var8 == -1) {
						var7.offset = 0;
						long var10 = var7.readLong();
						var1 = var10;
						break;
					}

					var7.offset += -290410379 * var8;
					if (var7.offset * 1216585693 >= 1000) {
						var1 = 0L;
						break;
					}
				}
			} catch (Exception var14) {
				var1 = 0L;
			}

			int var0;
			if (var1 == 0L) {
				var0 = 5;
			} else {
				var0 = WorldMapSection0.method6767(var1, Login.Login_username);
			}

			switch(var0) {
			case 2:
				MouseRecorder.setLoginResponseString(Strings.field4745, Strings.field4793, Strings.field4747);
				ClientPreferences.method2677(6);
				break;
			case 3:
				MouseRecorder.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 4:
				MouseRecorder.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
				break;
			case 5:
				MouseRecorder.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
				break;
			case 6:
				MouseRecorder.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 7:
				MouseRecorder.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
			}

		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ILcg;ZI)I",
		garbageValue = "-1914793075"
	)
	static int method2131(int var0, Script var1, boolean var2) {
		String var3;
		int var10;
		if (var0 == ScriptOpcodes.APPEND_NUM) {
			var3 = (String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
			var10 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
			Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var3 + var10;
			return 1;
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) {
				Interpreter.Interpreter_objectStackSize -= 2;
				var3 = (String)Interpreter.Interpreter_objectStack[Interpreter.Interpreter_objectStackSize];
				var4 = (String)Interpreter.Interpreter_objectStack[Interpreter.Interpreter_objectStackSize + 1];
				Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var3 + var4;
				return 1;
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) {
				var3 = (String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
				var10 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
				Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var3 + WallDecoration.intToString(var10, true);
				return 1;
			} else if (var0 == ScriptOpcodes.LOWERCASE) {
				var3 = (String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
				Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var3.toLowerCase();
				return 1;
			} else {
				int var6;
				int var11;
				if (var0 == ScriptOpcodes.FROMDATE) {
					var11 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
					long var14 = (11745L + (long)var11) * 86400000L;
					Interpreter.Interpreter_calendar.setTime(new Date(var14));
					var6 = Interpreter.Interpreter_calendar.get(5);
					int var17 = Interpreter.Interpreter_calendar.get(2);
					int var8 = Interpreter.Interpreter_calendar.get(1);
					Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8;
					return 1;
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) {
					if (var0 == ScriptOpcodes.TOSTRING) {
						var11 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
						Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = Integer.toString(var11);
						return 1;
					} else if (var0 == ScriptOpcodes.COMPARE) {
						Interpreter.Interpreter_objectStackSize -= 2;
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = class30.method472(WorldMapSection2.compareStrings((String)Interpreter.Interpreter_objectStack[Interpreter.Interpreter_objectStackSize], (String)Interpreter.Interpreter_objectStack[Interpreter.Interpreter_objectStackSize + 1], ViewportMouse.clientLanguage));
						return 1;
					} else {
						int var9;
						byte[] var12;
						Font var13;
						if (var0 == ScriptOpcodes.PARAHEIGHT) {
							var3 = (String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
							UserComparator7.Interpreter_intStackSize -= 2;
							var10 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
							var12 = class145.archive13.takeFile(var9, 0);
							var13 = new Font(var12);
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var13.lineCount(var3, var10);
							return 1;
						} else if (var0 == ScriptOpcodes.PARAWIDTH) {
							var3 = (String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
							UserComparator7.Interpreter_intStackSize -= 2;
							var10 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
							var12 = class145.archive13.takeFile(var9, 0);
							var13 = new Font(var12);
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var13.lineWidth(var3, var10);
							return 1;
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) {
							Interpreter.Interpreter_objectStackSize -= 2;
							var3 = (String)Interpreter.Interpreter_objectStack[Interpreter.Interpreter_objectStackSize];
							var4 = (String)Interpreter.Interpreter_objectStack[Interpreter.Interpreter_objectStackSize + 1];
							if (Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1) {
								Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var4;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ESCAPE) {
							var3 = (String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
							Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = AbstractFont.escapeBrackets(var3);
							return 1;
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) {
							var3 = (String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
							var10 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
							Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var3 + (char)var10;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) {
							var11 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = class363.isCharPrintable((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) {
							var11 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = ModelData0.isAlphaNumeric((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) {
							var11 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = class269.isCharAlphabetic((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) {
							var11 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = class406.isDigit((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) {
							var3 = (String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
							if (var3 != null) {
								Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.SUBSTRING) {
							var3 = (String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
							UserComparator7.Interpreter_intStackSize -= 2;
							var10 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
							Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var3.substring(var10, var9);
							return 1;
						} else if (var0 == ScriptOpcodes.REMOVETAGS) {
							var3 = (String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
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

							Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var16.toString();
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) {
							var3 = (String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
							var10 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.indexOf(var10);
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) {
							Interpreter.Interpreter_objectStackSize -= 2;
							var3 = (String)Interpreter.Interpreter_objectStack[Interpreter.Interpreter_objectStackSize];
							var4 = (String)Interpreter.Interpreter_objectStack[Interpreter.Interpreter_objectStackSize + 1];
							var9 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.indexOf(var4, var9);
							return 1;
						} else if (var0 == 4122) {
							var3 = (String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
							Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var3.toUpperCase();
							return 1;
						} else if (var0 == 4123) {
							Interpreter.Interpreter_objectStackSize -= 3;
							var3 = (String)Interpreter.Interpreter_objectStack[Interpreter.Interpreter_objectStackSize];
							var4 = (String)Interpreter.Interpreter_objectStack[Interpreter.Interpreter_objectStackSize + 1];
							String var5 = (String)Interpreter.Interpreter_objectStack[Interpreter.Interpreter_objectStackSize + 2];
							if (HealthBarUpdate.localPlayer.appearance == null) {
								Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var5;
								return 1;
							} else {
								switch(HealthBarUpdate.localPlayer.appearance.field4083) {
								case 0:
									Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var3;
									break;
								case 1:
									Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var4;
									break;
								case 2:
								default:
									Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var5;
								}

								return 1;
							}
						} else if (var0 == 4124) {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = HealthBarUpdate.localPlayer.appearance != null ? HealthBarUpdate.localPlayer.appearance.field4083 : -1;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					Interpreter.Interpreter_objectStackSize -= 2;
					var3 = (String)Interpreter.Interpreter_objectStack[Interpreter.Interpreter_objectStackSize];
					var4 = (String)Interpreter.Interpreter_objectStack[Interpreter.Interpreter_objectStackSize + 1];
					if (HealthBarUpdate.localPlayer.appearance != null && HealthBarUpdate.localPlayer.appearance.gender != 0) {
						Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var4;
					} else {
						Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var3;
					}

					return 1;
				}
			}
		}
	}
}
