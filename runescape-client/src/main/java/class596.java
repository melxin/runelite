import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("wq")
public class class596 {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1084673439
	)
	public final int field5883;
	@ObfuscatedName("ab")
	public Object field5881;

	public class596(int var1) {
		this.field5883 = var1;
	}

	public class596(int var1, Object var2) {
		this.field5883 = var1;
		this.field5881 = var2;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class596)) {
			return false;
		} else {
			class596 var2 = (class596)var1;
			if (var2.field5881 == null && this.field5881 != null) {
				return false;
			} else if (this.field5881 == null && var2.field5881 != null) {
				return false;
			} else {
				return var2.field5883 == this.field5883 && var2.field5881.equals(this.field5881);
			}
		}
	}

	public int hashCode() {
		return super.hashCode();
	}
}
