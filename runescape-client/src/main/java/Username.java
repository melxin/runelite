import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("xm")
@Implements("Username")
public class Username implements Comparable {
	@ObfuscatedName("ap")
	@Export("name")
	String name;
	@ObfuscatedName("aj")
	@Export("cleanName")
	String cleanName;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lvf;)V"
	)
	public Username(String var1, LoginType var2) {
		this.name = var1;
		this.cleanName = HealthBarConfig.method2568(var1, var2);
	}

	public Username(String var1) {
		this.name = var1;
		this.cleanName = HealthBarConfig.method2568(var1, LoginType.oldscape);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1318195369"
	)
	@Export("getName")
	public String getName() {
		return this.name;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1085399342"
	)
	public String method11543() {
		return this.cleanName;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1746631352"
	)
	@Export("hasCleanName")
	public boolean hasCleanName() {
		return this.cleanName != null;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lxm;I)I",
		garbageValue = "-1272671100"
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

	public int compareTo(Object var1) {
		return this.compareToTyped((Username)var1);
	}

	public String toString() {
		return this.getName();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)[Loa;",
		garbageValue = "-14"
	)
	public static GameBuild[] method11563() {
		return new GameBuild[]{GameBuild.LIVE, GameBuild.BUILDLIVE, GameBuild.WIP, GameBuild.RC};
	}
}
