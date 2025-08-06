import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("br")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	@ObfuscatedName("ak")
	@Export("osName")
	static String osName;

	ApproximateRouteStrategy() {
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIILkp;I)Z",
		garbageValue = "219160773"
	)
	@Export("hasArrived")
	protected boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([BZI)Ljava/lang/Object;",
		garbageValue = "1225489723"
	)
	public static Object method802(byte[] var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0.length > 136) {
			DirectByteArrayCopier var2 = new DirectByteArrayCopier();
			var2.set(var0);
			return var2;
		} else {
			return var0;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-614220235"
	)
	public static int method801(int var0) {
		return var0 >>> 4 & class576.field5746;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(ILce;ZB)I",
		garbageValue = "-37"
	)
	static int method792(int var0, Script var1, boolean var2) {
		return 2;
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-78"
	)
	static final void method800() {
		int var0;
		int var1;
		int var2;
		if (!Client.field380) {
			var0 = Coord.method7396(WorldViewManager.field1000);
			var1 = Coord.method7396(WorldMapSectionType.field3343);
			var2 = class477.method9725(class7.topLevelWorldView, var0, var1, class7.topLevelWorldView.plane) - class329.field3728;
			FileSystem.method5914(var0, var2, var1);
		} else if (Client.field568 != null) {
			Language.cameraX = Client.field568.vmethod10662();
			class66.cameraZ = Client.field568.vmethod10660();
			if (Client.field567) {
				WorldMapCacheName.cameraY = Client.field568.vmethod10654();
			} else {
				WorldMapCacheName.cameraY = class477.method9725(class7.topLevelWorldView, Language.cameraX, class66.cameraZ, class7.topLevelWorldView.plane) - Client.field568.vmethod10654();
			}

			Client.field568.method10669();
		}

		if (!Client.field347) {
			var0 = Coord.method7396(Sound.field1791);
			var1 = Coord.method7396(ClanChannel.field1892);
			var2 = class477.method9725(class7.topLevelWorldView, var0, var1, class7.topLevelWorldView.plane) - WorldMapElement.field1981;
			int var3 = var0 - Language.cameraX;
			int var4 = var2 - WorldMapCacheName.cameraY;
			int var5 = var1 - class66.cameraZ;
			int var6 = (int)Math.sqrt((double)(var3 * var3 + var5 * var5));
			int var7 = (int)(Math.atan2((double)var4, (double)var6) * 325.9490051269531D) & 2047;
			int var8 = (int)(Math.atan2((double)var3, (double)var5) * -325.9490051269531D) & 2047;
			class374.method8116(var7, var8);
		} else {
			if (Client.field570 != null) {
				class187.cameraPitch = Client.field570.method10650();
				class187.cameraPitch = Math.min(Math.max(class187.cameraPitch, 128), 383);
				Client.field570.method10669();
			}

			if (Client.field569 != null) {
				class28.cameraYaw = Client.field569.method10650() & 2047;
				Client.field569.method10669();
			}
		}

	}

	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "5"
	)
	static final void method791(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0;
		int var7 = var3 - var1;
		int var8 = var6 >= 0 ? var6 : -var6;
		int var9 = var7 >= 0 ? var7 : -var7;
		int var10 = var8;
		if (var8 < var9) {
			var10 = var9;
		}

		if (var10 != 0) {
			int var11 = (var6 << 16) / var10;
			int var12 = (var7 << 16) / var10;
			if (var12 <= var11) {
				var11 = -var11;
			} else {
				var12 = -var12;
			}

			int var13 = var5 * var12 >> 17;
			int var14 = var5 * var12 + 1 >> 17;
			int var15 = var5 * var11 >> 17;
			int var16 = var5 * var11 + 1 >> 17;
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart;
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart;
			int var17 = var0 + var13;
			int var18 = var0 - var14;
			int var19 = var0 + var6 - var14;
			int var20 = var0 + var6 + var13;
			int var21 = var15 + var1;
			int var22 = var1 - var16;
			int var23 = var7 + var1 - var16;
			int var24 = var15 + var7 + var1;
			Rasterizer3D.setClipping(var17, var18, var19);
			Rasterizer3D.method4977((float)var21, (float)var22, (float)var23, (float)var17, (float)var18, (float)var19, 0.0F, 0.0F, 0.0F, var4);
			Rasterizer3D.setClipping(var17, var19, var20);
			Rasterizer3D.method4977((float)var21, (float)var23, (float)var24, (float)var17, (float)var19, (float)var20, 0.0F, 0.0F, 0.0F, var4);
		}
	}

	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "(Lox;B)V",
		garbageValue = "2"
	)
	@Export("invalidateWidget")
	public static void invalidateWidget(Widget var0) {
		if (var0 != null && var0.cycle == Client.field543) {
			Client.validRootWidgets[var0.rootIndex] = true;
		}

	}
}
