import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jw")
public class class240 {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	@Export("ItemDefinition_archive")
	static AbstractArchive ItemDefinition_archive;
	@ObfuscatedName("at")
	@Export("SpriteBuffer_pixels")
	public static byte[][] SpriteBuffer_pixels;

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1834354626"
	)
	static void method5249() {
		SpriteMask.compass = null;
		class213.redHintArrowSprite = null;
		class155.mapSceneSprites = null;
		BuddyRankComparator.headIconPkSprites = null;
		HttpRequest.headIconPrayerSprites = null;
		SoundSystem.headIconHintSprites = null;
		class140.mapDotSprites = null;
		ArchiveLoader.crossSprites = null;
		class464.field4957 = null;
		WorldMapSection2.scrollBarSprites = null;
		FriendSystem.field829 = null;
	}

	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "254663704"
	)
	static final void method5252(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		class544.clientPreferences.updateAreaSoundEffectsVolume(var0);
	}
}
