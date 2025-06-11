import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gs")
public class class172 extends class165 {
	@ObfuscatedName("oy")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("loginState")
	static LoginState loginState;
	@ObfuscatedName("ap")
	String field1864;
	@ObfuscatedName("aj")
	byte field1866;
	@ObfuscatedName("an")
	byte field1865;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	final class166 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgg;)V"
	)
	class172(class166 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "-830685594"
	)
	void vmethod3902(Buffer var1) {
		this.field1864 = var1.readStringCp1252NullTerminatedOrNull();
		if (this.field1864 != null) {
			var1.readUnsignedByte();
			this.field1866 = var1.readByte();
			this.field1865 = var1.readByte();
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lgd;B)V",
		garbageValue = "0"
	)
	void vmethod3908(ClanChannel var1) {
		var1.name = this.field1864;
		if (this.field1864 != null) {
			var1.field1851 = this.field1866;
			var1.field1852 = this.field1865;
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "255"
	)
	public static void method3903() {
		try {
			JagexCache.JagexCache_dat2File.close();

			for (int var0 = 0; var0 < JagexCache.field2435; ++var0) {
				JagexCache.JagexCache_idxFiles[var0].close();
			}

			JagexCache.JagexCache_idx255File.close();
			JagexCache.JagexCache_randomDat.close();
		} catch (Exception var2) {
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "9"
	)
	static int method3911() {
		return Login.loginIndex;
	}

	@ObfuscatedName("nq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1963321979"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		class134.method3521();
		Iterator var1 = Client.worldViewManager.iterator();

		while (var1.hasNext()) {
			WorldView var5 = (WorldView)var1.next();

			for (ObjectSound var3 = (ObjectSound)var5.method2533().last(); var3 != null; var3 = (ObjectSound)var5.method2533().previous()) {
				if (var3.obj != null) {
					var3.set();
				}
			}
		}

		int var4 = FriendSystem.method1550(var0).type;
		if (var4 != 0) {
			int var2 = Varps.Varps_main[var0];
			if (var4 == 1) {
				if (var2 == 1) {
					class6.method35(0.9D);
				}

				if (var2 == 2) {
					class6.method35(0.8D);
				}

				if (var2 == 3) {
					class6.method35(0.7D);
				}

				if (var2 == 4) {
					class6.method35(0.6D);
				}
			}

			if (var4 == 3) {
				if (var2 == 0) {
					class540.setMusicVolume(255);
				}

				if (var2 == 1) {
					class540.setMusicVolume(192);
				}

				if (var2 == 2) {
					class540.setMusicVolume(128);
				}

				if (var2 == 3) {
					class540.setMusicVolume(64);
				}

				if (var2 == 4) {
					class540.setMusicVolume(0);
				}
			}

			if (var4 == 4) {
				if (var2 == 0) {
					WorldMapSprite.method6621(127);
				}

				if (var2 == 1) {
					WorldMapSprite.method6621(96);
				}

				if (var2 == 2) {
					WorldMapSprite.method6621(64);
				}

				if (var2 == 3) {
					WorldMapSprite.method6621(32);
				}

				if (var2 == 4) {
					WorldMapSprite.method6621(0);
				}
			}

			if (var4 == 5) {
				Client.leftClickOpensMenu = var2 == 1;
			}

			if (var4 == 6) {
				Client.chatEffects = var2;
			}

			if (var4 == 9) {
			}

			if (var4 == 10) {
				if (var2 == 0) {
					class462.method9240(127);
				}

				if (var2 == 1) {
					class462.method9240(96);
				}

				if (var2 == 2) {
					class462.method9240(64);
				}

				if (var2 == 3) {
					class462.method9240(32);
				}

				if (var2 == 4) {
					class462.method9240(0);
				}
			}

			if (var4 == 17) {
				Client.followerIndex = var2 & 65535;
			}

			if (var4 == 18) {
				Client.playerAttackOption = (AttackOption)class175.findEnumerated(class36.method697(), var2);
				if (Client.playerAttackOption == null) {
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var4 == 19) {
				if (var2 == -1) {
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047;
				}
			}

			if (var4 == 22) {
				Client.npcAttackOption = (AttackOption)class175.findEnumerated(class36.method697(), var2);
				if (Client.npcAttackOption == null) {
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	}
}
