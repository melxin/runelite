import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("am")
@Implements("HttpRequestTask")
public class HttpRequestTask implements Callable {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lae;"
	)
	final HttpRequest field78;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	final AsyncRestClient this$0;

	@ObfuscatedSignature(
		descriptor = "(Laj;Lae;)V"
	)
	HttpRequestTask(AsyncRestClient var1, HttpRequest var2) {
		this.this$0 = var1;
		this.field78 = var2;
	}

	public Object call() throws Exception {
		try {
			while (this.field78.connect()) {
				IntProjection.method4837(10L);
			}
		} catch (IOException var2) {
			return new HttpResponse("Error servicing REST query: " + var2.getMessage());
		}

		return this.field78.getResponse();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "822542457"
	)
	static void method246() {
		Tiles.Tiles_minPlane = 99;
		Tiles.Tiles_underlays = new short[4][104][104];
		Tiles.Tiles_overlays = new short[4][104][104];
		Tiles.Tiles_shapes = new byte[4][104][104];
		Tiles.field1047 = new byte[4][104][104];
		Canvas.field98 = new int[4][105][105];
		SpriteMask.Tiles_underlays2 = new byte[4][105][105];
		SecureUrlRequester.field1506 = new int[105][105];
		Tiles.Tiles_hue = new int[104];
		class592.Tiles_saturation = new int[104];
		class447.Tiles_lightness = new int[104];
		class330.Tiles_hueMultiplier = new int[104];
		BoundaryObject.field3005 = new int[104];
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-354962834"
	)
	public static void method248() {
		FileSystem.FileSystem_cacheFiles.clear();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIIZIII)J",
		garbageValue = "1486707715"
	)
	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4, int var5) {
		long var6 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 7) << 14) | ((long)var4 & 4294967295L) << 18 | ((long)var5 & 4095L) << 50;
		if (var3) {
			var6 |= 131072L;
		}

		return var6;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfb;",
		garbageValue = "50"
	)
	static class144 method249(int var0) {
		class144 var2 = class144.method3421(var0);
		int var1;
		if (var2 == null) {
			var1 = 2;
		} else {
			var1 = var2.method3412() ? 0 : 1;
		}

		return var1 != 0 ? null : class144.method3421(var0);
	}
}
