import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ry")
@Implements("TransformationMatrix")
public final class TransformationMatrix {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	public static final TransformationMatrix field5256;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Lry;"
	)
	public static final TransformationMatrix[] field5257;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 604480705
	)
	static final int field5259;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1539552615
	)
	public static int field5255;
	@ObfuscatedName("aj")
	public float[] field5260;

	static {
		field5256 = new TransformationMatrix();
		field5255 = 0;
		field5259 = 16;
		field5257 = new TransformationMatrix[field5259];
	}

	public TransformationMatrix() {
		this.field5260 = new float[16];
		this.method9421();
	}

	@ObfuscatedSignature(
		descriptor = "(Lry;)V"
	)
	public TransformationMatrix(TransformationMatrix var1) {
		this.field5260 = new float[16];
		this.method9480(var1);
	}

	@ObfuscatedSignature(
		descriptor = "(Lxa;Z)V"
	)
	public TransformationMatrix(Buffer var1, boolean var2) {
		this.field5260 = new float[16];
		this.method9488(var1, var2);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public void method9417() {
		synchronized(field5257) {
			if (field5255 < field5259) {
				field5257[++field5255 - 1] = this;
			}

		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxa;ZI)V",
		garbageValue = "730117099"
	)
	void method9488(Buffer var1, boolean var2) {
		if (var2) {
			class463 var13 = new class463();
			int var6 = var1.readShort();
			var6 &= 16383;
			float var5 = (float)(3.834951969714103E-4D * (double)((float)var6));
			var13.method9500(var5);
			int var9 = var1.readShort();
			var9 &= 16383;
			float var8 = (float)((double)((float)var9) * 3.834951969714103E-4D);
			var13.method9499(var8);
			int var12 = var1.readShort();
			var12 &= 16383;
			float var11 = (float)(3.834951969714103E-4D * (double)((float)var12));
			var13.method9512(var11);
			var13.method9503((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort());
			this.method9464(var13);
		} else {
			for (int var3 = 0; var3 < 16; ++var3) {
				this.field5260[var3] = var1.method11642();
			}
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "1"
	)
	float[] method9478() {
		float[] var1 = new float[3];
		if ((double)this.field5260[2] < 0.999D && (double)this.field5260[2] > -0.999D) {
			var1[1] = (float)(-Math.asin((double)this.field5260[2]));
			double var2 = Math.cos((double)var1[1]);
			var1[0] = (float)Math.atan2((double)this.field5260[6] / var2, (double)this.field5260[10] / var2);
			var1[2] = (float)Math.atan2((double)this.field5260[1] / var2, (double)this.field5260[0] / var2);
		} else {
			var1[0] = 0.0F;
			var1[1] = (float)Math.atan2((double)this.field5260[2], 0.0D);
			var1[2] = (float)Math.atan2((double)(-this.field5260[9]), (double)this.field5260[5]);
		}

		return var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "-615272545"
	)
	public float[] method9420() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field5260[6])), 0.0F, 0.0F};
		double var2 = Math.cos((double)var1[0]);
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) {
			var4 = (double)this.field5260[2];
			var6 = (double)this.field5260[10];
			double var8 = (double)this.field5260[4];
			double var10 = (double)this.field5260[5];
			var1[1] = (float)Math.atan2(var4, var6);
			var1[2] = (float)Math.atan2(var8, var10);
		} else {
			var4 = (double)this.field5260[1];
			var6 = (double)this.field5260[0];
			if (this.field5260[6] < 0.0F) {
				var1[1] = (float)Math.atan2(var4, var6);
			} else {
				var1[1] = (float)(-Math.atan2(var4, var6));
			}

			var1[2] = 0.0F;
		}

		return var1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "6"
	)
	public void method9421() {
		this.field5260[0] = 1.0F;
		this.field5260[1] = 0.0F;
		this.field5260[2] = 0.0F;
		this.field5260[3] = 0.0F;
		this.field5260[4] = 0.0F;
		this.field5260[5] = 1.0F;
		this.field5260[6] = 0.0F;
		this.field5260[7] = 0.0F;
		this.field5260[8] = 0.0F;
		this.field5260[9] = 0.0F;
		this.field5260[10] = 1.0F;
		this.field5260[11] = 0.0F;
		this.field5260[12] = 0.0F;
		this.field5260[13] = 0.0F;
		this.field5260[14] = 0.0F;
		this.field5260[15] = 1.0F;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "821498803"
	)
	public void method9422() {
		this.field5260[0] = 0.0F;
		this.field5260[1] = 0.0F;
		this.field5260[2] = 0.0F;
		this.field5260[3] = 0.0F;
		this.field5260[4] = 0.0F;
		this.field5260[5] = 0.0F;
		this.field5260[6] = 0.0F;
		this.field5260[7] = 0.0F;
		this.field5260[8] = 0.0F;
		this.field5260[9] = 0.0F;
		this.field5260[10] = 0.0F;
		this.field5260[11] = 0.0F;
		this.field5260[12] = 0.0F;
		this.field5260[13] = 0.0F;
		this.field5260[14] = 0.0F;
		this.field5260[15] = 0.0F;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lry;I)V",
		garbageValue = "-1492394805"
	)
	public void method9480(TransformationMatrix var1) {
		System.arraycopy(var1.field5260, 0, this.field5260, 0, 16);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-1502431354"
	)
	public void method9424(float var1) {
		this.method9425(var1, var1, var1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "2033287157"
	)
	public void method9425(float var1, float var2, float var3) {
		this.method9421();
		this.field5260[0] = var1;
		this.field5260[5] = var2;
		this.field5260[10] = var3;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lry;B)V",
		garbageValue = "1"
	)
	public void method9448(TransformationMatrix var1) {
		for (int var2 = 0; var2 < this.field5260.length; ++var2) {
			float[] var10000 = this.field5260;
			var10000[var2] += var1.field5260[var2];
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lry;B)V",
		garbageValue = "-19"
	)
	public void method9426(TransformationMatrix var1) {
		float var2 = var1.field5260[12] * this.field5260[3] + var1.field5260[8] * this.field5260[2] + this.field5260[0] * var1.field5260[0] + var1.field5260[4] * this.field5260[1];
		float var3 = this.field5260[2] * var1.field5260[9] + this.field5260[0] * var1.field5260[1] + var1.field5260[5] * this.field5260[1] + this.field5260[3] * var1.field5260[13];
		float var4 = this.field5260[3] * var1.field5260[14] + var1.field5260[6] * this.field5260[1] + var1.field5260[2] * this.field5260[0] + this.field5260[2] * var1.field5260[10];
		float var5 = this.field5260[3] * var1.field5260[15] + this.field5260[2] * var1.field5260[11] + var1.field5260[3] * this.field5260[0] + var1.field5260[7] * this.field5260[1];
		float var6 = this.field5260[6] * var1.field5260[8] + this.field5260[5] * var1.field5260[4] + var1.field5260[0] * this.field5260[4] + this.field5260[7] * var1.field5260[12];
		float var7 = var1.field5260[13] * this.field5260[7] + this.field5260[5] * var1.field5260[5] + var1.field5260[1] * this.field5260[4] + this.field5260[6] * var1.field5260[9];
		float var8 = var1.field5260[14] * this.field5260[7] + this.field5260[6] * var1.field5260[10] + var1.field5260[2] * this.field5260[4] + this.field5260[5] * var1.field5260[6];
		float var9 = var1.field5260[15] * this.field5260[7] + this.field5260[4] * var1.field5260[3] + this.field5260[5] * var1.field5260[7] + this.field5260[6] * var1.field5260[11];
		float var10 = var1.field5260[12] * this.field5260[11] + var1.field5260[8] * this.field5260[10] + this.field5260[8] * var1.field5260[0] + this.field5260[9] * var1.field5260[4];
		float var11 = var1.field5260[13] * this.field5260[11] + var1.field5260[1] * this.field5260[8] + var1.field5260[5] * this.field5260[9] + this.field5260[10] * var1.field5260[9];
		float var12 = var1.field5260[14] * this.field5260[11] + this.field5260[8] * var1.field5260[2] + var1.field5260[6] * this.field5260[9] + this.field5260[10] * var1.field5260[10];
		float var13 = this.field5260[10] * var1.field5260[11] + this.field5260[9] * var1.field5260[7] + this.field5260[8] * var1.field5260[3] + this.field5260[11] * var1.field5260[15];
		float var14 = var1.field5260[12] * this.field5260[15] + var1.field5260[4] * this.field5260[13] + var1.field5260[0] * this.field5260[12] + this.field5260[14] * var1.field5260[8];
		float var15 = var1.field5260[13] * this.field5260[15] + var1.field5260[1] * this.field5260[12] + var1.field5260[5] * this.field5260[13] + var1.field5260[9] * this.field5260[14];
		float var16 = this.field5260[15] * var1.field5260[14] + var1.field5260[10] * this.field5260[14] + var1.field5260[6] * this.field5260[13] + this.field5260[12] * var1.field5260[2];
		float var17 = this.field5260[14] * var1.field5260[11] + this.field5260[13] * var1.field5260[7] + var1.field5260[3] * this.field5260[12] + this.field5260[15] * var1.field5260[15];
		this.field5260[0] = var2;
		this.field5260[1] = var3;
		this.field5260[2] = var4;
		this.field5260[3] = var5;
		this.field5260[4] = var6;
		this.field5260[5] = var7;
		this.field5260[6] = var8;
		this.field5260[7] = var9;
		this.field5260[8] = var10;
		this.field5260[9] = var11;
		this.field5260[10] = var12;
		this.field5260[11] = var13;
		this.field5260[12] = var14;
		this.field5260[13] = var15;
		this.field5260[14] = var16;
		this.field5260[15] = var17;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lrf;B)V",
		garbageValue = "36"
	)
	public void method9427(class456 var1) {
		float var2 = var1.field5219.field5247 * var1.field5219.field5247;
		float var3 = var1.field5219.field5254 * var1.field5219.field5247;
		float var4 = var1.field5219.field5249 * var1.field5219.field5247;
		float var5 = var1.field5219.field5247 * var1.field5219.field5250;
		float var6 = var1.field5219.field5254 * var1.field5219.field5254;
		float var7 = var1.field5219.field5254 * var1.field5219.field5249;
		float var8 = var1.field5219.field5250 * var1.field5219.field5254;
		float var9 = var1.field5219.field5249 * var1.field5219.field5249;
		float var10 = var1.field5219.field5249 * var1.field5219.field5250;
		float var11 = var1.field5219.field5250 * var1.field5219.field5250;
		this.field5260[0] = var6 + var2 - var11 - var9;
		this.field5260[1] = var5 + var5 + var7 + var7;
		this.field5260[2] = var8 + (var8 - var4 - var4);
		this.field5260[4] = var7 - var5 - var5 + var7;
		this.field5260[5] = var2 + var9 - var6 - var11;
		this.field5260[6] = var3 + var10 + var3 + var10;
		this.field5260[8] = var4 + var8 + var4 + var8;
		this.field5260[9] = var10 + (var10 - var3 - var3);
		this.field5260[10] = var11 + var2 - var9 - var6;
		float[] var12 = this.field5260;
		float[] var13 = this.field5260;
		this.field5260[11] = 0.0F;
		var13[7] = 0.0F;
		var12[3] = 0.0F;
		this.field5260[12] = var1.field5215.x;
		this.field5260[13] = var1.field5215.z;
		this.field5260[14] = var1.field5215.y;
		this.field5260[15] = 1.0F;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lra;B)V",
		garbageValue = "1"
	)
	public void method9457(class461 var1) {
		float var2 = var1.field5247 * var1.field5247;
		float var3 = var1.field5254 * var1.field5247;
		float var4 = var1.field5249 * var1.field5247;
		float var5 = var1.field5247 * var1.field5250;
		float var6 = var1.field5254 * var1.field5254;
		float var7 = var1.field5249 * var1.field5254;
		float var8 = var1.field5254 * var1.field5250;
		float var9 = var1.field5249 * var1.field5249;
		float var10 = var1.field5250 * var1.field5249;
		float var11 = var1.field5250 * var1.field5250;
		this.field5260[0] = var6 + var2 - var11 - var9;
		this.field5260[1] = var7 + var5 + var7 + var5;
		this.field5260[2] = var8 + (var8 - var4 - var4);
		this.field5260[4] = var7 - var5 - var5 + var7;
		this.field5260[5] = var2 + var9 - var6 - var11;
		this.field5260[6] = var10 + var3 + var10 + var3;
		this.field5260[8] = var4 + var8 + var8 + var4;
		this.field5260[9] = var10 - var3 - var3 + var10;
		this.field5260[10] = var2 + var11 - var9 - var6;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lrq;B)V",
		garbageValue = "-52"
	)
	public void method9464(class463 var1) {
		this.field5260[0] = var1.field5268;
		this.field5260[1] = var1.field5264;
		this.field5260[2] = var1.field5265;
		this.field5260[3] = 0.0F;
		this.field5260[4] = var1.field5266;
		this.field5260[5] = var1.field5271;
		this.field5260[6] = var1.field5273;
		this.field5260[7] = 0.0F;
		this.field5260[8] = var1.field5269;
		this.field5260[9] = var1.field5270;
		this.field5260[10] = var1.field5272;
		this.field5260[11] = 0.0F;
		this.field5260[12] = var1.field5267;
		this.field5260[13] = var1.field5263;
		this.field5260[14] = var1.field5274;
		this.field5260[15] = 1.0F;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "-115"
	)
	float method9429() {
		return this.field5260[14] * this.field5260[3] * this.field5260[5] * this.field5260[8] + this.field5260[5] * this.field5260[2] * this.field5260[11] * this.field5260[12] + (this.field5260[12] * this.field5260[7] * this.field5260[1] * this.field5260[10] + (this.field5260[1] * this.field5260[4] * this.field5260[11] * this.field5260[14] + (this.field5260[9] * this.field5260[7] * this.field5260[0] * this.field5260[14] + this.field5260[10] * this.field5260[0] * this.field5260[5] * this.field5260[15] - this.field5260[0] * this.field5260[5] * this.field5260[11] * this.field5260[14] - this.field5260[9] * this.field5260[6] * this.field5260[0] * this.field5260[15] + this.field5260[13] * this.field5260[6] * this.field5260[0] * this.field5260[11] - this.field5260[10] * this.field5260[0] * this.field5260[7] * this.field5260[13] - this.field5260[15] * this.field5260[1] * this.field5260[4] * this.field5260[10]) + this.field5260[8] * this.field5260[6] * this.field5260[1] * this.field5260[15] - this.field5260[12] * this.field5260[11] * this.field5260[6] * this.field5260[1] - this.field5260[14] * this.field5260[8] * this.field5260[7] * this.field5260[1]) + this.field5260[2] * this.field5260[4] * this.field5260[9] * this.field5260[15] - this.field5260[11] * this.field5260[4] * this.field5260[2] * this.field5260[13] - this.field5260[8] * this.field5260[2] * this.field5260[5] * this.field5260[15]) + this.field5260[13] * this.field5260[7] * this.field5260[2] * this.field5260[8] - this.field5260[12] * this.field5260[9] * this.field5260[2] * this.field5260[7] - this.field5260[4] * this.field5260[3] * this.field5260[9] * this.field5260[14] + this.field5260[4] * this.field5260[3] * this.field5260[10] * this.field5260[13] - this.field5260[12] * this.field5260[5] * this.field5260[3] * this.field5260[10] - this.field5260[8] * this.field5260[6] * this.field5260[3] * this.field5260[13] + this.field5260[12] * this.field5260[6] * this.field5260[3] * this.field5260[9];
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-64629359"
	)
	public void method9431() {
		float var1 = 1.0F / this.method9429();
		float var2 = var1 * (this.field5260[13] * this.field5260[11] * this.field5260[6] + (this.field5260[15] * this.field5260[5] * this.field5260[10] - this.field5260[5] * this.field5260[11] * this.field5260[14] - this.field5260[15] * this.field5260[6] * this.field5260[9]) + this.field5260[9] * this.field5260[7] * this.field5260[14] - this.field5260[13] * this.field5260[7] * this.field5260[10]);
		float var3 = (this.field5260[10] * -this.field5260[1] * this.field5260[15] + this.field5260[14] * this.field5260[1] * this.field5260[11] + this.field5260[2] * this.field5260[9] * this.field5260[15] - this.field5260[13] * this.field5260[11] * this.field5260[2] - this.field5260[14] * this.field5260[9] * this.field5260[3] + this.field5260[10] * this.field5260[3] * this.field5260[13]) * var1;
		float var4 = (this.field5260[14] * this.field5260[3] * this.field5260[5] + this.field5260[15] * this.field5260[1] * this.field5260[6] - this.field5260[1] * this.field5260[7] * this.field5260[14] - this.field5260[5] * this.field5260[2] * this.field5260[15] + this.field5260[13] * this.field5260[7] * this.field5260[2] - this.field5260[13] * this.field5260[3] * this.field5260[6]) * var1;
		float var5 = (this.field5260[6] * this.field5260[3] * this.field5260[9] + (this.field5260[6] * -this.field5260[1] * this.field5260[11] + this.field5260[10] * this.field5260[7] * this.field5260[1] + this.field5260[11] * this.field5260[5] * this.field5260[2] - this.field5260[9] * this.field5260[7] * this.field5260[2] - this.field5260[10] * this.field5260[3] * this.field5260[5])) * var1;
		float var6 = (this.field5260[12] * this.field5260[10] * this.field5260[7] + (this.field5260[14] * this.field5260[11] * this.field5260[4] + this.field5260[15] * this.field5260[10] * -this.field5260[4] + this.field5260[8] * this.field5260[6] * this.field5260[15] - this.field5260[6] * this.field5260[11] * this.field5260[12] - this.field5260[8] * this.field5260[7] * this.field5260[14])) * var1;
		float var7 = (this.field5260[14] * this.field5260[3] * this.field5260[8] + this.field5260[12] * this.field5260[2] * this.field5260[11] + (this.field5260[0] * this.field5260[10] * this.field5260[15] - this.field5260[14] * this.field5260[0] * this.field5260[11] - this.field5260[2] * this.field5260[8] * this.field5260[15]) - this.field5260[10] * this.field5260[3] * this.field5260[12]) * var1;
		float var8 = var1 * (this.field5260[15] * this.field5260[2] * this.field5260[4] + this.field5260[14] * this.field5260[0] * this.field5260[7] + -this.field5260[0] * this.field5260[6] * this.field5260[15] - this.field5260[12] * this.field5260[2] * this.field5260[7] - this.field5260[3] * this.field5260[4] * this.field5260[14] + this.field5260[3] * this.field5260[6] * this.field5260[12]);
		float var9 = var1 * (this.field5260[6] * this.field5260[0] * this.field5260[11] - this.field5260[10] * this.field5260[7] * this.field5260[0] - this.field5260[2] * this.field5260[4] * this.field5260[11] + this.field5260[8] * this.field5260[2] * this.field5260[7] + this.field5260[10] * this.field5260[4] * this.field5260[3] - this.field5260[6] * this.field5260[3] * this.field5260[8]);
		float var10 = var1 * (this.field5260[12] * this.field5260[11] * this.field5260[5] + (this.field5260[9] * this.field5260[4] * this.field5260[15] - this.field5260[13] * this.field5260[4] * this.field5260[11] - this.field5260[8] * this.field5260[5] * this.field5260[15]) + this.field5260[7] * this.field5260[8] * this.field5260[13] - this.field5260[12] * this.field5260[7] * this.field5260[9]);
		float var11 = var1 * (this.field5260[9] * -this.field5260[0] * this.field5260[15] + this.field5260[11] * this.field5260[0] * this.field5260[13] + this.field5260[15] * this.field5260[1] * this.field5260[8] - this.field5260[1] * this.field5260[11] * this.field5260[12] - this.field5260[8] * this.field5260[3] * this.field5260[13] + this.field5260[12] * this.field5260[9] * this.field5260[3]);
		float var12 = var1 * (this.field5260[12] * this.field5260[7] * this.field5260[1] + (this.field5260[15] * this.field5260[0] * this.field5260[5] - this.field5260[0] * this.field5260[7] * this.field5260[13] - this.field5260[1] * this.field5260[4] * this.field5260[15]) + this.field5260[13] * this.field5260[3] * this.field5260[4] - this.field5260[12] * this.field5260[5] * this.field5260[3]);
		float var13 = var1 * (this.field5260[8] * this.field5260[3] * this.field5260[5] + (this.field5260[4] * this.field5260[1] * this.field5260[11] + this.field5260[11] * -this.field5260[0] * this.field5260[5] + this.field5260[9] * this.field5260[0] * this.field5260[7] - this.field5260[8] * this.field5260[1] * this.field5260[7] - this.field5260[3] * this.field5260[4] * this.field5260[9]));
		float var14 = (this.field5260[9] * this.field5260[6] * this.field5260[12] + (this.field5260[5] * this.field5260[8] * this.field5260[14] + this.field5260[14] * -this.field5260[4] * this.field5260[9] + this.field5260[10] * this.field5260[4] * this.field5260[13] - this.field5260[10] * this.field5260[5] * this.field5260[12] - this.field5260[6] * this.field5260[8] * this.field5260[13])) * var1;
		float var15 = var1 * (this.field5260[12] * this.field5260[1] * this.field5260[10] + (this.field5260[14] * this.field5260[9] * this.field5260[0] - this.field5260[10] * this.field5260[0] * this.field5260[13] - this.field5260[8] * this.field5260[1] * this.field5260[14]) + this.field5260[8] * this.field5260[2] * this.field5260[13] - this.field5260[12] * this.field5260[9] * this.field5260[2]);
		float var16 = var1 * (this.field5260[12] * this.field5260[5] * this.field5260[2] + (this.field5260[6] * this.field5260[0] * this.field5260[13] + this.field5260[5] * -this.field5260[0] * this.field5260[14] + this.field5260[14] * this.field5260[4] * this.field5260[1] - this.field5260[12] * this.field5260[1] * this.field5260[6] - this.field5260[13] * this.field5260[2] * this.field5260[4]));
		float var17 = (this.field5260[2] * this.field5260[4] * this.field5260[9] + this.field5260[8] * this.field5260[6] * this.field5260[1] + (this.field5260[10] * this.field5260[0] * this.field5260[5] - this.field5260[6] * this.field5260[0] * this.field5260[9] - this.field5260[4] * this.field5260[1] * this.field5260[10]) - this.field5260[8] * this.field5260[5] * this.field5260[2]) * var1;
		this.field5260[0] = var2;
		this.field5260[1] = var3;
		this.field5260[2] = var4;
		this.field5260[3] = var5;
		this.field5260[4] = var6;
		this.field5260[5] = var7;
		this.field5260[6] = var8;
		this.field5260[7] = var9;
		this.field5260[8] = var10;
		this.field5260[9] = var11;
		this.field5260[10] = var12;
		this.field5260[11] = var13;
		this.field5260[12] = var14;
		this.field5260[13] = var15;
		this.field5260[14] = var16;
		this.field5260[15] = var17;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "-2101166113"
	)
	public void method9491(float var1, float var2, float var3, float var4) {
		this.field5260[0] = var1;
		this.field5260[1] = 0.0F;
		this.field5260[2] = 0.0F;
		this.field5260[3] = 0.0F;
		this.field5260[4] = 0.0F;
		this.field5260[5] = var2;
		this.field5260[6] = 0.0F;
		this.field5260[7] = 0.0F;
		this.field5260[8] = 0.0F;
		this.field5260[9] = 0.0F;
		this.field5260[10] = var3;
		this.field5260[11] = 0.0F;
		this.field5260[12] = 0.0F;
		this.field5260[13] = 0.0F;
		this.field5260[14] = 0.0F;
		this.field5260[15] = var4;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(FFF[FI)V",
		garbageValue = "1045119330"
	)
	@Export("transformPoint")
	public void transformPoint(float var1, float var2, float var3, float[] var4) {
		var4[0] = this.field5260[12] + var3 * this.field5260[8] + this.field5260[0] * var1 + this.field5260[4] * var2;
		var4[1] = this.field5260[5] * var2 + var1 * this.field5260[1] + var3 * this.field5260[9] + this.field5260[13];
		var4[2] = this.field5260[14] + this.field5260[2] * var1 + this.field5260[6] * var2 + this.field5260[10] * var3;
		if (var4.length > 3) {
			var4[3] = this.field5260[15] + var2 * this.field5260[7] + this.field5260[3] * var1 + this.field5260[11] * var3;
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(FFFI)Lrx;",
		garbageValue = "-582377025"
	)
	public ProjectionCoord method9434(float var1, float var2, float var3) {
		float var4 = 1.0F / (var1 * this.field5260[3] + this.field5260[7] * var2 + var3 * this.field5260[11] + this.field5260[15]);
		return FaceNormal.method5848((this.field5260[12] + var3 * this.field5260[8] + var2 * this.field5260[4] + var1 * this.field5260[0]) * var4, (this.field5260[13] + this.field5260[9] * var3 + var2 * this.field5260[5] + var1 * this.field5260[1]) * var4, (this.field5260[10] * var3 + var1 * this.field5260[2] + var2 * this.field5260[6] + this.field5260[14]) * var4);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(FFFI)F",
		garbageValue = "-1870335324"
	)
	public float method9435(float var1, float var2, float var3) {
		return var1 * this.field5260[0] + this.field5260[4] * var2 + this.field5260[8] * var3 + this.field5260[12];
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(FFFB)F",
		garbageValue = "-34"
	)
	public float method9436(float var1, float var2, float var3) {
		return this.field5260[13] + this.field5260[5] * var2 + this.field5260[1] * var1 + var3 * this.field5260[9];
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(FFFS)F",
		garbageValue = "1603"
	)
	public float method9437(float var1, float var2, float var3) {
		return this.field5260[6] * var2 + this.field5260[2] * var1 + this.field5260[10] * var3 + this.field5260[14];
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "-1589304907"
	)
	public float[] method9495() {
		float[] var1 = new float[3];
		ProjectionCoord var2 = new ProjectionCoord(this.field5260[0], this.field5260[1], this.field5260[2]);
		ProjectionCoord var3 = new ProjectionCoord(this.field5260[4], this.field5260[5], this.field5260[6]);
		ProjectionCoord var4 = new ProjectionCoord(this.field5260[8], this.field5260[9], this.field5260[10]);
		var1[0] = var2.method9306();
		var1[1] = var3.method9306();
		var1[2] = var4.method9306();
		return var1;
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder();
		this.method9420();
		this.method9478();

		for (int var2 = 0; var2 < 4; ++var2) {
			for (int var3 = 0; var3 < 4; ++var3) {
				if (var3 > 0) {
					var1.append("\t");
				}

				float var4 = this.field5260[var3 + var2 * 4];
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
		int var3 = var2 * 31 + Arrays.hashCode(this.field5260);
		return var3;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof TransformationMatrix)) {
			return false;
		} else {
			TransformationMatrix var2 = (TransformationMatrix)var1;

			for (int var3 = 0; var3 < 16; ++var3) {
				if (this.field5260[var3] != var2.field5260[var3]) {
					return false;
				}
			}

			return true;
		}
	}
}
