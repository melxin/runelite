import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qi")
public class class441 {
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = -1078559373
	)
	static int field4947;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lrw;"
	)
	public class446 field4951;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lre;"
	)
	public class445 field4946;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lre;"
	)
	public class445 field4948;

	public class441() {
		this.field4951 = GrandExchangeEvent.method8240();
		this.field4946 = class70.method2210();
		this.field4948 = class47.method1781(1.0F, 1.0F, 1.0F);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "805917751"
	)
	public void method8634() {
		this.field4951.method8769();
		this.field4946.method8687();
		this.field4948.method8687();
	}

	public String toString() {
		return "[" + this.field4951.toString() + "|" + this.field4946.toString() + "|" + this.field4948.toString() + "]";
	}

	public boolean equals(Object var1) {
		if (var1 == null) {
			return false;
		} else if (this == var1) {
			return true;
		} else if (!(var1 instanceof class441)) {
			return false;
		} else {
			class441 var2 = (class441)var1;
			return this.field4951.equals(var2.field4951) && this.field4946.method8691(var2.field4946) && this.field4948.method8691(var2.field4948);
		}
	}

	public int hashCode() {
		boolean var1 = true;
		byte var2 = 1;
		int var3 = var2 * 31 + this.field4951.hashCode();
		var3 = var3 * 31 + this.field4946.hashCode();
		var3 = 31 * var3 + this.field4948.hashCode();
		return var3;
	}
}
