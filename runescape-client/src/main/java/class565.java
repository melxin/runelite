import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("vz")
public class class565 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 407362493
	)
	public final int field5535;
	@ObfuscatedName("aw")
	public Object field5536;

	public class565(int var1) {
		this.field5535 = var1;
	}

	public class565(int var1, Object var2) {
		this.field5535 = var1;
		this.field5536 = var2;
	}

	public int hashCode() {
		return super.hashCode();
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class565)) {
			return false;
		} else {
			class565 var2 = (class565)var1;
			if (var2.field5536 == null && this.field5536 != null) {
				return false;
			} else if (this.field5536 == null && var2.field5536 != null) {
				return false;
			} else {
				return this.field5535 == var2.field5535 && var2.field5536.equals(this.field5536);
			}
		}
	}
}
