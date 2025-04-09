import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("su")
@Implements("Ignored")
public class Ignored extends User {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1610031067
	)
	@Export("id")
	int id;

	Ignored() {
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lsu;B)I",
		garbageValue = "0"
	)
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lsh;I)I",
		garbageValue = "2137134546"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareTo_ignored((Ignored)var1);
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored((Ignored)var1);
	}
}
