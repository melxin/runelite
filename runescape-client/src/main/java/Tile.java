import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jy")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "Lrf;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ljc;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -231278501
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Lkg;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 372589283
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1588890761
	)
	@Export("x")
	int x;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -599910757
	)
	@Export("y")
	int y;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1633009545
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("boundaryObject")
	BoundaryObject boundaryObject;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("wallDecoration")
	WallDecoration wallDecoration;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("floorDecoration")
	FloorDecoration floorDecoration;
	@ObfuscatedName("af")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1715171287
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1810563325
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("aw")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("at")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("ae")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -834620607
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1552241969
	)
	int field2626;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1532223479
	)
	int field2614;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -865130949
	)
	int field2634;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	@Export("linkedBelowTile")
	Tile linkedBelowTile;

	Tile(int var1, int var2, int var3) {
		this.gameObjects = new GameObject[5];
		this.gameObjectEdgeMasks = new int[5];
		this.gameObjectsEdgeMask = 0;
		this.originalPlane = this.plane = var1;
		this.x = var2;
		this.y = var3;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([BI)Lwd;",
		garbageValue = "191509391"
	)
	@Export("readSpritePixelsFromBytes")
	public static final SpritePixels readSpritePixelsFromBytes(byte[] var0) {
		BufferedImage var1 = null;

		try {
			Class var2 = ImageIO.class;
			synchronized(ImageIO.class) {
				var1 = ImageIO.read(new ByteArrayInputStream(var0));
			}

			if (var1 != null) {
				int var6 = var1.getWidth();
				int var7 = var1.getHeight();
				int[] var4 = new int[var7 * var6];
				PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var6, var7, var4, 0, var6);
				var5.grabPixels();
				return new SpritePixels(var4, var6, var7);
			}
		} catch (IOException var9) {
		} catch (InterruptedException var10) {
		}

		return new SpritePixels(0, 0);
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(Ldl;Loh;B)V",
		garbageValue = "-52"
	)
	static void method4989(WorldView var0, class389 var1) {
		int var2 = 0;

		for (int var3 = 0; var3 < var0.field1159.method9429(); ++var3) {
			WorldEntity var4 = (WorldEntity)var0.worldEntities.get((long)var0.field1159.method9430(var3));
			if (var4 != null && var4.worldView.id != Client.field337 && var4.method9709() == var1) {
				boolean var5 = var2 < Client.field375;
				if (var5) {
					++var2;
					boolean var6 = false;
					if (var1 == class389.field4601) {
						Bounds var8 = FloorUnderlayDefinition.method4268(var4.worldEntityCoord, var4.field5213.method4273());

						boolean var7;
						label118: {
							int var9;
							for (var9 = 0; var9 < Client.playerUpdateManager.playerCount; ++var9) {
								Player var10 = (Player)var0.players.get((long)Client.playerUpdateManager.playerIndices[var9]);
								if (var10 != null && var8.method8644(var10.x, var10.y)) {
									var8.method8642();
									var7 = true;
									break label118;
								}
							}

							var9 = 0;

							label101:
							while (true) {
								if (var9 >= var0.field1147.method9429()) {
									for (var9 = 0; var9 < var0.field1159.method9429(); ++var9) {
										WorldEntity var14 = (WorldEntity)var0.worldEntities.get((long)var0.field1159.method9430(var9));
										if (var14 != null && var14 != var4 && var14.worldView.scene.cycle == Client.cycle) {
											Bounds var11 = FloorUnderlayDefinition.method4268(var14.worldEntityCoord, var14.field5213.method4273());
											if (var8.method8645(var11)) {
												var8.method8642();
												var11.method8642();
												var7 = true;
												break label101;
											}

											var11.method8642();
										}
									}

									var8.method8642();
									var7 = false;
									break;
								}

								NPC var13 = (NPC)var0.npcs.get((long)var0.field1147.method9430(var9));
								if (var13 != null && var8.method8644(var13.x, var13.y)) {
									for (int var12 = 0; var12 < var13.definition.actions.length; ++var12) {
										if (var13.definition.actions[var12] != null) {
											var8.method8642();
											var7 = true;
											break label101;
										}
									}
								}

								++var9;
							}
						}

						var6 = var7;
					}

					class202.method4298(var0, var4, var6);
				}
			}
		}

	}
}
