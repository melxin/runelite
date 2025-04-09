import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("wr")
public class class578 {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1281411439
	)
	public final int field5663;
	@ObfuscatedName("an")
	public Object field5662;

	public class578(int var1) {
		this.field5663 = var1;
	}

	public class578(int var1, Object var2) {
		this.field5663 = var1;
		this.field5662 = var2;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class578)) {
			return false;
		} else {
			class578 var2 = (class578)var1;
			if (var2.field5662 == null && this.field5662 != null) {
				return false;
			} else if (this.field5662 == null && var2.field5662 != null) {
				return false;
			} else {
				return this.field5663 == var2.field5663 && var2.field5662.equals(this.field5662);
			}
		}
	}

	public int hashCode() {
		return super.hashCode();
	}
}
