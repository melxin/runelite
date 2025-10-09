import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("df")
final class class86 implements class356 {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	final Widget val$item;

	@ObfuscatedSignature(
		descriptor = "(Lok;)V"
	)
	class86(Widget var1) {
		this.val$item = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "603869602"
	)
	public void vmethod7479() {
		if (this.val$item.method7964().field4091 != null) {
			ScriptEvent var1 = new ScriptEvent();
			var1.method2172(this.val$item);
			var1.setArgs(this.val$item.method7964().field4091);
			class215.method4888().addFirst(var1);
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)[Ltj;",
		garbageValue = "1387764070"
	)
	public static class514[] method2928() {
		return new class514[]{class514.field5546, class514.field5547, class514.field5544, class514.field5545};
	}
}
