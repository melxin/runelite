import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gf")
public class class180 extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("field1851")
	public static EvictingDualNodeHashTable field1851;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1032300371
	)
	static int field1867;

	static {
		field1851 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Lik;",
		garbageValue = "11"
	)
	public static FloorOverlayDefinition method3751(int var0) {
		FloorOverlayDefinition var1 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var0);
			var1 = new FloorOverlayDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode();
			FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "164650468"
	)
	static final int method3752(int var0, int var1, int var2, int var3) {
		return var3 * var0 + var2 * var1 >> 16;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-1723134208"
	)
	@Export("ByteArrayPool_release")
	public static void ByteArrayPool_release(byte[] var0) {
		synchronized(ByteArrayPool.field4897) {
			if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field4895) {
				ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0;
			} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field4907) {
				ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0;
			} else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field4908) {
				ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0;
			} else if (var0.length == 30000 && ByteArrayPool.field4910 < ByteArrayPool.field4905) {
				ByteArrayPool.field4909[++ByteArrayPool.field4910 - 1] = var0;
			} else {
				if (ByteArrayPool.ByteArrayPool_arrays != null) {
					for (int var2 = 0; var2 < HealthBarDefinition.ByteArrayPool_alternativeSizes.length; ++var2) {
						if (var0.length == HealthBarDefinition.ByteArrayPool_alternativeSizes[var2] && class201.ByteArrayPool_altSizeArrayCounts[var2] < ByteArrayPool.ByteArrayPool_arrays[var2].length) {
							ByteArrayPool.ByteArrayPool_arrays[var2][class201.ByteArrayPool_altSizeArrayCounts[var2]++] = var0;
							return;
						}
					}
				}

			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Lcu;",
		garbageValue = "-797885631"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0;
		return WorldMapArea.getNextWorldListWorld();
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(Ldm;IIIIIIIIIII)V",
		garbageValue = "1462560549"
	)
	static void method3754(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		NodeDeque var11 = var0.pendingSpawns;
		PendingSpawn var12 = null;

		for (PendingSpawn var13 = (PendingSpawn)var11.last(); var13 != null; var13 = (PendingSpawn)var11.previous()) {
			if (var13.plane == var1 && var2 == var13.x && var3 == var13.y && var4 == var13.type) {
				var12 = var13;
				break;
			}
		}

		if (var12 == null) {
			var12 = new PendingSpawn();
			var12.plane = var1;
			var12.type = var4;
			var12.x = var2;
			var12.y = var3;
			var12.field1189 = -1;
			class7.method65(var0, var12);
			var11.addFirst(var12);
		}

		var12.field1191 = var5;
		var12.field1182 = var6;
		var12.field1187 = var7;
		var12.delay = var9;
		var12.hitpoints = var10;
		var12.method2632(var8);
	}
}
