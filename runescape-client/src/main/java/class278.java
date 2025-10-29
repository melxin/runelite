import java.awt.datatransfer.Clipboard;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kh")
public class class278 implements class29 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	public static AbstractArchive field3220;
	@ObfuscatedName("up")
	@ObfuscatedGetter(
		intValue = 507327837
	)
	static int field3221;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	Widget field3218;
	@ObfuscatedName("at")
	boolean field3217;
	@ObfuscatedName("ag")
	boolean field3219;

	public class278() {
		this.field3218 = null;
		this.field3217 = false;
		this.field3219 = false;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1696349320"
	)
	public boolean vmethod6295(int var1) {
		if (this.field3218 == null) {
			return false;
		} else {
			class28 var2 = this.field3218.method8280();
			if (var2 == null) {
				return false;
			} else {
				if (var2.method433(var1)) {
					switch(var1) {
					case 81:
						this.field3219 = true;
						break;
					case 82:
						this.field3217 = true;
						break;
					default:
						if (this.method6273(var1)) {
							class376.invalidateWidget(this.field3218);
						}
					}
				}

				return var2.method428(var1);
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "63"
	)
	public boolean vmethod6326(int var1) {
		switch(var1) {
		case 81:
			this.field3219 = false;
			return false;
		case 82:
			this.field3217 = false;
			return false;
		default:
			return false;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-128"
	)
	public boolean vmethod6297(char var1) {
		if (this.field3218 == null) {
			return false;
		} else if (!AbstractWorldMapData.method6974(var1)) {
			return false;
		} else {
			class378 var2 = this.field3218.method8194();
			if (var2 != null && var2.method8105()) {
				class28 var3 = this.field3218.method8280();
				if (var3 == null) {
					return false;
				} else {
					if (var3.method436(var1) && var2.method7854(var1)) {
						class376.invalidateWidget(this.field3218);
					}

					return var3.method431(var1);
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-885160198"
	)
	public boolean vmethod6294(boolean var1) {
		return false;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Lof;",
		garbageValue = "-813486657"
	)
	public Widget method6266() {
		return this.field3218;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lof;B)V",
		garbageValue = "65"
	)
	public void method6267(Widget var1) {
		if (var1 != null) {
			if (var1 != this.field3218) {
				this.method6268();
				this.field3218 = var1;
			}

			class376 var2 = var1.method8197();
			if (var2 != null) {
				if (!var2.field4141.method7888() && var2.field4139 != null) {
					ScriptEvent var3 = new ScriptEvent();
					var3.method2184(var1);
					var3.setArgs(var2.field4139);
					HttpQueryParams.method10865().addFirst(var3);
				}

				var2.field4141.method7840(true);
			}
		} else {
			this.method6268();
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1148946001"
	)
	public void method6268() {
		if (this.field3218 != null) {
			class376 var1 = this.field3218.method8197();
			Widget var2 = this.field3218;
			this.field3218 = null;
			if (var1 != null) {
				if (var1.field4141.method7888() && var1.field4139 != null) {
					ScriptEvent var3 = new ScriptEvent();
					var3.method2184(var2);
					var3.setArgs(var1.field4139);
					HttpQueryParams.method10865().addFirst(var3);
				}

				var1.field4141.method7840(false);
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "36"
	)
	boolean method6273(int var1) {
		if (this.field3218 == null) {
			return false;
		} else {
			class378 var2 = this.field3218.method8194();
			if (var2 != null && var2.method8105()) {
				Clipboard var5;
				switch(var1) {
				case 13:
					this.method6268();
					return true;
				case 48:
					if (this.field3217) {
						var2.method7860();
					}

					return true;
				case 65:
					if (this.field3217) {
						var5 = SecureUrlRequester.client.method526();
						var2.method7871(var5);
					}

					return true;
				case 66:
					if (this.field3217) {
						var5 = SecureUrlRequester.client.method526();
						var2.method7878(var5);
					}

					return true;
				case 67:
					if (this.field3217) {
						var5 = SecureUrlRequester.client.method526();
						var2.method7952(var5);
					}

					return true;
				case 84:
					if (var2.method8012() == 0) {
						var2.method7854(10);
					} else if (this.field3219 && var2.method7906()) {
						var2.method7854(10);
					} else {
						class376 var3 = this.field3218.method8197();
						ScriptEvent var4 = new ScriptEvent();
						var4.method2184(this.field3218);
						var4.setArgs(var3.field4137);
						HttpQueryParams.method10865().addFirst(var4);
						this.method6268();
					}

					return true;
				case 85:
					if (this.field3217) {
						var2.method7949();
					} else {
						var2.method7855();
					}

					return true;
				case 96:
					if (this.field3217) {
						var2.method7868(this.field3219);
					} else {
						var2.method7866(this.field3219);
					}

					return true;
				case 97:
					if (this.field3217) {
						var2.method8018(this.field3219);
					} else {
						var2.method7867(this.field3219);
					}

					return true;
				case 98:
					if (this.field3217) {
						var2.method8079();
					} else {
						var2.method7870(this.field3219);
					}

					return true;
				case 99:
					if (this.field3217) {
						var2.method7892();
					} else {
						var2.method7839(this.field3219);
					}

					return true;
				case 101:
					if (this.field3217) {
						var2.method7879();
					} else {
						var2.method7856();
					}

					return true;
				case 102:
					if (this.field3217) {
						var2.method7864(this.field3219);
					} else {
						var2.method7862(this.field3219);
					}

					return true;
				case 103:
					if (this.field3217) {
						var2.method7865(this.field3219);
					} else {
						var2.method7863(this.field3219);
					}

					return true;
				case 104:
					if (this.field3217) {
						var2.method7874(this.field3219);
					} else {
						var2.method7988(this.field3219);
					}

					return true;
				case 105:
					if (this.field3217) {
						var2.method7875(this.field3219);
					} else {
						var2.method7873(this.field3219);
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
