import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("re")
public class class452 {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -350338311
	)
	int field4975;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1984167059
	)
	int field4973;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -422943695
	)
	int field4977;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 969939121
	)
	int field4974;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -633942071
	)
	int field4979;
	@ObfuscatedName("ai")
	boolean field4980;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lri;"
	)
	AbstractFont field4976;
	@ObfuscatedName("ah")
	ArrayList field4982;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1087624291
	)
	int field4972;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 313733705
	)
	int field4978;

	public class452() {
		this.field4975 = Integer.MAX_VALUE;
		this.field4973 = Integer.MAX_VALUE;
		this.field4977 = 0;
		this.field4974 = 0;
		this.field4979 = 0;
		this.field4980 = true;
		this.field4982 = new ArrayList();
		this.field4972 = 0;
		this.field4978 = 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Lry;",
		garbageValue = "-414816336"
	)
	public class454 method8627(int var1) {
		return (class454)this.field4982.get(var1);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Lry;",
		garbageValue = "0"
	)
	class454 method8633() {
		return this.field4982.isEmpty() ? null : (class454)this.field4982.get(this.field4982.size() - 1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1893568014"
	)
	public boolean method8593() {
		return this.field4982.isEmpty();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-10"
	)
	boolean method8594() {
		return this.field4973 > 1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	public int method8598() {
		return this.field4982.size();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "10438"
	)
	public String method8658() {
		if (this.method8593()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method8598());

			for (int var2 = 0; var2 < this.method8598(); ++var2) {
				class454 var3 = this.method8627(var2);
				var1.append(var3.field4990);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "476170392"
	)
	public void method8597(int var1) {
		if (this.field4978 != var1) {
			this.field4978 = var1;
			this.method8624();
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lri;I)V",
		garbageValue = "-20280481"
	)
	public void method8684(AbstractFont var1) {
		if (var1 != this.field4976) {
			this.field4976 = var1;
			if (this.field4976 != null) {
				if (this.field4979 == 0) {
					this.field4979 = this.field4976.ascent;
				}

				if (!this.method8593()) {
					this.method8624();
				}
			}
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-18"
	)
	public boolean method8599(int var1, int var2) {
		if (this.field4977 != var1 || var2 != this.field4974) {
			this.field4977 = var1;
			this.field4974 = var2;
			this.method8624();
		}

		return true;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-787443376"
	)
	public void method8606(int var1) {
		if (this.field4979 != var1) {
			this.field4979 = var1;
			this.method8624();
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)Lrl;",
		garbageValue = "-1147707707"
	)
	public class456 method8619(int var1, int var2) {
		if (var2 == var1) {
			return new class456(this, 0, 0);
		} else if (var1 <= this.field4982.size() && var2 <= this.field4982.size()) {
			return var2 < var1 ? new class456(this, var2, var1) : new class456(this, var1, var2);
		} else {
			return new class456(this, 0, 0);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(CIII)Lrt;",
		garbageValue = "-1958450639"
	)
	public class453 method8602(char var1, int var2, int var3) {
		return this.method8603(Character.toString(var1), var2, var3);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;III)Lrt;",
		garbageValue = "1931152674"
	)
	public class453 method8603(String var1, int var2, int var3) {
		if (var3 == 0) {
			var3 = Integer.MAX_VALUE;
		}

		int var4 = var2;
		if (this.field4982.size() >= var3) {
			this.method8625(var2, var2);
			return new class453(var2, true);
		} else {
			this.field4982.ensureCapacity(this.field4982.size() + var1.length());

			for (int var5 = 0; var5 < var1.length() && this.field4982.size() < var3; ++var5) {
				class454 var6 = new class454();
				var6.field4990 = var1.charAt(var5);
				this.field4982.add(var4, var6);
				++var4;
			}

			this.method8625(var2, var4);
			if (this.field4973 != 0 && this.method8614() > this.field4973) {
				while (var4 != var2) {
					--var4;
					this.method8607(var4);
					if (this.method8614() <= this.field4973) {
						break;
					}
				}

				return new class453(var4, true);
			} else {
				return new class453(var4, false);
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Lrt;",
		garbageValue = "-1801266600"
	)
	class453 method8637(String var1, int var2) {
		return this.method8603(var1, this.field4982.size(), var2);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)Lrt;",
		garbageValue = "-24546"
	)
	public class453 method8605(String var1) {
		this.method8662();
		return this.method8637(var1, 0);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2124614506"
	)
	void method8662() {
		this.field4982.clear();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1242664192"
	)
	public int method8607(int var1) {
		return this.method8608(var1, var1 + 1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "305533675"
	)
	public int method8608(int var1, int var2) {
		int var3;
		if (var2 < var1) {
			var3 = var2;
			var2 = var1;
			var1 = var3;
		}

		this.field4982.subList(var1, var2).clear();
		var3 = var1;
		if (this.method8594() && this.field4972 == 1) {
			while (var3 > 0) {
				--var3;
				char var4 = ((class454)this.field4982.get(var3)).field4990;
				if (var4 == ' ' || var4 == '\t') {
					break;
				}
			}
		}

		this.method8625(var3, var2);
		return var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-73"
	)
	public int method8609(int var1, int var2) {
		if (this.field4976 == null) {
			return 0;
		} else if (this.method8594() && var1 > this.field4975) {
			return this.field4982.size();
		} else {
			if (!this.field4982.isEmpty()) {
				for (int var3 = 0; var3 < this.field4982.size(); ++var3) {
					class454 var4 = (class454)this.field4982.get(var3);
					if (var2 <= var4.field4988 + this.method8613()) {
						if (var2 < var4.field4988) {
							break;
						}

						if (var1 < var4.field4987) {
							return var3 > 0 ? var3 - 1 : 0;
						}

						if (1 + var3 != this.field4982.size() && ((class454)this.field4982.get(1 + var3)).field4988 != var4.field4988) {
							int var5 = this.method8590((class454)this.field4982.get(var3), false);
							if (var1 < var5 + var4.field4987) {
								return var3;
							}

							if (var2 <= var4.field4988 + this.method8613()) {
								return var3 + 1;
							}
						}
					}
				}

				class454 var6 = (class454)this.field4982.get(this.field4982.size() - 1);
				if (var1 >= var6.field4987 && var1 <= var6.field4987 + this.method8615() && var2 >= var6.field4988 && var2 <= var6.field4988 + this.method8613()) {
					return this.field4982.size() - 1;
				}
			}

			return this.field4982.size();
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "148612302"
	)
	public int method8610(int var1, int var2) {
		if (this.field4976 != null && !this.method8593() && var1 <= this.field4982.size()) {
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
				class454 var6 = (class454)this.field4982.get(var1 - 1);
				var4 = var6.field4987 + this.method8626(var1 - 1);
				var5 = var6.field4988;
			} else if (var3 == -1 && var1 == 0) {
				return 0;
			}

			int var14 = 16777215;
			int var7 = 0;
			int var8 = var1;
			int var9 = 16777215;
			int var10 = var3 == 1 ? this.field4982.size() + 1 : 0;

			for (int var11 = var3 + var1; var11 != var10; var11 += var3) {
				class454 var12 = (class454)this.field4982.get(var11 - 1);
				if (var5 != var12.field4988) {
					++var7;
					var5 = var12.field4988;
					if (var7 > var2) {
						return var8;
					}
				}

				if (var7 == var2) {
					int var13 = Math.abs(var12.field4987 + this.method8626(var11 - 1) - var4);
					if (var13 >= var9) {
						return var8;
					}

					var8 = var11;
					var9 = var13;
				}
			}

			if (var3 == 1) {
				return this.field4982.size();
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-85"
	)
	public int method8611() {
		if (!this.field4982.isEmpty() && this.method8614() == 1) {
			return this.field4982.isEmpty() ? 0 : ((class454)this.field4982.get(this.field4982.size() - 1)).field4987 + this.method8615();
		} else {
			int var1 = -1;
			int var2 = 0;

			for (int var3 = this.field4982.size() - 1; var3 >= 0; --var3) {
				class454 var4 = (class454)this.field4982.get(var3);
				if (var1 != var4.field4988) {
					int var5 = this.method8590(var4, false) + var4.field4987;
					var2 = Math.max(var5, var2);
					var1 = var4.field4988;
				}
			}

			return var2;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1980246793"
	)
	public int method8652() {
		return this.method8593() ? 0 : this.field4976.ascent + ((class454)this.field4982.get(this.field4982.size() - 1)).field4988;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "301"
	)
	public int method8613() {
		return this.field4979;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "829431372"
	)
	public int method8614() {
		return this.method8652() / this.field4976.ascent;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-245653793"
	)
	int method8615() {
		return this.method8593() ? 0 : this.method8590((class454)this.field4982.get(this.field4982.size() - 1), false);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "124"
	)
	public int method8616() {
		return this.field4975;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "64"
	)
	public void method8617(int var1) {
		if (this.field4976 != null && var1 < this.field4976.ascent * 2) {
			var1 = Integer.MAX_VALUE;
		}

		if (this.field4975 != var1) {
			this.field4975 = var1;
			this.method8624();
		}

	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "803475649"
	)
	public int method8650() {
		return this.field4973;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1447487810"
	)
	public void method8713(int var1) {
		if (this.field4973 != var1) {
			this.field4973 = var1;
			this.method8624();
		}

	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-772720539"
	)
	public int method8612() {
		return this.field4972;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "2"
	)
	public void method8621(int var1) {
		if (this.field4972 != var1) {
			this.field4972 = var1;
			this.method8624();
		}

	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "761304442"
	)
	public int method8622() {
		return this.field4978;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1957937640"
	)
	public int method8623(int var1) {
		switch(this.field4977) {
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

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "240935801"
	)
	public int method8648(int var1) {
		switch(this.field4974) {
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
		descriptor = "(B)V",
		garbageValue = "71"
	)
	void method8624() {
		this.method8625(0, this.field4982.size());
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1200640290"
	)
	void method8625(int var1, int var2) {
		if (!this.method8593() && this.field4976 != null) {
			class541 var3 = this.method8628(var1, var2);
			boolean var4 = (Integer)var3.field5466 == 0 && (Integer)var3.field5467 == this.field4982.size();
			int var5 = (Integer)var3.field5466;
			int var6 = 0;
			int var7 = var4 ? 0 : ((class454)this.field4982.get((Integer)var3.field5466)).field4988;
			int var8 = 0;

			int var9;
			for (var9 = (Integer)var3.field5466; var9 <= (Integer)var3.field5467; ++var9) {
				boolean var10 = var9 >= this.field4982.size();
				class454 var21 = (class454)this.field4982.get(!var10 ? var9 : this.field4982.size() - 1);
				int var22 = !var10 ? this.method8590(var21, false) : 0;
				boolean var13 = !var10 && var21.field4990 == '\n';
				boolean var14 = !var10 && this.method8594() && var6 + var22 > this.field4975;
				if (var13 || var14 || var10) {
					int var15 = var9;
					int var16 = 0;
					int var17;
					int var18;
					class454 var19;
					if (var14) {
						var17 = 0;
						if (this.field4972 == 1) {
							for (var18 = var9; var18 > var5; --var18) {
								var19 = (class454)this.field4982.get(var18);
								var17 += var18 < var15 ? this.method8590(var19, false) : 0;
								if (var19.field4990 == ' ' || var19.field4990 == '\n') {
									var15 = var18;
									var6 -= var17;
									var16 = var17;
									break;
								}
							}
						}
					}

					var17 = -this.method8623(var6);

					for (var18 = var5; var18 < var15; ++var18) {
						var19 = (class454)this.field4982.get(var18);
						int var20 = this.method8590(var19, false);
						var19.field4987 = var17;
						var19.field4988 = var7;
						var17 += var20;
					}

					var5 = var15;
					var6 = var16;
					var7 += this.method8613();
					++var8;
				}

				var6 += !var10 ? var22 : 0;
			}

			if (this.field4974 != 0 && var4) {
				var9 = var8 * this.method8613();
				int var23 = this.method8648(var9);

				for (int var11 = 0; var11 < this.field4982.size(); ++var11) {
					class454 var12 = (class454)this.field4982.get(var11);
					var12.field4988 -= var23;
				}
			}

		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "745005956"
	)
	int method8626(int var1) {
		return var1 < this.field4982.size() ? this.method8590((class454)this.field4982.get(var1), false) : 0;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Lry;ZI)I",
		garbageValue = "2066509157"
	)
	int method8590(class454 var1, boolean var2) {
		if (var1.field4990 == '\n') {
			return 0;
		} else if (this.field4978 == 0) {
			int var3 = this.field4976.advances[var1.field4990];
			if (var3 == 0) {
				return var1.field4990 == '\t' ? this.field4976.advances[32] * 3 : this.field4976.advances[32];
			} else {
				return var3;
			}
		} else {
			return this.field4976.advances[42];
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(III)Lug;",
		garbageValue = "-722117838"
	)
	class541 method8628(int var1, int var2) {
		int var3 = Math.min(var1, var2);
		int var4 = Math.max(var1, var2);
		int var5 = this.field4982.size();
		if (var3 == 0 && var4 == var5) {
			return new class541(0, var5);
		} else {
			int var6 = this.method8629(var3, false);
			int var7 = this.method8595(var4, false);
			int var8;
			switch(this.field4974) {
			case 0:
				if (this.field4977 == 0) {
					return new class541(var6, var5);
				}

				var8 = this.method8629(var3, true);
				return new class541(var8, var5);
			case 1:
				return new class541(0, var5);
			case 2:
				if (this.field4977 == 2) {
					return new class541(0, var7);
				}

				var8 = this.method8595(var4, true);
				return new class541(0, var8);
			default:
				return new class541(0, var5);
			}
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "2066115166"
	)
	int method8629(int var1, boolean var2) {
		if (var1 < this.field4982.size()) {
			int var3 = ((class454)this.field4982.get(var1)).field4988;

			for (int var4 = var1; var4 > 0; --var4) {
				if (((class454)this.field4982.get(var4 - 1)).field4988 < var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((class454)this.field4982.get(var4 - 1)).field4988;
				}
			}
		}

		return 0;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "877330169"
	)
	int method8595(int var1, boolean var2) {
		if (var1 < this.field4982.size()) {
			int var3 = ((class454)this.field4982.get(var1)).field4988;

			for (int var4 = var1; var4 < this.field4982.size() - 1; ++var4) {
				if (((class454)this.field4982.get(var4 + 1)).field4988 > var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((class454)this.field4982.get(var4 + 1)).field4988;
				}
			}
		}

		return this.field4982.size();
	}
}
