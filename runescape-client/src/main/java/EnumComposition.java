import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hb")
@Implements("EnumComposition")
public class EnumComposition extends DualNode {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	@Export("EnumDefinition_archive")
	public static AbstractArchive EnumDefinition_archive;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("EnumDefinition_cached")
	static EvictingDualNodeHashTable EnumDefinition_cached;
	@ObfuscatedName("ai")
	public static int field2063;
	@ObfuscatedName("as")
	@Export("osName")
	static String osName;
	@ObfuscatedName("ag")
	@Export("inputType")
	public char inputType;
	@ObfuscatedName("an")
	@Export("outputType")
	public char outputType;
	@ObfuscatedName("ae")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1780171489
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -132553189
	)
	@Export("outputCount")
	public int outputCount;
	@ObfuscatedName("aw")
	@Export("keys")
	public int[] keys;
	@ObfuscatedName("ap")
	@Export("intVals")
	public int[] intVals;
	@ObfuscatedName("ay")
	@Export("strVals")
	public String[] strVals;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	DynamicArray field2069;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	DynamicArray field2073;

	static {
		EnumDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	EnumComposition() {
		this.defaultStr = "null";
		this.outputCount = 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxa;B)V",
		garbageValue = "85"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lxa;IB)V",
		garbageValue = "46"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.inputType = (char)var1.readUnsignedByte();
		} else if (var2 == 2) {
			this.outputType = (char)var1.readUnsignedByte();
		} else if (var2 == 3) {
			this.defaultStr = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.defaultInt = var1.readInt();
		} else {
			int var3;
			if (var2 == 5) {
				this.outputCount = var1.readUnsignedShort();
				this.keys = new int[this.outputCount];
				this.strVals = new String[this.outputCount];

				for (var3 = 0; var3 < this.outputCount; ++var3) {
					this.keys[var3] = var1.readInt();
					this.strVals[var3] = var1.readStringCp1252NullTerminated();
				}
			} else if (var2 == 6) {
				this.outputCount = var1.readUnsignedShort();
				this.keys = new int[this.outputCount];
				this.intVals = new int[this.outputCount];

				for (var3 = 0; var3 < this.outputCount; ++var3) {
					this.keys[var3] = var1.readInt();
					this.intVals[var3] = var1.readInt();
				}
			}
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "89055037"
	)
	@Export("size")
	public int size() {
		return this.outputCount;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Lut;",
		garbageValue = "1579342349"
	)
	public DynamicArray method4427() {
		if (this.field2069 == null) {
			int[] var2 = this.keys;
			DynamicArray var3 = new DynamicArray(class586.field5937, false);
			var3.array = var2;
			var3.size = var2.length * -1205286309;
			var3.field5587 = var2.length;
			this.field2069 = var3;
		}

		return this.field2069;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lut;",
		garbageValue = "-1693502457"
	)
	public DynamicArray method4428() {
		if (this.field2073 == null) {
			DynamicArray var3;
			if (this.outputType == 's') {
				String[] var2 = this.strVals;
				var3 = new DynamicArray(class586.field5939, false);
				var3.field5586 = var2;
				var3.size = var2.length * -1205286309;
				var3.field5587 = var2.length;
				this.field2073 = var3;
			} else {
				int[] var4 = this.intVals;
				var3 = new DynamicArray(class586.field5937, false);
				var3.array = var4;
				var3.size = var4.length * -1205286309;
				var3.field5587 = var4.length;
				this.field2073 = var3;
			}
		}

		return this.field2073;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)Lcu;",
		garbageValue = "1410068873"
	)
	@Export("getScript")
	static Script getScript(int var0, int var1) {
		Script var2 = (Script)Script.Script_cached.get((long)(var0 << 16));
		if (var2 != null) {
			return var2;
		} else {
			String var3 = String.valueOf(var0);
			int var4 = WorldMapRectangle.archive12.getGroupId(var3);
			if (var4 == -1) {
				return null;
			} else {
				byte[] var5 = WorldMapRectangle.archive12.takeFileFlat(var4);
				if (var5 != null) {
					if (var5.length <= 1) {
						return null;
					}

					var2 = UserComparator3.newScript(var5);
					if (var2 != null) {
						Script.Script_cached.put(var2, (long)(var0 << 16));
						return var2;
					}
				}

				return null;
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILcu;ZB)I",
		garbageValue = "0"
	)
	static int method4440(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETX) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETY) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.width * -1946208531;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.height * -905446999;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else if (var0 != 1506) {
			return 2;
		} else {
			int var4 = var3.parentId;
			if (var4 == -1) {
				for (InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.first(); var5 != null; var5 = (InterfaceParent)Client.interfaceParents.next()) {
					if (var3.id >> 16 == var5.group) {
						var4 = (int)var5.key;
						break;
					}
				}
			}

			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var4;
			return 1;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lbn;I)V",
		garbageValue = "-1579678277"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) {
			Client.isMembersWorld = var0.isMembersOnly();
			class189.method4412(var0.isMembersOnly());
		}

		if (var0.properties != Client.worldProperties) {
			Archive var1 = class147.archive8;
			int var2 = var0.properties;
			if ((var2 & class594.field5995.rsOrdinal()) != 0) {
				class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "");
			} else if ((var2 & class594.field5996.rsOrdinal()) != 0) {
				class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "");
			} else if ((var2 & class594.field5986.rsOrdinal()) != 0) {
				class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "logo_speedrunning", "");
			} else if ((var2 & class594.field5976.rsOrdinal()) != 0) {
				class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "logo_ugc_world", "");
			} else {
				class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "logo", "");
			}
		}

		DynamicArray.worldHost = var0.host;
		Client.worldId = var0.id;
		Client.worldProperties = var0.properties;
		class365.field4083 = var0.field590;
		WorldMapLabel.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000;
		class532.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000;
		class46.currentPort = WorldMapLabel.worldPort;
	}

	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)Ljava/lang/String;",
		garbageValue = "712653874"
	)
	static String method4451(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://";
		if (Client.gameBuild == 1) {
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) {
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) {
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) {
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) {
			var0 = "local";
		}

		String var3 = "";
		if (class39.field241 != null) {
			var3 = "/p=" + class39.field241;
		}

		String var4 = "runescape.com";
		return var2 + var0 + "." + var4 + "/l=" + class352.clientLanguage + "/a=" + class570.field5884 + var3 + "/";
	}
}
