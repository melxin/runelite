import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dd")
@Implements("HealthBarConfig")
public class HealthBarConfig extends Node {
	@ObfuscatedName("vz")
	@ObfuscatedGetter(
		intValue = -14873043
	)
	static int field1176;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	@Export("definition")
	HealthBarDefinition definition;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	@Export("updates")
	IterableNodeDeque updates;

	@ObfuscatedSignature(
		descriptor = "(Lhh;)V"
	)
	HealthBarConfig(HealthBarDefinition var1) {
		this.updates = new IterableNodeDeque();
		this.definition = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "299133875"
	)
	@Export("put")
	void put(int var1, int var2, int var3, int var4) {
		HealthBarUpdate var5 = null;
		int var6 = 0;

		for (HealthBarUpdate var7 = (HealthBarUpdate)this.updates.last(); var7 != null; var7 = (HealthBarUpdate)this.updates.previous()) {
			++var6;
			if (var7.cycle == var1) {
				var7.set(var1, var2, var3, var4);
				return;
			}

			if (var7.cycle <= var1) {
				var5 = var7;
			}
		}

		if (var5 == null) {
			if (var6 < 4) {
				this.updates.addLast(new HealthBarUpdate(var1, var2, var3, var4));
			}

		} else {
			IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(var1, var2, var3, var4), var5);
			if (var6 >= 4) {
				this.updates.last().remove();
			}

		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)Lcm;",
		garbageValue = "21"
	)
	@Export("get")
	HealthBarUpdate get(int var1) {
		HealthBarUpdate var2 = (HealthBarUpdate)this.updates.last();
		if (var2 != null && var2.cycle <= var1) {
			for (HealthBarUpdate var3 = (HealthBarUpdate)this.updates.previous(); var3 != null && var3.cycle <= var1; var3 = (HealthBarUpdate)this.updates.previous()) {
				var2.remove();
				var2 = var3;
			}

			if (this.definition.int5 + var2.cycle + var2.cycleOffset > var1) {
				return var2;
			} else {
				var2.remove();
				return null;
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "911583044"
	)
	@Export("isEmpty")
	boolean isEmpty() {
		return this.updates.method8801();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2137297630"
	)
	public static int method2764(int var0) {
		return class533.field5635[var0 & 16383];
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ILcj;ZI)I",
		garbageValue = "1540452503"
	)
	static int method2766(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = WorldMapRenderer.getWindowedMode();
			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) {
				var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					Actor.setWindowedMode(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) {
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = class154.clientPreferences.getWindowMode();
				return 1;
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) {
				if (var0 == 5310) {
					--UrlRequest.Interpreter_intStackSize;
					return 1;
				} else {
					return 2;
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					class154.clientPreferences.updateWindowMode(var3);
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(Ldm;Lcd;IB)V",
		garbageValue = "25"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(WorldView var0, Actor var1, int var2) {
		if (var1.spotAnimation >= Client.cycle) {
			FriendSystem.method1627(var1);
		} else if (var1.field1083 >= Client.cycle) {
			ChatChannel.method2058(var1);
		} else {
			class226.method5102(var1);
		}

		if (var1.x < 128 || 13184 <= var1.x || var1.y < 128 || 13184 <= var1.y) {
			var1.method2446();
			var1.spotAnimation = 0;
			var1.field1083 = 0;
			var1.clearSpotAnimations();
			var1.x = var1.size * 64 + var1.pathX[0] * 128;
			var1.y = var1.pathY[0] * 128 + var1.size * 64;
			var1.method2450();
		}

		if (var1 == class159.localPlayer && (var1.x < 1536 || 11776 <= var1.x || var1.y < 1536 || 11776 <= var1.y)) {
			var1.method2446();
			var1.spotAnimation = 0;
			var1.field1083 = 0;
			var1.clearSpotAnimations();
			var1.x = var1.pathX[0] * 128 + var1.size * 64;
			var1.y = var1.pathY[0] * 128 + var1.size * 64;
			var1.method2450();
		}

		class268.method6066(var0, var1);
		Client.field472.method11014(var0, var1.x, var1.y, var1 == class159.localPlayer);
		int var3 = CollisionMap.method6234(var1.poseAnimationSequence, 1, Client.field472);
		if ((var3 & 2) != 0) {
			var1.poseAnimationSequence.method9630();
		}

		var1.field1074.setSequence(var1.idleSequence);
		if (var1.poseAnimationSequence.method9666() > 0 && var1.field1074.method9666() < 30) {
			if (var1.poseAnimationSequence.getId() == var1.field1074.getId()) {
				var1.field1074.setSequence(var1.poseAnimationSequence);
			} else {
				int var4 = CollisionMap.method6234(var1.field1074, 1, (class466)null);
				if ((var4 & 2) != 0) {
					var1.field1074.method9630();
				}
			}
		}

		IterableNodeHashTableIterator var8 = new IterableNodeHashTableIterator(var1.method2455());

		for (ActorSpotAnim var5 = (ActorSpotAnim)var8.method8636(); var5 != null; var5 = (ActorSpotAnim)var8.next()) {
			if (var5.id != -1 && Client.cycle >= var5.field5510) {
				AnimationSequence var6 = var5.animationSequence;
				if (!var6.isActive()) {
					var5.remove();
					--var1.graphicsCount;
				} else {
					int var7 = CollisionMap.method6234(var6, 1, Client.field472);
					if ((var7 & 1) != 0) {
						var5.remove();
						--var1.graphicsCount;
					}
				}
			}
		}

		if (var1.animationSequence.isActive() && var1.field1054 <= 1) {
			SequenceDefinition var10 = var1.animationSequence.getSequenceDefinition();
			if (var10.field2489 == 1 && var1.field1094 > 0 && var1.spotAnimation <= Client.cycle && var1.field1083 < Client.cycle) {
				var1.field1054 = 1;
				return;
			}
		}

		if (var1.field1054 > 0) {
			--var1.field1054;
		} else {
			int var9 = CollisionMap.method6234(var1.animationSequence, 1, Client.field472);
			if ((var9 & 2) != 0) {
				var1.animationSequence.reset();
			}
		}

		var1.isWalking = var1.animationSequence.isActive() && var1.animationSequence.getSequenceDefinition().field2461;
		Client.field472.method11013();
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1096829814"
	)
	static final void method2774(int var0, int var1) {
		if (Client.field576.method8230() == 2) {
			WorldView var2 = Client.worldViewManager.method2368(Client.field576.method8250(), Client.field576.method8235());
			int var3 = (Client.field576.method8250() - var2.baseX << 7) + Client.field576.method8232();
			int var4 = (Client.field576.method8235() - var2.baseY << 7) + Client.field576.method8234();
			int var5 = Client.field576.method8246() * 2;
			class203.method4563(var2, var3, var4, var5, 0);
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) {
				ArchiveDisk.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}

		}
	}
}
