import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rj")
@Implements("TransformationMatrix")
public final class TransformationMatrix {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lrj;"
	)
	public static final TransformationMatrix field5184;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lrj;"
	)
	static TransformationMatrix[] field5185;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 886646907
	)
	static int field5189;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	public static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("aq")
	public float[] field5186;

	static {
		field5184 = new TransformationMatrix();
		field5185 = new TransformationMatrix[0];
		Projection.method5424(16);
	}

	public TransformationMatrix() {
		this.field5186 = new float[16];
		this.method9090();
	}

	@ObfuscatedSignature(
		descriptor = "(Lrj;)V"
	)
	public TransformationMatrix(TransformationMatrix var1) {
		this.field5186 = new float[16];
		this.method9092(var1);
	}

	@ObfuscatedSignature(
		descriptor = "(Lwb;Z)V"
	)
	public TransformationMatrix(Buffer var1, boolean var2) {
		this.field5186 = new float[16];
		this.method9087(var1, var2);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1118270412"
	)
	public void method9140() {
		synchronized(field5185) {
			if (class172.field1931 < field5189) {
				field5185[++class172.field1931 - 1] = this;
			}

		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwb;ZI)V",
		garbageValue = "233086428"
	)
	void method9087(Buffer var1, boolean var2) {
		if (var2) {
			class455 var13 = new class455();
			int var6 = var1.readShort();
			var6 &= 16383;
			float var5 = (float)((double)((float)var6) * 3.834951969714103E-4D);
			var13.method9181(var5);
			int var9 = var1.readShort();
			var9 &= 16383;
			float var8 = (float)((double)((float)var9) * 3.834951969714103E-4D);
			var13.method9182(var8);
			int var12 = var1.readShort();
			var12 &= 16383;
			float var11 = (float)(3.834951969714103E-4D * (double)((float)var12));
			var13.method9183(var11);
			var13.method9197((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort());
			this.method9099(var13);
		} else {
			for (int var3 = 0; var3 < 16; ++var3) {
				this.field5186[var3] = var1.method11362();
			}
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "1901292354"
	)
	float[] method9088() {
		float[] var1 = new float[3];
		if ((double)this.field5186[2] < 0.999D && (double)this.field5186[2] > -0.999D) {
			var1[1] = (float)(-Math.asin((double)this.field5186[2]));
			double var2 = Math.cos((double)var1[1]);
			var1[0] = (float)Math.atan2((double)this.field5186[6] / var2, (double)this.field5186[10] / var2);
			var1[2] = (float)Math.atan2((double)this.field5186[1] / var2, (double)this.field5186[0] / var2);
		} else {
			var1[0] = 0.0F;
			var1[1] = (float)Math.atan2((double)this.field5186[2], 0.0D);
			var1[2] = (float)Math.atan2((double)(-this.field5186[9]), (double)this.field5186[5]);
		}

		return var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(S)[F",
		garbageValue = "-1992"
	)
	public float[] method9089() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field5186[6])), 0.0F, 0.0F};
		double var2 = Math.cos((double)var1[0]);
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) {
			var4 = (double)this.field5186[2];
			var6 = (double)this.field5186[10];
			double var8 = (double)this.field5186[4];
			double var10 = (double)this.field5186[5];
			var1[1] = (float)Math.atan2(var4, var6);
			var1[2] = (float)Math.atan2(var8, var10);
		} else {
			var4 = (double)this.field5186[1];
			var6 = (double)this.field5186[0];
			if (this.field5186[6] < 0.0F) {
				var1[1] = (float)Math.atan2(var4, var6);
			} else {
				var1[1] = (float)(-Math.atan2(var4, var6));
			}

			var1[2] = 0.0F;
		}

		return var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "23888595"
	)
	void method9090() {
		this.field5186[0] = 1.0F;
		this.field5186[1] = 0.0F;
		this.field5186[2] = 0.0F;
		this.field5186[3] = 0.0F;
		this.field5186[4] = 0.0F;
		this.field5186[5] = 1.0F;
		this.field5186[6] = 0.0F;
		this.field5186[7] = 0.0F;
		this.field5186[8] = 0.0F;
		this.field5186[9] = 0.0F;
		this.field5186[10] = 1.0F;
		this.field5186[11] = 0.0F;
		this.field5186[12] = 0.0F;
		this.field5186[13] = 0.0F;
		this.field5186[14] = 0.0F;
		this.field5186[15] = 1.0F;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1987859805"
	)
	public void method9091() {
		this.field5186[0] = 0.0F;
		this.field5186[1] = 0.0F;
		this.field5186[2] = 0.0F;
		this.field5186[3] = 0.0F;
		this.field5186[4] = 0.0F;
		this.field5186[5] = 0.0F;
		this.field5186[6] = 0.0F;
		this.field5186[7] = 0.0F;
		this.field5186[8] = 0.0F;
		this.field5186[9] = 0.0F;
		this.field5186[10] = 0.0F;
		this.field5186[11] = 0.0F;
		this.field5186[12] = 0.0F;
		this.field5186[13] = 0.0F;
		this.field5186[14] = 0.0F;
		this.field5186[15] = 0.0F;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lrj;B)V",
		garbageValue = "18"
	)
	public void method9092(TransformationMatrix var1) {
		System.arraycopy(var1.field5186, 0, this.field5186, 0, 16);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "92"
	)
	public void method9093(float var1) {
		this.method9132(var1, var1, var1);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "1337249877"
	)
	public void method9132(float var1, float var2, float var3) {
		this.method9090();
		this.field5186[0] = var1;
		this.field5186[5] = var2;
		this.field5186[10] = var3;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lrj;I)V",
		garbageValue = "1920399902"
	)
	public void method9095(TransformationMatrix var1) {
		for (int var2 = 0; var2 < this.field5186.length; ++var2) {
			float[] var10000 = this.field5186;
			var10000[var2] += var1.field5186[var2];
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lrj;I)V",
		garbageValue = "304536838"
	)
	public void method9173(TransformationMatrix var1) {
		float var2 = this.field5186[3] * var1.field5186[12] + this.field5186[0] * var1.field5186[0] + this.field5186[1] * var1.field5186[4] + this.field5186[2] * var1.field5186[8];
		float var3 = this.field5186[3] * var1.field5186[13] + this.field5186[1] * var1.field5186[5] + var1.field5186[1] * this.field5186[0] + var1.field5186[9] * this.field5186[2];
		float var4 = this.field5186[1] * var1.field5186[6] + this.field5186[0] * var1.field5186[2] + var1.field5186[10] * this.field5186[2] + var1.field5186[14] * this.field5186[3];
		float var5 = this.field5186[0] * var1.field5186[3] + this.field5186[1] * var1.field5186[7] + var1.field5186[11] * this.field5186[2] + var1.field5186[15] * this.field5186[3];
		float var6 = var1.field5186[8] * this.field5186[6] + this.field5186[5] * var1.field5186[4] + this.field5186[4] * var1.field5186[0] + this.field5186[7] * var1.field5186[12];
		float var7 = this.field5186[7] * var1.field5186[13] + var1.field5186[9] * this.field5186[6] + this.field5186[4] * var1.field5186[1] + var1.field5186[5] * this.field5186[5];
		float var8 = var1.field5186[10] * this.field5186[6] + this.field5186[4] * var1.field5186[2] + this.field5186[5] * var1.field5186[6] + var1.field5186[14] * this.field5186[7];
		float var9 = this.field5186[7] * var1.field5186[15] + this.field5186[4] * var1.field5186[3] + this.field5186[5] * var1.field5186[7] + this.field5186[6] * var1.field5186[11];
		float var10 = this.field5186[11] * var1.field5186[12] + var1.field5186[4] * this.field5186[9] + var1.field5186[0] * this.field5186[8] + this.field5186[10] * var1.field5186[8];
		float var11 = var1.field5186[13] * this.field5186[11] + var1.field5186[5] * this.field5186[9] + var1.field5186[1] * this.field5186[8] + this.field5186[10] * var1.field5186[9];
		float var12 = var1.field5186[2] * this.field5186[8] + this.field5186[9] * var1.field5186[6] + var1.field5186[10] * this.field5186[10] + var1.field5186[14] * this.field5186[11];
		float var13 = this.field5186[11] * var1.field5186[15] + this.field5186[8] * var1.field5186[3] + this.field5186[9] * var1.field5186[7] + var1.field5186[11] * this.field5186[10];
		float var14 = this.field5186[15] * var1.field5186[12] + this.field5186[12] * var1.field5186[0] + var1.field5186[4] * this.field5186[13] + var1.field5186[8] * this.field5186[14];
		float var15 = var1.field5186[9] * this.field5186[14] + var1.field5186[5] * this.field5186[13] + var1.field5186[1] * this.field5186[12] + var1.field5186[13] * this.field5186[15];
		float var16 = var1.field5186[2] * this.field5186[12] + this.field5186[13] * var1.field5186[6] + this.field5186[14] * var1.field5186[10] + this.field5186[15] * var1.field5186[14];
		float var17 = this.field5186[15] * var1.field5186[15] + var1.field5186[7] * this.field5186[13] + var1.field5186[3] * this.field5186[12] + var1.field5186[11] * this.field5186[14];
		this.field5186[0] = var2;
		this.field5186[1] = var3;
		this.field5186[2] = var4;
		this.field5186[3] = var5;
		this.field5186[4] = var6;
		this.field5186[5] = var7;
		this.field5186[6] = var8;
		this.field5186[7] = var9;
		this.field5186[8] = var10;
		this.field5186[9] = var11;
		this.field5186[10] = var12;
		this.field5186[11] = var13;
		this.field5186[12] = var14;
		this.field5186[13] = var15;
		this.field5186[14] = var16;
		this.field5186[15] = var17;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lrq;I)V",
		garbageValue = "1734592813"
	)
	public void method9097(class448 var1) {
		float var2 = var1.field5155.field5181 * var1.field5155.field5181;
		float var3 = var1.field5155.field5182 * var1.field5155.field5181;
		float var4 = var1.field5155.field5181 * var1.field5155.field5179;
		float var5 = var1.field5155.field5180 * var1.field5155.field5181;
		float var6 = var1.field5155.field5182 * var1.field5155.field5182;
		float var7 = var1.field5155.field5182 * var1.field5155.field5179;
		float var8 = var1.field5155.field5182 * var1.field5155.field5180;
		float var9 = var1.field5155.field5179 * var1.field5155.field5179;
		float var10 = var1.field5155.field5179 * var1.field5155.field5180;
		float var11 = var1.field5155.field5180 * var1.field5155.field5180;
		this.field5186[0] = var6 + var2 - var11 - var9;
		this.field5186[1] = var7 + var5 + var7 + var5;
		this.field5186[2] = var8 - var4 - var4 + var8;
		this.field5186[4] = var7 - var5 - var5 + var7;
		this.field5186[5] = var9 + var2 - var6 - var11;
		this.field5186[6] = var10 + var3 + var10 + var3;
		this.field5186[8] = var4 + var8 + var8 + var4;
		this.field5186[9] = var10 - var3 - var3 + var10;
		this.field5186[10] = var11 + var2 - var9 - var6;
		float[] var12 = this.field5186;
		float[] var13 = this.field5186;
		this.field5186[11] = 0.0F;
		var13[7] = 0.0F;
		var12[3] = 0.0F;
		this.field5186[12] = var1.field5154.field5175;
		this.field5186[13] = var1.field5154.field5176;
		this.field5186[14] = var1.field5154.field5169;
		this.field5186[15] = 1.0F;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lrl;I)V",
		garbageValue = "-2023786499"
	)
	public void method9107(class453 var1) {
		float var2 = var1.field5181 * var1.field5181;
		float var3 = var1.field5181 * var1.field5182;
		float var4 = var1.field5179 * var1.field5181;
		float var5 = var1.field5180 * var1.field5181;
		float var6 = var1.field5182 * var1.field5182;
		float var7 = var1.field5182 * var1.field5179;
		float var8 = var1.field5180 * var1.field5182;
		float var9 = var1.field5179 * var1.field5179;
		float var10 = var1.field5180 * var1.field5179;
		float var11 = var1.field5180 * var1.field5180;
		this.field5186[0] = var2 + var6 - var11 - var9;
		this.field5186[1] = var7 + var5 + var7 + var5;
		this.field5186[2] = var8 + (var8 - var4 - var4);
		this.field5186[4] = var7 + (var7 - var5 - var5);
		this.field5186[5] = var2 + var9 - var6 - var11;
		this.field5186[6] = var3 + var3 + var10 + var10;
		this.field5186[8] = var4 + var8 + var8 + var4;
		this.field5186[9] = var10 - var3 - var3 + var10;
		this.field5186[10] = var11 + var2 - var9 - var6;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lra;I)V",
		garbageValue = "479560175"
	)
	public void method9099(class455 var1) {
		this.field5186[0] = var1.field5201;
		this.field5186[1] = var1.field5191;
		this.field5186[2] = var1.field5192;
		this.field5186[3] = 0.0F;
		this.field5186[4] = var1.field5190;
		this.field5186[5] = var1.field5194;
		this.field5186[6] = var1.field5195;
		this.field5186[7] = 0.0F;
		this.field5186[8] = var1.field5196;
		this.field5186[9] = var1.field5197;
		this.field5186[10] = var1.field5198;
		this.field5186[11] = 0.0F;
		this.field5186[12] = var1.field5199;
		this.field5186[13] = var1.field5200;
		this.field5186[14] = var1.field5193;
		this.field5186[15] = 1.0F;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "1122818978"
	)
	float method9100() {
		return this.field5186[12] * this.field5186[9] * this.field5186[3] * this.field5186[6] + (this.field5186[8] * this.field5186[3] * this.field5186[5] * this.field5186[14] + this.field5186[13] * this.field5186[4] * this.field5186[3] * this.field5186[10] + (this.field5186[13] * this.field5186[2] * this.field5186[7] * this.field5186[8] + this.field5186[12] * this.field5186[11] * this.field5186[5] * this.field5186[2] + (this.field5186[15] * this.field5186[9] * this.field5186[2] * this.field5186[4] + this.field5186[12] * this.field5186[10] * this.field5186[7] * this.field5186[1] + (this.field5186[9] * this.field5186[0] * this.field5186[7] * this.field5186[14] + this.field5186[11] * this.field5186[0] * this.field5186[6] * this.field5186[13] + (this.field5186[15] * this.field5186[10] * this.field5186[0] * this.field5186[5] - this.field5186[14] * this.field5186[11] * this.field5186[5] * this.field5186[0] - this.field5186[15] * this.field5186[9] * this.field5186[0] * this.field5186[6]) - this.field5186[7] * this.field5186[0] * this.field5186[10] * this.field5186[13] - this.field5186[15] * this.field5186[10] * this.field5186[1] * this.field5186[4] + this.field5186[14] * this.field5186[4] * this.field5186[1] * this.field5186[11] + this.field5186[15] * this.field5186[6] * this.field5186[1] * this.field5186[8] - this.field5186[1] * this.field5186[6] * this.field5186[11] * this.field5186[12] - this.field5186[7] * this.field5186[1] * this.field5186[8] * this.field5186[14]) - this.field5186[4] * this.field5186[2] * this.field5186[11] * this.field5186[13] - this.field5186[8] * this.field5186[5] * this.field5186[2] * this.field5186[15]) - this.field5186[12] * this.field5186[7] * this.field5186[2] * this.field5186[9] - this.field5186[14] * this.field5186[4] * this.field5186[3] * this.field5186[9]) - this.field5186[3] * this.field5186[5] * this.field5186[10] * this.field5186[12] - this.field5186[3] * this.field5186[6] * this.field5186[8] * this.field5186[13]);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1413933172"
	)
	public void method9101() {
		float var1 = 1.0F / this.method9100();
		float var2 = (this.field5186[9] * this.field5186[7] * this.field5186[14] + this.field5186[13] * this.field5186[6] * this.field5186[11] + (this.field5186[5] * this.field5186[10] * this.field5186[15] - this.field5186[5] * this.field5186[11] * this.field5186[14] - this.field5186[15] * this.field5186[9] * this.field5186[6]) - this.field5186[7] * this.field5186[10] * this.field5186[13]) * var1;
		float var3 = (-this.field5186[1] * this.field5186[10] * this.field5186[15] + this.field5186[1] * this.field5186[11] * this.field5186[14] + this.field5186[9] * this.field5186[2] * this.field5186[15] - this.field5186[13] * this.field5186[2] * this.field5186[11] - this.field5186[14] * this.field5186[3] * this.field5186[9] + this.field5186[10] * this.field5186[3] * this.field5186[13]) * var1;
		float var4 = (this.field5186[14] * this.field5186[5] * this.field5186[3] + this.field5186[2] * this.field5186[7] * this.field5186[13] + (this.field5186[15] * this.field5186[6] * this.field5186[1] - this.field5186[14] * this.field5186[7] * this.field5186[1] - this.field5186[15] * this.field5186[2] * this.field5186[5]) - this.field5186[13] * this.field5186[6] * this.field5186[3]) * var1;
		float var5 = (this.field5186[9] * this.field5186[6] * this.field5186[3] + (this.field5186[6] * -this.field5186[1] * this.field5186[11] + this.field5186[7] * this.field5186[1] * this.field5186[10] + this.field5186[11] * this.field5186[2] * this.field5186[5] - this.field5186[9] * this.field5186[7] * this.field5186[2] - this.field5186[3] * this.field5186[5] * this.field5186[10])) * var1;
		float var6 = (this.field5186[7] * this.field5186[10] * this.field5186[12] + (this.field5186[8] * this.field5186[6] * this.field5186[15] + -this.field5186[4] * this.field5186[10] * this.field5186[15] + this.field5186[14] * this.field5186[4] * this.field5186[11] - this.field5186[12] * this.field5186[11] * this.field5186[6] - this.field5186[8] * this.field5186[7] * this.field5186[14])) * var1;
		float var7 = (this.field5186[8] * this.field5186[3] * this.field5186[14] + this.field5186[15] * this.field5186[10] * this.field5186[0] - this.field5186[11] * this.field5186[0] * this.field5186[14] - this.field5186[15] * this.field5186[2] * this.field5186[8] + this.field5186[11] * this.field5186[2] * this.field5186[12] - this.field5186[12] * this.field5186[10] * this.field5186[3]) * var1;
		float var8 = var1 * (this.field5186[7] * this.field5186[0] * this.field5186[14] + this.field5186[6] * -this.field5186[0] * this.field5186[15] + this.field5186[15] * this.field5186[2] * this.field5186[4] - this.field5186[12] * this.field5186[2] * this.field5186[7] - this.field5186[4] * this.field5186[3] * this.field5186[14] + this.field5186[6] * this.field5186[3] * this.field5186[12]);
		float var9 = (this.field5186[2] * this.field5186[7] * this.field5186[8] + (this.field5186[0] * this.field5186[6] * this.field5186[11] - this.field5186[10] * this.field5186[0] * this.field5186[7] - this.field5186[11] * this.field5186[2] * this.field5186[4]) + this.field5186[3] * this.field5186[4] * this.field5186[10] - this.field5186[3] * this.field5186[6] * this.field5186[8]) * var1;
		float var10 = (this.field5186[13] * this.field5186[8] * this.field5186[7] + this.field5186[12] * this.field5186[5] * this.field5186[11] + (this.field5186[15] * this.field5186[4] * this.field5186[9] - this.field5186[13] * this.field5186[4] * this.field5186[11] - this.field5186[15] * this.field5186[5] * this.field5186[8]) - this.field5186[12] * this.field5186[7] * this.field5186[9]) * var1;
		float var11 = (this.field5186[12] * this.field5186[3] * this.field5186[9] + (this.field5186[11] * this.field5186[0] * this.field5186[13] + this.field5186[9] * -this.field5186[0] * this.field5186[15] + this.field5186[15] * this.field5186[1] * this.field5186[8] - this.field5186[1] * this.field5186[11] * this.field5186[12] - this.field5186[13] * this.field5186[8] * this.field5186[3])) * var1;
		float var12 = (this.field5186[12] * this.field5186[7] * this.field5186[1] + (this.field5186[5] * this.field5186[0] * this.field5186[15] - this.field5186[13] * this.field5186[7] * this.field5186[0] - this.field5186[4] * this.field5186[1] * this.field5186[15]) + this.field5186[3] * this.field5186[4] * this.field5186[13] - this.field5186[12] * this.field5186[3] * this.field5186[5]) * var1;
		float var13 = (this.field5186[5] * -this.field5186[0] * this.field5186[11] + this.field5186[9] * this.field5186[7] * this.field5186[0] + this.field5186[4] * this.field5186[1] * this.field5186[11] - this.field5186[8] * this.field5186[7] * this.field5186[1] - this.field5186[3] * this.field5186[4] * this.field5186[9] + this.field5186[8] * this.field5186[3] * this.field5186[5]) * var1;
		float var14 = var1 * (this.field5186[13] * this.field5186[4] * this.field5186[10] + -this.field5186[4] * this.field5186[9] * this.field5186[14] + this.field5186[14] * this.field5186[8] * this.field5186[5] - this.field5186[10] * this.field5186[5] * this.field5186[12] - this.field5186[13] * this.field5186[8] * this.field5186[6] + this.field5186[6] * this.field5186[9] * this.field5186[12]);
		float var15 = var1 * (this.field5186[13] * this.field5186[8] * this.field5186[2] + this.field5186[14] * this.field5186[0] * this.field5186[9] - this.field5186[10] * this.field5186[0] * this.field5186[13] - this.field5186[8] * this.field5186[1] * this.field5186[14] + this.field5186[12] * this.field5186[1] * this.field5186[10] - this.field5186[12] * this.field5186[9] * this.field5186[2]);
		float var16 = (this.field5186[12] * this.field5186[5] * this.field5186[2] + (this.field5186[6] * this.field5186[0] * this.field5186[13] + -this.field5186[0] * this.field5186[5] * this.field5186[14] + this.field5186[14] * this.field5186[1] * this.field5186[4] - this.field5186[12] * this.field5186[1] * this.field5186[6] - this.field5186[2] * this.field5186[4] * this.field5186[13])) * var1;
		float var17 = var1 * (this.field5186[2] * this.field5186[4] * this.field5186[9] + this.field5186[0] * this.field5186[5] * this.field5186[10] - this.field5186[9] * this.field5186[0] * this.field5186[6] - this.field5186[10] * this.field5186[1] * this.field5186[4] + this.field5186[8] * this.field5186[1] * this.field5186[6] - this.field5186[2] * this.field5186[5] * this.field5186[8]);
		this.field5186[0] = var2;
		this.field5186[1] = var3;
		this.field5186[2] = var4;
		this.field5186[3] = var5;
		this.field5186[4] = var6;
		this.field5186[5] = var7;
		this.field5186[6] = var8;
		this.field5186[7] = var9;
		this.field5186[8] = var10;
		this.field5186[9] = var11;
		this.field5186[10] = var12;
		this.field5186[11] = var13;
		this.field5186[12] = var14;
		this.field5186[13] = var15;
		this.field5186[14] = var16;
		this.field5186[15] = var17;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(FFFFB)V",
		garbageValue = "-97"
	)
	public void method9102(float var1, float var2, float var3, float var4) {
		this.field5186[0] = var1;
		this.field5186[1] = 0.0F;
		this.field5186[2] = 0.0F;
		this.field5186[3] = 0.0F;
		this.field5186[4] = 0.0F;
		this.field5186[5] = var2;
		this.field5186[6] = 0.0F;
		this.field5186[7] = 0.0F;
		this.field5186[8] = 0.0F;
		this.field5186[9] = 0.0F;
		this.field5186[10] = var3;
		this.field5186[11] = 0.0F;
		this.field5186[12] = 0.0F;
		this.field5186[13] = 0.0F;
		this.field5186[14] = 0.0F;
		this.field5186[15] = var4;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(FFF[FB)V",
		garbageValue = "-34"
	)
	@Export("transformPoint")
	public void transformPoint(float var1, float var2, float var3, float[] var4) {
		var4[0] = this.field5186[12] + this.field5186[0] * var1 + var2 * this.field5186[4] + this.field5186[8] * var3;
		var4[1] = var3 * this.field5186[9] + var2 * this.field5186[5] + this.field5186[1] * var1 + this.field5186[13];
		var4[2] = this.field5186[10] * var3 + var2 * this.field5186[6] + var1 * this.field5186[2] + this.field5186[14];
		if (var4.length > 3) {
			var4[3] = this.field5186[11] * var3 + this.field5186[7] * var2 + this.field5186[3] * var1 + this.field5186[15];
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(FFFB)Lre;",
		garbageValue = "-18"
	)
	public class452 method9144(float var1, float var2, float var3) {
		float var4 = 1.0F / (this.field5186[15] + var3 * this.field5186[11] + this.field5186[3] * var1 + this.field5186[7] * var2);
		return WorldMapSection0.method6761((var3 * this.field5186[8] + this.field5186[0] * var1 + var2 * this.field5186[4] + this.field5186[12]) * var4, (var1 * this.field5186[1] + var2 * this.field5186[5] + this.field5186[9] * var3 + this.field5186[13]) * var4, var4 * (this.field5186[14] + this.field5186[6] * var2 + var1 * this.field5186[2] + var3 * this.field5186[10]));
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(FFFS)F",
		garbageValue = "-7464"
	)
	public float method9105(float var1, float var2, float var3) {
		return this.field5186[8] * var3 + var2 * this.field5186[4] + var1 * this.field5186[0] + this.field5186[12];
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(FFFI)F",
		garbageValue = "-1713215239"
	)
	public float method9174(float var1, float var2, float var3) {
		return var1 * this.field5186[1] + this.field5186[5] * var2 + var3 * this.field5186[9] + this.field5186[13];
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(FFFB)F",
		garbageValue = "75"
	)
	public float method9103(float var1, float var2, float var3) {
		return this.field5186[14] + var1 * this.field5186[2] + var2 * this.field5186[6] + var3 * this.field5186[10];
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "-1342062163"
	)
	public float[] method9096() {
		float[] var1 = new float[3];
		class452 var2 = new class452(this.field5186[0], this.field5186[1], this.field5186[2]);
		class452 var3 = new class452(this.field5186[4], this.field5186[5], this.field5186[6]);
		class452 var4 = new class452(this.field5186[8], this.field5186[9], this.field5186[10]);
		var1[0] = var2.method9002();
		var1[1] = var3.method9002();
		var1[2] = var4.method9002();
		return var1;
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder();
		this.method9089();
		this.method9088();

		for (int var2 = 0; var2 < 4; ++var2) {
			for (int var3 = 0; var3 < 4; ++var3) {
				if (var3 > 0) {
					var1.append("\t");
				}

				float var4 = this.field5186[var3 + var2 * 4];
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
		int var3 = var2 * 31 + Arrays.hashCode(this.field5186);
		return var3;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof TransformationMatrix)) {
			return false;
		} else {
			TransformationMatrix var2 = (TransformationMatrix)var1;

			for (int var3 = 0; var3 < 16; ++var3) {
				if (var2.field5186[var3] != this.field5186[var3]) {
					return false;
				}
			}

			return true;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Lwr;",
		garbageValue = "534805617"
	)
	@Export("getDbRowType")
	public static DbRowType getDbRowType(int var0) {
		DbRowType var1 = (DbRowType)DbRowType.DBRowType_cache.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = DbRowType.field5839.takeFile(38, var0);
			var1 = new DbRowType();
			if (var2 != null) {
				var1.method11067(new Buffer(var2));
			}

			var1.method11070();
			DbRowType.DBRowType_cache.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1534331199"
	)
	public static int method9179(int var0) {
		long var2 = ViewportMouse.ViewportMouse_entityTags[var0];
		int var1 = (int)(var2 >>> 16 & 7L);
		return var1;
	}
}
