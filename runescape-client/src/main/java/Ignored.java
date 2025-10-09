import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("th")
@Implements("Ignored")
public class Ignored extends User {
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = 1136422203
	)
	static int field5465;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 533967449
	)
	@Export("id")
	int id;

	Ignored() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lth;I)I",
		garbageValue = "2071799629"
	)
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltk;I)I",
		garbageValue = "1282880775"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareTo_ignored((Ignored)var1);
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored((Ignored)var1);
	}
}
