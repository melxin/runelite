import java.util.concurrent.Callable;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dd")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	SecureRandomCallable() {
	}

	public Object call() {
		return class173.method3692();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Lvy;",
		garbageValue = "845595598"
	)
	static IndexedSprite method2433() {
		IndexedSprite var0 = new IndexedSprite();
		var0.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
		var0.height = SecureRandomFuture.SpriteBuffer_spriteHeight;
		var0.xOffset = SpriteBufferProperties.SpriteBuffer_xOffsets[0];
		var0.yOffset = HttpResponse.SpriteBuffer_yOffsets[0];
		var0.subWidth = SpriteBufferProperties.SpriteBuffer_spriteWidths[0];
		var0.subHeight = WorldMapCacheName.SpriteBuffer_spriteHeights[0];
		var0.palette = class140.SpriteBuffer_spritePalette;
		var0.pixels = SpriteBufferProperties.SpriteBuffer_pixels[0];
		SpriteBufferProperties.SpriteBuffer_xOffsets = null;
		HttpResponse.SpriteBuffer_yOffsets = null;
		SpriteBufferProperties.SpriteBuffer_spriteWidths = null;
		WorldMapCacheName.SpriteBuffer_spriteHeights = null;
		class140.SpriteBuffer_spritePalette = null;
		SpriteBufferProperties.SpriteBuffer_pixels = null;
		return var0;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "63"
	)
	static int method2438(int var0, Script var1, boolean var2) {
		Widget var3 = class379.widgetDefinition.method6875(Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) {
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.text;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.scrollWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.scrollHeight;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.modelZoom;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.modelAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.modelAngleZ;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.modelAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.transparencyTop;
			return 1;
		} else if (var0 == 2610) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.transparencyBot;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.color;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.color2;
			return 1;
		} else if (var0 == 2613) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
			return 1;
		} else {
			class353 var4;
			if (var0 == 2617) {
				var4 = var3.method7240();
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var4 != null ? var4.field3786 : 0;
			}

			if (var0 == 2618) {
				var4 = var3.method7240();
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var4 != null ? var4.field3785 : 0;
				return 1;
			} else {
				class359 var7;
				if (var0 == 2619) {
					var7 = var3.method7284();
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7 != null ? var7.method7028().method8383() : "";
					return 1;
				} else if (var0 == 2620) {
					var4 = var3.method7240();
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var4 != null ? var4.field3787 : 0;
					return 1;
				} else if (var0 == 2621) {
					var7 = var3.method7284();
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var7 != null ? var7.method7038() : 0;
					return 1;
				} else if (var0 == 2622) {
					var7 = var3.method7284();
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var7 != null ? var7.method7039() : 0;
					return 1;
				} else if (var0 == 2623) {
					var7 = var3.method7284();
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var7 != null ? var7.method7040() : 0;
					return 1;
				} else if (var0 == 2624) {
					var7 = var3.method7284();
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var7 != null && var7.method7030() ? 1 : 0;
					return 1;
				} else if (var0 != 2625) {
					if (var0 == 2626) {
						var7 = var3.method7284();
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6977().method8643() : "";
						return 1;
					} else if (var0 == 2627) {
						var7 = var3.method7284();
						int var5 = var7 != null ? var7.method7104() : 0;
						int var6 = var7 != null ? var7.method7033() : 0;
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Math.min(var5, var6);
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Math.max(var5, var6);
						return 1;
					} else if (var0 == 2628) {
						var7 = var3.method7284();
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var7 != null ? var7.method7033() : 0;
						return 1;
					} else if (var0 == 2629) {
						var7 = var3.method7284();
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var7 != null ? var7.method7042() : 0;
						return 1;
					} else if (var0 == 2630) {
						var7 = var3.method7284();
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var7 != null ? var7.method7015() : 0;
						return 1;
					} else if (var0 == 2631) {
						var7 = var3.method7284();
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var7 != null ? var7.method7043() : 0;
						return 1;
					} else if (var0 == 2632) {
						var7 = var3.method7284();
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var7 != null ? var7.method7044() : 0;
						return 1;
					} else {
						class27 var8;
						if (var0 == 2633) {
							var8 = var3.method7280();
							Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize - 1] = var8 != null ? var8.method365(Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else if (var0 == 2634) {
							var8 = var3.method7280();
							Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize - 1] = var8 != null ? var8.method366((char)Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var7 = var3.method7284();
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var7 != null && var7.method7139() ? 1 : 0;
					return 1;
				}
			}
		}
	}
}
