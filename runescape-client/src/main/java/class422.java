import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qf")
public class class422 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	public class427 field4728;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	public class426 field4729;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	public class426 field4732;

	public class422() {
		this.field4728 = FaceNormal.method4465();
		this.field4729 = class289.method6322();
		this.field4732 = Varps.method6964(1.0F, 1.0F, 1.0F);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-841889556"
	)
	public void method8253() {
		this.field4728.method8354();
		this.field4729.method8317();
		this.field4732.method8317();
	}

	public boolean equals(Object var1) {
		if (var1 == null) {
			return false;
		} else if (this == var1) {
			return true;
		} else if (!(var1 instanceof class422)) {
			return false;
		} else {
			class422 var2 = (class422)var1;
			return this.field4728.equals(var2.field4728) && this.field4729.method8288(var2.field4729) && this.field4732.method8288(var2.field4732);
		}
	}

	public int hashCode() {
		boolean var1 = true;
		byte var2 = 1;
		int var3 = 31 * var2 + this.field4728.hashCode();
		var3 = var3 * 31 + this.field4729.hashCode();
		var3 = 31 * var3 + this.field4732.hashCode();
		return var3;
	}

	public String toString() {
		return "[" + this.field4728.toString() + "|" + this.field4729.toString() + "|" + this.field4732.toString() + "]";
	}
}
