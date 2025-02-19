import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gh")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -894369249
	)
	public static int field1924;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("VarpDefinition_cached")
	public static EvictingDualNodeHashTable VarpDefinition_cached;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1595510719
	)
	@Export("type")
	public int type;

	static {
		VarpDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	VarpDefinition() {
		this.type = 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvy;B)V",
		garbageValue = "-11"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				this.method3775();
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lvy;II)V",
		garbageValue = "888885626"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 5) {
			this.type = var1.readUnsignedShort();
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1495645825"
	)
	void method3775() {
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1198480394"
	)
	public static void method3780() {
		InvDefinition.InvDefinition_cached.clear();
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(ILdy;ZB)I",
		garbageValue = "-56"
	)
	static int method3787(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) {
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = class521.loadWorlds() ? 1 : 0;
			return 1;
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) {
				var9 = AbstractWorldMapIcon.worldListStart();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) {
				var9 = GrandExchangeOfferNameComparator.getNextWorldListWorld();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) {
					var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
					var7 = null;

					for (var8 = 0; var8 < World.World_count; ++var8) {
						if (var3 == GZipDecompressor.World_worlds[var8].id) {
							var7 = GZipDecompressor.World_worlds[var8];
							break;
						}
					}

					if (var7 != null) {
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) {
					HealthBarConfig.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
					boolean var10 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1] == 1;
					var8 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 2];
					boolean var6 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 3] == 1;
					WorldMapData_1.sortWorldList(var3, var10, var8, var6);
					return 1;
				} else if (var0 != 6511) {
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) {
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize] == 1;
						return 1;
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) {
							HealthBarConfig.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
							var5 = class140.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class91.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = class91.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.LC_PARAM) {
							HealthBarConfig.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
							var5 = class140.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class177.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = class177.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.OC_PARAM) {
							HealthBarConfig.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
							var5 = class140.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class138.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = class138.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) {
							HealthBarConfig.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
							var5 = class140.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = StructComposition.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = StructComposition.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ON_MOBILE) {
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) {
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Client.clientType;
							return 1;
						} else if (var0 == 6520) {
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) {
							return 1;
						} else if (var0 == 6522) {
							--Interpreter.Interpreter_stringStackSize;
							--HealthBarConfig.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 6523) {
							--Interpreter.Interpreter_stringStackSize;
							--HealthBarConfig.Interpreter_intStackSize;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) {
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) {
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) {
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == 6527) {
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Client.field517;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
					if (var3 >= 0 && var3 < World.World_count) {
						var7 = GZipDecompressor.World_worlds[var3];
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(Ldp;IIIIII)V",
		garbageValue = "-701490452"
	)
	@Export("worldToScreen")
	static void worldToScreen(WorldView var0, int var1, int var2, int var3, int var4, int var5) {
		if (var1 >= 128 && 13056 >= var1 && var2 >= 128 && 13056 >= var2) {
			int var6 = DevicePcmPlayerProvider.getTileHeight(var0, var3, var4, var0.plane) - var5;
			var1 -= class181.cameraX;
			var6 -= GrandExchangeOfferUnitPriceComparator.cameraY;
			var2 -= ApproximateRouteStrategy.cameraZ;
			int var7 = Rasterizer3D.Rasterizer3D_sine[class59.cameraPitch];
			int var8 = Rasterizer3D.Rasterizer3D_cosine[class59.cameraPitch];
			int var9 = Rasterizer3D.Rasterizer3D_sine[FloorDecoration.cameraYaw];
			int var10 = Rasterizer3D.Rasterizer3D_cosine[FloorDecoration.cameraYaw];
			int var11 = var9 * var2 + var10 * var1 >> 16;
			var2 = var10 * var2 - var9 * var1 >> 16;
			var1 = var11;
			var11 = var6 * var8 - var7 * var2 >> 16;
			var2 = var8 * var2 + var6 * var7 >> 16;
			if (var2 >= 50) {
				Client.viewportTempX = Client.viewportWidth / 2 + Client.viewportZoom * var1 / var2;
				Client.viewportTempY = Client.viewportHeight / 2 + var11 * Client.viewportZoom / var2;
			} else {
				Client.viewportTempX = -1;
				Client.viewportTempY = -1;
			}

		} else {
			Client.viewportTempX = -1;
			Client.viewportTempY = -1;
		}
	}
}
