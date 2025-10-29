import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("xb")
@Implements("CameraFocusableEntity")
public interface CameraFocusableEntity {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "446304328"
	)
	@Export("getX")
	int getX();

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1790262579"
	)
	@Export("getY")
	int getY();

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-727737924"
	)
	@Export("getPlane")
	int getPlane();
}
