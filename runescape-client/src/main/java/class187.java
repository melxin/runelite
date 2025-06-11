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
	public static int method4098(int var0) {
		return var0 >> 11 & 63;
	}
}
