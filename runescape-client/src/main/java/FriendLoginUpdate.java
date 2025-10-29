import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tj")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1064653935
	)
	public int field5468;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lxv;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("ag")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Lxv;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field5468 = (int)(ParamComposition.method4708() / 1000L);
		this.username = var1;
		this.world = (short)var2;
	}

	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-19044"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		class300.method6919();
		if (BuddyRankComparator.friendsChat != null) {
			BuddyRankComparator.friendsChat.invalidateIgnoreds();
		}

	}
}
