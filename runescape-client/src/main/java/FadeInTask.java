import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rj")
@Implements("FadeInTask")
public class FadeInTask extends SongTask {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	MusicSong field4864;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1935554183
	)
	int field4865;

	@ObfuscatedSignature(
		descriptor = "(Lrh;IZI)V"
	)
	public FadeInTask(SongTask var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field4864 = null;
		this.field4865 = 0;
		super.field4868 = "FadeInTask";
		if (var2 >= 0) {
			if (var3 && var2 < class333.field3631.size()) {
				this.field4864 = (MusicSong)class333.field3631.get(var2);
			} else if (!var3 && var2 < class333.musicSongs.size()) {
				this.field4864 = (MusicSong)class333.musicSongs.get(var2);
			}

			this.field4865 = var4;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1892560666"
	)
	public boolean vmethod8883() {
		if (this.field4864 != null && this.field4864.midiPcmStream != null) {
			this.field4864.field3745 = true;

			try {
				if (this.field4864.field3739 < (float)this.field4864.musicTrackVolume && this.field4864.midiPcmStream.isReady()) {
					float var1 = this.field4865 == 0 ? (float)this.field4865 : (float)this.field4864.musicTrackVolume / (float)this.field4865;
					MusicSong var10000 = this.field4864;
					var10000.field3739 += 0.0F == var1 ? (float)this.field4864.musicTrackVolume : var1;
					if (this.field4864.field3739 > (float)this.field4864.musicTrackVolume) {
						this.field4864.field3739 = (float)this.field4864.musicTrackVolume;
					}

					this.field4864.midiPcmStream.setPcmStreamVolume((int)this.field4864.field3739);
					return false;
				}
			} catch (Exception var3) {
				this.method8861(var3.getMessage());
				return true;
			}

			this.field4864.field3745 = false;
			return true;
		} else {
			return true;
		}
	}

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(Leq;IIIII)V",
		garbageValue = "406804930"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPC var0, int var1, int var2, int var3, int var4) {
		NPCComposition var5 = var0.definition;
		if (Client.menu.menuOptionsCount < 400) {
			if (var5.transforms != null) {
				var5 = var5.transform();
			}

			if (var5 != null) {
				if (var5.isInteractable) {
					if (!var5.isFollower || Client.followerIndex == var1) {
						String var6 = var0.method3015();
						int var7;
						if (var5.combatLevel != 0 && var0.field1209 != 0) {
							var7 = var0.field1209 != -1 ? var0.field1209 : var5.combatLevel;
							var6 = var6 + ArchiveLoader.method2584(var7, ModeWhere.localPlayer.combatLevel) + " " + " (" + "level-" + var7 + ")";
						}

						if (var5.lowPriorityFollowerOps && Client.followerOpsLowPriority) {
							class231.insertMenuItem("Examine", WorldViewManager.colorStartTag(16776960) + var6, 1003, var1, var2, var3, -1, false, var4);
						}

						if (!class93.field1111 && Client.isItemSelected == 1) {
							class231.insertMenuItem("Use", Client.field570 + " " + "->" + " " + WorldViewManager.colorStartTag(16776960) + var6, 7, var1, var2, var3, -1, false, var4);
						} else if (Client.isSpellSelected) {
							if (!class93.field1111 && (class106.selectedSpellFlags & 2) == 2) {
								class231.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + WorldViewManager.colorStartTag(16776960) + var6, 8, var1, var2, var3, -1, false, var4);
							}
						} else {
							var7 = var5.lowPriorityFollowerOps && Client.followerOpsLowPriority ? 2000 : 0;
							String[] var8 = var5.actions;
							int var9;
							int var10;
							if (var8 != null) {
								for (var9 = 4; var9 >= 0; --var9) {
									if (!class93.field1111 && var0.method3066(var9) && var8[var9] != null && !var8[var9].equalsIgnoreCase("Attack")) {
										var10 = 0;
										if (var9 == 0) {
											var10 = var7 + 9;
										}

										if (var9 == 1) {
											var10 = var7 + 10;
										}

										if (var9 == 2) {
											var10 = var7 + 11;
										}

										if (var9 == 3) {
											var10 = var7 + 12;
										}

										if (var9 == 4) {
											var10 = var7 + 13;
										}

										class231.insertMenuItem(var8[var9], WorldViewManager.colorStartTag(16776960) + var6, var10, var1, var2, var3, -1, false, var4);
									}
								}
							}

							if (var8 != null) {
								for (var9 = 4; var9 >= 0; --var9) {
									if (!class93.field1111 && var0.method3066(var9) && var8[var9] != null && var8[var9].equalsIgnoreCase("Attack")) {
										short var11 = 0;
										if (AttackOption.AttackOption_hidden != Client.npcAttackOption) {
											if (Client.npcAttackOption == AttackOption.AttackOption_alwaysRightClick || AttackOption.AttackOption_dependsOnCombatLevels == Client.npcAttackOption && var5.combatLevel > ModeWhere.localPlayer.combatLevel) {
												var11 = 2000;
											}

											var10 = 0;
											if (var9 == 0) {
												var10 = var11 + 9;
											}

											if (var9 == 1) {
												var10 = var11 + 10;
											}

											if (var9 == 2) {
												var10 = var11 + 11;
											}

											if (var9 == 3) {
												var10 = var11 + 12;
											}

											if (var9 == 4) {
												var10 = var11 + 13;
											}

											class231.insertMenuItem(var8[var9], WorldViewManager.colorStartTag(16776960) + var6, var10, var1, var2, var3, -1, false, var4);
										}
									}
								}
							}

							if (!var5.lowPriorityFollowerOps || !Client.followerOpsLowPriority) {
								class231.insertMenuItem("Examine", WorldViewManager.colorStartTag(16776960) + var6, 1003, var1, var2, var3, -1, false, var4);
							}
						}

					}
				}
			}
		}
	}
}
