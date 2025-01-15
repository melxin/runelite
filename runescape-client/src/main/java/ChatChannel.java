import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lct;"
	)
	@Export("messages")
	Message[] messages;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 2144686969
	)
	@Export("count")
	int count;

	ChatChannel() {
		this.messages = new Message[100];
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lct;",
		garbageValue = "-373552992"
	)
	@Export("addMessage")
	Message addMessage(int var1, String var2, String var3, String var4) {
		Message var5 = this.messages[99];

		for (int var6 = this.count; var6 > 0; --var6) {
			if (var6 != 100) {
				this.messages[var6] = this.messages[var6 - 1];
			}
		}

		if (var5 == null) {
			var5 = new Message(var1, var2, var4, var3);
		} else {
			var5.remove();
			var5.removeDual();
			var5.set(var1, var2, var4, var3);
		}

		this.messages[0] = var5;
		if (this.count < 100) {
			++this.count;
		}

		return var5;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Lct;",
		garbageValue = "-1427940988"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1858544506"
	)
	@Export("size")
	int size() {
		return this.count;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Loe;",
		garbageValue = "-908384021"
	)
	public static GameBuild method2508(int var0) {
		GameBuild[] var1 = Messages.method3241();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			GameBuild var3 = var1[var2];
			if (var0 == var3.buildId) {
				return var3;
			}
		}

		return null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lpq;III)Lvf;",
		garbageValue = "437889605"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		if (!WorldMapSprite.method6397(var0, var1, var2)) {
			return null;
		} else {
			SpritePixels var4 = new SpritePixels();
			var4.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
			var4.height = class174.SpriteBuffer_spriteHeight;
			var4.xOffset = class241.SpriteBuffer_xOffsets[0];
			var4.yOffset = SpriteBufferProperties.SpriteBuffer_yOffsets[0];
			var4.subWidth = SpriteBufferProperties.SpriteBuffer_spriteWidths[0];
			var4.subHeight = class403.SpriteBuffer_spriteHeights[0];
			int var5 = var4.subHeight * var4.subWidth;
			byte[] var6 = class240.SpriteBuffer_pixels[0];
			var4.pixels = new int[var5];

			for (int var7 = 0; var7 < var5; ++var7) {
				var4.pixels[var7] = KeyHandler.SpriteBuffer_spritePalette[var6[var7] & 255];
			}

			class241.SpriteBuffer_xOffsets = null;
			SpriteBufferProperties.SpriteBuffer_yOffsets = null;
			SpriteBufferProperties.SpriteBuffer_spriteWidths = null;
			class403.SpriteBuffer_spriteHeights = null;
			KeyHandler.SpriteBuffer_spritePalette = null;
			class240.SpriteBuffer_pixels = null;
			return var4;
		}
	}
}
