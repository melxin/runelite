import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
public class class133 {
	@ObfuscatedName("eu")
	@ObfuscatedGetter(
		longValue = -3173905978490896003L
	)
	static long field1548;
	@ObfuscatedName("ia")
	@ObfuscatedGetter(
		intValue = 1178667793
	)
	static int field1554;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 426911859
	)
	public final int field1553;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	public class133 field1541;
	@ObfuscatedName("az")
	float[][] field1546;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lqe;"
	)
	final TransformationMatrix[] field1543;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[Lqe;"
	)
	TransformationMatrix[] field1544;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lqe;"
	)
	TransformationMatrix[] field1545;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	TransformationMatrix field1540;
	@ObfuscatedName("ax")
	boolean field1547;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	TransformationMatrix field1542;
	@ObfuscatedName("ac")
	boolean field1549;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	TransformationMatrix field1550;
	@ObfuscatedName("as")
	float[][] field1556;
	@ObfuscatedName("aq")
	float[][] field1551;
	@ObfuscatedName("af")
	float[][] field1552;

	@ObfuscatedSignature(
		descriptor = "(ILvy;Z)V"
	)
	public class133(int var1, Buffer var2, boolean var3) {
		this.field1540 = new TransformationMatrix();
		this.field1547 = true;
		this.field1542 = new TransformationMatrix();
		this.field1549 = true;
		this.field1550 = new TransformationMatrix();
		this.field1553 = var2.readShort();
		this.field1543 = new TransformationMatrix[var1];
		this.field1544 = new TransformationMatrix[this.field1543.length];
		this.field1545 = new TransformationMatrix[this.field1543.length];
		this.field1546 = new float[this.field1543.length][3];

		for (int var4 = 0; var4 < this.field1543.length; ++var4) {
			this.field1543[var4] = new TransformationMatrix(var2, var3);
			this.field1546[var4][0] = var2.method10302();
			this.field1546[var4][1] = var2.method10302();
			this.field1546[var4][2] = var2.method10302();
		}

		this.method3396();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2110556102"
	)
	void method3396() {
		this.field1556 = new float[this.field1543.length][3];
		this.field1551 = new float[this.field1543.length][3];
		this.field1552 = new float[this.field1543.length][3];
		TransformationMatrix var1 = AbstractWorldMapData.method6389();

		for (int var2 = 0; var2 < this.field1543.length; ++var2) {
			TransformationMatrix var3 = this.method3397(var2);
			var1.method8374(var3);
			var1.method8383();
			this.field1556[var2] = var1.method8406();
			this.field1551[var2][0] = var3.field4761[12];
			this.field1551[var2][1] = var3.field4761[13];
			this.field1551[var2][2] = var3.field4761[14];
			this.field1552[var2] = var3.method8391();
		}

		var1.method8373();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqe;",
		garbageValue = "64"
	)
	TransformationMatrix method3397(int var1) {
		return this.field1543[var1];
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Lqe;",
		garbageValue = "-2146983541"
	)
	TransformationMatrix method3437(int var1) {
		if (this.field1544[var1] == null) {
			this.field1544[var1] = new TransformationMatrix(this.method3397(var1));
			if (this.field1541 != null) {
				this.field1544[var1].method8389(this.field1541.method3437(var1));
			} else {
				this.field1544[var1].method8389(TransformationMatrix.field4762);
			}
		}

		return this.field1544[var1];
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Lqe;",
		garbageValue = "-1015358600"
	)
	TransformationMatrix method3425(int var1) {
		if (this.field1545[var1] == null) {
			this.field1545[var1] = new TransformationMatrix(this.method3437(var1));
			this.field1545[var1].method8383();
		}

		return this.field1545[var1];
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lqe;I)V",
		garbageValue = "-1079733838"
	)
	void method3400(TransformationMatrix var1) {
		this.field1540.method8374(var1);
		this.field1547 = true;
		this.field1549 = true;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Lqe;",
		garbageValue = "68"
	)
	TransformationMatrix method3401() {
		return this.field1540;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lqe;",
		garbageValue = "-950874663"
	)
	TransformationMatrix method3398() {
		if (this.field1547) {
			this.field1542.method8374(this.method3401());
			if (this.field1541 != null) {
				this.field1542.method8389(this.field1541.method3398());
			}

			this.field1547 = false;
		}

		return this.field1542;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Lqe;",
		garbageValue = "370449324"
	)
	public TransformationMatrix method3403(int var1) {
		if (this.field1549) {
			this.field1550.method8374(this.method3425(var1));
			this.field1550.method8389(this.method3398());
			this.field1549 = false;
		}

		return this.field1550;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-1186746109"
	)
	float[] method3402(int var1) {
		return this.field1556[var1];
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-1901188305"
	)
	float[] method3410(int var1) {
		return this.field1551[var1];
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-1731594469"
	)
	float[] method3406(int var1) {
		return this.field1552[var1];
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)I",
		garbageValue = "24"
	)
	public static int method3426(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) {
			int var6 = var3;
			var3 = var4;
			var4 = var6;
		}

		var2 &= 3;
		if (var2 == 0) {
			return var0;
		} else if (var2 == 1) {
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IZIZI)V",
		garbageValue = "-400726809"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (World.World_worlds != null) {
			ClientPacket.doWorldSorting(0, World.World_worlds.length - 1, var0, var1, var2, var3);
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lcx;Lcx;IZI)I",
		garbageValue = "-1376899254"
	)
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) {
			int var4 = var0.population;
			int var5 = var1.population;
			if (!var3) {
				if (var4 == -1) {
					var4 = 2001;
				}

				if (var5 == -1) {
					var5 = 2001;
				}
			}

			return var4 - var5;
		} else if (var2 == 2) {
			return var0.location - var1.location;
		} else if (var2 == 3) {
			if (var0.activity.equals("-")) {
				if (var1.activity.equals("-")) {
					return 0;
				} else {
					return var3 ? -1 : 1;
				}
			} else if (var1.activity.equals("-")) {
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity);
			}
		} else if (var2 == 4) {
			return var0.method1977() ? (var1.method1977() ? 0 : 1) : (var1.method1977() ? -1 : 0);
		} else if (var2 == 5) {
			return var0.method1965() ? (var1.method1965() ? 0 : 1) : (var1.method1965() ? -1 : 0);
		} else if (var2 == 6) {
			return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
		} else if (var2 == 7) {
			return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
		} else {
			return var0.id - var1.id;
		}
	}
}
