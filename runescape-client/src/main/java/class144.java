import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
public class class144 extends DualNode {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1373393293
	)
	int field1643;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[[Lff;"
	)
	public class136[][] field1639;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[[Lff;"
	)
	class136[][] field1638;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lhu;"
	)
	public Skeleton field1641;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1557858399
	)
	int field1642;
	@ObfuscatedName("an")
	boolean field1644;
	@ObfuscatedName("at")
	Future field1640;
	@ObfuscatedName("ac")
	List field1645;

	@ObfuscatedSignature(
		descriptor = "(Lpq;Lpq;IZ)V"
	)
	class144(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1639 = null;
		this.field1638 = null;
		this.field1642 = 0;
		this.field1643 = var3;
		byte[] var5 = var1.takeFile(this.field1643 >> 16 & 65535, this.field1643 & 65535);
		Buffer var6 = new Buffer(var5);
		int var7 = var6.readUnsignedByte();
		int var8 = var6.readUnsignedShort();
		byte[] var9;
		if (var4) {
			var9 = var2.getFile(0, var8);
		} else {
			var9 = var2.getFile(var8, 0);
		}

		this.field1641 = new Skeleton(var8, var9);
		this.field1645 = new ArrayList();
		this.field1640 = WorldMapID.field3245.submit(new class143(this, var6, var7));
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lvy;IS)V",
		garbageValue = "6837"
	)
	void method3520(Buffer var1, int var2) {
		var1.readUnsignedShort();
		var1.readUnsignedShort();
		this.field1642 = var1.readUnsignedByte();
		int var3 = var1.readUnsignedShort();
		this.field1638 = new class136[this.field1641.method4168().method4107()][];
		this.field1639 = new class136[this.field1641.method4164()][];
		class135[] var4 = new class135[var3];

		int var5;
		int var7;
		for (var5 = 0; var5 < var3; ++var5) {
			class137 var12 = Message.method1253(var1.readUnsignedByte());
			var7 = var1.readShortSmart();
			class138 var13 = class538.method10069(var1.readUnsignedByte());
			class136 var14 = new class136();
			var14.method3447(var1, var2);
			var4[var5] = new class135(this, var14, var12, var13, var7);
			int var10 = var12.method3482();
			class136[][] var15;
			if (var12 == class137.field1600) {
				var15 = this.field1638;
			} else {
				var15 = this.field1639;
			}

			if (var15[var7] == null) {
				var15[var7] = new class136[var10];
			}

			if (var12 == class137.field1598) {
				this.field1644 = true;
			}
		}

		var5 = var3 / class142.field1631;
		int var6 = var3 % class142.field1631;
		int var8 = 0;

		for (int var9 = 0; var9 < class142.field1631; ++var9) {
			var7 = var8;
			var8 += var5;
			if (var6 > 0) {
				++var8;
				--var6;
			}

			if (var7 == var8) {
				break;
			}

			this.field1645.add(WorldMapID.field3245.submit(new class139(this, var7, var8, var4)));
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1447380670"
	)
	public boolean method3521() {
		if (this.field1640 == null && this.field1645 == null) {
			return true;
		} else {
			if (this.field1640 != null) {
				if (!this.field1640.isDone()) {
					return false;
				}

				this.field1640 = null;
			}

			boolean var1 = true;

			for (int var2 = 0; var2 < this.field1645.size(); ++var2) {
				if (!((Future)this.field1645.get(var2)).isDone()) {
					var1 = false;
				} else {
					this.field1645.remove(var2);
					--var2;
				}
			}

			if (!var1) {
				return false;
			} else {
				this.field1645 = null;
				return true;
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1662996219"
	)
	public int method3529() {
		return this.field1642;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1967924794"
	)
	public boolean method3535() {
		return this.field1644;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILfc;III)V",
		garbageValue = "-2052020098"
	)
	public void method3524(int var1, class133 var2, int var3, int var4) {
		TransformationMatrix var5 = AbstractWorldMapData.method6389();
		this.method3525(var5, var3, var2, var1);
		this.method3527(var5, var3, var2, var1);
		this.method3533(var5, var3, var2, var1);
		var2.method3400(var5);
		var5.method8373();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lqe;ILfc;II)V",
		garbageValue = "-330565697"
	)
	void method3525(TransformationMatrix var1, int var2, class133 var3, int var4) {
		float[] var5 = var3.method3402(this.field1642);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1638[var2] != null) {
			class136 var9 = this.field1638[var2][0];
			class136 var10 = this.field1638[var2][1];
			class136 var11 = this.field1638[var2][2];
			if (var9 != null) {
				var6 = var9.method3454(var4);
			}

			if (var10 != null) {
				var7 = var10.method3454(var4);
			}

			if (var11 != null) {
				var8 = var11.method3454(var4);
			}
		}

		class427 var16 = FaceNormal.method4465();
		var16.method8334(1.0F, 0.0F, 0.0F, var6);
		class427 var14 = FaceNormal.method4465();
		var14.method8334(0.0F, 1.0F, 0.0F, var7);
		class427 var15 = FaceNormal.method4465();
		var15.method8334(0.0F, 0.0F, 1.0F, var8);
		class427 var12 = FaceNormal.method4465();
		var12.method8340(var15);
		var12.method8340(var16);
		var12.method8340(var14);
		TransformationMatrix var13 = AbstractWorldMapData.method6389();
		var13.method8380(var12);
		var1.method8389(var13);
		var16.method8354();
		var14.method8354();
		var15.method8354();
		var12.method8354();
		var13.method8373();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lqe;ILfc;II)V",
		garbageValue = "383587504"
	)
	void method3533(TransformationMatrix var1, int var2, class133 var3, int var4) {
		float[] var5 = var3.method3410(this.field1642);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1638[var2] != null) {
			class136 var9 = this.field1638[var2][3];
			class136 var10 = this.field1638[var2][4];
			class136 var11 = this.field1638[var2][5];
			if (var9 != null) {
				var6 = var9.method3454(var4);
			}

			if (var10 != null) {
				var7 = var10.method3454(var4);
			}

			if (var11 != null) {
				var8 = var11.method3454(var4);
			}
		}

		var1.field4761[12] = var6;
		var1.field4761[13] = var7;
		var1.field4761[14] = var8;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lqe;ILfc;IB)V",
		garbageValue = "0"
	)
	void method3527(TransformationMatrix var1, int var2, class133 var3, int var4) {
		float[] var5 = var3.method3406(this.field1642);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1638[var2] != null) {
			class136 var9 = this.field1638[var2][6];
			class136 var10 = this.field1638[var2][7];
			class136 var11 = this.field1638[var2][8];
			if (var9 != null) {
				var6 = var9.method3454(var4);
			}

			if (var10 != null) {
				var7 = var10.method3454(var4);
			}

			if (var11 != null) {
				var8 = var11.method3454(var4);
			}
		}

		TransformationMatrix var12 = AbstractWorldMapData.method6389();
		var12.method8378(var6, var7, var8);
		var1.method8389(var12);
		var12.method8373();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lff;FFFFFFFFB)V",
		garbageValue = "-9"
	)
	static void method3550(class136 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
		if (var0 != null) {
			float var9 = var4 - var1;
			if (var9 != 0.0F) {
				float var10 = var2 - var1;
				float var11 = var3 - var1;
				float[] var12 = new float[]{var10 / var9, var11 / var9};
				var0.field1575 = 0.33333334F == var12[0] && 0.6666667F == var12[1];
				float var13 = var12[0];
				float var14 = var12[1];
				if (var12[0] < 0.0F) {
					var12[0] = 0.0F;
				}

				if (var12[1] > 1.0F) {
					var12[1] = 1.0F;
				}

				if (var12[0] > 1.0F || var12[1] < -1.0F) {
					HttpMethod.method81(var12);
				}

				if (var12[0] != var13) {
					var2 = var12[0] * var9 + var1;
					if (0.0F != var13) {
						var6 = (var6 - var5) * var12[0] / var13 + var5;
					}
				}

				if (var14 != var12[1]) {
					var3 = var9 * var12[1] + var1;
					if (var14 != 1.0F) {
						var7 = var8 - (var8 - var7) * (1.0F - var12[1]) / (1.0F - var14);
					}
				}

				var0.field1576 = var1;
				var0.field1577 = var4;
				class172.method3866(0.0F, var12[0], var12[1], 1.0F, var0);
				float var15 = var6 - var5;
				float var16 = var7 - var6;
				float var17 = var8 - var7;
				float var18 = var16 - var15;
				var0.field1591 = var17 - var16 - var18;
				var0.field1584 = var18 + var18 + var18;
				var0.field1585 = var15 + var15 + var15;
				var0.field1582 = var5;
			}
		}
	}
}
