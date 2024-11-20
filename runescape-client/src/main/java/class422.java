import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qk")
public class class422 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	public class427 field4744;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	public class426 field4745;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	public class426 field4746;

	public class422() {
		this.field4744 = class309.method6386();
		this.field4745 = WorldMapDecoration.method6233();
		this.field4746 = PlayerCompositionColorTextureOverride.method3722(1.0F, 1.0F, 1.0F);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "648338812"
	)
	public void method8054() {
		this.field4744.method8199();
		this.field4745.method8136();
		this.field4746.method8136();
	}

	public String toString() {
		return "[" + this.field4744.toString() + "|" + this.field4745.toString() + "|" + this.field4746.toString() + "]";
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
			return this.field4744.equals(var2.field4744) && this.field4745.method8106(var2.field4745) && this.field4746.method8106(var2.field4746);
		}
	}

	public int hashCode() {
		boolean var1 = true;
		byte var2 = 1;
		int var3 = var2 * 31 + this.field4744.hashCode();
		var3 = var3 * 31 + this.field4745.hashCode();
		var3 = 31 * var3 + this.field4746.hashCode();
		return var3;
	}
}
