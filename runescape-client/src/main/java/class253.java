import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
public class class253 extends class268 {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1836321267
	)
	int field3003;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	final class265 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lku;Ljava/lang/String;I)V"
	)
	class253(class265 var1, String var2, int var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field3003 = var3;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "8"
	)
	public int vmethod6032() {
		return 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "829325079"
	)
	public int vmethod6034() {
		return this.field3003;
	}
}
