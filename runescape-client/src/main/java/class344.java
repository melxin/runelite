import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("nt")
public class class344 implements Comparator {
	class344() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lmj;Lmj;S)I",
		garbageValue = "2602"
	)
	int method6935(class337 var1, class337 var2) {
		return var1.field3689 - var2.field3689;
	}

	public int compare(Object var1, Object var2) {
		return this.method6935((class337)var1, (class337)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([BI)Lld;",
		garbageValue = "-185429957"
	)
	static WorldMapSprite method6934(byte[] var0) {
		return var0 == null ? new WorldMapSprite() : new WorldMapSprite(GrandExchangeOfferNameComparator.readSpritePixelsFromBytes(var0).pixels);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lvy;Ljava/lang/String;I)I",
		garbageValue = "2132988122"
	)
	public static int method6942(Buffer var0, String var1) {
		int var2 = var0.offset;
		int var4 = var1.length();
		byte[] var5 = new byte[var4];

		for (int var6 = 0; var6 < var4; ++var6) {
			char var7 = var1.charAt(var6);
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) {
				var5[var6] = (byte)var7;
			} else if (var7 == 8364) {
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
		}

		var0.writeSmartByteShort(var5.length);
		var0.offset += class364.huffman.compress(var5, 0, var5.length, var0.array, var0.offset);
		return var0.offset - var2;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIII)D",
		garbageValue = "791398229"
	)
	static double method6945(int var0, int var1, int var2) {
		double var3 = var1 > 0 ? (double)Math.max(0.0F, Math.min(1.0F, (float)var0 / (float)var1)) : 1.0D;
		if (var3 > 0.0D && var3 < 1.0D) {
			double var5;
			double var7;
			switch(var2) {
			case 0:
				return var3;
			case 1:
				return 1.0D - Math.cos(var3 * 3.141592653589793D / 2.0D);
			case 2:
				return Math.sin(3.141592653589793D * var3 / 2.0D);
			case 3:
				return -(Math.cos(3.141592653589793D * var3) - 1.0D) / 2.0D;
			case 4:
				return var3 * var3;
			case 5:
				return 1.0D - (1.0D - var3) * (1.0D - var3);
			case 6:
				return var3 < 0.5D ? var3 * 2.0D * var3 : 1.0D - Math.pow(-2.0D * var3 + 2.0D, 2.0D) / 2.0D;
			case 7:
				return var3 * var3 * var3;
			case 8:
				return 1.0D - Math.pow(1.0D - var3, 3.0D);
			case 9:
				return var3 < 0.5D ? var3 * 4.0D * var3 * var3 : 1.0D - Math.pow(var3 * -2.0D + 2.0D, 3.0D) / 2.0D;
			case 10:
				return var3 * var3 * var3 * var3;
			case 11:
				return 1.0D - Math.pow(1.0D - var3, 4.0D);
			case 12:
				return var3 < 0.5D ? var3 * var3 * 8.0D * var3 * var3 : 1.0D - Math.pow(2.0D + var3 * -2.0D, 4.0D) / 2.0D;
			case 13:
				return var3 * var3 * var3 * var3 * var3;
			case 14:
				return 1.0D - Math.pow(1.0D - var3, 5.0D);
			case 15:
				return var3 < 0.5D ? var3 * 8.0D * var3 * var3 * var3 * var3 : 1.0D - Math.pow(2.0D + -2.0D * var3, 5.0D) / 2.0D;
			case 16:
				return Math.pow(2.0D, var3 * 10.0D - 10.0D);
			case 17:
				return 1.0D - Math.pow(2.0D, -10.0D * var3);
			case 18:
				return var3 < 0.5D ? Math.pow(2.0D, 10.0D + 20.0D * var3) / 2.0D : (2.0D - Math.pow(2.0D, -20.0D * var3 + 10.0D)) / 2.0D;
			case 19:
				return 1.0D - Math.sqrt(1.0D - Math.pow(var3, 2.0D));
			case 20:
				return Math.sqrt(1.0D - Math.pow(var3 - 1.0D, 2.0D));
			case 21:
				return var3 < 0.5D ? (1.0D - Math.sqrt(1.0D - Math.pow(var3 * 2.0D, 2.0D))) / 2.0D : (Math.sqrt(1.0D - Math.pow(var3 * -2.0D + 2.0D, 2.0D)) + 1.0D) / 2.0D;
			case 22:
				var5 = 1.70158D;
				var7 = 2.70158D;
				return var3 * 2.70158D * var3 * var3 - var3 * 1.70158D * var3;
			case 23:
				var5 = 1.70158D;
				var7 = 2.70158D;
				return 1.0D + 2.70158D * Math.pow(var3 - 1.0D, 3.0D) + 1.70158D * Math.pow(var3 - 1.0D, 2.0D);
			case 24:
				var5 = 1.70158D;
				var7 = 2.5949095D;
				return var3 < 0.5D ? Math.pow(2.0D * var3, 2.0D) * (var3 * 7.189819D - 2.5949095D) / 2.0D : (Math.pow(2.0D * var3 - 2.0D, 2.0D) * ((var3 * 2.0D - 2.0D) * 3.5949095D + 2.5949095D) + 2.0D) / 2.0D;
			case 25:
				var5 = 2.0943951023931953D;
				return -Math.pow(2.0D, var3 * 10.0D - 10.0D) * Math.sin(2.0943951023931953D * (10.0D * var3 - 10.75D));
			case 26:
				var5 = 2.0943951023931953D;
				return Math.pow(2.0D, -10.0D * var3) * Math.sin((10.0D * var3 - 0.75D) * 2.0943951023931953D) + 1.0D;
			case 27:
				var5 = 1.3962634015954636D;
				var7 = Math.sin((20.0D * var3 - 11.125D) * 1.3962634015954636D);
				return var3 < 0.5D ? -(Math.pow(2.0D, var3 * 20.0D - 10.0D) * var7) / 2.0D : Math.pow(2.0D, -20.0D * var3 + 10.0D) * var7 / 2.0D + 1.0D;
			default:
				return var3;
			}
		} else {
			return var3 <= 0.0D ? 0.0D : 1.0D;
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "-140887058"
	)
	static int method6944(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.ADD) {
			ScriptFrame.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var4 + var9;
			return 1;
		} else if (var0 == ScriptOpcodes.SUB) {
			ScriptFrame.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var9 - var4;
			return 1;
		} else if (var0 == ScriptOpcodes.MULTIPLY) {
			ScriptFrame.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var9 * var4;
			return 1;
		} else if (var0 == ScriptOpcodes.DIV) {
			ScriptFrame.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var9 / var4;
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOM) {
			var9 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var9);
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOMINC) {
			var9 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var9 + 1));
			return 1;
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) {
				ScriptFrame.Interpreter_intStackSize -= 5;
				var9 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 3];
				var7 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 4];
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var9 + (var7 - var5) * (var4 - var9) / (var6 - var5);
				return 1;
			} else if (var0 == ScriptOpcodes.ADDPERCENT) {
				ScriptFrame.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var9 + var4 * var9 / 100;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT) {
				ScriptFrame.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var9 | 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT) {
				ScriptFrame.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var9 & -1 - (1 << var4);
				return 1;
			} else if (var0 == ScriptOpcodes.TESTBIT) {
				ScriptFrame.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = (var9 & 1 << var4) != 0 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.MOD) {
				ScriptFrame.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var9 % var4;
				return 1;
			} else if (var0 == ScriptOpcodes.POW) {
				ScriptFrame.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
				if (var9 == 0) {
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, (double)var4);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.INVPOW) {
				ScriptFrame.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
				if (var9 == 0) {
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
					return 1;
				} else {
					switch(var4) {
					case 0:
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Integer.MAX_VALUE;
						break;
					case 1:
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var9;
						break;
					case 2:
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var9);
						break;
					case 3:
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var9);
						break;
					case 4:
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var9));
						break;
					default:
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, 1.0D / (double)var4);
					}

					return 1;
				}
			} else if (var0 == ScriptOpcodes.AND) {
				ScriptFrame.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var9 & var4;
				return 1;
			} else if (var0 == ScriptOpcodes.OR) {
				ScriptFrame.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var9 | var4;
				return 1;
			} else if (var0 == 4016) {
				ScriptFrame.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var9 < var4 ? var9 : var4;
				return 1;
			} else if (var0 == 4017) {
				ScriptFrame.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var9 > var4 ? var9 : var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SCALE) {
				ScriptFrame.Interpreter_intStackSize -= 3;
				long var10 = (long)Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
				long var12 = (long)Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
				long var14 = (long)Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = (int)(var14 * var10 / var12);
				return 1;
			} else if (var0 == ScriptOpcodes.BITCOUNT) {
				var9 = BoundaryObject.method4809(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var9;
				return 1;
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) {
				ScriptFrame.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var9 ^ 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) {
				ScriptFrame.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class458.method8966(var9, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) {
				ScriptFrame.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = FaceNormal.method4463(var9, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) {
				ScriptFrame.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
				var6 = 31 - var5;
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var9 << var6 >>> var4 + var6;
				return 1;
			} else if (var0 == 4030) {
				ScriptFrame.Interpreter_intStackSize -= 4;
				var9 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 3];
				var9 = FaceNormal.method4463(var9, var5, var6);
				var7 = ItemComposition.method5643(var6 - var5 + 1);
				if (var4 > var7) {
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var9 | var4 << var5;
				return 1;
			} else if (var0 == 4032) {
				Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize - 1] = WorldMapData_1.method6279(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4033) {
				Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize - 1] = HttpRequest.method100(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4034) {
				ScriptFrame.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
				var5 = class251.method5360(var9, var4);
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var5;
				return 1;
			} else if (var0 == 4035) {
				Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4036) {
				String var3 = Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize];
				var4 = -1;
				if (class426.isNumber(var3)) {
					var4 = class278.method5972(var3);
				}

				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var4;
				return 1;
			} else {
				return 2;
			}
		}
	}
}
