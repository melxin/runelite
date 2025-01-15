import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qy")
public class class437 {
	@ObfuscatedName("vz")
	@ObfuscatedSignature(
		descriptor = "Ltp;"
	)
	@Export("platformInfo")
	static PlatformInfo platformInfo;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1590574509
	)
	int field4818;

	@ObfuscatedSignature(
		descriptor = "(IZ)V",
		garbageValue = "1"
	)
	class437(int var1, boolean var2) {
		this.field4818 = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1186505997"
	)
	public int method8668() {
		return this.field4818;
	}
}
