import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
final class class110 implements class351 {
	@ObfuscatedName("ae")
	@Export("Tiles_shapes")
	static byte[][][] Tiles_shapes;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	final Widget val$item;

	@ObfuscatedSignature(
		descriptor = "(Lnp;)V"
	)
	class110(Widget var1) {
		this.val$item = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2093040062"
	)
	public void vmethod6864() {
		if (this.val$item.method7281().field3799 != null) {
			ScriptEvent var1 = new ScriptEvent();
			var1.method2493(this.val$item);
			var1.setArgs(this.val$item.method7281().field3799);
			MenuAction.method2256().addFirst(var1);
		}

	}
}
