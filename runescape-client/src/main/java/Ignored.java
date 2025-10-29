import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ty")
@Implements("Ignored")
public class Ignored extends User {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1285081577
	)
	@Export("id")
	int id;

	Ignored() {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)I",
		garbageValue = "1699115097"
	)
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;I)I",
		garbageValue = "327716789"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareTo_ignored((Ignored)var1);
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored((Ignored)var1);
	}
}
