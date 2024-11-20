import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ly")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1711510341
	)
	@Export("element")
	final int element;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("label")
	final WorldMapLabel label;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -888832021
	)
	@Export("subWidth")
	final int subWidth;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -91968913
	)
	@Export("subHeight")
	final int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lny;Lny;ILln;)V"
	)
	WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
		super(var1, var2);
		this.element = var3;
		this.label = var4;
		WorldMapElement var5 = Tiles.WorldMapElement_get(this.getElement());
		SpritePixels var6 = var5.getSpriteBool(false);
		if (var6 != null) {
			this.subWidth = var6.subWidth;
			this.subHeight = var6.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1292003718"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Lln;",
		garbageValue = "1"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1901376317"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1893194548"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "28810"
	)
	static int method6148(int var0) {
		return class507.field5153[var0 & 2047];
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "-7"
	)
	static int method6142(int var0, Script var1, boolean var2) {
		int var4;
		Widget var6;
		int var10;
		if (var0 == ScriptOpcodes.CC_CREATE) {
			PrivateChatMode.Interpreter_intStackSize -= 3;
			var10 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
			int var12 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 2];
			if (var4 == 0) {
				throw new RuntimeException();
			} else {
				var6 = class379.widgetDefinition.method6875(var10);
				if (var6.children == null) {
					var6.children = new Widget[var12 + 1];
				}

				if (var6.children.length <= var12) {
					Widget[] var13 = new Widget[var12 + 1];

					for (int var14 = 0; var14 < var6.children.length; ++var14) {
						var13[var14] = var6.children[var14];
					}

					var6.children = var13;
				}

				if (var12 > 0 && var6.children[var12 - 1] == null) {
					throw new RuntimeException("" + (var12 - 1));
				} else {
					Widget var15 = new Widget();
					var15.type = var4;
					var15.parentId = var15.id = var6.id;
					var15.childIndex = var12;
					var15.isIf3 = true;
					if (var4 == 12) {
						ClanSettings.method3599(var15);
					}

					var6.children[var12] = var15;
					if (var2) {
						RestClientThreadFactory.scriptDotWidget = var15;
					} else {
						WorldMapCacheName.scriptActiveWidget = var15;
					}

					class178.invalidateWidget(var6);
					return 1;
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) {
				var3 = var2 ? RestClientThreadFactory.scriptDotWidget : WorldMapCacheName.scriptActiveWidget;
				Widget var11 = class379.widgetDefinition.method6875(var3.id);
				var11.children[var3.childIndex] = null;
				class178.invalidateWidget(var11);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) {
				var3 = class379.widgetDefinition.method6875(Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize]);
				var3.children = null;
				class178.invalidateWidget(var3);
				return 1;
			} else {
				Widget var5;
				if (var0 == 105) {
					PrivateChatMode.Interpreter_intStackSize -= 2;
					var10 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
					var5 = class379.widgetDefinition.method6875(var10);
					var6 = class379.widgetDefinition.getWidgetChild(var10, var4);
					if (var5 == null) {
						throw new RuntimeException("");
					} else if (var4 < 0) {
						throw new RuntimeException("");
					} else if (var6 == null) {
						throw new RuntimeException("");
					} else if (var5.children == null) {
						throw new RuntimeException("");
					} else {
						int var7 = var5.children.length;
						Widget[] var8 = new Widget[var7 + 1];
						System.arraycopy(var5.children, 0, var8, 0, var5.children.length);
						var5.children = var8;
						Widget var9 = new Widget(var6, var7);
						if (var6.type == 12) {
							ClanSettings.method3599(var9);
						}

						var5.children[var7] = var9;
						if (var2) {
							RestClientThreadFactory.scriptDotWidget = var9;
						} else {
							WorldMapCacheName.scriptActiveWidget = var9;
						}

						class178.invalidateWidget(var5);
						return 1;
					}
				} else if (var0 != ScriptOpcodes.CC_FIND) {
					if (var0 == ScriptOpcodes.IF_FIND) {
						var3 = class379.widgetDefinition.method6875(Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize]);
						if (var3 != null) {
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 1;
							if (var2) {
								RestClientThreadFactory.scriptDotWidget = var3;
							} else {
								WorldMapCacheName.scriptActiveWidget = var3;
							}
						} else {
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else {
						return 2;
					}
				} else {
					PrivateChatMode.Interpreter_intStackSize -= 2;
					var10 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
					var5 = class379.widgetDefinition.getWidgetChild(var10, var4);
					if (var5 != null && var4 != -1) {
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 1;
						if (var2) {
							RestClientThreadFactory.scriptDotWidget = var5;
						} else {
							WorldMapCacheName.scriptActiveWidget = var5;
						}
					} else {
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				}
			}
		}
	}
}
