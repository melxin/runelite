import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hl")
@Implements("KitDefinition")
public class KitDefinition extends DualNode {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -138829131
	)
	@Export("KitDefinition_fileCount")
	public static int KitDefinition_fileCount;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("KitDefinition_cached")
	public static EvictingDualNodeHashTable KitDefinition_cached;
	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "Lbi;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("aq")
	@Export("models2")
	int[] models2;
	@ObfuscatedName("ac")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("aa")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("ap")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("ad")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("av")
	@Export("models")
	int[] models;
	@ObfuscatedName("as")
	@Export("nonSelectable")
	public boolean nonSelectable;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 131604417
	)
	@Export("bodypartID")
	int bodypartID;

	static {
		KitDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	public KitDefinition() {
		this.models = new int[]{-1, -1, -1, -1, -1};
		this.nonSelectable = false;
		this.bodypartID = -1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "424610129"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lwj;II)V",
		garbageValue = "-2013665516"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.bodypartID = var1.readUnsignedByte();
		} else {
			int var3;
			int var4;
			if (var2 == 2) {
				var3 = var1.readUnsignedByte();
				this.models2 = new int[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.models2[var4] = var1.readUnsignedShort();
				}
			} else if (var2 == 3) {
				this.nonSelectable = true;
			} else if (var2 == 40) {
				var3 = var1.readUnsignedByte();
				this.recolorFrom = new short[var3];
				this.recolorTo = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.recolorFrom[var4] = (short)var1.readUnsignedShort();
					this.recolorTo[var4] = (short)var1.readUnsignedShort();
				}
			} else if (var2 == 41) {
				var3 = var1.readUnsignedByte();
				this.retextureFrom = new short[var3];
				this.retextureTo = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.retextureFrom[var4] = (short)var1.readUnsignedShort();
					this.retextureTo[var4] = (short)var1.readUnsignedShort();
				}
			} else if (var2 >= 60 && var2 < 70) {
				this.models[var2 - 60] = var1.readUnsignedShort();
			}
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "8"
	)
	public boolean method4266(int var1, int var2) {
		if (var2 == 1) {
			return this.bodypartID == var1 + 7;
		} else {
			return this.bodypartID == var1;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1564461010"
	)
	@Export("ready")
	public boolean ready() {
		if (this.models2 == null) {
			return true;
		} else {
			boolean var1 = true;

			for (int var2 = 0; var2 < this.models2.length; ++var2) {
				if (!Sound.KitDefinition_modelsArchive.tryLoadFile(this.models2[var2], 0)) {
					var1 = false;
				}
			}

			return var1;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lib;",
		garbageValue = "-444664212"
	)
	@Export("getModelData")
	public ModelData getModelData() {
		if (this.models2 == null) {
			return null;
		} else {
			ModelData[] var1 = new ModelData[this.models2.length];

			for (int var2 = 0; var2 < this.models2.length; ++var2) {
				var1[var2] = ModelData.ModelData_get(Sound.KitDefinition_modelsArchive, this.models2[var2], 0);
			}

			ModelData var4;
			if (var1.length == 1) {
				var4 = var1[0];
			} else {
				var4 = new ModelData(var1, var1.length);
			}

			int var3;
			if (this.recolorFrom != null) {
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) {
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]);
				}
			}

			if (this.retextureFrom != null) {
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) {
					var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1746675969"
	)
	public boolean method4273() {
		boolean var1 = true;

		for (int var2 = 0; var2 < 5; ++var2) {
			if (this.models[var2] != -1 && !Sound.KitDefinition_modelsArchive.tryLoadFile(this.models[var2], 0)) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Lib;",
		garbageValue = "24"
	)
	@Export("getKitDefinitionModels")
	public ModelData getKitDefinitionModels() {
		ModelData[] var1 = new ModelData[5];
		int var2 = 0;

		for (int var3 = 0; var3 < 5; ++var3) {
			if (this.models[var3] != -1) {
				var1[var2++] = ModelData.ModelData_get(Sound.KitDefinition_modelsArchive, this.models[var3], 0);
			}
		}

		ModelData var5 = new ModelData(var1, var2);
		int var4;
		if (this.recolorFrom != null) {
			for (var4 = 0; var4 < this.recolorFrom.length; ++var4) {
				var5.recolor(this.recolorFrom[var4], this.recolorTo[var4]);
			}
		}

		if (this.retextureFrom != null) {
			for (var4 = 0; var4 < this.retextureFrom.length; ++var4) {
				var5.retexture(this.retextureFrom[var4], this.retextureTo[var4]);
			}
		}

		return var5;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwj;Ljava/lang/String;B)I",
		garbageValue = "0"
	)
	public static int method4297(Buffer var0, String var1) {
		int var2 = var0.offset;
		int var4 = var1.length();
		byte[] var5 = new byte[var4];

		for (int var6 = 0; var6 < var4; ++var6) {
			char var7 = var1.charAt(var6);
			if ((var7 <= 0 || var7 >= 128) && (var7 < 160 || var7 > 255)) {
				if (var7 == 8364) {
					var5[var6] = -128;
				} else if (var7 == 8218) {
					var5[var6] = -126;
				} else if (var7 == 402) {
					var5[var6] = -125;
				} else if (var7 == 8222) {
					var5[var6] = -124;
				} else if (var7 == 8230) {
					var5[var6] = -123;
				} else if (var7 == 8224) {
					var5[var6] = -122;
				} else if (var7 == 8225) {
					var5[var6] = -121;
				} else if (var7 == 710) {
					var5[var6] = -120;
				} else if (var7 == 8240) {
					var5[var6] = -119;
				} else if (var7 == 352) {
					var5[var6] = -118;
				} else if (var7 == 8249) {
					var5[var6] = -117;
				} else if (var7 == 338) {
					var5[var6] = -116;
				} else if (var7 == 381) {
					var5[var6] = -114;
				} else if (var7 == 8216) {
					var5[var6] = -111;
				} else if (var7 == 8217) {
					var5[var6] = -110;
				} else if (var7 == 8220) {
					var5[var6] = -109;
				} else if (var7 == 8221) {
					var5[var6] = -108;
				} else if (var7 == 8226) {
					var5[var6] = -107;
				} else if (var7 == 8211) {
					var5[var6] = -106;
				} else if (var7 == 8212) {
					var5[var6] = -105;
				} else if (var7 == 732) {
					var5[var6] = -104;
				} else if (var7 == 8482) {
					var5[var6] = -103;
				} else if (var7 == 353) {
					var5[var6] = -102;
				} else if (var7 == 8250) {
					var5[var6] = -101;
				} else if (var7 == 339) {
					var5[var6] = -100;
				} else if (var7 == 382) {
					var5[var6] = -98;
				} else if (var7 == 376) {
					var5[var6] = -97;
				} else {
					var5[var6] = 63;
				}
			} else {
				var5[var6] = (byte)var7;
			}
		}

		var0.writeSmartByteShort(var5.length);
		var0.offset += class373.huffman.compress(var5, 0, var5.length, var0.array, var0.offset);
		return var0.offset - var2;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILcj;ZB)I",
		garbageValue = "33"
	)
	static int method4299(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = class35.widgetDefinition.method7496(Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? class359.scriptDotWidget : GameEngine.scriptActiveWidget;
		}

		class154.invalidateWidget(var3);
		int var4;
		int var5;
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) {
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) {
				var3.modelType = 2;
				var3.modelId = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) {
				var3.modelType = 3;
				var3.modelId = class159.localPlayer.appearance.getChatHeadId();
				return 1;
			} else if (var0 == 1207) {
				boolean var7 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
				var3.method8094(class159.localPlayer.appearance, var7);
				return 1;
			} else if (var0 == 1208) {
				var4 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
				if (var3.field4233 == null) {
					throw new RuntimeException("");
				} else {
					var3.field4233.method7552(var4);
					return 1;
				}
			} else if (var0 == 1209) {
				UrlRequest.Interpreter_intStackSize -= 2;
				var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
				var5 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
				if (var3.field4233 == null) {
					throw new RuntimeException("");
				} else {
					var3.field4233.method7551(var4, var5);
					return 1;
				}
			} else if (var0 == 1210) {
				var4 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
				if (var3.field4233 == null) {
					throw new RuntimeException("");
				} else {
					var3.field4233.method7549(class159.localPlayer.appearance.gender, var4);
					return 1;
				}
			} else if (var0 == 1214) {
				var3.modelType = 8;
				var3.modelId = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
				return 1;
			} else if (var0 == 1215) {
				var3.modelType = 9;
				var3.modelId = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
				return 1;
			} else {
				return 2;
			}
		} else {
			UrlRequest.Interpreter_intStackSize -= 2;
			var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
			var5 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
			var3.itemId = var4;
			var3.itemQuantity = var5;
			ItemComposition var6 = WorldMapIcon_1.ItemDefinition_get(var4);
			var3.modelAngleX = var6.xan2d;
			var3.modelAngleY = var6.yan2d;
			var3.modelAngleZ = var6.zan2d;
			var3.modelOffsetX = var6.offsetX2d;
			var3.modelOffsetY = var6.offsetY2d;
			var3.modelZoom = var6.zoom2d;
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) {
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | var6.isStackable == 1) {
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2;
			}

			if (var3.field4196 > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.field4196;
			} else if (var3.rawWidth > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1;
		}
	}

	@ObfuscatedName("pq")
	@ObfuscatedSignature(
		descriptor = "(IB)Lwa;",
		garbageValue = "-31"
	)
	@Export("getDbTable2")
	static DbTable getDbTable2(int var0) {
		DbTable var1 = (DbTable)Client.archive11.get((long)var0);
		if (var1 == null) {
			var1 = new DbTable(WorldMapSprite.field3462, var0);
		}

		return var1;
	}
}
