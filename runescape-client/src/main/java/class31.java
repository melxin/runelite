import java.applet.Applet;
import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bd")
public class class31 {
	@ObfuscatedName("ay")
	static Applet field138;
	@ObfuscatedName("ah")
	static String field137;
	@ObfuscatedName("kz")
	@ObfuscatedGetter(
		intValue = -2011348113
	)
	@Export("cameraZ")
	static int cameraZ;

	static {
		field138 = null;
		field137 = "";
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "98"
	)
	static int method496(int var0, int var1) {
		FloorOverlayDefinition var3 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var0);
		FloorOverlayDefinition var2;
		if (var3 != null) {
			var2 = var3;
		} else {
			byte[] var4 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var0);
			var3 = new FloorOverlayDefinition();
			if (var4 != null) {
				var3.decode(new Buffer(var4), var0);
			}

			var3.postDecode();
			FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var3, (long)var0);
			var2 = var3;
		}

		if (var2 == null) {
			return var1;
		} else {
			int var5;
			int var6;
			if (var2.secondaryRgb >= 0) {
				var6 = class166.method3805(var2.secondaryHue, var2.secondarySaturation, var2.secondaryLightness);
				var5 = ClanSettings.method3688(var6, 96);
				return Rasterizer3D.Rasterizer3D_colorPalette[var5] | -16777216;
			} else if (var2.texture >= 0) {
				var6 = ClanSettings.method3688(Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture), 96);
				return Rasterizer3D.Rasterizer3D_colorPalette[var6] | -16777216;
			} else if (var2.primaryRgb == 16711935) {
				return var1;
			} else {
				var6 = class166.method3805(var2.hue, var2.saturation, var2.lightness);
				var5 = ClanSettings.method3688(var6, 96);
				return Rasterizer3D.Rasterizer3D_colorPalette[var5] | -16777216;
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljm;",
		garbageValue = "-70"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[var0] != null ? WorldMapElement.WorldMapElement_cached[var0] : new WorldMapElement(var0);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;ZB)Luv;",
		garbageValue = "-12"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(JagexCache.cacheDir, "preferences" + var0 + ".dat");
		if (var3.exists()) {
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L);
				return var10;
			} catch (IOException var9) {
			}
		}

		String var4 = "";
		if (class73.cacheGamebuild == 33) {
			var4 = "_rc";
		} else if (class73.cacheGamebuild == 34) {
			var4 = "_wip";
		}

		File var5 = new File(HttpContentType.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
		AccessFile var6;
		if (!var2 && var5.exists()) {
			try {
				var6 = new AccessFile(var5, "rw", 10000L);
				return var6;
			} catch (IOException var8) {
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L);
			return var6;
		} catch (IOException var7) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "-2143778245"
	)
	static int method494(int var0, Script var1, boolean var2) {
		return 2;
	}
}
