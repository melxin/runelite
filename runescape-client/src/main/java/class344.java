import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("nl")
class class344 implements Callable {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	final MidiPcmStream this$0;
	// $FF: synthetic field
	final AtomicBoolean val$cancelled;

	@ObfuscatedSignature(
		descriptor = "(Lnm;Ljava/util/concurrent/atomic/AtomicBoolean;)V"
	)
	class344(MidiPcmStream var1, AtomicBoolean var2) {
		this.this$0 = var1;
		this.val$cancelled = var2;
	}

	public Object call() {
		PriorityQueue var1 = this.this$0.priorityQueue;

		while (true) {
			class341 var2 = null;
			synchronized(var1) {
				if (var1.isEmpty() || this.val$cancelled.get()) {
					return null;
				}

				var2 = (class341)var1.remove();
			}

			var2.field3853.method3304();
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([FI)V",
		garbageValue = "16711680"
	)
	static void method7323(float[] var0) {
		var0[1] = 1.0F - var0[1];
		if (var0[0] < 0.0F) {
			var0[0] = 0.0F;
		}

		if (var0[1] < 0.0F) {
			var0[1] = 0.0F;
		}

		if (var0[0] > 1.0F || var0[1] > 1.0F) {
			float var1 = var0[0] * (var0[0] - 2.0F + var0[1]) + var0[1] * (var0[1] - 2.0F) + 1.0F;
			if (class133.field1600 + var1 > 0.0F) {
				if (class133.field1600 + var0[0] < 1.3333334F) {
					float var2 = var0[0] - 2.0F;
					float var3 = var0[0] - 1.0F;
					float var4 = (float)Math.sqrt((double)(var2 * var2 - var3 * var3 * 4.0F));
					float var5 = (-var2 + var4) * 0.5F;
					if (class133.field1600 + var0[1] > var5) {
						var0[1] = var5 - class133.field1600;
					} else {
						var5 = (-var2 - var4) * 0.5F;
						if (var0[1] < class133.field1600 + var5) {
							var0[1] = class133.field1600 + var5;
						}
					}
				} else {
					var0[0] = 1.3333334F - class133.field1600;
					var0[1] = 0.33333334F - class133.field1600;
				}
			}
		}

		var0[1] = 1.0F - var0[1];
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ILce;ZI)I",
		garbageValue = "-948418260"
	)
	static int method7318(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.ADD) {
			AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var4 + var9;
			return 1;
		} else if (var0 == ScriptOpcodes.SUB) {
			AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var9 - var4;
			return 1;
		} else if (var0 == ScriptOpcodes.MULTIPLY) {
			AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var9 * var4;
			return 1;
		} else if (var0 == ScriptOpcodes.DIV) {
			AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var9 / var4;
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOM) {
			var9 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var9);
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOMINC) {
			var9 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var9 + 1));
			return 1;
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) {
				AbstractWorldMapIcon.Interpreter_intStackSize -= 5;
				var9 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 3];
				var7 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 4];
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var9 + (var4 - var9) * (var7 - var5) / (var6 - var5);
				return 1;
			} else if (var0 == ScriptOpcodes.ADDPERCENT) {
				AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var9 + var9 * var4 / 100;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT) {
				AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var9 | 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT) {
				AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var9 & -1 - (1 << var4);
				return 1;
			} else if (var0 == ScriptOpcodes.TESTBIT) {
				AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = (var9 & 1 << var4) != 0 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.MOD) {
				AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var9 % var4;
				return 1;
			} else if (var0 == ScriptOpcodes.POW) {
				AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
				if (var9 == 0) {
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, (double)var4);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.INVPOW) {
				AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
				if (var9 == 0) {
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
					return 1;
				} else {
					switch(var4) {
					case 0:
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = Integer.MAX_VALUE;
						break;
					case 1:
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var9;
						break;
					case 2:
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var9);
						break;
					case 3:
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var9);
						break;
					case 4:
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var9));
						break;
					default:
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, 1.0D / (double)var4);
					}

					return 1;
				}
			} else if (var0 == ScriptOpcodes.AND) {
				AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var9 & var4;
				return 1;
			} else if (var0 == ScriptOpcodes.OR) {
				AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var9 | var4;
				return 1;
			} else if (var0 == 4016) {
				AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var9 < var4 ? var9 : var4;
				return 1;
			} else if (var0 == 4017) {
				AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var9 > var4 ? var9 : var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SCALE) {
				AbstractWorldMapIcon.Interpreter_intStackSize -= 3;
				long var10 = (long)Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
				long var12 = (long)Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
				long var14 = (long)Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = (int)(var14 * var10 / var12);
				return 1;
			} else if (var0 == ScriptOpcodes.BITCOUNT) {
				var9 = class197.method4383(Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var9;
				return 1;
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) {
				AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var9 ^ 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) {
				AbstractWorldMapIcon.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = UserComparator4.method3481(var9, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) {
				AbstractWorldMapIcon.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = FloorDecoration.method4871(var9, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) {
				AbstractWorldMapIcon.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 2];
				var6 = 31 - var5;
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var9 << var6 >>> var6 + var4;
				return 1;
			} else if (var0 == 4030) {
				AbstractWorldMapIcon.Interpreter_intStackSize -= 4;
				var9 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 3];
				var9 = FloorDecoration.method4871(var9, var5, var6);
				var7 = PacketWriter.method2930(var6 - var5 + 1);
				if (var4 > var7) {
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var9 | var4 << var5;
				return 1;
			} else if (var0 == 4032) {
				Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize - 1] = BoundaryObject.method5776(Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4033) {
				Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize - 1] = FriendsChat.method9923(Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4034) {
				AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
				var5 = Skills.method8152(var9, var4);
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var5;
				return 1;
			} else if (var0 == 4035) {
				Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4036) {
				String var3 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
				var4 = -1;
				if (class427.isNumber(var3)) {
					var4 = HttpResponse.method313(var3);
				}

				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var4;
				return 1;
			} else {
				return 2;
			}
		}
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(B)J",
		garbageValue = "77"
	)
	@Export("getUserId")
	static long getUserId() {
		return Client.userId;
	}
}
