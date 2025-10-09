import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ru")
public class class464 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lrs;"
	)
	class460 field5321;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1182180927
	)
	int field5318;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 497458919
	)
	int field5319;

	@ObfuscatedSignature(
		descriptor = "(Lrs;II)V"
	)
	class464(class460 var1, int var2, int var3) {
		this.field5318 = 0;
		this.field5319 = 0;
		this.field5321 = var1;
		this.field5318 = var2;
		this.field5319 = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1429519459"
	)
	public String method9583() {
		if (this.method9591()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method9586());

			for (int var2 = this.field5318; var2 < this.field5319; ++var2) {
				class462 var3 = this.field5321.method9368(var2);
				var1.append(var3.field5293);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1133341274"
	)
	boolean method9584(int var1) {
		return this.field5321.method9438() == 2 || this.field5321.method9438() == 1 && (!this.field5321.field5281 || this.field5319 - 1 != var1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "8"
	)
	public boolean method9591() {
		return this.field5318 == this.field5319;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "2"
	)
	public int method9586() {
		return this.field5319 - this.field5318;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lrd;S)Z",
		garbageValue = "26166"
	)
	boolean method9587(class462 var1) {
		if (this.field5321.field5285 == 2) {
			return true;
		} else if (this.field5321.field5285 == 0) {
			return false;
		} else {
			return this.field5321.method9333() != var1;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "721917749"
	)
	int method9588() {
		if (this.method9591()) {
			return 0;
		} else {
			class462 var1 = this.field5321.method9368(this.field5319 - 1);
			if (var1.field5293 == '\n') {
				return 0;
			} else if (this.method9587(var1)) {
				return this.field5321.field5278.advances[42];
			} else {
				int var2 = this.field5321.field5278.advances[var1.field5293];
				if (var2 == 0) {
					return var1.field5293 == '\t' ? this.field5321.field5278.advances[32] * 3 : this.field5321.field5278.advances[32];
				} else {
					return var2;
				}
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lvn;",
		garbageValue = "1633802372"
	)
	public class555 method9589() {
		if (this.method9591()) {
			return new class555(0, 0);
		} else {
			class462 var1 = this.field5321.method9368(this.field5319 - 1);
			return new class555(var1.field5292 + this.method9588(), var1.field5294);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Lrd;",
		garbageValue = "-1983041881"
	)
	public class462 method9590(int var1) {
		return var1 >= 0 && var1 < this.method9586() ? this.field5321.method9368(this.field5318 + var1) : null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Z",
		garbageValue = "-1510923881"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		boolean var2 = false;
		boolean var3 = false;
		int var4 = 0;
		int var5 = var0.length();
		int var6 = 0;

		boolean var1;
		while (true) {
			if (var6 >= var5) {
				var1 = var3;
				break;
			}

			label80: {
				char var7 = var0.charAt(var6);
				if (var6 == 0) {
					if (var7 == '-') {
						var2 = true;
						break label80;
					}

					if (var7 == '+') {
						break label80;
					}
				}

				int var9;
				if (var7 >= '0' && var7 <= '9') {
					var9 = var7 - '0';
				} else if (var7 >= 'A' && var7 <= 'Z') {
					var9 = var7 - '7';
				} else {
					if (var7 < 'a' || var7 > 'z') {
						var1 = false;
						break;
					}

					var9 = var7 - 'W';
				}

				if (var9 >= 10) {
					var1 = false;
					break;
				}

				if (var2) {
					var9 = -var9;
				}

				int var8 = var4 * 10 + var9;
				if (var4 != var8 / 10) {
					var1 = false;
					break;
				}

				var4 = var8;
				var3 = true;
			}

			++var6;
		}

		return var1;
	}
}
