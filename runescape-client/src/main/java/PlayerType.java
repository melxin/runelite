import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ou")
@Implements("PlayerType")
public enum PlayerType implements Enum {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	@Export("PlayerType_normal")
	PlayerType_normal(0, -1, true, false, true),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	@Export("PlayerType_playerModerator")
	PlayerType_playerModerator(1, 0, true, true, true),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	@Export("PlayerType_jagexModerator")
	PlayerType_jagexModerator(2, 1, true, true, false),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	@Export("PlayerType_ironman")
	PlayerType_ironman(3, 2, false, false, true),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	@Export("PlayerType_ultimateIronman")
	PlayerType_ultimateIronman(4, 3, false, false, true),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	@Export("PlayerType_hardcoreIronman")
	PlayerType_hardcoreIronman(5, 10, false, false, true),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4603(6, 22, false, false, true),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4593(7, 41, false, false, true),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4601(8, 42, false, false, true),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4602(9, 43, false, false, true),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4611(10, 44, false, false, true),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4604(11, 45, false, false, true),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4605(12, 46, false, false, true),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4606(13, 47, false, false, true),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4607(14, 48, false, false, true),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4608(15, 49, false, false, true),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4598(16, 52, false, false, true);

	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 145139249
	)
	@Export("modIcon")
	public final int modIcon;
	@ObfuscatedName("ak")
	@Export("isPrivileged")
	public final boolean isPrivileged;
	@ObfuscatedName("ag")
	@Export("isUser")
	public final boolean isUser;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 964651547
	)
	@Export("id")
	final int id;

	PlayerType(int var3, int var4, boolean var5, boolean var6, boolean var7) {
		this.id = var3;
		this.modIcon = var4;
		this.isPrivileged = var6;
		this.isUser = var7;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1746725635"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljo;",
		garbageValue = "32"
	)
	public static FloorUnderlayDefinition method7587(int var0) {
		FloorUnderlayDefinition var1 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var0);
			var1 = new FloorUnderlayDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode();
			FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ldj;IIIII)V",
		garbageValue = "-1895718097"
	)
	static final void method7585(WorldView var0, int var1, int var2, int var3, int var4) {
		int[][][] var5 = var0.tileHeights;
		int var6 = var0.sizeX - 1;
		int var7 = var0.sizeY - 1;

		for (int var8 = var2; var8 <= var2 + var4; ++var8) {
			for (int var9 = var1; var9 <= var3 + var1; ++var9) {
				if (var9 >= 0 && var9 < var5[0].length - 1 && var8 >= 0 && var8 < var5[0][0].length - 1) {
					DevicePcmPlayerProvider.Tiles_underlays2[0][var9][var8] = 127;
					if (var9 == var1 && var9 > 0) {
						var5[0][var9][var8] = var5[0][var9 - 1][var8];
					}

					if (var9 == var3 + var1 && var9 < var6) {
						var5[0][var9][var8] = var5[0][var9 + 1][var8];
					}

					if (var8 == var2 && var8 > 0) {
						var5[0][var9][var8] = var5[0][var9][var8 - 1];
					}

					if (var8 == var2 + var4 && var8 < var7) {
						var5[0][var9][var8] = var5[0][var9][var8 + 1];
					}
				}
			}
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)[Lws;",
		garbageValue = "97"
	)
	static IndexedSprite[] method7579() {
		IndexedSprite[] var0 = new IndexedSprite[SpriteBufferProperties.SpriteBuffer_spriteCount];

		for (int var1 = 0; var1 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var1) {
			IndexedSprite var2 = var0[var1] = new IndexedSprite();
			var2.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
			var2.height = class27.SpriteBuffer_spriteHeight;
			var2.xOffset = HttpAuthenticationHeader.SpriteBuffer_xOffsets[var1];
			var2.yOffset = MusicPatchPcmStream.SpriteBuffer_yOffsets[var1];
			var2.subWidth = SpriteBufferProperties.SpriteBuffer_spriteWidths[var1];
			var2.subHeight = class386.SpriteBuffer_spriteHeights[var1];
			var2.palette = class382.SpriteBuffer_spritePalette;
			var2.pixels = SpriteBufferProperties.SpriteBuffer_pixels[var1];
		}

		HttpAuthenticationHeader.SpriteBuffer_xOffsets = null;
		MusicPatchPcmStream.SpriteBuffer_yOffsets = null;
		SpriteBufferProperties.SpriteBuffer_spriteWidths = null;
		class386.SpriteBuffer_spriteHeights = null;
		class382.SpriteBuffer_spritePalette = null;
		SpriteBufferProperties.SpriteBuffer_pixels = null;
		return var0;
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1498775995"
	)
	static void method7586(int var0) {
		WorldView var1 = Client.worldViewManager.getWorldView(var0);
		if (var1 != null) {
			for (int var2 = 0; var2 < Client.playerUpdateManager.playerCount; ++var2) {
				int var3 = Client.playerUpdateManager.playerIndices[var2];
				Client.playerUpdateManager.method3010((Player)var1.players.get((long)var3));
			}

			Client.worldViewManager.method2571(var0);
		}
	}
}
