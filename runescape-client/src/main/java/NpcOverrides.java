import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hw")
@Implements("NpcOverrides")
public class NpcOverrides {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lbb;"
	)
	@Export("soundSystem")
	static SoundSystem soundSystem;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = -2056366945527975403L
	)
	public long field2029;
	@ObfuscatedName("ay")
	@Export("modelIds")
	int[] modelIds;
	@ObfuscatedName("au")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("ad")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("ah")
	@Export("useLocalPlayer")
	public boolean useLocalPlayer;

	public NpcOverrides(long var1, int[] var3, short[] var4, short[] var5, boolean var6) {
		this.useLocalPlayer = false;
		this.field2029 = var1;
		this.modelIds = var3;
		this.recolorTo = var4;
		this.retextureTo = var5;
		this.useLocalPlayer = var6;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Lhp;",
		garbageValue = "-839434821"
	)
	public static HitSplatDefinition method3920(int var0) {
		HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0);
			var1 = new HitSplatDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILdy;ZI)I",
		garbageValue = "-1362789250"
	)
	static int method3919(int var0, Script var1, boolean var2) {
		Widget var3 = class376.widgetDefinition.method6918(Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) {
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.text;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) {
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var3.scrollWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) {
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var3.scrollHeight;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) {
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var3.modelZoom;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) {
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var3.modelAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) {
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var3.modelAngleZ;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) {
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var3.modelAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) {
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var3.transparencyTop;
			return 1;
		} else if (var0 == 2610) {
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var3.transparencyBot;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) {
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var3.color;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) {
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var3.color2;
			return 1;
		} else if (var0 == 2613) {
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) {
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
			return 1;
		} else {
			class355 var4;
			if (var0 == 2617) {
				var4 = var3.method7332();
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var4 != null ? var4.field3853 : 0;
			}

			if (var0 == 2618) {
				var4 = var3.method7332();
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var4 != null ? var4.field3848 : 0;
				return 1;
			} else {
				class361 var7;
				if (var0 == 2619) {
					var7 = var3.method7331();
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7 != null ? var7.method7070().method8601() : "";
					return 1;
				} else if (var0 == 2620) {
					var4 = var3.method7332();
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var4 != null ? var4.field3849 : 0;
					return 1;
				} else if (var0 == 2621) {
					var7 = var3.method7331();
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var7 != null ? var7.method7208() : 0;
					return 1;
				} else if (var0 == 2622) {
					var7 = var3.method7331();
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var7 != null ? var7.method7149() : 0;
					return 1;
				} else if (var0 == 2623) {
					var7 = var3.method7331();
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var7 != null ? var7.method7237() : 0;
					return 1;
				} else if (var0 == 2624) {
					var7 = var3.method7331();
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var7 != null && var7.method7072() ? 1 : 0;
					return 1;
				} else if (var0 != 2625) {
					if (var0 == 2626) {
						var7 = var3.method7331();
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7 != null ? var7.method7107().method8803() : "";
						return 1;
					} else if (var0 == 2627) {
						var7 = var3.method7331();
						int var5 = var7 != null ? var7.method7076() : 0;
						int var6 = var7 != null ? var7.method7075() : 0;
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Math.min(var5, var6);
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Math.max(var5, var6);
						return 1;
					} else if (var0 == 2628) {
						var7 = var3.method7331();
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var7 != null ? var7.method7075() : 0;
						return 1;
					} else if (var0 == 2629) {
						var7 = var3.method7331();
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var7 != null ? var7.method7290() : 0;
						return 1;
					} else if (var0 == 2630) {
						var7 = var3.method7331();
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var7 != null ? var7.method7205() : 0;
						return 1;
					} else if (var0 == 2631) {
						var7 = var3.method7331();
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var7 != null ? var7.method7163() : 0;
						return 1;
					} else if (var0 == 2632) {
						var7 = var3.method7331();
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var7 != null ? var7.method7143() : 0;
						return 1;
					} else {
						class27 var8;
						if (var0 == 2633) {
							var8 = var3.method7333();
							Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize - 1] = var8 != null ? var8.method368(Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else if (var0 == 2634) {
							var8 = var3.method7333();
							Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize - 1] = var8 != null ? var8.method344((char)Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var7 = var3.method7331();
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var7 != null && var7.method7073() ? 1 : 0;
					return 1;
				}
			}
		}
	}
}
