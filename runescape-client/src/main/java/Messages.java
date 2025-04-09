import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("er")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("ao")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1230698183
	)
	@Export("Messages_count")
	static int Messages_count;
	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("soundEffectsArchive")
	static Archive soundEffectsArchive;

	static {
		Messages_channels = new HashMap();
		Messages_hashTable = new IterableNodeHashTable(1024);
		Messages_queue = new IterableDualNodeQueue();
		Messages_count = 0;
	}

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(Ldu;IIIIB)V",
		garbageValue = "61"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3, int var4) {
		if (var0.index != Client.localPlayerIndex) {
			if (Client.menu.menuOptionsCount < 400) {
				String var5;
				if (var0.skillLevel == 0) {
					var5 = var0.actions[0] + var0.username + var0.actions[1] + class322.method6541(var0.combatLevel, Script.localPlayer.combatLevel) + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2];
				} else {
					var5 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2];
				}

				int var6;
				if (Client.isItemSelected == 1) {
					UserComparator6.insertMenuItem("Use", Client.field713 + " " + "->" + " " + Decimator.colorStartTag(16777215) + var5, 14, var1, var2, var3, -1, false, var4);
				} else if (Client.isSpellSelected) {
					if ((class31.selectedSpellFlags & 8) == 8) {
						UserComparator6.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + Decimator.colorStartTag(16777215) + var5, 15, var1, var2, var3, -1, false, var4);
					}
				} else {
					for (var6 = 7; var6 >= 0; --var6) {
						if (Client.playerMenuActions[var6] != null) {
							short var7 = 0;
							if (Client.playerMenuActions[var6].equalsIgnoreCase("Attack")) {
								if (Client.playerAttackOption == AttackOption.AttackOption_hidden) {
									continue;
								}

								if (AttackOption.AttackOption_alwaysRightClick == Client.playerAttackOption || AttackOption.AttackOption_dependsOnCombatLevels == Client.playerAttackOption && var0.combatLevel > Script.localPlayer.combatLevel) {
									var7 = 2000;
								}

								if (Script.localPlayer.team != 0 && var0.team != 0) {
									if (var0.team == Script.localPlayer.team) {
										var7 = 2000;
									} else {
										var7 = 0;
									}
								} else if (Client.playerAttackOption == AttackOption.field1388 && var0.isClanMember()) {
									var7 = 2000;
								}
							} else if (Client.playerOptionsPriorities[var6]) {
								var7 = 2000;
							}

							boolean var8 = false;
							int var9 = Client.playerMenuOpcodes[var6] + var7;
							UserComparator6.insertMenuItem(Client.playerMenuActions[var6], Decimator.colorStartTag(16777215) + var5, var9, var1, var2, var3, -1, false, var4);
						}
					}
				}

				for (var6 = 0; var6 < Client.menu.menuOptionsCount; ++var6) {
					if (Client.menu.menuOpcodes[var6] == 23) {
						Client.menu.menuTargets[var6] = Decimator.colorStartTag(16777215) + var5;
						break;
					}
				}

			}
		}
	}
}
