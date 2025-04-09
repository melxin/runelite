import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("id")
public class class212 {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	public UrlRequest field2418;
	@ObfuscatedName("an")
	public float[] field2419;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	final class222 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lig;)V"
	)
	class212(class222 var1) {
		this.this$0 = var1;
		this.field2419 = new float[4];
	}

	@ObfuscatedName("an")
	static boolean method4782(long var0) {
		int var2 = (int)(var0 >>> 16 & 7L);
		return var2 == 2;
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "1876396716"
	)
	static void method4780(int var0, int var1, int var2, int var3, int var4) {
		NodeDeque var5 = DevicePcmPlayerProvider.worldView.groundItems[var0][var1][var2];
		if (var5 != null) {
			for (TileItem var6 = (TileItem)var5.last(); var6 != null; var6 = (TileItem)var5.previous()) {
				if ((var3 & 32767) == var6.id && var4 == var6.quantity) {
					var6.method2979();
					break;
				}
			}

			WorldMapCacheName.updateItemPile(var0, var1, var2);
		}

	}

	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "30113021"
	)
	@Export("setMusicVolume")
	static final void setMusicVolume(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255);
		if (var0 != Renderable.clientPreferences.getMusicVolume()) {
			label26: {
				if (Renderable.clientPreferences.getMusicVolume() == 0) {
					boolean var1 = !class335.field3698.isEmpty();
					if (var1) {
						class230.method5022(class133.field1576, var0);
						Client.playingJingle = false;
						break label26;
					}
				}

				if (var0 == 0) {
					MenuAction.method2254(0, 0);
					Client.playingJingle = false;
				} else {
					MusicPatch.method6825(var0);
				}
			}

			Renderable.clientPreferences.updateMusicVolume(var0);
		}

	}
}
