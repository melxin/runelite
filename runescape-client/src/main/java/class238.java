import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jf")
public class class238 {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("FloorOverlayDefinition_archive")
	public static AbstractArchive FloorOverlayDefinition_archive;
	@ObfuscatedName("ii")
	@ObfuscatedGetter(
		intValue = -371376529
	)
	@Export("foundItemIndex")
	static int foundItemIndex;

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1396170113"
	)
	public static boolean method5426(int var0) {
		if (class337.field3790.isEmpty()) {
			return false;
		} else {
			MidiRequest var1 = (MidiRequest)class337.field3790.get(0);
			return var1 != null && var0 == var1.musicTrackGroupId;
		}
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(ILng;ZB)V",
		garbageValue = "1"
	)
	static void method5425(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = class175.getWorldMap().getMapArea(var0);
		int var4 = class27.localPlayer.plane;
		int var5 = (class27.localPlayer.x >> 7) + class7.topLevelWorldView.baseX;
		int var6 = (class27.localPlayer.y >> 7) + class7.topLevelWorldView.baseY;
		Coord var7 = new Coord(var4, var5, var6);
		class175.getWorldMap().method10699(var3, var7, var1, var2);
	}
}
