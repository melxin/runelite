import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("uy")
public class class544 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	public static final class544 field5392;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	public static final class544 field5391;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	public static final class544 field5399;
	@ObfuscatedName("am")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;
	@ObfuscatedName("pv")
	@ObfuscatedSignature(
		descriptor = "[Lnp;"
	)
	static Widget[] field5400;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1580811799
	)
	public final int field5394;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -329614623
	)
	public final int field5396;
	@ObfuscatedName("ac")
	public final Class field5395;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Luh;"
	)
	final class540 field5390;

	static {
		field5392 = new class544(0, 0, Integer.class, new class541());
		field5391 = new class544(1, 1, Long.class, new class543());
		field5399 = new class544(2, 2, String.class, new class545());
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Luh;)V"
	)
	class544(int var1, int var2, Class var3, class540 var4) {
		this.field5394 = var1;
		this.field5396 = var2;
		this.field5395 = var3;
		this.field5390 = var4;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1071289392"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5396;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvj;I)Ljava/lang/Object;",
		garbageValue = "-429016798"
	)
	public Object method9957(Buffer var1) {
		return this.field5390.vmethod9969(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[Luy;",
		garbageValue = "-2047677708"
	)
	public static class544[] method9967() {
		return new class544[]{field5392, field5399, field5391};
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Lhd;",
		garbageValue = "-1053750068"
	)
	public static VarcInt method9963(int var0) {
		VarcInt var1 = (VarcInt)VarcInt.VarcInt_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarcInt.VarcInt_archive.takeFile(19, var0);
			var1 = new VarcInt();
			if (var2 != null) {
				var1.method3795(new Buffer(var2));
			}

			VarcInt.VarcInt_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lvj;I)V",
		garbageValue = "-1559383264"
	)
	public static void method9951(Object var0, Buffer var1) {
		Class var3 = var0.getClass();
		class544[] var5 = method9967();
		int var6 = 0;

		class544 var4;
		while (true) {
			if (var6 >= var5.length) {
				var4 = null;
				break;
			}

			class544 var7 = var5[var6];
			if (var3 == var7.field5395) {
				var4 = var7;
				break;
			}

			++var6;
		}

		if (var4 == null) {
			throw new IllegalArgumentException();
		} else {
			class540 var2 = var4.field5390;
			var2.vmethod9971(var0, var1);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1733867629"
	)
	static int method9961(int var0, int var1) {
		for (int var2 = 0; var2 < 8; ++var2) {
			if (var1 <= var0 + 30) {
				return var2;
			}

			var0 += 30;
			var0 += var2 != 1 && var2 != 3 ? 5 : 20;
		}

		return 0;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "-1998416762"
	)
	static int method9965(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.ADD) {
			PrivateChatMode.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var9 + var4;
			return 1;
		} else if (var0 == ScriptOpcodes.SUB) {
			PrivateChatMode.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var9 - var4;
			return 1;
		} else if (var0 == ScriptOpcodes.MULTIPLY) {
			PrivateChatMode.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var4 * var9;
			return 1;
		} else if (var0 == ScriptOpcodes.DIV) {
			PrivateChatMode.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var9 / var4;
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOM) {
			var9 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var9);
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOMINC) {
			var9 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var9 + 1));
			return 1;
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) {
				PrivateChatMode.Interpreter_intStackSize -= 5;
				var9 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 3];
				var7 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 4];
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var9 + (var4 - var9) * (var7 - var5) / (var6 - var5);
				return 1;
			} else if (var0 == ScriptOpcodes.ADDPERCENT) {
				PrivateChatMode.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var9 + var4 * var9 / 100;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT) {
				PrivateChatMode.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var9 | 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT) {
				PrivateChatMode.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var9 & -1 - (1 << var4);
				return 1;
			} else if (var0 == ScriptOpcodes.TESTBIT) {
				PrivateChatMode.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = (var9 & 1 << var4) != 0 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.MOD) {
				PrivateChatMode.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var9 % var4;
				return 1;
			} else if (var0 == ScriptOpcodes.POW) {
				PrivateChatMode.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
				if (var9 == 0) {
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, (double)var4);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.INVPOW) {
				PrivateChatMode.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
				if (var9 == 0) {
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
					return 1;
				} else {
					switch(var4) {
					case 0:
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Integer.MAX_VALUE;
						break;
					case 1:
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var9;
						break;
					case 2:
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var9);
						break;
					case 3:
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var9);
						break;
					case 4:
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var9));
						break;
					default:
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, 1.0D / (double)var4);
					}

					return 1;
				}
			} else if (var0 == ScriptOpcodes.AND) {
				PrivateChatMode.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var9 & var4;
				return 1;
			} else if (var0 == ScriptOpcodes.OR) {
				PrivateChatMode.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var9 | var4;
				return 1;
			} else if (var0 == 4016) {
				PrivateChatMode.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var9 < var4 ? var9 : var4;
				return 1;
			} else if (var0 == 4017) {
				PrivateChatMode.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var9 > var4 ? var9 : var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SCALE) {
				PrivateChatMode.Interpreter_intStackSize -= 3;
				long var10 = (long)Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
				long var12 = (long)Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
				long var14 = (long)Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = (int)(var10 * var14 / var12);
				return 1;
			} else if (var0 == ScriptOpcodes.BITCOUNT) {
				var9 = WorldMapData_1.method6089(Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var9;
				return 1;
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) {
				PrivateChatMode.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var9 ^ 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) {
				PrivateChatMode.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Interpreter.method2156(var9, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) {
				PrivateChatMode.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = WorldMapDecoration.method6234(var9, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) {
				PrivateChatMode.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 2];
				var6 = 31 - var5;
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var9 << var6 >>> var4 + var6;
				return 1;
			} else if (var0 == 4030) {
				PrivateChatMode.Interpreter_intStackSize -= 4;
				var9 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 3];
				var9 = WorldMapDecoration.method6234(var9, var5, var6);
				var7 = class139.method3386(var6 - var5 + 1);
				if (var4 > var7) {
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var9 | var4 << var5;
				return 1;
			} else if (var0 == 4032) {
				Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize - 1] = EnumComposition.method3881(Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4033) {
				Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize - 1] = PlayerCompositionColorTextureOverride.method3724(Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4034) {
				PrivateChatMode.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
				var5 = GrandExchangeOfferWorldComparator.method7723(var9, var4);
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var5;
				return 1;
			} else if (var0 == 4035) {
				Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4036) {
				String var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
				var4 = -1;
				if (UserComparator3.isNumber(var3)) {
					var4 = SecureUrlRequester.method3179(var3);
				}

				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var4;
				return 1;
			} else {
				return 2;
			}
		}
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(Lmc;I)V",
		garbageValue = "1039725917"
	)
	static void method9964(PacketBufferNode var0) {
		var0.packetBuffer.writeIntME(AttackOption.archive8.hash);
		var0.packetBuffer.writeIntLE(class419.archive10.hash);
		var0.packetBuffer.writeInt(UserComparator10.field1505.hash);
		var0.packetBuffer.writeIntIME(class450.archive12.hash);
		var0.packetBuffer.writeInt(GameEngine.archive2.hash);
		var0.packetBuffer.writeIntLE(class171.field1814.hash);
		var0.packetBuffer.writeInt(class204.field2110.hash);
		var0.packetBuffer.writeIntIME(GraphicsObject.soundEffectsArchive.hash);
		var0.packetBuffer.writeInt(class1.field0.hash);
		var0.packetBuffer.writeIntME(0);
		var0.packetBuffer.writeInt(FontName.archive6.hash);
		var0.packetBuffer.writeIntLE(class390.field4572.hash);
		var0.packetBuffer.writeIntLE(class309.archive9.hash);
		var0.packetBuffer.writeIntLE(Language.field4688.hash);
		var0.packetBuffer.writeIntIME(class483.field5042.hash);
		var0.packetBuffer.writeIntLE(class419.field4733.hash);
		var0.packetBuffer.writeIntME(AsyncHttpResponse.field84.hash);
		var0.packetBuffer.writeIntLE(WorldMapCacheName.archive4.hash);
		var0.packetBuffer.writeIntME(class213.archive13.hash);
		var0.packetBuffer.writeIntIME(AbstractArchive.field4596.hash);
		var0.packetBuffer.writeInt(ViewportMouse.field2903.hash);
	}

	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "102984209"
	)
	static final String method9956(int var0) {
		return var0 < 999999999 ? Integer.toString(var0) : "*";
	}
}
