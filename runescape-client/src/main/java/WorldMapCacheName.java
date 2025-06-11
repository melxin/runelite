import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lc")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	public static final WorldMapCacheName field3327;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	public static final WorldMapCacheName field3328;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	public static final WorldMapCacheName field3333;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	static final WorldMapCacheName field3330;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	public static final WorldMapCacheName field3331;
	@ObfuscatedName("pz")
	static byte[][] field3329;
	@ObfuscatedName("ac")
	@Export("name")
	public final String name;

	static {
		field3327 = new WorldMapCacheName("details");
		field3328 = new WorldMapCacheName("compositemap");
		field3333 = new WorldMapCacheName("compositetexture");
		field3330 = new WorldMapCacheName("area");
		field3331 = new WorldMapCacheName("labels");
	}

	WorldMapCacheName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1152794419"
	)
	static final void method6690() {
		Sound.topLevelWorldView.scene.setViewportWalking();

		for (int var0 = 0; var0 < Sound.topLevelWorldView.field1159.method9429(); ++var0) {
			WorldEntity var1 = (WorldEntity)Sound.topLevelWorldView.worldEntities.get((long)Sound.topLevelWorldView.field1159.method9430(var0));
			if (var1 != null) {
				var1.worldView.scene.setViewportWalking();
			}
		}

	}

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIIIILcp;I)V",
		garbageValue = "-934346104"
	)
	static void method6691(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Player var13) {
		ObjectComposition var14 = HealthBarConfig.getObjectDefinition(var6);
		int var15;
		int var16;
		if (var4 != 1 && var4 != 3) {
			var15 = var14.sizeX;
			var16 = var14.sizeY;
		} else {
			var15 = var14.sizeY;
			var16 = var14.sizeX;
		}

		int var17 = (var15 >> 1) + var1;
		int var18 = (var15 + 1 >> 1) + var1;
		int var19 = (var16 >> 1) + var2;
		int var20 = var2 + (var16 + 1 >> 1);
		int[][] var21 = class330.worldView.tileHeights[var0];
		int var22 = var21[var17][var19] + var21[var18][var19] + var21[var17][var20] + var21[var18][var20] >> 2;
		int var23 = (var1 << 7) + (var15 << 6);
		int var24 = (var2 << 7) + (var16 << 6);
		Model var25 = var14.getModel(var3, var4, var21, var23, var22, var24);
		if (var25 != null) {
			class36.method703(class330.worldView, var0, var1, var2, var5, -1, 0, 0, 31, (String[])null, var7 + 1, var8 + 1);
			var13.animationCycleStart = var7 + Client.cycle;
			var13.animationCycleEnd = var8 + Client.cycle;
			var13.model0 = var25;
			var13.field944 = var15 * 64 + var1 * 128;
			var13.field946 = var2 * 128 + var16 * 64;
			var13.tileHeight2 = var22;
			int var26;
			if (var9 > var11) {
				var26 = var9;
				var9 = var11;
				var11 = var26;
			}

			if (var10 > var12) {
				var26 = var10;
				var10 = var12;
				var12 = var26;
			}

			var13.minX = var9 + var1;
			var13.maxX = var11 + var1;
			var13.minY = var10 + var2;
			var13.maxY = var2 + var12;
		}

	}
}
