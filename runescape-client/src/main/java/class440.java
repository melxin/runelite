import java.applet.Applet;
import java.net.URL;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("qk")
public class class440 {
	@ObfuscatedName("jp")
	static int[] field4851;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	class436 field4850;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -2067313247
	)
	int field4849;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 506750791
	)
	int field4848;

	@ObfuscatedSignature(
		descriptor = "(Lqi;II)V"
	)
	class440(class436 var1, int var2, int var3) {
		this.field4849 = 0;
		this.field4848 = 0;
		this.field4850 = var1;
		this.field4849 = var2;
		this.field4848 = var3;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2096882874"
	)
	public String method8809() {
		if (this.method8788()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method8808());

			for (int var2 = this.field4849; var2 < this.field4848; ++var2) {
				class438 var3 = this.field4850.method8528(var2);
				var1.append(var3.field4824);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "57"
	)
	boolean method8810(int var1) {
		return this.field4850.method8536() == 2 || this.field4850.method8536() == 1 && (!this.field4850.field4798 || this.field4848 - 1 != var1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "706203165"
	)
	public boolean method8788() {
		return this.field4849 == this.field4848;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "25"
	)
	public int method8808() {
		return this.field4848 - this.field4849;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lqo;I)Z",
		garbageValue = "1163269871"
	)
	boolean method8790(class438 var1) {
		if (this.field4850.field4813 == 2) {
			return true;
		} else if (this.field4850.field4813 == 0) {
			return false;
		} else {
			return this.field4850.method8529() != var1;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "931589017"
	)
	int method8806() {
		if (this.method8788()) {
			return 0;
		} else {
			class438 var1 = this.field4850.method8528(this.field4848 - 1);
			if (var1.field4824 == '\n') {
				return 0;
			} else if (this.method8790(var1)) {
				return this.field4850.field4801.advances[42];
			} else {
				int var2 = this.field4850.field4801.advances[var1.field4824];
				if (var2 == 0) {
					return var1.field4824 == '\t' ? this.field4850.field4801.advances[32] * 3 : this.field4850.field4801.advances[32];
				} else {
					return var2;
				}
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lug;",
		garbageValue = "2031855998"
	)
	public class527 method8792() {
		if (this.method8788()) {
			return new class527(0, 0);
		} else {
			class438 var1 = this.field4850.method8528(this.field4848 - 1);
			return new class527(var1.field4821 + this.method8806(), var1.field4822);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Lqo;",
		garbageValue = "-2064956229"
	)
	public class438 method8786(int var1) {
		return var1 >= 0 && var1 < this.method8808() ? this.field4850.method8528(this.field4849 + var1) : null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lni;I)V",
		garbageValue = "-629202281"
	)
	public static void method8814(class339 var0) {
		class333.field3627.remove(var0);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Z",
		garbageValue = "-71588071"
	)
	static boolean method8813(String var0, int var1, String var2) {
		if (var1 == 0) {
			try {
				if (!class31.field137.startsWith("win")) {
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
					throw new Exception();
				} else {
					String var11 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

					for (int var4 = 0; var4 < var0.length(); ++var4) {
						if (var11.indexOf(var0.charAt(var4)) == -1) {
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
					return true;
				}
			} catch (Throwable var5) {
				return false;
			}
		} else if (var1 == 1) {
			try {
				Object var10 = class26.method402(class31.field138, var2, new Object[]{(new URL(class31.field138.getCodeBase(), var0)).toString()});
				return var10 != null;
			} catch (Throwable var6) {
				return false;
			}
		} else if (var1 == 2) {
			try {
				class31.field138.getAppletContext().showDocument(new URL(class31.field138.getCodeBase(), var0), "_blank");
				return true;
			} catch (Exception var7) {
				return false;
			}
		} else if (var1 == 3) {
			try {
				Applet var3 = class31.field138;
				JSObject.getWindow(var3).call("loggedout", (Object[])null);
			} catch (Throwable var9) {
			}

			try {
				class31.field138.getAppletContext().showDocument(new URL(class31.field138.getCodeBase(), var0), "_top");
				return true;
			} catch (Exception var8) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "244777010"
	)
	static final void method8812() {
		Object var10000 = null;
		String var0 = "Your friend list is full. Max of 200 for free users, and 400 for members";
		Interpreter.addGameMessage(30, "", var0);
	}
}
