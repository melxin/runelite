import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uy")
final class class541 implements class540 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lvy;I)V",
		garbageValue = "-1394480464"
	)
	public void vmethod10147(Object var1, Buffer var2) {
		this.method10100((Integer)var1, var2);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)Ljava/lang/Object;",
		garbageValue = "-95091658"
	)
	public Object vmethod10140(Buffer var1) {
		return var1.readInt();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Lvy;S)V",
		garbageValue = "16384"
	)
	void method10100(Integer var1, Buffer var2) {
		var2.writeInt(var1);
	}
}
