import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
@Implements("LoginPacket")
public class LoginPacket extends class149 {
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 847979093
	)
	static int field1705;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = 3986657128780362739L
	)
	long field1706;
	@ObfuscatedName("aj")
	String field1703;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	final class152 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfp;)V"
	)
	LoginPacket(class152 var1) {
		this.this$0 = var1;
		this.field1706 = -1L;
		this.field1703 = null;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "-1635342078"
	)
	void vmethod3913(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1706 = var1.readLong();
		}

		this.field1703 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lgu;I)V",
		garbageValue = "-1572789515"
	)
	void vmethod3914(ClanSettings var1) {
		var1.method3747(this.field1706, this.field1703, 0);
	}

	@ObfuscatedName("ap")
	public static final int method3649(double var0, double var2, double var4) {
		double var6 = var4;
		double var8 = var4;
		double var10 = var4;
		if (var2 != 0.0D) {
			double var12;
			if (var4 < 0.5D) {
				var12 = var4 * (1.0D + var2);
			} else {
				var12 = var2 + var4 - var4 * var2;
			}

			double var14 = var4 * 2.0D - var12;
			double var16 = 0.3333333333333333D + var0;
			if (var16 > 1.0D) {
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D;
			if (var20 < 0.0D) {
				++var20;
			}

			if (var16 * 6.0D < 1.0D) {
				var6 = var14 + var16 * (var12 - var14) * 6.0D;
			} else if (var16 * 2.0D < 1.0D) {
				var6 = var12;
			} else if (3.0D * var16 < 2.0D) {
				var6 = 6.0D * (0.6666666666666666D - var16) * (var12 - var14) + var14;
			} else {
				var6 = var14;
			}

			if (var0 * 6.0D < 1.0D) {
				var8 = var0 * (var12 - var14) * 6.0D + var14;
			} else if (var0 * 2.0D < 1.0D) {
				var8 = var12;
			} else if (3.0D * var0 < 2.0D) {
				var8 = var14 + 6.0D * (var12 - var14) * (0.6666666666666666D - var0);
			} else {
				var8 = var14;
			}

			if (var20 * 6.0D < 1.0D) {
				var10 = var14 + var20 * 6.0D * (var12 - var14);
			} else if (2.0D * var20 < 1.0D) {
				var10 = var12;
			} else if (var20 * 3.0D < 2.0D) {
				var10 = var14 + 6.0D * (0.6666666666666666D - var20) * (var12 - var14);
			} else {
				var10 = var14;
			}
		}

		int var22 = (int)(256.0D * var6);
		int var13 = (int)(256.0D * var8);
		int var23 = (int)(256.0D * var10);
		int var15 = var23 + (var13 << 8) + (var22 << 16);
		return var15;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-19821417"
	)
	public static int method3651(int var0, int var1) {
		return (var0 << 8) + var1;
	}

	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "(Lcp;IIIIB)V",
		garbageValue = "-1"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3, int var4) {
		if (var0.index != Client.localPlayerIndex) {
			if (Client.menu.menuOptionsCount < 400) {
				String var5;
				if (var0.skillLevel == 0) {
					var5 = var0.actions[0] + var0.username + var0.actions[1] + UserComparator5.method3409(var0.combatLevel, class152.localPlayer.combatLevel) + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2];
				} else {
					var5 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2];
				}

				int var6;
				if (Client.isItemSelected == 1) {
					GrandExchangeOfferOwnWorldComparator.insertMenuItem("Use", Client.field520 + " " + "->" + " " + AbstractWorldMapIcon.colorStartTag(16777215) + var5, 14, var1, var2, var3, -1, false, var4);
				} else if (Client.isSpellSelected) {
					if ((class448.selectedSpellFlags & 8) == 8) {
						GrandExchangeOfferOwnWorldComparator.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + AbstractWorldMapIcon.colorStartTag(16777215) + var5, 15, var1, var2, var3, -1, false, var4);
					}
				} else {
					for (var6 = 7; var6 >= 0; --var6) {
						if (Client.playerMenuActions[var6] != null) {
							short var7 = 0;
							if (Client.playerMenuActions[var6].equalsIgnoreCase("Attack")) {
								if (AttackOption.AttackOption_hidden == Client.playerAttackOption) {
									continue;
								}

								if (AttackOption.AttackOption_alwaysRightClick == Client.playerAttackOption || Client.playerAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var0.combatLevel > class152.localPlayer.combatLevel) {
									var7 = 2000;
								}

								if (class152.localPlayer.team != 0 && var0.team != 0) {
									if (var0.team == class152.localPlayer.team) {
										var7 = 2000;
									} else {
										var7 = 0;
									}
								} else if (Client.playerAttackOption == AttackOption.field1192 && var0.isClanMember()) {
									var7 = 2000;
								}
							} else if (Client.playerOptionsPriorities[var6]) {
								var7 = 2000;
							}

							boolean var8 = false;
							int var9 = Client.playerMenuOpcodes[var6] + var7;
							GrandExchangeOfferOwnWorldComparator.insertMenuItem(Client.playerMenuActions[var6], AbstractWorldMapIcon.colorStartTag(16777215) + var5, var9, var1, var2, var3, -1, false, var4);
						}
					}
				}

				for (var6 = 0; var6 < Client.menu.menuOptionsCount; ++var6) {
					if (Client.menu.menuOpcodes[var6] == 23) {
						Client.menu.menuTargets[var6] = AbstractWorldMapIcon.colorStartTag(16777215) + var5;
						break;
					}
				}

			}
		}
	}
}
