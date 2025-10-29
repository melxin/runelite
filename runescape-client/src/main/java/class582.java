import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wd")
final class class582 implements class581 {
	@ObfuscatedName("ly")
	@ObfuscatedGetter(
		intValue = -1821479759
	)
	static int field5932;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lxa;I)V",
		garbageValue = "-1722278579"
	)
	public void vmethod11455(Object var1, Buffer var2) {
		this.method11405((Integer)var1, var2);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lxa;B)Ljava/lang/Object;",
		garbageValue = "-20"
	)
	public Object vmethod11459(Buffer var1) {
		return var1.readInt();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Lxa;I)V",
		garbageValue = "-1035067516"
	)
	void method11405(Integer var1, Buffer var2) {
		var2.writeInt(var1);
	}
}
