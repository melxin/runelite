import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wo")
final class class573 implements class569 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lwb;I)V",
		garbageValue = "1264095929"
	)
	public void vmethod11041(Object var1, Buffer var2) {
		this.method11007((Long)var1, var2);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)Ljava/lang/Object;",
		garbageValue = "-944661961"
	)
	public Object vmethod11037(Buffer var1) {
		return var1.readLong();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Lwb;S)V",
		garbageValue = "16896"
	)
	void method11007(Long var1, Buffer var2) {
		var2.writeLong(var1);
	}
}
