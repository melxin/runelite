import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sm")
@Implements("Ignored")
public class Ignored extends User {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 382360257
	)
	@Export("id")
	int id;

	Ignored() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lsm;I)I",
		garbageValue = "-1985032984"
	)
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lsz;I)I",
		garbageValue = "-1986498122"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareTo_ignored((Ignored)var1);
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored((Ignored)var1);
	}
}
