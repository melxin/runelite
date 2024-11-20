import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vw")
@Implements("SpriteBufferProperties")
public class SpriteBufferProperties {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 4130311
	)
	@Export("SpriteBuffer_spriteCount")
	static int SpriteBuffer_spriteCount;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1828698817
	)
	@Export("SpriteBuffer_spriteWidth")
	static int SpriteBuffer_spriteWidth;
	@ObfuscatedName("ae")
	@Export("SpriteBuffer_xOffsets")
	static int[] SpriteBuffer_xOffsets;
	@ObfuscatedName("ac")
	@Export("SpriteBuffer_spriteWidths")
	static int[] SpriteBuffer_spriteWidths;
	@ObfuscatedName("au")
	@Export("SpriteBuffer_pixels")
	static byte[][] SpriteBuffer_pixels;

	@ObfuscatedName("op")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1947836790"
	)
	static final void method10708() {
		Iterator var0 = Client.worldViewManager.iterator();

		while (var0.hasNext()) {
			WorldView var1 = (WorldView)var0.next();

			for (int var2 = 0; var2 < Client.playerUpdateManager.playerCount; ++var2) {
				Player var3 = var1.players[Client.playerUpdateManager.playerIndices[var2]];
				if (var3 != null) {
					var3.clearIsFriend();
				}
			}
		}

		var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var4 = (Message)var0.next();
			var4.clearIsFromFriend();
		}

		if (class178.friendsChat != null) {
			class178.friendsChat.clearFriends();
		}

	}
}
