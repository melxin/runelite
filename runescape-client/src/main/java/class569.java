import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vq")
final class class569 implements class565 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lwj;I)V",
		garbageValue = "-567180997"
	)
	public void vmethod11079(Object var1, Buffer var2) {
		this.method11047((Long)var1, var2);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwj;S)Ljava/lang/Object;",
		garbageValue = "-30185"
	)
	public Object vmethod11078(Buffer var1) {
		return var1.readLong();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Lwj;B)V",
		garbageValue = "-105"
	)
	void method11047(Long var1, Buffer var2) {
		var2.writeLong(var1);
	}
}
