import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ie")
public class class224 extends class239 {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1114182337
	)
	@Export("cacheGamebuild")
	static int cacheGamebuild;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1300977817
	)
	int field2540;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	final class236 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ljk;Ljava/lang/String;I)V"
	)
	class224(class236 var1, String var2, int var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field2540 = var3;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2141955216"
	)
	public int vmethod5235() {
		return 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "497178271"
	)
	public int vmethod5232() {
		return this.field2540;
	}
}
