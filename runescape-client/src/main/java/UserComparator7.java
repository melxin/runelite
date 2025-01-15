import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
@Implements("UserComparator7")
public class UserComparator7 extends AbstractUserComparator {
	@ObfuscatedName("ay")
	@Export("reversed")
	final boolean reversed;

	public UserComparator7(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lsu;Lsu;I)I",
		garbageValue = "796003130"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) {
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lpq;Lpq;IZI)Lfl;",
		garbageValue = "201102891"
	)
	public static class144 method3330(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true;
		byte[] var5 = var0.getFile(var2 >> 16 & 65535, var2 & 65535);
		if (var5 == null) {
			var4 = false;
			return null;
		} else {
			int var6 = (var5[1] & 255) << 8 | var5[2] & 255;
			byte[] var7;
			if (var3) {
				var7 = var1.getFile(0, var6);
			} else {
				var7 = var1.getFile(var6, 0);
			}

			if (var7 == null) {
				var4 = false;
			}

			if (!var4) {
				return null;
			} else {
				if (WorldMapID.field3245 == null) {
					class142.field1631 = Runtime.getRuntime().availableProcessors();
					WorldMapID.field3245 = new ThreadPoolExecutor(0, class142.field1631, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(class142.field1631 * 100 + 100), new class141());
				}

				try {
					return new class144(var0, var1, var2, var3);
				} catch (Exception var9) {
					return null;
				}
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-109"
	)
	static void method3331() {
		SecureRandomCallable.Tiles_underlays = null;
		SecureRandomFuture.Tiles_overlays = null;
		Tiles.Tiles_shapes = null;
		Tiles.field1026 = null;
		class538.field5380 = null;
		Tiles.Tiles_underlays2 = null;
		WorldMapID.field3244 = null;
		InvDefinition.Tiles_hue = null;
		Tiles.Tiles_saturation = null;
		Tiles.Tiles_lightness = null;
		class4.Tiles_hueMultiplier = null;
		class557.field5476 = null;
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIIIIII)V",
		garbageValue = "853514196"
	)
	static void method3332(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
		var1 = var1 * 128 + 64;
		var2 = var2 * 128 + 64;
		var3 = var3 * 128 + 64;
		var4 = var4 * 128 + 64;
		Projectile var14 = new Projectile(var6, var0, var1, var2, Canvas.getTileHeight(class30.worldView, var1, var2, var0) - var7, var9 + Client.cycle, var10 + Client.cycle, var11, var12, var13, var5, var8);
		var14.setDestination(var3, var4, Canvas.getTileHeight(class30.worldView, var3, var4, var0) - var8, var9 + Client.cycle);
		class30.worldView.projectiles.addFirst(var14);
	}
}
