import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sy")
@Implements("Ignored")
public class Ignored extends User {
	@ObfuscatedName("pr")
	@ObfuscatedGetter(
		intValue = 220475497
	)
	static int field5198;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -922311383
	)
	@Export("id")
	int id;

	Ignored() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lsy;I)I",
		garbageValue = "-99918796"
	)
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lsi;B)I",
		garbageValue = "-27"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareTo_ignored((Ignored)var1);
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored((Ignored)var1);
	}
}
