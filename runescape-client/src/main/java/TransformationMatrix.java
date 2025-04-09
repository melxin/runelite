import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rm")
@Implements("TransformationMatrix")
public final class TransformationMatrix {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	public static final TransformationMatrix field4933;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lrm;"
	)
	public static TransformationMatrix[] field4932;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1548573847
	)
	static int field4935;
	@ObfuscatedName("aq")
	public float[] field4936;

	static {
		field4933 = new TransformationMatrix();
		field4932 = new TransformationMatrix[0];
		MidiPcmStream.method6754(16);
	}

	public TransformationMatrix() {
		this.field4936 = new float[16];
		this.method8485();
	}

	@ObfuscatedSignature(
		descriptor = "(Lrm;)V"
	)
	public TransformationMatrix(TransformationMatrix var1) {
		this.field4936 = new float[16];
		this.method8430(var1);
	}

	@ObfuscatedSignature(
		descriptor = "(Lve;Z)V"
	)
	public TransformationMatrix(Buffer var1, boolean var2) {
		this.field4936 = new float[16];
		this.method8423(var1, var2);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-810507251"
	)
	public void method8500() {
		synchronized(field4932) {
			if (class339.field3763 < field4935) {
				field4932[++class339.field3763 - 1] = this;
			}

		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lve;ZB)V",
		garbageValue = "-95"
	)
	void method8423(Buffer var1, boolean var2) {
		if (var2) {
			class445 var4 = new class445();
			var4.method8502(class256.method5324(var1.readShort()));
			var4.method8505(class256.method5324(var1.readShort()));
			var4.method8511(class256.method5324(var1.readShort()));
			var4.method8512((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort());
			this.method8437(var4);
		} else {
			for (int var3 = 0; var3 < 16; ++var3) {
				this.field4936[var3] = var1.method10305();
			}
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "-997073305"
	)
	float[] method8426() {
		float[] var1 = new float[3];
		if ((double)this.field4936[2] < 0.999D && (double)this.field4936[2] > -0.999D) {
			var1[1] = (float)(-Math.asin((double)this.field4936[2]));
			double var2 = Math.cos((double)var1[1]);
			var1[0] = (float)Math.atan2((double)this.field4936[6] / var2, (double)this.field4936[10] / var2);
			var1[2] = (float)Math.atan2((double)this.field4936[1] / var2, (double)this.field4936[0] / var2);
		} else {
			var1[0] = 0.0F;
			var1[1] = (float)Math.atan2((double)this.field4936[2], 0.0D);
			var1[2] = (float)Math.atan2((double)(-this.field4936[9]), (double)this.field4936[5]);
		}

		return var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "1965841571"
	)
	public float[] method8443() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field4936[6])), 0.0F, 0.0F};
		double var2 = Math.cos((double)var1[0]);
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) {
			var4 = (double)this.field4936[2];
			var6 = (double)this.field4936[10];
			double var8 = (double)this.field4936[4];
			double var10 = (double)this.field4936[5];
			var1[1] = (float)Math.atan2(var4, var6);
			var1[2] = (float)Math.atan2(var8, var10);
		} else {
			var4 = (double)this.field4936[1];
			var6 = (double)this.field4936[0];
			if (this.field4936[6] < 0.0F) {
				var1[1] = (float)Math.atan2(var4, var6);
			} else {
				var1[1] = (float)(-Math.atan2(var4, var6));
			}

			var1[2] = 0.0F;
		}

		return var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1538137456"
	)
	void method8485() {
		this.field4936[0] = 1.0F;
		this.field4936[1] = 0.0F;
		this.field4936[2] = 0.0F;
		this.field4936[3] = 0.0F;
		this.field4936[4] = 0.0F;
		this.field4936[5] = 1.0F;
		this.field4936[6] = 0.0F;
		this.field4936[7] = 0.0F;
		this.field4936[8] = 0.0F;
		this.field4936[9] = 0.0F;
		this.field4936[10] = 1.0F;
		this.field4936[11] = 0.0F;
		this.field4936[12] = 0.0F;
		this.field4936[13] = 0.0F;
		this.field4936[14] = 0.0F;
		this.field4936[15] = 1.0F;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1985050789"
	)
	public void method8429() {
		this.field4936[0] = 0.0F;
		this.field4936[1] = 0.0F;
		this.field4936[2] = 0.0F;
		this.field4936[3] = 0.0F;
		this.field4936[4] = 0.0F;
		this.field4936[5] = 0.0F;
		this.field4936[6] = 0.0F;
		this.field4936[7] = 0.0F;
		this.field4936[8] = 0.0F;
		this.field4936[9] = 0.0F;
		this.field4936[10] = 0.0F;
		this.field4936[11] = 0.0F;
		this.field4936[12] = 0.0F;
		this.field4936[13] = 0.0F;
		this.field4936[14] = 0.0F;
		this.field4936[15] = 0.0F;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lrm;I)V",
		garbageValue = "-300850403"
	)
	public void method8430(TransformationMatrix var1) {
		System.arraycopy(var1.field4936, 0, this.field4936, 0, 16);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "0"
	)
	public void method8431(float var1) {
		this.method8432(var1, var1, var1);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "1830918664"
	)
	public void method8432(float var1, float var2, float var3) {
		this.method8485();
		this.field4936[0] = var1;
		this.field4936[5] = var2;
		this.field4936[10] = var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lrm;I)V",
		garbageValue = "-959021734"
	)
	public void method8433(TransformationMatrix var1) {
		for (int var2 = 0; var2 < this.field4936.length; ++var2) {
			float[] var10000 = this.field4936;
			var10000[var2] += var1.field4936[var2];
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lrm;B)V",
		garbageValue = "60"
	)
	public void method8450(TransformationMatrix var1) {
		float var2 = var1.field4936[8] * this.field4936[2] + this.field4936[0] * var1.field4936[0] + var1.field4936[4] * this.field4936[1] + var1.field4936[12] * this.field4936[3];
		float var3 = this.field4936[3] * var1.field4936[13] + var1.field4936[9] * this.field4936[2] + var1.field4936[5] * this.field4936[1] + var1.field4936[1] * this.field4936[0];
		float var4 = this.field4936[2] * var1.field4936[10] + var1.field4936[6] * this.field4936[1] + var1.field4936[2] * this.field4936[0] + this.field4936[3] * var1.field4936[14];
		float var5 = var1.field4936[11] * this.field4936[2] + var1.field4936[3] * this.field4936[0] + var1.field4936[7] * this.field4936[1] + var1.field4936[15] * this.field4936[3];
		float var6 = var1.field4936[8] * this.field4936[6] + this.field4936[5] * var1.field4936[4] + this.field4936[4] * var1.field4936[0] + this.field4936[7] * var1.field4936[12];
		float var7 = this.field4936[6] * var1.field4936[9] + this.field4936[5] * var1.field4936[5] + var1.field4936[1] * this.field4936[4] + var1.field4936[13] * this.field4936[7];
		float var8 = this.field4936[4] * var1.field4936[2] + var1.field4936[6] * this.field4936[5] + var1.field4936[10] * this.field4936[6] + var1.field4936[14] * this.field4936[7];
		float var9 = var1.field4936[15] * this.field4936[7] + this.field4936[6] * var1.field4936[11] + this.field4936[4] * var1.field4936[3] + this.field4936[5] * var1.field4936[7];
		float var10 = var1.field4936[4] * this.field4936[9] + this.field4936[8] * var1.field4936[0] + var1.field4936[8] * this.field4936[10] + this.field4936[11] * var1.field4936[12];
		float var11 = var1.field4936[13] * this.field4936[11] + var1.field4936[1] * this.field4936[8] + var1.field4936[5] * this.field4936[9] + var1.field4936[9] * this.field4936[10];
		float var12 = this.field4936[11] * var1.field4936[14] + this.field4936[8] * var1.field4936[2] + var1.field4936[6] * this.field4936[9] + var1.field4936[10] * this.field4936[10];
		float var13 = var1.field4936[3] * this.field4936[8] + var1.field4936[7] * this.field4936[9] + this.field4936[10] * var1.field4936[11] + this.field4936[11] * var1.field4936[15];
		float var14 = this.field4936[14] * var1.field4936[8] + this.field4936[13] * var1.field4936[4] + var1.field4936[0] * this.field4936[12] + this.field4936[15] * var1.field4936[12];
		float var15 = var1.field4936[13] * this.field4936[15] + this.field4936[14] * var1.field4936[9] + var1.field4936[1] * this.field4936[12] + this.field4936[13] * var1.field4936[5];
		float var16 = this.field4936[14] * var1.field4936[10] + this.field4936[12] * var1.field4936[2] + var1.field4936[6] * this.field4936[13] + var1.field4936[14] * this.field4936[15];
		float var17 = var1.field4936[15] * this.field4936[15] + var1.field4936[11] * this.field4936[14] + this.field4936[13] * var1.field4936[7] + var1.field4936[3] * this.field4936[12];
		this.field4936[0] = var2;
		this.field4936[1] = var3;
		this.field4936[2] = var4;
		this.field4936[3] = var5;
		this.field4936[4] = var6;
		this.field4936[5] = var7;
		this.field4936[6] = var8;
		this.field4936[7] = var9;
		this.field4936[8] = var10;
		this.field4936[9] = var11;
		this.field4936[10] = var12;
		this.field4936[11] = var13;
		this.field4936[12] = var14;
		this.field4936[13] = var15;
		this.field4936[14] = var16;
		this.field4936[15] = var17;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lqt;I)V",
		garbageValue = "-311587007"
	)
	public void method8435(class438 var1) {
		float var2 = var1.field4899.field4924 * var1.field4899.field4924;
		float var3 = var1.field4899.field4924 * var1.field4899.field4931;
		float var4 = var1.field4899.field4924 * var1.field4899.field4928;
		float var5 = var1.field4899.field4924 * var1.field4899.field4929;
		float var6 = var1.field4899.field4931 * var1.field4899.field4931;
		float var7 = var1.field4899.field4928 * var1.field4899.field4931;
		float var8 = var1.field4899.field4931 * var1.field4899.field4929;
		float var9 = var1.field4899.field4928 * var1.field4899.field4928;
		float var10 = var1.field4899.field4928 * var1.field4899.field4929;
		float var11 = var1.field4899.field4929 * var1.field4899.field4929;
		this.field4936[0] = var2 + var6 - var11 - var9;
		this.field4936[1] = var7 + var5 + var7 + var5;
		this.field4936[2] = var8 + (var8 - var4 - var4);
		this.field4936[4] = var7 - var5 - var5 + var7;
		this.field4936[5] = var2 + var9 - var6 - var11;
		this.field4936[6] = var3 + var3 + var10 + var10;
		this.field4936[8] = var4 + var4 + var8 + var8;
		this.field4936[9] = var10 - var3 - var3 + var10;
		this.field4936[10] = var11 + var2 - var9 - var6;
		float[] var12 = this.field4936;
		float[] var13 = this.field4936;
		this.field4936[11] = 0.0F;
		var13[7] = 0.0F;
		var12[3] = 0.0F;
		this.field4936[12] = var1.field4900.field4918;
		this.field4936[13] = var1.field4900.field4915;
		this.field4936[14] = var1.field4900.field4922;
		this.field4936[15] = 1.0F;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lrc;B)V",
		garbageValue = "100"
	)
	public void method8436(class443 var1) {
		float var2 = var1.field4924 * var1.field4924;
		float var3 = var1.field4924 * var1.field4931;
		float var4 = var1.field4928 * var1.field4924;
		float var5 = var1.field4924 * var1.field4929;
		float var6 = var1.field4931 * var1.field4931;
		float var7 = var1.field4931 * var1.field4928;
		float var8 = var1.field4929 * var1.field4931;
		float var9 = var1.field4928 * var1.field4928;
		float var10 = var1.field4929 * var1.field4928;
		float var11 = var1.field4929 * var1.field4929;
		this.field4936[0] = var2 + var6 - var11 - var9;
		this.field4936[1] = var7 + var7 + var5 + var5;
		this.field4936[2] = var8 - var4 - var4 + var8;
		this.field4936[4] = var7 - var5 - var5 + var7;
		this.field4936[5] = var9 + var2 - var6 - var11;
		this.field4936[6] = var10 + var10 + var3 + var3;
		this.field4936[8] = var8 + var4 + var8 + var4;
		this.field4936[9] = var10 - var3 - var3 + var10;
		this.field4936[10] = var2 + var11 - var9 - var6;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lrw;I)V",
		garbageValue = "-425229258"
	)
	public void method8437(class445 var1) {
		this.field4936[0] = var1.field4941;
		this.field4936[1] = var1.field4948;
		this.field4936[2] = var1.field4940;
		this.field4936[3] = 0.0F;
		this.field4936[4] = var1.field4945;
		this.field4936[5] = var1.field4942;
		this.field4936[6] = var1.field4943;
		this.field4936[7] = 0.0F;
		this.field4936[8] = var1.field4944;
		this.field4936[9] = var1.field4946;
		this.field4936[10] = var1.field4939;
		this.field4936[11] = 0.0F;
		this.field4936[12] = var1.field4947;
		this.field4936[13] = var1.field4949;
		this.field4936[14] = var1.field4938;
		this.field4936[15] = 1.0F;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "7"
	)
	float method8438() {
		return this.field4936[13] * this.field4936[7] * this.field4936[2] * this.field4936[8] + this.field4936[15] * this.field4936[9] * this.field4936[4] * this.field4936[2] + this.field4936[8] * this.field4936[1] * this.field4936[6] * this.field4936[15] + this.field4936[15] * this.field4936[0] * this.field4936[5] * this.field4936[10] - this.field4936[14] * this.field4936[5] * this.field4936[0] * this.field4936[11] - this.field4936[15] * this.field4936[9] * this.field4936[0] * this.field4936[6] + this.field4936[11] * this.field4936[0] * this.field4936[6] * this.field4936[13] + this.field4936[14] * this.field4936[9] * this.field4936[0] * this.field4936[7] - this.field4936[13] * this.field4936[0] * this.field4936[7] * this.field4936[10] - this.field4936[15] * this.field4936[4] * this.field4936[1] * this.field4936[10] + this.field4936[14] * this.field4936[1] * this.field4936[4] * this.field4936[11] - this.field4936[11] * this.field4936[1] * this.field4936[6] * this.field4936[12] - this.field4936[8] * this.field4936[7] * this.field4936[1] * this.field4936[14] + this.field4936[10] * this.field4936[7] * this.field4936[1] * this.field4936[12] - this.field4936[2] * this.field4936[4] * this.field4936[11] * this.field4936[13] - this.field4936[15] * this.field4936[8] * this.field4936[2] * this.field4936[5] + this.field4936[11] * this.field4936[2] * this.field4936[5] * this.field4936[12] - this.field4936[12] * this.field4936[9] * this.field4936[7] * this.field4936[2] - this.field4936[3] * this.field4936[4] * this.field4936[9] * this.field4936[14] + this.field4936[10] * this.field4936[4] * this.field4936[3] * this.field4936[13] + this.field4936[14] * this.field4936[8] * this.field4936[3] * this.field4936[5] - this.field4936[5] * this.field4936[3] * this.field4936[10] * this.field4936[12] - this.field4936[6] * this.field4936[3] * this.field4936[8] * this.field4936[13] + this.field4936[12] * this.field4936[3] * this.field4936[6] * this.field4936[9];
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "140618226"
	)
	public void method8439() {
		float var1 = 1.0F / this.method8438();
		float var2 = (this.field4936[13] * this.field4936[6] * this.field4936[11] + (this.field4936[10] * this.field4936[5] * this.field4936[15] - this.field4936[14] * this.field4936[11] * this.field4936[5] - this.field4936[15] * this.field4936[6] * this.field4936[9]) + this.field4936[14] * this.field4936[7] * this.field4936[9] - this.field4936[13] * this.field4936[7] * this.field4936[10]) * var1;
		float var3 = var1 * (this.field4936[2] * this.field4936[9] * this.field4936[15] + -this.field4936[1] * this.field4936[10] * this.field4936[15] + this.field4936[14] * this.field4936[1] * this.field4936[11] - this.field4936[2] * this.field4936[11] * this.field4936[13] - this.field4936[9] * this.field4936[3] * this.field4936[14] + this.field4936[13] * this.field4936[10] * this.field4936[3]);
		float var4 = (this.field4936[3] * this.field4936[5] * this.field4936[14] + this.field4936[13] * this.field4936[7] * this.field4936[2] + (this.field4936[15] * this.field4936[1] * this.field4936[6] - this.field4936[14] * this.field4936[7] * this.field4936[1] - this.field4936[5] * this.field4936[2] * this.field4936[15]) - this.field4936[3] * this.field4936[6] * this.field4936[13]) * var1;
		float var5 = (this.field4936[11] * this.field4936[5] * this.field4936[2] + this.field4936[1] * this.field4936[7] * this.field4936[10] + this.field4936[11] * this.field4936[6] * -this.field4936[1] - this.field4936[9] * this.field4936[2] * this.field4936[7] - this.field4936[10] * this.field4936[3] * this.field4936[5] + this.field4936[3] * this.field4936[6] * this.field4936[9]) * var1;
		float var6 = var1 * (this.field4936[12] * this.field4936[7] * this.field4936[10] + (this.field4936[14] * this.field4936[4] * this.field4936[11] + -this.field4936[4] * this.field4936[10] * this.field4936[15] + this.field4936[15] * this.field4936[8] * this.field4936[6] - this.field4936[12] * this.field4936[6] * this.field4936[11] - this.field4936[8] * this.field4936[7] * this.field4936[14]));
		float var7 = var1 * (this.field4936[12] * this.field4936[11] * this.field4936[2] + (this.field4936[10] * this.field4936[0] * this.field4936[15] - this.field4936[11] * this.field4936[0] * this.field4936[14] - this.field4936[8] * this.field4936[2] * this.field4936[15]) + this.field4936[3] * this.field4936[8] * this.field4936[14] - this.field4936[3] * this.field4936[10] * this.field4936[12]);
		float var8 = (this.field4936[3] * this.field4936[6] * this.field4936[12] + (this.field4936[15] * this.field4936[2] * this.field4936[4] + this.field4936[6] * -this.field4936[0] * this.field4936[15] + this.field4936[14] * this.field4936[7] * this.field4936[0] - this.field4936[2] * this.field4936[7] * this.field4936[12] - this.field4936[4] * this.field4936[3] * this.field4936[14])) * var1;
		float var9 = (this.field4936[11] * this.field4936[6] * this.field4936[0] - this.field4936[0] * this.field4936[7] * this.field4936[10] - this.field4936[2] * this.field4936[4] * this.field4936[11] + this.field4936[2] * this.field4936[7] * this.field4936[8] + this.field4936[3] * this.field4936[4] * this.field4936[10] - this.field4936[8] * this.field4936[3] * this.field4936[6]) * var1;
		float var10 = var1 * (this.field4936[13] * this.field4936[8] * this.field4936[7] + this.field4936[5] * this.field4936[11] * this.field4936[12] + (this.field4936[4] * this.field4936[9] * this.field4936[15] - this.field4936[4] * this.field4936[11] * this.field4936[13] - this.field4936[5] * this.field4936[8] * this.field4936[15]) - this.field4936[12] * this.field4936[9] * this.field4936[7]);
		float var11 = (this.field4936[15] * this.field4936[1] * this.field4936[8] + this.field4936[13] * this.field4936[11] * this.field4936[0] + this.field4936[15] * this.field4936[9] * -this.field4936[0] - this.field4936[12] * this.field4936[1] * this.field4936[11] - this.field4936[13] * this.field4936[8] * this.field4936[3] + this.field4936[9] * this.field4936[3] * this.field4936[12]) * var1;
		float var12 = (this.field4936[12] * this.field4936[7] * this.field4936[1] + (this.field4936[15] * this.field4936[5] * this.field4936[0] - this.field4936[0] * this.field4936[7] * this.field4936[13] - this.field4936[15] * this.field4936[4] * this.field4936[1]) + this.field4936[13] * this.field4936[3] * this.field4936[4] - this.field4936[12] * this.field4936[3] * this.field4936[5]) * var1;
		float var13 = (this.field4936[0] * this.field4936[7] * this.field4936[9] + this.field4936[11] * this.field4936[5] * -this.field4936[0] + this.field4936[4] * this.field4936[1] * this.field4936[11] - this.field4936[8] * this.field4936[1] * this.field4936[7] - this.field4936[9] * this.field4936[3] * this.field4936[4] + this.field4936[5] * this.field4936[3] * this.field4936[8]) * var1;
		float var14 = (this.field4936[6] * this.field4936[9] * this.field4936[12] + (this.field4936[14] * this.field4936[8] * this.field4936[5] + this.field4936[4] * this.field4936[10] * this.field4936[13] + this.field4936[14] * -this.field4936[4] * this.field4936[9] - this.field4936[10] * this.field4936[5] * this.field4936[12] - this.field4936[13] * this.field4936[8] * this.field4936[6])) * var1;
		float var15 = var1 * (this.field4936[0] * this.field4936[9] * this.field4936[14] - this.field4936[10] * this.field4936[0] * this.field4936[13] - this.field4936[14] * this.field4936[8] * this.field4936[1] + this.field4936[1] * this.field4936[10] * this.field4936[12] + this.field4936[8] * this.field4936[2] * this.field4936[13] - this.field4936[2] * this.field4936[9] * this.field4936[12]);
		float var16 = var1 * (this.field4936[12] * this.field4936[2] * this.field4936[5] + (this.field4936[14] * -this.field4936[0] * this.field4936[5] + this.field4936[13] * this.field4936[0] * this.field4936[6] + this.field4936[4] * this.field4936[1] * this.field4936[14] - this.field4936[12] * this.field4936[6] * this.field4936[1] - this.field4936[2] * this.field4936[4] * this.field4936[13]));
		float var17 = var1 * (this.field4936[2] * this.field4936[4] * this.field4936[9] + this.field4936[8] * this.field4936[1] * this.field4936[6] + (this.field4936[10] * this.field4936[0] * this.field4936[5] - this.field4936[9] * this.field4936[6] * this.field4936[0] - this.field4936[1] * this.field4936[4] * this.field4936[10]) - this.field4936[2] * this.field4936[5] * this.field4936[8]);
		this.field4936[0] = var2;
		this.field4936[1] = var3;
		this.field4936[2] = var4;
		this.field4936[3] = var5;
		this.field4936[4] = var6;
		this.field4936[5] = var7;
		this.field4936[6] = var8;
		this.field4936[7] = var9;
		this.field4936[8] = var10;
		this.field4936[9] = var11;
		this.field4936[10] = var12;
		this.field4936[11] = var13;
		this.field4936[12] = var14;
		this.field4936[13] = var15;
		this.field4936[14] = var16;
		this.field4936[15] = var17;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "924006228"
	)
	public void method8440(float var1, float var2, float var3, float var4) {
		this.field4936[0] = var1;
		this.field4936[1] = 0.0F;
		this.field4936[2] = 0.0F;
		this.field4936[3] = 0.0F;
		this.field4936[4] = 0.0F;
		this.field4936[5] = var2;
		this.field4936[6] = 0.0F;
		this.field4936[7] = 0.0F;
		this.field4936[8] = 0.0F;
		this.field4936[9] = 0.0F;
		this.field4936[10] = var3;
		this.field4936[11] = 0.0F;
		this.field4936[12] = 0.0F;
		this.field4936[13] = 0.0F;
		this.field4936[14] = 0.0F;
		this.field4936[15] = var4;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(FFF[FI)V",
		garbageValue = "-1419892145"
	)
	@Export("transformPoint")
	public void transformPoint(float var1, float var2, float var3, float[] var4) {
		var4[0] = var3 * this.field4936[8] + var1 * this.field4936[0] + this.field4936[4] * var2 + this.field4936[12];
		var4[1] = this.field4936[1] * var1 + this.field4936[5] * var2 + var3 * this.field4936[9] + this.field4936[13];
		var4[2] = this.field4936[14] + this.field4936[2] * var1 + this.field4936[6] * var2 + this.field4936[10] * var3;
		if (var4.length > 3) {
			var4[3] = var1 * this.field4936[3] + this.field4936[7] * var2 + this.field4936[11] * var3 + this.field4936[15];
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(FFFI)Lrz;",
		garbageValue = "704516931"
	)
	public class442 method8442(float var1, float var2, float var3) {
		float var4 = 1.0F / (var1 * this.field4936[3] + var2 * this.field4936[7] + this.field4936[11] * var3 + this.field4936[15]);
		return class219.method4844((this.field4936[12] + var3 * this.field4936[8] + var2 * this.field4936[4] + this.field4936[0] * var1) * var4, (this.field4936[9] * var3 + var1 * this.field4936[1] + this.field4936[5] * var2 + this.field4936[13]) * var4, (this.field4936[14] + var2 * this.field4936[6] + this.field4936[2] * var1 + var3 * this.field4936[10]) * var4);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(FFFI)F",
		garbageValue = "-1863773593"
	)
	public float method8428(float var1, float var2, float var3) {
		return this.field4936[12] + this.field4936[4] * var2 + this.field4936[0] * var1 + this.field4936[8] * var3;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(FFFB)F",
		garbageValue = "96"
	)
	public float method8453(float var1, float var2, float var3) {
		return this.field4936[9] * var3 + var1 * this.field4936[1] + this.field4936[5] * var2 + this.field4936[13];
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(FFFB)F",
		garbageValue = "24"
	)
	public float method8445(float var1, float var2, float var3) {
		return var3 * this.field4936[10] + this.field4936[2] * var1 + var2 * this.field4936[6] + this.field4936[14];
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "36"
	)
	public float[] method8448() {
		float[] var1 = new float[3];
		class442 var2 = new class442(this.field4936[0], this.field4936[1], this.field4936[2]);
		class442 var3 = new class442(this.field4936[4], this.field4936[5], this.field4936[6]);
		class442 var4 = new class442(this.field4936[8], this.field4936[9], this.field4936[10]);
		var1[0] = var2.method8349();
		var1[1] = var3.method8349();
		var1[2] = var4.method8349();
		return var1;
	}

	public int hashCode() {
		boolean var1 = true;
		byte var2 = 1;
		int var3 = var2 * 31 + Arrays.hashCode(this.field4936);
		return var3;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof TransformationMatrix)) {
			return false;
		} else {
			TransformationMatrix var2 = (TransformationMatrix)var1;

			for (int var3 = 0; var3 < 16; ++var3) {
				if (var2.field4936[var3] != this.field4936[var3]) {
					return false;
				}
			}

			return true;
		}
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder();
		this.method8443();
		this.method8426();

		for (int var2 = 0; var2 < 4; ++var2) {
			for (int var3 = 0; var3 < 4; ++var3) {
				if (var3 > 0) {
					var1.append("\t");
				}

				float var4 = this.field4936[var3 + var2 * 4];
				if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) {
					var4 = 0.0F;
				}

				var1.append(var4);
			}

			var1.append("\n");
		}

		return var1.toString();
	}
}
