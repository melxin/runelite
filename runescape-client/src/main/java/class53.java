import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cg")
public class class53 extends Node {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lbo;"
	)
	class47 field345;

	public class53() {
		this.field345 = null;
	}

	@ObfuscatedSignature(
		descriptor = "(Lcq;)V"
	)
	class53(VorbisSample var1) {
		if (var1 != null) {
			this.field345 = new class47(var1, (RawSound)null);
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Lbj;)V"
	)
	public class53(RawSound var1) {
		this.field345 = new class47((VorbisSample)null, var1);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "52"
	)
	public boolean method1081() {
		return this.field345 == null;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Lbj;",
		garbageValue = "664416979"
	)
	public RawSound method1083() {
		if (this.field345 != null && this.field345.field311.tryLock()) {
			RawSound var1;
			try {
				var1 = this.method1090();
			} finally {
				this.field345.field311.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Lbj;",
		garbageValue = "-40"
	)
	public RawSound method1089() {
		if (this.field345 != null) {
			this.field345.field311.lock();

			RawSound var1;
			try {
				var1 = this.method1090();
			} finally {
				this.field345.field311.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lbj;",
		garbageValue = "897062728"
	)
	RawSound method1090() {
		if (this.field345.field309 == null) {
			this.field345.field309 = this.field345.field312.toRawSound((int[])null);
			this.field345.field312 = null;
		}

		return this.field345.field309;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-266317544"
	)
	@Export("addChatMessage")
	static void addChatMessage(int var0, String var1, String var2, String var3) {
		ChatChannel var4 = (ChatChannel)Messages.Messages_channels.get(var0);
		if (var4 == null) {
			var4 = new ChatChannel();
			Messages.Messages_channels.put(var0, var4);
		}

		Message var5 = var4.addMessage(var0, var1, var2, var3);
		Messages.Messages_hashTable.put(var5, (long)var5.count);
		Messages.Messages_queue.add(var5);
		Client.chatCycle = Client.cycleCntr;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ILdb;ZI)I",
		garbageValue = "1717701354"
	)
	static int method1084(int var0, Script var1, boolean var2) {
		String var3;
		int var10;
		if (var0 == ScriptOpcodes.APPEND_NUM) {
			var3 = Interpreter.Interpreter_stringStack[--class338.Interpreter_stringStackSize];
			var10 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++class338.Interpreter_stringStackSize - 1] = var3 + var10;
			return 1;
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) {
				class338.Interpreter_stringStackSize -= 2;
				var3 = Interpreter.Interpreter_stringStack[class338.Interpreter_stringStackSize];
				var4 = Interpreter.Interpreter_stringStack[class338.Interpreter_stringStackSize + 1];
				Interpreter.Interpreter_stringStack[++class338.Interpreter_stringStackSize - 1] = var3 + var4;
				return 1;
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) {
				var3 = Interpreter.Interpreter_stringStack[--class338.Interpreter_stringStackSize];
				var10 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++class338.Interpreter_stringStackSize - 1] = var3 + WorldView.intToString(var10, true);
				return 1;
			} else if (var0 == ScriptOpcodes.LOWERCASE) {
				var3 = Interpreter.Interpreter_stringStack[--class338.Interpreter_stringStackSize];
				Interpreter.Interpreter_stringStack[++class338.Interpreter_stringStackSize - 1] = var3.toLowerCase();
				return 1;
			} else {
				int var6;
				int var11;
				if (var0 == ScriptOpcodes.FROMDATE) {
					var11 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
					long var14 = 86400000L * (11745L + (long)var11);
					Interpreter.Interpreter_calendar.setTime(new Date(var14));
					var6 = Interpreter.Interpreter_calendar.get(5);
					int var17 = Interpreter.Interpreter_calendar.get(2);
					int var8 = Interpreter.Interpreter_calendar.get(1);
					Interpreter.Interpreter_stringStack[++class338.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8;
					return 1;
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) {
					if (var0 == ScriptOpcodes.TOSTRING) {
						var11 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++class338.Interpreter_stringStackSize - 1] = Integer.toString(var11);
						return 1;
					} else if (var0 == ScriptOpcodes.COMPARE) {
						class338.Interpreter_stringStackSize -= 2;
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = class156.method3534(VarpDefinition.compareStrings(Interpreter.Interpreter_stringStack[class338.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[class338.Interpreter_stringStackSize + 1], class248.clientLanguage));
						return 1;
					} else {
						int var9;
						byte[] var12;
						Font var13;
						if (var0 == ScriptOpcodes.PARAHEIGHT) {
							var3 = Interpreter.Interpreter_stringStack[--class338.Interpreter_stringStackSize];
							AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
							var10 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
							var12 = MouseHandler.archive13.takeFile(var9, 0);
							var13 = new Font(var12);
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var13.lineCount(var3, var10);
							return 1;
						} else if (var0 == ScriptOpcodes.PARAWIDTH) {
							var3 = Interpreter.Interpreter_stringStack[--class338.Interpreter_stringStackSize];
							AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
							var10 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
							var12 = MouseHandler.archive13.takeFile(var9, 0);
							var13 = new Font(var12);
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var13.lineWidth(var3, var10);
							return 1;
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) {
							class338.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[class338.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[class338.Interpreter_stringStackSize + 1];
							if (Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1) {
								Interpreter.Interpreter_stringStack[++class338.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++class338.Interpreter_stringStackSize - 1] = var4;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ESCAPE) {
							var3 = Interpreter.Interpreter_stringStack[--class338.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++class338.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3);
							return 1;
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--class338.Interpreter_stringStackSize];
							var10 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
							Interpreter.Interpreter_stringStack[++class338.Interpreter_stringStackSize - 1] = var3 + (char)var10;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) {
							var11 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = class338.isCharPrintable((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) {
							var11 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = DynamicObject.isAlphaNumeric((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) {
							var11 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = class228.isCharAlphabetic((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) {
							var11 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = WorldMapData_0.isDigit((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) {
							var3 = Interpreter.Interpreter_stringStack[--class338.Interpreter_stringStackSize];
							if (var3 != null) {
								Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.SUBSTRING) {
							var3 = Interpreter.Interpreter_stringStack[--class338.Interpreter_stringStackSize];
							AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
							var10 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
							Interpreter.Interpreter_stringStack[++class338.Interpreter_stringStackSize - 1] = var3.substring(var10, var9);
							return 1;
						} else if (var0 == ScriptOpcodes.REMOVETAGS) {
							var3 = Interpreter.Interpreter_stringStack[--class338.Interpreter_stringStackSize];
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

							Interpreter.Interpreter_stringStack[++class338.Interpreter_stringStackSize - 1] = var16.toString();
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--class338.Interpreter_stringStackSize];
							var10 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.indexOf(var10);
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) {
							class338.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[class338.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[class338.Interpreter_stringStackSize + 1];
							var9 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.indexOf(var4, var9);
							return 1;
						} else if (var0 == 4122) {
							var3 = Interpreter.Interpreter_stringStack[--class338.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++class338.Interpreter_stringStackSize - 1] = var3.toUpperCase();
							return 1;
						} else if (var0 == 4123) {
							class338.Interpreter_stringStackSize -= 3;
							var3 = Interpreter.Interpreter_stringStack[class338.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[class338.Interpreter_stringStackSize + 1];
							String var5 = Interpreter.Interpreter_stringStack[class338.Interpreter_stringStackSize + 2];
							if (Script.localPlayer.appearance == null) {
								Interpreter.Interpreter_stringStack[++class338.Interpreter_stringStackSize - 1] = var5;
								return 1;
							} else {
								switch(Script.localPlayer.appearance.field3886) {
								case 0:
									Interpreter.Interpreter_stringStack[++class338.Interpreter_stringStackSize - 1] = var3;
									break;
								case 1:
									Interpreter.Interpreter_stringStack[++class338.Interpreter_stringStackSize - 1] = var4;
									break;
								case 2:
								default:
									Interpreter.Interpreter_stringStack[++class338.Interpreter_stringStackSize - 1] = var5;
								}

								return 1;
							}
						} else if (var0 == 4124) {
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Script.localPlayer.appearance != null ? Script.localPlayer.appearance.field3886 : -1;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					class338.Interpreter_stringStackSize -= 2;
					var3 = Interpreter.Interpreter_stringStack[class338.Interpreter_stringStackSize];
					var4 = Interpreter.Interpreter_stringStack[class338.Interpreter_stringStackSize + 1];
					if (Script.localPlayer.appearance != null && Script.localPlayer.appearance.gender != 0) {
						Interpreter.Interpreter_stringStack[++class338.Interpreter_stringStackSize - 1] = var4;
					} else {
						Interpreter.Interpreter_stringStack[++class338.Interpreter_stringStackSize - 1] = var3;
					}

					return 1;
				}
			}
		}
	}
}
