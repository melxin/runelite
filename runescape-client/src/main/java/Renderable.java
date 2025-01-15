import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
@Implements("Renderable")
public abstract class Renderable extends DualNode {
	@ObfuscatedName("ef")
	@ObfuscatedGetter(
		intValue = -1363658001
	)
	@Export("height")
	public int height;

	protected Renderable() {
		this.height = 1000;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Lhv;",
		garbageValue = "-7"
	)
	@Export("getModel")
	protected Model getModel() {
		return null;
	}

	@ObfuscatedName("eq")
	void vmethod4616(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
		Model var15 = this.getModel();
		if (var15 != null) {
			this.height = var15.height;
			int var16 = Rasterizer3D.Rasterizer3D_sine[var2];
			int var17 = Rasterizer3D.Rasterizer3D_cosine[var2];
			int var18 = Rasterizer3D.Rasterizer3D_sine[var3];
			int var19 = Rasterizer3D.Rasterizer3D_cosine[var3];
			var15.draw(var1, var16, var17, var18, var19, var4 - var7, var5 - var8, var6 - var9, var10);
		}

	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(ILqe;IIIJ)V"
	)
	@Export("draw")
	void draw(int var1, TransformationMatrix var2, int var3, int var4, int var5, long var6) {
		Model var8 = this.getModel();
		if (var8 != null) {
			this.height = var8.height;
			var8.draw(var1, var2, var3, var4, var5, var6);
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "81507739"
	)
	static void method4460() {
		Tiles.Tiles_minPlane = 99;
		SecureRandomCallable.Tiles_underlays = new short[4][104][104];
		SecureRandomFuture.Tiles_overlays = new short[4][104][104];
		Tiles.Tiles_shapes = new byte[4][104][104];
		Tiles.field1026 = new byte[4][104][104];
		class538.field5380 = new int[4][105][105];
		Tiles.Tiles_underlays2 = new byte[4][105][105];
		WorldMapID.field3244 = new int[105][105];
		InvDefinition.Tiles_hue = new int[104];
		Tiles.Tiles_saturation = new int[104];
		Tiles.Tiles_lightness = new int[104];
		class4.Tiles_hueMultiplier = new int[104];
		class557.field5476 = new int[104];
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[IB)V",
		garbageValue = "-20"
	)
	public static void method4461(String[] var0, int[] var1) {
		class250.quicksortStringsWithCorrespondingIntegers(var0, var1, 0, var0.length - 1);
	}

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIB)V",
		garbageValue = "1"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (ClanChannel.widgetDefinition.loadInterface(var0)) {
			HttpRequest.field53 = null;
			class134.drawInterface(ClanChannel.widgetDefinition.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7);
			if (HttpRequest.field53 != null) {
				class134.drawInterface(HttpRequest.field53, -1412584499, var1, var2, var3, var4, class433.field4786, WorldMapElement.field2543, var7);
				HttpRequest.field53 = null;
			}

		} else {
			if (var7 != -1) {
				Client.validRootWidgets[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) {
					Client.validRootWidgets[var8] = true;
				}
			}

		}
	}
}
