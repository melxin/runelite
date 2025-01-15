import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dg")
public class class88 {
	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static Archive field1069;

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(ILnz;ZB)V",
		garbageValue = "32"
	)
	static void method2612(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = Canvas.getWorldMap().getMapArea(var0);
		int var4 = ModeWhere.localPlayer.plane;
		int var5 = (ModeWhere.localPlayer.x >> 7) + GameEngine.topLevelWorldView.baseX;
		int var6 = (ModeWhere.localPlayer.y >> 7) + GameEngine.topLevelWorldView.baseY;
		Coord var7 = new Coord(var4, var5, var6);
		Canvas.getWorldMap().method9736(var3, var7, var1, var2);
	}
}
