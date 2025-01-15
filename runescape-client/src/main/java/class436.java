import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qi")
public class class436 {
	@ObfuscatedName("do")
	static boolean field4815;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -578814809
	)
	int field4804;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -753724057
	)
	int field4805;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 265104411
	)
	int field4808;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1208307643
	)
	int field4800;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 553178799
	)
	int field4807;
	@ObfuscatedName("ai")
	boolean field4798;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	AbstractFont field4801;
	@ObfuscatedName("am")
	ArrayList field4811;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1024239379
	)
	int field4812;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1973607425
	)
	int field4813;

	public class436() {
		this.field4804 = Integer.MAX_VALUE;
		this.field4805 = Integer.MAX_VALUE;
		this.field4808 = 0;
		this.field4800 = 0;
		this.field4807 = 0;
		this.field4798 = true;
		this.field4811 = new ArrayList();
		this.field4812 = 0;
		this.field4813 = 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqo;",
		garbageValue = "17"
	)
	public class438 method8528(int var1) {
		return (class438)this.field4811.get(var1);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Lqo;",
		garbageValue = "81"
	)
	class438 method8529() {
		return this.field4811.size() == 0 ? null : (class438)this.field4811.get(this.field4811.size() - 1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "75"
	)
	public boolean method8579() {
		return this.field4811.size() == 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-710679131"
	)
	boolean method8531() {
		return this.field4805 > 1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1601671820"
	)
	public int method8532() {
		return this.field4811.size();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1887284918"
	)
	public String method8533() {
		if (this.method8579()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method8532());

			for (int var2 = 0; var2 < this.method8532(); ++var2) {
				class438 var3 = this.method8528(var2);
				var1.append(var3.field4824);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1824847702"
	)
	public void method8534(int var1) {
		if (this.field4801 != null && var1 < this.field4801.ascent * 2) {
			var1 = Integer.MAX_VALUE;
		}

		if (this.field4804 != var1) {
			this.field4804 = var1;
			this.method8584();
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "649876821"
	)
	public void method8662(int var1) {
		if (this.field4805 != var1) {
			this.field4805 = var1;
			this.method8584();
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "112"
	)
	public void method8581(int var1) {
		if (this.field4813 != var1) {
			this.field4813 = var1;
			this.method8584();
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lqc;I)V",
		garbageValue = "1479030546"
	)
	public void method8663(AbstractFont var1) {
		if (var1 != this.field4801) {
			this.field4801 = var1;
			if (this.field4801 != null) {
				if (this.field4807 == 0) {
					this.field4807 = this.field4801.ascent;
				}

				if (!this.method8579()) {
					this.method8584();
				}
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-282735397"
	)
	public void method8602(int var1) {
		if (this.field4812 != var1) {
			this.field4812 = var1;
			this.method8584();
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-842892656"
	)
	public boolean method8539(int var1, int var2) {
		if (this.field4808 != var1 || var2 != this.field4800) {
			this.field4808 = var1;
			this.field4800 = var2;
			this.method8584();
		}

		return true;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2029561408"
	)
	public void method8540(int var1) {
		if (this.field4807 != var1) {
			this.field4807 = var1;
			this.method8584();
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)Lqk;",
		garbageValue = "-1123277917"
	)
	public class440 method8629(int var1, int var2) {
		if (var2 == var1) {
			return new class440(this, 0, 0);
		} else if (var1 <= this.field4811.size() && var2 <= this.field4811.size()) {
			return var2 < var1 ? new class440(this, var2, var1) : new class440(this, var1, var2);
		} else {
			return new class440(this, 0, 0);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(CIIB)Lqy;",
		garbageValue = "6"
	)
	public class437 method8543(char var1, int var2, int var3) {
		return this.method8601(Character.toString(var1), var2, var3);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;III)Lqy;",
		garbageValue = "688799447"
	)
	public class437 method8601(String var1, int var2, int var3) {
		if (var3 == 0) {
			var3 = Integer.MAX_VALUE;
		}

		int var4 = var2;
		if (this.field4811.size() >= var3) {
			this.method8562(var2, var2);
			return new class437(var2, true);
		} else {
			this.field4811.ensureCapacity(this.field4811.size() + var1.length());

			for (int var5 = 0; var5 < var1.length() && this.field4811.size() < var3; ++var5) {
				class438 var6 = new class438();
				var6.field4824 = var1.charAt(var5);
				this.field4811.add(var4, var6);
				++var4;
			}

			this.method8562(var2, var4);
			if (this.field4805 != 0 && this.method8530() > this.field4805) {
				while (var4 != var2) {
					--var4;
					this.method8547(var4);
					if (this.method8530() <= this.field4805) {
						break;
					}
				}

				return new class437(var4, true);
			} else {
				return new class437(var4, false);
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Lqy;",
		garbageValue = "1179216185"
	)
	class437 method8590(String var1, int var2) {
		return this.method8601(var1, this.field4811.size(), var2);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lqy;",
		garbageValue = "-1801082095"
	)
	public class437 method8545(String var1) {
		this.method8546();
		return this.method8590(var1, 0);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-272166622"
	)
	void method8546() {
		this.field4811.clear();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1441021426"
	)
	public int method8547(int var1) {
		return this.method8548(var1, var1 + 1);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1298716202"
	)
	public int method8548(int var1, int var2) {
		int var3;
		if (var2 < var1) {
			var3 = var2;
			var2 = var1;
			var1 = var3;
		}

		this.field4811.subList(var1, var2).clear();
		var3 = var1;
		if (this.method8531() && this.field4812 == 1) {
			while (var3 > 0) {
				--var3;
				char var4 = ((class438)this.field4811.get(var3)).field4824;
				if (var4 == ' ' || var4 == '\t') {
					break;
				}
			}
		}

		this.method8562(var3, var2);
		return var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1371865968"
	)
	public int method8549(int var1, int var2) {
		if (this.field4801 == null) {
			return 0;
		} else if (this.method8531() && var1 > this.field4804) {
			return this.field4811.size();
		} else {
			if (!this.field4811.isEmpty()) {
				for (int var3 = 0; var3 < this.field4811.size(); ++var3) {
					class438 var4 = (class438)this.field4811.get(var3);
					if (var2 <= var4.field4822 + this.method8552()) {
						if (var2 < var4.field4822) {
							break;
						}

						if (var1 < var4.field4821) {
							return var3 > 0 ? var3 - 1 : 0;
						}

						if (var3 + 1 != this.field4811.size() && ((class438)this.field4811.get(var3 + 1)).field4822 != var4.field4822) {
							int var5 = this.method8576((class438)this.field4811.get(var3), false);
							if (var1 < var5 + var4.field4821) {
								return var3;
							}

							if (var2 <= var4.field4822 + this.method8552()) {
								return var3 + 1;
							}
						}
					}
				}

				class438 var6 = (class438)this.field4811.get(this.field4811.size() - 1);
				if (var1 >= var6.field4821 && var1 <= var6.field4821 + this.method8554() && var2 >= var6.field4822 && var2 <= var6.field4822 + this.method8552()) {
					return this.field4811.size() - 1;
				}
			}

			return this.field4811.size();
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "2147290376"
	)
	public int method8603(int var1, int var2) {
		if (this.field4801 != null && !this.method8579() && var1 <= this.field4811.size()) {
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
				class438 var6 = (class438)this.field4811.get(var1 - 1);
				var4 = var6.field4821 + this.method8563(var1 - 1);
				var5 = var6.field4822;
			} else if (var3 == -1 && var1 == 0) {
				return 0;
			}

			int var14 = 16777215;
			int var7 = 0;
			int var8 = var1;
			int var9 = 16777215;
			int var10 = var3 == 1 ? this.field4811.size() + 1 : 0;

			for (int var11 = var3 + var1; var11 != var10; var11 += var3) {
				class438 var12 = (class438)this.field4811.get(var11 - 1);
				if (var5 != var12.field4822) {
					++var7;
					var5 = var12.field4822;
					if (var7 > var2) {
						return var8;
					}
				}

				if (var7 == var2) {
					int var13 = Math.abs(var12.field4821 + this.method8563(var11 - 1) - var4);
					if (var13 >= var9) {
						return var8;
					}

					var8 = var11;
					var9 = var13;
				}
			}

			if (var3 == 1) {
				return this.field4811.size();
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "724823986"
	)
	public int method8535() {
		if (!this.field4811.isEmpty() && this.method8530() == 1) {
			return this.field4811.isEmpty() ? 0 : ((class438)this.field4811.get(this.field4811.size() - 1)).field4821 + this.method8554();
		} else {
			int var1 = -1;
			int var2 = 0;

			for (int var3 = this.field4811.size() - 1; var3 >= 0; --var3) {
				class438 var4 = (class438)this.field4811.get(var3);
				if (var1 != var4.field4822) {
					int var5 = this.method8576(var4, false) + var4.field4821;
					var2 = Math.max(var5, var2);
					var1 = var4.field4822;
				}
			}

			return var2;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "112"
	)
	public int method8555() {
		return this.method8579() ? 0 : this.field4801.ascent + ((class438)this.field4811.get(this.field4811.size() - 1)).field4822;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1893689420"
	)
	public int method8552() {
		return this.field4807;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-240461513"
	)
	public int method8530() {
		return this.method8555() / this.field4801.ascent;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2022140878"
	)
	int method8554() {
		return this.method8579() ? 0 : this.method8576((class438)this.field4811.get(this.field4811.size() - 1), false);
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "108"
	)
	public int method8627() {
		return this.field4804;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1613567763"
	)
	public int method8556() {
		return this.field4805;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-349187962"
	)
	public int method8553() {
		return this.field4812;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-67"
	)
	public int method8536() {
		return this.field4813;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-43"
	)
	public int method8559(int var1) {
		switch(this.field4808) {
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

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1889382726"
	)
	public int method8560(int var1) {
		switch(this.field4800) {
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

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "46"
	)
	void method8584() {
		this.method8562(0, this.field4811.size());
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2034973918"
	)
	void method8562(int var1, int var2) {
		if (!this.method8579() && this.field4801 != null) {
			class527 var3 = this.method8565(var1, var2);
			boolean var4 = (Integer)var3.field5326 == 0 && (Integer)var3.field5327 == this.field4811.size();
			int var5 = (Integer)var3.field5326;
			int var6 = 0;
			int var7 = var4 ? 0 : ((class438)this.field4811.get((Integer)var3.field5326)).field4822;
			int var8 = 0;

			int var9;
			for (var9 = (Integer)var3.field5326; var9 <= (Integer)var3.field5327; ++var9) {
				boolean var10 = var9 >= this.field4811.size();
				class438 var21 = (class438)this.field4811.get(!var10 ? var9 : this.field4811.size() - 1);
				int var22 = !var10 ? this.method8576(var21, false) : 0;
				boolean var13 = !var10 && var21.field4824 == '\n';
				boolean var14 = !var10 && this.method8531() && var6 + var22 > this.field4804;
				if (var13 || var14 || var10) {
					int var15 = var9;
					int var16 = 0;
					int var17;
					int var18;
					class438 var19;
					if (var14) {
						var17 = 0;
						if (this.field4812 == 1) {
							for (var18 = var9; var18 > var5; --var18) {
								var19 = (class438)this.field4811.get(var18);
								var17 += var18 < var15 ? this.method8576(var19, false) : 0;
								if (var19.field4824 == ' ' || var19.field4824 == '\n') {
									var15 = var18;
									var6 -= var17;
									var16 = var17;
									break;
								}
							}
						}
					}

					var17 = -this.method8559(var6);

					for (var18 = var5; var18 < var15; ++var18) {
						var19 = (class438)this.field4811.get(var18);
						int var20 = this.method8576(var19, false);
						var19.field4821 = var17;
						var19.field4822 = var7;
						var17 += var20;
					}

					var5 = var15;
					var6 = var16;
					var7 += this.method8552();
					++var8;
				}

				var6 += !var10 ? var22 : 0;
			}

			if (this.field4800 != 0 && var4) {
				var9 = var8 * this.method8552();
				int var23 = this.method8560(var9);

				for (int var11 = 0; var11 < this.field4811.size(); ++var11) {
					class438 var12 = (class438)this.field4811.get(var11);
					var12.field4822 -= var23;
				}
			}

		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "386227030"
	)
	int method8563(int var1) {
		return var1 < this.field4811.size() ? this.method8576((class438)this.field4811.get(var1), false) : 0;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lqo;ZB)I",
		garbageValue = "98"
	)
	int method8576(class438 var1, boolean var2) {
		if (var1.field4824 == '\n') {
			return 0;
		} else if (this.field4813 == 0) {
			int var3 = this.field4801.advances[var1.field4824];
			if (var3 == 0) {
				return var1.field4824 == '\t' ? this.field4801.advances[32] * 3 : this.field4801.advances[32];
			} else {
				return var3;
			}
		} else {
			return this.field4801.advances[42];
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(III)Lug;",
		garbageValue = "-2008755486"
	)
	class527 method8565(int var1, int var2) {
		int var3 = Math.min(var1, var2);
		int var4 = Math.max(var1, var2);
		int var5 = this.field4811.size();
		if (var3 == 0 && var5 == var4) {
			return new class527(0, var5);
		} else {
			int var6 = this.method8612(var3, false);
			int var7 = this.method8567(var4, false);
			int var8;
			switch(this.field4800) {
			case 0:
				if (this.field4808 == 0) {
					return new class527(var6, var5);
				}

				var8 = this.method8612(var3, true);
				return new class527(var8, var5);
			case 1:
				return new class527(0, var5);
			case 2:
				if (this.field4808 == 2) {
					return new class527(0, var7);
				}

				var8 = this.method8567(var4, true);
				return new class527(0, var8);
			default:
				return new class527(0, var5);
			}
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(IZB)I",
		garbageValue = "52"
	)
	int method8612(int var1, boolean var2) {
		if (var1 < this.field4811.size()) {
			int var3 = ((class438)this.field4811.get(var1)).field4822;

			for (int var4 = var1; var4 > 0; --var4) {
				if (((class438)this.field4811.get(var4 - 1)).field4822 < var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((class438)this.field4811.get(var4 - 1)).field4822;
				}
			}
		}

		return 0;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(IZB)I",
		garbageValue = "5"
	)
	int method8567(int var1, boolean var2) {
		if (var1 < this.field4811.size()) {
			int var3 = ((class438)this.field4811.get(var1)).field4822;

			for (int var4 = var1; var4 < this.field4811.size() - 1; ++var4) {
				if (((class438)this.field4811.get(var4 + 1)).field4822 > var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((class438)this.field4811.get(var4 + 1)).field4822;
				}
			}
		}

		return this.field4811.size();
	}
}
