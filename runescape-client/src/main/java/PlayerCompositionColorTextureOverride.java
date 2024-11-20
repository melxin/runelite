import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
@Implements("PlayerCompositionColorTextureOverride")
public class PlayerCompositionColorTextureOverride {
	@ObfuscatedName("ao")
	@Export("playerCompositionRecolorTo")
	public short[] playerCompositionRecolorTo;
	@ObfuscatedName("ac")
	@Export("playerCompositionRetextureTo")
	public short[] playerCompositionRetextureTo;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 2059179601
	)
	int field1836;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1822678071
	)
	int field1842;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -962757597
	)
	int field1840;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1500663003
	)
	int field1839;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -394522101
	)
	public int field1832;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	public Model field1843;

	public PlayerCompositionColorTextureOverride(int var1) {
		this.field1836 = -1;
		this.field1842 = -1;
		this.field1840 = -1;
		this.field1839 = -1;
		ItemComposition var2 = WorldEntityCoord.ItemDefinition_get(var1);
		if (var2.method4172()) {
			this.playerCompositionRecolorTo = new short[var2.recolorTo.length];
			System.arraycopy(var2.recolorTo, 0, this.playerCompositionRecolorTo, 0, this.playerCompositionRecolorTo.length);
		}

		if (var2.method4173()) {
			this.playerCompositionRetextureTo = new short[var2.retextureTo.length];
			System.arraycopy(var2.retextureTo, 0, this.playerCompositionRetextureTo, 0, this.playerCompositionRetextureTo.length);
		}

		this.field1832 = var2.model;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1801793465"
	)
	public boolean method3720() {
		return this.playerCompositionRecolorTo != null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1614111119"
	)
	public boolean method3702() {
		return this.playerCompositionRetextureTo != null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "127"
	)
	boolean method3703(int var1) {
		return var1 == 0 && this.field1836 != -1 || var1 == 1 && this.field1842 != -1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2048917711"
	)
	boolean method3706(int var1) {
		return var1 == 0 && this.field1840 != -1 || var1 == 1 && this.field1839 != -1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "610246329"
	)
	int method3705(int var1) {
		return var1 == 0 ? this.field1836 : this.field1842;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-110736675"
	)
	int method3707(int var1) {
		return var1 == 0 ? this.field1840 : this.field1839;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(FFFB)Lql;",
		garbageValue = "34"
	)
	public static class426 method3722(float var0, float var1, float var2) {
		synchronized(class426.field4765) {
			if (class426.field4762 == 0) {
				return new class426(var0, var1, var2);
			} else {
				class426.field4765[--class426.field4762].method8103(var0, var1, var2);
				return class426.field4765[class426.field4762];
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1641454660"
	)
	public static int method3724(int var0) {
		return class506.field5148[var0 & 16383];
	}

	@ObfuscatedName("pp")
	@ObfuscatedSignature(
		descriptor = "(IB)Lvp;",
		garbageValue = "-12"
	)
	static DbTable method3723(int var0) {
		DbTable var1 = (DbTable)Client.archive11.get((long)var0);
		if (var1 == null) {
			var1 = new DbTable(class53.field362, var0);
		}

		return var1;
	}
}
