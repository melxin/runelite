import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ts")
public class class515 implements class520 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	public final class548 field5336;

	@ObfuscatedSignature(
		descriptor = "(Lvi;)V"
	)
	class515(class549 var1) {
		this.field5336 = var1;
	}

	@ObfuscatedSignature(
		descriptor = "(Ltf;)V"
	)
	public class515(class516 var1) {
		this(new class549(var1));
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-41"
	)
	public int method10060(int var1) {
		return this.field5336.vmethod10501(var1);
	}
}
