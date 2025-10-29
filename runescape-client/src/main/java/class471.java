import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sc")
public class class471 {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1432123415
	)
	int field5320;

	@ObfuscatedSignature(
		descriptor = "(IZ)V",
		garbageValue = "1"
	)
	class471(int var1, boolean var2) {
		this.field5320 = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-87"
	)
	public int method9717() {
		return this.field5320;
	}
}
