import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("go")
public class class172 {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 697366175
	)
	static int field1931;
	@ObfuscatedName("qm")
	@ObfuscatedGetter(
		intValue = 27881281
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IZIZB)V",
		garbageValue = "-89"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (World.World_worlds != null) {
			RestClientThreadFactory.doWorldSorting(0, World.World_worlds.length - 1, var0, var1, var2, var3);
		}

	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)Z",
		garbageValue = "1"
	)
	static boolean method4086(int var0, int var1, int var2, int var3, int var4, int var5) {
		return ClientPacket.method7038(HttpHeaders.worldView.plane, var0, var1, var2, var3, var4, var5);
	}
}
