import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pb")
public class class408 {
	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(I)Luu;",
		garbageValue = "1999707647"
	)
	@Export("getPlatformInfo")
	static PlatformInfo getPlatformInfo() {
		return WorldMapAreaData.platformInfo;
	}

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "0"
	)
	static boolean method7863(int var0, int var1) {
		if (var1 >= 2000) {
			var1 -= 2000;
		}

		class503 var2 = Client.worldViewManager.method2579(var0);
		boolean var3 = var0 == -1;
		boolean var4 = var0 == Client.field530;
		boolean var5 = true;
		boolean var6 = var1 == 1 || var1 == 2 || var1 >= 3 && var1 <= 6 || var1 == 1001;
		if (var6 && !var2.method9546(var5, var3, var4)) {
			return false;
		} else {
			boolean var7 = var1 == 16 || var1 == 17 || var1 >= 18 && var1 <= 22;
			if (var7 && !var2.method9533(var5, var3, var4)) {
				return false;
			} else if (GrandExchangeOfferTotalQuantityComparator.method7841(var1) && !var2.method9534(var5, var3, var4)) {
				return false;
			} else if (class329.method6565(var1) && !var2.method9559(var5, var3, var4)) {
				return false;
			} else if (var1 == 1002 && !var2.method9536(var5, var3, var4)) {
				return false;
			} else if (var1 == 1004 && !var2.method9535(var5, var3, var4)) {
				return false;
			} else {
				return var1 != 1003 || var2.method9538(var5, var3, var4);
			}
		}
	}
}
