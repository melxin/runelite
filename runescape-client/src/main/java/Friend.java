import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("se")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("al")
	boolean field5280;
	@ObfuscatedName("ab")
	boolean field5281;

	Friend() {
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lse;I)I",
		garbageValue = "142130783"
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
		} else if (this.field5280 && !var1.field5280) {
			return -1;
		} else if (!this.field5280 && var1.field5280) {
			return 1;
		} else if (this.field5281 && !var1.field5281) {
			return -1;
		} else if (!this.field5281 && var1.field5281) {
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ltb;B)I",
		garbageValue = "73"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareToFriend((Friend)var1);
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1);
	}
}
