import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 993264681
	)
	@Export("id")
	int id;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1292745957
	)
	@Export("quantity")
	int quantity;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 208941453
	)
	@Export("visibleTime")
	int visibleTime;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 731829437
	)
	@Export("despawnTime")
	int despawnTime;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 455551503
	)
	@Export("ownership")
	int ownership;
	@ObfuscatedName("an")
	@Export("isPrivate")
	boolean isPrivate;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1407412917
	)
	@Export("flag")
	int flag;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	PlayerCompositionColorTextureOverride field1388;

	TileItem() {
		this.flag = 31;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-768696378"
	)
	@Export("setFlag")
	void setFlag(int var1) {
		this.flag = var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "49"
	)
	boolean method3116(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.flag & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lia;I)V",
		garbageValue = "-1220201616"
	)
	void method3104(PlayerCompositionColorTextureOverride var1) {
		this.field1388 = var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lia;",
		garbageValue = "-55471053"
	)
	PlayerCompositionColorTextureOverride method3105() {
		return this.field1388;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1906303790"
	)
	void method3106() {
		this.field1388 = null;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Lhv;",
		garbageValue = "-7"
	)
	@Export("getModel")
	protected final Model getModel() {
		ItemComposition var1 = FaceNormal.ItemDefinition_get(this.id);
		return this.field1388 == null ? var1.getModel(this.quantity) : var1.method5582(this.field1388);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lnw;B)V",
		garbageValue = "60"
	)
	public static void method3111(Huffman var0) {
		class364.huffman = var0;
	}
}
