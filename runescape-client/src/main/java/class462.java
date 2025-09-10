import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rb")
public class class462 {
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1788818961
	)
	int field5227;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 2109695381
	)
	int field5225;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1977097609
	)
	int field5234;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1210553083
	)
	int field5230;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -398692355
	)
	int field5231;
	@ObfuscatedName("ah")
	boolean field5232;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lri;"
	)
	AbstractFont field5228;
	@ObfuscatedName("ax")
	ArrayList field5229;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -197294049
	)
	int field5236;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1491878675
	)
	int field5220;

	public class462() {
		this.field5227 = Integer.MAX_VALUE;
		this.field5225 = Integer.MAX_VALUE;
		this.field5234 = 0;
		this.field5230 = 0;
		this.field5231 = 0;
		this.field5232 = true;
		this.field5229 = new ArrayList();
		this.field5236 = 0;
		this.field5220 = 0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Lrx;",
		garbageValue = "-1742337925"
	)
	public class464 method9382(int var1) {
		return (class464)this.field5229.get(var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Lrx;",
		garbageValue = "2"
	)
	class464 method9268() {
		return this.field5229.isEmpty() ? null : (class464)this.field5229.get(this.field5229.size() - 1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "15"
	)
	public boolean method9338() {
		return this.field5229.isEmpty();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-6916"
	)
	boolean method9270() {
		return this.field5225 > 1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "117"
	)
	public int method9375() {
		return this.field5229.size();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1789387239"
	)
	public String method9329() {
		if (this.method9338()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method9375());

			for (int var2 = 0; var2 < this.method9375(); ++var2) {
				class464 var3 = this.method9382(var2);
				var1.append(var3.field5242);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-97"
	)
	public void method9273(int var1) {
		if (this.field5220 != var1) {
			this.field5220 = var1;
			this.method9389();
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lri;I)V",
		garbageValue = "550106116"
	)
	public void method9353(AbstractFont var1) {
		if (var1 != this.field5228) {
			this.field5228 = var1;
			if (this.field5228 != null) {
				if (this.field5231 == 0) {
					this.field5231 = this.field5228.ascent;
				}

				if (!this.method9338()) {
					this.method9389();
				}
			}
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1899881852"
	)
	public boolean method9275(int var1, int var2) {
		if (this.field5234 != var1 || var2 != this.field5230) {
			this.field5234 = var1;
			this.field5230 = var2;
			this.method9389();
		}

		return true;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-84"
	)
	public void method9276(int var1) {
		if (this.field5231 != var1) {
			this.field5231 = var1;
			this.method9389();
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)Lrh;",
		garbageValue = "1895237727"
	)
	public class466 method9277(int var1, int var2) {
		if (var2 == var1) {
			return new class466(this, 0, 0);
		} else if (var1 <= this.field5229.size() && var2 <= this.field5229.size()) {
			return var2 < var1 ? new class466(this, var2, var1) : new class466(this, var1, var2);
		} else {
			return new class466(this, 0, 0);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(CIIB)Lrs;",
		garbageValue = "-45"
	)
	public class463 method9267(char var1, int var2, int var3) {
		return this.method9279(Character.toString(var1), var2, var3);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIB)Lrs;",
		garbageValue = "0"
	)
	public class463 method9279(String var1, int var2, int var3) {
		if (var3 == 0) {
			var3 = Integer.MAX_VALUE;
		}

		int var4 = var2;
		if (this.field5229.size() >= var3) {
			this.method9316(var2, var2);
			return new class463(var2, true);
		} else {
			this.field5229.ensureCapacity(this.field5229.size() + var1.length());

			for (int var5 = 0; var5 < var1.length() && this.field5229.size() < var3; ++var5) {
				class464 var6 = new class464();
				var6.field5242 = var1.charAt(var5);
				this.field5229.add(var4, var6);
				++var4;
			}

			this.method9316(var2, var4);
			if (this.field5225 != 0 && this.method9365() > this.field5225) {
				while (var4 != var2) {
					--var4;
					this.method9266(var4);
					if (this.method9365() <= this.field5225) {
						break;
					}
				}

				return new class463(var4, true);
			} else {
				return new class463(var4, false);
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Lrs;",
		garbageValue = "-1568701070"
	)
	class463 method9280(String var1, int var2) {
		return this.method9279(var1, this.field5229.size(), var2);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lrs;",
		garbageValue = "-2136753419"
	)
	public class463 method9380(String var1) {
		this.method9282();
		return this.method9280(var1, 0);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1978057721"
	)
	void method9282() {
		this.field5229.clear();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "481462831"
	)
	public int method9266(int var1) {
		return this.method9284(var1, var1 + 1);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-19"
	)
	public int method9284(int var1, int var2) {
		int var3;
		if (var2 < var1) {
			var3 = var2;
			var2 = var1;
			var1 = var3;
		}

		this.field5229.subList(var1, var2).clear();
		var3 = var1;
		if (this.method9270() && this.field5236 == 1) {
			while (var3 > 0) {
				--var3;
				char var4 = ((class464)this.field5229.get(var3)).field5242;
				if (var4 == ' ' || var4 == '\t') {
					break;
				}
			}
		}

		this.method9316(var3, var2);
		return var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "1"
	)
	public int method9285(int var1, int var2) {
		if (this.field5228 == null) {
			return 0;
		} else if (this.method9270() && var1 > this.field5227) {
			return this.field5229.size();
		} else {
			if (!this.field5229.isEmpty()) {
				for (int var3 = 0; var3 < this.field5229.size(); ++var3) {
					class464 var4 = (class464)this.field5229.get(var3);
					if (var2 <= var4.field5244 + this.method9289()) {
						if (var2 < var4.field5244) {
							break;
						}

						if (var1 < var4.field5241) {
							return var3 > 0 ? var3 - 1 : 0;
						}

						if (1 + var3 != this.field5229.size() && ((class464)this.field5229.get(var3 + 1)).field5244 != var4.field5244) {
							int var5 = this.method9304((class464)this.field5229.get(var3), false);
							if (var1 < var5 + var4.field5241) {
								return var3;
							}

							if (var2 <= var4.field5244 + this.method9289()) {
								return var3 + 1;
							}
						}
					}
				}

				class464 var6 = (class464)this.field5229.get(this.field5229.size() - 1);
				if (var1 >= var6.field5241 && var1 <= var6.field5241 + this.method9291() && var2 >= var6.field5244 && var2 <= var6.field5244 + this.method9289()) {
					return this.field5229.size() - 1;
				}
			}

			return this.field5229.size();
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-50"
	)
	public int method9351(int var1, int var2) {
		if (this.field5228 != null && !this.method9338() && var1 <= this.field5229.size()) {
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
				class464 var6 = (class464)this.field5229.get(var1 - 1);
				var4 = var6.field5241 + this.method9303(var1 - 1);
				var5 = var6.field5244;
			} else if (var3 == -1 && var1 == 0) {
				return 0;
			}

			int var14 = 16777215;
			int var7 = 0;
			int var8 = var1;
			int var9 = 16777215;
			int var10 = var3 == 1 ? this.field5229.size() + 1 : 0;

			for (int var11 = var3 + var1; var10 != var11; var11 += var3) {
				class464 var12 = (class464)this.field5229.get(var11 - 1);
				if (var5 != var12.field5244) {
					++var7;
					var5 = var12.field5244;
					if (var7 > var2) {
						return var8;
					}
				}

				if (var7 == var2) {
					int var13 = Math.abs(var12.field5241 + this.method9303(var11 - 1) - var4);
					if (var13 >= var9) {
						return var8;
					}

					var8 = var11;
					var9 = var13;
				}
			}

			if (var3 == 1) {
				return this.field5229.size();
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2057094153"
	)
	public int method9308() {
		if (!this.field5229.isEmpty() && this.method9365() == 1) {
			return this.field5229.isEmpty() ? 0 : ((class464)this.field5229.get(this.field5229.size() - 1)).field5241 + this.method9291();
		} else {
			int var1 = -1;
			int var2 = 0;

			for (int var3 = this.field5229.size() - 1; var3 >= 0; --var3) {
				class464 var4 = (class464)this.field5229.get(var3);
				if (var1 != var4.field5244) {
					int var5 = this.method9304(var4, false) + var4.field5241;
					var2 = Math.max(var5, var2);
					var1 = var4.field5244;
				}
			}

			return var2;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-9"
	)
	public int method9288() {
		return this.method9338() ? 0 : this.field5228.ascent + ((class464)this.field5229.get(this.field5229.size() - 1)).field5244;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-9"
	)
	public int method9289() {
		return this.field5231;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-57"
	)
	public int method9365() {
		return this.method9288() / this.field5228.ascent;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "680970100"
	)
	int method9291() {
		return this.method9338() ? 0 : this.method9304((class464)this.field5229.get(this.field5229.size() - 1), false);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-441483985"
	)
	public int method9292() {
		return this.field5227;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1108014887"
	)
	public void method9293(int var1) {
		if (this.field5228 != null && var1 < this.field5228.ascent * 2) {
			var1 = Integer.MAX_VALUE;
		}

		if (this.field5227 != var1) {
			this.field5227 = var1;
			this.method9389();
		}

	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2122039598"
	)
	public int method9326() {
		return this.field5225;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "756722"
	)
	public void method9300(int var1) {
		if (this.field5225 != var1) {
			this.field5225 = var1;
			this.method9389();
		}

	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "620818023"
	)
	public int method9296() {
		return this.field5236;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "518538120"
	)
	public void method9357(int var1) {
		if (this.field5236 != var1) {
			this.field5236 = var1;
			this.method9389();
		}

	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1770966594"
	)
	public int method9287() {
		return this.field5220;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "520737439"
	)
	public int method9299(int var1) {
		switch(this.field5234) {
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

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-975061378"
	)
	public int method9298(int var1) {
		switch(this.field5230) {
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

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1683506842"
	)
	void method9389() {
		this.method9316(0, this.field5229.size());
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1657132041"
	)
	void method9316(int var1, int var2) {
		if (!this.method9338() && this.field5228 != null) {
			class557 var3 = this.method9305(var1, var2);
			boolean var4 = (Integer)var3.field5757 == 0 && (Integer)var3.field5756 == this.field5229.size();
			int var5 = (Integer)var3.field5757;
			int var6 = 0;
			int var7 = var4 ? 0 : ((class464)this.field5229.get((Integer)var3.field5757)).field5244;
			int var8 = 0;

			int var9;
			for (var9 = (Integer)var3.field5757; var9 <= (Integer)var3.field5756; ++var9) {
				boolean var10 = var9 >= this.field5229.size();
				class464 var21 = (class464)this.field5229.get(!var10 ? var9 : this.field5229.size() - 1);
				int var22 = !var10 ? this.method9304(var21, false) : 0;
				boolean var13 = !var10 && var21.field5242 == '\n';
				boolean var14 = !var10 && this.method9270() && var6 + var22 > this.field5227;
				if (var13 || var14 || var10) {
					int var15 = var9;
					int var16 = 0;
					int var17;
					int var18;
					class464 var19;
					if (var14) {
						var17 = 0;
						if (this.field5236 == 1) {
							for (var18 = var9; var18 > var5; --var18) {
								var19 = (class464)this.field5229.get(var18);
								var17 += var18 < var15 ? this.method9304(var19, false) : 0;
								if (var19.field5242 == ' ' || var19.field5242 == '\n') {
									var15 = var18;
									var6 -= var17;
									var16 = var17;
									break;
								}
							}
						}
					}

					var17 = -this.method9299(var6);

					for (var18 = var5; var18 < var15; ++var18) {
						var19 = (class464)this.field5229.get(var18);
						int var20 = this.method9304(var19, false);
						var19.field5241 = var17;
						var19.field5244 = var7;
						var17 += var20;
					}

					var5 = var15;
					var6 = var16;
					var7 += this.method9289();
					++var8;
				}

				var6 += !var10 ? var22 : 0;
			}

			if (this.field5230 != 0 && var4) {
				var9 = var8 * this.method9289();
				int var23 = this.method9298(var9);

				for (int var11 = 0; var11 < this.field5229.size(); ++var11) {
					class464 var12 = (class464)this.field5229.get(var11);
					var12.field5244 -= var23;
				}
			}

		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2107560946"
	)
	int method9303(int var1) {
		return var1 < this.field5229.size() ? this.method9304((class464)this.field5229.get(var1), false) : 0;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lrx;ZB)I",
		garbageValue = "-116"
	)
	int method9304(class464 var1, boolean var2) {
		if (var1.field5242 == '\n') {
			return 0;
		} else if (this.field5220 == 0) {
			int var3 = this.field5228.advances[var1.field5242];
			if (var3 == 0) {
				return var1.field5242 == '\t' ? this.field5228.advances[32] * 3 : this.field5228.advances[32];
			} else {
				return var3;
			}
		} else {
			return this.field5228.advances[42];
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(III)Lvt;",
		garbageValue = "1672966689"
	)
	class557 method9305(int var1, int var2) {
		int var3 = Math.min(var1, var2);
		int var4 = Math.max(var1, var2);
		int var5 = this.field5229.size();
		if (var3 == 0 && var5 == var4) {
			return new class557(0, var5);
		} else {
			int var6 = this.method9306(var3, false);
			int var7 = this.method9307(var4, false);
			int var8;
			switch(this.field5230) {
			case 0:
				if (this.field5234 == 0) {
					return new class557(var6, var5);
				}

				var8 = this.method9306(var3, true);
				return new class557(var8, var5);
			case 1:
				return new class557(0, var5);
			case 2:
				if (this.field5234 == 2) {
					return new class557(0, var7);
				}

				var8 = this.method9307(var4, true);
				return new class557(0, var8);
			default:
				return new class557(0, var5);
			}
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "-1128548731"
	)
	int method9306(int var1, boolean var2) {
		if (var1 < this.field5229.size()) {
			int var3 = ((class464)this.field5229.get(var1)).field5244;

			for (int var4 = var1; var4 > 0; --var4) {
				if (((class464)this.field5229.get(var4 - 1)).field5244 < var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((class464)this.field5229.get(var4 - 1)).field5244;
				}
			}
		}

		return 0;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(IZB)I",
		garbageValue = "2"
	)
	int method9307(int var1, boolean var2) {
		if (var1 < this.field5229.size()) {
			int var3 = ((class464)this.field5229.get(var1)).field5244;

			for (int var4 = var1; var4 < this.field5229.size() - 1; ++var4) {
				if (((class464)this.field5229.get(var4 + 1)).field5244 > var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((class464)this.field5229.get(var4 + 1)).field5244;
				}
			}
		}

		return this.field5229.size();
	}
}
