import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tt")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 1744899475
	)
	static int field5441;
	@ObfuscatedName("ab")
	boolean field5439;
	@ObfuscatedName("at")
	boolean field5440;

	Friend() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ltt;I)I",
		garbageValue = "1265388769"
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
		} else if (this.field5439 && !var1.field5439) {
			return -1;
		} else if (!this.field5439 && var1.field5439) {
			return 1;
		} else if (this.field5440 && !var1.field5440) {
			return -1;
		} else if (!this.field5440 && var1.field5440) {
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltk;I)I",
		garbageValue = "1282880775"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareToFriend((Friend)var1);
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lpe;III)Z",
		garbageValue = "1011313855"
	)
	public static boolean method10009(AbstractArchive var0, int var1, int var2) {
		byte[] var3 = var0.takeFile(var1, var2);
		if (var3 == null) {
			return false;
		} else {
			PlayerUpdateManager.SpriteBuffer_decode(var3);
			return true;
		}
	}
}
