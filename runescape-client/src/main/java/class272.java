import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kj")
public class class272 implements class29 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	Widget field3192;
	@ObfuscatedName("aw")
	boolean field3194;
	@ObfuscatedName("at")
	boolean field3193;

	public class272() {
		this.field3192 = null;
		this.field3194 = false;
		this.field3193 = false;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-112"
	)
	public boolean vmethod6115(int var1) {
		if (this.field3192 == null) {
			return false;
		} else {
			class28 var2 = this.field3192.method7973();
			if (var2 == null) {
				return false;
			} else {
				if (var2.method423(var1)) {
					switch(var1) {
					case 81:
						this.field3193 = true;
						break;
					case 82:
						this.field3194 = true;
						break;
					default:
						if (this.method6090(var1)) {
							class89.invalidateWidget(this.field3192);
						}
					}
				}

				return var2.method421(var1);
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-195994958"
	)
	public boolean vmethod6123(int var1) {
		switch(var1) {
		case 81:
			this.field3193 = false;
			return false;
		case 82:
			this.field3194 = false;
			return false;
		default:
			return false;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "737785830"
	)
	public boolean vmethod6117(char var1) {
		if (this.field3192 == null) {
			return false;
		} else if (!MusicPatchNode2.method7102(var1)) {
			return false;
		} else {
			class366 var2 = this.field3192.method7971();
			if (var2 != null && var2.method7658()) {
				class28 var3 = this.field3192.method7973();
				if (var3 == null) {
					return false;
				} else {
					if (var3.method424(var1) && var2.method7619(var1)) {
						class89.invalidateWidget(this.field3192);
					}

					return var3.method422(var1);
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "18"
	)
	public boolean vmethod6119(boolean var1) {
		return false;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Loi;",
		garbageValue = "597089631"
	)
	public Widget method6084() {
		return this.field3192;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Loi;B)V",
		garbageValue = "-40"
	)
	public void method6104(Widget var1) {
		if (var1 != null) {
			if (var1 != this.field3192) {
				this.method6085();
				this.field3192 = var1;
			}

			class364 var2 = var1.method7974();
			if (var2 != null) {
				if (!var2.field4066.method7839() && var2.field4068 != null) {
					ScriptEvent var3 = new ScriptEvent();
					var3.method2136(var1);
					var3.setArgs(var2.field4068);
					class161.method3912().addFirst(var3);
				}

				var2.field4066.method7605(true);
			}
		} else {
			this.method6085();
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2060958332"
	)
	public void method6085() {
		if (this.field3192 != null) {
			class364 var1 = this.field3192.method7974();
			Widget var2 = this.field3192;
			this.field3192 = null;
			if (var1 != null) {
				if (var1.field4066.method7839() && var1.field4068 != null) {
					ScriptEvent var3 = new ScriptEvent();
					var3.method2136(var2);
					var3.setArgs(var1.field4068);
					class161.method3912().addFirst(var3);
				}

				var1.field4066.method7605(false);
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-215907699"
	)
	boolean method6090(int var1) {
		if (this.field3192 == null) {
			return false;
		} else {
			class366 var2 = this.field3192.method7971();
			if (var2 != null && var2.method7658()) {
				switch(var1) {
				case 13:
					this.method6085();
					return true;
				case 48:
					if (this.field3194) {
						var2.method7625();
					}

					return true;
				case 65:
					if (this.field3194) {
						var2.method7644(TriBool.method10061());
					}

					return true;
				case 66:
					if (this.field3194) {
						var2.method7668(TriBool.method10061());
					}

					return true;
				case 67:
					if (this.field3194) {
						var2.method7645(TriBool.method10061());
					}

					return true;
				case 84:
					if (var2.method7783() == 0) {
						var2.method7619(10);
					} else if (this.field3193 && var2.method7671()) {
						var2.method7619(10);
					} else {
						class364 var3 = this.field3192.method7974();
						ScriptEvent var4 = new ScriptEvent();
						var4.method2136(this.field3192);
						var4.setArgs(var3.field4070);
						class161.method3912().addFirst(var4);
						this.method6085();
					}

					return true;
				case 85:
					if (this.field3194) {
						var2.method7622();
					} else {
						var2.method7620();
					}

					return true;
				case 96:
					if (this.field3194) {
						var2.method7633(this.field3193);
					} else {
						var2.method7631(this.field3193);
					}

					return true;
				case 97:
					if (this.field3194) {
						var2.method7634(this.field3193);
					} else {
						var2.method7661(this.field3193);
					}

					return true;
				case 98:
					if (this.field3194) {
						var2.method7646();
					} else {
						var2.method7635(this.field3193);
					}

					return true;
				case 99:
					if (this.field3194) {
						var2.method7617();
					} else {
						var2.method7636(this.field3193);
					}

					return true;
				case 101:
					if (this.field3194) {
						var2.method7830();
					} else {
						var2.method7621();
					}

					return true;
				case 102:
					if (this.field3194) {
						var2.method7664(this.field3193);
					} else {
						var2.method7806(this.field3193);
					}

					return true;
				case 103:
					if (this.field3194) {
						var2.method7632(this.field3193);
					} else {
						var2.method7628(this.field3193);
					}

					return true;
				case 104:
					if (this.field3194) {
						var2.method7639(this.field3193);
					} else {
						var2.method7838(this.field3193);
					}

					return true;
				case 105:
					if (this.field3194) {
						var2.method7772(this.field3193);
					} else {
						var2.method7825(this.field3193);
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[JIIB)V",
		garbageValue = "-24"
	)
	public static void method6111(String[] var0, long[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			long var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var9 = var2; var9 < var3; ++var9) {
				if (var6 == null || var0[var9] != null && var0[var9].compareTo(var6) < (var9 & 1)) {
					String var10 = var0[var9];
					var0[var9] = var0[var5];
					var0[var5] = var10;
					long var11 = var1[var9];
					var1[var9] = var1[var5];
					var1[var5++] = var11;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method6111(var0, var1, var2, var5 - 1);
			method6111(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lti;IB)V",
		garbageValue = "97"
	)
	public static void method6110(DynamicArray var0, int var1) {
		class374.method8144(var0);
		int var2 = var0.method10322();
		if (var2 > 1) {
			var1 %= var2;
			if (var1 != 0) {
				if (var1 < 0) {
					var1 += var2;
				}

				if (var0.field5504 == class574.field5820) {
					int[] var3 = var0.method10318();
					class452.method9046(var3, 0, var2 - 1);
					class452.method9046(var3, 0, var1 - 1);
					class452.method9046(var3, var1, var2 - 1);
				} else if (var0.field5504 == class574.field5816) {
					long[] var4 = var0.method10320();
					class464.method9403(var4, 0, var2 - 1);
					class464.method9403(var4, 0, var1 - 1);
					class464.method9403(var4, var1, var2 - 1);
				} else {
					Object[] var5 = var0.method10321();
					ClanChannelMember.method3834(var5, 0, var2 - 1);
					ClanChannelMember.method3834(var5, 0, var1 - 1);
					ClanChannelMember.method3834(var5, var1, var2 - 1);
				}

			}
		}
	}
}
