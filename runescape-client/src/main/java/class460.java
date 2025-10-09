import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rs")
public class class460 {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1212471829
	)
	int field5282;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 593474945
	)
	int field5273;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1414456203
	)
	int field5277;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1778830699
	)
	int field5279;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1911555767
	)
	int field5271;
	@ObfuscatedName("an")
	boolean field5281;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lrh;"
	)
	AbstractFont field5278;
	@ObfuscatedName("ai")
	ArrayList field5283;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -645523859
	)
	int field5284;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 2062674121
	)
	int field5285;

	public class460() {
		this.field5282 = Integer.MAX_VALUE;
		this.field5273 = Integer.MAX_VALUE;
		this.field5277 = 0;
		this.field5279 = 0;
		this.field5271 = 0;
		this.field5281 = true;
		this.field5283 = new ArrayList();
		this.field5284 = 0;
		this.field5285 = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Lrd;",
		garbageValue = "14"
	)
	public class462 method9368(int var1) {
		return (class462)this.field5283.get(var1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Lrd;",
		garbageValue = "-681950218"
	)
	class462 method9333() {
		return this.field5283.isEmpty() ? null : (class462)this.field5283.get(this.field5283.size() - 1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-45"
	)
	public boolean method9406() {
		return this.field5283.isEmpty();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-24"
	)
	boolean method9335() {
		return this.field5273 > 1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1090943996"
	)
	public int method9437() {
		return this.field5283.size();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "344529729"
	)
	public String method9426() {
		if (this.method9406()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method9437());

			for (int var2 = 0; var2 < this.method9437(); ++var2) {
				class462 var3 = this.method9368(var2);
				var1.append(var3.field5293);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "16"
	)
	public void method9338(int var1) {
		if (this.field5285 != var1) {
			this.field5285 = var1;
			this.method9363();
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lrh;B)V",
		garbageValue = "25"
	)
	public void method9339(AbstractFont var1) {
		if (var1 != this.field5278) {
			this.field5278 = var1;
			if (this.field5278 != null) {
				if (this.field5271 == 0) {
					this.field5271 = this.field5278.ascent;
				}

				if (!this.method9406()) {
					this.method9363();
				}
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "86"
	)
	public boolean method9340(int var1, int var2) {
		if (this.field5277 != var1 || var2 != this.field5279) {
			this.field5277 = var1;
			this.field5279 = var2;
			this.method9363();
		}

		return true;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2081015539"
	)
	public void method9341(int var1) {
		if (this.field5271 != var1) {
			this.field5271 = var1;
			this.method9363();
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)Lru;",
		garbageValue = "1699428355"
	)
	public class464 method9342(int var1, int var2) {
		if (var2 == var1) {
			return new class464(this, 0, 0);
		} else if (var1 <= this.field5283.size() && var2 <= this.field5283.size()) {
			return var2 < var1 ? new class464(this, var2, var1) : new class464(this, var1, var2);
		} else {
			return new class464(this, 0, 0);
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(CIII)Lrg;",
		garbageValue = "-1095490718"
	)
	public class461 method9343(char var1, int var2, int var3) {
		return this.method9344(Character.toString(var1), var2, var3);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIB)Lrg;",
		garbageValue = "-119"
	)
	public class461 method9344(String var1, int var2, int var3) {
		if (var3 == 0) {
			var3 = Integer.MAX_VALUE;
		}

		int var4 = var2;
		if (this.field5283.size() >= var3) {
			this.method9416(var2, var2);
			return new class461(var2, true);
		} else {
			this.field5283.ensureCapacity(this.field5283.size() + var1.length());

			for (int var5 = 0; var5 < var1.length() && this.field5283.size() < var3; ++var5) {
				class462 var6 = new class462();
				var6.field5293 = var1.charAt(var5);
				this.field5283.add(var4, var6);
				++var4;
			}

			this.method9416(var2, var4);
			if (this.field5273 != 0 && this.method9432() > this.field5273) {
				while (var4 != var2) {
					--var4;
					this.method9348(var4);
					if (this.method9432() <= this.field5273) {
						break;
					}
				}

				return new class461(var4, true);
			} else {
				return new class461(var4, false);
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Lrg;",
		garbageValue = "349825470"
	)
	class461 method9345(String var1, int var2) {
		return this.method9344(var1, this.field5283.size(), var2);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lrg;",
		garbageValue = "-1558763696"
	)
	public class461 method9346(String var1) {
		this.method9347();
		return this.method9345(var1, 0);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1324369342"
	)
	void method9347() {
		this.field5283.clear();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1881856437"
	)
	public int method9348(int var1) {
		return this.method9349(var1, var1 + 1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "558564642"
	)
	public int method9349(int var1, int var2) {
		int var3;
		if (var2 < var1) {
			var3 = var2;
			var2 = var1;
			var1 = var3;
		}

		this.field5283.subList(var1, var2).clear();
		var3 = var1;
		if (this.method9335() && this.field5284 == 1) {
			while (var3 > 0) {
				--var3;
				char var4 = ((class462)this.field5283.get(var3)).field5293;
				if (var4 == ' ' || var4 == '\t') {
					break;
				}
			}
		}

		this.method9416(var3, var2);
		return var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1684644500"
	)
	public int method9350(int var1, int var2) {
		if (this.field5278 == null) {
			return 0;
		} else if (this.method9335() && var1 > this.field5282) {
			return this.field5283.size();
		} else {
			if (!this.field5283.isEmpty()) {
				for (int var3 = 0; var3 < this.field5283.size(); ++var3) {
					class462 var4 = (class462)this.field5283.get(var3);
					if (var2 <= var4.field5294 + this.method9354()) {
						if (var2 < var4.field5294) {
							break;
						}

						if (var1 < var4.field5292) {
							return var3 > 0 ? var3 - 1 : 0;
						}

						if (1 + var3 != this.field5283.size() && ((class462)this.field5283.get(1 + var3)).field5294 != var4.field5294) {
							int var5 = this.method9369((class462)this.field5283.get(var3), false);
							if (var1 < var5 + var4.field5292) {
								return var3;
							}

							if (var2 <= var4.field5294 + this.method9354()) {
								return var3 + 1;
							}
						}
					}
				}

				class462 var6 = (class462)this.field5283.get(this.field5283.size() - 1);
				if (var1 >= var6.field5292 && var1 <= var6.field5292 + this.method9356() && var2 >= var6.field5294 && var2 <= var6.field5294 + this.method9354()) {
					return this.field5283.size() - 1;
				}
			}

			return this.field5283.size();
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-2046149809"
	)
	public int method9351(int var1, int var2) {
		if (this.field5278 != null && !this.method9406() && var1 <= this.field5283.size()) {
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
				class462 var6 = (class462)this.field5283.get(var1 - 1);
				var4 = var6.field5292 + this.method9412(var1 - 1);
				var5 = var6.field5294;
			} else if (var3 == -1 && var1 == 0) {
				return 0;
			}

			int var14 = 16777215;
			int var7 = 0;
			int var8 = var1;
			int var9 = 16777215;
			int var10 = var3 == 1 ? this.field5283.size() + 1 : 0;

			for (int var11 = var3 + var1; var11 != var10; var11 += var3) {
				class462 var12 = (class462)this.field5283.get(var11 - 1);
				if (var5 != var12.field5294) {
					++var7;
					var5 = var12.field5294;
					if (var7 > var2) {
						return var8;
					}
				}

				if (var7 == var2) {
					int var13 = Math.abs(var12.field5292 + this.method9412(var11 - 1) - var4);
					if (var13 >= var9) {
						return var8;
					}

					var8 = var11;
					var9 = var13;
				}
			}

			if (var3 == 1) {
				return this.field5283.size();
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "38"
	)
	public int method9355() {
		if (!this.field5283.isEmpty() && this.method9432() == 1) {
			return this.field5283.isEmpty() ? 0 : ((class462)this.field5283.get(this.field5283.size() - 1)).field5292 + this.method9356();
		} else {
			int var1 = -1;
			int var2 = 0;

			for (int var3 = this.field5283.size() - 1; var3 >= 0; --var3) {
				class462 var4 = (class462)this.field5283.get(var3);
				if (var1 != var4.field5294) {
					int var5 = this.method9369(var4, false) + var4.field5292;
					var2 = Math.max(var5, var2);
					var1 = var4.field5294;
				}
			}

			return var2;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "110"
	)
	public int method9462() {
		return this.method9406() ? 0 : this.field5278.ascent + ((class462)this.field5283.get(this.field5283.size() - 1)).field5294;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-696533432"
	)
	public int method9354() {
		return this.field5271;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1664173479"
	)
	public int method9432() {
		return this.method9462() / this.field5278.ascent;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1408140018"
	)
	int method9356() {
		return this.method9406() ? 0 : this.method9369((class462)this.field5283.get(this.field5283.size() - 1), false);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2091087252"
	)
	public int method9408() {
		return this.field5282;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "22"
	)
	public void method9367(int var1) {
		if (this.field5278 != null && var1 < this.field5278.ascent * 2) {
			var1 = Integer.MAX_VALUE;
		}

		if (this.field5282 != var1) {
			this.field5282 = var1;
			this.method9363();
		}

	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "107"
	)
	public int method9359() {
		return this.field5273;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "976638953"
	)
	public void method9360(int var1) {
		if (this.field5273 != var1) {
			this.field5273 = var1;
			this.method9363();
		}

	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1224190058"
	)
	public int method9382() {
		return this.field5284;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "131601144"
	)
	public void method9362(int var1) {
		if (this.field5284 != var1) {
			this.field5284 = var1;
			this.method9363();
		}

	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-1788"
	)
	public int method9438() {
		return this.field5285;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-9"
	)
	public int method9364(int var1) {
		switch(this.field5277) {
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

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "40"
	)
	public int method9365(int var1) {
		switch(this.field5279) {
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

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "874426601"
	)
	void method9363() {
		this.method9416(0, this.field5283.size());
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1593886789"
	)
	void method9416(int var1, int var2) {
		if (!this.method9406() && this.field5278 != null) {
			class555 var3 = this.method9370(var1, var2);
			boolean var4 = (Integer)var3.field5821 == 0 && (Integer)var3.field5819 == this.field5283.size();
			int var5 = (Integer)var3.field5821;
			int var6 = 0;
			int var7 = var4 ? 0 : ((class462)this.field5283.get((Integer)var3.field5821)).field5294;
			int var8 = 0;

			int var9;
			for (var9 = (Integer)var3.field5821; var9 <= (Integer)var3.field5819; ++var9) {
				boolean var10 = var9 >= this.field5283.size();
				class462 var21 = (class462)this.field5283.get(!var10 ? var9 : this.field5283.size() - 1);
				int var22 = !var10 ? this.method9369(var21, false) : 0;
				boolean var13 = !var10 && var21.field5293 == '\n';
				boolean var14 = !var10 && this.method9335() && var6 + var22 > this.field5282;
				if (var13 || var14 || var10) {
					int var15 = var9;
					int var16 = 0;
					int var17;
					int var18;
					class462 var19;
					if (var14) {
						var17 = 0;
						if (this.field5284 == 1) {
							for (var18 = var9; var18 > var5; --var18) {
								var19 = (class462)this.field5283.get(var18);
								var17 += var18 < var15 ? this.method9369(var19, false) : 0;
								if (var19.field5293 == ' ' || var19.field5293 == '\n') {
									var15 = var18;
									var6 -= var17;
									var16 = var17;
									break;
								}
							}
						}
					}

					var17 = -this.method9364(var6);

					for (var18 = var5; var18 < var15; ++var18) {
						var19 = (class462)this.field5283.get(var18);
						int var20 = this.method9369(var19, false);
						var19.field5292 = var17;
						var19.field5294 = var7;
						var17 += var20;
					}

					var5 = var15;
					var6 = var16;
					var7 += this.method9354();
					++var8;
				}

				var6 += !var10 ? var22 : 0;
			}

			if (this.field5279 != 0 && var4) {
				var9 = var8 * this.method9354();
				int var23 = this.method9365(var9);

				for (int var11 = 0; var11 < this.field5283.size(); ++var11) {
					class462 var12 = (class462)this.field5283.get(var11);
					var12.field5294 -= var23;
				}
			}

		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2145327961"
	)
	int method9412(int var1) {
		return var1 < this.field5283.size() ? this.method9369((class462)this.field5283.get(var1), false) : 0;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Lrd;ZS)I",
		garbageValue = "15116"
	)
	int method9369(class462 var1, boolean var2) {
		if (var1.field5293 == '\n') {
			return 0;
		} else if (this.field5285 == 0) {
			int var3 = this.field5278.advances[var1.field5293];
			if (var3 == 0) {
				return var1.field5293 == '\t' ? this.field5278.advances[32] * 3 : this.field5278.advances[32];
			} else {
				return var3;
			}
		} else {
			return this.field5278.advances[42];
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(III)Lvn;",
		garbageValue = "735880459"
	)
	class555 method9370(int var1, int var2) {
		int var3 = Math.min(var1, var2);
		int var4 = Math.max(var1, var2);
		int var5 = this.field5283.size();
		if (var3 == 0 && var4 == var5) {
			return new class555(0, var5);
		} else {
			int var6 = this.method9371(var3, false);
			int var7 = this.method9372(var4, false);
			int var8;
			switch(this.field5279) {
			case 0:
				if (this.field5277 == 0) {
					return new class555(var6, var5);
				}

				var8 = this.method9371(var3, true);
				return new class555(var8, var5);
			case 1:
				return new class555(0, var5);
			case 2:
				if (this.field5277 == 2) {
					return new class555(0, var7);
				}

				var8 = this.method9372(var4, true);
				return new class555(0, var8);
			default:
				return new class555(0, var5);
			}
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(IZB)I",
		garbageValue = "-119"
	)
	int method9371(int var1, boolean var2) {
		if (var1 < this.field5283.size()) {
			int var3 = ((class462)this.field5283.get(var1)).field5294;

			for (int var4 = var1; var4 > 0; --var4) {
				if (((class462)this.field5283.get(var4 - 1)).field5294 < var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((class462)this.field5283.get(var4 - 1)).field5294;
				}
			}
		}

		return 0;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "1805881817"
	)
	int method9372(int var1, boolean var2) {
		if (var1 < this.field5283.size()) {
			int var3 = ((class462)this.field5283.get(var1)).field5294;

			for (int var4 = var1; var4 < this.field5283.size() - 1; ++var4) {
				if (((class462)this.field5283.get(var4 + 1)).field5294 > var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((class462)this.field5283.get(var4 + 1)).field5294;
				}
			}
		}

		return this.field5283.size();
	}
}
