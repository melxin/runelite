import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vg")
final class class560 implements class558 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lwt;I)V",
		garbageValue = "872276318"
	)
	public void vmethod10652(Object var1, Buffer var2) {
		this.method10615((class509)var1, var2);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lwt;B)Ljava/lang/Object;",
		garbageValue = "-108"
	)
	public Object vmethod10657(Buffer var1) {
		return WorldViewManager.method2276(var1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ltp;Lwt;I)V",
		garbageValue = "978114081"
	)
	void method10615(class509 var1, Buffer var2) {
		var1.method9945(var2);
	}
}
