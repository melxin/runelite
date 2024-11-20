import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gr")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("VarpDefinition_archive")
	public static AbstractArchive VarpDefinition_archive;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -414868437
	)
	public static int field1871;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("VarpDefinition_cached")
	static EvictingDualNodeHashTable VarpDefinition_cached;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -440527883
	)
	@Export("type")
	public int type;

	static {
		VarpDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	VarpDefinition() {
		this.type = 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lvj;I)V",
		garbageValue = "1919090813"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lvj;II)V",
		garbageValue = "-934032652"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 5) {
			this.type = var1.readUnsignedShort();
		}

	}

	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "(Ldy;IIIIB)V",
		garbageValue = "-107"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3, int var4) {
		if (var0.index != Client.localPlayerIndex) {
			if (Client.menu.menuOptionsCount < 400) {
				String var5;
				int var8;
				if (var0.skillLevel == 0) {
					String var6 = var0.actions[0] + var0.username + var0.actions[1];
					var8 = var0.combatLevel;
					int var9 = AsyncHttpResponse.localPlayer.combatLevel;
					int var10 = var9 - var8;
					String var7;
					if (var10 < -9) {
						var7 = class438.colorStartTag(16711680);
					} else if (var10 < -6) {
						var7 = class438.colorStartTag(16723968);
					} else if (var10 < -3) {
						var7 = class438.colorStartTag(16740352);
					} else if (var10 < 0) {
						var7 = class438.colorStartTag(16756736);
					} else if (var10 > 9) {
						var7 = class438.colorStartTag(65280);
					} else if (var10 > 6) {
						var7 = class438.colorStartTag(4259584);
					} else if (var10 > 3) {
						var7 = class438.colorStartTag(8453888);
					} else if (var10 > 0) {
						var7 = class438.colorStartTag(12648192);
					} else {
						var7 = class438.colorStartTag(16776960);
					}

					var5 = var6 + var7 + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2];
				} else {
					var5 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2];
				}

				int var11;
				if (Client.isItemSelected == 1) {
					LoginScreenAnimation.insertMenuItem("Use", Client.field667 + " " + "->" + " " + class438.colorStartTag(16777215) + var5, 14, var1, var2, var3, -1, false, var4);
				} else if (Client.isSpellSelected) {
					if ((class202.selectedSpellFlags & 8) == 8) {
						LoginScreenAnimation.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class438.colorStartTag(16777215) + var5, 15, var1, var2, var3, -1, false, var4);
					}
				} else {
					for (var11 = 7; var11 >= 0; --var11) {
						if (Client.playerMenuActions[var11] != null) {
							short var12 = 0;
							if (Client.playerMenuActions[var11].equalsIgnoreCase("Attack")) {
								if (AttackOption.AttackOption_hidden == Client.playerAttackOption) {
									continue;
								}

								if (AttackOption.AttackOption_alwaysRightClick == Client.playerAttackOption || Client.playerAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var0.combatLevel > AsyncHttpResponse.localPlayer.combatLevel) {
									var12 = 2000;
								}

								if (AsyncHttpResponse.localPlayer.team != 0 && var0.team != 0) {
									if (var0.team == AsyncHttpResponse.localPlayer.team) {
										var12 = 2000;
									} else {
										var12 = 0;
									}
								} else if (Client.playerAttackOption == AttackOption.field1379 && var0.isClanMember()) {
									var12 = 2000;
								}
							} else if (Client.playerOptionsPriorities[var11]) {
								var12 = 2000;
							}

							boolean var13 = false;
							var8 = Client.playerMenuOpcodes[var11] + var12;
							LoginScreenAnimation.insertMenuItem(Client.playerMenuActions[var11], class438.colorStartTag(16777215) + var5, var8, var1, var2, var3, -1, false, var4);
						}
					}
				}

				for (var11 = 0; var11 < Client.menu.menuOptionsCount; ++var11) {
					if (Client.menu.menuOpcodes[var11] == 23) {
						Client.menu.menuTargets[var11] = class438.colorStartTag(16777215) + var5;
						break;
					}
				}

			}
		}
	}
}
