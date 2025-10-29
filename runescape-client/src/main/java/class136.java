import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
public class class136 {
	@ObfuscatedName("is")
	@ObfuscatedGetter(
		intValue = -259451539
	)
	@Export("foundItemIdCount")
	static int foundItemIdCount;
	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	static Archive field1619;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -281282873
	)
	public final int field1613;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lry;"
	)
	final TransformationMatrix[] field1628;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	public class136 field1614;
	@ObfuscatedName("an")
	float[][] field1624;
	@ObfuscatedName("ae")
	boolean field1616;
	@ObfuscatedName("aj")
	boolean field1617;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[Lry;"
	)
	TransformationMatrix[] field1618;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Lry;"
	)
	TransformationMatrix[] field1615;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	TransformationMatrix field1620;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	TransformationMatrix field1621;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	TransformationMatrix field1622;
	@ObfuscatedName("az")
	float[][] field1625;
	@ObfuscatedName("ad")
	float[][] field1627;
	@ObfuscatedName("ai")
	float[][] field1612;

	@ObfuscatedSignature(
		descriptor = "(ILxa;Z)V"
	)
	public class136(int var1, Buffer var2, boolean var3) {
		this.field1616 = true;
		this.field1617 = true;
		this.field1620 = new TransformationMatrix();
		this.field1621 = new TransformationMatrix();
		this.field1622 = new TransformationMatrix();
		this.field1613 = var2.readShort();
		this.field1628 = new TransformationMatrix[var1];
		this.field1618 = new TransformationMatrix[this.field1628.length];
		this.field1615 = new TransformationMatrix[this.field1628.length];
		this.field1624 = new float[this.field1628.length][3];

		for (int var4 = 0; var4 < this.field1628.length; ++var4) {
			this.field1628[var4] = new TransformationMatrix(var2, var3);
			this.field1624[var4][0] = var2.method11642();
			this.field1624[var4][1] = var2.method11642();
			this.field1624[var4][2] = var2.method11642();
		}

		this.method3798();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1263041541"
	)
	void method3798() {
		this.field1625 = new float[this.field1628.length][3];
		this.field1627 = new float[this.field1628.length][3];
		this.field1612 = new float[this.field1628.length][3];
		TransformationMatrix var1 = SecureUrlRequester.method3659();

		for (int var2 = 0; var2 < this.field1628.length; ++var2) {
			TransformationMatrix var3 = this.method3813(var2);
			var1.method9480(var3);
			var1.method9431();
			this.field1625[var2] = var1.method9420();
			this.field1627[var2][0] = var3.field5260[12];
			this.field1627[var2][1] = var3.field5260[13];
			this.field1627[var2][2] = var3.field5260[14];
			this.field1612[var2] = var3.method9495();
		}

		var1.method9417();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)Lry;",
		garbageValue = "-14"
	)
	TransformationMatrix method3813(int var1) {
		return this.field1628[var1];
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Lry;",
		garbageValue = "-666108368"
	)
	TransformationMatrix method3783(int var1) {
		if (this.field1618[var1] == null) {
			this.field1618[var1] = new TransformationMatrix(this.method3813(var1));
			if (this.field1614 != null) {
				this.field1618[var1].method9426(this.field1614.method3783(var1));
			} else {
				this.field1618[var1].method9426(TransformationMatrix.field5256);
			}
		}

		return this.field1618[var1];
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lry;",
		garbageValue = "619504460"
	)
	TransformationMatrix method3806(int var1) {
		if (this.field1615[var1] == null) {
			this.field1615[var1] = new TransformationMatrix(this.method3783(var1));
			this.field1615[var1].method9431();
		}

		return this.field1615[var1];
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lry;",
		garbageValue = "665880124"
	)
	public TransformationMatrix method3785() {
		return this.field1620;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lry;I)V",
		garbageValue = "-1793120611"
	)
	void method3786(TransformationMatrix var1) {
		this.field1620.method9480(var1);
		this.field1616 = true;
		this.field1617 = true;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lry;",
		garbageValue = "-2026679362"
	)
	TransformationMatrix method3787() {
		if (this.field1616) {
			this.field1621.method9480(this.method3785());
			if (this.field1614 != null) {
				this.field1621.method9426(this.field1614.method3787());
			}

			this.field1616 = false;
		}

		return this.field1621;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Lry;",
		garbageValue = "-83"
	)
	public TransformationMatrix method3788(int var1) {
		if (this.field1617) {
			this.field1622.method9480(this.method3806(var1));
			this.field1622.method9426(this.method3787());
			this.field1617 = false;
		}

		return this.field1622;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)[F",
		garbageValue = "-1"
	)
	float[] method3789(int var1) {
		return this.field1625[var1];
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-1314912615"
	)
	float[] method3790(int var1) {
		return this.field1627[var1];
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)[F",
		garbageValue = "29"
	)
	float[] method3791(int var1) {
		return this.field1612[var1];
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(Ldd;IIIIII)V",
		garbageValue = "1244637761"
	)
	static void method3805(WorldView var0, int var1, int var2, int var3, int var4, int var5) {
		NodeDeque var6 = var0.groundItems[var1][var2][var3];
		if (var6 != null) {
			for (TileItem var7 = (TileItem)var6.last(); var7 != null; var7 = (TileItem)var6.previous()) {
				if (var4 == var7.id && var5 == var7.quantity) {
					var7.method2907();
					break;
				}
			}

			class157.updateItemPile(var1, var2, var3);
		}

	}
}
