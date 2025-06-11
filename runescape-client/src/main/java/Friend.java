import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ss")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "Lrf;"
	)
	@Export("fontBold12")
	public static Font fontBold12;
	@ObfuscatedName("ap")
	boolean field5179;
	@ObfuscatedName("aj")
	boolean field5176;

	Friend() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lss;I)I",
		garbageValue = "905314729"
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
		} else if (this.field5179 && !var1.field5179) {
			return -1;
		} else if (!this.field5179 && var1.field5179) {
			return 1;
		} else if (this.field5176 && !var1.field5176) {
			return -1;
		} else if (!this.field5176 && var1.field5176) {
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lsi;B)I",
		garbageValue = "-27"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareToFriend((Friend)var1);
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1);
	}
}
