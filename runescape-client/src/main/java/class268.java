import java.awt.datatransfer.Clipboard;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
public class class268 implements class29 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	Widget field3046;
	@ObfuscatedName("ay")
	boolean field3043;
	@ObfuscatedName("au")
	boolean field3044;

	public class268() {
		this.field3046 = null;
		this.field3043 = false;
		this.field3044 = false;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1127197184"
	)
	public boolean vmethod5612(int var1) {
		if (this.field3046 == null) {
			return false;
		} else {
			class27 var2 = this.field3046.method7333();
			if (var2 == null) {
				return false;
			} else {
				if (var2.method347(var1)) {
					switch(var1) {
					case 81:
						this.field3044 = true;
						break;
					case 82:
						this.field3043 = true;
						break;
					default:
						if (this.method5564(var1)) {
							MilliClock.invalidateWidget(this.field3046);
						}
					}
				}

				return var2.method359(var1);
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-213709659"
	)
	public boolean vmethod5592(int var1) {
		switch(var1) {
		case 81:
			this.field3044 = false;
			return false;
		case 82:
			this.field3043 = false;
			return false;
		default:
			return false;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1961110507"
	)
	public boolean vmethod5590(char var1) {
		if (this.field3046 == null) {
			return false;
		} else if (!class321.method6492(var1)) {
			return false;
		} else {
			class361 var2 = this.field3046.method7331();
			if (var2 != null && var2.method7077()) {
				class27 var3 = this.field3046.method7333();
				if (var3 == null) {
					return false;
				} else {
					if (var3.method361(var1) && var2.method7038(var1)) {
						MilliClock.invalidateWidget(this.field3046);
					}

					return var3.method346(var1);
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "1163673127"
	)
	public boolean vmethod5595(boolean var1) {
		return false;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lnz;I)V",
		garbageValue = "1333967873"
	)
	public void method5557(Widget var1) {
		if (var1 != null) {
			if (var1 != this.field3046) {
				this.method5559();
				this.field3046 = var1;
			}

			class359 var2 = var1.method7334();
			if (var2 != null) {
				if (!var2.field3863.method7072() && var2.field3862 != null) {
					ScriptEvent var3 = new ScriptEvent();
					var3.method2439(var1);
					var3.setArgs(var2.field3862);
					class60.method1154().addFirst(var3);
				}

				var2.field3863.method7021(true);
			}
		} else {
			this.method5559();
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lnz;",
		garbageValue = "-1713828384"
	)
	public Widget method5584() {
		return this.field3046;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-394328716"
	)
	public void method5559() {
		if (this.field3046 != null) {
			class359 var1 = this.field3046.method7334();
			Widget var2 = this.field3046;
			this.field3046 = null;
			if (var1 != null) {
				if (var1.field3863.method7072() && var1.field3862 != null) {
					ScriptEvent var3 = new ScriptEvent();
					var3.method2439(var2);
					var3.setArgs(var1.field3862);
					class60.method1154().addFirst(var3);
				}

				var1.field3863.method7021(false);
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "560430260"
	)
	boolean method5564(int var1) {
		if (this.field3046 == null) {
			return false;
		} else {
			class361 var2 = this.field3046.method7331();
			if (var2 != null && var2.method7077()) {
				Clipboard var5;
				switch(var1) {
				case 13:
					this.method5559();
					return true;
				case 48:
					if (this.field3043) {
						var2.method7044();
					}

					return true;
				case 65:
					if (this.field3043) {
						var5 = class569.client.method461();
						var2.method7188(var5);
					}

					return true;
				case 66:
					if (this.field3043) {
						var5 = class569.client.method461();
						var2.method7062(var5);
					}

					return true;
				case 67:
					if (this.field3043) {
						var5 = class569.client.method461();
						var2.method7064(var5);
					}

					return true;
				case 84:
					if (var2.method7205() == 0) {
						var2.method7038(10);
					} else if (this.field3044 && var2.method7041()) {
						var2.method7038(10);
					} else {
						class359 var3 = this.field3046.method7334();
						ScriptEvent var4 = new ScriptEvent();
						var4.method2439(this.field3046);
						var4.setArgs(var3.field3864);
						class60.method1154().addFirst(var4);
						this.method5559();
					}

					return true;
				case 85:
					if (this.field3043) {
						var2.method7219();
					} else {
						var2.method7141();
					}

					return true;
				case 96:
					if (this.field3043) {
						var2.method7256(this.field3044);
					} else {
						var2.method7027(this.field3044);
					}

					return true;
				case 97:
					if (this.field3043) {
						var2.method7053(this.field3044);
					} else {
						var2.method7102(this.field3044);
					}

					return true;
				case 98:
					if (this.field3043) {
						var2.method7065();
					} else {
						var2.method7054(this.field3044);
					}

					return true;
				case 99:
					if (this.field3043) {
						var2.method7066();
					} else {
						var2.method7099(this.field3044);
					}

					return true;
				case 101:
					if (this.field3043) {
						var2.method7042();
					} else {
						var2.method7040();
					}

					return true;
				case 102:
					if (this.field3043) {
						var2.method7048(this.field3044);
					} else {
						var2.method7055(this.field3044);
					}

					return true;
				case 103:
					if (this.field3043) {
						var2.method7164(this.field3044);
					} else {
						var2.method7047(this.field3044);
					}

					return true;
				case 104:
					if (this.field3043) {
						var2.method7058(this.field3044);
					} else {
						var2.method7056(this.field3044);
					}

					return true;
				case 105:
					if (this.field3043) {
						var2.method7059(this.field3044);
					} else {
						var2.method7057(this.field3044);
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

	@ObfuscatedName("ab")
	public static String method5588(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (var0 % 37L == 0L) {
				return null;
			} else {
				int var2 = 0;

				for (long var3 = var0; 0L != var3; var3 /= 37L) {
					++var2;
				}

				StringBuilder var5 = new StringBuilder(var2);

				while (var0 != 0L) {
					long var6 = var0;
					var0 /= 37L;
					var5.append(class437.base37Table[(int)(var6 - var0 * 37L)]);
				}

				return var5.reverse().toString();
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)[Lkn;",
		garbageValue = "1714010890"
	)
	public static MoveSpeed[] method5587() {
		return new MoveSpeed[]{MoveSpeed.field3122, MoveSpeed.field3126, MoveSpeed.field3124, MoveSpeed.field3120, MoveSpeed.field3125, MoveSpeed.field3123, MoveSpeed.field3127, MoveSpeed.field3121, MoveSpeed.field3128};
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1471833965"
	)
	static final int method5583(int var0) {
		return Math.abs(var0 - FloorDecoration.cameraYaw) > 1024 ? var0 + 2048 * (var0 < FloorDecoration.cameraYaw ? 1 : -1) : var0;
	}
}
