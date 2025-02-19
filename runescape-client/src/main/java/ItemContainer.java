import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("ua")
	@ObfuscatedGetter(
		intValue = -1565425099
	)
	static int field1069;
	@ObfuscatedName("ay")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("au")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32);
	}

	ItemContainer() {
		this.ids = new int[]{-1};
		this.quantities = new int[]{0};
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "24"
	)
	public static boolean method2427(int var0) {
		if (class335.field3689.isEmpty()) {
			return false;
		} else {
			MidiRequest var1 = (MidiRequest)class335.field3689.get(0);
			return var1 != null && var0 == var1.musicTrackGroupId;
		}
	}
}
