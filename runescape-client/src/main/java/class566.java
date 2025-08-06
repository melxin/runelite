import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vs")
final class class566 implements class565 {
	@ObfuscatedName("ax")
	@Export("ByteArrayPool_alternativeSizes")
	static int[] ByteArrayPool_alternativeSizes;

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lwj;I)V",
		garbageValue = "-567180997"
	)
	public void vmethod11079(Object var1, Buffer var2) {
		this.method11028((Integer)var1, var2);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwj;S)Ljava/lang/Object;",
		garbageValue = "-30185"
	)
	public Object vmethod11078(Buffer var1) {
		return var1.readInt();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Lwj;B)V",
		garbageValue = "37"
	)
	void method11028(Integer var1, Buffer var2) {
		var2.writeInt(var1);
	}
}
