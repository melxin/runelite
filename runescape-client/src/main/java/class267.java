import java.awt.datatransfer.Clipboard;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kc")
public class class267 implements class29 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	Widget field2979;
	@ObfuscatedName("aw")
	boolean field2982;
	@ObfuscatedName("at")
	boolean field2980;

	public class267() {
		this.field2979 = null;
		this.field2982 = false;
		this.field2980 = false;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-323298608"
	)
	public boolean vmethod5567(int var1) {
		if (this.field2979 == null) {
			return false;
		} else {
			class27 var2 = this.field2979.method7280();
			if (var2 == null) {
				return false;
			} else {
				if (var2.method369(var1)) {
					switch(var1) {
					case 81:
						this.field2980 = true;
						break;
					case 82:
						this.field2982 = true;
						break;
					default:
						if (this.method5559(var1)) {
							class178.invalidateWidget(this.field2979);
						}
					}
				}

				return var2.method400(var1);
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1779231332"
	)
	public boolean vmethod5568(int var1) {
		switch(var1) {
		case 81:
			this.field2980 = false;
			return false;
		case 82:
			this.field2982 = false;
			return false;
		default:
			return false;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-757953188"
	)
	public boolean vmethod5573(char var1) {
		if (this.field2979 == null) {
			return false;
		} else if (!class93.method2514(var1)) {
			return false;
		} else {
			class359 var2 = this.field2979.method7284();
			if (var2 != null && var2.method7035()) {
				class27 var3 = this.field2979.method7280();
				if (var3 == null) {
					return false;
				} else {
					if (var3.method370(var1) && var2.method6996(var1)) {
						class178.invalidateWidget(this.field2979);
					}

					return var3.method368(var1);
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "1222125911"
	)
	public boolean vmethod5571(boolean var1) {
		return false;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lnp;B)V",
		garbageValue = "-1"
	)
	public void method5541(Widget var1) {
		if (var1 != null) {
			if (var1 != this.field2979) {
				this.method5556();
				this.field2979 = var1;
			}

			class357 var2 = var1.method7281();
			if (var2 != null) {
				if (!var2.field3796.method7030() && var2.field3800 != null) {
					ScriptEvent var3 = new ScriptEvent();
					var3.method2493(var1);
					var3.setArgs(var2.field3800);
					MenuAction.method2256().addFirst(var3);
				}

				var2.field3796.method7057(true);
			}
		} else {
			this.method5556();
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lnp;",
		garbageValue = "2002473499"
	)
	public Widget method5548() {
		return this.field2979;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2080391561"
	)
	public void method5556() {
		if (this.field2979 != null) {
			class357 var1 = this.field2979.method7281();
			Widget var2 = this.field2979;
			this.field2979 = null;
			if (var1 != null) {
				if (var1.field3796.method7030() && var1.field3800 != null) {
					ScriptEvent var3 = new ScriptEvent();
					var3.method2493(var2);
					var3.setArgs(var1.field3800);
					MenuAction.method2256().addFirst(var3);
				}

				var1.field3796.method7057(false);
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "12"
	)
	boolean method5559(int var1) {
		if (this.field2979 == null) {
			return false;
		} else {
			class359 var2 = this.field2979.method7284();
			if (var2 != null && var2.method7035()) {
				Clipboard var5;
				switch(var1) {
				case 13:
					this.method5556();
					return true;
				case 48:
					if (this.field2982) {
						var2.method7081();
					}

					return true;
				case 65:
					if (this.field2982) {
						var5 = NpcOverrides.client.method535();
						var2.method7068(var5);
					}

					return true;
				case 66:
					if (this.field2982) {
						var5 = NpcOverrides.client.method535();
						var2.method7020(var5);
					}

					return true;
				case 67:
					if (this.field2982) {
						var5 = NpcOverrides.client.method535();
						var2.method7202(var5);
					}

					return true;
				case 84:
					if (var2.method7015() == 0) {
						var2.method6996(10);
					} else if (this.field2980 && var2.method7045()) {
						var2.method6996(10);
					} else {
						class357 var3 = this.field2979.method7281();
						ScriptEvent var4 = new ScriptEvent();
						var4.method2493(this.field2979);
						var4.setArgs(var3.field3801);
						MenuAction.method2256().addFirst(var4);
						this.method5556();
					}

					return true;
				case 85:
					if (this.field2982) {
						var2.method6999();
					} else {
						var2.method6997();
					}

					return true;
				case 96:
					if (this.field2982) {
						var2.method7178(this.field2980);
					} else {
						var2.method7008(this.field2980);
					}

					return true;
				case 97:
					if (this.field2982) {
						var2.method7165(this.field2980);
					} else {
						var2.method7078(this.field2980);
					}

					return true;
				case 98:
					if (this.field2982) {
						var2.method7021();
					} else {
						var2.method7012(this.field2980);
					}

					return true;
				case 99:
					if (this.field2982) {
						var2.method7024();
					} else {
						var2.method7013(this.field2980);
					}

					return true;
				case 101:
					if (this.field2982) {
						var2.method7031();
					} else {
						var2.method6998();
					}

					return true;
				case 102:
					if (this.field2982) {
						var2.method7006(this.field2980);
					} else {
						var2.method7004(this.field2980);
					}

					return true;
				case 103:
					if (this.field2982) {
						var2.method7041(this.field2980);
					} else {
						var2.method7005(this.field2980);
					}

					return true;
				case 104:
					if (this.field2982) {
						var2.method7016(this.field2980);
					} else {
						var2.method7014(this.field2980);
					}

					return true;
				case 105:
					if (this.field2982) {
						var2.method7017(this.field2980);
					} else {
						var2.method7146(this.field2980);
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
}
