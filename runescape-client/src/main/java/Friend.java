import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("td")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "Lpw;"
	)
	@Export("archive8")
	static Archive archive8;
	@ObfuscatedName("af")
	boolean field5385;
	@ObfuscatedName("aw")
	boolean field5386;

	Friend() {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ltd;B)I",
		garbageValue = "20"
	)
	@Export("compareToFriend")
	int compareToFriend(Friend var1) {
		if (super.world == Client.worldId && Client.worldId != var1.world) {
			return -1;
		} else if (Client.worldId == var1.world && super.world != Client.worldId) {
			return 1;
		} else if (super.world != 0 && var1.world == 0) {
			return -1;
		} else if (var1.world != 0 && super.world == 0) {
			return 1;
		} else if (this.field5385 && !var1.field5385) {
			return -1;
		} else if (!this.field5385 && var1.field5385) {
			return 1;
		} else if (this.field5386 && !var1.field5386) {
			return -1;
		} else if (!this.field5386 && var1.field5386) {
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)I",
		garbageValue = "1554225034"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareToFriend((Friend)var1);
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1);
	}
}
