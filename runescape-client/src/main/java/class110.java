import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
final class class110 implements class353 {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	final Widget val$item;

	@ObfuscatedSignature(
		descriptor = "(Lnz;)V"
	)
	class110(Widget var1) {
		this.val$item = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "66"
	)
	public void vmethod6917() {
		if (this.val$item.method7334().field3861 != null) {
			ScriptEvent var1 = new ScriptEvent();
			var1.method2439(this.val$item);
			var1.setArgs(this.val$item.method7334().field3861);
			class60.method1154().addFirst(var1);
		}

	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIIIIII)V",
		garbageValue = "-1121606655"
	)
	static void method2985(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
		var1 = var1 * 128 + 64;
		var2 = var2 * 128 + 64;
		var3 = var3 * 128 + 64;
		var4 = var4 * 128 + 64;
		Projectile var14 = new Projectile(var6, var0, var1, var2, DevicePcmPlayerProvider.getTileHeight(class376.worldView, var1, var2, var0) - var7, var9 + Client.cycle, var10 + Client.cycle, var11, var12, var13, var5, var8);
		var14.setDestination(var3, var4, DevicePcmPlayerProvider.getTileHeight(class376.worldView, var3, var4, var0) - var8, var9 + Client.cycle);
		class376.worldView.projectiles.addFirst(var14);
	}
}
