import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("an")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class51 {
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	static StudioGame field93;

	DevicePcmPlayerProvider() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Lbf;",
		garbageValue = "107"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lvy;[IS)[Ljava/lang/Object;",
		garbageValue = "-7540"
	)
	static Object[] method274(Buffer var0, int[] var1) {
		int var2 = var0.readUShortSmart();
		Object[] var3 = new Object[var1.length * var2];

		for (int var4 = 0; var4 < var2; ++var4) {
			for (int var5 = 0; var5 < var1.length; ++var5) {
				int var6 = var1.length * var4 + var5;
				class555 var7 = class330.method6526(var1[var5]);
				var3[var6] = var7.method10075(var0);
			}
		}

		return var3;
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(Ldp;IIII)I",
		garbageValue = "1092236437"
	)
	@Export("getTileHeight")
	static final int getTileHeight(WorldView var0, int var1, int var2, int var3) {
		int var4 = var1 >> 7;
		int var5 = var2 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 < var0.tileSettings[0].length && var5 < var0.tileSettings[0][0].length) {
			int var6 = var3;
			if (var3 < 3 && (var0.tileSettings[1][var4][var5] & 2) == 2) {
				var6 = var3 + 1;
			}

			int var7 = var1 & 127;
			int var8 = var2 & 127;
			int var9 = var0.tileHeights[var6][var4 + 1][var5] * var7 + var0.tileHeights[var6][var4][var5] * (128 - var7) >> 7;
			int var10 = var7 * var0.tileHeights[var6][var4 + 1][var5 + 1] + var0.tileHeights[var6][var4][var5 + 1] * (128 - var7) >> 7;
			return var10 * var8 + var9 * (128 - var8) >> 7;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("mx")
	@ObfuscatedSignature(
		descriptor = "([Lnz;II)V",
		garbageValue = "1924608045"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null) {
				if (var3.type == 0) {
					if (var3.children != null) {
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
					if (var4 != null) {
						UrlRequester.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) {
					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onDialogAbort;
					MilliClock.runScriptEvent(var5);
				}

				if (var1 == 1 && var3.onSubChange != null) {
					if (var3.childIndex >= 0) {
						Widget var6 = class376.widgetDefinition.method6918(var3.id);
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) {
							continue;
						}
					}

					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onSubChange;
					MilliClock.runScriptEvent(var5);
				}
			}
		}

	}

	@ObfuscatedName("nu")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1591674633"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		class478.method9065();
		WorldMapSprite.method6290();
		int var1 = Login.VarpDefinition_get(var0).type;
		if (var1 != 0) {
			int var2 = Varps.Varps_main[var0];
			if (var1 == 1) {
				if (var2 == 1) {
					ScriptFrame.method1177(0.9D);
				}

				if (var2 == 2) {
					ScriptFrame.method1177(0.8D);
				}

				if (var2 == 3) {
					ScriptFrame.method1177(0.7D);
				}

				if (var2 == 4) {
					ScriptFrame.method1177(0.6D);
				}
			}

			if (var1 == 3) {
				if (var2 == 0) {
					class53.setMusicVolume(255);
				}

				if (var2 == 1) {
					class53.setMusicVolume(192);
				}

				if (var2 == 2) {
					class53.setMusicVolume(128);
				}

				if (var2 == 3) {
					class53.setMusicVolume(64);
				}

				if (var2 == 4) {
					class53.setMusicVolume(0);
				}
			}

			if (var1 == 4) {
				if (var2 == 0) {
					MusicPatchNode.method6831(127);
				}

				if (var2 == 1) {
					MusicPatchNode.method6831(96);
				}

				if (var2 == 2) {
					MusicPatchNode.method6831(64);
				}

				if (var2 == 3) {
					MusicPatchNode.method6831(32);
				}

				if (var2 == 4) {
					MusicPatchNode.method6831(0);
				}
			}

			if (var1 == 5) {
				Client.leftClickOpensMenu = var2 == 1;
			}

			if (var1 == 6) {
				Client.chatEffects = var2;
			}

			if (var1 == 9) {
			}

			if (var1 == 10) {
				if (var2 == 0) {
					class329.method6519(127);
				}

				if (var2 == 1) {
					class329.method6519(96);
				}

				if (var2 == 2) {
					class329.method6519(64);
				}

				if (var2 == 3) {
					class329.method6519(32);
				}

				if (var2 == 4) {
					class329.method6519(0);
				}
			}

			if (var1 == 17) {
				Client.followerIndex = var2 & 65535;
			}

			if (var1 == 18) {
				Client.playerAttackOption = (AttackOption)class454.findEnumerated(WorldMapSection1.method6317(), var2);
				if (Client.playerAttackOption == null) {
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var1 == 19) {
				if (var2 == -1) {
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047;
				}
			}

			if (var1 == 22) {
				Client.npcAttackOption = (AttackOption)class454.findEnumerated(WorldMapSection1.method6317(), var2);
				if (Client.npcAttackOption == null) {
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	}
}
