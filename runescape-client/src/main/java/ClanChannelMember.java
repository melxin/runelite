import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fi")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1244160683
	)
	static int field1737;
	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "[Lws;"
	)
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;
	@ObfuscatedName("ab")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -2016762539
	)
	@Export("world")
	public int world;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lwm;"
	)
	@Export("username")
	public Username username;

	ClanChannelMember() {
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ILdy;ZB)I",
		garbageValue = "4"
	)
	static int method3491(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.ADD) {
			HealthBarConfig.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var9 + var4;
			return 1;
		} else if (var0 == ScriptOpcodes.SUB) {
			HealthBarConfig.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var9 - var4;
			return 1;
		} else if (var0 == ScriptOpcodes.MULTIPLY) {
			HealthBarConfig.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var4 * var9;
			return 1;
		} else if (var0 == ScriptOpcodes.DIV) {
			HealthBarConfig.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var9 / var4;
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOM) {
			var9 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var9);
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOMINC) {
			var9 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var9 + 1));
			return 1;
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) {
				HealthBarConfig.Interpreter_intStackSize -= 5;
				var9 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 3];
				var7 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 4];
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var9 + (var4 - var9) * (var7 - var5) / (var6 - var5);
				return 1;
			} else if (var0 == ScriptOpcodes.ADDPERCENT) {
				HealthBarConfig.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var9 + var9 * var4 / 100;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT) {
				HealthBarConfig.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var9 | 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT) {
				HealthBarConfig.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var9 & -1 - (1 << var4);
				return 1;
			} else if (var0 == ScriptOpcodes.TESTBIT) {
				HealthBarConfig.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = (var9 & 1 << var4) != 0 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.MOD) {
				HealthBarConfig.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var9 % var4;
				return 1;
			} else if (var0 == ScriptOpcodes.POW) {
				HealthBarConfig.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
				if (var9 == 0) {
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, (double)var4);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.INVPOW) {
				HealthBarConfig.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
				if (var9 == 0) {
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
					return 1;
				} else {
					switch(var4) {
					case 0:
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Integer.MAX_VALUE;
						break;
					case 1:
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var9;
						break;
					case 2:
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var9);
						break;
					case 3:
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var9);
						break;
					case 4:
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var9));
						break;
					default:
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, 1.0D / (double)var4);
					}

					return 1;
				}
			} else if (var0 == ScriptOpcodes.AND) {
				HealthBarConfig.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var9 & var4;
				return 1;
			} else if (var0 == ScriptOpcodes.OR) {
				HealthBarConfig.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var9 | var4;
				return 1;
			} else if (var0 == 4016) {
				HealthBarConfig.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var9 < var4 ? var9 : var4;
				return 1;
			} else if (var0 == 4017) {
				HealthBarConfig.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var9 > var4 ? var9 : var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SCALE) {
				HealthBarConfig.Interpreter_intStackSize -= 3;
				long var10 = (long)Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
				long var12 = (long)Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
				long var14 = (long)Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = (int)(var14 * var10 / var12);
				return 1;
			} else if (var0 == ScriptOpcodes.BITCOUNT) {
				var9 = WorldMapCacheName.method6355(Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var9;
				return 1;
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) {
				HealthBarConfig.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var9 ^ 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) {
				HealthBarConfig.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = class143.method3409(var9, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) {
				HealthBarConfig.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = WorldMapSection2.method5887(var9, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) {
				HealthBarConfig.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 2];
				var6 = 31 - var5;
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var9 << var6 >>> var4 + var6;
				return 1;
			} else if (var0 == 4030) {
				HealthBarConfig.Interpreter_intStackSize -= 4;
				var9 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 3];
				var9 = WorldMapSection2.method5887(var9, var5, var6);
				var7 = AsyncRestClient.method145(var6 - var5 + 1);
				if (var4 > var7) {
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var9 | var4 << var5;
				return 1;
			} else if (var0 == 4032) {
				Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize - 1] = SecureRandomFuture.method2315(Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4033) {
				Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize - 1] = Huffman.method7448(Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4034) {
				HealthBarConfig.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
				var5 = class468.method8940(var9, var4);
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var5;
				return 1;
			} else if (var0 == 4035) {
				Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4036) {
				String var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
				var4 = -1;
				if (class36.isNumber(var3)) {
					var4 = Tiles.method2370(var3);
				}

				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var4;
				return 1;
			} else {
				return 2;
			}
		}
	}

	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "(IIIILwg;Lnu;I)V",
		garbageValue = "-1355685941"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) {
			int var6 = Client.camAngleY & 2047;
			int var7 = var3 * var3 + var2 * var2;
			if (var7 <= 6400) {
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6];
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6];
				int var10 = var9 * var2 + var3 * var8 >> 16;
				int var11 = var3 * var9 - var8 * var2 >> 16;
				if (var7 > 2500) {
					var4.method10743(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths);
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2);
				}

			}
		}
	}
}
