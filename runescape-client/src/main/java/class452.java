import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rn")
public class class452 {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1667863345
	)
	int field4958;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -785581397
	)
	int field4967;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 234143343
	)
	int field4960;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -998431417
	)
	int field4961;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1421603531
	)
	int field4962;
	@ObfuscatedName("aq")
	boolean field4963;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lrd;"
	)
	AbstractFont field4964;
	@ObfuscatedName("an")
	ArrayList field4957;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -888355203
	)
	int field4966;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 752024833
	)
	int field4965;

	public class452() {
		this.field4958 = Integer.MAX_VALUE;
		this.field4967 = Integer.MAX_VALUE;
		this.field4960 = 0;
		this.field4961 = 0;
		this.field4962 = 0;
		this.field4963 = true;
		this.field4957 = new ArrayList();
		this.field4966 = 0;
		this.field4965 = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Lrh;",
		garbageValue = "633367474"
	)
	public class454 method8552(int var1) {
		return (class454)this.field4957.get(var1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Lrh;",
		garbageValue = "-18"
	)
	class454 method8632() {
		return this.field4957.size() == 0 ? null : (class454)this.field4957.get(this.field4957.size() - 1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-11"
	)
	public boolean method8666() {
		return this.field4957.size() == 0;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2046261644"
	)
	boolean method8555() {
		return this.field4967 > 1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2111916763"
	)
	public int method8563() {
		return this.field4957.size();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "69"
	)
	public String method8601() {
		if (this.method8666()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method8563());

			for (int var2 = 0; var2 < this.method8563(); ++var2) {
				class454 var3 = this.method8552(var2);
				var1.append(var3.field4974);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "82"
	)
	public void method8558(int var1) {
		if (this.field4964 != null && var1 < this.field4964.ascent * 2) {
			var1 = Integer.MAX_VALUE;
		}

		if (this.field4958 != var1) {
			this.field4958 = var1;
			this.method8586();
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1841535046"
	)
	public void method8556(int var1) {
		if (this.field4967 != var1) {
			this.field4967 = var1;
			this.method8586();
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-567287509"
	)
	public void method8585(int var1) {
		if (this.field4965 != var1) {
			this.field4965 = var1;
			this.method8586();
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lrd;I)V",
		garbageValue = "1702776869"
	)
	public void method8583(AbstractFont var1) {
		if (var1 != this.field4964) {
			this.field4964 = var1;
			if (this.field4964 != null) {
				if (this.field4962 == 0) {
					this.field4962 = this.field4964.ascent;
				}

				if (!this.method8666()) {
					this.method8586();
				}
			}
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "24"
	)
	public void method8562(int var1) {
		if (this.field4966 != var1) {
			this.field4966 = var1;
			this.method8586();
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "2095022149"
	)
	public boolean method8554(int var1, int var2) {
		if (this.field4960 != var1 || var2 != this.field4961) {
			this.field4960 = var1;
			this.field4961 = var2;
			this.method8586();
		}

		return true;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "122"
	)
	public void method8564(int var1) {
		if (this.field4962 != var1) {
			this.field4962 = var1;
			this.method8586();
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lra;",
		garbageValue = "0"
	)
	public class456 method8553(int var1, int var2) {
		if (var2 == var1) {
			return new class456(this, 0, 0);
		} else if (var1 <= this.field4957.size() && var2 <= this.field4957.size()) {
			return var2 < var1 ? new class456(this, var2, var1) : new class456(this, var1, var2);
		} else {
			return new class456(this, 0, 0);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(CIIB)Lru;",
		garbageValue = "-65"
	)
	public class453 method8566(char var1, int var2, int var3) {
		return this.method8567(Character.toString(var1), var2, var3);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;III)Lru;",
		garbageValue = "1931720041"
	)
	public class453 method8567(String var1, int var2, int var3) {
		if (var3 == 0) {
			var3 = Integer.MAX_VALUE;
		}

		int var4 = var2;
		if (this.field4957.size() >= var3) {
			this.method8628(var2, var2);
			return new class453(var2, true);
		} else {
			this.field4957.ensureCapacity(this.field4957.size() + var1.length());

			for (int var5 = 0; var5 < var1.length() && this.field4957.size() < var3; ++var5) {
				class454 var6 = new class454();
				var6.field4974 = var1.charAt(var5);
				this.field4957.add(var4, var6);
				++var4;
			}

			this.method8628(var2, var4);
			if (this.field4967 != 0 && this.method8578() > this.field4967) {
				while (var4 != var2) {
					--var4;
					this.method8571(var4);
					if (this.method8578() <= this.field4967) {
						break;
					}
				}

				return new class453(var4, true);
			} else {
				return new class453(var4, false);
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Lru;",
		garbageValue = "-272209479"
	)
	class453 method8626(String var1, int var2) {
		return this.method8567(var1, this.field4957.size(), var2);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lru;",
		garbageValue = "1312691771"
	)
	public class453 method8674(String var1) {
		this.method8570();
		return this.method8626(var1, 0);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2039031589"
	)
	void method8570() {
		this.field4957.clear();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "33"
	)
	public int method8571(int var1) {
		return this.method8572(var1, var1 + 1);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "248675724"
	)
	public int method8572(int var1, int var2) {
		int var3;
		if (var2 < var1) {
			var3 = var2;
			var2 = var1;
			var1 = var3;
		}

		this.field4957.subList(var1, var2).clear();
		var3 = var1;
		if (this.method8555() && this.field4966 == 1) {
			while (var3 > 0) {
				--var3;
				char var4 = ((class454)this.field4957.get(var3)).field4974;
				if (var4 == ' ' || var4 == '\t') {
					break;
				}
			}
		}

		this.method8628(var3, var2);
		return var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1425355978"
	)
	public int method8573(int var1, int var2) {
		if (this.field4964 == null) {
			return 0;
		} else if (this.method8555() && var1 > this.field4958) {
			return this.field4957.size();
		} else {
			if (!this.field4957.isEmpty()) {
				for (int var3 = 0; var3 < this.field4957.size(); ++var3) {
					class454 var4 = (class454)this.field4957.get(var3);
					if (var2 <= var4.field4971 + this.method8577()) {
						if (var2 < var4.field4971) {
							break;
						}

						if (var1 < var4.field4972) {
							return var3 > 0 ? var3 - 1 : 0;
						}

						if (1 + var3 != this.field4957.size() && ((class454)this.field4957.get(1 + var3)).field4971 != var4.field4971) {
							int var5 = this.method8589((class454)this.field4957.get(var3), false);
							if (var1 < var5 + var4.field4972) {
								return var3;
							}

							if (var2 <= var4.field4971 + this.method8577()) {
								return var3 + 1;
							}
						}
					}
				}

				class454 var6 = (class454)this.field4957.get(this.field4957.size() - 1);
				if (var1 >= var6.field4972 && var1 <= var6.field4972 + this.method8579() && var2 >= var6.field4971 && var2 <= var6.field4971 + this.method8577()) {
					return this.field4957.size() - 1;
				}
			}

			return this.field4957.size();
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1588347917"
	)
	public int method8618(int var1, int var2) {
		if (this.field4964 != null && !this.method8666() && var1 <= this.field4957.size()) {
			byte var3;
			if (var2 > 0) {
				var3 = 1;
			} else {
				var3 = -1;
				var2 = -var2;
			}

			int var4 = 0;
			int var5 = 0;
			if (var1 > 0) {
				class454 var6 = (class454)this.field4957.get(var1 - 1);
				var4 = var6.field4972 + this.method8588(var1 - 1);
				var5 = var6.field4971;
			} else if (var3 == -1 && var1 == 0) {
				return 0;
			}

			int var14 = 16777215;
			int var7 = 0;
			int var8 = var1;
			int var9 = 16777215;
			int var10 = var3 == 1 ? this.field4957.size() + 1 : 0;

			for (int var11 = var3 + var1; var10 != var11; var11 += var3) {
				class454 var12 = (class454)this.field4957.get(var11 - 1);
				if (var5 != var12.field4971) {
					++var7;
					var5 = var12.field4971;
					if (var7 > var2) {
						return var8;
					}
				}

				if (var7 == var2) {
					int var13 = Math.abs(var12.field4972 + this.method8588(var11 - 1) - var4);
					if (var13 >= var9) {
						return var8;
					}

					var8 = var11;
					var9 = var13;
				}
			}

			if (var3 == 1) {
				return this.field4957.size();
			} else {
				if (var5 != 0) {
					++var7;
				}

				return var9 == 16777215 || var7 == var2 && var4 < var9 ? 0 : var8;
			}
		} else {
			return 0;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1937452470"
	)
	public int method8575() {
		if (!this.field4957.isEmpty() && this.method8578() == 1) {
			return this.field4957.isEmpty() ? 0 : ((class454)this.field4957.get(this.field4957.size() - 1)).field4972 + this.method8579();
		} else {
			int var1 = -1;
			int var2 = 0;

			for (int var3 = this.field4957.size() - 1; var3 >= 0; --var3) {
				class454 var4 = (class454)this.field4957.get(var3);
				if (var1 != var4.field4971) {
					int var5 = this.method8589(var4, false) + var4.field4972;
					var2 = Math.max(var5, var2);
					var1 = var4.field4971;
				}
			}

			return var2;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1450465994"
	)
	public int method8576() {
		return this.method8666() ? 0 : this.field4964.ascent + ((class454)this.field4957.get(this.field4957.size() - 1)).field4971;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "727463892"
	)
	public int method8577() {
		return this.field4962;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-104"
	)
	public int method8578() {
		return this.method8576() / this.field4964.ascent;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1190902318"
	)
	int method8579() {
		return this.method8666() ? 0 : this.method8589((class454)this.field4957.get(this.field4957.size() - 1), false);
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "17"
	)
	public int method8580() {
		return this.field4958;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "8"
	)
	public int method8581() {
		return this.field4967;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-74"
	)
	public int method8590() {
		return this.field4966;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "75"
	)
	public int method8655() {
		return this.field4965;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-14"
	)
	public int method8569(int var1) {
		switch(this.field4960) {
		case 0:
			return 0;
		case 1:
			return var1 / 2;
		case 2:
			return var1;
		default:
			return 0;
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2048331838"
	)
	public int method8633(int var1) {
		switch(this.field4961) {
		case 0:
			return 0;
		case 1:
			return var1 / 2;
		case 2:
			return var1;
		default:
			return 0;
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1121072269"
	)
	void method8586() {
		this.method8628(0, this.field4957.size());
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-21"
	)
	void method8628(int var1, int var2) {
		if (!this.method8666() && this.field4964 != null) {
			class541 var3 = this.method8559(var1, var2);
			boolean var4 = (Integer)var3.field5443 == 0 && (Integer)var3.field5444 == this.field4957.size();
			int var5 = (Integer)var3.field5443;
			int var6 = 0;
			int var7 = var4 ? 0 : ((class454)this.field4957.get((Integer)var3.field5443)).field4971;
			int var8 = 0;

			int var9;
			for (var9 = (Integer)var3.field5443; var9 <= (Integer)var3.field5444; ++var9) {
				boolean var10 = var9 >= this.field4957.size();
				class454 var21 = (class454)this.field4957.get(!var10 ? var9 : this.field4957.size() - 1);
				int var22 = !var10 ? this.method8589(var21, false) : 0;
				boolean var13 = !var10 && var21.field4974 == '\n';
				boolean var14 = !var10 && this.method8555() && var6 + var22 > this.field4958;
				if (var13 || var14 || var10) {
					int var15 = var9;
					int var16 = 0;
					int var17;
					int var18;
					class454 var19;
					if (var14) {
						var17 = 0;
						if (this.field4966 == 1) {
							for (var18 = var9; var18 > var5; --var18) {
								var19 = (class454)this.field4957.get(var18);
								var17 += var18 < var15 ? this.method8589(var19, false) : 0;
								if (var19.field4974 == ' ' || var19.field4974 == '\n') {
									var15 = var18;
									var6 -= var17;
									var16 = var17;
									break;
								}
							}
						}
					}

					var17 = -this.method8569(var6);

					for (var18 = var5; var18 < var15; ++var18) {
						var19 = (class454)this.field4957.get(var18);
						int var20 = this.method8589(var19, false);
						var19.field4972 = var17;
						var19.field4971 = var7;
						var17 += var20;
					}

					var5 = var15;
					var6 = var16;
					var7 += this.method8577();
					++var8;
				}

				var6 += !var10 ? var22 : 0;
			}

			if (this.field4961 != 0 && var4) {
				var9 = var8 * this.method8577();
				int var23 = this.method8633(var9);

				for (int var11 = 0; var11 < this.field4957.size(); ++var11) {
					class454 var12 = (class454)this.field4957.get(var11);
					var12.field4971 -= var23;
				}
			}

		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "65536"
	)
	int method8588(int var1) {
		return var1 < this.field4957.size() ? this.method8589((class454)this.field4957.get(var1), false) : 0;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Lrh;ZB)I",
		garbageValue = "-92"
	)
	int method8589(class454 var1, boolean var2) {
		if (var1.field4974 == '\n') {
			return 0;
		} else if (this.field4965 == 0) {
			int var3 = this.field4964.advances[var1.field4974];
			if (var3 == 0) {
				return var1.field4974 == '\t' ? this.field4964.advances[32] * 3 : this.field4964.advances[32];
			} else {
				return var3;
			}
		} else {
			return this.field4964.advances[42];
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(IIB)Luv;",
		garbageValue = "-48"
	)
	class541 method8559(int var1, int var2) {
		int var3 = Math.min(var1, var2);
		int var4 = Math.max(var1, var2);
		int var5 = this.field4957.size();
		if (var3 == 0 && var5 == var4) {
			return new class541(0, var5);
		} else {
			int var6 = this.method8591(var3, false);
			int var7 = this.method8592(var4, false);
			int var8;
			switch(this.field4961) {
			case 0:
				if (this.field4960 == 0) {
					return new class541(var6, var5);
				}

				var8 = this.method8591(var3, true);
				return new class541(var8, var5);
			case 1:
				return new class541(0, var5);
			case 2:
				if (this.field4960 == 2) {
					return new class541(0, var7);
				}

				var8 = this.method8592(var4, true);
				return new class541(0, var8);
			default:
				return new class541(0, var5);
			}
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "1469193100"
	)
	int method8591(int var1, boolean var2) {
		if (var1 < this.field4957.size()) {
			int var3 = ((class454)this.field4957.get(var1)).field4971;

			for (int var4 = var1; var4 > 0; --var4) {
				if (((class454)this.field4957.get(var4 - 1)).field4971 < var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((class454)this.field4957.get(var4 - 1)).field4971;
				}
			}
		}

		return 0;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "206942107"
	)
	int method8592(int var1, boolean var2) {
		if (var1 < this.field4957.size()) {
			int var3 = ((class454)this.field4957.get(var1)).field4971;

			for (int var4 = var1; var4 < this.field4957.size() - 1; ++var4) {
				if (((class454)this.field4957.get(var4 + 1)).field4971 > var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((class454)this.field4957.get(var4 + 1)).field4971;
				}
			}
		}

		return this.field4957.size();
	}
}
