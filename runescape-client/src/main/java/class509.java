import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ti")
public class class509 implements class514 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lux;"
	)
	public final class542 field5243;

	@ObfuscatedSignature(
		descriptor = "(Lus;)V"
	)
	class509(class543 var1) {
		this.field5243 = var1;
	}

	@ObfuscatedSignature(
		descriptor = "(Lts;)V"
	)
	public class509(class510 var1) {
		this(new class543(var1));
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "593429207"
	)
	public int method9530(int var1) {
		return this.field5243.vmethod9939(var1);
	}
}
