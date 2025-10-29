import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lx")
public class class311 {
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Lxm;"
	)
	static IndexedSprite field3509;

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(FI)I",
		garbageValue = "-143527022"
	)
	public static int method7022(float var0) {
		return (int)((double)var0 / 6.283185307179586D * 2048.0D) & 2047;
	}

	@ObfuscatedName("aj")
	public static int method7028(long var0) {
		int var2 = (int)(var0 >>> 52 & 4095L);
		if ((long)var2 == 4095L) {
			var2 = -1;
		}

		return var2;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(ILoj;ZB)V",
		garbageValue = "-67"
	)
	static void method7030(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = class455.getWorldMap().getMapArea(var0);
		int var4 = class330.localPlayer.plane;
		int var5 = (class330.localPlayer.x >> 7) + Occluder.topLevelWorldView.baseX;
		int var6 = (class330.localPlayer.y >> 7) + Occluder.topLevelWorldView.baseY;
		Coord var7 = new Coord(var4, var5, var6);
		class455.getWorldMap().method11111(var3, var7, var1, var2);
	}
}
