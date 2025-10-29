import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ul")
public class class533 implements class538 {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lve;"
	)
	public final class571 field5637;

	@ObfuscatedSignature(
		descriptor = "(Lwb;)V"
	)
	class533(class572 var1) {
		this.field5637 = var1;
	}

	@ObfuscatedSignature(
		descriptor = "(Lum;)V"
	)
	public class533(class534 var1) {
		this(new class572(var1));
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "3"
	)
	public int method10788(int var1) {
		return this.field5637.vmethod11295(var1);
	}
}
