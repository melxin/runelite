import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mg")
public class class321 {
	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "530346082"
	)
	static final int method7009(int var0) {
		return Math.abs(var0 - class28.cameraYaw) > 1024 ? var0 + 2048 * (var0 < class28.cameraYaw ? 1 : -1) : var0;
	}
}
