import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
final class class111 implements class351 {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	final Widget val$item;

	@ObfuscatedSignature(
		descriptor = "(Lnp;)V"
	)
	class111(Widget var1) {
		this.val$item = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2093040062"
	)
	public void vmethod6864() {
		if (this.val$item.method7281().field3802 != null) {
			ScriptEvent var1 = new ScriptEvent();
			var1.method2493(this.val$item);
			var1.setArgs(this.val$item.method7281().field3802);
			MenuAction.method2256().addFirst(var1);
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-260386956"
	)
	public static void method3024() {
		SequenceDefinition.SequenceDefinition_cached.clear();
		SequenceDefinition.SequenceDefinition_cachedFrames.clear();
		SequenceDefinition.SequenceDefinition_cachedModel.clear();
	}
}
