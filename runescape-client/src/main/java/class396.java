import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pq")
public class class396 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("ObjectDefinition_modelsArchive")
	public static AbstractArchive ObjectDefinition_modelsArchive;

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "719814332"
	)
	static void method8006() {
		MilliClock.compass = null;
		AsyncRestClient.redHintArrowSprite = null;
		class403.mapSceneSprites = null;
		Frames.headIconPkSprites = null;
		MouseHandler.headIconPrayerSprites = null;
		Varps.headIconHintSprites = null;
		class152.mapDotSprites = null;
		ScriptFrame.crossSprites = null;
		Messages.field1257 = null;
		ClanChannelMember.scrollBarSprites = null;
		TaskHandler.field2417 = null;
	}
}
