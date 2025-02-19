import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vf")
final class class552 implements class551 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lvy;B)V",
		garbageValue = "56"
	)
	public void vmethod10083(Object var1, Buffer var2) {
		this.method10044((Integer)var1, var2);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)Ljava/lang/Object;",
		garbageValue = "-1561644665"
	)
	public Object vmethod10078(Buffer var1) {
		return var1.readInt();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Lvy;I)V",
		garbageValue = "1284433803"
	)
	void method10044(Integer var1, Buffer var2) {
		var2.writeInt(var1);
	}
}
