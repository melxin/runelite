import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hy")
public class class182 extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("field1864")
	public static EvictingDualNodeHashTable field1864;
	@ObfuscatedName("af")
	public static short[] field1879;
	@ObfuscatedName("ai")
	public static short[][] field1880;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "[Lvy;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;

	static {
		field1864 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("aw")
	static boolean method3770(long var0) {
		return class288.method6120(var0) == 2;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	@Export("clearItemContainer")
	static void clearItemContainer(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.ids.length; ++var2) {
				var1.ids[var2] = -1;
				var1.quantities[var2] = 0;
			}

		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ldm;Lvj;IIIIIIB)V",
		garbageValue = "40"
	)
	@Export("loadTerrain")
	static final void loadTerrain(WorldView var0, Buffer var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int[][][] var8 = var0.tileHeights;
		byte[][][] var9 = var0.tileSettings;
		int var10;
		if (var2 >= 0 && var2 < 4 && var3 >= 0 && var3 < var8[0].length - 1 && var4 >= 0 && var4 < var8[0][0].length - 1) {
			var9[var2][var3][var4] = 0;

			while (true) {
				var10 = var1.readUnsignedShort();
				if (var10 == 0) {
					if (var2 == 0) {
						int[] var17 = var8[0][var3];
						int var14 = var5 + 932731;
						int var15 = var6 + 556238;
						int var16 = class384.method7491(var14 + 45365, 91923 + var15, 4) - 128 + (class384.method7491(var14 + 10294, var15 + 37821, 2) - 128 >> 1) + (class384.method7491(var14, var15, 1) - 128 >> 2);
						var16 = (int)((double)var16 * 0.3D) + 35;
						if (var16 < 10) {
							var16 = 10;
						} else if (var16 > 60) {
							var16 = 60;
						}

						var17[var4] = -var16 * 8;
					} else {
						var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - 240;
					}
					break;
				}

				if (var10 == 1) {
					int var11 = var1.readUnsignedByte();
					if (var11 == 1) {
						var11 = 0;
					}

					if (var2 == 0) {
						var8[0][var3][var4] = -var11 * 8;
					} else {
						var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - var11 * 8;
					}
					break;
				}

				if (var10 <= 49) {
					ModelData0.Tiles_overlays[var2][var3][var4] = (short)var1.readShort();
					class110.Tiles_shapes[var2][var3][var4] = (byte)((var10 - 2) / 4);
					Tiles.field1038[var2][var3][var4] = (byte)(var10 - 2 + var7 & 3);
				} else if (var10 <= 81) {
					var9[var2][var3][var4] = (byte)(var10 - 49);
				} else {
					class277.Tiles_underlays[var2][var3][var4] = (short)(var10 - 81);
				}
			}
		} else {
			while (true) {
				var10 = var1.readUnsignedShort();
				if (var10 == 0) {
					break;
				}

				if (var10 == 1) {
					var1.readUnsignedByte();
					break;
				}

				if (var10 <= 49) {
					var1.readShort();
				}
			}
		}

	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "1768420193"
	)
	static int method3773(int var0, Script var1, boolean var2) {
		int var3;
		Object var4;
		int var5;
		DbTable var6;
		int var7;
		if (var0 != ScriptOpcodes.DB_FIND_WITH_COUNT && var0 != ScriptOpcodes.DB_FIND) {
			if (var0 != ScriptOpcodes.DB_FINDNEXT) {
				int var19;
				int var20;
				if (var0 == ScriptOpcodes.DB_GETFIELD) {
					PrivateChatMode.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
					var19 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 2];
					var20 = class73.method2234(var19);
					var7 = class179.method3750(var19);
					int var21 = Skeleton.method4873(var19);
					DbRowType var26 = class362.getDbRowType(var3);
					DbTableType var27 = ItemComposition.getDbTableType(var20);
					int[] var28 = var27.types[var7];
					int var12 = 0;
					int var13 = var28.length;
					if (var21 >= 0) {
						if (var21 >= var13) {
							throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var21 + ", Max: " + var13);
						}

						var12 = var21;
						var13 = var21 + 1;
					}

					Object[] var14 = var26.getColumnType(var7);
					if (var14 == null && var27.defaultValues != null) {
						var14 = var27.defaultValues[var7];
					}

					int var15;
					int var16;
					if (var14 == null) {
						for (var15 = var12; var15 < var13; ++var15) {
							var16 = var28[var15];
							class544 var22 = TextureProvider.method5186(var16);
							if (var22 == class544.field5399) {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							} else {
								Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = VertexNormal.method5429(var16);
							}
						}

						return 1;
					} else {
						var15 = var14.length / var28.length;
						if (var5 >= 0 && var5 < var15) {
							for (var16 = var12; var16 < var13; ++var16) {
								int var17 = var16 + var28.length * var5;
								class544 var18 = TextureProvider.method5186(var28[var16]);
								if (var18 == class544.field5399) {
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = (String)var14[var17];
								} else {
									Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = (Integer)var14[var17];
								}
							}

							return 1;
						} else {
							throw new RuntimeException();
						}
					}
				} else if (var0 == ScriptOpcodes.DB_GETFIELDCOUNT) {
					PrivateChatMode.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
					var19 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
					var5 = 0;
					var20 = class73.method2234(var19);
					var7 = class179.method3750(var19);
					DbRowType var25 = class362.getDbRowType(var3);
					DbTableType var9 = ItemComposition.getDbTableType(var20);
					int[] var10 = var9.types[var7];
					Object[] var11 = var25.getColumnType(var7);
					if (var11 == null && var9.defaultValues != null) {
						var11 = var9.defaultValues[var7];
					}

					if (var11 != null) {
						var5 = var11.length / var10.length;
					}

					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var5;
					return 1;
				} else if (var0 != ScriptOpcodes.DB_FINDALL_WITH_COUNT && var0 != ScriptOpcodes.DB_FIND_FILTER) {
					if (var0 == ScriptOpcodes.DB_GETROWTABLE) {
						var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
						DbRowType var24 = class362.getDbRowType(var3);
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var24.tableId;
						return 1;
					} else if (var0 == ScriptOpcodes.DB_GETROW) {
						var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
						var19 = -1;
						if (class318.field3305 != null && var3 >= 0 && var3 < class318.field3305.size()) {
							var19 = (Integer)class318.field3305.get(var3);
						}

						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var19;
						return 1;
					} else if (var0 != ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT && var0 != ScriptOpcodes.DB_FINDALL) {
						return 2;
					} else {
						var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
						var4 = class300.method6244(var3);
						var5 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
						var6 = class28.getDbTable(var5);
						if (var6 == null) {
							throw new RuntimeException();
						} else if (class73.method2234(var5) != Client.field597) {
							throw new RuntimeException();
						} else if (class318.field3305 == null && class318.field3305.isEmpty()) {
							throw new RuntimeException();
						} else {
							var7 = Skeleton.method4873(var5);
							List var8 = var6.method9995(var4, var7);
							class318.field3305 = new LinkedList(class318.field3305);
							if (var8 != null) {
								class318.field3305.retainAll(var8);
							} else {
								class318.field3305.clear();
							}

							Client.field813 = class318.field3305.iterator();
							if (var0 == ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT) {
								Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class318.field3305.size();
							}

							return 1;
						}
					}
				} else {
					--PrivateChatMode.Interpreter_intStackSize;
					var3 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
					DbTable var23 = PlayerCompositionColorTextureOverride.method3723(var3);
					if (var23 == null) {
						throw new RuntimeException();
					} else {
						class318.field3305 = var23.method9995(0, 0);
						var5 = 0;
						if (class318.field3305 != null) {
							Client.field597 = var3;
							Client.field813 = class318.field3305.iterator();
							var5 = class318.field3305.size();
						}

						if (var0 == ScriptOpcodes.DB_FINDALL_WITH_COUNT) {
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var5;
						}

						return 1;
					}
				}
			} else {
				if (Client.field813 != null && Client.field813.hasNext()) {
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = (Integer)Client.field813.next();
				} else {
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = -1;
				}

				return 1;
			}
		} else {
			var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
			var4 = class300.method6244(var3);
			var5 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
			var6 = class28.getDbTable(var5);
			if (var6 == null) {
				throw new RuntimeException();
			} else {
				var7 = Skeleton.method4873(var5);
				class318.field3305 = var6.method9995(var4, var7);
				if (class318.field3305 != null) {
					Client.field597 = class73.method2234(var5);
					Client.field813 = class318.field3305.iterator();
					if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class318.field3305.size();
					}
				} else {
					Client.field597 = -1;
					Client.field813 = null;
					if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
					}
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "([BB)[B",
		garbageValue = "92"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		int var2 = var1.readUnsignedByte();
		int var3 = var1.readInt();
		if (var3 < 0 || AbstractArchive.field4595 != 0 && var3 > AbstractArchive.field4595) {
			throw new RuntimeException();
		} else if (var2 == 0) {
			byte[] var6 = new byte[var3];
			var1.readBytes(var6, 0, var3);
			return var6;
		} else {
			int var4 = var1.readInt();
			if (var4 >= 0 && (AbstractArchive.field4595 == 0 || var4 <= AbstractArchive.field4595)) {
				byte[] var5 = new byte[var4];
				if (var2 == 1) {
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5);
				}

				return var5;
			} else {
				throw new RuntimeException();
			}
		}
	}
}
