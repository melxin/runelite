import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
final class class85 implements class355 {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	final Widget val$item;

	@ObfuscatedSignature(
		descriptor = "(Lox;)V"
	)
	class85(Widget var1) {
		this.val$item = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1845830227"
	)
	public void vmethod7454() {
		if (this.val$item.method7931().field3989 != null) {
			ScriptEvent var1 = new ScriptEvent();
			var1.method2124(this.val$item);
			var1.setArgs(this.val$item.method7931().field3989);
			HttpJsonRequestBody.method10535().addFirst(var1);
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-129938385"
	)
	public static void method2787() {
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lrm;I)Lrm;",
		garbageValue = "1781028013"
	)
	public static class448 method2788(class448 var0) {
		synchronized(class448.field5055) {
			if (class448.field5061 == 0) {
				return new class448(var0);
			} else {
				class448.field5055[--class448.field5061].method9057(var0);
				return class448.field5055[class448.field5061];
			}
		}
	}
}
