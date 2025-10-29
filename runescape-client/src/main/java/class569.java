import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("vp")
public class class569 {
	@ObfuscatedName("av")
	public final Object field5876;
	@ObfuscatedName("at")
	public final Object field5875;

	public class569(Object var1, Object var2) {
		this.field5876 = var1;
		this.field5875 = var2;
	}

	public boolean equals(Object var1) {
		if (var1 != null && var1 instanceof class569) {
			class569 var2 = (class569)var1;
			if (this.field5876 == null) {
				if (var2.field5876 != null) {
					return false;
				}
			} else if (!this.field5876.equals(var2.field5876)) {
				return false;
			}

			if (this.field5875 == null) {
				if (var2.field5875 != null) {
					return false;
				}
			} else if (!this.field5875.equals(var2.field5875)) {
				return false;
			}

			return true;
		} else {
			return false;
		}
	}

	public int hashCode() {
		int var1 = 0;
		if (this.field5876 != null) {
			var1 += this.field5876.hashCode();
		}

		if (this.field5875 != null) {
			var1 += 31 * this.field5875.hashCode();
		}

		return var1;
	}

	public String toString() {
		return this.field5876 + ", " + this.field5875;
	}
}
