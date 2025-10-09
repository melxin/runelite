import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tm")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1158084829
	)
	public int field5444;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lxp;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("ag")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Lxp;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field5444 = (int)(class281.method6373() / 1000L);
		this.username = var1;
		this.world = (short)var2;
	}
}
