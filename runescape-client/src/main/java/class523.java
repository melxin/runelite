import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uk")
public class class523 implements class528 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lvx;"
	)
	public final class557 field5619;

	@ObfuscatedSignature(
		descriptor = "(Lvd;)V"
	)
	class523(class558 var1) {
		this.field5619 = var1;
	}

	@ObfuscatedSignature(
		descriptor = "(Lul;)V"
	)
	public class523(class524 var1) {
		this(new class558(var1));
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-42"
	)
	public int method10559(int var1) {
		return this.field5619.vmethod11022(var1);
	}
}
