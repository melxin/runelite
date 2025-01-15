import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qe")
@Implements("TransformationMatrix")
public final class TransformationMatrix {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lqe;"
	)
	static TransformationMatrix[] field4758;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1557335651
	)
	static int field4757;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 2031211881
	)
	static int field4759;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	public static final TransformationMatrix field4762;
	@ObfuscatedName("ad")
	public float[] field4761;

	static {
		field4758 = new TransformationMatrix[0];
		field4757 = 100;
		field4758 = new TransformationMatrix[100];
		field4759 = 0;
		field4762 = new TransformationMatrix();
	}

	public TransformationMatrix() {
		this.field4761 = new float[16];
		this.method8372();
	}

	@ObfuscatedSignature(
		descriptor = "(Lqe;)V"
	)
	public TransformationMatrix(TransformationMatrix var1) {
		this.field4761 = new float[16];
		this.method8374(var1);
	}

	@ObfuscatedSignature(
		descriptor = "(Lvy;Z)V"
	)
	public TransformationMatrix(Buffer var1, boolean var2) {
		this.field4761 = new float[16];
		this.method8417(var1, var2);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1585352490"
	)
	public void method8373() {
		synchronized(field4758) {
			if (field4759 < field4757 - 1) {
				field4758[++field4759 - 1] = this;
			}

		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lvy;ZB)V",
		garbageValue = "97"
	)
	void method8417(Buffer var1, boolean var2) {
		if (var2) {
			class429 var4 = new class429();
			var4.method8459(TriBool.method9284(var1.readShort()));
			var4.method8460(TriBool.method9284(var1.readShort()));
			var4.method8455(TriBool.method9284(var1.readShort()));
			var4.method8458((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort());
			this.method8381(var4);
		} else {
			for (int var3 = 0; var3 < 16; ++var3) {
				this.field4761[var3] = var1.method10302();
			}
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "144401204"
	)
	float[] method8442() {
		float[] var1 = new float[3];
		if ((double)this.field4761[2] < 0.999D && (double)this.field4761[2] > -0.999D) {
			var1[1] = (float)(-Math.asin((double)this.field4761[2]));
			double var2 = Math.cos((double)var1[1]);
			var1[0] = (float)Math.atan2((double)this.field4761[6] / var2, (double)this.field4761[10] / var2);
			var1[2] = (float)Math.atan2((double)this.field4761[1] / var2, (double)this.field4761[0] / var2);
		} else {
			var1[0] = 0.0F;
			var1[1] = (float)Math.atan2((double)this.field4761[2], 0.0D);
			var1[2] = (float)Math.atan2((double)(-this.field4761[9]), (double)this.field4761[5]);
		}

		return var1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "-1423946208"
	)
	public float[] method8406() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field4761[6])), 0.0F, 0.0F};
		double var2 = Math.cos((double)var1[0]);
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) {
			var4 = (double)this.field4761[2];
			var6 = (double)this.field4761[10];
			double var8 = (double)this.field4761[4];
			double var10 = (double)this.field4761[5];
			var1[1] = (float)Math.atan2(var4, var6);
			var1[2] = (float)Math.atan2(var8, var10);
		} else {
			var4 = (double)this.field4761[1];
			var6 = (double)this.field4761[0];
			if (this.field4761[6] < 0.0F) {
				var1[1] = (float)Math.atan2(var4, var6);
			} else {
				var1[1] = (float)(-Math.atan2(var4, var6));
			}

			var1[2] = 0.0F;
		}

		return var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-2"
	)
	void method8372() {
		this.field4761[0] = 1.0F;
		this.field4761[1] = 0.0F;
		this.field4761[2] = 0.0F;
		this.field4761[3] = 0.0F;
		this.field4761[4] = 0.0F;
		this.field4761[5] = 1.0F;
		this.field4761[6] = 0.0F;
		this.field4761[7] = 0.0F;
		this.field4761[8] = 0.0F;
		this.field4761[9] = 0.0F;
		this.field4761[10] = 1.0F;
		this.field4761[11] = 0.0F;
		this.field4761[12] = 0.0F;
		this.field4761[13] = 0.0F;
		this.field4761[14] = 0.0F;
		this.field4761[15] = 1.0F;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "89"
	)
	public void method8368() {
		this.field4761[0] = 0.0F;
		this.field4761[1] = 0.0F;
		this.field4761[2] = 0.0F;
		this.field4761[3] = 0.0F;
		this.field4761[4] = 0.0F;
		this.field4761[5] = 0.0F;
		this.field4761[6] = 0.0F;
		this.field4761[7] = 0.0F;
		this.field4761[8] = 0.0F;
		this.field4761[9] = 0.0F;
		this.field4761[10] = 0.0F;
		this.field4761[11] = 0.0F;
		this.field4761[12] = 0.0F;
		this.field4761[13] = 0.0F;
		this.field4761[14] = 0.0F;
		this.field4761[15] = 0.0F;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lqe;B)V",
		garbageValue = "49"
	)
	public void method8374(TransformationMatrix var1) {
		System.arraycopy(var1.field4761, 0, this.field4761, 0, 16);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-1865066324"
	)
	public void method8375(float var1) {
		this.method8378(var1, var1, var1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "1853963433"
	)
	public void method8378(float var1, float var2, float var3) {
		this.method8372();
		this.field4761[0] = var1;
		this.field4761[5] = var2;
		this.field4761[10] = var3;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lqe;I)V",
		garbageValue = "-1609335368"
	)
	public void method8377(TransformationMatrix var1) {
		for (int var2 = 0; var2 < this.field4761.length; ++var2) {
			float[] var10000 = this.field4761;
			var10000[var2] += var1.field4761[var2];
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lqe;I)V",
		garbageValue = "1178667793"
	)
	public void method8389(TransformationMatrix var1) {
		float var2 = var1.field4761[0] * this.field4761[0] + var1.field4761[4] * this.field4761[1] + var1.field4761[8] * this.field4761[2] + this.field4761[3] * var1.field4761[12];
		float var3 = this.field4761[3] * var1.field4761[13] + var1.field4761[5] * this.field4761[1] + var1.field4761[1] * this.field4761[0] + var1.field4761[9] * this.field4761[2];
		float var4 = this.field4761[2] * var1.field4761[10] + var1.field4761[2] * this.field4761[0] + this.field4761[1] * var1.field4761[6] + this.field4761[3] * var1.field4761[14];
		float var5 = this.field4761[3] * var1.field4761[15] + this.field4761[2] * var1.field4761[11] + var1.field4761[7] * this.field4761[1] + var1.field4761[3] * this.field4761[0];
		float var6 = this.field4761[5] * var1.field4761[4] + var1.field4761[0] * this.field4761[4] + this.field4761[6] * var1.field4761[8] + var1.field4761[12] * this.field4761[7];
		float var7 = this.field4761[4] * var1.field4761[1] + this.field4761[5] * var1.field4761[5] + this.field4761[6] * var1.field4761[9] + this.field4761[7] * var1.field4761[13];
		float var8 = var1.field4761[14] * this.field4761[7] + var1.field4761[10] * this.field4761[6] + this.field4761[4] * var1.field4761[2] + this.field4761[5] * var1.field4761[6];
		float var9 = var1.field4761[15] * this.field4761[7] + var1.field4761[3] * this.field4761[4] + var1.field4761[7] * this.field4761[5] + var1.field4761[11] * this.field4761[6];
		float var10 = this.field4761[8] * var1.field4761[0] + var1.field4761[4] * this.field4761[9] + this.field4761[10] * var1.field4761[8] + this.field4761[11] * var1.field4761[12];
		float var11 = this.field4761[8] * var1.field4761[1] + this.field4761[9] * var1.field4761[5] + var1.field4761[9] * this.field4761[10] + var1.field4761[13] * this.field4761[11];
		float var12 = this.field4761[8] * var1.field4761[2] + this.field4761[9] * var1.field4761[6] + this.field4761[10] * var1.field4761[10] + this.field4761[11] * var1.field4761[14];
		float var13 = this.field4761[10] * var1.field4761[11] + this.field4761[9] * var1.field4761[7] + var1.field4761[3] * this.field4761[8] + this.field4761[11] * var1.field4761[15];
		float var14 = this.field4761[12] * var1.field4761[0] + this.field4761[13] * var1.field4761[4] + this.field4761[14] * var1.field4761[8] + this.field4761[15] * var1.field4761[12];
		float var15 = this.field4761[13] * var1.field4761[5] + this.field4761[12] * var1.field4761[1] + this.field4761[14] * var1.field4761[9] + var1.field4761[13] * this.field4761[15];
		float var16 = var1.field4761[14] * this.field4761[15] + this.field4761[12] * var1.field4761[2] + this.field4761[13] * var1.field4761[6] + this.field4761[14] * var1.field4761[10];
		float var17 = var1.field4761[3] * this.field4761[12] + var1.field4761[7] * this.field4761[13] + var1.field4761[11] * this.field4761[14] + var1.field4761[15] * this.field4761[15];
		this.field4761[0] = var2;
		this.field4761[1] = var3;
		this.field4761[2] = var4;
		this.field4761[3] = var5;
		this.field4761[4] = var6;
		this.field4761[5] = var7;
		this.field4761[6] = var8;
		this.field4761[7] = var9;
		this.field4761[8] = var10;
		this.field4761[9] = var11;
		this.field4761[10] = var12;
		this.field4761[11] = var13;
		this.field4761[12] = var14;
		this.field4761[13] = var15;
		this.field4761[14] = var16;
		this.field4761[15] = var17;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lqf;I)V",
		garbageValue = "1687351949"
	)
	public void method8379(class422 var1) {
		float var2 = var1.field4728.field4756 * var1.field4728.field4756;
		float var3 = var1.field4728.field4756 * var1.field4728.field4751;
		float var4 = var1.field4728.field4756 * var1.field4728.field4754;
		float var5 = var1.field4728.field4756 * var1.field4728.field4753;
		float var6 = var1.field4728.field4751 * var1.field4728.field4751;
		float var7 = var1.field4728.field4751 * var1.field4728.field4754;
		float var8 = var1.field4728.field4751 * var1.field4728.field4753;
		float var9 = var1.field4728.field4754 * var1.field4728.field4754;
		float var10 = var1.field4728.field4753 * var1.field4728.field4754;
		float var11 = var1.field4728.field4753 * var1.field4728.field4753;
		this.field4761[0] = var6 + var2 - var11 - var9;
		this.field4761[1] = var5 + var7 + var7 + var5;
		this.field4761[2] = var8 - var4 - var4 + var8;
		this.field4761[4] = var7 + (var7 - var5 - var5);
		this.field4761[5] = var2 + var9 - var6 - var11;
		this.field4761[6] = var3 + var3 + var10 + var10;
		this.field4761[8] = var4 + var8 + var8 + var4;
		this.field4761[9] = var10 - var3 - var3 + var10;
		this.field4761[10] = var2 + var11 - var9 - var6;
		float[] var12 = this.field4761;
		float[] var13 = this.field4761;
		this.field4761[11] = 0.0F;
		var13[7] = 0.0F;
		var12[3] = 0.0F;
		this.field4761[12] = var1.field4729.field4747;
		this.field4761[13] = var1.field4729.field4744;
		this.field4761[14] = var1.field4729.field4749;
		this.field4761[15] = 1.0F;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lqa;B)V",
		garbageValue = "-24"
	)
	public void method8380(class427 var1) {
		float var2 = var1.field4756 * var1.field4756;
		float var3 = var1.field4751 * var1.field4756;
		float var4 = var1.field4756 * var1.field4754;
		float var5 = var1.field4756 * var1.field4753;
		float var6 = var1.field4751 * var1.field4751;
		float var7 = var1.field4751 * var1.field4754;
		float var8 = var1.field4753 * var1.field4751;
		float var9 = var1.field4754 * var1.field4754;
		float var10 = var1.field4753 * var1.field4754;
		float var11 = var1.field4753 * var1.field4753;
		this.field4761[0] = var2 + var6 - var11 - var9;
		this.field4761[1] = var7 + var7 + var5 + var5;
		this.field4761[2] = var8 - var4 - var4 + var8;
		this.field4761[4] = var7 + (var7 - var5 - var5);
		this.field4761[5] = var2 + var9 - var6 - var11;
		this.field4761[6] = var10 + var10 + var3 + var3;
		this.field4761[8] = var8 + var8 + var4 + var4;
		this.field4761[9] = var10 - var3 - var3 + var10;
		this.field4761[10] = var2 + var11 - var9 - var6;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lqp;I)V",
		garbageValue = "-2089442831"
	)
	public void method8381(class429 var1) {
		this.field4761[0] = var1.field4768;
		this.field4761[1] = var1.field4766;
		this.field4761[2] = var1.field4773;
		this.field4761[3] = 0.0F;
		this.field4761[4] = var1.field4775;
		this.field4761[5] = var1.field4765;
		this.field4761[6] = var1.field4770;
		this.field4761[7] = 0.0F;
		this.field4761[8] = var1.field4771;
		this.field4761[9] = var1.field4772;
		this.field4761[10] = var1.field4767;
		this.field4761[11] = 0.0F;
		this.field4761[12] = var1.field4769;
		this.field4761[13] = var1.field4774;
		this.field4761[14] = var1.field4776;
		this.field4761[15] = 1.0F;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "-53543580"
	)
	float method8384() {
		return this.field4761[3] * this.field4761[5] * this.field4761[8] * this.field4761[14] + this.field4761[7] * this.field4761[2] * this.field4761[8] * this.field4761[13] + this.field4761[5] * this.field4761[2] * this.field4761[11] * this.field4761[12] + (this.field4761[12] * this.field4761[7] * this.field4761[1] * this.field4761[10] + (this.field4761[8] * this.field4761[6] * this.field4761[1] * this.field4761[15] + this.field4761[13] * this.field4761[11] * this.field4761[6] * this.field4761[0] + (this.field4761[15] * this.field4761[10] * this.field4761[5] * this.field4761[0] - this.field4761[14] * this.field4761[11] * this.field4761[5] * this.field4761[0] - this.field4761[6] * this.field4761[0] * this.field4761[9] * this.field4761[15]) + this.field4761[0] * this.field4761[7] * this.field4761[9] * this.field4761[14] - this.field4761[0] * this.field4761[7] * this.field4761[10] * this.field4761[13] - this.field4761[10] * this.field4761[1] * this.field4761[4] * this.field4761[15] + this.field4761[14] * this.field4761[4] * this.field4761[1] * this.field4761[11] - this.field4761[11] * this.field4761[1] * this.field4761[6] * this.field4761[12] - this.field4761[8] * this.field4761[1] * this.field4761[7] * this.field4761[14]) + this.field4761[15] * this.field4761[4] * this.field4761[2] * this.field4761[9] - this.field4761[13] * this.field4761[4] * this.field4761[2] * this.field4761[11] - this.field4761[8] * this.field4761[5] * this.field4761[2] * this.field4761[15]) - this.field4761[9] * this.field4761[2] * this.field4761[7] * this.field4761[12] - this.field4761[3] * this.field4761[4] * this.field4761[9] * this.field4761[14] + this.field4761[4] * this.field4761[3] * this.field4761[10] * this.field4761[13] - this.field4761[10] * this.field4761[3] * this.field4761[5] * this.field4761[12] - this.field4761[13] * this.field4761[6] * this.field4761[3] * this.field4761[8] + this.field4761[12] * this.field4761[9] * this.field4761[3] * this.field4761[6];
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-22358"
	)
	public void method8383() {
		float var1 = 1.0F / this.method8384();
		float var2 = (this.field4761[7] * this.field4761[9] * this.field4761[14] + this.field4761[13] * this.field4761[11] * this.field4761[6] + (this.field4761[5] * this.field4761[10] * this.field4761[15] - this.field4761[11] * this.field4761[5] * this.field4761[14] - this.field4761[6] * this.field4761[9] * this.field4761[15]) - this.field4761[10] * this.field4761[7] * this.field4761[13]) * var1;
		float var3 = var1 * (this.field4761[10] * -this.field4761[1] * this.field4761[15] + this.field4761[14] * this.field4761[1] * this.field4761[11] + this.field4761[15] * this.field4761[9] * this.field4761[2] - this.field4761[11] * this.field4761[2] * this.field4761[13] - this.field4761[14] * this.field4761[3] * this.field4761[9] + this.field4761[3] * this.field4761[10] * this.field4761[13]);
		float var4 = (this.field4761[3] * this.field4761[5] * this.field4761[14] + this.field4761[2] * this.field4761[7] * this.field4761[13] + (this.field4761[15] * this.field4761[6] * this.field4761[1] - this.field4761[7] * this.field4761[1] * this.field4761[14] - this.field4761[15] * this.field4761[2] * this.field4761[5]) - this.field4761[3] * this.field4761[6] * this.field4761[13]) * var1;
		float var5 = (this.field4761[6] * this.field4761[3] * this.field4761[9] + (this.field4761[5] * this.field4761[2] * this.field4761[11] + -this.field4761[1] * this.field4761[6] * this.field4761[11] + this.field4761[7] * this.field4761[1] * this.field4761[10] - this.field4761[7] * this.field4761[2] * this.field4761[9] - this.field4761[10] * this.field4761[3] * this.field4761[5])) * var1;
		float var6 = var1 * (this.field4761[12] * this.field4761[10] * this.field4761[7] + (this.field4761[8] * this.field4761[6] * this.field4761[15] + this.field4761[4] * this.field4761[11] * this.field4761[14] + this.field4761[15] * -this.field4761[4] * this.field4761[10] - this.field4761[12] * this.field4761[11] * this.field4761[6] - this.field4761[14] * this.field4761[8] * this.field4761[7]));
		float var7 = (this.field4761[12] * this.field4761[2] * this.field4761[11] + (this.field4761[15] * this.field4761[0] * this.field4761[10] - this.field4761[14] * this.field4761[11] * this.field4761[0] - this.field4761[8] * this.field4761[2] * this.field4761[15]) + this.field4761[14] * this.field4761[3] * this.field4761[8] - this.field4761[10] * this.field4761[3] * this.field4761[12]) * var1;
		float var8 = var1 * (this.field4761[3] * this.field4761[6] * this.field4761[12] + (this.field4761[2] * this.field4761[4] * this.field4761[15] + this.field4761[15] * this.field4761[6] * -this.field4761[0] + this.field4761[7] * this.field4761[0] * this.field4761[14] - this.field4761[12] * this.field4761[2] * this.field4761[7] - this.field4761[14] * this.field4761[4] * this.field4761[3]));
		float var9 = var1 * (this.field4761[4] * this.field4761[3] * this.field4761[10] + this.field4761[8] * this.field4761[7] * this.field4761[2] + (this.field4761[0] * this.field4761[6] * this.field4761[11] - this.field4761[7] * this.field4761[0] * this.field4761[10] - this.field4761[2] * this.field4761[4] * this.field4761[11]) - this.field4761[8] * this.field4761[6] * this.field4761[3]);
		float var10 = var1 * (this.field4761[5] * this.field4761[11] * this.field4761[12] + (this.field4761[4] * this.field4761[9] * this.field4761[15] - this.field4761[13] * this.field4761[11] * this.field4761[4] - this.field4761[5] * this.field4761[8] * this.field4761[15]) + this.field4761[8] * this.field4761[7] * this.field4761[13] - this.field4761[12] * this.field4761[9] * this.field4761[7]);
		float var11 = var1 * (this.field4761[12] * this.field4761[9] * this.field4761[3] + (this.field4761[15] * this.field4761[8] * this.field4761[1] + this.field4761[11] * this.field4761[0] * this.field4761[13] + this.field4761[15] * -this.field4761[0] * this.field4761[9] - this.field4761[1] * this.field4761[11] * this.field4761[12] - this.field4761[3] * this.field4761[8] * this.field4761[13]));
		float var12 = var1 * (this.field4761[15] * this.field4761[5] * this.field4761[0] - this.field4761[13] * this.field4761[0] * this.field4761[7] - this.field4761[4] * this.field4761[1] * this.field4761[15] + this.field4761[7] * this.field4761[1] * this.field4761[12] + this.field4761[13] * this.field4761[4] * this.field4761[3] - this.field4761[3] * this.field4761[5] * this.field4761[12]);
		float var13 = var1 * (this.field4761[11] * this.field4761[1] * this.field4761[4] + this.field4761[5] * -this.field4761[0] * this.field4761[11] + this.field4761[9] * this.field4761[0] * this.field4761[7] - this.field4761[7] * this.field4761[1] * this.field4761[8] - this.field4761[3] * this.field4761[4] * this.field4761[9] + this.field4761[3] * this.field4761[5] * this.field4761[8]);
		float var14 = (this.field4761[14] * this.field4761[5] * this.field4761[8] + this.field4761[10] * this.field4761[4] * this.field4761[13] + this.field4761[9] * -this.field4761[4] * this.field4761[14] - this.field4761[12] * this.field4761[5] * this.field4761[10] - this.field4761[6] * this.field4761[8] * this.field4761[13] + this.field4761[6] * this.field4761[9] * this.field4761[12]) * var1;
		float var15 = var1 * (this.field4761[14] * this.field4761[0] * this.field4761[9] - this.field4761[13] * this.field4761[10] * this.field4761[0] - this.field4761[14] * this.field4761[8] * this.field4761[1] + this.field4761[10] * this.field4761[1] * this.field4761[12] + this.field4761[13] * this.field4761[2] * this.field4761[8] - this.field4761[12] * this.field4761[2] * this.field4761[9]);
		float var16 = (this.field4761[5] * this.field4761[2] * this.field4761[12] + (this.field4761[5] * -this.field4761[0] * this.field4761[14] + this.field4761[13] * this.field4761[0] * this.field4761[6] + this.field4761[14] * this.field4761[4] * this.field4761[1] - this.field4761[12] * this.field4761[1] * this.field4761[6] - this.field4761[2] * this.field4761[4] * this.field4761[13])) * var1;
		float var17 = var1 * (this.field4761[1] * this.field4761[6] * this.field4761[8] + (this.field4761[10] * this.field4761[0] * this.field4761[5] - this.field4761[0] * this.field4761[6] * this.field4761[9] - this.field4761[10] * this.field4761[4] * this.field4761[1]) + this.field4761[9] * this.field4761[2] * this.field4761[4] - this.field4761[2] * this.field4761[5] * this.field4761[8]);
		this.field4761[0] = var2;
		this.field4761[1] = var3;
		this.field4761[2] = var4;
		this.field4761[3] = var5;
		this.field4761[4] = var6;
		this.field4761[5] = var7;
		this.field4761[6] = var8;
		this.field4761[7] = var9;
		this.field4761[8] = var10;
		this.field4761[9] = var11;
		this.field4761[10] = var12;
		this.field4761[11] = var13;
		this.field4761[12] = var14;
		this.field4761[13] = var15;
		this.field4761[14] = var16;
		this.field4761[15] = var17;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "-717160163"
	)
	public void method8398(float var1, float var2, float var3, float var4) {
		this.field4761[0] = var1;
		this.field4761[1] = 0.0F;
		this.field4761[2] = 0.0F;
		this.field4761[3] = 0.0F;
		this.field4761[4] = 0.0F;
		this.field4761[5] = var2;
		this.field4761[6] = 0.0F;
		this.field4761[7] = 0.0F;
		this.field4761[8] = 0.0F;
		this.field4761[9] = 0.0F;
		this.field4761[10] = var3;
		this.field4761[11] = 0.0F;
		this.field4761[12] = 0.0F;
		this.field4761[13] = 0.0F;
		this.field4761[14] = 0.0F;
		this.field4761[15] = var4;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(FFF[FI)V",
		garbageValue = "-1131230174"
	)
	@Export("transformPoint")
	public void transformPoint(float var1, float var2, float var3, float[] var4) {
		var4[0] = var3 * this.field4761[8] + var1 * this.field4761[0] + this.field4761[4] * var2 + this.field4761[12];
		var4[1] = this.field4761[13] + var3 * this.field4761[9] + var2 * this.field4761[5] + this.field4761[1] * var1;
		var4[2] = this.field4761[6] * var2 + this.field4761[2] * var1 + this.field4761[10] * var3 + this.field4761[14];
		if (var4.length > 3) {
			var4[3] = this.field4761[15] + this.field4761[7] * var2 + var1 * this.field4761[3] + this.field4761[11] * var3;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(FFFI)Lqh;",
		garbageValue = "-510918344"
	)
	public class426 method8386(float var1, float var2, float var3) {
		float var4 = 1.0F / (var1 * this.field4761[3] + this.field4761[7] * var2 + var3 * this.field4761[11] + this.field4761[15]);
		return new class426(var4 * (var2 * this.field4761[4] + this.field4761[0] * var1 + this.field4761[8] * var3 + this.field4761[12]), (this.field4761[13] + this.field4761[9] * var3 + this.field4761[5] * var2 + var1 * this.field4761[1]) * var4, var4 * (this.field4761[14] + var2 * this.field4761[6] + this.field4761[2] * var1 + var3 * this.field4761[10]));
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(FFFI)F",
		garbageValue = "751936456"
	)
	public float method8400(float var1, float var2, float var3) {
		return var3 * this.field4761[8] + this.field4761[0] * var1 + var2 * this.field4761[4] + this.field4761[12];
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(FFFB)F",
		garbageValue = "98"
	)
	public float method8388(float var1, float var2, float var3) {
		return var3 * this.field4761[9] + this.field4761[5] * var2 + this.field4761[1] * var1 + this.field4761[13];
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(FFFS)F",
		garbageValue = "-18624"
	)
	public float method8452(float var1, float var2, float var3) {
		return this.field4761[6] * var2 + var1 * this.field4761[2] + var3 * this.field4761[10] + this.field4761[14];
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "1982534628"
	)
	public float[] method8391() {
		float[] var1 = new float[3];
		class426 var2 = new class426(this.field4761[0], this.field4761[1], this.field4761[2]);
		class426 var3 = new class426(this.field4761[4], this.field4761[5], this.field4761[6]);
		class426 var4 = new class426(this.field4761[8], this.field4761[9], this.field4761[10]);
		var1[0] = var2.method8308();
		var1[1] = var3.method8308();
		var1[2] = var4.method8308();
		return var1;
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder();
		this.method8406();
		this.method8442();

		for (int var2 = 0; var2 < 4; ++var2) {
			for (int var3 = 0; var3 < 4; ++var3) {
				if (var3 > 0) {
					var1.append("\t");
				}

				float var4 = this.field4761[var3 + var2 * 4];
				if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) {
					var4 = 0.0F;
				}

				var1.append(var4);
			}

			var1.append("\n");
		}

		return var1.toString();
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof TransformationMatrix)) {
			return false;
		} else {
			TransformationMatrix var2 = (TransformationMatrix)var1;

			for (int var3 = 0; var3 < 16; ++var3) {
				if (this.field4761[var3] != var2.field4761[var3]) {
					return false;
				}
			}

			return true;
		}
	}

	public int hashCode() {
		boolean var1 = true;
		byte var2 = 1;
		int var3 = var2 * 31 + Arrays.hashCode(this.field4761);
		return var3;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "([BII)I",
		garbageValue = "-180058422"
	)
	public static int method8382(byte[] var0, int var1) {
		return class499.method9539(var0, 0, var1);
	}
}
