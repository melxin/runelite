import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
public class class187 {
	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "Lsq;"
	)
	@Export("friendsChat")
	static FriendsChat friendsChat;

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1654077773"
	)
	@Export("Widget_unpackTargetMask")
	public static int Widget_unpackTargetMask(int var0) {
		return var0 >> 11 & 63;
	}
}
