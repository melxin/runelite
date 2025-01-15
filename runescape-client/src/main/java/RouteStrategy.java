import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kv")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("hq")
	static String field3024;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 843506147
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 200025215
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1048838837
	)
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 322017111
	)
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;

	protected RouteStrategy() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIILku;B)Z",
		garbageValue = "-42"
	)
	@Export("hasArrived")
	protected abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1148389678"
	)
	public static void method5847(int var0, int var1) {
		VarbitComposition var2 = ModelData0.method4806(var0);
		int var3 = var2.baseVar;
		int var4 = var2.startBit;
		int var5 = var2.endBit;
		int var6 = Varps.Varps_masks[var5 - var4];
		if (var1 < 0 || var1 > var6) {
			var1 = 0;
		}

		var6 <<= var4;
		Varps.Varps_main[var3] = Varps.Varps_main[var3] & ~var6 | var1 << var4 & var6;
	}

	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2028955871"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		class150.method3598();

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var1.obj != null) {
				var1.set();
			}
		}

		int var3 = class254.VarpDefinition_get(var0).type;
		if (var3 != 0) {
			int var2 = Varps.Varps_main[var0];
			if (var3 == 1) {
				if (var2 == 1) {
					class33.method522(0.9D);
				}

				if (var2 == 2) {
					class33.method522(0.8D);
				}

				if (var2 == 3) {
					class33.method522(0.7D);
				}

				if (var2 == 4) {
					class33.method522(0.6D);
				}
			}

			if (var3 == 3) {
				if (var2 == 0) {
					class149.setMusicVolume(255);
				}

				if (var2 == 1) {
					class149.setMusicVolume(192);
				}

				if (var2 == 2) {
					class149.setMusicVolume(128);
				}

				if (var2 == 3) {
					class149.setMusicVolume(64);
				}

				if (var2 == 4) {
					class149.setMusicVolume(0);
				}
			}

			if (var3 == 4) {
				if (var2 == 0) {
					ClanChannel.method3839(127);
				}

				if (var2 == 1) {
					ClanChannel.method3839(96);
				}

				if (var2 == 2) {
					ClanChannel.method3839(64);
				}

				if (var2 == 3) {
					ClanChannel.method3839(32);
				}

				if (var2 == 4) {
					ClanChannel.method3839(0);
				}
			}

			if (var3 == 5) {
				Client.leftClickOpensMenu = var2 == 1;
			}

			if (var3 == 6) {
				Client.chatEffects = var2;
			}

			if (var3 == 9) {
			}

			if (var3 == 10) {
				if (var2 == 0) {
					class240.method5252(127);
				}

				if (var2 == 1) {
					class240.method5252(96);
				}

				if (var2 == 2) {
					class240.method5252(64);
				}

				if (var2 == 3) {
					class240.method5252(32);
				}

				if (var2 == 4) {
					class240.method5252(0);
				}
			}

			if (var3 == 17) {
				Client.followerIndex = var2 & 65535;
			}

			if (var3 == 18) {
				Client.playerAttackOption = (AttackOption)StructComposition.findEnumerated(AuthenticationScheme.method3561(), var2);
				if (Client.playerAttackOption == null) {
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var3 == 19) {
				if (var2 == -1) {
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047;
				}
			}

			if (var3 == 22) {
				Client.npcAttackOption = (AttackOption)StructComposition.findEnumerated(AuthenticationScheme.method3561(), var2);
				if (Client.npcAttackOption == null) {
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	}

	@ObfuscatedName("on")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)Ljava/lang/String;",
		garbageValue = "59"
	)
	static String method5846(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://";
		if (Client.gameBuild == 1) {
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) {
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) {
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) {
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) {
			var0 = "local";
		}

		String var3 = "";
		if (Language.field4674 != null) {
			var3 = "/p=" + Language.field4674;
		}

		String var4 = "runescape.com";
		return var2 + var0 + "." + var4 + "/l=" + ScriptFrame.clientLanguage + "/a=" + class483.field5046 + var3 + "/";
	}
}
