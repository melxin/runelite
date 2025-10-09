import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
public class class134 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1296861777
	)
	public final int field1628;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lrz;"
	)
	final TransformationMatrix[] field1619;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	public class134 field1622;
	@ObfuscatedName("aj")
	float[][] field1621;
	@ObfuscatedName("ah")
	boolean field1632;
	@ObfuscatedName("af")
	boolean field1623;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lrz;"
	)
	TransformationMatrix[] field1624;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lrz;"
	)
	TransformationMatrix[] field1625;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	TransformationMatrix field1626;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	TransformationMatrix field1630;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	TransformationMatrix field1620;
	@ObfuscatedName("ad")
	float[][] field1629;
	@ObfuscatedName("av")
	float[][] field1633;
	@ObfuscatedName("as")
	float[][] field1631;

	@ObfuscatedSignature(
		descriptor = "(ILwj;Z)V"
	)
	public class134(int var1, Buffer var2, boolean var3) {
		this.field1632 = true;
		this.field1623 = true;
		this.field1626 = new TransformationMatrix();
		this.field1630 = new TransformationMatrix();
		this.field1620 = new TransformationMatrix();
		this.field1628 = var2.readShort();
		this.field1619 = new TransformationMatrix[var1];
		this.field1624 = new TransformationMatrix[this.field1619.length];
		this.field1625 = new TransformationMatrix[this.field1619.length];
		this.field1621 = new float[this.field1619.length][3];

		for (int var4 = 0; var4 < this.field1619.length; ++var4) {
			this.field1619[var4] = new TransformationMatrix(var2, var3);
			this.field1621[var4][0] = var2.method11385();
			this.field1621[var4][1] = var2.method11385();
			this.field1621[var4][2] = var2.method11385();
		}

		this.method3690();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "296394169"
	)
	void method3690() {
		this.field1629 = new float[this.field1619.length][3];
		this.field1633 = new float[this.field1619.length][3];
		this.field1631 = new float[this.field1619.length][3];
		TransformationMatrix var1 = AbstractArchive.method8450();

		for (int var2 = 0; var2 < this.field1619.length; ++var2) {
			TransformationMatrix var3 = this.method3691(var2);
			var1.method9187(var3);
			var1.method9174();
			this.field1629[var2] = var1.method9240();
			this.field1633[var2][0] = var3.field5229[12];
			this.field1633[var2][1] = var3.field5229[13];
			this.field1633[var2][2] = var3.field5229[14];
			this.field1631[var2] = var3.method9193();
		}

		var1.method9171();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lrz;",
		garbageValue = "533459329"
	)
	TransformationMatrix method3691(int var1) {
		return this.field1619[var1];
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Lrz;",
		garbageValue = "-2124872662"
	)
	TransformationMatrix method3692(int var1) {
		if (this.field1624[var1] == null) {
			this.field1624[var1] = new TransformationMatrix(this.method3691(var1));
			if (this.field1622 != null) {
				this.field1624[var1].method9181(this.field1622.method3692(var1));
			} else {
				this.field1624[var1].method9181(TransformationMatrix.field5234);
			}
		}

		return this.field1624[var1];
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Lrz;",
		garbageValue = "-1820535316"
	)
	TransformationMatrix method3720(int var1) {
		if (this.field1625[var1] == null) {
			this.field1625[var1] = new TransformationMatrix(this.method3692(var1));
			this.field1625[var1].method9174();
		}

		return this.field1625[var1];
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lrz;",
		garbageValue = "909299242"
	)
	public TransformationMatrix method3694() {
		return this.field1626;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lrz;B)V",
		garbageValue = "83"
	)
	void method3695(TransformationMatrix var1) {
		this.field1626.method9187(var1);
		this.field1632 = true;
		this.field1623 = true;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Lrz;",
		garbageValue = "0"
	)
	TransformationMatrix method3696() {
		if (this.field1632) {
			this.field1630.method9187(this.method3694());
			if (this.field1622 != null) {
				this.field1630.method9181(this.field1622.method3696());
			}

			this.field1632 = false;
		}

		return this.field1630;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Lrz;",
		garbageValue = "1955074009"
	)
	public TransformationMatrix method3697(int var1) {
		if (this.field1623) {
			this.field1620.method9187(this.method3720(var1));
			this.field1620.method9181(this.method3696());
			this.field1623 = false;
		}

		return this.field1620;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "364425918"
	)
	float[] method3698(int var1) {
		return this.field1629[var1];
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "199729367"
	)
	float[] method3700(int var1) {
		return this.field1633[var1];
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)[F",
		garbageValue = "73"
	)
	float[] method3730(int var1) {
		return this.field1631[var1];
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpe;Lpe;I)V",
		garbageValue = "1392726867"
	)
	public static void method3734(AbstractArchive var0, AbstractArchive var1) {
		HealthBarDefinition.HealthBarDefinition_archive = var0;
		HealthBarDefinition.field2031 = var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-529714556"
	)
	public static void method3732() {
		ItemComposition.ItemDefinition_cached.clear();
		ItemComposition.ItemDefinition_cachedModels.clear();
		ItemComposition.ItemDefinition_cachedSprites.clear();
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(Ldm;Lcd;II)V",
		garbageValue = "-1632409451"
	)
	static void method3733(WorldView var0, Actor var1, int var2) {
		class203.method4563(var0, var1.x, var1.y, var2, var1.vmethod2813());
	}
}
