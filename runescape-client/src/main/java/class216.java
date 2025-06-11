import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("il")
public class class216 extends class231 {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1325069279
	)
	int field2390;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	final class228 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lio;Ljava/lang/String;I)V"
	)
	class216(class228 var1, String var2, int var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field2390 = var3;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1702909446"
	)
	public int vmethod4851() {
		return 0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1519037099"
	)
	public int vmethod4853() {
		return this.field2390;
	}
}
