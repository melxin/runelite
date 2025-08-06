import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rr")
@Implements("TransformationMatrix")
public final class TransformationMatrix {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lrr;"
	)
	public static final TransformationMatrix field5075;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Lrr;"
	)
	public static TransformationMatrix[] field5073;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -259849103
	)
	static int field5071;
	@ObfuscatedName("as")
	public float[] field5074;

	static {
		field5075 = new TransformationMatrix();
		field5073 = new TransformationMatrix[0];
		LoginState.method816(16);
	}

	public TransformationMatrix() {
		this.field5074 = new float[16];
		this.method9108();
	}

	@ObfuscatedSignature(
		descriptor = "(Lrr;)V"
	)
	public TransformationMatrix(TransformationMatrix var1) {
		this.field5074 = new float[16];
		this.method9110(var1);
	}

	@ObfuscatedSignature(
		descriptor = "(Lwj;Z)V"
	)
	public TransformationMatrix(Buffer var1, boolean var2) {
		this.field5074 = new float[16];
		this.method9105(var1, var2);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "54"
	)
	public void method9104() {
		synchronized(field5073) {
			if (class359.field3967 < field5071) {
				field5073[++class359.field3967 - 1] = this;
			}

		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lwj;ZI)V",
		garbageValue = "-1748215575"
	)
	void method9105(Buffer var1, boolean var2) {
		if (var2) {
			class451 var4 = new class451();
			var4.method9195(class1.method9(var1.readShort()));
			var4.method9205(class1.method9(var1.readShort()));
			var4.method9194(class1.method9(var1.readShort()));
			var4.method9191((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort());
			this.method9117(var4);
		} else {
			for (int var3 = 0; var3 < 16; ++var3) {
				this.field5074[var3] = var1.method11235();
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "-106"
	)
	float[] method9162() {
		float[] var1 = new float[3];
		if ((double)this.field5074[2] < 0.999D && (double)this.field5074[2] > -0.999D) {
			var1[1] = (float)(-Math.asin((double)this.field5074[2]));
			double var2 = Math.cos((double)var1[1]);
			var1[0] = (float)Math.atan2((double)this.field5074[6] / var2, (double)this.field5074[10] / var2);
			var1[2] = (float)Math.atan2((double)this.field5074[1] / var2, (double)this.field5074[0] / var2);
		} else {
			var1[0] = 0.0F;
			var1[1] = (float)Math.atan2((double)this.field5074[2], 0.0D);
			var1[2] = (float)Math.atan2((double)(-this.field5074[9]), (double)this.field5074[5]);
		}

		return var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "1132553953"
	)
	public float[] method9114() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field5074[6])), 0.0F, 0.0F};
		double var2 = Math.cos((double)var1[0]);
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) {
			var4 = (double)this.field5074[2];
			var6 = (double)this.field5074[10];
			double var8 = (double)this.field5074[4];
			double var10 = (double)this.field5074[5];
			var1[1] = (float)Math.atan2(var4, var6);
			var1[2] = (float)Math.atan2(var8, var10);
		} else {
			var4 = (double)this.field5074[1];
			var6 = (double)this.field5074[0];
			if (this.field5074[6] < 0.0F) {
				var1[1] = (float)Math.atan2(var4, var6);
			} else {
				var1[1] = (float)(-Math.atan2(var4, var6));
			}

			var1[2] = 0.0F;
		}

		return var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-101"
	)
	void method9108() {
		this.field5074[0] = 1.0F;
		this.field5074[1] = 0.0F;
		this.field5074[2] = 0.0F;
		this.field5074[3] = 0.0F;
		this.field5074[4] = 0.0F;
		this.field5074[5] = 1.0F;
		this.field5074[6] = 0.0F;
		this.field5074[7] = 0.0F;
		this.field5074[8] = 0.0F;
		this.field5074[9] = 0.0F;
		this.field5074[10] = 1.0F;
		this.field5074[11] = 0.0F;
		this.field5074[12] = 0.0F;
		this.field5074[13] = 0.0F;
		this.field5074[14] = 0.0F;
		this.field5074[15] = 1.0F;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "307471634"
	)
	public void method9109() {
		this.field5074[0] = 0.0F;
		this.field5074[1] = 0.0F;
		this.field5074[2] = 0.0F;
		this.field5074[3] = 0.0F;
		this.field5074[4] = 0.0F;
		this.field5074[5] = 0.0F;
		this.field5074[6] = 0.0F;
		this.field5074[7] = 0.0F;
		this.field5074[8] = 0.0F;
		this.field5074[9] = 0.0F;
		this.field5074[10] = 0.0F;
		this.field5074[11] = 0.0F;
		this.field5074[12] = 0.0F;
		this.field5074[13] = 0.0F;
		this.field5074[14] = 0.0F;
		this.field5074[15] = 0.0F;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lrr;I)V",
		garbageValue = "1170587637"
	)
	public void method9110(TransformationMatrix var1) {
		System.arraycopy(var1.field5074, 0, this.field5074, 0, 16);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "2005701485"
	)
	public void method9111(float var1) {
		this.method9139(var1, var1, var1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "-1871585402"
	)
	public void method9139(float var1, float var2, float var3) {
		this.method9108();
		this.field5074[0] = var1;
		this.field5074[5] = var2;
		this.field5074[10] = var3;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lrr;B)V",
		garbageValue = "-108"
	)
	public void method9112(TransformationMatrix var1) {
		for (int var2 = 0; var2 < this.field5074.length; ++var2) {
			float[] var10000 = this.field5074;
			var10000[var2] += var1.field5074[var2];
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lrr;I)V",
		garbageValue = "1631095545"
	)
	public void method9172(TransformationMatrix var1) {
		float var2 = var1.field5074[8] * this.field5074[2] + this.field5074[1] * var1.field5074[4] + this.field5074[0] * var1.field5074[0] + var1.field5074[12] * this.field5074[3];
		float var3 = this.field5074[3] * var1.field5074[13] + var1.field5074[1] * this.field5074[0] + this.field5074[1] * var1.field5074[5] + this.field5074[2] * var1.field5074[9];
		float var4 = var1.field5074[2] * this.field5074[0] + var1.field5074[6] * this.field5074[1] + var1.field5074[10] * this.field5074[2] + this.field5074[3] * var1.field5074[14];
		float var5 = this.field5074[0] * var1.field5074[3] + var1.field5074[7] * this.field5074[1] + var1.field5074[11] * this.field5074[2] + this.field5074[3] * var1.field5074[15];
		float var6 = var1.field5074[4] * this.field5074[5] + this.field5074[4] * var1.field5074[0] + this.field5074[6] * var1.field5074[8] + var1.field5074[12] * this.field5074[7];
		float var7 = var1.field5074[13] * this.field5074[7] + var1.field5074[9] * this.field5074[6] + this.field5074[4] * var1.field5074[1] + var1.field5074[5] * this.field5074[5];
		float var8 = var1.field5074[14] * this.field5074[7] + var1.field5074[10] * this.field5074[6] + var1.field5074[2] * this.field5074[4] + this.field5074[5] * var1.field5074[6];
		float var9 = this.field5074[6] * var1.field5074[11] + var1.field5074[7] * this.field5074[5] + var1.field5074[3] * this.field5074[4] + var1.field5074[15] * this.field5074[7];
		float var10 = var1.field5074[0] * this.field5074[8] + this.field5074[9] * var1.field5074[4] + this.field5074[10] * var1.field5074[8] + var1.field5074[12] * this.field5074[11];
		float var11 = this.field5074[9] * var1.field5074[5] + this.field5074[8] * var1.field5074[1] + var1.field5074[9] * this.field5074[10] + this.field5074[11] * var1.field5074[13];
		float var12 = var1.field5074[14] * this.field5074[11] + this.field5074[9] * var1.field5074[6] + var1.field5074[2] * this.field5074[8] + var1.field5074[10] * this.field5074[10];
		float var13 = this.field5074[11] * var1.field5074[15] + this.field5074[10] * var1.field5074[11] + var1.field5074[3] * this.field5074[8] + this.field5074[9] * var1.field5074[7];
		float var14 = var1.field5074[0] * this.field5074[12] + var1.field5074[4] * this.field5074[13] + var1.field5074[8] * this.field5074[14] + this.field5074[15] * var1.field5074[12];
		float var15 = var1.field5074[13] * this.field5074[15] + var1.field5074[5] * this.field5074[13] + var1.field5074[1] * this.field5074[12] + this.field5074[14] * var1.field5074[9];
		float var16 = var1.field5074[14] * this.field5074[15] + var1.field5074[10] * this.field5074[14] + this.field5074[12] * var1.field5074[2] + this.field5074[13] * var1.field5074[6];
		float var17 = var1.field5074[11] * this.field5074[14] + this.field5074[12] * var1.field5074[3] + var1.field5074[7] * this.field5074[13] + var1.field5074[15] * this.field5074[15];
		this.field5074[0] = var2;
		this.field5074[1] = var3;
		this.field5074[2] = var4;
		this.field5074[3] = var5;
		this.field5074[4] = var6;
		this.field5074[5] = var7;
		this.field5074[6] = var8;
		this.field5074[7] = var9;
		this.field5074[8] = var10;
		this.field5074[9] = var11;
		this.field5074[10] = var12;
		this.field5074[11] = var13;
		this.field5074[12] = var14;
		this.field5074[13] = var15;
		this.field5074[14] = var16;
		this.field5074[15] = var17;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lrp;I)V",
		garbageValue = "418911304"
	)
	public void method9115(class444 var1) {
		float var2 = var1.field5037.field5069 * var1.field5037.field5069;
		float var3 = var1.field5037.field5063 * var1.field5037.field5069;
		float var4 = var1.field5037.field5067 * var1.field5037.field5069;
		float var5 = var1.field5037.field5069 * var1.field5037.field5066;
		float var6 = var1.field5037.field5063 * var1.field5037.field5063;
		float var7 = var1.field5037.field5063 * var1.field5037.field5067;
		float var8 = var1.field5037.field5066 * var1.field5037.field5063;
		float var9 = var1.field5037.field5067 * var1.field5037.field5067;
		float var10 = var1.field5037.field5066 * var1.field5037.field5067;
		float var11 = var1.field5037.field5066 * var1.field5037.field5066;
		this.field5074[0] = var6 + var2 - var11 - var9;
		this.field5074[1] = var7 + var7 + var5 + var5;
		this.field5074[2] = var8 + (var8 - var4 - var4);
		this.field5074[4] = var7 + (var7 - var5 - var5);
		this.field5074[5] = var2 + var9 - var6 - var11;
		this.field5074[6] = var10 + var3 + var10 + var3;
		this.field5074[8] = var8 + var4 + var8 + var4;
		this.field5074[9] = var10 + (var10 - var3 - var3);
		this.field5074[10] = var2 + var11 - var9 - var6;
		float[] var12 = this.field5074;
		float[] var13 = this.field5074;
		this.field5074[11] = 0.0F;
		var13[7] = 0.0F;
		var12[3] = 0.0F;
		this.field5074[12] = var1.field5038.field5059;
		this.field5074[13] = var1.field5038.field5060;
		this.field5074[14] = var1.field5038.field5054;
		this.field5074[15] = 1.0F;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lrc;B)V",
		garbageValue = "80"
	)
	public void method9116(class449 var1) {
		float var2 = var1.field5069 * var1.field5069;
		float var3 = var1.field5063 * var1.field5069;
		float var4 = var1.field5067 * var1.field5069;
		float var5 = var1.field5069 * var1.field5066;
		float var6 = var1.field5063 * var1.field5063;
		float var7 = var1.field5063 * var1.field5067;
		float var8 = var1.field5066 * var1.field5063;
		float var9 = var1.field5067 * var1.field5067;
		float var10 = var1.field5066 * var1.field5067;
		float var11 = var1.field5066 * var1.field5066;
		this.field5074[0] = var2 + var6 - var11 - var9;
		this.field5074[1] = var5 + var5 + var7 + var7;
		this.field5074[2] = var8 + (var8 - var4 - var4);
		this.field5074[4] = var7 + (var7 - var5 - var5);
		this.field5074[5] = var2 + var9 - var6 - var11;
		this.field5074[6] = var3 + var10 + var3 + var10;
		this.field5074[8] = var4 + var8 + var8 + var4;
		this.field5074[9] = var10 + (var10 - var3 - var3);
		this.field5074[10] = var2 + var11 - var9 - var6;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lrq;I)V",
		garbageValue = "-1441719913"
	)
	public void method9117(class451 var1) {
		this.field5074[0] = var1.field5077;
		this.field5074[1] = var1.field5081;
		this.field5074[2] = var1.field5078;
		this.field5074[3] = 0.0F;
		this.field5074[4] = var1.field5079;
		this.field5074[5] = var1.field5080;
		this.field5074[6] = var1.field5076;
		this.field5074[7] = 0.0F;
		this.field5074[8] = var1.field5082;
		this.field5074[9] = var1.field5086;
		this.field5074[10] = var1.field5083;
		this.field5074[11] = 0.0F;
		this.field5074[12] = var1.field5085;
		this.field5074[13] = var1.field5084;
		this.field5074[14] = var1.field5087;
		this.field5074[15] = 1.0F;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "-1"
	)
	float method9118() {
		return this.field5074[3] * this.field5074[6] * this.field5074[9] * this.field5074[12] + (this.field5074[5] * this.field5074[3] * this.field5074[8] * this.field5074[14] + this.field5074[10] * this.field5074[4] * this.field5074[3] * this.field5074[13] + (this.field5074[2] * this.field5074[7] * this.field5074[8] * this.field5074[13] + this.field5074[9] * this.field5074[2] * this.field5074[4] * this.field5074[15] + this.field5074[12] * this.field5074[7] * this.field5074[1] * this.field5074[10] + (this.field5074[15] * this.field5074[8] * this.field5074[1] * this.field5074[6] + this.field5074[10] * this.field5074[0] * this.field5074[5] * this.field5074[15] - this.field5074[14] * this.field5074[0] * this.field5074[5] * this.field5074[11] - this.field5074[0] * this.field5074[6] * this.field5074[9] * this.field5074[15] + this.field5074[0] * this.field5074[6] * this.field5074[11] * this.field5074[13] + this.field5074[7] * this.field5074[0] * this.field5074[9] * this.field5074[14] - this.field5074[7] * this.field5074[0] * this.field5074[10] * this.field5074[13] - this.field5074[15] * this.field5074[1] * this.field5074[4] * this.field5074[10] + this.field5074[1] * this.field5074[4] * this.field5074[11] * this.field5074[14] - this.field5074[12] * this.field5074[1] * this.field5074[6] * this.field5074[11] - this.field5074[8] * this.field5074[7] * this.field5074[1] * this.field5074[14]) - this.field5074[2] * this.field5074[4] * this.field5074[11] * this.field5074[13] - this.field5074[8] * this.field5074[5] * this.field5074[2] * this.field5074[15] + this.field5074[12] * this.field5074[11] * this.field5074[2] * this.field5074[5] - this.field5074[12] * this.field5074[9] * this.field5074[7] * this.field5074[2] - this.field5074[3] * this.field5074[4] * this.field5074[9] * this.field5074[14]) - this.field5074[12] * this.field5074[10] * this.field5074[5] * this.field5074[3] - this.field5074[3] * this.field5074[6] * this.field5074[8] * this.field5074[13]);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	public void method9119() {
		float var1 = 1.0F / this.method9118();
		float var2 = var1 * (this.field5074[13] * this.field5074[6] * this.field5074[11] + (this.field5074[10] * this.field5074[5] * this.field5074[15] - this.field5074[11] * this.field5074[5] * this.field5074[14] - this.field5074[6] * this.field5074[9] * this.field5074[15]) + this.field5074[14] * this.field5074[7] * this.field5074[9] - this.field5074[13] * this.field5074[10] * this.field5074[7]);
		float var3 = (this.field5074[15] * this.field5074[10] * -this.field5074[1] + this.field5074[14] * this.field5074[1] * this.field5074[11] + this.field5074[9] * this.field5074[2] * this.field5074[15] - this.field5074[2] * this.field5074[11] * this.field5074[13] - this.field5074[9] * this.field5074[3] * this.field5074[14] + this.field5074[3] * this.field5074[10] * this.field5074[13]) * var1;
		float var4 = var1 * (this.field5074[15] * this.field5074[6] * this.field5074[1] - this.field5074[14] * this.field5074[7] * this.field5074[1] - this.field5074[5] * this.field5074[2] * this.field5074[15] + this.field5074[13] * this.field5074[7] * this.field5074[2] + this.field5074[3] * this.field5074[5] * this.field5074[14] - this.field5074[13] * this.field5074[6] * this.field5074[3]);
		float var5 = (this.field5074[11] * this.field5074[5] * this.field5074[2] + this.field5074[6] * -this.field5074[1] * this.field5074[11] + this.field5074[10] * this.field5074[7] * this.field5074[1] - this.field5074[9] * this.field5074[2] * this.field5074[7] - this.field5074[3] * this.field5074[5] * this.field5074[10] + this.field5074[3] * this.field5074[6] * this.field5074[9]) * var1;
		float var6 = var1 * (-this.field5074[4] * this.field5074[10] * this.field5074[15] + this.field5074[14] * this.field5074[11] * this.field5074[4] + this.field5074[6] * this.field5074[8] * this.field5074[15] - this.field5074[6] * this.field5074[11] * this.field5074[12] - this.field5074[14] * this.field5074[8] * this.field5074[7] + this.field5074[10] * this.field5074[7] * this.field5074[12]);
		float var7 = (this.field5074[12] * this.field5074[11] * this.field5074[2] + (this.field5074[10] * this.field5074[0] * this.field5074[15] - this.field5074[14] * this.field5074[11] * this.field5074[0] - this.field5074[15] * this.field5074[2] * this.field5074[8]) + this.field5074[14] * this.field5074[8] * this.field5074[3] - this.field5074[12] * this.field5074[3] * this.field5074[10]) * var1;
		float var8 = (this.field5074[12] * this.field5074[3] * this.field5074[6] + (this.field5074[0] * this.field5074[7] * this.field5074[14] + this.field5074[15] * this.field5074[6] * -this.field5074[0] + this.field5074[2] * this.field5074[4] * this.field5074[15] - this.field5074[12] * this.field5074[2] * this.field5074[7] - this.field5074[3] * this.field5074[4] * this.field5074[14])) * var1;
		float var9 = var1 * (this.field5074[0] * this.field5074[6] * this.field5074[11] - this.field5074[0] * this.field5074[7] * this.field5074[10] - this.field5074[2] * this.field5074[4] * this.field5074[11] + this.field5074[2] * this.field5074[7] * this.field5074[8] + this.field5074[10] * this.field5074[4] * this.field5074[3] - this.field5074[3] * this.field5074[6] * this.field5074[8]);
		float var10 = (this.field5074[13] * this.field5074[7] * this.field5074[8] + this.field5074[5] * this.field5074[11] * this.field5074[12] + (this.field5074[15] * this.field5074[9] * this.field5074[4] - this.field5074[11] * this.field5074[4] * this.field5074[13] - this.field5074[15] * this.field5074[8] * this.field5074[5]) - this.field5074[9] * this.field5074[7] * this.field5074[12]) * var1;
		float var11 = (this.field5074[12] * this.field5074[3] * this.field5074[9] + (this.field5074[15] * this.field5074[8] * this.field5074[1] + this.field5074[9] * -this.field5074[0] * this.field5074[15] + this.field5074[13] * this.field5074[0] * this.field5074[11] - this.field5074[12] * this.field5074[11] * this.field5074[1] - this.field5074[13] * this.field5074[3] * this.field5074[8])) * var1;
		float var12 = var1 * (this.field5074[13] * this.field5074[3] * this.field5074[4] + this.field5074[5] * this.field5074[0] * this.field5074[15] - this.field5074[7] * this.field5074[0] * this.field5074[13] - this.field5074[15] * this.field5074[4] * this.field5074[1] + this.field5074[7] * this.field5074[1] * this.field5074[12] - this.field5074[5] * this.field5074[3] * this.field5074[12]);
		float var13 = (this.field5074[9] * this.field5074[0] * this.field5074[7] + this.field5074[11] * -this.field5074[0] * this.field5074[5] + this.field5074[11] * this.field5074[1] * this.field5074[4] - this.field5074[8] * this.field5074[1] * this.field5074[7] - this.field5074[9] * this.field5074[3] * this.field5074[4] + this.field5074[5] * this.field5074[3] * this.field5074[8]) * var1;
		float var14 = var1 * (this.field5074[8] * this.field5074[5] * this.field5074[14] + this.field5074[14] * -this.field5074[4] * this.field5074[9] + this.field5074[13] * this.field5074[4] * this.field5074[10] - this.field5074[12] * this.field5074[5] * this.field5074[10] - this.field5074[6] * this.field5074[8] * this.field5074[13] + this.field5074[9] * this.field5074[6] * this.field5074[12]);
		float var15 = var1 * (this.field5074[10] * this.field5074[1] * this.field5074[12] + (this.field5074[0] * this.field5074[9] * this.field5074[14] - this.field5074[10] * this.field5074[0] * this.field5074[13] - this.field5074[14] * this.field5074[8] * this.field5074[1]) + this.field5074[13] * this.field5074[2] * this.field5074[8] - this.field5074[2] * this.field5074[9] * this.field5074[12]);
		float var16 = (this.field5074[12] * this.field5074[5] * this.field5074[2] + (this.field5074[1] * this.field5074[4] * this.field5074[14] + -this.field5074[0] * this.field5074[5] * this.field5074[14] + this.field5074[0] * this.field5074[6] * this.field5074[13] - this.field5074[12] * this.field5074[1] * this.field5074[6] - this.field5074[13] * this.field5074[4] * this.field5074[2])) * var1;
		float var17 = (this.field5074[9] * this.field5074[2] * this.field5074[4] + this.field5074[10] * this.field5074[5] * this.field5074[0] - this.field5074[9] * this.field5074[0] * this.field5074[6] - this.field5074[4] * this.field5074[1] * this.field5074[10] + this.field5074[8] * this.field5074[6] * this.field5074[1] - this.field5074[5] * this.field5074[2] * this.field5074[8]) * var1;
		this.field5074[0] = var2;
		this.field5074[1] = var3;
		this.field5074[2] = var4;
		this.field5074[3] = var5;
		this.field5074[4] = var6;
		this.field5074[5] = var7;
		this.field5074[6] = var8;
		this.field5074[7] = var9;
		this.field5074[8] = var10;
		this.field5074[9] = var11;
		this.field5074[10] = var12;
		this.field5074[11] = var13;
		this.field5074[12] = var14;
		this.field5074[13] = var15;
		this.field5074[14] = var16;
		this.field5074[15] = var17;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(FFFFB)V",
		garbageValue = "114"
	)
	public void method9120(float var1, float var2, float var3, float var4) {
		this.field5074[0] = var1;
		this.field5074[1] = 0.0F;
		this.field5074[2] = 0.0F;
		this.field5074[3] = 0.0F;
		this.field5074[4] = 0.0F;
		this.field5074[5] = var2;
		this.field5074[6] = 0.0F;
		this.field5074[7] = 0.0F;
		this.field5074[8] = 0.0F;
		this.field5074[9] = 0.0F;
		this.field5074[10] = var3;
		this.field5074[11] = 0.0F;
		this.field5074[12] = 0.0F;
		this.field5074[13] = 0.0F;
		this.field5074[14] = 0.0F;
		this.field5074[15] = var4;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(FFF[FI)V",
		garbageValue = "-1677705754"
	)
	@Export("transformPoint")
	public void transformPoint(float var1, float var2, float var3, float[] var4) {
		var4[0] = this.field5074[12] + var3 * this.field5074[8] + var2 * this.field5074[4] + this.field5074[0] * var1;
		var4[1] = this.field5074[13] + var2 * this.field5074[5] + var1 * this.field5074[1] + var3 * this.field5074[9];
		var4[2] = this.field5074[10] * var3 + this.field5074[6] * var2 + this.field5074[2] * var1 + this.field5074[14];
		if (var4.length > 3) {
			var4[3] = this.field5074[7] * var2 + var1 * this.field5074[3] + var3 * this.field5074[11] + this.field5074[15];
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(FFFI)Lrm;",
		garbageValue = "-2037833777"
	)
	public class448 method9122(float var1, float var2, float var3) {
		float var4 = 1.0F / (var3 * this.field5074[11] + this.field5074[7] * var2 + var1 * this.field5074[3] + this.field5074[15]);
		return ClientPreferences.method2599((this.field5074[12] + var1 * this.field5074[0] + var2 * this.field5074[4] + this.field5074[8] * var3) * var4, (this.field5074[13] + var2 * this.field5074[5] + var1 * this.field5074[1] + var3 * this.field5074[9]) * var4, var4 * (this.field5074[14] + var3 * this.field5074[10] + var1 * this.field5074[2] + this.field5074[6] * var2));
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(FFFB)F",
		garbageValue = "-110"
	)
	public float method9123(float var1, float var2, float var3) {
		return this.field5074[8] * var3 + this.field5074[0] * var1 + this.field5074[4] * var2 + this.field5074[12];
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(FFFI)F",
		garbageValue = "876420699"
	)
	public float method9103(float var1, float var2, float var3) {
		return this.field5074[13] + var1 * this.field5074[1] + this.field5074[5] * var2 + this.field5074[9] * var3;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(FFFB)F",
		garbageValue = "-8"
	)
	public float method9127(float var1, float var2, float var3) {
		return this.field5074[14] + var2 * this.field5074[6] + this.field5074[2] * var1 + var3 * this.field5074[10];
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "184922972"
	)
	public float[] method9143() {
		float[] var1 = new float[3];
		class448 var2 = new class448(this.field5074[0], this.field5074[1], this.field5074[2]);
		class448 var3 = new class448(this.field5074[4], this.field5074[5], this.field5074[6]);
		class448 var4 = new class448(this.field5074[8], this.field5074[9], this.field5074[10]);
		var1[0] = var2.method9031();
		var1[1] = var3.method9031();
		var1[2] = var4.method9031();
		return var1;
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder();
		this.method9114();
		this.method9162();

		for (int var2 = 0; var2 < 4; ++var2) {
			for (int var3 = 0; var3 < 4; ++var3) {
				if (var3 > 0) {
					var1.append("\t");
				}

				float var4 = this.field5074[var3 + var2 * 4];
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
		int var3 = var2 * 31 + Arrays.hashCode(this.field5074);
		return var3;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof TransformationMatrix)) {
			return false;
		} else {
			TransformationMatrix var2 = (TransformationMatrix)var1;

			for (int var3 = 0; var3 < 16; ++var3) {
				if (var2.field5074[var3] != this.field5074[var3]) {
					return false;
				}
			}

			return true;
		}
	}

	@ObfuscatedName("ow")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-186824695"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (MusicPatch.friendsChat != null) {
			PacketBufferNode var1 = class291.getPacketBufferNode(ClientPacket.CLAN_KICKUSER, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(class283.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
