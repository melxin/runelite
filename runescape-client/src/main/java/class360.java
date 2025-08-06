import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nt")
public class class360 {
	@ObfuscatedName("qz")
	@ObfuscatedSignature(
		descriptor = "[Lxv;"
	)
	@Export("crossSprites")
	static SpritePixels[] crossSprites;
	@ObfuscatedName("ui")
	static boolean field3971;

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)[Loy;",
		garbageValue = "-891426596"
	)
	public static StudioGame[] method7503() {
		return new StudioGame[]{StudioGame.game4, StudioGame.game3, StudioGame.stellardawn, StudioGame.oldscape, StudioGame.runescape, StudioGame.game5};
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-910940668"
	)
	@Export("getUserHash")
	static long getUserHash() {
		return Client.userHash;
	}
}
