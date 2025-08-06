import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rp")
public class class444 {
	@ObfuscatedName("ow")
	@ObfuscatedSignature(
		descriptor = "Lbh;"
	)
	@Export("loginState")
	static LoginState loginState;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lrc;"
	)
	public class449 field5037;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	public class448 field5038;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	public class448 field5039;

	public class444() {
		this.field5037 = StudioGame.method8178();
		class448 var1;
		synchronized(class448.field5055) {
			if (class448.field5061 == 0) {
				var1 = new class448();
			} else {
				class448.field5055[--class448.field5061].method9024();
				var1 = class448.field5055[class448.field5061];
			}
		}

		this.field5038 = var1;
		this.field5039 = ClientPreferences.method2599(1.0F, 1.0F, 1.0F);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1262570789"
	)
	public void method8965() {
		this.field5037.method9075();
		this.field5038.method9038();
		this.field5039.method9038();
	}

	public String toString() {
		return "[" + this.field5037.toString() + "|" + this.field5038.toString() + "|" + this.field5039.toString() + "]";
	}

	public int hashCode() {
		boolean var1 = true;
		byte var2 = 1;
		int var3 = var2 * 31 + this.field5037.hashCode();
		var3 = var3 * 31 + this.field5038.hashCode();
		var3 = 31 * var3 + this.field5039.hashCode();
		return var3;
	}

	public boolean equals(Object var1) {
		if (var1 == null) {
			return false;
		} else if (this == var1) {
			return true;
		} else if (!(var1 instanceof class444)) {
			return false;
		} else {
			class444 var2 = (class444)var1;
			return this.field5037.equals(var2.field5037) && this.field5038.method9025(var2.field5038) && this.field5039.method9025(var2.field5039);
		}
	}
}
