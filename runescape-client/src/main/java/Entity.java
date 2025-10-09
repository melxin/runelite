import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ww")
@Implements("Entity")
public interface Entity {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-565244070"
	)
	@Export("getX")
	int getX();

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1225897704"
	)
	@Export("getY")
	int getY();

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1777919612"
	)
	@Export("getPlane")
	int getPlane();
}
