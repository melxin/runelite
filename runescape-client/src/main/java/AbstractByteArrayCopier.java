import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ot")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	@ObfuscatedName("iw")
	@ObfuscatedGetter(
		longValue = -1229276694949097609L
	)
	static long field4311;

	AbstractByteArrayCopier() {
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "1821922934"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "0"
	)
	@Export("set")
	abstract void set(byte[] var1);

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "96"
	)
	public static int method8118(int var0, int var1) {
		return (int)(Math.atan2((double)var0, (double)var1) * 325.94932345220167D) & 2047;
	}

	@ObfuscatedName("nc")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-65"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		Message.method768();
		class467.method9559();
		int var1 = Actor.VarpDefinition_get(var0).type;
		if (var1 != 0) {
			int var2 = Varps.Varps_main[var0];
			if (var1 == 1) {
				if (var2 == 1) {
					class259.method5906(0.9D);
				}

				if (var2 == 2) {
					class259.method5906(0.8D);
				}

				if (var2 == 3) {
					class259.method5906(0.7D);
				}

				if (var2 == 4) {
					class259.method5906(0.6D);
				}
			}

			if (var1 == 3) {
				if (var2 == 0) {
					class240.setMusicVolume(255);
				}

				if (var2 == 1) {
					class240.setMusicVolume(192);
				}

				if (var2 == 2) {
					class240.setMusicVolume(128);
				}

				if (var2 == 3) {
					class240.setMusicVolume(64);
				}

				if (var2 == 4) {
					class240.setMusicVolume(0);
				}
			}

			if (var1 == 4) {
				if (var2 == 0) {
					class270.method6071(127);
				}

				if (var2 == 1) {
					class270.method6071(96);
				}

				if (var2 == 2) {
					class270.method6071(64);
				}

				if (var2 == 3) {
					class270.method6071(32);
				}

				if (var2 == 4) {
					class270.method6071(0);
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
					class558.method10857(127);
				}

				if (var2 == 1) {
					class558.method10857(96);
				}

				if (var2 == 2) {
					class558.method10857(64);
				}

				if (var2 == 3) {
					class558.method10857(32);
				}

				if (var2 == 4) {
					class558.method10857(0);
				}
			}

			if (var1 == 17) {
				Client.followerIndex = var2 & 65535;
			}

			AttackOption[] var3;
			if (var1 == 18) {
				var3 = new AttackOption[]{AttackOption.field1216, AttackOption.field1212, AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_hidden};
				Client.playerAttackOption = (AttackOption)class173.findEnumerated(var3, var2);
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
				var3 = new AttackOption[]{AttackOption.field1216, AttackOption.field1212, AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_hidden};
				Client.npcAttackOption = (AttackOption)class173.findEnumerated(var3, var2);
				if (Client.npcAttackOption == null) {
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	}
}
