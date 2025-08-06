import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bl")
public class class36 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	@Export("reflectionChecks")
	public static IterableNodeDeque reflectionChecks;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "[Lxa;"
	)
	@Export("runesSprite")
	static IndexedSprite[] runesSprite;
	@ObfuscatedName("gn")
	@ObfuscatedGetter(
		intValue = -764808697
	)
	static int field225;
	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	static StudioGame field227;
	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("archive13")
	static Archive archive13;

	static {
		reflectionChecks = new IterableNodeDeque();
	}

	@ObfuscatedName("pg")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	static void method752() {
		if (Client.field541 && class27.localPlayer != null) {
			int var0 = class27.localPlayer.pathX[0];
			int var1 = class27.localPlayer.pathY[0];
			if (var0 < 0 || 104 <= var0 || var1 < 0 || 104 <= var1) {
				return;
			}

			class28.oculusOrbFocalPointX = class27.localPlayer.x;
			int var2 = class477.getTileHeight(class7.topLevelWorldView, class27.localPlayer.x, class27.localPlayer.y, class7.topLevelWorldView.plane) - Client.camFollowHeight;
			if (var2 < ClanChannelMember.oculusOrbFocalPointZ) {
				ClanChannelMember.oculusOrbFocalPointZ = var2;
			}

			MusicPatch.oculusOrbFocalPointY = class27.localPlayer.y;
			Client.field541 = false;
		}

	}
}
