import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("md")
public class class334 {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lpe;Ljava/lang/String;Ljava/lang/String;B)Lxc;",
		garbageValue = "1"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) {
			return null;
		} else {
			int var3 = var0.getGroupId(var1);
			int var4 = var0.getFileId(var3, var2);
			IndexedSprite var5;
			if (!Friend.method10009(var0, var3, var4)) {
				var5 = null;
			} else {
				var5 = class598.method11717();
			}

			return var5;
		}
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-697000366"
	)
	static final int method7081() {
		if (class154.clientPreferences.isRoofsHidden()) {
			return class547.topLevelWorldView.plane;
		} else {
			int var0 = Huffman.cameraX >> 7;
			int var1 = ChatChannel.cameraZ >> 7;
			if (var0 >= 0 && 104 > var0 && var1 >= 0 && 104 > var1) {
				int var2 = class280.getTileHeight(class547.topLevelWorldView, Huffman.cameraX, ChatChannel.cameraZ, class547.topLevelWorldView.plane);
				return var2 - class514.cameraY < 800 && (class547.topLevelWorldView.tileSettings[class547.topLevelWorldView.plane][var0][var1] & 4) != 0 ? class547.topLevelWorldView.plane : 3;
			} else {
				return class547.topLevelWorldView.plane;
			}
		}
	}
}
