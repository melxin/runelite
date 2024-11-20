import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uf")
final class class541 implements class540 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lvj;I)V",
		garbageValue = "1774358962"
	)
	public void vmethod9971(Object var1, Buffer var2) {
		this.method9923((Integer)var1, var2);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lvj;I)Ljava/lang/Object;",
		garbageValue = "59393473"
	)
	public Object vmethod9969(Buffer var1) {
		return var1.readInt();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Lvj;I)V",
		garbageValue = "-942680387"
	)
	void method9923(Integer var1, Buffer var2) {
		var2.writeInt(var1);
	}
}
