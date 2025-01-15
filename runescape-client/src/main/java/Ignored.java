import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sy")
@Implements("Ignored")
public class Ignored extends User {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1811218597
	)
	static int field5015;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1452578339
	)
	@Export("id")
	int id;

	Ignored() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lsy;I)I",
		garbageValue = "-1005954819"
	)
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lso;I)I",
		garbageValue = "1212702091"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareTo_ignored((Ignored)var1);
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored((Ignored)var1);
	}
}
