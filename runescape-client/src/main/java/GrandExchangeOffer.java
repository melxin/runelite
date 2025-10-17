import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qe")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	@Export("cameraViewMode")
	static CameraViewMode cameraViewMode;
	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	@Export("archive6")
	static Archive archive6;
	@ObfuscatedName("ol")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;
	@ObfuscatedName("ab")
	@Export("state")
	byte state;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1703342093
	)
	@Export("id")
	public int id;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 173530249
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1735180909
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1967616203
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -2114010975
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	}

	@ObfuscatedSignature(
		descriptor = "(Lwj;Z)V",
		garbageValue = "0"
	)
	public GrandExchangeOffer(Buffer var1, boolean var2) {
		this.state = var1.readByte();
		this.id = var1.readUnsignedShort();
		this.unitPrice = var1.readInt();
		this.totalQuantity = var1.readInt();
		this.currentQuantity = var1.readInt();
		this.currentPrice = var1.readInt();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1260221455"
	)
	@Export("status")
	public int status() {
		return this.state & 7;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "412940218"
	)
	void method8584(int var1) {
		this.state &= -8;
		this.state = (byte)(this.state | var1 & 7);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "964862542"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1808823396"
	)
	void method8585(int var1) {
		this.state &= -9;
		if (var1 == 1) {
			this.state = (byte)(this.state | 8);
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IZB)[B",
		garbageValue = "121"
	)
	@Export("ByteArrayPool_getArrayBool")
	public static byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		synchronized(ByteArrayPool.field5369) {
			byte[] var3;
			if ((var0 == 100 || var0 < 100 && var1) && ByteArrayPool.ByteArrayPool_smallCount > 0) {
				var3 = ByteArrayPool.ByteArrayPool_small[--ByteArrayPool.ByteArrayPool_smallCount];
				ByteArrayPool.ByteArrayPool_small[ByteArrayPool.ByteArrayPool_smallCount] = null;
				return var3;
			}

			if ((var0 == 5000 || var0 < 5000 && var1) && ByteArrayPool.ByteArrayPool_mediumCount > 0) {
				var3 = ByteArrayPool.ByteArrayPool_medium[--ByteArrayPool.ByteArrayPool_mediumCount];
				ByteArrayPool.ByteArrayPool_medium[ByteArrayPool.ByteArrayPool_mediumCount] = null;
				return var3;
			}

			if ((var0 == 10000 || var0 < 10000 && var1) && ByteArrayPool.ByteArrayPool_largeCount > 0) {
				var3 = ByteArrayPool.ByteArrayPool_large[--ByteArrayPool.ByteArrayPool_largeCount];
				ByteArrayPool.ByteArrayPool_large[ByteArrayPool.ByteArrayPool_largeCount] = null;
				return var3;
			}

			if ((var0 == 30000 || var0 < 30000 && var1) && ByteArrayPool.field5383 > 0) {
				var3 = ByteArrayPool.field5381[--ByteArrayPool.field5383];
				ByteArrayPool.field5381[ByteArrayPool.field5383] = null;
				return var3;
			}

			int var6;
			if (AbstractWorldMapData.ByteArrayPool_arrays != null) {
				for (var6 = 0; var6 < WorldMapDecoration.ByteArrayPool_alternativeSizes.length; ++var6) {
					if ((WorldMapDecoration.ByteArrayPool_alternativeSizes[var6] == var0 || var0 < WorldMapDecoration.ByteArrayPool_alternativeSizes[var6] && var1) && class159.ByteArrayPool_altSizeArrayCounts[var6] > 0) {
						byte[] var4 = AbstractWorldMapData.ByteArrayPool_arrays[var6][--class159.ByteArrayPool_altSizeArrayCounts[var6]];
						AbstractWorldMapData.ByteArrayPool_arrays[var6][class159.ByteArrayPool_altSizeArrayCounts[var6]] = null;
						return var4;
					}
				}
			}

			if (var1 && WorldMapDecoration.ByteArrayPool_alternativeSizes != null) {
				for (var6 = 0; var6 < WorldMapDecoration.ByteArrayPool_alternativeSizes.length; ++var6) {
					if (var0 <= WorldMapDecoration.ByteArrayPool_alternativeSizes[var6] && class159.ByteArrayPool_altSizeArrayCounts[var6] < AbstractWorldMapData.ByteArrayPool_arrays[var6].length) {
						return new byte[WorldMapDecoration.ByteArrayPool_alternativeSizes[var6]];
					}
				}
			}
		}

		return new byte[var0];
	}
}
