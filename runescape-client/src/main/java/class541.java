import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uv")
public class class541 {
	@ObfuscatedName("wa")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	@Export("worldMap")
	static WorldMap worldMap;
	@ObfuscatedName("ab")
	public final Object field5443;
	@ObfuscatedName("ay")
	public final Object field5444;

	public class541(Object var1, Object var2) {
		this.field5443 = var1;
		this.field5444 = var2;
	}

	public int hashCode() {
		int var1 = 0;
		if (this.field5443 != null) {
			var1 += this.field5443.hashCode();
		}

		if (this.field5444 != null) {
			var1 += 31 * this.field5444.hashCode();
		}

		return var1;
	}

	public String toString() {
		return this.field5443 + ", " + this.field5444;
	}

	public boolean equals(Object var1) {
		if (var1 != null && var1 instanceof class541) {
			class541 var2 = (class541)var1;
			if (this.field5443 == null) {
				if (var2.field5443 != null) {
					return false;
				}
			} else if (!this.field5443.equals(var2.field5443)) {
				return false;
			}

			if (this.field5444 == null) {
				if (var2.field5444 != null) {
					return false;
				}
			} else if (!this.field5444.equals(var2.field5444)) {
				return false;
			}

			return true;
		} else {
			return false;
		}
	}
}
