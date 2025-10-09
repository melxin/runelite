import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("ae")
	@Export("SpriteBuffer_spriteHeights")
	static int[] SpriteBuffer_spriteHeights;
	@ObfuscatedName("az")
	@Export("userHomeDirectory")
	static String userHomeDirectory;
	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	@Export("archive9")
	static Archive archive9;
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "121"
	)
	public static boolean method2154(int var0) {
		return (var0 & 1) != 0;
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(I)Lvo;",
		garbageValue = "-1662751921"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return class50.worldMap;
	}
}
