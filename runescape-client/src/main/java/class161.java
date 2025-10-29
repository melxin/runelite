import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("go")
public class class161 extends class151 {
	@ObfuscatedName("ah")
	@Export("Tiles_hueMultiplier")
	static int[] Tiles_hueMultiplier;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 460194761
	)
	int field1823;
	@ObfuscatedName("at")
	String field1820;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	final class154 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfc;)V"
	)
	class161(class154 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxa;B)V",
		garbageValue = "-11"
	)
	void vmethod4235(Buffer var1) {
		this.field1823 = var1.readInt();
		this.field1820 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgs;B)V",
		garbageValue = "-98"
	)
	void vmethod4241(ClanSettings var1) {
		var1.method4069(this.field1823, this.field1820);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "1"
	)
	public static boolean method4042(char var0) {
		if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
			if (var0 != 0) {
				char[] var1 = class451.cp1252AsciiExtension;

				for (int var2 = 0; var2 < var1.length; ++var2) {
					char var3 = var1[var2];
					if (var0 == var3) {
						return true;
					}
				}
			}

			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[JIIB)V",
		garbageValue = "126"
	)
	public static void method4049(String[] var0, long[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			long var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var9 = var2; var9 < var3; ++var9) {
				if (var6 == null || var0[var9] != null && var0[var9].compareTo(var6) < (var9 & 1)) {
					String var10 = var0[var9];
					var0[var9] = var0[var5];
					var0[var5] = var10;
					long var11 = var1[var9];
					var1[var9] = var1[var5];
					var1[var5++] = var11;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method4049(var0, var1, var2, var5 - 1);
			method4049(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "0"
	)
	public static int method4040(int var0) {
		--var0;
		var0 |= var0 >>> 1;
		var0 |= var0 >>> 2;
		var0 |= var0 >>> 4;
		var0 |= var0 >>> 8;
		var0 |= var0 >>> 16;
		return var0 + 1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lof;IIII)V",
		garbageValue = "-263010282"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field4294 == null) {
			throw new RuntimeException();
		} else {
			var0.field4294[var1] = var2;
			var0.field4295[var1] = var3;
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ILcu;ZI)I",
		garbageValue = "-505709100"
	)
	static int method4048(int var0, Script var1, boolean var2) {
		Widget var3 = class226.widgetDefinition.method7728(Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) {
			Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var3.text;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.scrollWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.scrollHeight;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.modelZoom;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.modelAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.modelAngleZ;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.modelAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.transparencyTop;
			return 1;
		} else if (var0 == 2610) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.transparencyBot;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.color;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.color2;
			return 1;
		} else if (var0 == 2613) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
			return 1;
		} else {
			class372 var4;
			if (var0 == 2617) {
				var4 = var3.method8195();
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var4 != null ? var4.field4127 : 0;
			}

			if (var0 == 2618) {
				var4 = var3.method8195();
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var4 != null ? var4.field4126 : 0;
				return 1;
			} else {
				class378 var7;
				if (var0 == 2619) {
					var7 = var3.method8194();
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var7 != null ? var7.method7886().method9578() : "";
					return 1;
				} else if (var0 == 2620) {
					var4 = var3.method8195();
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var4 != null ? var4.field4122 : 0;
					return 1;
				} else if (var0 == 2621) {
					var7 = var3.method8194();
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var7 != null ? var7.method7919() : 0;
					return 1;
				} else if (var0 == 2622) {
					var7 = var3.method8194();
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var7 != null ? var7.method7852() : 0;
					return 1;
				} else if (var0 == 2623) {
					var7 = var3.method8194();
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var7 != null ? var7.method7845() : 0;
					return 1;
				} else if (var0 == 2624) {
					var7 = var3.method8194();
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var7 != null && var7.method7888() ? 1 : 0;
					return 1;
				} else if (var0 != 2625) {
					if (var0 == 2626) {
						var7 = var3.method8194();
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var7 != null ? var7.method8023().method9830() : "";
						return 1;
					} else if (var0 == 2627) {
						var7 = var3.method8194();
						int var5 = var7 != null ? var7.method7848() : 0;
						int var6 = var7 != null ? var7.method8082() : 0;
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Math.min(var5, var6);
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Math.max(var5, var6);
						return 1;
					} else if (var0 == 2628) {
						var7 = var3.method8194();
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var7 != null ? var7.method8082() : 0;
						return 1;
					} else if (var0 == 2629) {
						var7 = var3.method8194();
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var7 != null ? var7.method7901() : 0;
						return 1;
					} else if (var0 == 2630) {
						var7 = var3.method8194();
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var7 != null ? var7.method8012() : 0;
						return 1;
					} else if (var0 == 2631) {
						var7 = var3.method8194();
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var7 != null ? var7.method8051() : 0;
						return 1;
					} else if (var0 == 2632) {
						var7 = var3.method8194();
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var7 != null ? var7.method7904() : 0;
						return 1;
					} else {
						class28 var8;
						if (var0 == 2633) {
							var8 = var3.method8280();
							Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize - 1] = var8 != null ? var8.method452(Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else if (var0 == 2634) {
							var8 = var3.method8280();
							Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize - 1] = var8 != null ? var8.method427((char)Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var7 = var3.method8194();
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var7 != null && var7.method7889() ? 1 : 0;
					return 1;
				}
			}
		}
	}
}
