import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("an")
	public static short[][] field826;
	@ObfuscatedName("at")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("ag")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32);
	}

	ItemContainer() {
		this.ids = new int[]{-1};
		this.quantities = new int[]{0};
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lqm;I)V",
		garbageValue = "1912333612"
	)
	public static void method2163(AbstractArchive var0) {
		FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var0;
	}
}
