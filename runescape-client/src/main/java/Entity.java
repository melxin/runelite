import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wu")
@Implements("Entity")
public interface Entity {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1261334993"
	)
	@Export("getX")
	int getX();

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1626965421"
	)
	@Export("getY")
	int getY();

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "33"
	)
	@Export("getPlane")
	int getPlane();
}
