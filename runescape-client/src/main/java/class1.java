import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ay")
public class class1 implements Callable {
	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	static Archive field3;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	final Buffer field0;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	final class3 field1;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	final class7 this$0;

	@ObfuscatedSignature(
		descriptor = "(Laf;Lvy;Lad;)V"
	)
	class1(class7 var1, Buffer var2, class3 var3) {
		this.this$0 = var1;
		this.field0 = var2;
		this.field1 = var3;
	}

	public Object call() {
		return this.field1.vmethod15(this.field0);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Lhq;",
		garbageValue = "350736328"
	)
	@Export("getEnum")
	public static EnumComposition getEnum(int var0) {
		EnumComposition var1 = (EnumComposition)EnumComposition.EnumDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class593.EnumDefinition_archive.takeFile(8, var0);
			var1 = new EnumComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			EnumComposition.EnumDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1363786104"
	)
	public static void method14() {
		if (MouseHandler.MouseHandler_instance != null) {
			synchronized(MouseHandler.MouseHandler_instance) {
				MouseHandler.MouseHandler_instance = null;
			}
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILdy;ZS)I",
		garbageValue = "241"
	)
	static int method13(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = class376.widgetDefinition.method6918(Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? class132.scriptDotWidget : PlayerCompositionColorTextureOverride.scriptActiveWidget;
		}

		MilliClock.invalidateWidget(var3);
		int var4;
		int var5;
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) {
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) {
				var3.modelType = 2;
				var3.modelId = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) {
				var3.modelType = 3;
				var3.modelId = class132.localPlayer.appearance.getChatHeadId();
				return 1;
			} else if (var0 == 1207) {
				boolean var7 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize] == 1;
				var3.method7337(class132.localPlayer.appearance, var7);
				return 1;
			} else if (var0 == 1208) {
				var4 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
				if (var3.field3981 == null) {
					throw new RuntimeException("");
				} else {
					var3.field3981.method6957(var4);
					return 1;
				}
			} else if (var0 == 1209) {
				HealthBarConfig.Interpreter_intStackSize -= 2;
				var4 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
				var5 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
				if (var3.field3981 == null) {
					throw new RuntimeException("");
				} else {
					var3.field3981.method6963(var4, var5);
					return 1;
				}
			} else if (var0 == 1210) {
				var4 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
				if (var3.field3981 == null) {
					throw new RuntimeException("");
				} else {
					var3.field3981.method6974(class132.localPlayer.appearance.gender, var4);
					return 1;
				}
			} else {
				return 2;
			}
		} else {
			HealthBarConfig.Interpreter_intStackSize -= 2;
			var4 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
			var5 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
			var3.itemId = var4;
			var3.itemQuantity = var5;
			ItemComposition var6 = class138.ItemDefinition_get(var4);
			var3.modelAngleX = var6.xan2d;
			var3.modelAngleY = var6.yan2d;
			var3.modelAngleZ = var6.zan2d;
			var3.modelOffsetX = var6.offsetX2d;
			var3.modelOffsetY = var6.offsetY2d;
			var3.modelZoom = var6.zoom2d;
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) {
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | 1 == var6.isStackable) {
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2;
			}

			if (var3.field3987 > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.field3987;
			} else if (var3.rawWidth > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1;
		}
	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(Ldp;I)V",
		garbageValue = "407744035"
	)
	static final void method12(WorldView var0) {
		for (Projectile var1 = (Projectile)var0.projectiles.last(); var1 != null; var1 = (Projectile)var0.projectiles.previous()) {
			if (var0.plane == var1.plane && Client.cycle <= var1.cycleEnd) {
				if (Client.cycle >= var1.cycleStart) {
					NPC var2;
					int var3;
					Player var4;
					if (!var1.isMoving && var1.field994 != 0) {
						if (var1.field994 > 0) {
							var2 = (NPC)class376.worldView.npcs.get((long)(var1.field994 - 1));
							if (var2 != null && 0 <= var2.x && var2.x < 13312 && 0 <= var2.y && var2.y < 13312) {
								var1.sourceX = var2.x;
								var1.sourceY = var2.y;
								var1.setDestination(var1.field987, var1.field988, var1.field989, Client.cycle);
							}
						} else {
							var3 = -var1.field994 - 1;
							if (var3 == Client.localPlayerIndex) {
								var4 = class132.localPlayer;
							} else {
								var4 = (Player)class376.worldView.players.get((long)var3);
							}

							if (var4 != null && 0 <= var4.x && var4.x < 13312 && 0 <= var4.y && var4.y < 13312) {
								var1.sourceX = var4.x;
								var1.sourceY = var4.y;
								var1.setDestination(var1.field987, var1.field988, var1.field989, Client.cycle);
							}
						}
					}

					if (var1.targetIndex > 0) {
						var2 = (NPC)var0.npcs.get((long)(var1.targetIndex - 1));
						if (var2 != null && 0 <= var2.x && var2.x < 13312 && 0 <= var2.y && var2.y < 13312) {
							var1.setDestination(var2.x, var2.y, DevicePcmPlayerProvider.getTileHeight(var0, var2.x, var2.y, var1.plane) - var1.endHeight, Client.cycle);
						}
					}

					if (var1.targetIndex < 0) {
						var3 = -var1.targetIndex - 1;
						if (var3 == Client.localPlayerIndex) {
							var4 = class132.localPlayer;
						} else {
							var4 = (Player)var0.players.get((long)var3);
						}

						if (var4 != null && 0 <= var4.x && var4.x < 13312 && 0 <= var4.y && var4.y < 13312) {
							var1.setDestination(var4.x, var4.y, DevicePcmPlayerProvider.getTileHeight(var0, var4.x, var4.y, var1.plane) - var1.endHeight, Client.cycle);
						}
					}

					var1.advance(Client.graphicsCycle);
					var0.scene.drawEntity(var0.plane, (int)var1.x, (int)var1.y, (int)var1.z, 60, var1, var1.yaw, -1L, false);
				}
			} else {
				var1.remove();
			}
		}

	}
}
