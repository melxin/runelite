import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tv")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("av")
	boolean field5458;
	@ObfuscatedName("at")
	boolean field5459;

	Friend() {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ltv;I)I",
		garbageValue = "-1963983063"
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
		} else if (this.field5458 && !var1.field5458) {
			return -1;
		} else if (!this.field5458 && var1.field5458) {
			return 1;
		} else if (this.field5459 && !var1.field5459) {
			return -1;
		} else if (!this.field5459 && var1.field5459) {
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;I)I",
		garbageValue = "327716789"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareToFriend((Friend)var1);
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1);
	}
}
