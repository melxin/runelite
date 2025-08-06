import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ns")
public class class341 {
	@ObfuscatedName("li")
	@ObfuscatedGetter(
		intValue = 1840455601
	)
	@Export("currentPort")
	static int currentPort;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1426468815
	)
	int field3854;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	class107 field3853;

	@ObfuscatedSignature(
		descriptor = "(ILej;)V"
	)
	class341(int var1, class107 var2) {
		this.field3854 = var1;
		this.field3853 = var2;
	}
}
