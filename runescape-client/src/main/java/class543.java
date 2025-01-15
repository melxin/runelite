import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uu")
final class class543 implements class540 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lvy;I)V",
		garbageValue = "-1394480464"
	)
	public void vmethod10147(Object var1, Buffer var2) {
		this.method10112((Long)var1, var2);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)Ljava/lang/Object;",
		garbageValue = "-95091658"
	)
	public Object vmethod10140(Buffer var1) {
		return var1.readLong();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Lvy;I)V",
		garbageValue = "-196702427"
	)
	void method10112(Long var1, Buffer var2) {
		var2.writeLong(var1);
	}
}
