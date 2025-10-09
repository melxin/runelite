import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lw")
@Implements("WorldMapAreaData")
public class WorldMapAreaData extends WorldMapArea {
	@ObfuscatedName("as")
	HashSet field3512;
	@ObfuscatedName("ar")
	HashSet field3510;
	@ObfuscatedName("az")
	@Export("iconList")
	List iconList;

	WorldMapAreaData() {
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(Lwj;Lwj;IZI)V",
		garbageValue = "154569671"
	)
	void method6928(Buffer var1, Buffer var2, int var3, boolean var4) {
		this.method6483(var1, var3);
		int var5 = var2.readUnsignedShort();
		this.field3512 = new HashSet(var5);

		int var6;
		for (var6 = 0; var6 < var5; ++var6) {
			WorldMapData_0 var7 = new WorldMapData_0();

			try {
				var7.init(var2);
			} catch (IllegalStateException var12) {
				continue;
			}

			this.field3512.add(var7);
		}

		var6 = var2.readUnsignedShort();
		this.field3510 = new HashSet(var6);

		for (int var10 = 0; var10 < var6; ++var10) {
			WorldMapData_1 var8 = new WorldMapData_1();

			try {
				var8.init(var2);
			} catch (IllegalStateException var11) {
				continue;
			}

			this.field3510.add(var8);
		}

		this.initIconsList(var2, var4);
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(Lwj;ZI)V",
		garbageValue = "379518741"
	)
	@Export("initIconsList")
	void initIconsList(Buffer var1, boolean var2) {
		this.iconList = new LinkedList();
		int var3 = var1.readUnsignedShort();

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = var1.readNullableLargeSmart();
			Coord var6 = new Coord(var1.method11575());
			boolean var7 = var1.readUnsignedByte() == 1;
			if (var2 || !var7) {
				this.iconList.add(new WorldMapIcon_0((Coord)null, var6, var5, (WorldMapLabel)null));
			}
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([I[II)V",
		garbageValue = "-539465048"
	)
	public static void method6927(int[] var0, int[] var1) {
		if (var0 != null && var1 != null) {
			WorldMapDecoration.ByteArrayPool_alternativeSizes = var0;
			class159.ByteArrayPool_altSizeArrayCounts = new int[var0.length];
			AbstractWorldMapData.ByteArrayPool_arrays = new byte[var0.length][][];

			for (int var2 = 0; var2 < WorldMapDecoration.ByteArrayPool_alternativeSizes.length; ++var2) {
				AbstractWorldMapData.ByteArrayPool_arrays[var2] = new byte[var1[var2]][];
				ByteArrayPool.field5382.add(var0[var2]);
			}

			Collections.sort(ByteArrayPool.field5382);
		} else {
			WorldMapDecoration.ByteArrayPool_alternativeSizes = null;
			class159.ByteArrayPool_altSizeArrayCounts = null;
			AbstractWorldMapData.ByteArrayPool_arrays = null;
			ByteArrayPool.field5382.clear();
			ByteArrayPool.field5382.add(100);
			ByteArrayPool.field5382.add(5000);
			ByteArrayPool.field5382.add(10000);
			ByteArrayPool.field5382.add(30000);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	public static boolean method6932() {
		return !class338.field3891.isEmpty();
	}
}
