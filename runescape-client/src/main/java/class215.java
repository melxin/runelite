import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
public class class215 extends class230 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1854677065
	)
	int field2342;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	final class227 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lid;Ljava/lang/String;I)V"
	)
	class215(class227 var1, String var2, int var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field2342 = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "8123"
	)
	public int vmethod4561() {
		return 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1745306065"
	)
	public int vmethod4550() {
		return this.field2342;
	}
}
