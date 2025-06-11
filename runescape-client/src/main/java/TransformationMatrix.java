import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rz")
@Implements("TransformationMatrix")
public final class TransformationMatrix {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	public static final TransformationMatrix field4986;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lrz;"
	)
	static TransformationMatrix[] field4981;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 807658107
	)
	static int field4982;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1584756353
	)
	static int field4980;
	@ObfuscatedName("ac")
	public float[] field4984;

	static {
		field4986 = new TransformationMatrix();
		field4981 = new TransformationMatrix[0];
		field4982 = 16;
		field4981 = new TransformationMatrix[16];
		field4980 = 0;
	}

	public TransformationMatrix() {
		this.field4984 = new float[16];
		this.method8776();
	}

	@ObfuscatedSignature(
		descriptor = "(Lrz;)V"
	)
	public TransformationMatrix(TransformationMatrix var1) {
		this.field4984 = new float[16];
		this.method8778(var1);
	}

	@ObfuscatedSignature(
		descriptor = "(Lwt;Z)V"
	)
	public TransformationMatrix(Buffer var1, boolean var2) {
		this.field4984 = new float[16];
		this.method8773(var1, var2);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "776678911"
	)
	public void method8772() {
		synchronized(field4981) {
			if (field4980 < field4982) {
				field4981[++field4980 - 1] = this;
			}

		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lwt;ZI)V",
		garbageValue = "-231750250"
	)
	void method8773(Buffer var1, boolean var2) {
		if (var2) {
			class448 var4 = new class448();
			var4.method8875(WorldMapDecoration.method6615(var1.readShort()));
			var4.method8876(WorldMapDecoration.method6615(var1.readShort()));
			var4.method8877(WorldMapDecoration.method6615(var1.readShort()));
			var4.method8878((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort());
			this.method8796(var4);
		} else {
			for (int var3 = 0; var3 < 16; ++var3) {
				this.field4984[var3] = var1.method10861();
			}
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "-436569271"
	)
	float[] method8774() {
		float[] var1 = new float[3];
		if ((double)this.field4984[2] < 0.999D && (double)this.field4984[2] > -0.999D) {
			var1[1] = (float)(-Math.asin((double)this.field4984[2]));
			double var2 = Math.cos((double)var1[1]);
			var1[0] = (float)Math.atan2((double)this.field4984[6] / var2, (double)this.field4984[10] / var2);
			var1[2] = (float)Math.atan2((double)this.field4984[1] / var2, (double)this.field4984[0] / var2);
		} else {
			var1[0] = 0.0F;
			var1[1] = (float)Math.atan2((double)this.field4984[2], 0.0D);
			var1[2] = (float)Math.atan2((double)(-this.field4984[9]), (double)this.field4984[5]);
		}

		return var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "1732667320"
	)
	public float[] method8775() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field4984[6])), 0.0F, 0.0F};
		double var2 = Math.cos((double)var1[0]);
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) {
			var4 = (double)this.field4984[2];
			var6 = (double)this.field4984[10];
			double var8 = (double)this.field4984[4];
			double var10 = (double)this.field4984[5];
			var1[1] = (float)Math.atan2(var4, var6);
			var1[2] = (float)Math.atan2(var8, var10);
		} else {
			var4 = (double)this.field4984[1];
			var6 = (double)this.field4984[0];
			if (this.field4984[6] < 0.0F) {
				var1[1] = (float)Math.atan2(var4, var6);
			} else {
				var1[1] = (float)(-Math.atan2(var4, var6));
			}

			var1[2] = 0.0F;
		}

		return var1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-653648542"
	)
	void method8776() {
		this.field4984[0] = 1.0F;
		this.field4984[1] = 0.0F;
		this.field4984[2] = 0.0F;
		this.field4984[3] = 0.0F;
		this.field4984[4] = 0.0F;
		this.field4984[5] = 1.0F;
		this.field4984[6] = 0.0F;
		this.field4984[7] = 0.0F;
		this.field4984[8] = 0.0F;
		this.field4984[9] = 0.0F;
		this.field4984[10] = 1.0F;
		this.field4984[11] = 0.0F;
		this.field4984[12] = 0.0F;
		this.field4984[13] = 0.0F;
		this.field4984[14] = 0.0F;
		this.field4984[15] = 1.0F;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "20"
	)
	public void method8777() {
		this.field4984[0] = 0.0F;
		this.field4984[1] = 0.0F;
		this.field4984[2] = 0.0F;
		this.field4984[3] = 0.0F;
		this.field4984[4] = 0.0F;
		this.field4984[5] = 0.0F;
		this.field4984[6] = 0.0F;
		this.field4984[7] = 0.0F;
		this.field4984[8] = 0.0F;
		this.field4984[9] = 0.0F;
		this.field4984[10] = 0.0F;
		this.field4984[11] = 0.0F;
		this.field4984[12] = 0.0F;
		this.field4984[13] = 0.0F;
		this.field4984[14] = 0.0F;
		this.field4984[15] = 0.0F;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lrz;I)V",
		garbageValue = "-1662681798"
	)
	public void method8778(TransformationMatrix var1) {
		System.arraycopy(var1.field4984, 0, this.field4984, 0, 16);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "1733045735"
	)
	public void method8779(float var1) {
		this.method8780(var1, var1, var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(FFFB)V",
		garbageValue = "113"
	)
	public void method8780(float var1, float var2, float var3) {
		this.method8776();
		this.field4984[0] = var1;
		this.field4984[5] = var2;
		this.field4984[10] = var3;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lrz;B)V",
		garbageValue = "92"
	)
	public void method8781(TransformationMatrix var1) {
		for (int var2 = 0; var2 < this.field4984.length; ++var2) {
			float[] var10000 = this.field4984;
			var10000[var2] += var1.field4984[var2];
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lrz;I)V",
		garbageValue = "-303329759"
	)
	public void method8782(TransformationMatrix var1) {
		float var2 = var1.field4984[12] * this.field4984[3] + this.field4984[2] * var1.field4984[8] + var1.field4984[0] * this.field4984[0] + this.field4984[1] * var1.field4984[4];
		float var3 = this.field4984[0] * var1.field4984[1] + this.field4984[1] * var1.field4984[5] + var1.field4984[9] * this.field4984[2] + var1.field4984[13] * this.field4984[3];
		float var4 = var1.field4984[14] * this.field4984[3] + var1.field4984[6] * this.field4984[1] + var1.field4984[2] * this.field4984[0] + this.field4984[2] * var1.field4984[10];
		float var5 = this.field4984[0] * var1.field4984[3] + var1.field4984[7] * this.field4984[1] + this.field4984[2] * var1.field4984[11] + this.field4984[3] * var1.field4984[15];
		float var6 = var1.field4984[4] * this.field4984[5] + this.field4984[4] * var1.field4984[0] + this.field4984[6] * var1.field4984[8] + this.field4984[7] * var1.field4984[12];
		float var7 = this.field4984[6] * var1.field4984[9] + var1.field4984[1] * this.field4984[4] + this.field4984[5] * var1.field4984[5] + var1.field4984[13] * this.field4984[7];
		float var8 = var1.field4984[14] * this.field4984[7] + var1.field4984[10] * this.field4984[6] + var1.field4984[6] * this.field4984[5] + var1.field4984[2] * this.field4984[4];
		float var9 = this.field4984[7] * var1.field4984[15] + this.field4984[6] * var1.field4984[11] + var1.field4984[3] * this.field4984[4] + this.field4984[5] * var1.field4984[7];
		float var10 = this.field4984[8] * var1.field4984[0] + this.field4984[9] * var1.field4984[4] + var1.field4984[8] * this.field4984[10] + this.field4984[11] * var1.field4984[12];
		float var11 = var1.field4984[5] * this.field4984[9] + this.field4984[8] * var1.field4984[1] + var1.field4984[9] * this.field4984[10] + this.field4984[11] * var1.field4984[13];
		float var12 = var1.field4984[2] * this.field4984[8] + var1.field4984[6] * this.field4984[9] + this.field4984[10] * var1.field4984[10] + this.field4984[11] * var1.field4984[14];
		float var13 = this.field4984[10] * var1.field4984[11] + var1.field4984[3] * this.field4984[8] + this.field4984[9] * var1.field4984[7] + this.field4984[11] * var1.field4984[15];
		float var14 = this.field4984[14] * var1.field4984[8] + var1.field4984[0] * this.field4984[12] + var1.field4984[4] * this.field4984[13] + this.field4984[15] * var1.field4984[12];
		float var15 = this.field4984[15] * var1.field4984[13] + var1.field4984[9] * this.field4984[14] + this.field4984[13] * var1.field4984[5] + this.field4984[12] * var1.field4984[1];
		float var16 = var1.field4984[10] * this.field4984[14] + var1.field4984[6] * this.field4984[13] + var1.field4984[2] * this.field4984[12] + var1.field4984[14] * this.field4984[15];
		float var17 = this.field4984[13] * var1.field4984[7] + this.field4984[12] * var1.field4984[3] + this.field4984[14] * var1.field4984[11] + var1.field4984[15] * this.field4984[15];
		this.field4984[0] = var2;
		this.field4984[1] = var3;
		this.field4984[2] = var4;
		this.field4984[3] = var5;
		this.field4984[4] = var6;
		this.field4984[5] = var7;
		this.field4984[6] = var8;
		this.field4984[7] = var9;
		this.field4984[8] = var10;
		this.field4984[9] = var11;
		this.field4984[10] = var12;
		this.field4984[11] = var13;
		this.field4984[12] = var14;
		this.field4984[13] = var15;
		this.field4984[14] = var16;
		this.field4984[15] = var17;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lqi;I)V",
		garbageValue = "1453735347"
	)
	public void method8791(class441 var1) {
		float var2 = var1.field4951.field4972 * var1.field4951.field4972;
		float var3 = var1.field4951.field4975 * var1.field4951.field4972;
		float var4 = var1.field4951.field4972 * var1.field4951.field4976;
		float var5 = var1.field4951.field4972 * var1.field4951.field4977;
		float var6 = var1.field4951.field4975 * var1.field4951.field4975;
		float var7 = var1.field4951.field4976 * var1.field4951.field4975;
		float var8 = var1.field4951.field4977 * var1.field4951.field4975;
		float var9 = var1.field4951.field4976 * var1.field4951.field4976;
		float var10 = var1.field4951.field4976 * var1.field4951.field4977;
		float var11 = var1.field4951.field4977 * var1.field4951.field4977;
		this.field4984[0] = var6 + var2 - var11 - var9;
		this.field4984[1] = var5 + var5 + var7 + var7;
		this.field4984[2] = var8 - var4 - var4 + var8;
		this.field4984[4] = var7 - var5 - var5 + var7;
		this.field4984[5] = var2 + var9 - var6 - var11;
		this.field4984[6] = var3 + var10 + var3 + var10;
		this.field4984[8] = var4 + var8 + var8 + var4;
		this.field4984[9] = var10 - var3 - var3 + var10;
		this.field4984[10] = var11 + var2 - var9 - var6;
		float[] var12 = this.field4984;
		float[] var13 = this.field4984;
		this.field4984[11] = 0.0F;
		var13[7] = 0.0F;
		var12[3] = 0.0F;
		this.field4984[12] = var1.field4946.field4967;
		this.field4984[13] = var1.field4946.field4971;
		this.field4984[14] = var1.field4946.field4969;
		this.field4984[15] = 1.0F;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lrw;I)V",
		garbageValue = "2097195830"
	)
	public void method8784(class446 var1) {
		float var2 = var1.field4972 * var1.field4972;
		float var3 = var1.field4975 * var1.field4972;
		float var4 = var1.field4972 * var1.field4976;
		float var5 = var1.field4977 * var1.field4972;
		float var6 = var1.field4975 * var1.field4975;
		float var7 = var1.field4975 * var1.field4976;
		float var8 = var1.field4977 * var1.field4975;
		float var9 = var1.field4976 * var1.field4976;
		float var10 = var1.field4976 * var1.field4977;
		float var11 = var1.field4977 * var1.field4977;
		this.field4984[0] = var6 + var2 - var11 - var9;
		this.field4984[1] = var5 + var5 + var7 + var7;
		this.field4984[2] = var8 + (var8 - var4 - var4);
		this.field4984[4] = var7 - var5 - var5 + var7;
		this.field4984[5] = var9 + var2 - var6 - var11;
		this.field4984[6] = var10 + var3 + var10 + var3;
		this.field4984[8] = var8 + var4 + var8 + var4;
		this.field4984[9] = var10 - var3 - var3 + var10;
		this.field4984[10] = var11 + var2 - var9 - var6;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lrg;I)V",
		garbageValue = "-479359896"
	)
	public void method8796(class448 var1) {
		this.field4984[0] = var1.field4996;
		this.field4984[1] = var1.field4989;
		this.field4984[2] = var1.field4990;
		this.field4984[3] = 0.0F;
		this.field4984[4] = var1.field4991;
		this.field4984[5] = var1.field4992;
		this.field4984[6] = var1.field4997;
		this.field4984[7] = 0.0F;
		this.field4984[8] = var1.field4994;
		this.field4984[9] = var1.field5000;
		this.field4984[10] = var1.field4993;
		this.field4984[11] = 0.0F;
		this.field4984[12] = var1.field4995;
		this.field4984[13] = var1.field4998;
		this.field4984[14] = var1.field4999;
		this.field4984[15] = 1.0F;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "1418601169"
	)
	float method8786() {
		return this.field4984[8] * this.field4984[2] * this.field4984[7] * this.field4984[13] + this.field4984[2] * this.field4984[4] * this.field4984[9] * this.field4984[15] + this.field4984[12] * this.field4984[1] * this.field4984[7] * this.field4984[10] + (this.field4984[11] * this.field4984[4] * this.field4984[1] * this.field4984[14] + (this.field4984[9] * this.field4984[7] * this.field4984[0] * this.field4984[14] + this.field4984[13] * this.field4984[0] * this.field4984[6] * this.field4984[11] + (this.field4984[15] * this.field4984[0] * this.field4984[5] * this.field4984[10] - this.field4984[14] * this.field4984[11] * this.field4984[0] * this.field4984[5] - this.field4984[15] * this.field4984[0] * this.field4984[6] * this.field4984[9]) - this.field4984[13] * this.field4984[10] * this.field4984[0] * this.field4984[7] - this.field4984[15] * this.field4984[10] * this.field4984[4] * this.field4984[1]) + this.field4984[15] * this.field4984[6] * this.field4984[1] * this.field4984[8] - this.field4984[1] * this.field4984[6] * this.field4984[11] * this.field4984[12] - this.field4984[7] * this.field4984[1] * this.field4984[8] * this.field4984[14]) - this.field4984[13] * this.field4984[11] * this.field4984[2] * this.field4984[4] - this.field4984[5] * this.field4984[2] * this.field4984[8] * this.field4984[15] + this.field4984[11] * this.field4984[2] * this.field4984[5] * this.field4984[12] - this.field4984[2] * this.field4984[7] * this.field4984[9] * this.field4984[12] - this.field4984[9] * this.field4984[3] * this.field4984[4] * this.field4984[14] + this.field4984[13] * this.field4984[4] * this.field4984[3] * this.field4984[10] + this.field4984[14] * this.field4984[8] * this.field4984[5] * this.field4984[3] - this.field4984[10] * this.field4984[5] * this.field4984[3] * this.field4984[12] - this.field4984[13] * this.field4984[8] * this.field4984[6] * this.field4984[3] + this.field4984[12] * this.field4984[3] * this.field4984[6] * this.field4984[9];
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1505125459"
	)
	public void method8787() {
		float var1 = 1.0F / this.method8786();
		float var2 = (this.field4984[13] * this.field4984[6] * this.field4984[11] + (this.field4984[10] * this.field4984[5] * this.field4984[15] - this.field4984[14] * this.field4984[11] * this.field4984[5] - this.field4984[9] * this.field4984[6] * this.field4984[15]) + this.field4984[9] * this.field4984[7] * this.field4984[14] - this.field4984[13] * this.field4984[7] * this.field4984[10]) * var1;
		float var3 = (-this.field4984[1] * this.field4984[10] * this.field4984[15] + this.field4984[14] * this.field4984[11] * this.field4984[1] + this.field4984[9] * this.field4984[2] * this.field4984[15] - this.field4984[2] * this.field4984[11] * this.field4984[13] - this.field4984[3] * this.field4984[9] * this.field4984[14] + this.field4984[3] * this.field4984[10] * this.field4984[13]) * var1;
		float var4 = (this.field4984[5] * this.field4984[3] * this.field4984[14] + this.field4984[13] * this.field4984[7] * this.field4984[2] + (this.field4984[15] * this.field4984[6] * this.field4984[1] - this.field4984[14] * this.field4984[7] * this.field4984[1] - this.field4984[15] * this.field4984[2] * this.field4984[5]) - this.field4984[13] * this.field4984[3] * this.field4984[6]) * var1;
		float var5 = (-this.field4984[1] * this.field4984[6] * this.field4984[11] + this.field4984[10] * this.field4984[1] * this.field4984[7] + this.field4984[11] * this.field4984[5] * this.field4984[2] - this.field4984[7] * this.field4984[2] * this.field4984[9] - this.field4984[5] * this.field4984[3] * this.field4984[10] + this.field4984[9] * this.field4984[6] * this.field4984[3]) * var1;
		float var6 = var1 * (this.field4984[12] * this.field4984[10] * this.field4984[7] + (this.field4984[15] * this.field4984[8] * this.field4984[6] + this.field4984[11] * this.field4984[4] * this.field4984[14] + this.field4984[10] * -this.field4984[4] * this.field4984[15] - this.field4984[12] * this.field4984[6] * this.field4984[11] - this.field4984[7] * this.field4984[8] * this.field4984[14]));
		float var7 = (this.field4984[12] * this.field4984[2] * this.field4984[11] + (this.field4984[15] * this.field4984[0] * this.field4984[10] - this.field4984[14] * this.field4984[11] * this.field4984[0] - this.field4984[2] * this.field4984[8] * this.field4984[15]) + this.field4984[14] * this.field4984[8] * this.field4984[3] - this.field4984[12] * this.field4984[10] * this.field4984[3]) * var1;
		float var8 = var1 * (this.field4984[12] * this.field4984[6] * this.field4984[3] + (this.field4984[4] * this.field4984[2] * this.field4984[15] + this.field4984[14] * this.field4984[7] * this.field4984[0] + this.field4984[15] * -this.field4984[0] * this.field4984[6] - this.field4984[12] * this.field4984[7] * this.field4984[2] - this.field4984[3] * this.field4984[4] * this.field4984[14]));
		float var9 = (this.field4984[10] * this.field4984[3] * this.field4984[4] + this.field4984[6] * this.field4984[0] * this.field4984[11] - this.field4984[0] * this.field4984[7] * this.field4984[10] - this.field4984[11] * this.field4984[4] * this.field4984[2] + this.field4984[8] * this.field4984[7] * this.field4984[2] - this.field4984[8] * this.field4984[6] * this.field4984[3]) * var1;
		float var10 = (this.field4984[13] * this.field4984[8] * this.field4984[7] + this.field4984[9] * this.field4984[4] * this.field4984[15] - this.field4984[13] * this.field4984[4] * this.field4984[11] - this.field4984[15] * this.field4984[5] * this.field4984[8] + this.field4984[5] * this.field4984[11] * this.field4984[12] - this.field4984[7] * this.field4984[9] * this.field4984[12]) * var1;
		float var11 = var1 * (this.field4984[9] * this.field4984[3] * this.field4984[12] + (this.field4984[15] * this.field4984[9] * -this.field4984[0] + this.field4984[13] * this.field4984[11] * this.field4984[0] + this.field4984[1] * this.field4984[8] * this.field4984[15] - this.field4984[12] * this.field4984[11] * this.field4984[1] - this.field4984[8] * this.field4984[3] * this.field4984[13]));
		float var12 = (this.field4984[12] * this.field4984[7] * this.field4984[1] + (this.field4984[15] * this.field4984[5] * this.field4984[0] - this.field4984[13] * this.field4984[7] * this.field4984[0] - this.field4984[1] * this.field4984[4] * this.field4984[15]) + this.field4984[4] * this.field4984[3] * this.field4984[13] - this.field4984[3] * this.field4984[5] * this.field4984[12]) * var1;
		float var13 = (this.field4984[8] * this.field4984[5] * this.field4984[3] + (this.field4984[0] * this.field4984[7] * this.field4984[9] + this.field4984[11] * -this.field4984[0] * this.field4984[5] + this.field4984[11] * this.field4984[1] * this.field4984[4] - this.field4984[1] * this.field4984[7] * this.field4984[8] - this.field4984[9] * this.field4984[4] * this.field4984[3])) * var1;
		float var14 = (this.field4984[14] * this.field4984[5] * this.field4984[8] + this.field4984[13] * this.field4984[4] * this.field4984[10] + -this.field4984[4] * this.field4984[9] * this.field4984[14] - this.field4984[5] * this.field4984[10] * this.field4984[12] - this.field4984[13] * this.field4984[8] * this.field4984[6] + this.field4984[12] * this.field4984[6] * this.field4984[9]) * var1;
		float var15 = (this.field4984[2] * this.field4984[8] * this.field4984[13] + this.field4984[12] * this.field4984[10] * this.field4984[1] + (this.field4984[9] * this.field4984[0] * this.field4984[14] - this.field4984[13] * this.field4984[10] * this.field4984[0] - this.field4984[14] * this.field4984[1] * this.field4984[8]) - this.field4984[12] * this.field4984[9] * this.field4984[2]) * var1;
		float var16 = var1 * (this.field4984[2] * this.field4984[5] * this.field4984[12] + (this.field4984[14] * -this.field4984[0] * this.field4984[5] + this.field4984[13] * this.field4984[6] * this.field4984[0] + this.field4984[14] * this.field4984[4] * this.field4984[1] - this.field4984[1] * this.field4984[6] * this.field4984[12] - this.field4984[2] * this.field4984[4] * this.field4984[13]));
		float var17 = var1 * (this.field4984[8] * this.field4984[6] * this.field4984[1] + (this.field4984[10] * this.field4984[0] * this.field4984[5] - this.field4984[0] * this.field4984[6] * this.field4984[9] - this.field4984[4] * this.field4984[1] * this.field4984[10]) + this.field4984[9] * this.field4984[4] * this.field4984[2] - this.field4984[8] * this.field4984[2] * this.field4984[5]);
		this.field4984[0] = var2;
		this.field4984[1] = var3;
		this.field4984[2] = var4;
		this.field4984[3] = var5;
		this.field4984[4] = var6;
		this.field4984[5] = var7;
		this.field4984[6] = var8;
		this.field4984[7] = var9;
		this.field4984[8] = var10;
		this.field4984[9] = var11;
		this.field4984[10] = var12;
		this.field4984[11] = var13;
		this.field4984[12] = var14;
		this.field4984[13] = var15;
		this.field4984[14] = var16;
		this.field4984[15] = var17;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "-1378246891"
	)
	public void method8813(float var1, float var2, float var3, float var4) {
		this.field4984[0] = var1;
		this.field4984[1] = 0.0F;
		this.field4984[2] = 0.0F;
		this.field4984[3] = 0.0F;
		this.field4984[4] = 0.0F;
		this.field4984[5] = var2;
		this.field4984[6] = 0.0F;
		this.field4984[7] = 0.0F;
		this.field4984[8] = 0.0F;
		this.field4984[9] = 0.0F;
		this.field4984[10] = var3;
		this.field4984[11] = 0.0F;
		this.field4984[12] = 0.0F;
		this.field4984[13] = 0.0F;
		this.field4984[14] = 0.0F;
		this.field4984[15] = var4;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(FFF[FB)V",
		garbageValue = "0"
	)
	@Export("transformPoint")
	public void transformPoint(float var1, float var2, float var3, float[] var4) {
		var4[0] = this.field4984[12] + var3 * this.field4984[8] + var1 * this.field4984[0] + var2 * this.field4984[4];
		var4[1] = this.field4984[13] + this.field4984[1] * var1 + var2 * this.field4984[5] + var3 * this.field4984[9];
		var4[2] = this.field4984[10] * var3 + var2 * this.field4984[6] + this.field4984[2] * var1 + this.field4984[14];
		if (var4.length > 3) {
			var4[3] = var3 * this.field4984[11] + var2 * this.field4984[7] + var1 * this.field4984[3] + this.field4984[15];
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(FFFI)Lre;",
		garbageValue = "292154950"
	)
	public class445 method8790(float var1, float var2, float var3) {
		float var4 = 1.0F / (this.field4984[15] + this.field4984[3] * var1 + this.field4984[7] * var2 + var3 * this.field4984[11]);
		return class47.method1781((var1 * this.field4984[0] + var2 * this.field4984[4] + this.field4984[8] * var3 + this.field4984[12]) * var4, var4 * (var1 * this.field4984[1] + this.field4984[5] * var2 + this.field4984[9] * var3 + this.field4984[13]), var4 * (var3 * this.field4984[10] + var1 * this.field4984[2] + this.field4984[6] * var2 + this.field4984[14]));
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(FFFB)F",
		garbageValue = "-76"
	)
	public float method8835(float var1, float var2, float var3) {
		return var1 * this.field4984[0] + this.field4984[4] * var2 + this.field4984[8] * var3 + this.field4984[12];
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(FFFI)F",
		garbageValue = "1037831591"
	)
	public float method8792(float var1, float var2, float var3) {
		return var3 * this.field4984[9] + var2 * this.field4984[5] + var1 * this.field4984[1] + this.field4984[13];
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(FFFB)F",
		garbageValue = "108"
	)
	public float method8793(float var1, float var2, float var3) {
		return this.field4984[10] * var3 + this.field4984[2] * var1 + this.field4984[6] * var2 + this.field4984[14];
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "-26"
	)
	public float[] method8795() {
		float[] var1 = new float[3];
		class445 var2 = new class445(this.field4984[0], this.field4984[1], this.field4984[2]);
		class445 var3 = new class445(this.field4984[4], this.field4984[5], this.field4984[6]);
		class445 var4 = new class445(this.field4984[8], this.field4984[9], this.field4984[10]);
		var1[0] = var2.method8720();
		var1[1] = var3.method8720();
		var1[2] = var4.method8720();
		return var1;
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder();
		this.method8775();
		this.method8774();

		for (int var2 = 0; var2 < 4; ++var2) {
			for (int var3 = 0; var3 < 4; ++var3) {
				if (var3 > 0) {
					var1.append("\t");
				}

				float var4 = this.field4984[var3 + var2 * 4];
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
				if (this.field4984[var3] != var2.field4984[var3]) {
					return false;
				}
			}

			return true;
		}
	}

	public int hashCode() {
		boolean var1 = true;
		byte var2 = 1;
		int var3 = var2 * 31 + Arrays.hashCode(this.field4984);
		return var3;
	}
}
