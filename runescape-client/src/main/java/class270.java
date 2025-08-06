import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
public class class270 implements class29 {
	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	static class564 field3123;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	Widget field3122;
	@ObfuscatedName("ab")
	boolean field3121;
	@ObfuscatedName("ac")
	boolean field3120;

	public class270() {
		this.field3122 = null;
		this.field3121 = false;
		this.field3120 = false;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "14585"
	)
	public boolean vmethod6086(int var1) {
		if (this.field3122 == null) {
			return false;
		} else {
			class28 var2 = this.field3122.method8041();
			if (var2 == null) {
				return false;
			} else {
				if (var2.method441(var1)) {
					switch(var1) {
					case 81:
						this.field3120 = true;
						break;
					case 82:
						this.field3121 = true;
						break;
					default:
						if (this.method6076(var1)) {
							ApproximateRouteStrategy.invalidateWidget(this.field3122);
						}
					}
				}

				return var2.method424(var1);
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "646363744"
	)
	public boolean vmethod6087(int var1) {
		switch(var1) {
		case 81:
			this.field3120 = false;
			return false;
		case 82:
			this.field3121 = false;
			return false;
		default:
			return false;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "89"
	)
	public boolean vmethod6088(char var1) {
		if (this.field3122 == null) {
			return false;
		} else if (!HealthBarConfig.method2659(var1)) {
			return false;
		} else {
			class364 var2 = this.field3122.method7935();
			if (var2 != null && var2.method7797()) {
				class28 var3 = this.field3122.method8041();
				if (var3 == null) {
					return false;
				} else {
					if (var3.method427(var1) && var2.method7594(var1)) {
						ApproximateRouteStrategy.invalidateWidget(this.field3122);
					}

					return var3.method425(var1);
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "13804206"
	)
	public boolean vmethod6112(boolean var1) {
		return false;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Lox;",
		garbageValue = "-2074128394"
	)
	public Widget method6055() {
		return this.field3122;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lox;I)V",
		garbageValue = "-958731397"
	)
	public void method6079(Widget var1) {
		if (var1 != null) {
			if (var1 != this.field3122) {
				this.method6081();
				this.field3122 = var1;
			}

			class362 var2 = var1.method7931();
			if (var2 != null) {
				if (!var2.field3990.method7753() && var2.field3985 != null) {
					ScriptEvent var3 = new ScriptEvent();
					var3.method2124(var1);
					var3.setArgs(var2.field3985);
					HttpJsonRequestBody.method10535().addFirst(var3);
				}

				var2.field3990.method7580(true);
			}
		} else {
			this.method6081();
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	public void method6081() {
		if (this.field3122 != null) {
			class362 var1 = this.field3122.method7931();
			Widget var2 = this.field3122;
			this.field3122 = null;
			if (var1 != null) {
				if (var1.field3990.method7753() && var1.field3985 != null) {
					ScriptEvent var3 = new ScriptEvent();
					var3.method2124(var2);
					var3.setArgs(var1.field3985);
					HttpJsonRequestBody.method10535().addFirst(var3);
				}

				var1.field3990.method7580(false);
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1545243217"
	)
	boolean method6076(int var1) {
		if (this.field3122 == null) {
			return false;
		} else {
			class364 var2 = this.field3122.method7935();
			if (var2 != null && var2.method7797()) {
				switch(var1) {
				case 13:
					this.method6081();
					return true;
				case 48:
					if (this.field3121) {
						var2.method7600();
					}

					return true;
				case 65:
					if (this.field3121) {
						var2.method7739(MusicPatchNode.method7350());
					}

					return true;
				case 66:
					if (this.field3121) {
						var2.method7820(MusicPatchNode.method7350());
					}

					return true;
				case 67:
					if (this.field3121) {
						var2.method7619(MusicPatchNode.method7350());
					}

					return true;
				case 84:
					if (var2.method7795() == 0) {
						var2.method7594(10);
					} else if (this.field3120 && var2.method7694()) {
						var2.method7594(10);
					} else {
						class362 var3 = this.field3122.method7931();
						ScriptEvent var4 = new ScriptEvent();
						var4.method2124(this.field3122);
						var4.setArgs(var3.field3984);
						HttpJsonRequestBody.method10535().addFirst(var4);
						this.method6081();
					}

					return true;
				case 85:
					if (this.field3121) {
						var2.method7597();
					} else {
						var2.method7595();
					}

					return true;
				case 96:
					if (this.field3121) {
						var2.method7607(this.field3120);
					} else {
						var2.method7641(this.field3120);
					}

					return true;
				case 97:
					if (this.field3121) {
						var2.method7608(this.field3120);
					} else {
						var2.method7606(this.field3120);
					}

					return true;
				case 98:
					if (this.field3121) {
						var2.method7620();
					} else {
						var2.method7609(this.field3120);
					}

					return true;
				case 99:
					if (this.field3121) {
						var2.method7621();
					} else {
						var2.method7610(this.field3120);
					}

					return true;
				case 101:
					if (this.field3121) {
						var2.method7824();
					} else {
						var2.method7596();
					}

					return true;
				case 102:
					if (this.field3121) {
						var2.method7603(this.field3120);
					} else {
						var2.method7787(this.field3120);
					}

					return true;
				case 103:
					if (this.field3121) {
						var2.method7738(this.field3120);
					} else {
						var2.method7834(this.field3120);
					}

					return true;
				case 104:
					if (this.field3121) {
						var2.method7613(this.field3120);
					} else {
						var2.method7763(this.field3120);
					}

					return true;
				case 105:
					if (this.field3121) {
						var2.method7693(this.field3120);
					} else {
						var2.method7612(this.field3120);
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Lfo;",
		garbageValue = "-710112431"
	)
	static class135 method6063(int var0) {
		class135 var1 = (class135)HealthBarConfig.findEnumerated(Tile.method4885(), var0);
		if (var1 == null) {
			var1 = class135.field1619;
		}

		return var1;
	}
}
