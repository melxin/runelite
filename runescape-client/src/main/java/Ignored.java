import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sy")
@Implements("Ignored")
public class Ignored extends User {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -329454277
	)
	@Export("id")
	int id;

	Ignored() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lsy;I)I",
		garbageValue = "-1627489022"
	)
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lsv;I)I",
		garbageValue = "-1712642331"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareTo_ignored((Ignored)var1);
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored((Ignored)var1);
	}
}
