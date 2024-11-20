import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uc")
final class class543 implements class540 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = -4517439251704333955L
	)
	static long field5388;

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lvj;I)V",
		garbageValue = "1774358962"
	)
	public void vmethod9971(Object var1, Buffer var2) {
		this.method9939((Long)var1, var2);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lvj;I)Ljava/lang/Object;",
		garbageValue = "59393473"
	)
	public Object vmethod9969(Buffer var1) {
		return var1.readLong();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Lvj;I)V",
		garbageValue = "906744984"
	)
	void method9939(Long var1, Buffer var2) {
		var2.writeLong(var1);
	}
}
