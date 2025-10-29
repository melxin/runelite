import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wj")
final class class585 implements class581 {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lxa;I)V",
		garbageValue = "-1722278579"
	)
	public void vmethod11455(Object var1, Buffer var2) {
		this.method11423((Long)var1, var2);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lxa;B)Ljava/lang/Object;",
		garbageValue = "-20"
	)
	public Object vmethod11459(Buffer var1) {
		return var1.readLong();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Lxa;B)V",
		garbageValue = "-116"
	)
	void method11423(Long var1, Buffer var2) {
		var2.writeLong(var1);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lut;B)V",
		garbageValue = "-35"
	)
	static void method11429(DynamicArray var0) {
		class461.method9375(var0, (class586)null, false);
	}
}
