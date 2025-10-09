import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vj")
final class class571 implements class567 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lwj;I)V",
		garbageValue = "-1304869252"
	)
	public void vmethod11207(Object var1, Buffer var2) {
		this.method11177((Long)var1, var2);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lwj;S)Ljava/lang/Object;",
		garbageValue = "2047"
	)
	public Object vmethod11209(Buffer var1) {
		return var1.readLong();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Lwj;B)V",
		garbageValue = "7"
	)
	void method11177(Long var1, Buffer var2) {
		var2.writeLong(var1);
	}
}
