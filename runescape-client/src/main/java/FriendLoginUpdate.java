import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ss")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	@Export("options_buttons_2Sprite")
	static IndexedSprite options_buttons_2Sprite;
	@ObfuscatedName("gu")
	@Export("authServiceBaseUrl")
	static String authServiceBaseUrl;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 932590219
	)
	public int field4997;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lwb;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("az")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Lwb;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field4997 = (int)(ReflectionCheck.method724() / 1000L);
		this.username = var1;
		this.world = (short)var2;
	}
}
