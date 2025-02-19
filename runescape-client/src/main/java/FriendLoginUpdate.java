import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sg")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 2123468953
	)
	public int field5119;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lwm;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("au")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Lwm;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field5119 = (int)(InterfaceParent.method2434() / 1000L);
		this.username = var1;
		this.world = (short)var2;
	}
}
