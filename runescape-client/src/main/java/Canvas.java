import java.awt.Component;
import java.awt.Graphics;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("am")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("if")
	static Iterator field95;
	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	@Export("archive13")
	static Archive archive13;
	@ObfuscatedName("ab")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1;
	}

	public final void update(Graphics var1) {
		this.component.update(var1);
	}

	public final void paint(Graphics var1) {
		this.component.paint(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwj;Lqw;B)Lqw;",
		garbageValue = "126"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte();
		int var3;
		if (var1 == null) {
			var3 = ConcurrentMidiTask.method9757(var2);
			var1 = new IterableNodeHashTable(var3);
		}

		for (var3 = 0; var3 < var2; ++var3) {
			boolean var4 = var0.readUnsignedByte() == 1;
			int var5 = var0.readMedium();
			Object var6;
			if (var4) {
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated());
			} else {
				var6 = new IntegerNode(var0.readInt());
			}

			var1.put((Node)var6, (long)var5);
		}

		return var1;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ILcj;ZI)I",
		garbageValue = "-1066795430"
	)
	static int method325(int var0, Script var1, boolean var2) {
		Widget var3 = class35.widgetDefinition.method7496(Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) {
			Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var3.text;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.scrollWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.scrollHeight;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.modelZoom;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.modelAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.modelAngleZ;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.modelAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.transparencyTop;
			return 1;
		} else if (var0 == 2610) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.transparencyBot;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.color;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.color2;
			return 1;
		} else if (var0 == 2613) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
			return 1;
		} else {
			class359 var4;
			if (var0 == 2617) {
				var4 = var3.method7921();
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var4 != null ? var4.field4074 : 0;
			}

			if (var0 == 2618) {
				var4 = var3.method7921();
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var4 != null ? var4.field4069 : 0;
				return 1;
			} else {
				class365 var7;
				if (var0 == 2619) {
					var7 = var3.method8041();
					Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var7 != null ? var7.method7665().method9426() : "";
					return 1;
				} else if (var0 == 2620) {
					var4 = var3.method7921();
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var4 != null ? var4.field4070 : 0;
					return 1;
				} else if (var0 == 2621) {
					var7 = var3.method8041();
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var7 != null ? var7.method7667() : 0;
					return 1;
				} else if (var0 == 2622) {
					var7 = var3.method8041();
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var7 != null ? var7.method7758() : 0;
					return 1;
				} else if (var0 == 2623) {
					var7 = var3.method8041();
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var7 != null ? var7.method7669() : 0;
					return 1;
				} else if (var0 == 2624) {
					var7 = var3.method8041();
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var7 != null && var7.method7826() ? 1 : 0;
					return 1;
				} else if (var0 != 2625) {
					if (var0 == 2626) {
						var7 = var3.method8041();
						Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var7 != null ? var7.method7658().method9583() : "";
						return 1;
					} else if (var0 == 2627) {
						var7 = var3.method8041();
						int var5 = var7 != null ? var7.method7647() : 0;
						int var6 = var7 != null ? var7.method7781() : 0;
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Math.min(var5, var6);
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Math.max(var5, var6);
						return 1;
					} else if (var0 == 2628) {
						var7 = var3.method8041();
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var7 != null ? var7.method7781() : 0;
						return 1;
					} else if (var0 == 2629) {
						var7 = var3.method8041();
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var7 != null ? var7.method7672() : 0;
						return 1;
					} else if (var0 == 2630) {
						var7 = var3.method8041();
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var7 != null ? var7.method7659() : 0;
						return 1;
					} else if (var0 == 2631) {
						var7 = var3.method8041();
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var7 != null ? var7.method7689() : 0;
						return 1;
					} else if (var0 == 2632) {
						var7 = var3.method8041();
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var7 != null ? var7.method7675() : 0;
						return 1;
					} else {
						class27 var8;
						if (var0 == 2633) {
							var8 = var3.method7963();
							Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize - 1] = var8 != null ? var8.method408(Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else if (var0 == 2634) {
							var8 = var3.method7963();
							Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize - 1] = var8 != null ? var8.method426((char)Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var7 = var3.method8041();
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var7 != null && var7.method7660() ? 1 : 0;
					return 1;
				}
			}
		}
	}
}
