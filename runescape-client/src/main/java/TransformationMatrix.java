import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ro")
@Implements("TransformationMatrix")
public final class TransformationMatrix {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Lro;"
	)
	static TransformationMatrix[] field4915;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -574662727
	)
	static int field4909;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 174787581
	)
	static int field4912;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lro;"
	)
	public static final TransformationMatrix field4914;
	@ObfuscatedName("ah")
	public float[] field4913;

	static {
		field4915 = new TransformationMatrix[0];
		field4909 = 16;
		field4915 = new TransformationMatrix[16];
		field4912 = 0;
		field4914 = new TransformationMatrix();
	}

	public TransformationMatrix() {
		this.field4913 = new float[16];
		this.method8393();
	}

	@ObfuscatedSignature(
		descriptor = "(Lro;)V"
	)
	public TransformationMatrix(TransformationMatrix var1) {
		this.field4913 = new float[16];
		this.method8395(var1);
	}

	@ObfuscatedSignature(
		descriptor = "(Lvy;Z)V"
	)
	public TransformationMatrix(Buffer var1, boolean var2) {
		this.field4913 = new float[16];
		this.method8390(var1, var2);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "12"
	)
	public void method8413() {
		synchronized(field4915) {
			if (field4912 < field4909) {
				field4915[++field4912 - 1] = this;
			}

		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lvy;ZB)V",
		garbageValue = "1"
	)
	void method8390(Buffer var1, boolean var2) {
		if (var2) {
			class445 var13 = new class445();
			int var6 = var1.readShort();
			var6 &= 16383;
			float var5 = (float)((double)((float)var6) * 3.834951969714103E-4D);
			var13.method8481(var5);
			int var9 = var1.readShort();
			var9 &= 16383;
			float var8 = (float)(3.834951969714103E-4D * (double)((float)var9));
			var13.method8482(var8);
			int var12 = var1.readShort();
			var12 &= 16383;
			float var11 = (float)(3.834951969714103E-4D * (double)((float)var12));
			var13.method8491(var11);
			var13.method8483((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort());
			this.method8402(var13);
		} else {
			for (int var3 = 0; var3 < 16; ++var3) {
				this.field4913[var3] = var1.method10354();
			}
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "266308618"
	)
	float[] method8391() {
		float[] var1 = new float[3];
		if ((double)this.field4913[2] < 0.999D && (double)this.field4913[2] > -0.999D) {
			var1[1] = (float)(-Math.asin((double)this.field4913[2]));
			double var2 = Math.cos((double)var1[1]);
			var1[0] = (float)Math.atan2((double)this.field4913[6] / var2, (double)this.field4913[10] / var2);
			var1[2] = (float)Math.atan2((double)this.field4913[1] / var2, (double)this.field4913[0] / var2);
		} else {
			var1[0] = 0.0F;
			var1[1] = (float)Math.atan2((double)this.field4913[2], 0.0D);
			var1[2] = (float)Math.atan2((double)(-this.field4913[9]), (double)this.field4913[5]);
		}

		return var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "-232760203"
	)
	public float[] method8406() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field4913[6])), 0.0F, 0.0F};
		double var2 = Math.cos((double)var1[0]);
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) {
			var4 = (double)this.field4913[2];
			var6 = (double)this.field4913[10];
			double var8 = (double)this.field4913[4];
			double var10 = (double)this.field4913[5];
			var1[1] = (float)Math.atan2(var4, var6);
			var1[2] = (float)Math.atan2(var8, var10);
		} else {
			var4 = (double)this.field4913[1];
			var6 = (double)this.field4913[0];
			if (this.field4913[6] < 0.0F) {
				var1[1] = (float)Math.atan2(var4, var6);
			} else {
				var1[1] = (float)(-Math.atan2(var4, var6));
			}

			var1[2] = 0.0F;
		}

		return var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-545526806"
	)
	void method8393() {
		this.field4913[0] = 1.0F;
		this.field4913[1] = 0.0F;
		this.field4913[2] = 0.0F;
		this.field4913[3] = 0.0F;
		this.field4913[4] = 0.0F;
		this.field4913[5] = 1.0F;
		this.field4913[6] = 0.0F;
		this.field4913[7] = 0.0F;
		this.field4913[8] = 0.0F;
		this.field4913[9] = 0.0F;
		this.field4913[10] = 1.0F;
		this.field4913[11] = 0.0F;
		this.field4913[12] = 0.0F;
		this.field4913[13] = 0.0F;
		this.field4913[14] = 0.0F;
		this.field4913[15] = 1.0F;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1851211003"
	)
	public void method8394() {
		this.field4913[0] = 0.0F;
		this.field4913[1] = 0.0F;
		this.field4913[2] = 0.0F;
		this.field4913[3] = 0.0F;
		this.field4913[4] = 0.0F;
		this.field4913[5] = 0.0F;
		this.field4913[6] = 0.0F;
		this.field4913[7] = 0.0F;
		this.field4913[8] = 0.0F;
		this.field4913[9] = 0.0F;
		this.field4913[10] = 0.0F;
		this.field4913[11] = 0.0F;
		this.field4913[12] = 0.0F;
		this.field4913[13] = 0.0F;
		this.field4913[14] = 0.0F;
		this.field4913[15] = 0.0F;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lro;I)V",
		garbageValue = "1887554219"
	)
	public void method8395(TransformationMatrix var1) {
		System.arraycopy(var1.field4913, 0, this.field4913, 0, 16);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "40"
	)
	public void method8396(float var1) {
		this.method8404(var1, var1, var1);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "-2039274087"
	)
	public void method8404(float var1, float var2, float var3) {
		this.method8393();
		this.field4913[0] = var1;
		this.field4913[5] = var2;
		this.field4913[10] = var3;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lro;I)V",
		garbageValue = "-2094944397"
	)
	public void method8429(TransformationMatrix var1) {
		for (int var2 = 0; var2 < this.field4913.length; ++var2) {
			float[] var10000 = this.field4913;
			var10000[var2] += var1.field4913[var2];
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lro;I)V",
		garbageValue = "-1752819262"
	)
	public void method8399(TransformationMatrix var1) {
		float var2 = this.field4913[3] * var1.field4913[12] + this.field4913[2] * var1.field4913[8] + this.field4913[1] * var1.field4913[4] + var1.field4913[0] * this.field4913[0];
		float var3 = this.field4913[2] * var1.field4913[9] + this.field4913[0] * var1.field4913[1] + var1.field4913[5] * this.field4913[1] + this.field4913[3] * var1.field4913[13];
		float var4 = this.field4913[2] * var1.field4913[10] + this.field4913[0] * var1.field4913[2] + this.field4913[1] * var1.field4913[6] + this.field4913[3] * var1.field4913[14];
		float var5 = var1.field4913[15] * this.field4913[3] + var1.field4913[3] * this.field4913[0] + var1.field4913[7] * this.field4913[1] + this.field4913[2] * var1.field4913[11];
		float var6 = this.field4913[7] * var1.field4913[12] + this.field4913[6] * var1.field4913[8] + var1.field4913[4] * this.field4913[5] + this.field4913[4] * var1.field4913[0];
		float var7 = var1.field4913[9] * this.field4913[6] + var1.field4913[1] * this.field4913[4] + this.field4913[5] * var1.field4913[5] + var1.field4913[13] * this.field4913[7];
		float var8 = var1.field4913[14] * this.field4913[7] + this.field4913[6] * var1.field4913[10] + var1.field4913[6] * this.field4913[5] + var1.field4913[2] * this.field4913[4];
		float var9 = this.field4913[4] * var1.field4913[3] + var1.field4913[7] * this.field4913[5] + var1.field4913[11] * this.field4913[6] + var1.field4913[15] * this.field4913[7];
		float var10 = var1.field4913[12] * this.field4913[11] + this.field4913[10] * var1.field4913[8] + this.field4913[9] * var1.field4913[4] + var1.field4913[0] * this.field4913[8];
		float var11 = var1.field4913[13] * this.field4913[11] + var1.field4913[9] * this.field4913[10] + this.field4913[9] * var1.field4913[5] + this.field4913[8] * var1.field4913[1];
		float var12 = this.field4913[8] * var1.field4913[2] + var1.field4913[6] * this.field4913[9] + var1.field4913[10] * this.field4913[10] + var1.field4913[14] * this.field4913[11];
		float var13 = var1.field4913[7] * this.field4913[9] + var1.field4913[3] * this.field4913[8] + var1.field4913[11] * this.field4913[10] + this.field4913[11] * var1.field4913[15];
		float var14 = this.field4913[13] * var1.field4913[4] + this.field4913[12] * var1.field4913[0] + this.field4913[14] * var1.field4913[8] + var1.field4913[12] * this.field4913[15];
		float var15 = var1.field4913[13] * this.field4913[15] + var1.field4913[9] * this.field4913[14] + var1.field4913[1] * this.field4913[12] + var1.field4913[5] * this.field4913[13];
		float var16 = var1.field4913[10] * this.field4913[14] + this.field4913[13] * var1.field4913[6] + this.field4913[12] * var1.field4913[2] + var1.field4913[14] * this.field4913[15];
		float var17 = var1.field4913[11] * this.field4913[14] + var1.field4913[7] * this.field4913[13] + this.field4913[12] * var1.field4913[3] + this.field4913[15] * var1.field4913[15];
		this.field4913[0] = var2;
		this.field4913[1] = var3;
		this.field4913[2] = var4;
		this.field4913[3] = var5;
		this.field4913[4] = var6;
		this.field4913[5] = var7;
		this.field4913[6] = var8;
		this.field4913[7] = var9;
		this.field4913[8] = var10;
		this.field4913[9] = var11;
		this.field4913[10] = var12;
		this.field4913[11] = var13;
		this.field4913[12] = var14;
		this.field4913[13] = var15;
		this.field4913[14] = var16;
		this.field4913[15] = var17;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lqd;I)V",
		garbageValue = "-2118286254"
	)
	public void method8435(class438 var1) {
		float var2 = var1.field4882.field4904 * var1.field4882.field4904;
		float var3 = var1.field4882.field4904 * var1.field4882.field4901;
		float var4 = var1.field4882.field4907 * var1.field4882.field4904;
		float var5 = var1.field4882.field4906 * var1.field4882.field4904;
		float var6 = var1.field4882.field4901 * var1.field4882.field4901;
		float var7 = var1.field4882.field4901 * var1.field4882.field4907;
		float var8 = var1.field4882.field4901 * var1.field4882.field4906;
		float var9 = var1.field4882.field4907 * var1.field4882.field4907;
		float var10 = var1.field4882.field4907 * var1.field4882.field4906;
		float var11 = var1.field4882.field4906 * var1.field4882.field4906;
		this.field4913[0] = var2 + var6 - var11 - var9;
		this.field4913[1] = var5 + var7 + var7 + var5;
		this.field4913[2] = var8 - var4 - var4 + var8;
		this.field4913[4] = var7 - var5 - var5 + var7;
		this.field4913[5] = var2 + var9 - var6 - var11;
		this.field4913[6] = var3 + var10 + var3 + var10;
		this.field4913[8] = var8 + var8 + var4 + var4;
		this.field4913[9] = var10 - var3 - var3 + var10;
		this.field4913[10] = var2 + var11 - var9 - var6;
		float[] var12 = this.field4913;
		float[] var13 = this.field4913;
		this.field4913[11] = 0.0F;
		var13[7] = 0.0F;
		var12[3] = 0.0F;
		this.field4913[12] = var1.field4881.field4898;
		this.field4913[13] = var1.field4881.field4899;
		this.field4913[14] = var1.field4881.field4900;
		this.field4913[15] = 1.0F;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lrc;B)V",
		garbageValue = "100"
	)
	public void method8411(class443 var1) {
		float var2 = var1.field4904 * var1.field4904;
		float var3 = var1.field4901 * var1.field4904;
		float var4 = var1.field4907 * var1.field4904;
		float var5 = var1.field4906 * var1.field4904;
		float var6 = var1.field4901 * var1.field4901;
		float var7 = var1.field4907 * var1.field4901;
		float var8 = var1.field4901 * var1.field4906;
		float var9 = var1.field4907 * var1.field4907;
		float var10 = var1.field4907 * var1.field4906;
		float var11 = var1.field4906 * var1.field4906;
		this.field4913[0] = var6 + var2 - var11 - var9;
		this.field4913[1] = var5 + var7 + var7 + var5;
		this.field4913[2] = var8 - var4 - var4 + var8;
		this.field4913[4] = var7 - var5 - var5 + var7;
		this.field4913[5] = var2 + var9 - var6 - var11;
		this.field4913[6] = var3 + var10 + var10 + var3;
		this.field4913[8] = var4 + var8 + var4 + var8;
		this.field4913[9] = var10 + (var10 - var3 - var3);
		this.field4913[10] = var11 + var2 - var9 - var6;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lrj;I)V",
		garbageValue = "433467514"
	)
	public void method8402(class445 var1) {
		this.field4913[0] = var1.field4927;
		this.field4913[1] = var1.field4916;
		this.field4913[2] = var1.field4919;
		this.field4913[3] = 0.0F;
		this.field4913[4] = var1.field4924;
		this.field4913[5] = var1.field4920;
		this.field4913[6] = var1.field4921;
		this.field4913[7] = 0.0F;
		this.field4913[8] = var1.field4918;
		this.field4913[9] = var1.field4923;
		this.field4913[10] = var1.field4922;
		this.field4913[11] = 0.0F;
		this.field4913[12] = var1.field4925;
		this.field4913[13] = var1.field4926;
		this.field4913[14] = var1.field4917;
		this.field4913[15] = 1.0F;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "-43"
	)
	float method8403() {
		return this.field4913[3] * this.field4913[6] * this.field4913[9] * this.field4913[12] + (this.field4913[4] * this.field4913[2] * this.field4913[9] * this.field4913[15] + this.field4913[1] * this.field4913[6] * this.field4913[8] * this.field4913[15] + this.field4913[15] * this.field4913[10] * this.field4913[0] * this.field4913[5] - this.field4913[11] * this.field4913[0] * this.field4913[5] * this.field4913[14] - this.field4913[15] * this.field4913[9] * this.field4913[0] * this.field4913[6] + this.field4913[6] * this.field4913[0] * this.field4913[11] * this.field4913[13] + this.field4913[14] * this.field4913[9] * this.field4913[0] * this.field4913[7] - this.field4913[10] * this.field4913[0] * this.field4913[7] * this.field4913[13] - this.field4913[10] * this.field4913[4] * this.field4913[1] * this.field4913[15] + this.field4913[14] * this.field4913[1] * this.field4913[4] * this.field4913[11] - this.field4913[11] * this.field4913[6] * this.field4913[1] * this.field4913[12] - this.field4913[8] * this.field4913[7] * this.field4913[1] * this.field4913[14] + this.field4913[10] * this.field4913[1] * this.field4913[7] * this.field4913[12] - this.field4913[13] * this.field4913[2] * this.field4913[4] * this.field4913[11] - this.field4913[15] * this.field4913[8] * this.field4913[5] * this.field4913[2] + this.field4913[12] * this.field4913[5] * this.field4913[2] * this.field4913[11] + this.field4913[13] * this.field4913[7] * this.field4913[2] * this.field4913[8] - this.field4913[12] * this.field4913[2] * this.field4913[7] * this.field4913[9] - this.field4913[9] * this.field4913[4] * this.field4913[3] * this.field4913[14] + this.field4913[3] * this.field4913[4] * this.field4913[10] * this.field4913[13] + this.field4913[8] * this.field4913[3] * this.field4913[5] * this.field4913[14] - this.field4913[12] * this.field4913[5] * this.field4913[3] * this.field4913[10] - this.field4913[13] * this.field4913[6] * this.field4913[3] * this.field4913[8]);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-77"
	)
	public void method8419() {
		float var1 = 1.0F / this.method8403();
		float var2 = var1 * (this.field4913[13] * this.field4913[6] * this.field4913[11] + (this.field4913[15] * this.field4913[5] * this.field4913[10] - this.field4913[14] * this.field4913[11] * this.field4913[5] - this.field4913[9] * this.field4913[6] * this.field4913[15]) + this.field4913[14] * this.field4913[7] * this.field4913[9] - this.field4913[13] * this.field4913[10] * this.field4913[7]);
		float var3 = (this.field4913[14] * this.field4913[1] * this.field4913[11] + this.field4913[10] * -this.field4913[1] * this.field4913[15] + this.field4913[15] * this.field4913[2] * this.field4913[9] - this.field4913[13] * this.field4913[11] * this.field4913[2] - this.field4913[14] * this.field4913[9] * this.field4913[3] + this.field4913[10] * this.field4913[3] * this.field4913[13]) * var1;
		float var4 = var1 * (this.field4913[13] * this.field4913[7] * this.field4913[2] + (this.field4913[6] * this.field4913[1] * this.field4913[15] - this.field4913[14] * this.field4913[1] * this.field4913[7] - this.field4913[5] * this.field4913[2] * this.field4913[15]) + this.field4913[3] * this.field4913[5] * this.field4913[14] - this.field4913[3] * this.field4913[6] * this.field4913[13]);
		float var5 = (this.field4913[11] * this.field4913[2] * this.field4913[5] + -this.field4913[1] * this.field4913[6] * this.field4913[11] + this.field4913[10] * this.field4913[1] * this.field4913[7] - this.field4913[2] * this.field4913[7] * this.field4913[9] - this.field4913[10] * this.field4913[5] * this.field4913[3] + this.field4913[3] * this.field4913[6] * this.field4913[9]) * var1;
		float var6 = var1 * (this.field4913[12] * this.field4913[7] * this.field4913[10] + (this.field4913[14] * this.field4913[11] * this.field4913[4] + this.field4913[15] * -this.field4913[4] * this.field4913[10] + this.field4913[15] * this.field4913[6] * this.field4913[8] - this.field4913[12] * this.field4913[6] * this.field4913[11] - this.field4913[14] * this.field4913[8] * this.field4913[7]));
		float var7 = (this.field4913[14] * this.field4913[3] * this.field4913[8] + this.field4913[11] * this.field4913[2] * this.field4913[12] + (this.field4913[10] * this.field4913[0] * this.field4913[15] - this.field4913[14] * this.field4913[11] * this.field4913[0] - this.field4913[8] * this.field4913[2] * this.field4913[15]) - this.field4913[12] * this.field4913[3] * this.field4913[10]) * var1;
		float var8 = (this.field4913[0] * this.field4913[7] * this.field4913[14] + this.field4913[6] * -this.field4913[0] * this.field4913[15] + this.field4913[15] * this.field4913[4] * this.field4913[2] - this.field4913[7] * this.field4913[2] * this.field4913[12] - this.field4913[3] * this.field4913[4] * this.field4913[14] + this.field4913[3] * this.field4913[6] * this.field4913[12]) * var1;
		float var9 = var1 * (this.field4913[7] * this.field4913[2] * this.field4913[8] + (this.field4913[11] * this.field4913[6] * this.field4913[0] - this.field4913[0] * this.field4913[7] * this.field4913[10] - this.field4913[4] * this.field4913[2] * this.field4913[11]) + this.field4913[3] * this.field4913[4] * this.field4913[10] - this.field4913[8] * this.field4913[3] * this.field4913[6]);
		float var10 = (this.field4913[7] * this.field4913[8] * this.field4913[13] + this.field4913[12] * this.field4913[11] * this.field4913[5] + (this.field4913[4] * this.field4913[9] * this.field4913[15] - this.field4913[13] * this.field4913[11] * this.field4913[4] - this.field4913[5] * this.field4913[8] * this.field4913[15]) - this.field4913[7] * this.field4913[9] * this.field4913[12]) * var1;
		float var11 = var1 * (this.field4913[13] * this.field4913[0] * this.field4913[11] + this.field4913[9] * -this.field4913[0] * this.field4913[15] + this.field4913[1] * this.field4913[8] * this.field4913[15] - this.field4913[1] * this.field4913[11] * this.field4913[12] - this.field4913[8] * this.field4913[3] * this.field4913[13] + this.field4913[12] * this.field4913[3] * this.field4913[9]);
		float var12 = (this.field4913[15] * this.field4913[5] * this.field4913[0] - this.field4913[0] * this.field4913[7] * this.field4913[13] - this.field4913[15] * this.field4913[4] * this.field4913[1] + this.field4913[12] * this.field4913[7] * this.field4913[1] + this.field4913[3] * this.field4913[4] * this.field4913[13] - this.field4913[3] * this.field4913[5] * this.field4913[12]) * var1;
		float var13 = var1 * (this.field4913[1] * this.field4913[4] * this.field4913[11] + this.field4913[7] * this.field4913[0] * this.field4913[9] + -this.field4913[0] * this.field4913[5] * this.field4913[11] - this.field4913[7] * this.field4913[1] * this.field4913[8] - this.field4913[9] * this.field4913[3] * this.field4913[4] + this.field4913[8] * this.field4913[3] * this.field4913[5]);
		float var14 = var1 * (this.field4913[4] * this.field4913[10] * this.field4913[13] + this.field4913[14] * this.field4913[9] * -this.field4913[4] + this.field4913[14] * this.field4913[5] * this.field4913[8] - this.field4913[5] * this.field4913[10] * this.field4913[12] - this.field4913[13] * this.field4913[6] * this.field4913[8] + this.field4913[12] * this.field4913[9] * this.field4913[6]);
		float var15 = (this.field4913[2] * this.field4913[8] * this.field4913[13] + this.field4913[10] * this.field4913[1] * this.field4913[12] + (this.field4913[0] * this.field4913[9] * this.field4913[14] - this.field4913[0] * this.field4913[10] * this.field4913[13] - this.field4913[14] * this.field4913[8] * this.field4913[1]) - this.field4913[12] * this.field4913[9] * this.field4913[2]) * var1;
		float var16 = (this.field4913[12] * this.field4913[5] * this.field4913[2] + (-this.field4913[0] * this.field4913[5] * this.field4913[14] + this.field4913[0] * this.field4913[6] * this.field4913[13] + this.field4913[14] * this.field4913[1] * this.field4913[4] - this.field4913[12] * this.field4913[1] * this.field4913[6] - this.field4913[2] * this.field4913[4] * this.field4913[13])) * var1;
		float var17 = (this.field4913[0] * this.field4913[5] * this.field4913[10] - this.field4913[6] * this.field4913[0] * this.field4913[9] - this.field4913[1] * this.field4913[4] * this.field4913[10] + this.field4913[8] * this.field4913[6] * this.field4913[1] + this.field4913[9] * this.field4913[4] * this.field4913[2] - this.field4913[2] * this.field4913[5] * this.field4913[8]) * var1;
		this.field4913[0] = var2;
		this.field4913[1] = var3;
		this.field4913[2] = var4;
		this.field4913[3] = var5;
		this.field4913[4] = var6;
		this.field4913[5] = var7;
		this.field4913[6] = var8;
		this.field4913[7] = var9;
		this.field4913[8] = var10;
		this.field4913[9] = var11;
		this.field4913[10] = var12;
		this.field4913[11] = var13;
		this.field4913[12] = var14;
		this.field4913[13] = var15;
		this.field4913[14] = var16;
		this.field4913[15] = var17;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "-1002686599"
	)
	public void method8405(float var1, float var2, float var3, float var4) {
		this.field4913[0] = var1;
		this.field4913[1] = 0.0F;
		this.field4913[2] = 0.0F;
		this.field4913[3] = 0.0F;
		this.field4913[4] = 0.0F;
		this.field4913[5] = var2;
		this.field4913[6] = 0.0F;
		this.field4913[7] = 0.0F;
		this.field4913[8] = 0.0F;
		this.field4913[9] = 0.0F;
		this.field4913[10] = var3;
		this.field4913[11] = 0.0F;
		this.field4913[12] = 0.0F;
		this.field4913[13] = 0.0F;
		this.field4913[14] = 0.0F;
		this.field4913[15] = var4;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(FFF[FB)V",
		garbageValue = "104"
	)
	@Export("transformPoint")
	public void transformPoint(float var1, float var2, float var3, float[] var4) {
		var4[0] = this.field4913[12] + this.field4913[0] * var1 + this.field4913[4] * var2 + this.field4913[8] * var3;
		var4[1] = this.field4913[13] + this.field4913[9] * var3 + this.field4913[1] * var1 + this.field4913[5] * var2;
		var4[2] = this.field4913[14] + var3 * this.field4913[10] + var1 * this.field4913[2] + this.field4913[6] * var2;
		if (var4.length > 3) {
			var4[3] = this.field4913[15] + var1 * this.field4913[3] + this.field4913[7] * var2 + this.field4913[11] * var3;
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(FFFB)Lrp;",
		garbageValue = "14"
	)
	public class442 method8440(float var1, float var2, float var3) {
		float var4 = 1.0F / (this.field4913[15] + this.field4913[11] * var3 + this.field4913[7] * var2 + this.field4913[3] * var1);
		return EnumComposition.method3908((var3 * this.field4913[8] + this.field4913[4] * var2 + var1 * this.field4913[0] + this.field4913[12]) * var4, (this.field4913[13] + this.field4913[1] * var1 + var2 * this.field4913[5] + this.field4913[9] * var3) * var4, (this.field4913[14] + this.field4913[10] * var3 + var2 * this.field4913[6] + this.field4913[2] * var1) * var4);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(FFFI)F",
		garbageValue = "-1583893944"
	)
	public float method8408(float var1, float var2, float var3) {
		return this.field4913[4] * var2 + this.field4913[0] * var1 + var3 * this.field4913[8] + this.field4913[12];
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(FFFB)F",
		garbageValue = "6"
	)
	public float method8409(float var1, float var2, float var3) {
		return this.field4913[9] * var3 + var2 * this.field4913[5] + var1 * this.field4913[1] + this.field4913[13];
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(FFFB)F",
		garbageValue = "-21"
	)
	public float method8410(float var1, float var2, float var3) {
		return var3 * this.field4913[10] + this.field4913[2] * var1 + this.field4913[6] * var2 + this.field4913[14];
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "-2001738498"
	)
	public float[] method8451() {
		float[] var1 = new float[3];
		class442 var2 = new class442(this.field4913[0], this.field4913[1], this.field4913[2]);
		class442 var3 = new class442(this.field4913[4], this.field4913[5], this.field4913[6]);
		class442 var4 = new class442(this.field4913[8], this.field4913[9], this.field4913[10]);
		var1[0] = var2.method8304();
		var1[1] = var3.method8304();
		var1[2] = var4.method8304();
		return var1;
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder();
		this.method8406();
		this.method8391();

		for (int var2 = 0; var2 < 4; ++var2) {
			for (int var3 = 0; var3 < 4; ++var3) {
				if (var3 > 0) {
					var1.append("\t");
				}

				float var4 = this.field4913[var3 + var2 * 4];
				if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) {
					var4 = 0.0F;
				}

				var1.append(var4);
			}

			var1.append("\n");
		}

		return var1.toString();
	}

	public int hashCode() {
		boolean var1 = true;
		byte var2 = 1;
		int var3 = 31 * var2 + Arrays.hashCode(this.field4913);
		return var3;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof TransformationMatrix)) {
			return false;
		} else {
			TransformationMatrix var2 = (TransformationMatrix)var1;

			for (int var3 = 0; var3 < 16; ++var3) {
				if (this.field4913[var3] != var2.field4913[var3]) {
					return false;
				}
			}

			return true;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lao;B)Lad;",
		garbageValue = "1"
	)
	public static class3 method8478(class6 var0) {
		switch(var0.field17) {
		case 0:
			return new class0();
		default:
			throw new IllegalArgumentException();
		}
	}
}
