import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vj")
final class class554 implements class551 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lvy;B)V",
		garbageValue = "56"
	)
	public void vmethod10083(Object var1, Buffer var2) {
		this.method10057((Long)var1, var2);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)Ljava/lang/Object;",
		garbageValue = "-1561644665"
	)
	public Object vmethod10078(Buffer var1) {
		return var1.readLong();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Lvy;I)V",
		garbageValue = "1284230419"
	)
	void method10057(Long var1, Buffer var2) {
		var2.writeLong(var1);
	}
}
