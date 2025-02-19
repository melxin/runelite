import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("we")
public class class578 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1501518095
	)
	public final int field5637;
	@ObfuscatedName("ay")
	public Object field5638;

	public class578(int var1) {
		this.field5637 = var1;
	}

	public class578(int var1, Object var2) {
		this.field5637 = var1;
		this.field5638 = var2;
	}

	public int hashCode() {
		return super.hashCode();
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class578)) {
			return false;
		} else {
			class578 var2 = (class578)var1;
			if (var2.field5638 == null && this.field5638 != null) {
				return false;
			} else if (this.field5638 == null && var2.field5638 != null) {
				return false;
			} else {
				return this.field5637 == var2.field5637 && var2.field5638.equals(this.field5638);
			}
		}
	}
}
