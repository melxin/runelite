import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vq")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lvq;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lvq;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lvq;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lvq;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lvq;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lvq;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("tt")
	@ObfuscatedSignature(
		descriptor = "[Lok;"
	)
	static Widget[] field5818;
	@ObfuscatedName("ae")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full");
		FontName_plain12 = new FontName("p12_full");
		FontName_bold12 = new FontName("b12_full");
		FontName_verdana11 = new FontName("verdana_11pt_regular");
		FontName_verdana13 = new FontName("verdana_13pt_regular");
		FontName_verdana15 = new FontName("verdana_15pt_regular");
	}

	FontName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "2081656857"
	)
	public static int method11001(int var0, int var1) {
		return (int)(Math.atan2((double)var0, (double)var1) * 325.94932345220167D) & 2047;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(FFFI)F",
		garbageValue = "-582328390"
	)
	public static float method11000(float var0, float var1, float var2) {
		if (var1 < var0) {
			throw new IllegalArgumentException("max: " + var1 + " can not be lower than min: " + var0);
		} else {
			return Math.max(var0, Math.min(var2, var1));
		}
	}

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(Ldm;IIIIIIIII)V",
		garbageValue = "-2147429721"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Scene var9 = var0.scene;
		if (var3 >= 1 && var4 >= 1 && var3 <= var0.sizeX - 2 && var4 <= var0.sizeY - 2) {
			if (Client.isLowDetail && var0.plane != var1) {
				return;
			}

			Renderable var10 = null;
			Renderable var11 = null;
			int var12 = -1;
			long var13 = 0L;
			boolean var15 = false;
			boolean var16 = false;
			if (var2 == 0) {
				var13 = var9.getBoundaryObjectTag(var1, var3, var4);
			}

			if (var2 == 1) {
				var13 = var9.getWallDecorationTag(var1, var3, var4);
			}

			if (var2 == 2) {
				var13 = var9.getGameObjectTag(var1, var3, var4);
			}

			if (var2 == 3) {
				var13 = var9.getFloorDecorationTag(var1, var3, var4);
			}

			int var17;
			ObjectComposition var18;
			if (0L != var13) {
				var17 = var9.getObjectFlags(var1, var3, var4, var13);
				var12 = BuddyRankComparator.Entity_unpackID(var13);
				int var20 = var17 & 31;
				int var21 = var17 >> 6 & 3;
				var18 = TileItem.getObjectDefinition(var12);
				var0.method2744(var1, var3, var4, var18, var21);
				if (var2 == 0) {
					BoundaryObject var19 = var9.getBoundaryObject(var1, var3, var4);
					var10 = var19.renderable1;
					var11 = var19.renderable2;
					var9.removeBoundaryObject(var1, var3, var4);
					if (var18.interactType != 0) {
						var0.collisionMaps[var1].method6189(var3, var4, var20, var21, var18.boolean1);
					}
				}

				if (var2 == 1) {
					WallDecoration var22 = var9.getWallDecoration(var1, var3, var4);
					var10 = var22.renderable1;
					var11 = var22.renderable2;
					var9.removeWallDecoration(var1, var3, var4);
				}

				if (var2 == 2) {
					var10 = var9.getGameObject(var1, var3, var4).renderable;
					var9.removeGameObject(var1, var3, var4);
					if (var3 + var18.sizeX > var0.sizeX - 1 || var4 + var18.sizeX > var0.sizeY - 1 || var3 + var18.sizeY > var0.sizeX - 1 || var4 + var18.sizeY > var0.sizeY - 1) {
						return;
					}

					if (var18.interactType != 0) {
						var0.collisionMaps[var1].setFlagOffNonSquare(var3, var4, var18.sizeX, var18.sizeY, var21, var18.boolean1);
					}
				}

				if (var2 == 3) {
					var10 = var9.getFloorDecoration(var1, var3, var4).renderable;
					var9.removeFloorDecoration(var1, var3, var4);
					if (var18.interactType == 1) {
						var0.collisionMaps[var1].method6190(var3, var4);
					}
				}
			}

			if (var5 >= 0) {
				var17 = var1;
				if (var1 < 3 && (var0.tileSettings[1][var3][var4] & 2) == 2) {
					var17 = var1 + 1;
				}

				if (var5 != var12) {
					var10 = null;
					var11 = null;
				}

				class293.method6752(var0, var1, var17, var3, var4, var5, var6, var7, var8, var0.collisionMaps[var1], var10, var11);
				var18 = TileItem.getObjectDefinition(var5);
				if (var18 != null && var18.hasSound()) {
					var0.createObjectSound(var17, var3, var4, var18, var6);
				}
			}
		}

	}
}
