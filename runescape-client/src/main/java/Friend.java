import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sf")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("ab")
	boolean field4997;
	@ObfuscatedName("aw")
	boolean field4996;

	Friend() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lsf;B)I",
		garbageValue = "1"
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
		} else if (this.field4997 && !var1.field4997) {
			return -1;
		} else if (!this.field4997 && var1.field4997) {
			return 1;
		} else if (this.field4996 && !var1.field4996) {
			return -1;
		} else if (!this.field4996 && var1.field4996) {
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lsv;I)I",
		garbageValue = "-1712642331"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareToFriend((Friend)var1);
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1);
	}
}
