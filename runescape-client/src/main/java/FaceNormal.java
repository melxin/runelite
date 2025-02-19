import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jp")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("bo")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1683601757
	)
	@Export("x")
	int x;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1114771997
	)
	@Export("y")
	int y;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -790978015
	)
	@Export("z")
	int z;

	FaceNormal() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Lmo;",
		garbageValue = "-22"
	)
	static PacketBufferNode method5190() {
		return PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0 ? new PacketBufferNode() : PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
	}

	@ObfuscatedName("ao")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 18 & 4294967295L);
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2059956556"
	)
	static final void method5194() {
		if (FloatProjection.field2787) {
			Iterator var0 = Client.worldViewManager.iterator();

			while (var0.hasNext()) {
				WorldView var1 = (WorldView)var0.next();

				for (int var2 = 0; var2 < Client.playerUpdateManager.playerCount; ++var2) {
					Player var3 = (Player)class200.topLevelWorldView.players.get((long)Client.playerUpdateManager.playerIndices[var2]);
					if (var3 != null) {
						var3.method2476();
					}
				}
			}

			FloatProjection.field2787 = false;
		}

	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(Ldp;I)V",
		garbageValue = "-1562587506"
	)
	static void method5192(WorldView var0) {
		if (Client.combatTargetPlayerIndex >= 0 && var0.players.get((long)Client.combatTargetPlayerIndex) != null) {
			VarbitComposition.addPlayerToScene(var0, Client.combatTargetPlayerIndex, false);
		}

	}

	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "(Lnz;I)V",
		garbageValue = "1684434466"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0) {
		if (var0.buttonType == 1) {
			class60.method1157(var0.buttonText, "", 24, 0, 0, var0.id, var0.itemId);
		}

		if (var0.buttonType == 2 && !Client.isSpellSelected) {
			String var1 = PlayerType.Widget_getSpellActionName(var0);
			if (var1 != null) {
				class60.method1157(var1, MilliClock.colorStartTag(65280) + var0.field4054, 25, 0, -1, var0.id, var0.itemId);
			}
		}

		if (var0.buttonType == 3) {
			ObjectSound.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id);
		}

		if (var0.buttonType == 4) {
			ObjectSound.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id);
		}

		if (var0.buttonType == 5) {
			ObjectSound.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id);
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) {
			ObjectSound.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id);
		}

		if (var0.isIf3) {
			int var2;
			boolean var9;
			if (Client.isSpellSelected) {
				var2 = class441.getWidgetFlags(var0);
				var9 = (var2 >> 21 & 1) != 0;
				if (var9 && (Message.selectedSpellFlags & 32) == 32) {
					class60.method1157(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id, var0.itemId);
				}
			} else {
				for (int var11 = 9; var11 >= 0; --var11) {
					String var10;
					if (var0.field4056 * -1223108993 == var11) {
						var10 = PlayerType.Widget_getSpellActionName(var0);
						if (var10 != null) {
							class60.method1157(var10, var0.dataText, 25, 0, var0.childIndex, var0.id, var0.itemId);
						}
					}

					if (!HitSplatDefinition.method4135(class441.getWidgetFlags(var0), var11) && var0.onOp == null) {
						var10 = null;
					} else if (var0.actions != null && var0.actions.length > var11 && var0.actions[var11] != null && var0.actions[var11].trim().length() != 0) {
						var10 = var0.actions[var11];
					} else {
						var10 = null;
					}

					if (var10 != null) {
						int var4;
						short var5;
						if (var11 > var0.field4056 * -1223108993) {
							var5 = 1007;
							var4 = class60.method1157(var10, var0.dataText, var5, var11 + 1, var0.childIndex, var0.id, var0.itemId);
						} else {
							var5 = 57;
							var4 = WorldMapSprite.insertMenuItem(var10, var0.dataText, var5, var11 + 1, var0.childIndex, var0.id, var0.itemId, var0.prioritizeMenuEntry, -1);
						}

						if (var0.field4017 != null && var11 < var0.field4017.length && var0.field4017[var11] != null) {
							String[] var6 = var0.field4017[var11];

							for (int var7 = var6.length - 1; var7 >= 0; --var7) {
								int var8 = var7 + 1 << 16 | var11 + 1;
								if (var6[var7] != null && !var6[var7].isEmpty()) {
									class134.method3337(var4, var6[var7], "", var5, var8, var0.childIndex, var0.id, var0.itemId, -1);
								}
							}
						}
					}
				}

				var2 = class441.getWidgetFlags(var0);
				var9 = (var2 & 1) != 0;
				if (var9) {
					ObjectSound.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id);
				}
			}
		}

	}
}
