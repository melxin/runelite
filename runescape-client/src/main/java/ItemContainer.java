import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("aj")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("an")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32);
	}

	ItemContainer() {
		this.ids = new int[]{-1};
		this.quantities = new int[]{0};
	}
}
