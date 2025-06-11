import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vs")
final class class562 implements class558 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lwt;I)V",
		garbageValue = "872276318"
	)
	public void vmethod10652(Object var1, Buffer var2) {
		this.method10625((Long)var1, var2);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lwt;B)Ljava/lang/Object;",
		garbageValue = "-108"
	)
	public Object vmethod10657(Buffer var1) {
		return var1.readLong();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Lwt;I)V",
		garbageValue = "-2123068888"
	)
	void method10625(Long var1, Buffer var2) {
		var2.writeLong(var1);
	}
}
