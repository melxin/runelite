import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hq")
@Implements("AABB")
public class AABB {
	@ObfuscatedName("sy")
	@ObfuscatedGetter(
		intValue = 278861595
	)
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1648127823
	)
	@Export("orientation")
	final int orientation;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -175871675
	)
	@Export("xMid")
	int xMid;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 354217903
	)
	@Export("yMid")
	int yMid;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 620147901
	)
	@Export("zMid")
	int zMid;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1000135391
	)
	@Export("xMidOffset")
	int xMidOffset;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -2090029763
	)
	@Export("yMidOffset")
	int yMidOffset;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1835153565
	)
	@Export("zMidOffset")
	int zMidOffset;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	@Export("aabb")
	AABB aabb;

	AABB(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.orientation = var1;
		this.xMid = var2;
		this.yMid = var3;
		this.zMid = var4;
		this.xMidOffset = var5;
		this.yMidOffset = var6;
		this.zMidOffset = var7;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1648277883"
	)
	@Export("clearItemContainer")
	static void clearItemContainer(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.ids.length; ++var2) {
				var1.ids[var2] = -1;
				var1.quantities[var2] = 0;
			}

		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "240537341"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		int var2 = var1.readUnsignedByte();
		int var3 = var1.readInt();
		if (var3 < 0 || AbstractArchive.field4735 != 0 && var3 > AbstractArchive.field4735) {
			throw new RuntimeException();
		} else if (var2 == 0) {
			byte[] var6 = new byte[var3];
			var1.readBytes(var6, 0, var3);
			return var6;
		} else {
			int var4 = var1.readInt();
			if (var4 >= 0 && (AbstractArchive.field4735 == 0 || var4 <= AbstractArchive.field4735)) {
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

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(Ldj;Ldu;IILkw;B)V",
		garbageValue = "3"
	)
	static final void method4317(WorldView var0, Player var1, int var2, int var3, MoveSpeed var4) {
		int var5 = var1.pathX[0];
		int var6 = var1.pathY[0];
		int var7 = var1.size * -145616896;
		CollisionMap var8 = var0.collisionMaps[var0.plane];
		if (var5 >= var7 && var5 < var8.xSize - var7 && var6 >= var7 && var6 < var8.ySize - var7) {
			if (var2 >= var7 && var2 < var8.xSize - var7 && var3 >= var7 && var3 < var8.ySize - var7) {
				class278 var9 = Client.field501;
				Client.field508.approxDestinationX = var2;
				Client.field508.approxDestinationY = var3;
				Client.field508.approxDestinationSizeX = 1;
				Client.field508.approxDestinationSizeY = 1;
				ApproximateRouteStrategy var13 = Client.field508;
				int var14 = var9.method5858(var5, var6, var7, var13, var8, true, Client.field795, Client.field796);
				if (var14 >= 1) {
					for (int var15 = 0; var15 < var14 - 1; ++var15) {
						var1.method2639(Client.field795[var15], Client.field796[var15], var4);
					}

				}
			}
		}
	}
}
