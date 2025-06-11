import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
@Implements("Occluder")
public final class Occluder {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 816384273
	)
	@Export("minTileX")
	int minTileX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -2091436435
	)
	@Export("maxTileX")
	int maxTileX;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1852592145
	)
	@Export("minTileY")
	int minTileY;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1820169973
	)
	@Export("maxTileY")
	int maxTileY;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1331328991
	)
	@Export("type")
	int type;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1374143025
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1972784621
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 452147745
	)
	@Export("minZ")
	int minZ;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1059324173
	)
	@Export("maxZ")
	int maxZ;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1551491285
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1000244801
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -872690365
	)
	int field2834;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 147162171
	)
	int field2840;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -336856085
	)
	int field2836;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1275756799
	)
	int field2832;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 736361721
	)
	int field2838;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 963175755
	)
	int field2839;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -413749797
	)
	int field2830;

	Occluder() {
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "163644096"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		int var2 = var1.readUnsignedByte();
		int var3 = var1.readInt();
		if (var3 < 0 || AbstractArchive.field4752 != 0 && var3 > AbstractArchive.field4752) {
			throw new RuntimeException();
		} else if (var2 == 0) {
			byte[] var6 = new byte[var3];
			var1.readBytes(var6, 0, var3);
			return var6;
		} else {
			int var4 = var1.readInt();
			if (var4 >= 0 && (AbstractArchive.field4752 == 0 || var4 <= AbstractArchive.field4752)) {
				byte[] var5 = new byte[var4];
				if (var2 == 1) {
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5);
				}

				return var5;
			} else {
				throw new RuntimeException();
			}
		}
	}

	@ObfuscatedName("mg")
	@ObfuscatedSignature(
		descriptor = "(Lov;IIZI)V",
		garbageValue = "-431005857"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width * -1805166981;
		int var5 = var0.height * -2133353239;
		if (var0.widthAlignment == 0) {
			var0.width = var0.rawWidth * -352773965;
		} else if (var0.widthAlignment == 1) {
			var0.width = (var1 - var0.rawWidth) * -352773965;
		} else if (var0.widthAlignment == 2) {
			var0.width = (var0.rawWidth * var1 >> 14) * -352773965;
		}

		if (var0.heightAlignment == 0) {
			var0.height = var0.rawHeight * -1251804327;
		} else if (var0.heightAlignment == 1) {
			var0.height = (var2 - var0.rawHeight) * -1251804327;
		} else if (var0.heightAlignment == 2) {
			var0.height = (var2 * var0.rawHeight >> 14) * -1251804327;
		}

		if (var0.widthAlignment == 4) {
			var0.width = var0.field3997 * var0.height * -2133353239 / var0.field3998 * -352773965;
		}

		if (var0.heightAlignment == 4) {
			var0.height = var0.field3998 * var0.width * -1805166981 / var0.field3997 * -1251804327;
		}

		if (var0.contentType == 1337) {
			Client.viewportWidget = var0;
		}

		if (var0.type == 12) {
			var0.method7755().method7406(var0.width * -1805166981, var0.height * -2133353239);
		}

		if (var3 && var0.onResize != null && (var4 != var0.width * -1805166981 || var5 != var0.height * -2133353239)) {
			ScriptEvent var6 = new ScriptEvent();
			var6.widget = var0;
			var6.args = var0.onResize;
			Client.scriptEvents.addFirst(var6);
		}

	}
}
