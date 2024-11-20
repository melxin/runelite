import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qb")
@Implements("TransformationMatrix")
public final class TransformationMatrix {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Lqb;"
	)
	static TransformationMatrix[] field4775;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 329064751
	)
	static int field4776;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 406051601
	)
	static int field4774;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	public static final TransformationMatrix field4779;
	@ObfuscatedName("st")
	@Export("ClanChat_inClanChat")
	static boolean ClanChat_inClanChat;
	@ObfuscatedName("ao")
	public float[] field4777;

	static {
		field4775 = new TransformationMatrix[0];
		PlayerType.method7494(100);
		field4779 = new TransformationMatrix();
	}

	public TransformationMatrix() {
		this.field4777 = new float[16];
		this.method8210();
	}

	@ObfuscatedSignature(
		descriptor = "(Lqb;)V"
	)
	public TransformationMatrix(TransformationMatrix var1) {
		this.field4777 = new float[16];
		this.method8212(var1);
	}

	@ObfuscatedSignature(
		descriptor = "(Lvj;Z)V"
	)
	public TransformationMatrix(Buffer var1, boolean var2) {
		this.field4777 = new float[16];
		this.method8207(var1, var2);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1953712247"
	)
	public void method8266() {
		synchronized(field4775) {
			if (field4774 < field4776 - 1) {
				field4775[++field4774 - 1] = this;
			}

		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lvj;ZI)V",
		garbageValue = "-722667138"
	)
	void method8207(Buffer var1, boolean var2) {
		if (var2) {
			class429 var4 = new class429();
			var4.method8310(UserComparator5.method3225(var1.readShort()));
			var4.method8301(UserComparator5.method3225(var1.readShort()));
			var4.method8303(UserComparator5.method3225(var1.readShort()));
			var4.method8304((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort());
			this.method8219(var4);
		} else {
			for (int var3 = 0; var3 < 16; ++var3) {
				this.field4777[var3] = var1.method10121();
			}
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "-385563797"
	)
	float[] method8208() {
		float[] var1 = new float[3];
		if ((double)this.field4777[2] < 0.999D && (double)this.field4777[2] > -0.999D) {
			var1[1] = (float)(-Math.asin((double)this.field4777[2]));
			double var2 = Math.cos((double)var1[1]);
			var1[0] = (float)Math.atan2((double)this.field4777[6] / var2, (double)this.field4777[10] / var2);
			var1[2] = (float)Math.atan2((double)this.field4777[1] / var2, (double)this.field4777[0] / var2);
		} else {
			var1[0] = 0.0F;
			var1[1] = (float)Math.atan2((double)this.field4777[2], 0.0D);
			var1[2] = (float)Math.atan2((double)(-this.field4777[9]), (double)this.field4777[5]);
		}

		return var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "-11"
	)
	public float[] method8209() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field4777[6])), 0.0F, 0.0F};
		double var2 = Math.cos((double)var1[0]);
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) {
			var4 = (double)this.field4777[2];
			var6 = (double)this.field4777[10];
			double var8 = (double)this.field4777[4];
			double var10 = (double)this.field4777[5];
			var1[1] = (float)Math.atan2(var4, var6);
			var1[2] = (float)Math.atan2(var8, var10);
		} else {
			var4 = (double)this.field4777[1];
			var6 = (double)this.field4777[0];
			if (this.field4777[6] < 0.0F) {
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
		descriptor = "(S)V",
		garbageValue = "6638"
	)
	void method8210() {
		this.field4777[0] = 1.0F;
		this.field4777[1] = 0.0F;
		this.field4777[2] = 0.0F;
		this.field4777[3] = 0.0F;
		this.field4777[4] = 0.0F;
		this.field4777[5] = 1.0F;
		this.field4777[6] = 0.0F;
		this.field4777[7] = 0.0F;
		this.field4777[8] = 0.0F;
		this.field4777[9] = 0.0F;
		this.field4777[10] = 1.0F;
		this.field4777[11] = 0.0F;
		this.field4777[12] = 0.0F;
		this.field4777[13] = 0.0F;
		this.field4777[14] = 0.0F;
		this.field4777[15] = 1.0F;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "54"
	)
	public void method8211() {
		this.field4777[0] = 0.0F;
		this.field4777[1] = 0.0F;
		this.field4777[2] = 0.0F;
		this.field4777[3] = 0.0F;
		this.field4777[4] = 0.0F;
		this.field4777[5] = 0.0F;
		this.field4777[6] = 0.0F;
		this.field4777[7] = 0.0F;
		this.field4777[8] = 0.0F;
		this.field4777[9] = 0.0F;
		this.field4777[10] = 0.0F;
		this.field4777[11] = 0.0F;
		this.field4777[12] = 0.0F;
		this.field4777[13] = 0.0F;
		this.field4777[14] = 0.0F;
		this.field4777[15] = 0.0F;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lqb;I)V",
		garbageValue = "1441206299"
	)
	public void method8212(TransformationMatrix var1) {
		System.arraycopy(var1.field4777, 0, this.field4777, 0, 16);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-184134"
	)
	public void method8213(float var1) {
		this.method8214(var1, var1, var1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(FFFB)V",
		garbageValue = "89"
	)
	public void method8214(float var1, float var2, float var3) {
		this.method8210();
		this.field4777[0] = var1;
		this.field4777[5] = var2;
		this.field4777[10] = var3;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lqb;I)V",
		garbageValue = "-393183661"
	)
	public void method8215(TransformationMatrix var1) {
		for (int var2 = 0; var2 < this.field4777.length; ++var2) {
			float[] var10000 = this.field4777;
			var10000[var2] += var1.field4777[var2];
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lqb;I)V",
		garbageValue = "-1062786657"
	)
	public void method8216(TransformationMatrix var1) {
		float var2 = var1.field4777[0] * this.field4777[0] + var1.field4777[4] * this.field4777[1] + this.field4777[2] * var1.field4777[8] + var1.field4777[12] * this.field4777[3];
		float var3 = var1.field4777[9] * this.field4777[2] + this.field4777[1] * var1.field4777[5] + this.field4777[0] * var1.field4777[1] + this.field4777[3] * var1.field4777[13];
		float var4 = this.field4777[3] * var1.field4777[14] + var1.field4777[10] * this.field4777[2] + this.field4777[1] * var1.field4777[6] + this.field4777[0] * var1.field4777[2];
		float var5 = var1.field4777[15] * this.field4777[3] + var1.field4777[11] * this.field4777[2] + this.field4777[1] * var1.field4777[7] + this.field4777[0] * var1.field4777[3];
		float var6 = var1.field4777[12] * this.field4777[7] + this.field4777[5] * var1.field4777[4] + this.field4777[4] * var1.field4777[0] + var1.field4777[8] * this.field4777[6];
		float var7 = this.field4777[7] * var1.field4777[13] + var1.field4777[9] * this.field4777[6] + this.field4777[4] * var1.field4777[1] + var1.field4777[5] * this.field4777[5];
		float var8 = this.field4777[4] * var1.field4777[2] + this.field4777[5] * var1.field4777[6] + var1.field4777[10] * this.field4777[6] + this.field4777[7] * var1.field4777[14];
		float var9 = this.field4777[7] * var1.field4777[15] + var1.field4777[11] * this.field4777[6] + this.field4777[4] * var1.field4777[3] + this.field4777[5] * var1.field4777[7];
		float var10 = this.field4777[11] * var1.field4777[12] + var1.field4777[8] * this.field4777[10] + var1.field4777[4] * this.field4777[9] + this.field4777[8] * var1.field4777[0];
		float var11 = var1.field4777[5] * this.field4777[9] + var1.field4777[1] * this.field4777[8] + var1.field4777[9] * this.field4777[10] + var1.field4777[13] * this.field4777[11];
		float var12 = this.field4777[11] * var1.field4777[14] + var1.field4777[10] * this.field4777[10] + var1.field4777[2] * this.field4777[8] + this.field4777[9] * var1.field4777[6];
		float var13 = var1.field4777[15] * this.field4777[11] + this.field4777[9] * var1.field4777[7] + var1.field4777[3] * this.field4777[8] + var1.field4777[11] * this.field4777[10];
		float var14 = var1.field4777[12] * this.field4777[15] + this.field4777[14] * var1.field4777[8] + this.field4777[12] * var1.field4777[0] + this.field4777[13] * var1.field4777[4];
		float var15 = var1.field4777[1] * this.field4777[12] + var1.field4777[5] * this.field4777[13] + var1.field4777[9] * this.field4777[14] + var1.field4777[13] * this.field4777[15];
		float var16 = this.field4777[14] * var1.field4777[10] + var1.field4777[2] * this.field4777[12] + var1.field4777[6] * this.field4777[13] + var1.field4777[14] * this.field4777[15];
		float var17 = var1.field4777[15] * this.field4777[15] + var1.field4777[7] * this.field4777[13] + this.field4777[12] * var1.field4777[3] + this.field4777[14] * var1.field4777[11];
		this.field4777[0] = var2;
		this.field4777[1] = var3;
		this.field4777[2] = var4;
		this.field4777[3] = var5;
		this.field4777[4] = var6;
		this.field4777[5] = var7;
		this.field4777[6] = var8;
		this.field4777[7] = var9;
		this.field4777[8] = var10;
		this.field4777[9] = var11;
		this.field4777[10] = var12;
		this.field4777[11] = var13;
		this.field4777[12] = var14;
		this.field4777[13] = var15;
		this.field4777[14] = var16;
		this.field4777[15] = var17;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lqk;I)V",
		garbageValue = "-895766063"
	)
	public void method8217(class422 var1) {
		float var2 = var1.field4744.field4773 * var1.field4744.field4773;
		float var3 = var1.field4744.field4773 * var1.field4744.field4770;
		float var4 = var1.field4744.field4773 * var1.field4744.field4771;
		float var5 = var1.field4744.field4772 * var1.field4744.field4773;
		float var6 = var1.field4744.field4770 * var1.field4744.field4770;
		float var7 = var1.field4744.field4771 * var1.field4744.field4770;
		float var8 = var1.field4744.field4770 * var1.field4744.field4772;
		float var9 = var1.field4744.field4771 * var1.field4744.field4771;
		float var10 = var1.field4744.field4771 * var1.field4744.field4772;
		float var11 = var1.field4744.field4772 * var1.field4744.field4772;
		this.field4777[0] = var6 + var2 - var11 - var9;
		this.field4777[1] = var5 + var5 + var7 + var7;
		this.field4777[2] = var8 + (var8 - var4 - var4);
		this.field4777[4] = var7 - var5 - var5 + var7;
		this.field4777[5] = var2 + var9 - var6 - var11;
		this.field4777[6] = var3 + var10 + var3 + var10;
		this.field4777[8] = var4 + var8 + var8 + var4;
		this.field4777[9] = var10 - var3 - var3 + var10;
		this.field4777[10] = var11 + var2 - var9 - var6;
		float[] var12 = this.field4777;
		float[] var13 = this.field4777;
		this.field4777[11] = 0.0F;
		var13[7] = 0.0F;
		var12[3] = 0.0F;
		this.field4777[12] = var1.field4745.field4764;
		this.field4777[13] = var1.field4745.field4763;
		this.field4777[14] = var1.field4745.field4766;
		this.field4777[15] = 1.0F;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lqs;I)V",
		garbageValue = "356861235"
	)
	public void method8298(class427 var1) {
		float var2 = var1.field4773 * var1.field4773;
		float var3 = var1.field4770 * var1.field4773;
		float var4 = var1.field4771 * var1.field4773;
		float var5 = var1.field4773 * var1.field4772;
		float var6 = var1.field4770 * var1.field4770;
		float var7 = var1.field4770 * var1.field4771;
		float var8 = var1.field4770 * var1.field4772;
		float var9 = var1.field4771 * var1.field4771;
		float var10 = var1.field4772 * var1.field4771;
		float var11 = var1.field4772 * var1.field4772;
		this.field4777[0] = var6 + var2 - var11 - var9;
		this.field4777[1] = var5 + var7 + var7 + var5;
		this.field4777[2] = var8 - var4 - var4 + var8;
		this.field4777[4] = var7 - var5 - var5 + var7;
		this.field4777[5] = var2 + var9 - var6 - var11;
		this.field4777[6] = var10 + var3 + var10 + var3;
		this.field4777[8] = var8 + var4 + var8 + var4;
		this.field4777[9] = var10 + (var10 - var3 - var3);
		this.field4777[10] = var11 + var2 - var9 - var6;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lqn;I)V",
		garbageValue = "-1479735113"
	)
	public void method8219(class429 var1) {
		this.field4777[0] = var1.field4789;
		this.field4777[1] = var1.field4782;
		this.field4777[2] = var1.field4783;
		this.field4777[3] = 0.0F;
		this.field4777[4] = var1.field4788;
		this.field4777[5] = var1.field4787;
		this.field4777[6] = var1.field4786;
		this.field4777[7] = 0.0F;
		this.field4777[8] = var1.field4781;
		this.field4777[9] = var1.field4792;
		this.field4777[10] = var1.field4784;
		this.field4777[11] = 0.0F;
		this.field4777[12] = var1.field4790;
		this.field4777[13] = var1.field4791;
		this.field4777[14] = var1.field4785;
		this.field4777[15] = 1.0F;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "-1981140480"
	)
	float method8220() {
		return this.field4777[9] * this.field4777[6] * this.field4777[3] * this.field4777[12] + (this.field4777[10] * this.field4777[3] * this.field4777[4] * this.field4777[13] + (this.field4777[13] * this.field4777[8] * this.field4777[2] * this.field4777[7] + this.field4777[9] * this.field4777[7] * this.field4777[0] * this.field4777[14] + this.field4777[0] * this.field4777[5] * this.field4777[10] * this.field4777[15] - this.field4777[14] * this.field4777[0] * this.field4777[5] * this.field4777[11] - this.field4777[9] * this.field4777[0] * this.field4777[6] * this.field4777[15] + this.field4777[13] * this.field4777[11] * this.field4777[0] * this.field4777[6] - this.field4777[7] * this.field4777[0] * this.field4777[10] * this.field4777[13] - this.field4777[4] * this.field4777[1] * this.field4777[10] * this.field4777[15] + this.field4777[11] * this.field4777[1] * this.field4777[4] * this.field4777[14] + this.field4777[8] * this.field4777[6] * this.field4777[1] * this.field4777[15] - this.field4777[12] * this.field4777[11] * this.field4777[6] * this.field4777[1] - this.field4777[14] * this.field4777[8] * this.field4777[7] * this.field4777[1] + this.field4777[7] * this.field4777[1] * this.field4777[10] * this.field4777[12] + this.field4777[15] * this.field4777[4] * this.field4777[2] * this.field4777[9] - this.field4777[13] * this.field4777[11] * this.field4777[2] * this.field4777[4] - this.field4777[15] * this.field4777[8] * this.field4777[2] * this.field4777[5] + this.field4777[5] * this.field4777[2] * this.field4777[11] * this.field4777[12] - this.field4777[2] * this.field4777[7] * this.field4777[9] * this.field4777[12] - this.field4777[3] * this.field4777[4] * this.field4777[9] * this.field4777[14]) + this.field4777[8] * this.field4777[3] * this.field4777[5] * this.field4777[14] - this.field4777[12] * this.field4777[10] * this.field4777[5] * this.field4777[3] - this.field4777[13] * this.field4777[8] * this.field4777[6] * this.field4777[3]);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2056560020"
	)
	public void method8234() {
		float var1 = 1.0F / this.method8220();
		float var2 = (this.field4777[14] * this.field4777[9] * this.field4777[7] + this.field4777[13] * this.field4777[11] * this.field4777[6] + (this.field4777[15] * this.field4777[10] * this.field4777[5] - this.field4777[14] * this.field4777[11] * this.field4777[5] - this.field4777[15] * this.field4777[6] * this.field4777[9]) - this.field4777[10] * this.field4777[7] * this.field4777[13]) * var1;
		float var3 = var1 * (this.field4777[13] * this.field4777[10] * this.field4777[3] + (this.field4777[15] * this.field4777[9] * this.field4777[2] + -this.field4777[1] * this.field4777[10] * this.field4777[15] + this.field4777[11] * this.field4777[1] * this.field4777[14] - this.field4777[13] * this.field4777[11] * this.field4777[2] - this.field4777[3] * this.field4777[9] * this.field4777[14]));
		float var4 = (this.field4777[1] * this.field4777[6] * this.field4777[15] - this.field4777[14] * this.field4777[7] * this.field4777[1] - this.field4777[15] * this.field4777[5] * this.field4777[2] + this.field4777[13] * this.field4777[2] * this.field4777[7] + this.field4777[3] * this.field4777[5] * this.field4777[14] - this.field4777[6] * this.field4777[3] * this.field4777[13]) * var1;
		float var5 = var1 * (this.field4777[11] * -this.field4777[1] * this.field4777[6] + this.field4777[1] * this.field4777[7] * this.field4777[10] + this.field4777[11] * this.field4777[2] * this.field4777[5] - this.field4777[9] * this.field4777[2] * this.field4777[7] - this.field4777[5] * this.field4777[3] * this.field4777[10] + this.field4777[3] * this.field4777[6] * this.field4777[9]);
		float var6 = (this.field4777[6] * this.field4777[8] * this.field4777[15] + this.field4777[11] * this.field4777[4] * this.field4777[14] + this.field4777[15] * -this.field4777[4] * this.field4777[10] - this.field4777[12] * this.field4777[11] * this.field4777[6] - this.field4777[8] * this.field4777[7] * this.field4777[14] + this.field4777[12] * this.field4777[7] * this.field4777[10]) * var1;
		float var7 = var1 * (this.field4777[14] * this.field4777[3] * this.field4777[8] + this.field4777[12] * this.field4777[2] * this.field4777[11] + (this.field4777[10] * this.field4777[0] * this.field4777[15] - this.field4777[11] * this.field4777[0] * this.field4777[14] - this.field4777[2] * this.field4777[8] * this.field4777[15]) - this.field4777[10] * this.field4777[3] * this.field4777[12]);
		float var8 = (this.field4777[3] * this.field4777[6] * this.field4777[12] + (this.field4777[15] * this.field4777[4] * this.field4777[2] + this.field4777[6] * -this.field4777[0] * this.field4777[15] + this.field4777[0] * this.field4777[7] * this.field4777[14] - this.field4777[12] * this.field4777[2] * this.field4777[7] - this.field4777[14] * this.field4777[3] * this.field4777[4])) * var1;
		float var9 = (this.field4777[11] * this.field4777[6] * this.field4777[0] - this.field4777[10] * this.field4777[0] * this.field4777[7] - this.field4777[11] * this.field4777[4] * this.field4777[2] + this.field4777[8] * this.field4777[7] * this.field4777[2] + this.field4777[10] * this.field4777[3] * this.field4777[4] - this.field4777[6] * this.field4777[3] * this.field4777[8]) * var1;
		float var10 = var1 * (this.field4777[13] * this.field4777[7] * this.field4777[8] + this.field4777[15] * this.field4777[4] * this.field4777[9] - this.field4777[11] * this.field4777[4] * this.field4777[13] - this.field4777[15] * this.field4777[8] * this.field4777[5] + this.field4777[12] * this.field4777[11] * this.field4777[5] - this.field4777[9] * this.field4777[7] * this.field4777[12]);
		float var11 = (this.field4777[15] * this.field4777[1] * this.field4777[8] + this.field4777[13] * this.field4777[0] * this.field4777[11] + this.field4777[9] * -this.field4777[0] * this.field4777[15] - this.field4777[1] * this.field4777[11] * this.field4777[12] - this.field4777[13] * this.field4777[3] * this.field4777[8] + this.field4777[12] * this.field4777[9] * this.field4777[3]) * var1;
		float var12 = var1 * (this.field4777[13] * this.field4777[3] * this.field4777[4] + this.field4777[12] * this.field4777[7] * this.field4777[1] + (this.field4777[0] * this.field4777[5] * this.field4777[15] - this.field4777[7] * this.field4777[0] * this.field4777[13] - this.field4777[15] * this.field4777[1] * this.field4777[4]) - this.field4777[12] * this.field4777[5] * this.field4777[3]);
		float var13 = (this.field4777[1] * this.field4777[4] * this.field4777[11] + -this.field4777[0] * this.field4777[5] * this.field4777[11] + this.field4777[7] * this.field4777[0] * this.field4777[9] - this.field4777[8] * this.field4777[1] * this.field4777[7] - this.field4777[3] * this.field4777[4] * this.field4777[9] + this.field4777[8] * this.field4777[3] * this.field4777[5]) * var1;
		float var14 = var1 * (this.field4777[9] * -this.field4777[4] * this.field4777[14] + this.field4777[13] * this.field4777[10] * this.field4777[4] + this.field4777[8] * this.field4777[5] * this.field4777[14] - this.field4777[5] * this.field4777[10] * this.field4777[12] - this.field4777[13] * this.field4777[6] * this.field4777[8] + this.field4777[12] * this.field4777[9] * this.field4777[6]);
		float var15 = var1 * (this.field4777[0] * this.field4777[9] * this.field4777[14] - this.field4777[0] * this.field4777[10] * this.field4777[13] - this.field4777[1] * this.field4777[8] * this.field4777[14] + this.field4777[12] * this.field4777[1] * this.field4777[10] + this.field4777[13] * this.field4777[8] * this.field4777[2] - this.field4777[12] * this.field4777[9] * this.field4777[2]);
		float var16 = var1 * (this.field4777[1] * this.field4777[4] * this.field4777[14] + this.field4777[13] * this.field4777[6] * this.field4777[0] + this.field4777[14] * this.field4777[5] * -this.field4777[0] - this.field4777[1] * this.field4777[6] * this.field4777[12] - this.field4777[2] * this.field4777[4] * this.field4777[13] + this.field4777[2] * this.field4777[5] * this.field4777[12]);
		float var17 = var1 * (this.field4777[8] * this.field4777[1] * this.field4777[6] + (this.field4777[10] * this.field4777[5] * this.field4777[0] - this.field4777[0] * this.field4777[6] * this.field4777[9] - this.field4777[1] * this.field4777[4] * this.field4777[10]) + this.field4777[2] * this.field4777[4] * this.field4777[9] - this.field4777[5] * this.field4777[2] * this.field4777[8]);
		this.field4777[0] = var2;
		this.field4777[1] = var3;
		this.field4777[2] = var4;
		this.field4777[3] = var5;
		this.field4777[4] = var6;
		this.field4777[5] = var7;
		this.field4777[6] = var8;
		this.field4777[7] = var9;
		this.field4777[8] = var10;
		this.field4777[9] = var11;
		this.field4777[10] = var12;
		this.field4777[11] = var13;
		this.field4777[12] = var14;
		this.field4777[13] = var15;
		this.field4777[14] = var16;
		this.field4777[15] = var17;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "171668238"
	)
	public void method8222(float var1, float var2, float var3, float var4) {
		this.field4777[0] = var1;
		this.field4777[1] = 0.0F;
		this.field4777[2] = 0.0F;
		this.field4777[3] = 0.0F;
		this.field4777[4] = 0.0F;
		this.field4777[5] = var2;
		this.field4777[6] = 0.0F;
		this.field4777[7] = 0.0F;
		this.field4777[8] = 0.0F;
		this.field4777[9] = 0.0F;
		this.field4777[10] = var3;
		this.field4777[11] = 0.0F;
		this.field4777[12] = 0.0F;
		this.field4777[13] = 0.0F;
		this.field4777[14] = 0.0F;
		this.field4777[15] = var4;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(FFF[FB)V",
		garbageValue = "-16"
	)
	@Export("transformPoint")
	public void transformPoint(float var1, float var2, float var3, float[] var4) {
		var4[0] = this.field4777[8] * var3 + this.field4777[0] * var1 + this.field4777[4] * var2 + this.field4777[12];
		var4[1] = this.field4777[13] + var1 * this.field4777[1] + var2 * this.field4777[5] + this.field4777[9] * var3;
		var4[2] = var3 * this.field4777[10] + this.field4777[2] * var1 + this.field4777[6] * var2 + this.field4777[14];
		if (var4.length > 3) {
			var4[3] = this.field4777[15] + var3 * this.field4777[11] + var1 * this.field4777[3] + this.field4777[7] * var2;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(FFFB)Lql;",
		garbageValue = "-97"
	)
	public class426 method8224(float var1, float var2, float var3) {
		float var4 = 1.0F / (this.field4777[7] * var2 + var1 * this.field4777[3] + var3 * this.field4777[11] + this.field4777[15]);
		return new class426(var4 * (this.field4777[12] + var3 * this.field4777[8] + var2 * this.field4777[4] + this.field4777[0] * var1), (this.field4777[9] * var3 + var2 * this.field4777[5] + var1 * this.field4777[1] + this.field4777[13]) * var4, var4 * (this.field4777[14] + this.field4777[10] * var3 + this.field4777[2] * var1 + this.field4777[6] * var2));
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(FFFI)F",
		garbageValue = "-1243510280"
	)
	public float method8221(float var1, float var2, float var3) {
		return this.field4777[12] + this.field4777[4] * var2 + this.field4777[0] * var1 + this.field4777[8] * var3;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(FFFI)F",
		garbageValue = "-1278424178"
	)
	public float method8272(float var1, float var2, float var3) {
		return this.field4777[13] + this.field4777[9] * var3 + this.field4777[5] * var2 + var1 * this.field4777[1];
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(FFFI)F",
		garbageValue = "-1841491761"
	)
	public float method8227(float var1, float var2, float var3) {
		return this.field4777[2] * var1 + var2 * this.field4777[6] + this.field4777[10] * var3 + this.field4777[14];
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "1610620738"
	)
	public float[] method8229() {
		float[] var1 = new float[3];
		class426 var2 = new class426(this.field4777[0], this.field4777[1], this.field4777[2]);
		class426 var3 = new class426(this.field4777[4], this.field4777[5], this.field4777[6]);
		class426 var4 = new class426(this.field4777[8], this.field4777[9], this.field4777[10]);
		var1[0] = var2.method8112();
		var1[1] = var3.method8112();
		var1[2] = var4.method8112();
		return var1;
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder();
		this.method8209();
		this.method8208();

		for (int var2 = 0; var2 < 4; ++var2) {
			for (int var3 = 0; var3 < 4; ++var3) {
				if (var3 > 0) {
					var1.append("\t");
				}

				float var4 = this.field4777[var3 + var2 * 4];
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
		int var3 = 31 * var2 + Arrays.hashCode(this.field4777);
		return var3;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof TransformationMatrix)) {
			return false;
		} else {
			TransformationMatrix var2 = (TransformationMatrix)var1;

			for (int var3 = 0; var3 < 16; ++var3) {
				if (var2.field4777[var3] != this.field4777[var3]) {
					return false;
				}
			}

			return true;
		}
	}
}
