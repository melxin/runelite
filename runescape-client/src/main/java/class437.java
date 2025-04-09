import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qy")
public final class class437 {
	@ObfuscatedName("ao")
	@Export("base37Table")
	public static final char[] base37Table;
	@ObfuscatedName("an")
	static long[] field4897;

	static {
		base37Table = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		field4897 = new long[12];

		for (int var0 = 0; var0 < field4897.length; ++var0) {
			field4897[var0] = (long)Math.pow(37.0D, (double)var0);
		}

	}

	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "(ILsq;Ldj;I)I",
		garbageValue = "-1831554485"
	)
	static int method8290(int var0, WorldEntity var1, WorldView var2) {
		int var3 = -1;
		if (var0 == Client.field530) {
			var3 = var2.plane;
		} else if (Client.field530 == -1) {
			var3 = var1.field5163.method5312();
		} else {
			WorldEntity var4 = (WorldEntity)class509.topLevelWorldView.worldEntities.get((long)Client.field530);
			WorldView var5 = var4.worldView;
			if (var5.plane == var4.field5163.method5312()) {
				if (var0 == -1) {
					var3 = ((WorldEntity)class509.topLevelWorldView.worldEntities.get((long)Client.field530)).getX();
				} else {
					var3 = var1.field5163.method5312();
				}
			}
		}

		return var3;
	}
}
