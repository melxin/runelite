import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vt")
public class class557 {
	@ObfuscatedName("af")
	public final Object field5757;
	@ObfuscatedName("aw")
	public final Object field5756;

	public class557(Object var1, Object var2) {
		this.field5757 = var1;
		this.field5756 = var2;
	}

	public String toString() {
		return this.field5757 + ", " + this.field5756;
	}

	public boolean equals(Object var1) {
		if (var1 != null && var1 instanceof class557) {
			class557 var2 = (class557)var1;
			if (this.field5757 == null) {
				if (var2.field5757 != null) {
					return false;
				}
			} else if (!this.field5757.equals(var2.field5757)) {
				return false;
			}

			if (this.field5756 == null) {
				if (var2.field5756 != null) {
					return false;
				}
			} else if (!this.field5756.equals(var2.field5756)) {
				return false;
			}

			return true;
		} else {
			return false;
		}
	}

	public int hashCode() {
		int var1 = 0;
		if (this.field5757 != null) {
			var1 += this.field5757.hashCode();
		}

		if (this.field5756 != null) {
			var1 += 31 * this.field5756.hashCode();
		}

		return var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "303437413"
	)
	static void method10856() {
		ItemContainer.itemContainers = new NodeHashTable(32);
	}
}
