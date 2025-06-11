import java.awt.datatransfer.Clipboard;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kp")
public class class269 implements class29 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	Widget field3049;
	@ObfuscatedName("aj")
	boolean field3047;
	@ObfuscatedName("an")
	boolean field3048;

	public class269() {
		this.field3049 = null;
		this.field3047 = false;
		this.field3048 = false;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1360488450"
	)
	public boolean vmethod5884(int var1) {
		if (this.field3049 == null) {
			return false;
		} else {
			class27 var2 = this.field3049.method7775();
			if (var2 == null) {
				return false;
			} else {
				if (var2.method393(var1)) {
					switch(var1) {
					case 81:
						this.field3048 = true;
						break;
					case 82:
						this.field3047 = true;
						break;
					default:
						if (this.method5868(var1)) {
							ScriptFrame.invalidateWidget(this.field3049);
						}
					}
				}

				return var2.method395(var1);
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-918792953"
	)
	public boolean vmethod5912(int var1) {
		switch(var1) {
		case 81:
			this.field3048 = false;
			return false;
		case 82:
			this.field3047 = false;
			return false;
		default:
			return false;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1362136571"
	)
	public boolean vmethod5908(char var1) {
		if (this.field3049 == null) {
			return false;
		} else if (!class198.method4233(var1)) {
			return false;
		} else {
			class367 var2 = this.field3049.method7755();
			if (var2 != null && var2.method7454()) {
				class27 var3 = this.field3049.method7775();
				if (var3 == null) {
					return false;
				} else {
					if (var3.method398(var1) && var2.method7415(var1)) {
						ScriptFrame.invalidateWidget(this.field3049);
					}

					return var3.method396(var1);
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-1328180320"
	)
	public boolean vmethod5888(boolean var1) {
		return false;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lov;",
		garbageValue = "-387080519"
	)
	public Widget method5862() {
		return this.field3049;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lov;I)V",
		garbageValue = "2103860837"
	)
	public void method5863(Widget var1) {
		if (var1 != null) {
			if (var1 != this.field3049) {
				this.method5864();
				this.field3049 = var1;
			}

			class365 var2 = var1.method7878();
			if (var2 != null) {
				if (!var2.field3897.method7449() && var2.field3899 != null) {
					ScriptEvent var3 = new ScriptEvent();
					var3.method2109(var1);
					var3.setArgs(var2.field3899);
					class7.method59().addFirst(var3);
				}

				var2.field3897.method7515(true);
			}
		} else {
			this.method5864();
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1329465113"
	)
	public void method5864() {
		if (this.field3049 != null) {
			class365 var1 = this.field3049.method7878();
			Widget var2 = this.field3049;
			this.field3049 = null;
			if (var1 != null) {
				if (var1.field3897.method7449() && var1.field3899 != null) {
					ScriptEvent var3 = new ScriptEvent();
					var3.method2109(var2);
					var3.setArgs(var1.field3899);
					class7.method59().addFirst(var3);
				}

				var1.field3897.method7515(false);
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "384027461"
	)
	boolean method5868(int var1) {
		if (this.field3049 == null) {
			return false;
		} else {
			class367 var2 = this.field3049.method7755();
			if (var2 != null && var2.method7454()) {
				Clipboard var5;
				switch(var1) {
				case 13:
					this.method5864();
					return true;
				case 48:
					if (this.field3047) {
						var2.method7532();
					}

					return true;
				case 65:
					if (this.field3047) {
						var5 = class36.client.method571();
						var2.method7403(var5);
					}

					return true;
				case 66:
					if (this.field3047) {
						var5 = class36.client.method571();
						var2.method7439(var5);
					}

					return true;
				case 67:
					if (this.field3047) {
						var5 = class36.client.method571();
						var2.method7619(var5);
					}

					return true;
				case 84:
					if (var2.method7617() == 0) {
						var2.method7415(10);
					} else if (this.field3048 && var2.method7570()) {
						var2.method7415(10);
					} else {
						class365 var3 = this.field3049.method7878();
						ScriptEvent var4 = new ScriptEvent();
						var4.method2109(this.field3049);
						var4.setArgs(var3.field3895);
						class7.method59().addFirst(var4);
						this.method5864();
					}

					return true;
				case 85:
					if (this.field3047) {
						var2.method7418();
					} else {
						var2.method7611();
					}

					return true;
				case 96:
					if (this.field3047) {
						var2.method7655(this.field3048);
					} else {
						var2.method7427(this.field3048);
					}

					return true;
				case 97:
					if (this.field3047) {
						var2.method7430(this.field3048);
					} else {
						var2.method7428(this.field3048);
					}

					return true;
				case 98:
					if (this.field3047) {
						var2.method7442();
					} else {
						var2.method7498(this.field3048);
					}

					return true;
				case 99:
					if (this.field3047) {
						var2.method7443();
					} else {
						var2.method7432(this.field3048);
					}

					return true;
				case 101:
					if (this.field3047) {
						var2.method7596();
					} else {
						var2.method7417();
					}

					return true;
				case 102:
					if (this.field3047) {
						var2.method7425(this.field3048);
					} else {
						var2.method7423(this.field3048);
					}

					return true;
				case 103:
					if (this.field3047) {
						var2.method7426(this.field3048);
					} else {
						var2.method7576(this.field3048);
					}

					return true;
				case 104:
					if (this.field3047) {
						var2.method7685(this.field3048);
					} else {
						var2.method7478(this.field3048);
					}

					return true;
				case 105:
					if (this.field3047) {
						var2.method7436(this.field3048);
					} else {
						var2.method7589(this.field3048);
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
		garbageValue = "-1050665802"
	)
	static void method5881() {
		AuthenticationScheme.Tiles_underlays = null;
		class31.Tiles_overlays = null;
		User.Tiles_shapes = null;
		class518.field5341 = null;
		SecureRandomCallable.field862 = null;
		class462.Tiles_underlays2 = null;
		Tiles.field846 = null;
		class451.Tiles_hue = null;
		WorldMapDecoration.Tiles_saturation = null;
		GrandExchangeOfferNameComparator.Tiles_lightness = null;
		GameEngine.Tiles_hueMultiplier = null;
		World.field617 = null;
	}
}
