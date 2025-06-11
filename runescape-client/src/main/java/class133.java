import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
public class class133 {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -375808817
	)
	public final int field1570;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lrz;"
	)
	final TransformationMatrix[] field1561;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	public class133 field1563;
	@ObfuscatedName("ai")
	float[][] field1564;
	@ObfuscatedName("al")
	boolean field1572;
	@ObfuscatedName("ac")
	boolean field1566;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[Lrz;"
	)
	TransformationMatrix[] field1565;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[Lrz;"
	)
	TransformationMatrix[] field1568;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	TransformationMatrix field1569;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	TransformationMatrix field1562;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	TransformationMatrix field1571;
	@ObfuscatedName("ar")
	float[][] field1567;
	@ObfuscatedName("ad")
	float[][] field1573;
	@ObfuscatedName("af")
	float[][] field1574;

	@ObfuscatedSignature(
		descriptor = "(ILwt;Z)V"
	)
	public class133(int var1, Buffer var2, boolean var3) {
		this.field1572 = true;
		this.field1566 = true;
		this.field1569 = new TransformationMatrix();
		this.field1562 = new TransformationMatrix();
		this.field1571 = new TransformationMatrix();
		this.field1570 = var2.readShort();
		this.field1561 = new TransformationMatrix[var1];
		this.field1565 = new TransformationMatrix[this.field1561.length];
		this.field1568 = new TransformationMatrix[this.field1561.length];
		this.field1564 = new float[this.field1561.length][3];

		for (int var4 = 0; var4 < this.field1561.length; ++var4) {
			this.field1561[var4] = new TransformationMatrix(var2, var3);
			this.field1564[var4][0] = var2.method10861();
			this.field1564[var4][1] = var2.method10861();
			this.field1564[var4][2] = var2.method10861();
		}

		this.method3475();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "18351"
	)
	void method3475() {
		this.field1567 = new float[this.field1561.length][3];
		this.field1573 = new float[this.field1561.length][3];
		this.field1574 = new float[this.field1561.length][3];
		TransformationMatrix var1 = class231.method4854();

		for (int var2 = 0; var2 < this.field1561.length; ++var2) {
			TransformationMatrix var3 = this.method3476(var2);
			var1.method8778(var3);
			var1.method8787();
			this.field1567[var2] = var1.method8775();
			this.field1573[var2][0] = var3.field4984[12];
			this.field1573[var2][1] = var3.field4984[13];
			this.field1573[var2][2] = var3.field4984[14];
			this.field1574[var2] = var3.method8795();
		}

		var1.method8772();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Lrz;",
		garbageValue = "714338775"
	)
	TransformationMatrix method3476(int var1) {
		return this.field1561[var1];
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lrz;",
		garbageValue = "2140685082"
	)
	TransformationMatrix method3477(int var1) {
		if (this.field1565[var1] == null) {
			this.field1565[var1] = new TransformationMatrix(this.method3476(var1));
			if (this.field1563 != null) {
				this.field1565[var1].method8782(this.field1563.method3477(var1));
			} else {
				this.field1565[var1].method8782(TransformationMatrix.field4986);
			}
		}

		return this.field1565[var1];
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Lrz;",
		garbageValue = "-1594099185"
	)
	TransformationMatrix method3478(int var1) {
		if (this.field1568[var1] == null) {
			this.field1568[var1] = new TransformationMatrix(this.method3477(var1));
			this.field1568[var1].method8787();
		}

		return this.field1568[var1];
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lrz;",
		garbageValue = "-1001283176"
	)
	TransformationMatrix method3479() {
		return this.field1569;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lrz;B)V",
		garbageValue = "0"
	)
	void method3480(TransformationMatrix var1) {
		this.field1569.method8778(var1);
		this.field1572 = true;
		this.field1566 = true;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Lrz;",
		garbageValue = "1615407459"
	)
	TransformationMatrix method3484() {
		if (this.field1572) {
			this.field1562.method8778(this.method3479());
			if (this.field1563 != null) {
				this.field1562.method8782(this.field1563.method3484());
			}

			this.field1572 = false;
		}

		return this.field1562;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Lrz;",
		garbageValue = "-741504620"
	)
	public TransformationMatrix method3482(int var1) {
		if (this.field1566) {
			this.field1571.method8778(this.method3478(var1));
			this.field1571.method8782(this.method3484());
			this.field1566 = false;
		}

		return this.field1571;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "2147483647"
	)
	float[] method3483(int var1) {
		return this.field1567[var1];
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-626891699"
	)
	float[] method3509(int var1) {
		return this.field1573[var1];
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)[F",
		garbageValue = "-27"
	)
	float[] method3489(int var1) {
		return this.field1574[var1];
	}
}
