import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("td")
public class class496 implements class501 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lur;"
	)
	public final class531 field5124;

	@ObfuscatedSignature(
		descriptor = "(Lum;)V"
	)
	class496(class532 var1) {
		this.field5124 = var1;
	}

	@ObfuscatedSignature(
		descriptor = "(Ltw;)V"
	)
	public class496(class497 var1) {
		this(new class532(var1));
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "0"
	)
	public int method9321(int var1) {
		return this.field5124.vmethod9817(var1);
	}
}
