import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tc")
@Implements("Ignored")
public class Ignored extends User {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1135457307
	)
	@Export("id")
	int id;

	Ignored() {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ltc;I)I",
		garbageValue = "475788568"
	)
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)I",
		garbageValue = "1554225034"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareTo_ignored((Ignored)var1);
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored((Ignored)var1);
	}
}
