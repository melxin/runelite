import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
public class class135 {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 2098147621
	)
	public final int field1633;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Lrj;"
	)
	final TransformationMatrix[] field1626;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	public class135 field1636;
	@ObfuscatedName("ac")
	float[][] field1628;
	@ObfuscatedName("ap")
	boolean field1629;
	@ObfuscatedName("aq")
	boolean field1630;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lrj;"
	)
	TransformationMatrix[] field1627;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Lrj;"
	)
	TransformationMatrix[] field1632;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lrj;"
	)
	TransformationMatrix field1631;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lrj;"
	)
	TransformationMatrix field1634;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lrj;"
	)
	TransformationMatrix field1635;
	@ObfuscatedName("aa")
	float[][] field1638;
	@ObfuscatedName("am")
	float[][] field1637;
	@ObfuscatedName("an")
	float[][] field1625;

	@ObfuscatedSignature(
		descriptor = "(ILwb;Z)V"
	)
	public class135(int var1, Buffer var2, boolean var3) {
		this.field1629 = true;
		this.field1630 = true;
		this.field1631 = new TransformationMatrix();
		this.field1634 = new TransformationMatrix();
		this.field1635 = new TransformationMatrix();
		this.field1633 = var2.readShort();
		this.field1626 = new TransformationMatrix[var1];
		this.field1627 = new TransformationMatrix[this.field1626.length];
		this.field1632 = new TransformationMatrix[this.field1626.length];
		this.field1628 = new float[this.field1626.length][3];

		for (int var4 = 0; var4 < this.field1626.length; ++var4) {
			this.field1626[var4] = new TransformationMatrix(var2, var3);
			this.field1628[var4][0] = var2.method11362();
			this.field1628[var4][1] = var2.method11362();
			this.field1628[var4][2] = var2.method11362();
		}

		this.method3621();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "171330457"
	)
	void method3621() {
		this.field1638 = new float[this.field1626.length][3];
		this.field1637 = new float[this.field1626.length][3];
		this.field1625 = new float[this.field1626.length][3];
		TransformationMatrix var1 = class401.method8245();

		for (int var2 = 0; var2 < this.field1626.length; ++var2) {
			TransformationMatrix var3 = this.method3623(var2);
			var1.method9092(var3);
			var1.method9101();
			this.field1638[var2] = var1.method9089();
			this.field1637[var2][0] = var3.field5186[12];
			this.field1637[var2][1] = var3.field5186[13];
			this.field1637[var2][2] = var3.field5186[14];
			this.field1625[var2] = var3.method9096();
		}

		var1.method9140();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Lrj;",
		garbageValue = "1"
	)
	TransformationMatrix method3623(int var1) {
		return this.field1626[var1];
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lrj;",
		garbageValue = "-1257552713"
	)
	TransformationMatrix method3626(int var1) {
		if (this.field1627[var1] == null) {
			this.field1627[var1] = new TransformationMatrix(this.method3623(var1));
			if (this.field1636 != null) {
				this.field1627[var1].method9173(this.field1636.method3626(var1));
			} else {
				this.field1627[var1].method9173(TransformationMatrix.field5184);
			}
		}

		return this.field1627[var1];
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)Lrj;",
		garbageValue = "51"
	)
	TransformationMatrix method3625(int var1) {
		if (this.field1632[var1] == null) {
			this.field1632[var1] = new TransformationMatrix(this.method3626(var1));
			this.field1632[var1].method9101();
		}

		return this.field1632[var1];
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Lrj;",
		garbageValue = "-44"
	)
	TransformationMatrix method3639() {
		return this.field1631;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lrj;I)V",
		garbageValue = "1440205823"
	)
	void method3636(TransformationMatrix var1) {
		this.field1631.method9092(var1);
		this.field1629 = true;
		this.field1630 = true;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lrj;",
		garbageValue = "1906881453"
	)
	TransformationMatrix method3628() {
		if (this.field1629) {
			this.field1634.method9092(this.method3639());
			if (this.field1636 != null) {
				this.field1634.method9173(this.field1636.method3628());
			}

			this.field1629 = false;
		}

		return this.field1634;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)Lrj;",
		garbageValue = "-87572797"
	)
	public TransformationMatrix method3624(int var1) {
		if (this.field1630) {
			this.field1635.method9092(this.method3625(var1));
			this.field1635.method9173(this.method3628());
			this.field1630 = false;
		}

		return this.field1635;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-868868024"
	)
	float[] method3630(int var1) {
		return this.field1638[var1];
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-1160761169"
	)
	float[] method3631(int var1) {
		return this.field1637[var1];
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-344577838"
	)
	float[] method3632(int var1) {
		return this.field1625[var1];
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lpx;Lpx;B)V",
		garbageValue = "-63"
	)
	public static void method3657(AbstractArchive var0, AbstractArchive var1) {
		SpotAnimationDefinition.field2203 = var0;
		SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var1;
	}
}
