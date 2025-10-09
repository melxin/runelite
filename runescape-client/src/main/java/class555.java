import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("vn")
public class class555 {
	@ObfuscatedName("ab")
	public final Object field5821;
	@ObfuscatedName("at")
	public final Object field5819;

	public class555(Object var1, Object var2) {
		this.field5821 = var1;
		this.field5819 = var2;
	}

	public boolean equals(Object var1) {
		if (var1 != null && var1 instanceof class555) {
			class555 var2 = (class555)var1;
			if (this.field5821 == null) {
				if (var2.field5821 != null) {
					return false;
				}
			} else if (!this.field5821.equals(var2.field5821)) {
				return false;
			}

			if (this.field5819 == null) {
				if (var2.field5819 != null) {
					return false;
				}
			} else if (!this.field5819.equals(var2.field5819)) {
				return false;
			}

			return true;
		} else {
			return false;
		}
	}

	public int hashCode() {
		int var1 = 0;
		if (this.field5821 != null) {
			var1 += this.field5821.hashCode();
		}

		if (this.field5819 != null) {
			var1 += 31 * this.field5819.hashCode();
		}

		return var1;
	}

	public String toString() {
		return this.field5821 + ", " + this.field5819;
	}
}
