import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
@Implements("AttackOption")
public enum AttackOption implements Enum {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	field1379(2),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	field1378(4);

	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 474752957
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "118"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lpq;Lpq;ZLqw;B)V",
		garbageValue = "-66"
	)
	public static void method3099(AbstractArchive var0, AbstractArchive var1, boolean var2, Font var3) {
		class240.ItemDefinition_archive = var0;
		UrlRequester.ItemDefinition_modelArchive = var1;
		WorldMapEvent.ItemDefinition_inMembersWorld = var2;
		Sound.ItemDefinition_fileCount = class240.ItemDefinition_archive.getGroupFileCount(10);
		DesktopPlatformInfoProvider.ItemDefinition_fontPlain11 = var3;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lpq;Ljava/lang/String;Ljava/lang/String;I)Lvi;",
		garbageValue = "-187850125"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) {
			return null;
		} else {
			int var3 = var0.getGroupId(var1);
			int var4 = var0.getFileId(var3, var2);
			IndexedSprite var5;
			if (!WorldMapSprite.method6397(var0, var3, var4)) {
				var5 = null;
			} else {
				IndexedSprite var7 = new IndexedSprite();
				var7.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
				var7.height = class174.SpriteBuffer_spriteHeight;
				var7.xOffset = class241.SpriteBuffer_xOffsets[0];
				var7.yOffset = SpriteBufferProperties.SpriteBuffer_yOffsets[0];
				var7.subWidth = SpriteBufferProperties.SpriteBuffer_spriteWidths[0];
				var7.subHeight = class403.SpriteBuffer_spriteHeights[0];
				var7.palette = KeyHandler.SpriteBuffer_spritePalette;
				var7.pixels = class240.SpriteBuffer_pixels[0];
				class241.SpriteBuffer_xOffsets = null;
				SpriteBufferProperties.SpriteBuffer_yOffsets = null;
				SpriteBufferProperties.SpriteBuffer_spriteWidths = null;
				class403.SpriteBuffer_spriteHeights = null;
				KeyHandler.SpriteBuffer_spritePalette = null;
				class240.SpriteBuffer_pixels = null;
				var5 = var7;
			}

			return var5;
		}
	}
}
