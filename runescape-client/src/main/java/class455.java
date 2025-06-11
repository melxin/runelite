import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rk")
public class class455 {
	@ObfuscatedName("md")
	@ObfuscatedGetter(
		intValue = -120825281
	)
	@Export("cameraYaw")
	static int cameraYaw;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 524543263
	)
	int field5037;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -3681349
	)
	int field5032;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1153093675
	)
	int field5033;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -490292867
	)
	int field5030;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1744969267
	)
	int field5035;
	@ObfuscatedName("ao")
	boolean field5036;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lrl;"
	)
	AbstractFont field5038;
	@ObfuscatedName("ax")
	ArrayList field5025;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1553417037
	)
	int field5039;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -711471679
	)
	int field5040;

	public class455() {
		this.field5037 = Integer.MAX_VALUE;
		this.field5032 = Integer.MAX_VALUE;
		this.field5033 = 0;
		this.field5030 = 0;
		this.field5035 = 0;
		this.field5036 = true;
		this.field5025 = new ArrayList();
		this.field5039 = 0;
		this.field5040 = 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Lrj;",
		garbageValue = "1157310996"
	)
	public class457 method9067(int var1) {
		return (class457)this.field5025.get(var1);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Lrj;",
		garbageValue = "9"
	)
	class457 method8997() {
		return this.field5025.isEmpty() ? null : (class457)this.field5025.get(this.field5025.size() - 1);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1778849672"
	)
	public boolean method9064() {
		return this.field5025.isEmpty();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "437016950"
	)
	boolean method9049() {
		return this.field5032 > 1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1520861709"
	)
	public int method8946() {
		return this.field5025.size();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1725657163"
	)
	public String method9021() {
		if (this.method9064()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method8946());

			for (int var2 = 0; var2 < this.method8946(); ++var2) {
				class457 var3 = this.method9067(var2);
				var1.append(var3.field5045);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1551245128"
	)
	public void method8948(int var1) {
		if (this.field5040 != var1) {
			this.field5040 = var1;
			this.method8976();
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lrl;I)V",
		garbageValue = "693246299"
	)
	public void method8949(AbstractFont var1) {
		if (var1 != this.field5038) {
			this.field5038 = var1;
			if (this.field5038 != null) {
				if (this.field5035 == 0) {
					this.field5035 = this.field5038.ascent;
				}

				if (!this.method9064()) {
					this.method8976();
				}
			}
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1299513190"
	)
	public boolean method8942(int var1, int var2) {
		if (this.field5033 != var1 || var2 != this.field5030) {
			this.field5033 = var1;
			this.field5030 = var2;
			this.method8976();
		}

		return true;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1754332729"
	)
	public void method8951(int var1) {
		if (this.field5035 != var1) {
			this.field5035 = var1;
			this.method8976();
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)Lrs;",
		garbageValue = "-589457764"
	)
	public class459 method9058(int var1, int var2) {
		if (var2 == var1) {
			return new class459(this, 0, 0);
		} else if (var1 <= this.field5025.size() && var2 <= this.field5025.size()) {
			return var2 < var1 ? new class459(this, var2, var1) : new class459(this, var1, var2);
		} else {
			return new class459(this, 0, 0);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(CIII)Lrc;",
		garbageValue = "-507711323"
	)
	public class456 method8953(char var1, int var2, int var3) {
		return this.method9028(Character.toString(var1), var2, var3);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;III)Lrc;",
		garbageValue = "1154370351"
	)
	public class456 method9028(String var1, int var2, int var3) {
		if (var3 == 0) {
			var3 = Integer.MAX_VALUE;
		}

		int var4 = var2;
		if (this.field5025.size() >= var3) {
			this.method8977(var2, var2);
			return new class456(var2, true);
		} else {
			this.field5025.ensureCapacity(this.field5025.size() + var1.length());

			for (int var5 = 0; var5 < var1.length() && this.field5025.size() < var3; ++var5) {
				class457 var6 = new class457();
				var6.field5045 = var1.charAt(var5);
				this.field5025.add(var4, var6);
				++var4;
			}

			this.method8977(var2, var4);
			if (this.field5032 != 0 && this.method8965() > this.field5032) {
				while (var4 != var2) {
					--var4;
					this.method9045(var4);
					if (this.method8965() <= this.field5032) {
						break;
					}
				}

				return new class456(var4, true);
			} else {
				return new class456(var4, false);
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Lrc;",
		garbageValue = "2007970213"
	)
	class456 method8955(String var1, int var2) {
		return this.method9028(var1, this.field5025.size(), var2);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Lrc;",
		garbageValue = "25"
	)
	public class456 method8956(String var1) {
		this.method8957();
		return this.method8955(var1, 0);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-23"
	)
	void method8957() {
		this.field5025.clear();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "15"
	)
	public int method9045(int var1) {
		return this.method8959(var1, var1 + 1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-811850588"
	)
	public int method8959(int var1, int var2) {
		int var3;
		if (var2 < var1) {
			var3 = var2;
			var2 = var1;
			var1 = var3;
		}

		this.field5025.subList(var1, var2).clear();
		var3 = var1;
		if (this.method9049() && this.field5039 == 1) {
			while (var3 > 0) {
				--var3;
				char var4 = ((class457)this.field5025.get(var3)).field5045;
				if (var4 == ' ' || var4 == '\t') {
					break;
				}
			}
		}

		this.method8977(var3, var2);
		return var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1407334736"
	)
	public int method8960(int var1, int var2) {
		if (this.field5038 == null) {
			return 0;
		} else if (this.method9049() && var1 > this.field5037) {
			return this.field5025.size();
		} else {
			if (!this.field5025.isEmpty()) {
				for (int var3 = 0; var3 < this.field5025.size(); ++var3) {
					class457 var4 = (class457)this.field5025.get(var3);
					if (var2 <= var4.field5047 + this.method9036()) {
						if (var2 < var4.field5047) {
							break;
						}

						if (var1 < var4.field5046) {
							return var3 > 0 ? var3 - 1 : 0;
						}

						if (1 + var3 != this.field5025.size() && ((class457)this.field5025.get(var3 + 1)).field5047 != var4.field5047) {
							int var5 = this.method8979((class457)this.field5025.get(var3), false);
							if (var1 < var5 + var4.field5046) {
								return var3;
							}

							if (var2 <= var4.field5047 + this.method9036()) {
								return var3 + 1;
							}
						}
					}
				}

				class457 var6 = (class457)this.field5025.get(this.field5025.size() - 1);
				if (var1 >= var6.field5046 && var1 <= var6.field5046 + this.method8966() && var2 >= var6.field5047 && var2 <= var6.field5047 + this.method9036()) {
					return this.field5025.size() - 1;
				}
			}

			return this.field5025.size();
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1132980169"
	)
	public int method8961(int var1, int var2) {
		if (this.field5038 != null && !this.method9064() && var1 <= this.field5025.size()) {
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
				class457 var6 = (class457)this.field5025.get(var1 - 1);
				var4 = var6.field5046 + this.method9039(var1 - 1);
				var5 = var6.field5047;
			} else if (var3 == -1 && var1 == 0) {
				return 0;
			}

			int var14 = 16777215;
			int var7 = 0;
			int var8 = var1;
			int var9 = 16777215;
			int var10 = var3 == 1 ? this.field5025.size() + 1 : 0;

			for (int var11 = var3 + var1; var10 != var11; var11 += var3) {
				class457 var12 = (class457)this.field5025.get(var11 - 1);
				if (var5 != var12.field5047) {
					++var7;
					var5 = var12.field5047;
					if (var7 > var2) {
						return var8;
					}
				}

				if (var7 == var2) {
					int var13 = Math.abs(var12.field5046 + this.method9039(var11 - 1) - var4);
					if (var13 >= var9) {
						return var8;
					}

					var8 = var11;
					var9 = var13;
				}
			}

			if (var3 == 1) {
				return this.field5025.size();
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "43"
	)
	public int method8962() {
		if (!this.field5025.isEmpty() && this.method8965() == 1) {
			return this.field5025.isEmpty() ? 0 : ((class457)this.field5025.get(this.field5025.size() - 1)).field5046 + this.method8966();
		} else {
			int var1 = -1;
			int var2 = 0;

			for (int var3 = this.field5025.size() - 1; var3 >= 0; --var3) {
				class457 var4 = (class457)this.field5025.get(var3);
				if (var1 != var4.field5047) {
					int var5 = this.method8979(var4, false) + var4.field5046;
					var2 = Math.max(var5, var2);
					var1 = var4.field5047;
				}
			}

			return var2;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1042880717"
	)
	public int method8963() {
		return this.method9064() ? 0 : this.field5038.ascent + ((class457)this.field5025.get(this.field5025.size() - 1)).field5047;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2110778024"
	)
	public int method9036() {
		return this.field5035;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-1"
	)
	public int method8965() {
		return this.method8963() / this.field5038.ascent;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "549418137"
	)
	int method8966() {
		return this.method9064() ? 0 : this.method8979((class457)this.field5025.get(this.field5025.size() - 1), false);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2060107531"
	)
	public int method8967() {
		return this.field5037;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-570021849"
	)
	public void method9075(int var1) {
		if (this.field5038 != null && var1 < this.field5038.ascent * 2) {
			var1 = Integer.MAX_VALUE;
		}

		if (this.field5037 != var1) {
			this.field5037 = var1;
			this.method8976();
		}

	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1075653150"
	)
	public int method8969() {
		return this.field5032;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2045613499"
	)
	public void method8950(int var1) {
		if (this.field5032 != var1) {
			this.field5032 = var1;
			this.method8976();
		}

	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "964796220"
	)
	public int method8971() {
		return this.field5039;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1302098147"
	)
	public void method8954(int var1) {
		if (this.field5039 != var1) {
			this.field5039 = var1;
			this.method8976();
		}

	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1074436534"
	)
	public int method8964() {
		return this.field5040;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1313506582"
	)
	public int method8974(int var1) {
		switch(this.field5033) {
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

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "0"
	)
	public int method8991(int var1) {
		switch(this.field5030) {
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
		garbageValue = "-346087628"
	)
	void method8976() {
		this.method8977(0, this.field5025.size());
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2090612748"
	)
	void method8977(int var1, int var2) {
		if (!this.method9064() && this.field5038 != null) {
			class547 var3 = this.method8980(var1, var2);
			boolean var4 = (Integer)var3.field5539 == 0 && (Integer)var3.field5538 == this.field5025.size();
			int var5 = (Integer)var3.field5539;
			int var6 = 0;
			int var7 = var4 ? 0 : ((class457)this.field5025.get((Integer)var3.field5539)).field5047;
			int var8 = 0;

			int var9;
			for (var9 = (Integer)var3.field5539; var9 <= (Integer)var3.field5538; ++var9) {
				boolean var10 = var9 >= this.field5025.size();
				class457 var21 = (class457)this.field5025.get(!var10 ? var9 : this.field5025.size() - 1);
				int var22 = !var10 ? this.method8979(var21, false) : 0;
				boolean var13 = !var10 && var21.field5045 == '\n';
				boolean var14 = !var10 && this.method9049() && var6 + var22 > this.field5037;
				if (var13 || var14 || var10) {
					int var15 = var9;
					int var16 = 0;
					int var17;
					int var18;
					class457 var19;
					if (var14) {
						var17 = 0;
						if (this.field5039 == 1) {
							for (var18 = var9; var18 > var5; --var18) {
								var19 = (class457)this.field5025.get(var18);
								var17 += var18 < var15 ? this.method8979(var19, false) : 0;
								if (var19.field5045 == ' ' || var19.field5045 == '\n') {
									var15 = var18;
									var6 -= var17;
									var16 = var17;
									break;
								}
							}
						}
					}

					var17 = -this.method8974(var6);

					for (var18 = var5; var18 < var15; ++var18) {
						var19 = (class457)this.field5025.get(var18);
						int var20 = this.method8979(var19, false);
						var19.field5046 = var17;
						var19.field5047 = var7;
						var17 += var20;
					}

					var5 = var15;
					var6 = var16;
					var7 += this.method9036();
					++var8;
				}

				var6 += !var10 ? var22 : 0;
			}

			if (this.field5030 != 0 && var4) {
				var9 = var8 * this.method9036();
				int var23 = this.method8991(var9);

				for (int var11 = 0; var11 < this.field5025.size(); ++var11) {
					class457 var12 = (class457)this.field5025.get(var11);
					var12.field5047 -= var23;
				}
			}

		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1155230731"
	)
	int method9039(int var1) {
		return var1 < this.field5025.size() ? this.method8979((class457)this.field5025.get(var1), false) : 0;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lrj;ZI)I",
		garbageValue = "469474347"
	)
	int method8979(class457 var1, boolean var2) {
		if (var1.field5045 == '\n') {
			return 0;
		} else if (this.field5040 == 0) {
			int var3 = this.field5038.advances[var1.field5045];
			if (var3 == 0) {
				return var1.field5045 == '\t' ? this.field5038.advances[32] * 3 : this.field5038.advances[32];
			} else {
				return var3;
			}
		} else {
			return this.field5038.advances[42];
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(III)Lvk;",
		garbageValue = "-2030242776"
	)
	class547 method8980(int var1, int var2) {
		int var3 = Math.min(var1, var2);
		int var4 = Math.max(var1, var2);
		int var5 = this.field5025.size();
		if (var3 == 0 && var4 == var5) {
			return new class547(0, var5);
		} else {
			int var6 = this.method9000(var3, false);
			int var7 = this.method8982(var4, false);
			int var8;
			switch(this.field5030) {
			case 0:
				if (this.field5033 == 0) {
					return new class547(var6, var5);
				}

				var8 = this.method9000(var3, true);
				return new class547(var8, var5);
			case 1:
				return new class547(0, var5);
			case 2:
				if (this.field5033 == 2) {
					return new class547(0, var7);
				}

				var8 = this.method8982(var4, true);
				return new class547(0, var8);
			default:
				return new class547(0, var5);
			}
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "1201326832"
	)
	int method9000(int var1, boolean var2) {
		if (var1 < this.field5025.size()) {
			int var3 = ((class457)this.field5025.get(var1)).field5047;

			for (int var4 = var1; var4 > 0; --var4) {
				if (((class457)this.field5025.get(var4 - 1)).field5047 < var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((class457)this.field5025.get(var4 - 1)).field5047;
				}
			}
		}

		return 0;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "-1182384931"
	)
	int method8982(int var1, boolean var2) {
		if (var1 < this.field5025.size()) {
			int var3 = ((class457)this.field5025.get(var1)).field5047;

			for (int var4 = var1; var4 < this.field5025.size() - 1; ++var4) {
				if (((class457)this.field5025.get(var4 + 1)).field5047 > var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((class457)this.field5025.get(var4 + 1)).field5047;
				}
			}
		}

		return this.field5025.size();
	}
}
