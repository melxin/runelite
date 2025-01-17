import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qm")
public class class420 {
	@ObfuscatedName("wj")
	@ObfuscatedSignature(
		descriptor = "Lua;"
	)
	@Export("worldMap")
	static WorldMap worldMap;

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIB)V",
		garbageValue = "120"
	)
	@Export("playSong")
	static void playSong(ArrayList var0, int var1, int var2, int var3, int var4) {
		if (!var0.isEmpty()) {
			int var5 = (Integer)var0.get(0);
			if (var5 == -1 && !Client.playingJingle) {
				UserComparator3.method3347(0, 0);
			} else if (var5 != -1) {
				boolean var6;
				if (class333.field3626.isEmpty()) {
					var6 = false;
				} else {
					MidiRequest var7 = (MidiRequest)class333.field3626.get(0);
					var6 = var7 != null && var5 == var7.musicTrackGroupId;
				}

				if (!var6 && class544.clientPreferences.getMusicVolume() != 0) {
					ArrayList var9 = new ArrayList();

					for (int var8 = 0; var8 < var0.size(); ++var8) {
						var9.add(new MidiRequest(class544.archive6, (Integer)var0.get(var8), 0, class544.clientPreferences.getMusicVolume(), false));
					}

					if (Client.playingJingle) {
						class220.method4973(var9, var1, var2, var3, var4);
					} else {
						class1.method9(var9, var1, var2, var3, var4, false);
					}
				}
			}

		}
	}
}
