import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sf")
public class class470 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1814666751
	)
	int field5310;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1837761111
	)
	int field5311;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 2087280121
	)
	int field5312;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1427880679
	)
	int field5313;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 2134183747
	)
	int field5302;
	@ObfuscatedName("al")
	boolean field5315;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	AbstractFont field5316;
	@ObfuscatedName("am")
	ArrayList field5306;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -687509261
	)
	int field5318;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -545090629
	)
	int field5317;

	public class470() {
		this.field5310 = Integer.MAX_VALUE;
		this.field5311 = Integer.MAX_VALUE;
		this.field5312 = 0;
		this.field5313 = 0;
		this.field5302 = 0;
		this.field5315 = true;
		this.field5306 = new ArrayList();
		this.field5318 = 0;
		this.field5317 = 0;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)Lsw;",
		garbageValue = "27"
	)
	public class472 method9573(int var1) {
		return (class472)this.field5306.get(var1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Lsw;",
		garbageValue = "1409226611"
	)
	class472 method9574() {
		return this.field5306.isEmpty() ? null : (class472)this.field5306.get(this.field5306.size() - 1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "55"
	)
	public boolean method9575() {
		return this.field5306.isEmpty();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-338765145"
	)
	boolean method9615() {
		return this.field5311 > 1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-198914825"
	)
	public int method9660() {
		return this.field5306.size();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-1"
	)
	public String method9578() {
		if (this.method9575()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method9660());

			for (int var2 = 0; var2 < this.method9660(); ++var2) {
				class472 var3 = this.method9573(var2);
				var1.append(var3.field5322);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-19585918"
	)
	public void method9572(int var1) {
		if (this.field5317 != var1) {
			this.field5317 = var1;
			this.method9624();
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lsl;S)V",
		garbageValue = "356"
	)
	public void method9595(AbstractFont var1) {
		if (var1 != this.field5316) {
			this.field5316 = var1;
			if (this.field5316 != null) {
				if (this.field5302 == 0) {
					this.field5302 = this.field5316.ascent;
				}

				if (!this.method9575()) {
					this.method9624();
				}
			}
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-922358963"
	)
	public boolean method9656(int var1, int var2) {
		if (this.field5312 != var1 || var2 != this.field5313) {
			this.field5312 = var1;
			this.field5313 = var2;
			this.method9624();
		}

		return true;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1091899234"
	)
	public void method9582(int var1) {
		if (this.field5302 != var1) {
			this.field5302 = var1;
			this.method9624();
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)Lsi;",
		garbageValue = "-1653331283"
	)
	public class474 method9655(int var1, int var2) {
		if (var2 == var1) {
			return new class474(this, 0, 0);
		} else if (var1 <= this.field5306.size() && var2 <= this.field5306.size()) {
			return var2 < var1 ? new class474(this, var2, var1) : new class474(this, var1, var2);
		} else {
			return new class474(this, 0, 0);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(CIIB)Lsc;",
		garbageValue = "-105"
	)
	public class471 method9584(char var1, int var2, int var3) {
		return this.method9671(Character.toString(var1), var2, var3);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;III)Lsc;",
		garbageValue = "2067996284"
	)
	public class471 method9671(String var1, int var2, int var3) {
		if (var3 == 0) {
			var3 = Integer.MAX_VALUE;
		}

		int var4 = var2;
		if (this.field5306.size() >= var3) {
			this.method9608(var2, var2);
			return new class471(var2, true);
		} else {
			this.field5306.ensureCapacity(this.field5306.size() + var1.length());

			for (int var5 = 0; var5 < var1.length() && this.field5306.size() < var3; ++var5) {
				class472 var6 = new class472();
				var6.field5322 = var1.charAt(var5);
				this.field5306.add(var4, var6);
				++var4;
			}

			this.method9608(var2, var4);
			if (this.field5311 != 0 && this.method9596() > this.field5311) {
				while (var4 != var2) {
					--var4;
					this.method9589(var4);
					if (this.method9596() <= this.field5311) {
						break;
					}
				}

				return new class471(var4, true);
			} else {
				return new class471(var4, false);
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Lsc;",
		garbageValue = "1948788126"
	)
	class471 method9586(String var1, int var2) {
		return this.method9671(var1, this.field5306.size(), var2);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lsc;",
		garbageValue = "-238156366"
	)
	public class471 method9591(String var1) {
		this.method9588();
		return this.method9586(var1, 0);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-59"
	)
	void method9588() {
		this.field5306.clear();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "21"
	)
	public int method9589(int var1) {
		return this.method9590(var1, var1 + 1);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "2036214745"
	)
	public int method9590(int var1, int var2) {
		int var3;
		if (var2 < var1) {
			var3 = var2;
			var2 = var1;
			var1 = var3;
		}

		this.field5306.subList(var1, var2).clear();
		var3 = var1;
		if (this.method9615() && this.field5318 == 1) {
			while (var3 > 0) {
				--var3;
				char var4 = ((class472)this.field5306.get(var3)).field5322;
				if (var4 == ' ' || var4 == '\t') {
					break;
				}
			}
		}

		this.method9608(var3, var2);
		return var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "43"
	)
	public int method9659(int var1, int var2) {
		if (this.field5316 == null) {
			return 0;
		} else if (this.method9615() && var1 > this.field5310) {
			return this.field5306.size();
		} else {
			if (!this.field5306.isEmpty()) {
				for (int var3 = 0; var3 < this.field5306.size(); ++var3) {
					class472 var4 = (class472)this.field5306.get(var3);
					if (var2 <= var4.field5323 + this.method9629()) {
						if (var2 < var4.field5323) {
							break;
						}

						if (var1 < var4.field5324) {
							return var3 > 0 ? var3 - 1 : 0;
						}

						if (1 + var3 != this.field5306.size() && ((class472)this.field5306.get(1 + var3)).field5323 != var4.field5323) {
							int var5 = this.method9610((class472)this.field5306.get(var3), false);
							if (var1 < var5 + var4.field5324) {
								return var3;
							}

							if (var2 <= var4.field5323 + this.method9629()) {
								return var3 + 1;
							}
						}
					}
				}

				class472 var6 = (class472)this.field5306.get(this.field5306.size() - 1);
				if (var1 >= var6.field5324 && var1 <= var6.field5324 + this.method9597() && var2 >= var6.field5323 && var2 <= var6.field5323 + this.method9629()) {
					return this.field5306.size() - 1;
				}
			}

			return this.field5306.size();
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "0"
	)
	public int method9592(int var1, int var2) {
		if (this.field5316 != null && !this.method9575() && var1 <= this.field5306.size()) {
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
				class472 var6 = (class472)this.field5306.get(var1 - 1);
				var4 = var6.field5324 + this.method9602(var1 - 1);
				var5 = var6.field5323;
			} else if (var3 == -1 && var1 == 0) {
				return 0;
			}

			int var14 = 16777215;
			int var7 = 0;
			int var8 = var1;
			int var9 = 16777215;
			int var10 = var3 == 1 ? this.field5306.size() + 1 : 0;

			for (int var11 = var3 + var1; var10 != var11; var11 += var3) {
				class472 var12 = (class472)this.field5306.get(var11 - 1);
				if (var5 != var12.field5323) {
					++var7;
					var5 = var12.field5323;
					if (var7 > var2) {
						return var8;
					}
				}

				if (var7 == var2) {
					int var13 = Math.abs(var12.field5324 + this.method9602(var11 - 1) - var4);
					if (var13 >= var9) {
						return var8;
					}

					var8 = var11;
					var9 = var13;
				}
			}

			if (var3 == 1) {
				return this.field5306.size();
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-434302836"
	)
	public int method9593() {
		if (!this.field5306.isEmpty() && this.method9596() == 1) {
			return this.field5306.isEmpty() ? 0 : ((class472)this.field5306.get(this.field5306.size() - 1)).field5324 + this.method9597();
		} else {
			int var1 = -1;
			int var2 = 0;

			for (int var3 = this.field5306.size() - 1; var3 >= 0; --var3) {
				class472 var4 = (class472)this.field5306.get(var3);
				if (var1 != var4.field5323) {
					int var5 = this.method9610(var4, false) + var4.field5324;
					var2 = Math.max(var5, var2);
					var1 = var4.field5323;
				}
			}

			return var2;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "46"
	)
	public int method9594() {
		return this.method9575() ? 0 : this.field5316.ascent + ((class472)this.field5306.get(this.field5306.size() - 1)).field5323;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "36"
	)
	public int method9629() {
		return this.field5302;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1836721085"
	)
	public int method9596() {
		return this.method9594() / this.field5316.ascent;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "255"
	)
	int method9597() {
		return this.method9575() ? 0 : this.method9610((class472)this.field5306.get(this.field5306.size() - 1), false);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "16256"
	)
	public int method9598() {
		return this.field5310;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-369216879"
	)
	public void method9599(int var1) {
		if (this.field5316 != null && var1 < this.field5316.ascent * 2) {
			var1 = Integer.MAX_VALUE;
		}

		if (this.field5310 != var1) {
			this.field5310 = var1;
			this.method9624();
		}

	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1180180008"
	)
	public int method9600() {
		return this.field5311;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "725897664"
	)
	public void method9601(int var1) {
		if (this.field5311 != var1) {
			this.field5311 = var1;
			this.method9624();
		}

	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "720263077"
	)
	public int method9614() {
		return this.field5318;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1668865275"
	)
	public void method9677(int var1) {
		if (this.field5318 != var1) {
			this.field5318 = var1;
			this.method9624();
		}

	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1093047458"
	)
	public int method9604() {
		return this.field5317;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-86"
	)
	public int method9649(int var1) {
		switch(this.field5312) {
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

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-364225098"
	)
	public int method9606(int var1) {
		switch(this.field5313) {
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

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1987237432"
	)
	void method9624() {
		this.method9608(0, this.field5306.size());
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-176298461"
	)
	void method9608(int var1, int var2) {
		if (!this.method9575() && this.field5316 != null) {
			class569 var3 = this.method9689(var1, var2);
			boolean var4 = (Integer)var3.field5876 == 0 && (Integer)var3.field5875 == this.field5306.size();
			int var5 = (Integer)var3.field5876;
			int var6 = 0;
			int var7 = var4 ? 0 : ((class472)this.field5306.get((Integer)var3.field5876)).field5323;
			int var8 = 0;

			int var9;
			for (var9 = (Integer)var3.field5876; var9 <= (Integer)var3.field5875; ++var9) {
				boolean var10 = var9 >= this.field5306.size();
				class472 var21 = (class472)this.field5306.get(!var10 ? var9 : this.field5306.size() - 1);
				int var22 = !var10 ? this.method9610(var21, false) : 0;
				boolean var13 = !var10 && var21.field5322 == '\n';
				boolean var14 = !var10 && this.method9615() && var6 + var22 > this.field5310;
				if (var13 || var14 || var10) {
					int var15 = var9;
					int var16 = 0;
					int var17;
					int var18;
					class472 var19;
					if (var14) {
						var17 = 0;
						if (this.field5318 == 1) {
							for (var18 = var9; var18 > var5; --var18) {
								var19 = (class472)this.field5306.get(var18);
								var17 += var18 < var15 ? this.method9610(var19, false) : 0;
								if (var19.field5322 == ' ' || var19.field5322 == '\n') {
									var15 = var18;
									var6 -= var17;
									var16 = var17;
									break;
								}
							}
						}
					}

					var17 = -this.method9649(var6);

					for (var18 = var5; var18 < var15; ++var18) {
						var19 = (class472)this.field5306.get(var18);
						int var20 = this.method9610(var19, false);
						var19.field5324 = var17;
						var19.field5323 = var7;
						var17 += var20;
					}

					var5 = var15;
					var6 = var16;
					var7 += this.method9629();
					++var8;
				}

				var6 += !var10 ? var22 : 0;
			}

			if (this.field5313 != 0 && var4) {
				var9 = var8 * this.method9629();
				int var23 = this.method9606(var9);

				for (int var11 = 0; var11 < this.field5306.size(); ++var11) {
					class472 var12 = (class472)this.field5306.get(var11);
					var12.field5323 -= var23;
				}
			}

		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-597883185"
	)
	int method9602(int var1) {
		return var1 < this.field5306.size() ? this.method9610((class472)this.field5306.get(var1), false) : 0;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lsw;ZB)I",
		garbageValue = "8"
	)
	int method9610(class472 var1, boolean var2) {
		if (var1.field5322 == '\n') {
			return 0;
		} else if (this.field5317 == 0) {
			int var3 = this.field5316.advances[var1.field5322];
			if (var3 == 0) {
				return var1.field5322 == '\t' ? this.field5316.advances[32] * 3 : this.field5316.advances[32];
			} else {
				return var3;
			}
		} else {
			return this.field5316.advances[42];
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(III)Lvp;",
		garbageValue = "1573774560"
	)
	class569 method9689(int var1, int var2) {
		int var3 = Math.min(var1, var2);
		int var4 = Math.max(var1, var2);
		int var5 = this.field5306.size();
		if (var3 == 0 && var4 == var5) {
			return new class569(0, var5);
		} else {
			int var6 = this.method9612(var3, false);
			int var7 = this.method9613(var4, false);
			int var8;
			switch(this.field5313) {
			case 0:
				if (this.field5312 == 0) {
					return new class569(var6, var5);
				}

				var8 = this.method9612(var3, true);
				return new class569(var8, var5);
			case 1:
				return new class569(0, var5);
			case 2:
				if (this.field5312 == 2) {
					return new class569(0, var7);
				}

				var8 = this.method9613(var4, true);
				return new class569(0, var8);
			default:
				return new class569(0, var5);
			}
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "-1415235818"
	)
	int method9612(int var1, boolean var2) {
		if (var1 < this.field5306.size()) {
			int var3 = ((class472)this.field5306.get(var1)).field5323;

			for (int var4 = var1; var4 > 0; --var4) {
				if (((class472)this.field5306.get(var4 - 1)).field5323 < var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((class472)this.field5306.get(var4 - 1)).field5323;
				}
			}
		}

		return 0;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(IZB)I",
		garbageValue = "-73"
	)
	int method9613(int var1, boolean var2) {
		if (var1 < this.field5306.size()) {
			int var3 = ((class472)this.field5306.get(var1)).field5323;

			for (int var4 = var1; var4 < this.field5306.size() - 1; ++var4) {
				if (((class472)this.field5306.get(var4 + 1)).field5323 > var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((class472)this.field5306.get(var4 + 1)).field5323;
				}
			}
		}

		return this.field5306.size();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-19618711"
	)
	public static int method9686(int var0, int var1, int var2) {
		if (var1 < var0) {
			throw new IllegalArgumentException("max: " + var1 + " can not be lower than min: " + var0);
		} else {
			return Math.max(var0, Math.min(var2, var1));
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ldd;I)V",
		garbageValue = "-1588902870"
	)
	static final void method9712(WorldView var0) {
		int var1 = var0.sizeX;
		int var2 = var0.sizeY;
		int[][][] var3 = var0.tileHeights;
		byte[][][] var4 = var0.tileSettings;
		Scene var5 = var0.scene;
		CollisionMap[] var6 = var0.collisionMaps;

		int var7;
		int var8;
		for (var7 = 0; var7 < 4; ++var7) {
			for (var8 = 0; var8 < var1; ++var8) {
				for (int var9 = 0; var9 < var2; ++var9) {
					if ((var0.tileSettings[var7][var8][var9] & 1) == 1) {
						int var10 = var7;
						if ((var0.tileSettings[1][var8][var9] & 2) == 2) {
							var10 = var7 - 1;
						}

						if (var10 >= 0 && var6 != null) {
							var6[var10].setBlockedByFloor(var8, var9);
						}
					}
				}
			}
		}

		Tiles.rndHue += (int)(Math.random() * 5.0D) - 2;
		if (Tiles.rndHue < -8) {
			Tiles.rndHue = -8;
		}

		if (Tiles.rndHue > 8) {
			Tiles.rndHue = 8;
		}

		Tiles.rndLightness += (int)(Math.random() * 5.0D) - 2;
		if (Tiles.rndLightness < -16) {
			Tiles.rndLightness = -16;
		}

		if (Tiles.rndLightness > 16) {
			Tiles.rndLightness = 16;
		}

		for (var7 = 0; var7 < 4; ++var7) {
			byte[][] var48 = Tiles.Tiles_underlays2[var7];
			boolean var55 = true;
			boolean var56 = true;
			boolean var11 = true;
			boolean var12 = true;
			boolean var13 = true;
			int var14 = (int)Math.sqrt(5100.0D);
			int var15 = var14 * 768 >> 8;

			int var16;
			int var17;
			int var19;
			int var20;
			int var21;
			int var22;
			int var23;
			int var24;
			int var25;
			int var49;
			for (var16 = 1; var16 < var2 - 1; ++var16) {
				for (var17 = 1; var17 < var1 - 1; ++var17) {
					var49 = var3[var7][var17 + 1][var16] - var3[var7][var17 - 1][var16];
					var19 = var3[var7][var17][var16 + 1] - var3[var7][var17][var16 - 1];
					var20 = (int)Math.sqrt((double)(var49 * var49 + var19 * var19 + 65536));
					var21 = (var49 << 8) / var20;
					var22 = 65536 / var20;
					var23 = (var19 << 8) / var20;
					var24 = (var23 * -50 + var21 * -50 + var22 * -10) / var15 + 96;
					var25 = (var48[var17][var16 + 1] >> 3) + (var48[var17 - 1][var16] >> 2) + (var48[var17][var16 - 1] >> 2) + (var48[var17 + 1][var16] >> 3) + (var48[var17][var16] >> 1);
					MouseRecorder.field868[var17][var16] = var24 - var25;
				}
			}

			for (var16 = 0; var16 < var2; ++var16) {
				WorldMapSectionType.Tiles_hue[var16] = 0;
				class565.Tiles_saturation[var16] = 0;
				class67.Tiles_lightness[var16] = 0;
				class161.Tiles_hueMultiplier[var16] = 0;
				class154.field1785[var16] = 0;
			}

			for (var16 = -5; var16 < var1 + 5; ++var16) {
				int[] var10000;
				for (var17 = 0; var17 < var2; ++var17) {
					var49 = var16 + 5;
					int var10002;
					if (var49 >= 0 && var49 < var1) {
						var19 = (int)InvDefinition.method4280(15);
						var20 = class33.Tiles_underlays[var7][var49][var17] & var19;
						if (var20 > 0) {
							var22 = var20 - 1;
							FloorUnderlayDefinition var50 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var22);
							FloorUnderlayDefinition var52;
							if (var50 != null) {
								var52 = var50;
							} else {
								byte[] var51 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var22);
								var50 = new FloorUnderlayDefinition();
								if (var51 != null) {
									var50.decode(new Buffer(var51), var22);
								}

								var50.postDecode();
								FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var50, (long)var22);
								var52 = var50;
							}

							var10000 = WorldMapSectionType.Tiles_hue;
							var10000[var17] += var52.hue;
							var10000 = class565.Tiles_saturation;
							var10000[var17] += var52.saturation;
							var10000 = class67.Tiles_lightness;
							var10000[var17] += var52.lightness;
							var10000 = class161.Tiles_hueMultiplier;
							var10000[var17] += var52.hueMultiplier;
							var10002 = class154.field1785[var17]++;
						}
					}

					var19 = var16 - 5;
					if (var19 >= 0 && var19 < var1) {
						var20 = (int)InvDefinition.method4280(15);
						var21 = class33.Tiles_underlays[var7][var19][var17] & var20;
						if (var21 > 0) {
							var23 = var21 - 1;
							FloorUnderlayDefinition var59 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var23);
							FloorUnderlayDefinition var54;
							if (var59 != null) {
								var54 = var59;
							} else {
								byte[] var53 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var23);
								var59 = new FloorUnderlayDefinition();
								if (var53 != null) {
									var59.decode(new Buffer(var53), var23);
								}

								var59.postDecode();
								FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var59, (long)var23);
								var54 = var59;
							}

							var10000 = WorldMapSectionType.Tiles_hue;
							var10000[var17] -= var54.hue;
							var10000 = class565.Tiles_saturation;
							var10000[var17] -= var54.saturation;
							var10000 = class67.Tiles_lightness;
							var10000[var17] -= var54.lightness;
							var10000 = class161.Tiles_hueMultiplier;
							var10000[var17] -= var54.hueMultiplier;
							var10002 = class154.field1785[var17]--;
						}
					}
				}

				if (var16 >= 1 && var16 < var1 - 1) {
					var17 = 0;
					var49 = 0;
					var19 = 0;
					var20 = 0;
					var21 = 0;

					for (var22 = -5; var22 < var2 + 5; ++var22) {
						var23 = var22 + 5;
						if (var23 >= 0 && var23 < var2) {
							var17 += WorldMapSectionType.Tiles_hue[var23];
							var49 += class565.Tiles_saturation[var23];
							var19 += class67.Tiles_lightness[var23];
							var20 += class161.Tiles_hueMultiplier[var23];
							var21 += class154.field1785[var23];
						}

						var24 = var22 - 5;
						if (var24 >= 0 && var24 < var2) {
							var17 -= WorldMapSectionType.Tiles_hue[var24];
							var49 -= class565.Tiles_saturation[var24];
							var19 -= class67.Tiles_lightness[var24];
							var20 -= class161.Tiles_hueMultiplier[var24];
							var21 -= class154.field1785[var24];
						}

						if (var22 >= 1 && var22 < var2 - 1 && (!Client.isLowDetail || (var4[0][var16][var22] & 2) != 0 || (var4[var7][var16][var22] & 16) == 0)) {
							if (var7 < Tiles.Tiles_minPlane) {
								Tiles.Tiles_minPlane = var7;
							}

							var25 = (int)InvDefinition.method4280(15);
							int var26 = class33.Tiles_underlays[var7][var16][var22] & var25;
							int var27 = class623.Tiles_overlays[var7][var16][var22] & var25;
							if (var26 > 0 || var27 > 0) {
								int var28 = var3[var7][var16][var22];
								int var29 = var3[var7][var16 + 1][var22];
								int var30 = var3[var7][var16 + 1][var22 + 1];
								int var31 = var3[var7][var16][var22 + 1];
								int var32 = MouseRecorder.field868[var16][var22];
								int var33 = MouseRecorder.field868[var16 + 1][var22];
								int var34 = MouseRecorder.field868[var16 + 1][var22 + 1];
								int var35 = MouseRecorder.field868[var16][var22 + 1];
								int var36 = -1;
								int var37 = -1;
								int var38;
								int var39;
								if (var26 > 0) {
									var38 = var17 * 256 / var20;
									var39 = var49 / var21;
									int var40 = var19 / var21;
									var36 = class39.method817(var38, var39, var40);
									var38 = var38 + Tiles.rndHue & 255;
									var40 += Tiles.rndLightness;
									if (var40 < 0) {
										var40 = 0;
									} else if (var40 > 255) {
										var40 = 255;
									}

									var37 = class39.method817(var38, var39, var40);
								}

								if (var7 > 0) {
									boolean var57 = true;
									if (var26 == 0 && class200.Tiles_shapes[var7][var16][var22] != 0) {
										var57 = false;
									}

									if (var27 > 0 && !class189.method4415(var27 - 1).hideUnderlay) {
										var57 = false;
									}

									if (var57 && var28 == var29 && var30 == var28 && var28 == var31) {
										var10000 = class148.field1747[var7][var16];
										var10000[var22] |= 2340;
									}
								}

								var38 = 0;
								if (var37 != -1) {
									var38 = Rasterizer3D.Rasterizer3D_colorPalette[class57.method2086(var37, 96)];
								}

								if (var27 == 0) {
									var5.addTile(var7, var16, var22, 0, 0, -1, var28, var29, var30, var31, class57.method2086(var36, var32), class57.method2086(var36, var33), class57.method2086(var36, var34), class57.method2086(var36, var35), 0, 0, 0, 0, var38, 0);
								} else {
									var39 = class200.Tiles_shapes[var7][var16][var22] + 1;
									byte var58 = HttpRequest.field49[var7][var16][var22];
									FloorOverlayDefinition var41 = class189.method4415(var27 - 1);
									int var42 = var41.texture;
									int var43;
									int var44;
									int var45;
									int var46;
									if (var42 >= 0) {
										var44 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var42);
										var43 = -1;
									} else if (var41.primaryRgb == 16711935) {
										var43 = -2;
										var42 = -1;
										var44 = -2;
									} else {
										var43 = class39.method817(var41.hue, var41.saturation, var41.lightness);
										var45 = var41.hue + Tiles.rndHue & 255;
										var46 = var41.lightness + Tiles.rndLightness;
										if (var46 < 0) {
											var46 = 0;
										} else if (var46 > 255) {
											var46 = 255;
										}

										var44 = class39.method817(var45, var41.saturation, var46);
									}

									var45 = 0;
									if (var44 != -2) {
										var45 = Rasterizer3D.Rasterizer3D_colorPalette[class212.method4685(var44, 96)];
									}

									if (var41.secondaryRgb != -1) {
										var46 = var41.secondaryHue + Tiles.rndHue & 255;
										int var47 = var41.secondaryLightness + Tiles.rndLightness;
										if (var47 < 0) {
											var47 = 0;
										} else if (var47 > 255) {
											var47 = 255;
										}

										var44 = class39.method817(var46, var41.secondarySaturation, var47);
										var45 = Rasterizer3D.Rasterizer3D_colorPalette[class212.method4685(var44, 96)];
									}

									var5.addTile(var7, var16, var22, var39, var58, var42, var28, var29, var30, var31, class57.method2086(var36, var32), class57.method2086(var36, var33), class57.method2086(var36, var34), class57.method2086(var36, var35), class212.method4685(var43, var32), class212.method4685(var43, var33), class212.method4685(var43, var34), class212.method4685(var43, var35), var38, var45);
								}
							}
						}
					}
				}
			}

			for (var16 = 1; var16 < var2 - 1; ++var16) {
				for (var17 = 1; var17 < var1 - 1; ++var17) {
					if ((var0.tileSettings[var7][var17][var16] & 8) != 0) {
						var22 = 0;
					} else if (var7 > 0 && (var0.tileSettings[1][var17][var16] & 2) != 0) {
						var22 = var7 - 1;
					} else {
						var22 = var7;
					}

					var5.setTileMinPlane(var7, var17, var16, var22);
				}
			}

			class33.Tiles_underlays[var7] = null;
			class623.Tiles_overlays[var7] = null;
			class200.Tiles_shapes[var7] = null;
			HttpRequest.field49[var7] = null;
			Tiles.Tiles_underlays2[var7] = null;
		}

		var5.method5585(-50, -10, -50);

		for (var7 = 0; var7 < var1; ++var7) {
			for (var8 = 0; var8 < var2; ++var8) {
				if ((var4[1][var7][var8] & 2) == 2) {
					var5.setLinkBelow(var7, var8);
				}
			}
		}

		if (var0.method2791()) {
			HttpResponse.method313(var0);
		}

	}
}
