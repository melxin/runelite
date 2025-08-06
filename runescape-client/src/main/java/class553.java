import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("vk")
public class class553 {
	@ObfuscatedName("al")
	public final Object field5652;
	@ObfuscatedName("ab")
	public final Object field5651;

	public class553(Object var1, Object var2) {
		this.field5652 = var1;
		this.field5651 = var2;
	}

	public String toString() {
		return this.field5652 + ", " + this.field5651;
	}

	public boolean equals(Object var1) {
		if (var1 != null && var1 instanceof class553) {
			class553 var2 = (class553)var1;
			if (this.field5652 == null) {
				if (var2.field5652 != null) {
					return false;
				}
			} else if (!this.field5652.equals(var2.field5652)) {
				return false;
			}

			if (this.field5651 == null) {
				if (var2.field5651 != null) {
					return false;
				}
			} else if (!this.field5651.equals(var2.field5651)) {
				return false;
			}

			return true;
		} else {
			return false;
		}
	}

	public int hashCode() {
		int var1 = 0;
		if (this.field5652 != null) {
			var1 += this.field5652.hashCode();
		}

		if (this.field5651 != null) {
			var1 += 31 * this.field5651.hashCode();
		}

		return var1;
	}
}
