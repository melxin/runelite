import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("up")
public class class527 {
	@ObfuscatedName("ab")
	public final Object field5325;
	@ObfuscatedName("aw")
	public final Object field5323;

	public class527(Object var1, Object var2) {
		this.field5325 = var1;
		this.field5323 = var2;
	}

	public boolean equals(Object var1) {
		if (var1 != null && var1 instanceof class527) {
			class527 var2 = (class527)var1;
			if (this.field5325 == null) {
				if (var2.field5325 != null) {
					return false;
				}
			} else if (!this.field5325.equals(var2.field5325)) {
				return false;
			}

			if (this.field5323 == null) {
				if (var2.field5323 != null) {
					return false;
				}
			} else if (!this.field5323.equals(var2.field5323)) {
				return false;
			}

			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		return this.field5325 + ", " + this.field5323;
	}

	public int hashCode() {
		int var1 = 0;
		if (this.field5325 != null) {
			var1 += this.field5325.hashCode();
		}

		if (this.field5323 != null) {
			var1 += 31 * this.field5323.hashCode();
		}

		return var1;
	}
}
