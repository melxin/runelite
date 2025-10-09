import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rz")
@Implements("TransformationMatrix")
public final class TransformationMatrix {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	public static final TransformationMatrix field5234;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Lrz;"
	)
	public static final TransformationMatrix[] field5231;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1919984381
	)
	static final int field5232;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1335954685
	)
	public static int field5233;
	@ObfuscatedName("af")
	public float[] field5229;

	static {
		field5234 = new TransformationMatrix();
		field5233 = 0;
		field5232 = 16;
		field5231 = new TransformationMatrix[field5232];
	}

	public TransformationMatrix() {
		this.field5229 = new float[16];
		this.method9175();
	}

	@ObfuscatedSignature(
		descriptor = "(Lrz;)V"
	)
	public TransformationMatrix(TransformationMatrix var1) {
		this.field5229 = new float[16];
		this.method9187(var1);
	}

	@ObfuscatedSignature(
		descriptor = "(Lwj;Z)V"
	)
	public TransformationMatrix(Buffer var1, boolean var2) {
		this.field5229 = new float[16];
		this.method9172(var1, var2);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2109536053"
	)
	public void method9171() {
		synchronized(field5231) {
			if (field5233 < field5232) {
				field5231[++field5233 - 1] = this;
			}

		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lwj;ZI)V",
		garbageValue = "-1952476165"
	)
	void method9172(Buffer var1, boolean var2) {
		if (var2) {
			class453 var4 = new class453();
			var4.method9260(class336.method7116(var1.readShort()));
			var4.method9261(class336.method7116(var1.readShort()));
			var4.method9262(class336.method7116(var1.readShort()));
			var4.method9263((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort());
			this.method9184(var4);
		} else {
			for (int var3 = 0; var3 < 16; ++var3) {
				this.field5229[var3] = var1.method11385();
			}
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "-637764593"
	)
	float[] method9212() {
		float[] var1 = new float[3];
		if ((double)this.field5229[2] < 0.999D && (double)this.field5229[2] > -0.999D) {
			var1[1] = (float)(-Math.asin((double)this.field5229[2]));
			double var2 = Math.cos((double)var1[1]);
			var1[0] = (float)Math.atan2((double)this.field5229[6] / var2, (double)this.field5229[10] / var2);
			var1[2] = (float)Math.atan2((double)this.field5229[1] / var2, (double)this.field5229[0] / var2);
		} else {
			var1[0] = 0.0F;
			var1[1] = (float)Math.atan2((double)this.field5229[2], 0.0D);
			var1[2] = (float)Math.atan2((double)(-this.field5229[9]), (double)this.field5229[5]);
		}

		return var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "-1800776589"
	)
	public float[] method9240() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field5229[6])), 0.0F, 0.0F};
		double var2 = Math.cos((double)var1[0]);
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) {
			var4 = (double)this.field5229[2];
			var6 = (double)this.field5229[10];
			double var8 = (double)this.field5229[4];
			double var10 = (double)this.field5229[5];
			var1[1] = (float)Math.atan2(var4, var6);
			var1[2] = (float)Math.atan2(var8, var10);
		} else {
			var4 = (double)this.field5229[1];
			var6 = (double)this.field5229[0];
			if (this.field5229[6] < 0.0F) {
				var1[1] = (float)Math.atan2(var4, var6);
			} else {
				var1[1] = (float)(-Math.atan2(var4, var6));
			}

			var1[2] = 0.0F;
		}

		return var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-305013850"
	)
	public void method9175() {
		this.field5229[0] = 1.0F;
		this.field5229[1] = 0.0F;
		this.field5229[2] = 0.0F;
		this.field5229[3] = 0.0F;
		this.field5229[4] = 0.0F;
		this.field5229[5] = 1.0F;
		this.field5229[6] = 0.0F;
		this.field5229[7] = 0.0F;
		this.field5229[8] = 0.0F;
		this.field5229[9] = 0.0F;
		this.field5229[10] = 1.0F;
		this.field5229[11] = 0.0F;
		this.field5229[12] = 0.0F;
		this.field5229[13] = 0.0F;
		this.field5229[14] = 0.0F;
		this.field5229[15] = 1.0F;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-410309412"
	)
	public void method9176() {
		this.field5229[0] = 0.0F;
		this.field5229[1] = 0.0F;
		this.field5229[2] = 0.0F;
		this.field5229[3] = 0.0F;
		this.field5229[4] = 0.0F;
		this.field5229[5] = 0.0F;
		this.field5229[6] = 0.0F;
		this.field5229[7] = 0.0F;
		this.field5229[8] = 0.0F;
		this.field5229[9] = 0.0F;
		this.field5229[10] = 0.0F;
		this.field5229[11] = 0.0F;
		this.field5229[12] = 0.0F;
		this.field5229[13] = 0.0F;
		this.field5229[14] = 0.0F;
		this.field5229[15] = 0.0F;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lrz;I)V",
		garbageValue = "-154508597"
	)
	public void method9187(TransformationMatrix var1) {
		System.arraycopy(var1.field5229, 0, this.field5229, 0, 16);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "1953844845"
	)
	public void method9178(float var1) {
		this.method9179(var1, var1, var1);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "6978228"
	)
	public void method9179(float var1, float var2, float var3) {
		this.method9175();
		this.field5229[0] = var1;
		this.field5229[5] = var2;
		this.field5229[10] = var3;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lrz;I)V",
		garbageValue = "1871422880"
	)
	public void method9180(TransformationMatrix var1) {
		for (int var2 = 0; var2 < this.field5229.length; ++var2) {
			float[] var10000 = this.field5229;
			var10000[var2] += var1.field5229[var2];
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lrz;S)V",
		garbageValue = "-17121"
	)
	public void method9181(TransformationMatrix var1) {
		float var2 = this.field5229[1] * var1.field5229[4] + var1.field5229[0] * this.field5229[0] + var1.field5229[8] * this.field5229[2] + var1.field5229[12] * this.field5229[3];
		float var3 = var1.field5229[13] * this.field5229[3] + var1.field5229[1] * this.field5229[0] + this.field5229[1] * var1.field5229[5] + this.field5229[2] * var1.field5229[9];
		float var4 = this.field5229[3] * var1.field5229[14] + var1.field5229[6] * this.field5229[1] + var1.field5229[2] * this.field5229[0] + this.field5229[2] * var1.field5229[10];
		float var5 = this.field5229[2] * var1.field5229[11] + var1.field5229[7] * this.field5229[1] + var1.field5229[3] * this.field5229[0] + this.field5229[3] * var1.field5229[15];
		float var6 = var1.field5229[12] * this.field5229[7] + var1.field5229[8] * this.field5229[6] + this.field5229[5] * var1.field5229[4] + this.field5229[4] * var1.field5229[0];
		float var7 = this.field5229[7] * var1.field5229[13] + this.field5229[6] * var1.field5229[9] + this.field5229[4] * var1.field5229[1] + var1.field5229[5] * this.field5229[5];
		float var8 = var1.field5229[14] * this.field5229[7] + var1.field5229[2] * this.field5229[4] + var1.field5229[6] * this.field5229[5] + var1.field5229[10] * this.field5229[6];
		float var9 = var1.field5229[15] * this.field5229[7] + this.field5229[4] * var1.field5229[3] + this.field5229[5] * var1.field5229[7] + var1.field5229[11] * this.field5229[6];
		float var10 = var1.field5229[8] * this.field5229[10] + var1.field5229[4] * this.field5229[9] + this.field5229[8] * var1.field5229[0] + this.field5229[11] * var1.field5229[12];
		float var11 = this.field5229[8] * var1.field5229[1] + this.field5229[9] * var1.field5229[5] + this.field5229[10] * var1.field5229[9] + var1.field5229[13] * this.field5229[11];
		float var12 = this.field5229[11] * var1.field5229[14] + this.field5229[9] * var1.field5229[6] + this.field5229[8] * var1.field5229[2] + var1.field5229[10] * this.field5229[10];
		float var13 = this.field5229[10] * var1.field5229[11] + this.field5229[8] * var1.field5229[3] + this.field5229[9] * var1.field5229[7] + this.field5229[11] * var1.field5229[15];
		float var14 = this.field5229[15] * var1.field5229[12] + var1.field5229[8] * this.field5229[14] + this.field5229[12] * var1.field5229[0] + this.field5229[13] * var1.field5229[4];
		float var15 = this.field5229[15] * var1.field5229[13] + var1.field5229[9] * this.field5229[14] + this.field5229[13] * var1.field5229[5] + this.field5229[12] * var1.field5229[1];
		float var16 = var1.field5229[14] * this.field5229[15] + var1.field5229[2] * this.field5229[12] + var1.field5229[6] * this.field5229[13] + var1.field5229[10] * this.field5229[14];
		float var17 = this.field5229[15] * var1.field5229[15] + this.field5229[12] * var1.field5229[3] + this.field5229[13] * var1.field5229[7] + this.field5229[14] * var1.field5229[11];
		this.field5229[0] = var2;
		this.field5229[1] = var3;
		this.field5229[2] = var4;
		this.field5229[3] = var5;
		this.field5229[4] = var6;
		this.field5229[5] = var7;
		this.field5229[6] = var8;
		this.field5229[7] = var9;
		this.field5229[8] = var10;
		this.field5229[9] = var11;
		this.field5229[10] = var12;
		this.field5229[11] = var13;
		this.field5229[12] = var14;
		this.field5229[13] = var15;
		this.field5229[14] = var16;
		this.field5229[15] = var17;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lrx;I)V",
		garbageValue = "-1097472906"
	)
	public void method9182(class446 var1) {
		float var2 = var1.field5197.field5223 * var1.field5197.field5223;
		float var3 = var1.field5197.field5222 * var1.field5197.field5223;
		float var4 = var1.field5197.field5223 * var1.field5197.field5226;
		float var5 = var1.field5197.field5227 * var1.field5197.field5223;
		float var6 = var1.field5197.field5222 * var1.field5197.field5222;
		float var7 = var1.field5197.field5222 * var1.field5197.field5226;
		float var8 = var1.field5197.field5222 * var1.field5197.field5227;
		float var9 = var1.field5197.field5226 * var1.field5197.field5226;
		float var10 = var1.field5197.field5226 * var1.field5197.field5227;
		float var11 = var1.field5197.field5227 * var1.field5197.field5227;
		this.field5229[0] = var2 + var6 - var11 - var9;
		this.field5229[1] = var7 + var5 + var7 + var5;
		this.field5229[2] = var8 - var4 - var4 + var8;
		this.field5229[4] = var7 - var5 - var5 + var7;
		this.field5229[5] = var2 + var9 - var6 - var11;
		this.field5229[6] = var10 + var10 + var3 + var3;
		this.field5229[8] = var4 + var8 + var8 + var4;
		this.field5229[9] = var10 + (var10 - var3 - var3);
		this.field5229[10] = var2 + var11 - var9 - var6;
		float[] var12 = this.field5229;
		float[] var13 = this.field5229;
		this.field5229[11] = 0.0F;
		var13[7] = 0.0F;
		var12[3] = 0.0F;
		this.field5229[12] = var1.field5193.field5216;
		this.field5229[13] = var1.field5193.field5218;
		this.field5229[14] = var1.field5193.field5219;
		this.field5229[15] = 1.0F;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lrt;I)V",
		garbageValue = "-1614302548"
	)
	public void method9258(class451 var1) {
		float var2 = var1.field5223 * var1.field5223;
		float var3 = var1.field5223 * var1.field5222;
		float var4 = var1.field5223 * var1.field5226;
		float var5 = var1.field5227 * var1.field5223;
		float var6 = var1.field5222 * var1.field5222;
		float var7 = var1.field5226 * var1.field5222;
		float var8 = var1.field5227 * var1.field5222;
		float var9 = var1.field5226 * var1.field5226;
		float var10 = var1.field5226 * var1.field5227;
		float var11 = var1.field5227 * var1.field5227;
		this.field5229[0] = var2 + var6 - var11 - var9;
		this.field5229[1] = var7 + var5 + var7 + var5;
		this.field5229[2] = var8 - var4 - var4 + var8;
		this.field5229[4] = var7 + (var7 - var5 - var5);
		this.field5229[5] = var9 + var2 - var6 - var11;
		this.field5229[6] = var10 + var3 + var10 + var3;
		this.field5229[8] = var4 + var8 + var8 + var4;
		this.field5229[9] = var10 - var3 - var3 + var10;
		this.field5229[10] = var11 + var2 - var9 - var6;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lrr;I)V",
		garbageValue = "597249856"
	)
	public void method9184(class453 var1) {
		this.field5229[0] = var1.field5248;
		this.field5229[1] = var1.field5237;
		this.field5229[2] = var1.field5238;
		this.field5229[3] = 0.0F;
		this.field5229[4] = var1.field5239;
		this.field5229[5] = var1.field5240;
		this.field5229[6] = var1.field5241;
		this.field5229[7] = 0.0F;
		this.field5229[8] = var1.field5244;
		this.field5229[9] = var1.field5243;
		this.field5229[10] = var1.field5246;
		this.field5229[11] = 0.0F;
		this.field5229[12] = var1.field5245;
		this.field5229[13] = var1.field5247;
		this.field5229[14] = var1.field5236;
		this.field5229[15] = 1.0F;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "20"
	)
	float method9204() {
		return this.field5229[14] * this.field5229[8] * this.field5229[5] * this.field5229[3] + this.field5229[13] * this.field5229[4] * this.field5229[3] * this.field5229[10] + (this.field5229[1] * this.field5229[6] * this.field5229[8] * this.field5229[15] + this.field5229[11] * this.field5229[1] * this.field5229[4] * this.field5229[14] + (this.field5229[14] * this.field5229[0] * this.field5229[7] * this.field5229[9] + this.field5229[11] * this.field5229[0] * this.field5229[6] * this.field5229[13] + (this.field5229[15] * this.field5229[10] * this.field5229[5] * this.field5229[0] - this.field5229[14] * this.field5229[11] * this.field5229[0] * this.field5229[5] - this.field5229[9] * this.field5229[6] * this.field5229[0] * this.field5229[15]) - this.field5229[13] * this.field5229[10] * this.field5229[7] * this.field5229[0] - this.field5229[4] * this.field5229[1] * this.field5229[10] * this.field5229[15]) - this.field5229[12] * this.field5229[11] * this.field5229[1] * this.field5229[6] - this.field5229[14] * this.field5229[8] * this.field5229[1] * this.field5229[7] + this.field5229[7] * this.field5229[1] * this.field5229[10] * this.field5229[12] + this.field5229[15] * this.field5229[9] * this.field5229[2] * this.field5229[4] - this.field5229[13] * this.field5229[11] * this.field5229[4] * this.field5229[2] - this.field5229[15] * this.field5229[2] * this.field5229[5] * this.field5229[8] + this.field5229[12] * this.field5229[11] * this.field5229[5] * this.field5229[2] + this.field5229[13] * this.field5229[7] * this.field5229[2] * this.field5229[8] - this.field5229[12] * this.field5229[9] * this.field5229[7] * this.field5229[2] - this.field5229[14] * this.field5229[4] * this.field5229[3] * this.field5229[9]) - this.field5229[10] * this.field5229[5] * this.field5229[3] * this.field5229[12] - this.field5229[8] * this.field5229[6] * this.field5229[3] * this.field5229[13] + this.field5229[12] * this.field5229[3] * this.field5229[6] * this.field5229[9];
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1122683549"
	)
	public void method9174() {
		float var1 = 1.0F / this.method9204();
		float var2 = var1 * (this.field5229[9] * this.field5229[7] * this.field5229[14] + this.field5229[15] * this.field5229[10] * this.field5229[5] - this.field5229[5] * this.field5229[11] * this.field5229[14] - this.field5229[6] * this.field5229[9] * this.field5229[15] + this.field5229[13] * this.field5229[11] * this.field5229[6] - this.field5229[7] * this.field5229[10] * this.field5229[13]);
		float var3 = var1 * (this.field5229[13] * this.field5229[3] * this.field5229[10] + (this.field5229[9] * this.field5229[2] * this.field5229[15] + -this.field5229[1] * this.field5229[10] * this.field5229[15] + this.field5229[14] * this.field5229[11] * this.field5229[1] - this.field5229[11] * this.field5229[2] * this.field5229[13] - this.field5229[3] * this.field5229[9] * this.field5229[14]));
		float var4 = (this.field5229[6] * this.field5229[1] * this.field5229[15] - this.field5229[1] * this.field5229[7] * this.field5229[14] - this.field5229[5] * this.field5229[2] * this.field5229[15] + this.field5229[13] * this.field5229[7] * this.field5229[2] + this.field5229[14] * this.field5229[3] * this.field5229[5] - this.field5229[13] * this.field5229[6] * this.field5229[3]) * var1;
		float var5 = var1 * (this.field5229[10] * this.field5229[1] * this.field5229[7] + this.field5229[11] * -this.field5229[1] * this.field5229[6] + this.field5229[2] * this.field5229[5] * this.field5229[11] - this.field5229[2] * this.field5229[7] * this.field5229[9] - this.field5229[3] * this.field5229[5] * this.field5229[10] + this.field5229[6] * this.field5229[3] * this.field5229[9]);
		float var6 = var1 * (this.field5229[12] * this.field5229[7] * this.field5229[10] + (this.field5229[14] * this.field5229[4] * this.field5229[11] + this.field5229[15] * -this.field5229[4] * this.field5229[10] + this.field5229[6] * this.field5229[8] * this.field5229[15] - this.field5229[12] * this.field5229[6] * this.field5229[11] - this.field5229[7] * this.field5229[8] * this.field5229[14]));
		float var7 = var1 * (this.field5229[3] * this.field5229[8] * this.field5229[14] + this.field5229[12] * this.field5229[2] * this.field5229[11] + (this.field5229[15] * this.field5229[0] * this.field5229[10] - this.field5229[14] * this.field5229[0] * this.field5229[11] - this.field5229[15] * this.field5229[8] * this.field5229[2]) - this.field5229[3] * this.field5229[10] * this.field5229[12]);
		float var8 = var1 * (this.field5229[7] * this.field5229[0] * this.field5229[14] + this.field5229[15] * this.field5229[6] * -this.field5229[0] + this.field5229[2] * this.field5229[4] * this.field5229[15] - this.field5229[12] * this.field5229[2] * this.field5229[7] - this.field5229[4] * this.field5229[3] * this.field5229[14] + this.field5229[3] * this.field5229[6] * this.field5229[12]);
		float var9 = (this.field5229[3] * this.field5229[4] * this.field5229[10] + this.field5229[8] * this.field5229[2] * this.field5229[7] + (this.field5229[0] * this.field5229[6] * this.field5229[11] - this.field5229[0] * this.field5229[7] * this.field5229[10] - this.field5229[2] * this.field5229[4] * this.field5229[11]) - this.field5229[3] * this.field5229[6] * this.field5229[8]) * var1;
		float var10 = (this.field5229[13] * this.field5229[8] * this.field5229[7] + this.field5229[12] * this.field5229[11] * this.field5229[5] + (this.field5229[15] * this.field5229[9] * this.field5229[4] - this.field5229[13] * this.field5229[11] * this.field5229[4] - this.field5229[8] * this.field5229[5] * this.field5229[15]) - this.field5229[7] * this.field5229[9] * this.field5229[12]) * var1;
		float var11 = var1 * (this.field5229[15] * this.field5229[8] * this.field5229[1] + this.field5229[9] * -this.field5229[0] * this.field5229[15] + this.field5229[0] * this.field5229[11] * this.field5229[13] - this.field5229[11] * this.field5229[1] * this.field5229[12] - this.field5229[3] * this.field5229[8] * this.field5229[13] + this.field5229[12] * this.field5229[9] * this.field5229[3]);
		float var12 = (this.field5229[3] * this.field5229[4] * this.field5229[13] + this.field5229[12] * this.field5229[1] * this.field5229[7] + (this.field5229[15] * this.field5229[5] * this.field5229[0] - this.field5229[13] * this.field5229[0] * this.field5229[7] - this.field5229[15] * this.field5229[1] * this.field5229[4]) - this.field5229[12] * this.field5229[3] * this.field5229[5]) * var1;
		float var13 = var1 * (this.field5229[8] * this.field5229[3] * this.field5229[5] + (this.field5229[11] * -this.field5229[0] * this.field5229[5] + this.field5229[9] * this.field5229[7] * this.field5229[0] + this.field5229[1] * this.field5229[4] * this.field5229[11] - this.field5229[8] * this.field5229[1] * this.field5229[7] - this.field5229[4] * this.field5229[3] * this.field5229[9]));
		float var14 = (this.field5229[14] * this.field5229[9] * -this.field5229[4] + this.field5229[10] * this.field5229[4] * this.field5229[13] + this.field5229[14] * this.field5229[8] * this.field5229[5] - this.field5229[5] * this.field5229[10] * this.field5229[12] - this.field5229[6] * this.field5229[8] * this.field5229[13] + this.field5229[9] * this.field5229[6] * this.field5229[12]) * var1;
		float var15 = var1 * (this.field5229[2] * this.field5229[8] * this.field5229[13] + this.field5229[12] * this.field5229[1] * this.field5229[10] + (this.field5229[14] * this.field5229[9] * this.field5229[0] - this.field5229[13] * this.field5229[0] * this.field5229[10] - this.field5229[14] * this.field5229[1] * this.field5229[8]) - this.field5229[12] * this.field5229[9] * this.field5229[2]);
		float var16 = (-this.field5229[0] * this.field5229[5] * this.field5229[14] + this.field5229[13] * this.field5229[0] * this.field5229[6] + this.field5229[14] * this.field5229[4] * this.field5229[1] - this.field5229[12] * this.field5229[1] * this.field5229[6] - this.field5229[13] * this.field5229[4] * this.field5229[2] + this.field5229[12] * this.field5229[2] * this.field5229[5]) * var1;
		float var17 = (this.field5229[2] * this.field5229[4] * this.field5229[9] + this.field5229[10] * this.field5229[0] * this.field5229[5] - this.field5229[9] * this.field5229[6] * this.field5229[0] - this.field5229[10] * this.field5229[1] * this.field5229[4] + this.field5229[1] * this.field5229[6] * this.field5229[8] - this.field5229[8] * this.field5229[2] * this.field5229[5]) * var1;
		this.field5229[0] = var2;
		this.field5229[1] = var3;
		this.field5229[2] = var4;
		this.field5229[3] = var5;
		this.field5229[4] = var6;
		this.field5229[5] = var7;
		this.field5229[6] = var8;
		this.field5229[7] = var9;
		this.field5229[8] = var10;
		this.field5229[9] = var11;
		this.field5229[10] = var12;
		this.field5229[11] = var13;
		this.field5229[12] = var14;
		this.field5229[13] = var15;
		this.field5229[14] = var16;
		this.field5229[15] = var17;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "-1998001636"
	)
	public void method9211(float var1, float var2, float var3, float var4) {
		this.field5229[0] = var1;
		this.field5229[1] = 0.0F;
		this.field5229[2] = 0.0F;
		this.field5229[3] = 0.0F;
		this.field5229[4] = 0.0F;
		this.field5229[5] = var2;
		this.field5229[6] = 0.0F;
		this.field5229[7] = 0.0F;
		this.field5229[8] = 0.0F;
		this.field5229[9] = 0.0F;
		this.field5229[10] = var3;
		this.field5229[11] = 0.0F;
		this.field5229[12] = 0.0F;
		this.field5229[13] = 0.0F;
		this.field5229[14] = 0.0F;
		this.field5229[15] = var4;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(FFF[FI)V",
		garbageValue = "-1654860945"
	)
	@Export("transformPoint")
	public void transformPoint(float var1, float var2, float var3, float[] var4) {
		var4[0] = this.field5229[12] + this.field5229[0] * var1 + this.field5229[4] * var2 + var3 * this.field5229[8];
		var4[1] = this.field5229[13] + this.field5229[5] * var2 + var1 * this.field5229[1] + var3 * this.field5229[9];
		var4[2] = this.field5229[14] + var3 * this.field5229[10] + var2 * this.field5229[6] + this.field5229[2] * var1;
		if (var4.length > 3) {
			var4[3] = this.field5229[11] * var3 + this.field5229[3] * var1 + var2 * this.field5229[7] + this.field5229[15];
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(FFFB)Lre;",
		garbageValue = "-62"
	)
	public class450 method9201(float var1, float var2, float var3) {
		float var4 = 1.0F / (this.field5229[15] + this.field5229[3] * var1 + var2 * this.field5229[7] + this.field5229[11] * var3);
		return IndexCheck.method6169((var3 * this.field5229[8] + this.field5229[0] * var1 + this.field5229[4] * var2 + this.field5229[12]) * var4, var4 * (var3 * this.field5229[9] + var1 * this.field5229[1] + var2 * this.field5229[5] + this.field5229[13]), (this.field5229[14] + this.field5229[10] * var3 + this.field5229[6] * var2 + this.field5229[2] * var1) * var4);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(FFFB)F",
		garbageValue = "77"
	)
	public float method9190(float var1, float var2, float var3) {
		return this.field5229[12] + var3 * this.field5229[8] + var1 * this.field5229[0] + var2 * this.field5229[4];
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(FFFB)F",
		garbageValue = "7"
	)
	public float method9191(float var1, float var2, float var3) {
		return this.field5229[1] * var1 + var2 * this.field5229[5] + this.field5229[9] * var3 + this.field5229[13];
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(FFFB)F",
		garbageValue = "20"
	)
	public float method9194(float var1, float var2, float var3) {
		return this.field5229[14] + var3 * this.field5229[10] + var2 * this.field5229[6] + this.field5229[2] * var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "538450814"
	)
	public float[] method9193() {
		float[] var1 = new float[3];
		class450 var2 = new class450(this.field5229[0], this.field5229[1], this.field5229[2]);
		class450 var3 = new class450(this.field5229[4], this.field5229[5], this.field5229[6]);
		class450 var4 = new class450(this.field5229[8], this.field5229[9], this.field5229[10]);
		var1[0] = var2.method9076();
		var1[1] = var3.method9076();
		var1[2] = var4.method9076();
		return var1;
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder();
		this.method9240();
		this.method9212();

		for (int var2 = 0; var2 < 4; ++var2) {
			for (int var3 = 0; var3 < 4; ++var3) {
				if (var3 > 0) {
					var1.append("\t");
				}

				float var4 = this.field5229[var3 + var2 * 4];
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
		int var3 = var2 * 31 + Arrays.hashCode(this.field5229);
		return var3;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof TransformationMatrix)) {
			return false;
		} else {
			TransformationMatrix var2 = (TransformationMatrix)var1;

			for (int var3 = 0; var3 < 16; ++var3) {
				if (this.field5229[var3] != var2.field5229[var3]) {
					return false;
				}
			}

			return true;
		}
	}
}
