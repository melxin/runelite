import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("am")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class105 {
	@ObfuscatedName("ou")
	static int[] field86;
	@ObfuscatedName("sz")
	@ObfuscatedGetter(
		intValue = -134930549
	)
	static int field88;

	DevicePcmPlayerProvider() {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(S)Ldm;",
		garbageValue = "339"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "938449093"
	)
	public static void method328() {
		EnumComposition.EnumDefinition_cached.clear();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)D",
		garbageValue = "192801641"
	)
	public static double method332(int var0) {
		int var1 = class544.field5668[var0 & 2047];
		return (double)var1 / 65536.0D;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIILcv;B)Lrx;",
		garbageValue = "127"
	)
	static ProjectionCoord method327(int var0, int var1, int var2, int var3, WorldViewManager var4) {
		ProjectionCoord var5 = null;
		WorldView var6 = null;
		boolean var7 = var0 != 0;
		int var10;
		if (var7) {
			boolean var9 = var0 > 0;
			Object var8;
			if (var9) {
				var10 = class48.method1938(var0);
				var6 = WallDecoration.method6261(var10, var4);
				var8 = (Actor)var6.npcs.get((long)var10);
			} else {
				var10 = class27.method417(var0);
				var6 = class300.method6916(var10, var4);
				var8 = var6.method2769(var10);
			}

			if (var8 != null) {
				Coord var14 = ((Actor)var8).method2519(var6);
				ProjectionCoord var11;
				synchronized(ProjectionCoord.field5238) {
					if (ProjectionCoord.field5236 == 0) {
						var11 = new ProjectionCoord();
					} else {
						ProjectionCoord.field5238[--ProjectionCoord.field5236].method9349();
						var11 = ProjectionCoord.field5238[ProjectionCoord.field5236];
					}
				}

				var5 = var11;
				var11.x = (float)var14.x;
				var11.y = (float)var14.y;
			}
		}

		if (var5 == null) {
			var6 = var4.getWorldViewFromWorldPoint(var1, var2);
			int var15 = var1 - var6.baseX;
			int var19 = var2 - var6.baseY;
			WorldEntity var20 = (WorldEntity)var4.method2394().worldEntities.get((long)var6.id);
			if (var20 != null) {
				var5 = var20.method10509(Coord.method7679(var15), Coord.method7679(var19));
			} else {
				var5 = FaceNormal.method5848((float)Coord.method7679(var15), 0.0F, (float)Coord.method7679(var19));
			}
		}

		var10 = (int)var5.x;
		int var16 = (int)var5.y;
		int var17 = NPCComposition.getTileHeight(var6, var10, var16, var3);
		WorldEntity var13 = (WorldEntity)Occluder.topLevelWorldView.worldEntities.get((long)var6.id);
		if (var13 != null) {
			var17 += NPCComposition.getTileHeight(Occluder.topLevelWorldView, var13.getY(), var13.getPlane(), var13.getX());
		}

		var5.z = (float)var17;
		return var5;
	}
}
