import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("wv")
public class class589 {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1154766611
	)
	public final int field5763;
	@ObfuscatedName("aj")
	public Object field5761;

	public class589(int var1) {
		this.field5763 = var1;
	}

	public class589(int var1, Object var2) {
		this.field5763 = var1;
		this.field5761 = var2;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class589)) {
			return false;
		} else {
			class589 var2 = (class589)var1;
			if (var2.field5761 == null && this.field5761 != null) {
				return false;
			} else if (this.field5761 == null && var2.field5761 != null) {
				return false;
			} else {
				return var2.field5763 == this.field5763 && var2.field5761.equals(this.field5761);
			}
		}
	}

	public int hashCode() {
		return super.hashCode();
	}
}
