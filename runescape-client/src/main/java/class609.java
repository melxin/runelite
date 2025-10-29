import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("xx")
public class class609 {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 575488381
	)
	public final int field6084;
	@ObfuscatedName("at")
	public Object field6085;

	public class609(int var1) {
		this.field6084 = var1;
	}

	public class609(int var1, Object var2) {
		this.field6084 = var1;
		this.field6085 = var2;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class609)) {
			return false;
		} else {
			class609 var2 = (class609)var1;
			if (var2.field6085 == null && this.field6085 != null) {
				return false;
			} else if (this.field6085 == null && var2.field6085 != null) {
				return false;
			} else {
				return var2.field6084 == this.field6084 && var2.field6085.equals(this.field6085);
			}
		}
	}

	public int hashCode() {
		return super.hashCode();
	}
}
