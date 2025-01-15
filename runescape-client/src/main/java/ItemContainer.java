import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("ah")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("az")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32);
	}

	ItemContainer() {
		this.ids = new int[]{-1};
		this.quantities = new int[]{0};
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIII)J",
		garbageValue = "1514847798"
	)
	static long method2606(int var0, int var1, int var2) {
		return (long)(var2 << 16 | var0 << 8 | var1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Ljf;",
		garbageValue = "-769851822"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = (StructComposition)StructComposition.StructDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = StructComposition.StructDefinition_archive.takeFile(34, var0);
			var1 = new StructComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			StructComposition.StructDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("mh")
	@ObfuscatedSignature(
		descriptor = "(Lna;I)Lna;",
		garbageValue = "2120923696"
	)
	static Widget method2607(Widget var0) {
		Widget var1 = class211.method4832(var0);
		if (var1 == null) {
			var1 = var0.parent;
		}

		return var1;
	}
}
