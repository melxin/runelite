import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("vm")
public class class565 {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 95184995
	)
	public final int field5538;
	@ObfuscatedName("ah")
	public Object field5539;

	public class565(int var1) {
		this.field5538 = var1;
	}

	public class565(int var1, Object var2) {
		this.field5538 = var1;
		this.field5539 = var2;
	}

	public int hashCode() {
		return super.hashCode();
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class565)) {
			return false;
		} else {
			class565 var2 = (class565)var1;
			if (var2.field5539 == null && this.field5539 != null) {
				return false;
			} else if (this.field5539 == null && var2.field5539 != null) {
				return false;
			} else {
				return var2.field5538 == this.field5538 && var2.field5539.equals(this.field5539);
			}
		}
	}
}
