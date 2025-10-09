import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hf")
public class class199 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lhf;"
	)
	static final class199 field2168;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lhf;"
	)
	static final class199 field2167;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lhf;"
	)
	static final class199 field2165;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lhf;"
	)
	static final class199 field2164;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lhf;"
	)
	static final class199 field2169;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lhf;"
	)
	static final class199 field2166;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lhf;"
	)
	static final class199 field2170;
	@ObfuscatedName("ac")
	static int[] field2172;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;
	@ObfuscatedName("li")
	@ObfuscatedGetter(
		intValue = 969909717
	)
	@Export("currentPort")
	static int currentPort;
	@ObfuscatedName("pe")
	@ObfuscatedSignature(
		descriptor = "[Lxl;"
	)
	static SpritePixels[] field2176;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1108104253
	)
	final int field2173;

	static {
		field2168 = new class199(0);
		field2167 = new class199(1);
		field2165 = new class199(2);
		field2164 = new class199(3);
		field2169 = new class199(4);
		field2166 = new class199(5);
		field2170 = new class199(6);
		field2172 = null;
	}

	class199(int var1) {
		this.field2173 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	static void method4468() {
		field2172 = new int[7];
		field2172[field2168.field2173] = class215.field2503.field2504;
		field2172[field2167.field2173] = class215.field2506.field2504;
		field2172[field2165.field2173] = class215.field2499.field2504;
		field2172[field2164.field2173] = class215.field2502.field2504;
		field2172[field2169.field2173] = class215.field2497.field2504;
		field2172[field2166.field2173] = class215.field2495.field2504;
		field2172[field2170.field2173] = class215.field2501.field2504;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-815593112"
	)
	public static int method4469(int var0) {
		if (field2172 == null) {
			method4468();
		}

		return field2172[var0];
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-285926163"
	)
	static final boolean method4474(int var0) {
		return var0 == 16 || var0 == 17 || var0 >= 18 && var0 <= 22;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)[Lhv;",
		garbageValue = "2137566911"
	)
	static HorizontalAlignment[] method4471() {
		return new HorizontalAlignment[]{HorizontalAlignment.field2072, HorizontalAlignment.field2076, HorizontalAlignment.HorizontalAlignment_centered};
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ILcj;ZB)I",
		garbageValue = "-95"
	)
	static int method4475(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Message.loadWorlds() ? 1 : 0;
			return 1;
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) {
				var9 = class180.worldListStart();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) {
				var9 = class546.getNextWorldListWorld();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
				}

				return 1;
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) {
					var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
					var7 = null;

					for (var8 = 0; var8 < World.World_count; ++var8) {
						if (var3 == World.World_worlds[var8].id) {
							var7 = World.World_worlds[var8];
							break;
						}
					}

					if (var7 != null) {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) {
					UrlRequest.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
					boolean var10 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1] == 1;
					var8 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 2];
					boolean var6 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 3] == 1;
					WorldView.sortWorldList(var3, var10, var8, var6);
					return 1;
				} else if (var0 != 6511) {
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) {
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
						return 1;
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) {
							UrlRequest.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
							var5 = VarpDefinition.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = class81.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = class81.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.LC_PARAM) {
							UrlRequest.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
							var5 = VarpDefinition.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = TileItem.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = TileItem.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.OC_PARAM) {
							UrlRequest.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
							var5 = VarpDefinition.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = WorldMapIcon_1.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = WorldMapIcon_1.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) {
							UrlRequest.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
							var5 = VarpDefinition.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = PacketWriter.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = PacketWriter.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ON_MOBILE) {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Client.clientType;
							return 1;
						} else if (var0 == 6520) {
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) {
							return 1;
						} else if (var0 == 6522) {
							--Message.Interpreter_objectStackSize;
							--UrlRequest.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 6523) {
							--Message.Interpreter_objectStackSize;
							--UrlRequest.Interpreter_intStackSize;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == 6527) {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Client.field370;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
					if (var3 >= 0 && var3 < World.World_count) {
						var7 = World.World_worlds[var3];
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1954481355"
	)
	static final void method4473() {
		if (Client.logoutTimer > 0) {
			WorldMapElement.logOut();
		} else {
			Client.timer.method8292();
			class135.updateGameState(40);
			class386.field4470 = Client.packetWriter.getSocket();
			Client.packetWriter.removeSocket();
		}
	}
}
