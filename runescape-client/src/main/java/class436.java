import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qj")
public class class436 {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -178083391
	)
	int field4811;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1420696031
	)
	int field4814;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 541697909
	)
	int field4821;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -386880399
	)
	int field4820;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -282023429
	)
	int field4815;
	@ObfuscatedName("ay")
	boolean field4816;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	AbstractFont field4812;
	@ObfuscatedName("aa")
	ArrayList field4818;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1432840443
	)
	int field4819;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1749777503
	)
	int field4806;

	public class436() {
		this.field4811 = Integer.MAX_VALUE;
		this.field4814 = Integer.MAX_VALUE;
		this.field4821 = 0;
		this.field4820 = 0;
		this.field4815 = 0;
		this.field4816 = true;
		this.field4818 = new ArrayList();
		this.field4819 = 0;
		this.field4806 = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Lqo;",
		garbageValue = "667201172"
	)
	public class438 method8378(int var1) {
		return (class438)this.field4818.get(var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lqo;",
		garbageValue = "1962806516"
	)
	class438 method8493() {
		return this.field4818.size() == 0 ? null : (class438)this.field4818.get(this.field4818.size() - 1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	public boolean method8380() {
		return this.field4818.size() == 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "785244358"
	)
	boolean method8381() {
		return this.field4814 > 1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1412669337"
	)
	public int method8382() {
		return this.field4818.size();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-93"
	)
	public String method8383() {
		if (this.method8380()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method8382());

			for (int var2 = 0; var2 < this.method8382(); ++var2) {
				class438 var3 = this.method8378(var2);
				var1.append(var3.field4825);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1547968353"
	)
	public void method8384(int var1) {
		if (this.field4812 != null && var1 < this.field4812.ascent * 2) {
			var1 = Integer.MAX_VALUE;
		}

		if (this.field4811 != var1) {
			this.field4811 = var1;
			this.method8412();
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-594331646"
	)
	public void method8507(int var1) {
		if (this.field4814 != var1) {
			this.field4814 = var1;
			this.method8412();
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1754582791"
	)
	public void method8386(int var1) {
		if (this.field4806 != var1) {
			this.field4806 = var1;
			this.method8412();
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lqm;I)V",
		garbageValue = "-1415500934"
	)
	public void method8387(AbstractFont var1) {
		if (var1 != this.field4812) {
			this.field4812 = var1;
			if (this.field4812 != null) {
				if (this.field4815 == 0) {
					this.field4815 = this.field4812.ascent;
				}

				if (!this.method8380()) {
					this.method8412();
				}
			}
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1843310437"
	)
	public void method8478(int var1) {
		if (this.field4819 != var1) {
			this.field4819 = var1;
			this.method8412();
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-75"
	)
	public boolean method8389(int var1, int var2) {
		if (this.field4821 != var1 || var2 != this.field4820) {
			this.field4821 = var1;
			this.field4820 = var2;
			this.method8412();
		}

		return true;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1718474019"
	)
	public void method8390(int var1) {
		if (this.field4815 != var1) {
			this.field4815 = var1;
			this.method8412();
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)Lqt;",
		garbageValue = "-1623175184"
	)
	public class440 method8391(int var1, int var2) {
		if (var2 == var1) {
			return new class440(this, 0, 0);
		} else if (var1 <= this.field4818.size() && var2 <= this.field4818.size()) {
			return var2 < var1 ? new class440(this, var2, var1) : new class440(this, var1, var2);
		} else {
			return new class440(this, 0, 0);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(CIIS)Lqe;",
		garbageValue = "6902"
	)
	public class437 method8392(char var1, int var2, int var3) {
		return this.method8393(Character.toString(var1), var2, var3);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;III)Lqe;",
		garbageValue = "-1453782007"
	)
	public class437 method8393(String var1, int var2, int var3) {
		if (var3 == 0) {
			var3 = Integer.MAX_VALUE;
		}

		int var4 = var2;
		if (this.field4818.size() >= var3) {
			this.method8413(var2, var2);
			return new class437(var2, true);
		} else {
			this.field4818.ensureCapacity(this.field4818.size() + var1.length());

			for (int var5 = 0; var5 < var1.length() && this.field4818.size() < var3; ++var5) {
				class438 var6 = new class438();
				var6.field4825 = var1.charAt(var5);
				this.field4818.add(var4, var6);
				++var4;
			}

			this.method8413(var2, var4);
			if (this.field4814 != 0 && this.method8461() > this.field4814) {
				while (var4 != var2) {
					--var4;
					this.method8397(var4);
					if (this.method8461() <= this.field4814) {
						break;
					}
				}

				return new class437(var4, true);
			} else {
				return new class437(var4, false);
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Lqe;",
		garbageValue = "889163915"
	)
	class437 method8394(String var1, int var2) {
		return this.method8393(var1, this.field4818.size(), var2);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lqe;",
		garbageValue = "-2121858203"
	)
	public class437 method8395(String var1) {
		this.method8463();
		return this.method8394(var1, 0);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1782344077"
	)
	void method8463() {
		this.field4818.clear();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1008997708"
	)
	public int method8397(int var1) {
		return this.method8398(var1, var1 + 1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "19"
	)
	public int method8398(int var1, int var2) {
		int var3;
		if (var2 < var1) {
			var3 = var2;
			var2 = var1;
			var1 = var3;
		}

		this.field4818.subList(var1, var2).clear();
		var3 = var1;
		if (this.method8381() && this.field4819 == 1) {
			while (var3 > 0) {
				--var3;
				char var4 = ((class438)this.field4818.get(var3)).field4825;
				if (var4 == ' ' || var4 == '\t') {
					break;
				}
			}
		}

		this.method8413(var3, var2);
		return var1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "8"
	)
	public int method8407(int var1, int var2) {
		if (this.field4812 == null) {
			return 0;
		} else if (this.method8381() && var1 > this.field4811) {
			return this.field4818.size();
		} else {
			if (!this.field4818.isEmpty()) {
				for (int var3 = 0; var3 < this.field4818.size(); ++var3) {
					class438 var4 = (class438)this.field4818.get(var3);
					if (var2 <= var4.field4826 + this.method8432()) {
						if (var2 < var4.field4826) {
							break;
						}

						if (var1 < var4.field4824) {
							return var3 > 0 ? var3 - 1 : 0;
						}

						if (1 + var3 != this.field4818.size() && ((class438)this.field4818.get(1 + var3)).field4826 != var4.field4826) {
							int var5 = this.method8400((class438)this.field4818.get(var3), false);
							if (var1 < var5 + var4.field4824) {
								return var3;
							}

							if (var2 <= var4.field4826 + this.method8432()) {
								return var3 + 1;
							}
						}
					}
				}

				class438 var6 = (class438)this.field4818.get(this.field4818.size() - 1);
				if (var1 >= var6.field4824 && var1 <= var6.field4824 + this.method8404() && var2 >= var6.field4826 && var2 <= var6.field4826 + this.method8432()) {
					return this.field4818.size() - 1;
				}
			}

			return this.field4818.size();
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "999097322"
	)
	public int method8428(int var1, int var2) {
		if (this.field4812 != null && !this.method8380() && var1 <= this.field4818.size()) {
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
				class438 var6 = (class438)this.field4818.get(var1 - 1);
				var4 = var6.field4824 + this.method8414(var1 - 1);
				var5 = var6.field4826;
			} else if (var3 == -1 && var1 == 0) {
				return 0;
			}

			int var14 = 16777215;
			int var7 = 0;
			int var8 = var1;
			int var9 = 16777215;
			int var10 = var3 == 1 ? this.field4818.size() + 1 : 0;

			for (int var11 = var3 + var1; var10 != var11; var11 += var3) {
				class438 var12 = (class438)this.field4818.get(var11 - 1);
				if (var5 != var12.field4826) {
					++var7;
					var5 = var12.field4826;
					if (var7 > var2) {
						return var8;
					}
				}

				if (var7 == var2) {
					int var13 = Math.abs(var12.field4824 + this.method8414(var11 - 1) - var4);
					if (var13 >= var9) {
						return var8;
					}

					var8 = var11;
					var9 = var13;
				}
			}

			if (var3 == 1) {
				return this.field4818.size();
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-336183198"
	)
	public int method8401() {
		if (!this.field4818.isEmpty() && this.method8461() == 1) {
			return this.field4818.isEmpty() ? 0 : ((class438)this.field4818.get(this.field4818.size() - 1)).field4824 + this.method8404();
		} else {
			int var1 = -1;
			int var2 = 0;

			for (int var3 = this.field4818.size() - 1; var3 >= 0; --var3) {
				class438 var4 = (class438)this.field4818.get(var3);
				if (var1 != var4.field4826) {
					int var5 = this.method8400(var4, false) + var4.field4824;
					var2 = Math.max(var5, var2);
					var1 = var4.field4826;
				}
			}

			return var2;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-30"
	)
	public int method8402() {
		return this.method8380() ? 0 : this.field4812.ascent + ((class438)this.field4818.get(this.field4818.size() - 1)).field4826;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1505763672"
	)
	public int method8432() {
		return this.field4815;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1465675747"
	)
	public int method8461() {
		return this.method8402() / this.field4812.ascent;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "510"
	)
	int method8404() {
		return this.method8380() ? 0 : this.method8400((class438)this.field4818.get(this.field4818.size() - 1), false);
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "920811693"
	)
	public int method8406() {
		return this.field4811;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-119"
	)
	public int method8517() {
		return this.field4814;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	public int method8408() {
		return this.field4819;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "72"
	)
	public int method8409() {
		return this.field4806;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1899822314"
	)
	public int method8399(int var1) {
		switch(this.field4821) {
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

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2089239733"
	)
	public int method8411(int var1) {
		switch(this.field4820) {
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
		descriptor = "(I)V",
		garbageValue = "733451019"
	)
	void method8412() {
		this.method8413(0, this.field4818.size());
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "748865687"
	)
	void method8413(int var1, int var2) {
		if (!this.method8380() && this.field4812 != null) {
			class527 var3 = this.method8434(var1, var2);
			boolean var4 = (Integer)var3.field5325 == 0 && (Integer)var3.field5323 == this.field4818.size();
			int var5 = (Integer)var3.field5325;
			int var6 = 0;
			int var7 = var4 ? 0 : ((class438)this.field4818.get((Integer)var3.field5325)).field4826;
			int var8 = 0;

			int var9;
			for (var9 = (Integer)var3.field5325; var9 <= (Integer)var3.field5323; ++var9) {
				boolean var10 = var9 >= this.field4818.size();
				class438 var21 = (class438)this.field4818.get(!var10 ? var9 : this.field4818.size() - 1);
				int var22 = !var10 ? this.method8400(var21, false) : 0;
				boolean var13 = !var10 && var21.field4825 == '\n';
				boolean var14 = !var10 && this.method8381() && var22 + var6 > this.field4811;
				if (var13 || var14 || var10) {
					int var15 = var9;
					int var16 = 0;
					int var17;
					int var18;
					class438 var19;
					if (var14) {
						var17 = 0;
						if (this.field4819 == 1) {
							for (var18 = var9; var18 > var5; --var18) {
								var19 = (class438)this.field4818.get(var18);
								var17 += var18 < var15 ? this.method8400(var19, false) : 0;
								if (var19.field4825 == ' ' || var19.field4825 == '\n') {
									var15 = var18;
									var6 -= var17;
									var16 = var17;
									break;
								}
							}
						}
					}

					var17 = -this.method8399(var6);

					for (var18 = var5; var18 < var15; ++var18) {
						var19 = (class438)this.field4818.get(var18);
						int var20 = this.method8400(var19, false);
						var19.field4824 = var17;
						var19.field4826 = var7;
						var17 += var20;
					}

					var5 = var15;
					var6 = var16;
					var7 += this.method8432();
					++var8;
				}

				var6 += !var10 ? var22 : 0;
			}

			if (this.field4820 != 0 && var4) {
				var9 = var8 * this.method8432();
				int var23 = this.method8411(var9);

				for (int var11 = 0; var11 < this.field4818.size(); ++var11) {
					class438 var12 = (class438)this.field4818.get(var11);
					var12.field4826 -= var23;
				}
			}

		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1508064332"
	)
	int method8414(int var1) {
		return var1 < this.field4818.size() ? this.method8400((class438)this.field4818.get(var1), false) : 0;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Lqo;ZB)I",
		garbageValue = "1"
	)
	int method8400(class438 var1, boolean var2) {
		if (var1.field4825 == '\n') {
			return 0;
		} else if (this.field4806 == 0) {
			int var3 = this.field4812.advances[var1.field4825];
			if (var3 == 0) {
				return var1.field4825 == '\t' ? this.field4812.advances[32] * 3 : this.field4812.advances[32];
			} else {
				return var3;
			}
		} else {
			return this.field4812.advances[42];
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(III)Lup;",
		garbageValue = "480332923"
	)
	class527 method8434(int var1, int var2) {
		int var3 = Math.min(var1, var2);
		int var4 = Math.max(var1, var2);
		int var5 = this.field4818.size();
		if (var3 == 0 && var4 == var5) {
			return new class527(0, var5);
		} else {
			int var6 = this.method8417(var3, false);
			int var7 = this.method8418(var4, false);
			int var8;
			switch(this.field4820) {
			case 0:
				if (this.field4821 == 0) {
					return new class527(var6, var5);
				}

				var8 = this.method8417(var3, true);
				return new class527(var8, var5);
			case 1:
				return new class527(0, var5);
			case 2:
				if (this.field4821 == 2) {
					return new class527(0, var7);
				}

				var8 = this.method8418(var4, true);
				return new class527(0, var8);
			default:
				return new class527(0, var5);
			}
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(IZB)I",
		garbageValue = "42"
	)
	int method8417(int var1, boolean var2) {
		if (var1 < this.field4818.size()) {
			int var3 = ((class438)this.field4818.get(var1)).field4826;

			for (int var4 = var1; var4 > 0; --var4) {
				if (((class438)this.field4818.get(var4 - 1)).field4826 < var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((class438)this.field4818.get(var4 - 1)).field4826;
				}
			}
		}

		return 0;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(IZB)I",
		garbageValue = "-33"
	)
	int method8418(int var1, boolean var2) {
		if (var1 < this.field4818.size()) {
			int var3 = ((class438)this.field4818.get(var1)).field4826;

			for (int var4 = var1; var4 < this.field4818.size() - 1; ++var4) {
				if (((class438)this.field4818.get(var4 + 1)).field4826 > var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((class438)this.field4818.get(var4 + 1)).field4826;
				}
			}
		}

		return this.field4818.size();
	}
}
