import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vz")
final class class554 implements class551 {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lve;B)V",
		garbageValue = "-59"
	)
	public void vmethod10161(Object var1, Buffer var2) {
		this.method10131((Long)var1, var2);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lve;I)Ljava/lang/Object;",
		garbageValue = "-651548546"
	)
	public Object vmethod10160(Buffer var1) {
		return var1.readLong();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Lve;I)V",
		garbageValue = "-1037793756"
	)
	void method10131(Long var1, Buffer var2) {
		var2.writeLong(var1);
	}

	@ObfuscatedName("oo")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1658786600"
	)
	public static boolean method10138() {
		return Client.staffModLevel >= 2;
	}
}
