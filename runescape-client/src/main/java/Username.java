import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wb")
@Implements("Username")
public class Username implements Comparable {
	@ObfuscatedName("ay")
	@Export("name")
	String name;
	@ObfuscatedName("ah")
	@Export("cleanName")
	String cleanName;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Luo;)V"
	)
	public Username(String var1, LoginType var2) {
		this.name = var1;
		this.cleanName = AsyncHttpResponse.method270(var1, var2);
	}

	public Username(String var1) {
		this.name = var1;
		this.cleanName = AsyncHttpResponse.method270(var1, LoginType.oldscape);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1230145962"
	)
	@Export("getName")
	public String getName() {
		return this.name;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "920847303"
	)
	public String method10974() {
		return this.cleanName;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-15965"
	)
	@Export("hasCleanName")
	public boolean hasCleanName() {
		return this.cleanName != null;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)I",
		garbageValue = "-449735377"
	)
	@Export("compareToTyped")
	public int compareToTyped(Username var1) {
		if (this.cleanName == null) {
			return var1.cleanName == null ? 0 : 1;
		} else {
			return var1.cleanName == null ? -1 : this.cleanName.compareTo(var1.cleanName);
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof Username) {
			Username var2 = (Username)var1;
			if (this.cleanName == null) {
				return var2.cleanName == null;
			} else if (var2.cleanName == null) {
				return false;
			} else {
				return this.hashCode() != var2.hashCode() ? false : this.cleanName.equals(var2.cleanName);
			}
		} else {
			return false;
		}
	}

	public int hashCode() {
		return this.cleanName == null ? 0 : this.cleanName.hashCode();
	}

	public String toString() {
		return this.getName();
	}

	public int compareTo(Object var1) {
		return this.compareToTyped((Username)var1);
	}
}
