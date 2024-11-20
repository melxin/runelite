import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
public class class134 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1258279361
	)
	public final int field1544;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	public class134 field1541;
	@ObfuscatedName("at")
	float[][] field1542;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lqb;"
	)
	final TransformationMatrix[] field1543;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lqb;"
	)
	TransformationMatrix[] field1540;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Lqb;"
	)
	TransformationMatrix[] field1545;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	TransformationMatrix field1546;
	@ObfuscatedName("av")
	boolean field1547;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	TransformationMatrix field1549;
	@ObfuscatedName("an")
	boolean field1553;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	TransformationMatrix field1550;
	@ObfuscatedName("ai")
	float[][] field1551;
	@ObfuscatedName("al")
	float[][] field1552;
	@ObfuscatedName("ar")
	float[][] field1548;

	@ObfuscatedSignature(
		descriptor = "(ILvj;Z)V"
	)
	public class134(int var1, Buffer var2, boolean var3) {
		this.field1546 = new TransformationMatrix();
		this.field1547 = true;
		this.field1549 = new TransformationMatrix();
		this.field1553 = true;
		this.field1550 = new TransformationMatrix();
		this.field1544 = var2.readShort();
		this.field1543 = new TransformationMatrix[var1];
		this.field1540 = new TransformationMatrix[this.field1543.length];
		this.field1545 = new TransformationMatrix[this.field1543.length];
		this.field1542 = new float[this.field1543.length][3];

		for (int var4 = 0; var4 < this.field1543.length; ++var4) {
			this.field1543[var4] = new TransformationMatrix(var2, var3);
			this.field1542[var4][0] = var2.method10121();
			this.field1542[var4][1] = var2.method10121();
			this.field1542[var4][2] = var2.method10121();
		}

		this.method3285();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-112"
	)
	void method3285() {
		this.field1551 = new float[this.field1543.length][3];
		this.field1552 = new float[this.field1543.length][3];
		this.field1548 = new float[this.field1543.length][3];
		TransformationMatrix var1 = MidiPcmStream.method6684();

		for (int var2 = 0; var2 < this.field1543.length; ++var2) {
			TransformationMatrix var3 = this.method3286(var2);
			var1.method8212(var3);
			var1.method8234();
			this.field1551[var2] = var1.method8209();
			this.field1552[var2][0] = var3.field4777[12];
			this.field1552[var2][1] = var3.field4777[13];
			this.field1552[var2][2] = var3.field4777[14];
			this.field1548[var2] = var3.method8229();
		}

		var1.method8266();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lqb;",
		garbageValue = "-782179739"
	)
	TransformationMatrix method3286(int var1) {
		return this.field1543[var1];
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lqb;",
		garbageValue = "1274876318"
	)
	TransformationMatrix method3287(int var1) {
		if (this.field1540[var1] == null) {
			this.field1540[var1] = new TransformationMatrix(this.method3286(var1));
			if (this.field1541 != null) {
				this.field1540[var1].method8216(this.field1541.method3287(var1));
			} else {
				this.field1540[var1].method8216(TransformationMatrix.field4779);
			}
		}

		return this.field1540[var1];
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Lqb;",
		garbageValue = "380638082"
	)
	TransformationMatrix method3289(int var1) {
		if (this.field1545[var1] == null) {
			this.field1545[var1] = new TransformationMatrix(this.method3287(var1));
			this.field1545[var1].method8234();
		}

		return this.field1545[var1];
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lqb;B)V",
		garbageValue = "9"
	)
	void method3303(TransformationMatrix var1) {
		this.field1546.method8212(var1);
		this.field1547 = true;
		this.field1553 = true;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Lqb;",
		garbageValue = "9"
	)
	TransformationMatrix method3290() {
		return this.field1546;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Lqb;",
		garbageValue = "51"
	)
	TransformationMatrix method3298() {
		if (this.field1547) {
			this.field1549.method8212(this.method3290());
			if (this.field1541 != null) {
				this.field1549.method8216(this.field1541.method3298());
			}

			this.field1547 = false;
		}

		return this.field1549;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Lqb;",
		garbageValue = "1125375326"
	)
	public TransformationMatrix method3292(int var1) {
		if (this.field1553) {
			this.field1550.method8212(this.method3289(var1));
			this.field1550.method8216(this.method3298());
			this.field1553 = false;
		}

		return this.field1550;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "1867751175"
	)
	float[] method3284(int var1) {
		return this.field1551[var1];
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)[F",
		garbageValue = "67"
	)
	float[] method3294(int var1) {
		return this.field1552[var1];
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-998102561"
	)
	float[] method3295(int var1) {
		return this.field1548[var1];
	}
}
