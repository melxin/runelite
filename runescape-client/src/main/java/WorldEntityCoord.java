import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kb")
@Implements("WorldEntityCoord")
public class WorldEntityCoord {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 459733525
	)
	@Export("currentRotationAngle")
	int currentRotationAngle;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -639471049
	)
	@Export("x")
	int x;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -430111663
	)
	@Export("y")
	int y;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -179609957
	)
	@Export("z")
	int z;

	public WorldEntityCoord() {
		this.currentRotationAngle = 0;
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2041651233"
	)
	@Export("getX")
	public int getX() {
		return this.x;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-518611141"
	)
	@Export("getZ")
	public int getZ() {
		return this.z;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "869849026"
	)
	@Export("getY")
	public int getY() {
		return this.y;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "65"
	)
	@Export("getTileX")
	public int getTileX() {
		return this.x >> 7;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("getTileY")
	public int getTileY() {
		return this.y >> 7;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1346356962"
	)
	@Export("getCurrentRotationAngle")
	public int getCurrentRotationAngle() {
		return this.currentRotationAngle;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2055300902"
	)
	@Export("setCurrentRotationAngle")
	public void setCurrentRotationAngle(int var1) {
		this.currentRotationAngle = var1 & 2047;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lkb;I)V",
		garbageValue = "1531022422"
	)
	public void method6455(WorldEntityCoord var1) {
		this.currentRotationAngle = var1.currentRotationAngle;
		this.x = var1.x;
		this.z = var1.z;
		this.y = var1.y;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2130198545"
	)
	public void method6487(int var1, int var2) {
		this.x = var1;
		this.y = var2;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-36"
	)
	@Export("setZ")
	public void setZ(int var1) {
		this.z = var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1161831867"
	)
	@Export("setDirection")
	public void setDirection(int var1, int var2) {
		this.x += var1;
		this.y += var2;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-11"
	)
	public void method6459(int var1, int var2, int var3, int var4) {
		this.x += var1;
		this.z += var2;
		this.y += var3;
		this.setCurrentRotationAngle(var4 + this.currentRotationAngle);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lkb;B)Z",
		garbageValue = "1"
	)
	boolean method6461(WorldEntityCoord var1) {
		return this.x == var1.x && this.z == var1.z && this.y == var1.y && this.currentRotationAngle == var1.currentRotationAngle;
	}

	public String toString() {
		return this.x + ", " + this.z + ", " + this.y + ", " + this.currentRotationAngle;
	}

	public boolean equals(Object var1) {
		return var1 instanceof WorldEntityCoord ? this.method6461((WorldEntityCoord)var1) : false;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([BB)Llu;",
		garbageValue = "1"
	)
	static WorldMapSprite method6466(byte[] var0) {
		if (var0 == null) {
			return new WorldMapSprite();
		} else {
			SpritePixels var1 = class201.readSpritePixelsFromBytes(var0);
			return var1 == null ? new WorldMapSprite() : new WorldMapSprite(var1.pixels);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "1715908378"
	)
	static boolean method6506(String var0) {
		if (var0 == null) {
			return false;
		} else {
			try {
				new URL(var0);
				return true;
			} catch (MalformedURLException var2) {
				return false;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IZB)[B",
		garbageValue = "43"
	)
	@Export("ByteArrayPool_getArrayBool")
	public static byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		synchronized(ByteArrayPool.field5408) {
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

			if ((var0 == 30000 || var0 < 30000 && var1) && ByteArrayPool.field5403 > 0) {
				var3 = ByteArrayPool.field5411[--ByteArrayPool.field5403];
				ByteArrayPool.field5411[ByteArrayPool.field5403] = null;
				return var3;
			}

			int var6;
			if (ByteArrayPool.ByteArrayPool_arrays != null) {
				for (var6 = 0; var6 < class451.ByteArrayPool_alternativeSizes.length; ++var6) {
					if ((class451.ByteArrayPool_alternativeSizes[var6] == var0 || var0 < class451.ByteArrayPool_alternativeSizes[var6] && var1) && class70.ByteArrayPool_altSizeArrayCounts[var6] > 0) {
						byte[] var4 = ByteArrayPool.ByteArrayPool_arrays[var6][--class70.ByteArrayPool_altSizeArrayCounts[var6]];
						ByteArrayPool.ByteArrayPool_arrays[var6][class70.ByteArrayPool_altSizeArrayCounts[var6]] = null;
						return var4;
					}
				}
			}

			if (var1 && class451.ByteArrayPool_alternativeSizes != null) {
				for (var6 = 0; var6 < class451.ByteArrayPool_alternativeSizes.length; ++var6) {
					if (var0 <= class451.ByteArrayPool_alternativeSizes[var6] && class70.ByteArrayPool_altSizeArrayCounts[var6] < ByteArrayPool.ByteArrayPool_arrays[var6].length) {
						return new byte[class451.ByteArrayPool_alternativeSizes[var6]];
					}
				}
			}
		}

		return new byte[var0];
	}
}
