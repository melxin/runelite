import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sk")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("ay")
	boolean field4990;
	@ObfuscatedName("ah")
	boolean field4991;

	Friend() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lsk;S)I",
		garbageValue = "-18687"
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
		} else if (this.field4990 && !var1.field4990) {
			return -1;
		} else if (!this.field4990 && var1.field4990) {
			return 1;
		} else if (this.field4991 && !var1.field4991) {
			return -1;
		} else if (!this.field4991 && var1.field4991) {
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lso;I)I",
		garbageValue = "1212702091"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareToFriend((Friend)var1);
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ldf;I)V",
		garbageValue = "-236997524"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		class150.runScript(var0, 500000, 475000);
	}
}
