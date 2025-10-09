import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ko")
public class class271 implements class28 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	Widget field3199;
	@ObfuscatedName("at")
	boolean field3197;
	@ObfuscatedName("ag")
	boolean field3196;

	public class271() {
		this.field3199 = null;
		this.field3197 = false;
		this.field3196 = false;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2126195099"
	)
	public boolean vmethod6166(int var1) {
		if (this.field3199 == null) {
			return false;
		} else {
			class27 var2 = this.field3199.method7963();
			if (var2 == null) {
				return false;
			} else {
				if (var2.method412(var1)) {
					switch(var1) {
					case 81:
						this.field3196 = true;
						break;
					case 82:
						this.field3197 = true;
						break;
					default:
						if (this.method6100(var1)) {
							class154.invalidateWidget(this.field3199);
						}
					}
				}

				return var2.method410(var1);
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-124"
	)
	public boolean vmethod6127(int var1) {
		switch(var1) {
		case 81:
			this.field3196 = false;
			return false;
		case 82:
			this.field3197 = false;
			return false;
		default:
			return false;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "951729544"
	)
	public boolean vmethod6156(char var1) {
		if (this.field3199 == null) {
			return false;
		} else if (!class506.method10287(var1)) {
			return false;
		} else {
			class365 var2 = this.field3199.method8041();
			if (var2 != null && var2.method7664()) {
				class27 var3 = this.field3199.method7963();
				if (var3 == null) {
					return false;
				} else {
					if (var3.method430(var1) && var2.method7612(var1)) {
						class154.invalidateWidget(this.field3199);
					}

					return var3.method409(var1);
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-1474092400"
	)
	public boolean vmethod6138(boolean var1) {
		return false;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Lok;",
		garbageValue = "-349765571"
	)
	public Widget method6094() {
		return this.field3199;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lok;I)V",
		garbageValue = "978859036"
	)
	public void method6116(Widget var1) {
		if (var1 != null) {
			if (var1 != this.field3199) {
				this.method6096();
				this.field3199 = var1;
			}

			class363 var2 = var1.method7964();
			if (var2 != null) {
				if (!var2.field4093.method7826() && var2.field4092 != null) {
					ScriptEvent var3 = new ScriptEvent();
					var3.method2172(var1);
					var3.setArgs(var2.field4092);
					class215.method4888().addFirst(var3);
				}

				var2.field4093.method7883(true);
			}
		} else {
			this.method6096();
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-27"
	)
	public void method6096() {
		if (this.field3199 != null) {
			class363 var1 = this.field3199.method7964();
			Widget var2 = this.field3199;
			this.field3199 = null;
			if (var1 != null) {
				if (var1.field4093.method7826() && var1.field4092 != null) {
					ScriptEvent var3 = new ScriptEvent();
					var3.method2172(var2);
					var3.setArgs(var1.field4092);
					class215.method4888().addFirst(var3);
				}

				var1.field4093.method7883(false);
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1898164651"
	)
	boolean method6100(int var1) {
		if (this.field3199 == null) {
			return false;
		} else {
			class365 var2 = this.field3199.method8041();
			if (var2 != null && var2.method7664()) {
				switch(var1) {
				case 13:
					this.method6096();
					return true;
				case 48:
					if (this.field3197) {
						var2.method7632();
					}

					return true;
				case 65:
					if (this.field3197) {
						var2.method7651(class107.method3433());
					}

					return true;
				case 66:
					if (this.field3197) {
						var2.method7670(class107.method3433());
					}

					return true;
				case 67:
					if (this.field3197) {
						var2.method7652(class107.method3433());
					}

					return true;
				case 84:
					if (var2.method7659() == 0) {
						var2.method7612(10);
					} else if (this.field3196 && var2.method7844()) {
						var2.method7612(10);
					} else {
						class363 var3 = this.field3199.method7964();
						ScriptEvent var4 = new ScriptEvent();
						var4.method2172(this.field3199);
						var4.setArgs(var3.field4094);
						class215.method4888().addFirst(var4);
						this.method6096();
					}

					return true;
				case 85:
					if (this.field3197) {
						var2.method7629();
					} else {
						var2.method7799();
					}

					return true;
				case 96:
					if (this.field3197) {
						var2.method7868(this.field3196);
					} else {
						var2.method7638(this.field3196);
					}

					return true;
				case 97:
					if (this.field3197) {
						var2.method7650(this.field3196);
					} else {
						var2.method7639(this.field3196);
					}

					return true;
				case 98:
					if (this.field3197) {
						var2.method7867();
					} else {
						var2.method7642(this.field3196);
					}

					return true;
				case 99:
					if (this.field3197) {
						var2.method7653();
					} else {
						var2.method7789(this.field3196);
					}

					return true;
				case 101:
					if (this.field3197) {
						var2.method7824();
					} else {
						var2.method7686();
					}

					return true;
				case 102:
					if (this.field3197) {
						var2.method7857(this.field3196);
					} else {
						var2.method7668(this.field3196);
					}

					return true;
				case 103:
					if (this.field3197) {
						var2.method7812(this.field3196);
					} else {
						var2.method7635(this.field3196);
					}

					return true;
				case 104:
					if (this.field3197) {
						var2.method7691(this.field3196);
					} else {
						var2.method7644(this.field3196);
					}

					return true;
				case 105:
					if (this.field3197) {
						var2.method7628(this.field3196);
					} else {
						var2.method7791(this.field3196);
					}

					return true;
				default:
					return false;
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1910213838"
	)
	public static void method6111() {
		Arrays.fill(Varps.Varps_temp, 0);
		Arrays.fill(Varps.Varps_main, 0);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1007352606"
	)
	@Export("itemContainerSetItem")
	static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
		ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var4 == null) {
			var4 = new ItemContainer();
			ItemContainer.itemContainers.put(var4, (long)var0);
		}

		if (var4.ids.length <= var1) {
			int[] var5 = new int[var1 + 1];
			int[] var6 = new int[var1 + 1];

			int var7;
			for (var7 = 0; var7 < var4.ids.length; ++var7) {
				var5[var7] = var4.ids[var7];
				var6[var7] = var4.quantities[var7];
			}

			for (var7 = var4.ids.length; var7 < var1; ++var7) {
				var5[var7] = -1;
				var6[var7] = 0;
			}

			var4.ids = var5;
			var4.quantities = var6;
		}

		var4.ids[var1] = var2;
		var4.quantities[var1] = var3;
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(Lcs;III)V",
		garbageValue = "1658569677"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		SequenceDefinition var3 = var0.animationSequence.getSequenceDefinition();
		if (var1 == var0.animationSequence.getId() && var1 != -1) {
			int var4 = var3.restartMode;
			if (var4 == 1) {
				var0.animationSequence.method9630();
				var0.field1054 = var2;
			}

			if (var4 == 2) {
				var0.animationSequence.method9678();
			}
		} else if (var1 == -1 || !var0.animationSequence.isActive() || class171.SequenceDefinition_get(var1).field2485 >= var3.field2485) {
			var0.animationSequence.setSequence(var1);
			var0.animationSequence.method9630();
			var0.field1054 = var2;
			var0.field1094 = var0.pathLength;
		}

	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1756172375"
	)
	static void method6107() {
		for (class272 var0 = (class272)Client.field360.last(); var0 != null; var0 = (class272)Client.field360.previous()) {
			var0.remove();
		}

	}

	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-13727"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		class282.method6383();
		class342.method7336();
		int var1 = class70.VarpDefinition_get(var0).type;
		if (var1 != 0) {
			int var2 = Varps.Varps_main[var0];
			if (var1 == 1) {
				if (var2 == 1) {
					class323.method7032(0.9D);
				}

				if (var2 == 2) {
					class323.method7032(0.8D);
				}

				if (var2 == 3) {
					class323.method7032(0.7D);
				}

				if (var2 == 4) {
					class323.method7032(0.6D);
				}
			}

			if (var1 == 3) {
				if (var2 == 0) {
					class404.setMusicVolume(255);
				}

				if (var2 == 1) {
					class404.setMusicVolume(192);
				}

				if (var2 == 2) {
					class404.setMusicVolume(128);
				}

				if (var2 == 3) {
					class404.setMusicVolume(64);
				}

				if (var2 == 4) {
					class404.setMusicVolume(0);
				}
			}

			if (var1 == 4) {
				if (var2 == 0) {
					ClanChannel.method4122(127);
				}

				if (var2 == 1) {
					ClanChannel.method4122(96);
				}

				if (var2 == 2) {
					ClanChannel.method4122(64);
				}

				if (var2 == 3) {
					ClanChannel.method4122(32);
				}

				if (var2 == 4) {
					ClanChannel.method4122(0);
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
					NPC.method2849(127);
				}

				if (var2 == 1) {
					NPC.method2849(96);
				}

				if (var2 == 2) {
					NPC.method2849(64);
				}

				if (var2 == 3) {
					NPC.method2849(32);
				}

				if (var2 == 4) {
					NPC.method2849(0);
				}
			}

			if (var1 == 17) {
				Client.followerIndex = var2 & 65535;
			}

			if (var1 == 18) {
				Client.playerAttackOption = (AttackOption)ScriptFrame.findEnumerated(HttpAuthenticationHeader.method9826(), var2);
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
				Client.npcAttackOption = (AttackOption)ScriptFrame.findEnumerated(HttpAuthenticationHeader.method9826(), var2);
				if (Client.npcAttackOption == null) {
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	}
}
