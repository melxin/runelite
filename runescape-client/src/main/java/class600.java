import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("xv")
public class class600 {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1961181607
	)
	public final int field5986;
	@ObfuscatedName("aw")
	public Object field5985;

	public class600(int var1) {
		this.field5986 = var1;
	}

	public class600(int var1, Object var2) {
		this.field5986 = var1;
		this.field5985 = var2;
	}

	public int hashCode() {
		return super.hashCode();
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class600)) {
			return false;
		} else {
			class600 var2 = (class600)var1;
			if (var2.field5985 == null && this.field5985 != null) {
				return false;
			} else if (this.field5985 == null && var2.field5985 != null) {
				return false;
			} else {
				return var2.field5986 == this.field5986 && var2.field5985.equals(this.field5985);
			}
		}
	}
}
