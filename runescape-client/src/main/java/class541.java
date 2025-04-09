import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ug")
public class class541 {
	@ObfuscatedName("ao")
	public final Object field5466;
	@ObfuscatedName("an")
	public final Object field5467;

	public class541(Object var1, Object var2) {
		this.field5466 = var1;
		this.field5467 = var2;
	}

	public boolean equals(Object var1) {
		if (var1 != null && var1 instanceof class541) {
			class541 var2 = (class541)var1;
			if (this.field5466 == null) {
				if (var2.field5466 != null) {
					return false;
				}
			} else if (!this.field5466.equals(var2.field5466)) {
				return false;
			}

			if (this.field5467 == null) {
				if (var2.field5467 != null) {
					return false;
				}
			} else if (!this.field5467.equals(var2.field5467)) {
				return false;
			}

			return true;
		} else {
			return false;
		}
	}

	public int hashCode() {
		int var1 = 0;
		if (this.field5466 != null) {
			var1 += this.field5466.hashCode();
		}

		if (this.field5467 != null) {
			var1 += 31 * this.field5467.hashCode();
		}

		return var1;
	}

	public String toString() {
		return this.field5466 + ", " + this.field5467;
	}
}
