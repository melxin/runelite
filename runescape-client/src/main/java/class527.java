import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ug")
public class class527 {
	@ObfuscatedName("ay")
	public final Object field5326;
	@ObfuscatedName("ah")
	public final Object field5327;

	public class527(Object var1, Object var2) {
		this.field5326 = var1;
		this.field5327 = var2;
	}

	public String toString() {
		return this.field5326 + ", " + this.field5327;
	}

	public boolean equals(Object var1) {
		if (var1 != null && var1 instanceof class527) {
			class527 var2 = (class527)var1;
			if (this.field5326 == null) {
				if (var2.field5326 != null) {
					return false;
				}
			} else if (!this.field5326.equals(var2.field5326)) {
				return false;
			}

			if (this.field5327 == null) {
				if (var2.field5327 != null) {
					return false;
				}
			} else if (!this.field5327.equals(var2.field5327)) {
				return false;
			}

			return true;
		} else {
			return false;
		}
	}

	public int hashCode() {
		int var1 = 0;
		if (this.field5326 != null) {
			var1 += this.field5326.hashCode();
		}

		if (this.field5327 != null) {
			var1 += 31 * this.field5327.hashCode();
		}

		return var1;
	}
}
