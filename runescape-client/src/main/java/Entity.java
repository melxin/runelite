import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("xf")
@Implements("Entity")
public interface Entity {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("getX")
	int getX();

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "5422"
	)
	@Export("getY")
	int getY();

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "955086849"
	)
	@Export("getPlane")
	int getPlane();
}
