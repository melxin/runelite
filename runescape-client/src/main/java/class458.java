import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rx")
public class class458 {
	@ObfuscatedName("pg")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 687634691
	)
	int field5109;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 887516043
	)
	int field5118;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 2002977425
	)
	int field5111;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1196303943
	)
	int field5110;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 867219261
	)
	int field5113;
	@ObfuscatedName("az")
	boolean field5108;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	AbstractFont field5107;
	@ObfuscatedName("aw")
	ArrayList field5116;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -987390703
	)
	int field5117;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1604842645
	)
	int field5114;

	public class458() {
		this.field5109 = Integer.MAX_VALUE;
		this.field5118 = Integer.MAX_VALUE;
		this.field5111 = 0;
		this.field5110 = 0;
		this.field5113 = 0;
		this.field5108 = true;
		this.field5116 = new ArrayList();
		this.field5117 = 0;
		this.field5114 = 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)Lrn;",
		garbageValue = "1"
	)
	public class460 method9260(int var1) {
		return (class460)this.field5116.get(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lrn;",
		garbageValue = "-1552951298"
	)
	class460 method9261() {
		return this.field5116.isEmpty() ? null : (class460)this.field5116.get(this.field5116.size() - 1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "18"
	)
	public boolean method9274() {
		return this.field5116.isEmpty();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-422129423"
	)
	boolean method9263() {
		return this.field5118 > 1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-792064397"
	)
	public int method9264() {
		return this.field5116.size();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1830604834"
	)
	public String method9267() {
		if (this.method9274()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method9264());

			for (int var2 = 0; var2 < this.method9264(); ++var2) {
				class460 var3 = this.method9260(var2);
				var1.append(var3.field5125);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-211900931"
	)
	public void method9266(int var1) {
		if (this.field5114 != var1) {
			this.field5114 = var1;
			this.method9294();
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lry;B)V",
		garbageValue = "-10"
	)
	public void method9330(AbstractFont var1) {
		if (var1 != this.field5107) {
			this.field5107 = var1;
			if (this.field5107 != null) {
				if (this.field5113 == 0) {
					this.field5113 = this.field5107.ascent;
				}

				if (!this.method9274()) {
					this.method9294();
				}
			}
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "63353324"
	)
	public boolean method9268(int var1, int var2) {
		if (this.field5111 != var1 || var2 != this.field5110) {
			this.field5111 = var1;
			this.field5110 = var2;
			this.method9294();
		}

		return true;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2086383467"
	)
	public void method9269(int var1) {
		if (this.field5113 != var1) {
			this.field5113 = var1;
			this.method9294();
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lrh;",
		garbageValue = "42"
	)
	public class462 method9378(int var1, int var2) {
		if (var2 == var1) {
			return new class462(this, 0, 0);
		} else if (var1 <= this.field5116.size() && var2 <= this.field5116.size()) {
			return var2 < var1 ? new class462(this, var2, var1) : new class462(this, var1, var2);
		} else {
			return new class462(this, 0, 0);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(CIII)Lrw;",
		garbageValue = "-2017806442"
	)
	public class459 method9367(char var1, int var2, int var3) {
		return this.method9363(Character.toString(var1), var2, var3);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;III)Lrw;",
		garbageValue = "1486584278"
	)
	public class459 method9363(String var1, int var2, int var3) {
		if (var3 == 0) {
			var3 = Integer.MAX_VALUE;
		}

		int var4 = var2;
		if (this.field5116.size() >= var3) {
			this.method9345(var2, var2);
			return new class459(var2, true);
		} else {
			this.field5116.ensureCapacity(this.field5116.size() + var1.length());

			for (int var5 = 0; var5 < var1.length() && this.field5116.size() < var3; ++var5) {
				class460 var6 = new class460();
				var6.field5125 = var1.charAt(var5);
				this.field5116.add(var4, var6);
				++var4;
			}

			this.method9345(var2, var4);
			if (this.field5118 != 0 && this.method9283() > this.field5118) {
				while (var4 != var2) {
					--var4;
					this.method9276(var4);
					if (this.method9283() <= this.field5118) {
						break;
					}
				}

				return new class459(var4, true);
			} else {
				return new class459(var4, false);
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)Lrw;",
		garbageValue = "1"
	)
	class459 method9273(String var1, int var2) {
		return this.method9363(var1, this.field5116.size(), var2);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lrw;",
		garbageValue = "1529128457"
	)
	public class459 method9352(String var1) {
		this.method9275();
		return this.method9273(var1, 0);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-403458446"
	)
	void method9275() {
		this.field5116.clear();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-65093288"
	)
	public int method9276(int var1) {
		return this.method9277(var1, var1 + 1);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "128"
	)
	public int method9277(int var1, int var2) {
		int var3;
		if (var2 < var1) {
			var3 = var2;
			var2 = var1;
			var1 = var3;
		}

		this.field5116.subList(var1, var2).clear();
		var3 = var1;
		if (this.method9263() && this.field5117 == 1) {
			while (var3 > 0) {
				--var3;
				char var4 = ((class460)this.field5116.get(var3)).field5125;
				if (var4 == ' ' || var4 == '\t') {
					break;
				}
			}
		}

		this.method9345(var3, var2);
		return var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-969408597"
	)
	public int method9278(int var1, int var2) {
		if (this.field5107 == null) {
			return 0;
		} else if (this.method9263() && var1 > this.field5109) {
			return this.field5116.size();
		} else {
			if (!this.field5116.isEmpty()) {
				for (int var3 = 0; var3 < this.field5116.size(); ++var3) {
					class460 var4 = (class460)this.field5116.get(var3);
					if (var2 <= var4.field5126 + this.method9353()) {
						if (var2 < var4.field5126) {
							break;
						}

						if (var1 < var4.field5124) {
							return var3 > 0 ? var3 - 1 : 0;
						}

						if (1 + var3 != this.field5116.size() && ((class460)this.field5116.get(1 + var3)).field5126 != var4.field5126) {
							int var5 = this.method9297((class460)this.field5116.get(var3), false);
							if (var1 < var5 + var4.field5124) {
								return var3;
							}

							if (var2 <= var4.field5126 + this.method9353()) {
								return var3 + 1;
							}
						}
					}
				}

				class460 var6 = (class460)this.field5116.get(this.field5116.size() - 1);
				if (var1 >= var6.field5124 && var1 <= var6.field5124 + this.method9392() && var2 >= var6.field5126 && var2 <= var6.field5126 + this.method9353()) {
					return this.field5116.size() - 1;
				}
			}

			return this.field5116.size();
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "120"
	)
	public int method9279(int var1, int var2) {
		if (this.field5107 != null && !this.method9274() && var1 <= this.field5116.size()) {
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
				class460 var6 = (class460)this.field5116.get(var1 - 1);
				var4 = var6.field5124 + this.method9379(var1 - 1);
				var5 = var6.field5126;
			} else if (var3 == -1 && var1 == 0) {
				return 0;
			}

			int var14 = 16777215;
			int var7 = 0;
			int var8 = var1;
			int var9 = 16777215;
			int var10 = var3 == 1 ? this.field5116.size() + 1 : 0;

			for (int var11 = var3 + var1; var11 != var10; var11 += var3) {
				class460 var12 = (class460)this.field5116.get(var11 - 1);
				if (var5 != var12.field5126) {
					++var7;
					var5 = var12.field5126;
					if (var7 > var2) {
						return var8;
					}
				}

				if (var7 == var2) {
					int var13 = Math.abs(var12.field5124 + this.method9379(var11 - 1) - var4);
					if (var13 >= var9) {
						return var8;
					}

					var8 = var11;
					var9 = var13;
				}
			}

			if (var3 == 1) {
				return this.field5116.size();
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1605451008"
	)
	public int method9280() {
		if (!this.field5116.isEmpty() && this.method9283() == 1) {
			return this.field5116.isEmpty() ? 0 : ((class460)this.field5116.get(this.field5116.size() - 1)).field5124 + this.method9392();
		} else {
			int var1 = -1;
			int var2 = 0;

			for (int var3 = this.field5116.size() - 1; var3 >= 0; --var3) {
				class460 var4 = (class460)this.field5116.get(var3);
				if (var1 != var4.field5126) {
					int var5 = this.method9297(var4, false) + var4.field5124;
					var2 = Math.max(var5, var2);
					var1 = var4.field5126;
				}
			}

			return var2;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1119499925"
	)
	public int method9350() {
		return this.method9274() ? 0 : this.field5107.ascent + ((class460)this.field5116.get(this.field5116.size() - 1)).field5126;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-252841185"
	)
	public int method9353() {
		return this.field5113;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	public int method9283() {
		return this.method9350() / this.field5107.ascent;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-121"
	)
	int method9392() {
		return this.method9274() ? 0 : this.method9297((class460)this.field5116.get(this.field5116.size() - 1), false);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-66017056"
	)
	public int method9373() {
		return this.field5109;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-380436132"
	)
	public void method9286(int var1) {
		if (this.field5107 != null && var1 < this.field5107.ascent * 2) {
			var1 = Integer.MAX_VALUE;
		}

		if (this.field5109 != var1) {
			this.field5109 = var1;
			this.method9294();
		}

	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "909327388"
	)
	public int method9287() {
		return this.field5118;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-36"
	)
	public void method9288(int var1) {
		if (this.field5118 != var1) {
			this.field5118 = var1;
			this.method9294();
		}

	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1063682676"
	)
	public int method9303() {
		return this.field5117;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-230403699"
	)
	public void method9326(int var1) {
		if (this.field5117 != var1) {
			this.field5117 = var1;
			this.method9294();
		}

	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "2"
	)
	public int method9388() {
		return this.field5114;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2140574547"
	)
	public int method9306(int var1) {
		switch(this.field5111) {
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

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1585878236"
	)
	public int method9293(int var1) {
		switch(this.field5110) {
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
		descriptor = "(I)V",
		garbageValue = "-2130202578"
	)
	void method9294() {
		this.method9345(0, this.field5116.size());
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1801487325"
	)
	void method9345(int var1, int var2) {
		if (!this.method9274() && this.field5107 != null) {
			class553 var3 = this.method9298(var1, var2);
			boolean var4 = (Integer)var3.field5652 == 0 && (Integer)var3.field5651 == this.field5116.size();
			int var5 = (Integer)var3.field5652;
			int var6 = 0;
			int var7 = var4 ? 0 : ((class460)this.field5116.get((Integer)var3.field5652)).field5126;
			int var8 = 0;

			int var9;
			for (var9 = (Integer)var3.field5652; var9 <= (Integer)var3.field5651; ++var9) {
				boolean var10 = var9 >= this.field5116.size();
				class460 var21 = (class460)this.field5116.get(!var10 ? var9 : this.field5116.size() - 1);
				int var22 = !var10 ? this.method9297(var21, false) : 0;
				boolean var13 = !var10 && var21.field5125 == '\n';
				boolean var14 = !var10 && this.method9263() && var6 + var22 > this.field5109;
				if (var13 || var14 || var10) {
					int var15 = var9;
					int var16 = 0;
					int var17;
					int var18;
					class460 var19;
					if (var14) {
						var17 = 0;
						if (this.field5117 == 1) {
							for (var18 = var9; var18 > var5; --var18) {
								var19 = (class460)this.field5116.get(var18);
								var17 += var18 < var15 ? this.method9297(var19, false) : 0;
								if (var19.field5125 == ' ' || var19.field5125 == '\n') {
									var15 = var18;
									var6 -= var17;
									var16 = var17;
									break;
								}
							}
						}
					}

					var17 = -this.method9306(var6);

					for (var18 = var5; var18 < var15; ++var18) {
						var19 = (class460)this.field5116.get(var18);
						int var20 = this.method9297(var19, false);
						var19.field5124 = var17;
						var19.field5126 = var7;
						var17 += var20;
					}

					var5 = var15;
					var6 = var16;
					var7 += this.method9353();
					++var8;
				}

				var6 += !var10 ? var22 : 0;
			}

			if (this.field5110 != 0 && var4) {
				var9 = var8 * this.method9353();
				int var23 = this.method9293(var9);

				for (int var11 = 0; var11 < this.field5116.size(); ++var11) {
					class460 var12 = (class460)this.field5116.get(var11);
					var12.field5126 -= var23;
				}
			}

		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-47372700"
	)
	int method9379(int var1) {
		return var1 < this.field5116.size() ? this.method9297((class460)this.field5116.get(var1), false) : 0;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lrn;ZI)I",
		garbageValue = "-1668832603"
	)
	int method9297(class460 var1, boolean var2) {
		if (var1.field5125 == '\n') {
			return 0;
		} else if (this.field5114 == 0) {
			int var3 = this.field5107.advances[var1.field5125];
			if (var3 == 0) {
				return var1.field5125 == '\t' ? this.field5107.advances[32] * 3 : this.field5107.advances[32];
			} else {
				return var3;
			}
		} else {
			return this.field5107.advances[42];
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(III)Lvk;",
		garbageValue = "-931625270"
	)
	class553 method9298(int var1, int var2) {
		int var3 = Math.min(var1, var2);
		int var4 = Math.max(var1, var2);
		int var5 = this.field5116.size();
		if (var3 == 0 && var4 == var5) {
			return new class553(0, var5);
		} else {
			int var6 = this.method9259(var3, false);
			int var7 = this.method9300(var4, false);
			int var8;
			switch(this.field5110) {
			case 0:
				if (this.field5111 == 0) {
					return new class553(var6, var5);
				}

				var8 = this.method9259(var3, true);
				return new class553(var8, var5);
			case 1:
				return new class553(0, var5);
			case 2:
				if (this.field5111 == 2) {
					return new class553(0, var7);
				}

				var8 = this.method9300(var4, true);
				return new class553(0, var8);
			default:
				return new class553(0, var5);
			}
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "-1647382846"
	)
	int method9259(int var1, boolean var2) {
		if (var1 < this.field5116.size()) {
			int var3 = ((class460)this.field5116.get(var1)).field5126;

			for (int var4 = var1; var4 > 0; --var4) {
				if (((class460)this.field5116.get(var4 - 1)).field5126 < var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((class460)this.field5116.get(var4 - 1)).field5126;
				}
			}
		}

		return 0;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "-1546589017"
	)
	int method9300(int var1, boolean var2) {
		if (var1 < this.field5116.size()) {
			int var3 = ((class460)this.field5116.get(var1)).field5126;

			for (int var4 = var1; var4 < this.field5116.size() - 1; ++var4) {
				if (((class460)this.field5116.get(var4 + 1)).field5126 > var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((class460)this.field5116.get(var4 + 1)).field5126;
				}
			}
		}

		return this.field5116.size();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;I)Ltn;",
		garbageValue = "961872180"
	)
	public static DynamicArray method9410(String[] var0) {
		DynamicArray var1 = new DynamicArray(class570.field5718, false);
		var1.field5406 = var0;
		var1.size = var0.length * 1527641021;
		var1.field5402 = var0.length;
		return var1;
	}
}
