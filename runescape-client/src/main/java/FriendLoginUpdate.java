import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("so")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("oz")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	static Task field5284;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -2009898177
	)
	public int field5285;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lxf;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("ac")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Lxf;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field5285 = (int)(UserComparator7.method3496() / 1000L);
		this.username = var1;
		this.world = (short)var2;
	}
}
