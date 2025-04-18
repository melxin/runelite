/*
 * Copyright (c) 2018 Abex
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.mixins;

import java.util.HashSet;
import java.util.Set;
import net.runelite.api.DecorativeObject;
import net.runelite.api.GroundObject;
import net.runelite.api.Perspective;
import net.runelite.api.Renderable;
import net.runelite.api.SceneTileModel;
import net.runelite.api.SceneTilePaint;
import net.runelite.api.Tile;
import net.runelite.api.WallObject;
import net.runelite.api.WorldView;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.PreMapLoad;
import net.runelite.api.hooks.DrawCallbacks;
import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.FieldHook;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.MethodHook;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSIntProjection;
import net.runelite.rs.api.RSNode;
import net.runelite.rs.api.RSNodeDeque;
import net.runelite.rs.api.RSPlayer;
import net.runelite.rs.api.RSProjection;
import net.runelite.rs.api.RSRenderable;
import net.runelite.rs.api.RSRuneLiteObject;
import net.runelite.rs.api.RSScene;
import net.runelite.rs.api.RSTile;
import net.runelite.rs.api.RSTileItem;
import static net.runelite.api.Constants.ROOF_FLAG_BETWEEN;
import static net.runelite.api.Constants.ROOF_FLAG_DESTINATION;
import static net.runelite.api.Constants.ROOF_FLAG_HOVERED;
import static net.runelite.api.Constants.ROOF_FLAG_POSITION;

@Mixin(RSScene.class)
public abstract class RSSceneMixin implements RSScene
{
	private static final int INVALID_HSL_COLOR = 12345678;
	private static final int PITCH_LOWER_LIMIT = 128;
	private static final int PITCH_UPPER_LIMIT = 383;

	@Shadow("client")
	static RSClient client;

	@Shadow("pitchRelaxEnabled")
	private static boolean pitchRelaxEnabled;

	@Shadow("hdMinimapEnabled")
	private static boolean hdMinimapEnabled;

	@Shadow("Rasterizer3D_colorPalette")
	private static int[] colorPalette;

	@Shadow("skyboxColor")
	static int skyboxColor;

	@Shadow("viewportColor")
	private static int viewportColor;

	//@Inject
	//private static int[] tmpX = new int[6];

	//@Inject
	//private static int[] tmpY = new int[6];

	@Inject
	private static int rl$drawDistance;

	@Inject
	private static int rl$roofRemovalMode = 0;

	@Inject
	private static int[][][] rl$tiles = new int[4][104][104];

	@Inject
	private static final Set<Integer> rl$tilesToRemove = new HashSet<>();

	@Inject
	private static int rl$hoverX = -1;

	@Inject
	private static int rl$hoverY = -1;

	@Inject
	private static short[][][] rl$underlayIds;

	@Inject
	private static short[][][] rl$overlayIds;

	@Inject
	private static byte[][][] rl$tileShapes;

	@Replace("draw")
	void drawScene(int cameraX, int cameraY, int cameraZ, int cameraPitch, int cameraYaw, int plane, int entityX, int entityY, boolean isCameraLocked)
	{
		int maxX = getMaxX();
		int maxZ = getMaxZ();

		if (cameraX < 0)
		{
			cameraX = 0;
		}
		else if (cameraX >= maxX * Perspective.LOCAL_TILE_SIZE)
		{
			cameraX = maxX * Perspective.LOCAL_TILE_SIZE - 1;
		}

		if (cameraZ < 0)
		{
			cameraZ = 0;
		}
		else if (cameraZ >= maxZ * Perspective.LOCAL_TILE_SIZE)
		{
			cameraZ = maxZ * Perspective.LOCAL_TILE_SIZE - 1;
		}

		// we store the uncapped pitch for setting camera angle for the pitch relaxer
		// we still have to cap the pitch in order to access the visibility map, though
		if (cameraPitch < PITCH_LOWER_LIMIT)
		{
			cameraPitch = PITCH_LOWER_LIMIT;
		}
		else if (cameraPitch > PITCH_UPPER_LIMIT)
		{
			cameraPitch = PITCH_UPPER_LIMIT;
		}

		/*if (!pitchRelaxEnabled)
		{
			realPitch = cameraPitch;
		}

		projection.setPitchSin(Perspective.SINE[realPitch]);
		projection.setPitchCos(Perspective.COSINE[realPitch]);
		projection.setYawSin(Perspective.SINE[client.getCameraYaw()]);
		projection.setYawCos(Perspective.COSINE[client.getCameraYaw()]);*/

		this.visibilityMap((cameraPitch - 128) / 32, cameraYaw / 64);
		this.setRenderArea((cameraPitch - 128) / 32, cameraYaw / 64);
		this.setCameraX2(cameraX);
		this.setCameraY2(cameraY);
		this.setCameraZ2(cameraZ);
		this.setScreenCenterX(cameraX / Perspective.LOCAL_TILE_SIZE);
		this.setScreenCenterZ(cameraZ / Perspective.LOCAL_TILE_SIZE);
		this.setEntityX(entityX / Perspective.LOCAL_TILE_SIZE);
		this.setEntityY(entityY / Perspective.LOCAL_TILE_SIZE);
		this.setScenePlane(plane);
		RSIntProjection projection = newIntProjection(cameraX, cameraY, cameraZ, cameraPitch, cameraYaw, entityX, entityY);
		this.updateVisibleTilesAndOccluders((RSProjection) projection, isCameraLocked);
	}

	@Replace("updateVisibleTilesAndOccluders")
	@Inject
	void updateVisibleTilesAndOccluders(RSProjection intProjection, boolean isCameraLocked)
	{
		final boolean isGpu = client.isGpu();
		final boolean checkClick = this.isCheckClick();
		final boolean menuOpen = client.isMenuOpen();

		if (!menuOpen && !checkClick)
		{
			this.menuOpen(false);
		}

		int cameraX = this.getCameraX2();
		int cameraY = this.getCameraY2();
		int cameraZ = this.getCameraZ2();
		int cameraPitch = client.getCameraPitch();
		int cameraYaw = client.getCameraYaw();
		int plane = getScenePlane();

		this.setCycle(getCycle() + 1);

		final DrawCallbacks drawCallbacks = client.getDrawCallbacks();
		if (drawCallbacks != null)
		{
			viewportColor = 0;
			drawCallbacks.drawScene(cameraX, cameraY, cameraZ, cameraPitch, cameraYaw, plane);
		}

		if (!isGpu && skyboxColor != 0)
		{
			client.rasterizerFillRectangle(
				client.getViewportXOffset(),
				client.getViewportYOffset(),
				client.getViewportWidth(),
				client.getViewportHeight(),
				skyboxColor
			);
		}

		final int minLevel = getMinLevel();

		final RSTile[][][] tiles = getTiles();

		int DEFAULT_DISTANCE = this.getOffsetOccluder();
		final int distance = isGpu ? rl$drawDistance : DEFAULT_DISTANCE;

		int screenCenterX = getScreenCenterX();
		int screenCenterZ = getScreenCenterZ();
		int maxX = getMaxX();
		int maxY = getMaxY();
		int maxZ = getMaxZ();

		int minTileX = screenCenterX - distance;
		if (minTileX < 0)
		{
			minTileX = 0;
		}

		int minTileZ = screenCenterZ - distance;
		if (minTileZ < 0)
		{
			minTileZ = 0;
		}

		int maxTileX = screenCenterX + distance;
		if (maxTileX > maxX)
		{
			maxTileX = maxX;
		}

		int maxTileZ = screenCenterZ + distance;
		if (maxTileZ > maxZ)
		{
			maxTileZ = maxZ;
		}

		this.setMinTileX(minTileX);
		this.setMinTileZ(minTileZ);
		this.setMaxTileX(maxTileX);
		this.setMaxTileZ(maxTileZ);

		if (this.getWorldViewId() == -1)
		{
			updateOccluders();
		}

		this.setTileUpdateCount(0);

		if (rl$roofRemovalMode != 0)
		{
			rl$tilesToRemove.clear();
			RSPlayer localPlayer = client.getLocalPlayer();
			if (localPlayer != null && (rl$roofRemovalMode & ROOF_FLAG_POSITION) != 0)
			{
				LocalPoint localLocation = localPlayer.getLocalLocation();
				if (localLocation.isInScene())
				{
					rl$tilesToRemove.add(rl$tiles[plane][localLocation.getSceneX()][localLocation.getSceneY()]);
				}
			}

			if (rl$hoverX >= 0 && rl$hoverX < 104 && rl$hoverY >= 0 && rl$hoverY < 104 && (rl$roofRemovalMode & ROOF_FLAG_HOVERED) != 0)
			{
				rl$tilesToRemove.add(rl$tiles[plane][rl$hoverX][rl$hoverY]);
			}

			LocalPoint localDestinationLocation = client.getLocalDestinationLocation();
			if (localDestinationLocation != null && localDestinationLocation.isInScene() && (rl$roofRemovalMode & ROOF_FLAG_DESTINATION) != 0)
			{
				rl$tilesToRemove.add(rl$tiles[plane][localDestinationLocation.getSceneX()][localDestinationLocation.getSceneY()]);
			}

			if (cameraPitch < 310 && (rl$roofRemovalMode & ROOF_FLAG_BETWEEN) != 0 && localPlayer != null)
			{
				int playerX = localPlayer.getX() >> 7;
				int playerY = localPlayer.getY() >> 7;
				int var29 = client.getCameraX() >> 7;
				int var30 = client.getCameraY() >> 7;
				if (playerX >= 0 && playerY >= 0 && var29 >= 0 && var30 >= 0 && playerX < 104 && playerY < 104 && var29 < 104 && var30 < 104)
				{
					int var31 = Math.abs(playerX - var29);
					int var32 = Integer.compare(playerX, var29);
					int var33 = -Math.abs(playerY - var30);
					int var34 = Integer.compare(playerY, var30);
					int var35 = var31 + var33;

					while (var29 != playerX || var30 != playerY)
					{
						if (blocking(plane, var29, var30))
						{
							rl$tilesToRemove.add(rl$tiles[plane][var29][var30]);
						}

						int var36 = 2 * var35;
						if (var36 >= var33)
						{
							var35 += var33;
							var29 += var32;
						}
						else
						{
							var35 += var31;
							var30 += var34;
						}
					}
				}
			}
		}

		if (!menuOpen)
		{
			rl$hoverY = -1;
			rl$hoverX = -1;
		}

		for (int z = minLevel; z < maxY; ++z)
		{
			RSTile[][] planeTiles = tiles[z];

			for (int x = minTileX; x < maxTileX; ++x)
			{
				for (int y = minTileZ; y < maxTileZ; ++y)
				{
					RSTile tile = planeTiles[x][y];
					if (tile != null)
					{
						int var30 = rl$tiles[plane][x][y];
						if (tile.getPhysicalLevel() > plane && rl$roofRemovalMode == 0
							|| getWorldViewId() == -1 && !isGpu && !setRenderArea(x - screenCenterX + DEFAULT_DISTANCE, y - screenCenterZ + DEFAULT_DISTANCE) && getTileHeights()[z][x][y] - cameraY < 2000
							|| rl$roofRemovalMode != 0 && plane < tile.getPhysicalLevel() && var30 != 0 && rl$tilesToRemove.contains(var30))
						{
							tile.setDraw(false);
							tile.setVisible(false);
							tile.setWallCullDirection(0);
						}
						else
						{
							tile.setDraw(true);
							tile.setVisible(true);
							if (tile.getGameObjectsCount() > 0)
							{
								tile.setDrawEntities(true);
							}
							else
							{
								tile.setDrawEntities(false);
							}
							this.setTileUpdateCount(this.getTileUpdateCount() + 1);
						}
					}
				}
			}
		}

		for (int z = minLevel; z < maxY; ++z)
		{
			RSTile[][] planeTiles = tiles[z];

			for (int x = -distance; x <= 0; ++x)
			{
				int var10 = x + screenCenterX;
				int var16 = screenCenterX - x;
				if (var10 >= minTileX || var16 < maxTileX)
				{
					for (int y = -distance; y <= 0; ++y)
					{
						int var13 = y + screenCenterZ;
						int var14 = screenCenterZ - y;
						if (var10 >= minTileX && var10 < maxTileX)
						{
							if (var13 >= minTileZ && var13 < maxTileZ)
							{
								RSTile tile = planeTiles[var10][var13];
								if (tile != null && tile.isDraw())
								{
									draw(intProjection, tile, true);
								}
							}

							if (var14 >= minTileZ && var14 < maxTileZ)
							{
								RSTile tile = planeTiles[var10][var14];
								if (tile != null && tile.isDraw())
								{
									draw(intProjection, tile, true);
								}
							}
						}

						if (var16 >= minTileX && var16 < maxTileX)
						{
							if (var13 >= minTileZ && var13 < maxTileZ)
							{
								RSTile tile = planeTiles[var16][var13];
								if (tile != null && tile.isDraw())
								{
									draw(intProjection, tile, true);
								}
							}

							if (var14 >= minTileZ && var14 < maxTileZ)
							{
								RSTile tile = planeTiles[var16][var14];
								if (tile != null && tile.isDraw())
								{
									draw(intProjection, tile, true);
								}
							}
						}

						if (this.getTileUpdateCount() == 0)
						{
							if (!isGpu && (client.getOculusOrbState() != 0 && !client.getComplianceValue("orbInteraction")))
							{
								client.setEntitiesAtMouseCount(0);
							}
							//this.setCheckClick(false);
							this.processWalkClick();
							client.getCallbacks().drawScene();

							if (client.getDrawCallbacks() != null)
							{
								client.getDrawCallbacks().postDrawScene();
							}

							return;
						}
					}
				}
			}
		}
		outer:
		for (int z = minLevel; z < maxY; ++z)
		{
			RSTile[][] planeTiles = tiles[z];

			for (int x = -distance; x <= 0; ++x)
			{
				int var10 = x + screenCenterX;
				int var16 = screenCenterX - x;
				if (var10 >= minTileX || var16 < maxTileX)
				{
					for (int y = -distance; y <= 0; ++y)
					{
						int var13 = y + screenCenterZ;
						int var14 = screenCenterZ - y;
						if (var10 >= minTileX)
						{
							if (var13 >= minTileZ && var13 < maxTileZ)
							{
								RSTile tile = planeTiles[var10][var13];
								if (tile != null && tile.isDraw())
								{
									draw(intProjection, tile, false);
								}
							}

							if (var14 >= minTileZ && var14 < maxTileZ)
							{
								RSTile tile = planeTiles[var10][var14];
								if (tile != null && tile.isDraw())
								{
									draw(intProjection, tile, false);
								}
							}
						}

						if (var16 >= minTileX && var16 < maxTileX)
						{
							if (var13 >= minTileZ && var13 < maxTileZ)
							{
								RSTile tile = planeTiles[var16][var13];
								if (tile != null && tile.isDraw())
								{
									draw(intProjection, tile, false);
								}
							}

							if (var14 >= minTileZ && var14 < maxTileZ)
							{
								RSTile tile = planeTiles[var16][var14];
								if (tile != null && tile.isDraw())
								{
									draw(intProjection, tile, false);
								}
							}
						}

						if (this.getTileUpdateCount() == 0)
						{
							// exit the loop early and go straight to "if (!isGpu && (client..."
							break outer;
						}
					}
				}
			}
		}

		if (!isGpu && (client.getOculusOrbState() != 0 && !client.getComplianceValue("orbInteraction")))
		{
			client.setEntitiesAtMouseCount(0);
		}
		//this.setCheckClick(false);
		this.processWalkClick();
		client.getCallbacks().drawScene();
		if (client.getDrawCallbacks() != null)
		{
			client.getDrawCallbacks().postDrawScene();
		}
	}

	/*@Copy("drawTileUnderlay")
	@Replace("drawTileUnderlay")
	public void copy$drawTileUnderlay(SceneTilePaint tile, int z, int pitchSin, int pitchCos, int yawSin, int yawCos, int x, int y)
	{
		byte[][][] tileSettings = client.getTileSettings();
		final boolean checkClick = client.isCheckClick();

		int tilePlane = z;
		if ((tileSettings[1][x][x] & 2) != 0)
		{
			tilePlane = z - 1;
		}

		if (!client.isGpu())
		{
			try
			{
				copy$drawTileUnderlay(tile, z, pitchSin, pitchCos, yawSin, yawCos, x, y);
			}
			catch (Exception ex)
			{
				client.getLogger().warn("error during tile underlay rendering", ex);
			}

			if (rl$roofRemovalMode == 0 || !checkClick || client.getPlane() != tilePlane)
			{
				return;
			}
		}

		final DrawCallbacks drawCallbacks = client.getDrawCallbacks();

		if (drawCallbacks == null)
		{
			return;
		}

		try
		{
			final int[][][] tileHeights = getTileHeights();

			final int cameraX2 = client.getCameraX2();
			final int cameraY2 = client.getCameraY2();
			final int cameraZ2 = client.getCameraZ2();

			final int zoom = client.get3dZoom();
			final int centerX = client.getCenterX();
			final int centerY = client.getCenterY();

			final int mouseX2 = client.getMouseX2();
			final int mouseY2 = client.getMouseY2();

			int var9;
			int var10 = var9 = (x << 7) - cameraX2;
			int var11;
			int var12 = var11 = (y << 7) - cameraZ2;
			int var13;
			int var14 = var13 = var10 + 128;
			int var15;
			int var16 = var15 = var12 + 128;
			int var17 = tileHeights[z][x][y] - cameraY2;
			int var18 = tileHeights[z][x + 1][y] - cameraY2;
			int var19 = tileHeights[z][x + 1][y + 1] - cameraY2;
			int var20 = tileHeights[z][x][y + 1] - cameraY2;
			int var21 = var10 * yawCos + yawSin * var12 >> 16;
			var12 = var12 * yawCos - yawSin * var10 >> 16;
			var10 = var21;
			var21 = var17 * pitchCos - pitchSin * var12 >> 16;
			var12 = pitchSin * var17 + var12 * pitchCos >> 16;
			var17 = var21;
			if (var12 >= 50)
			{
				var21 = var14 * yawCos + yawSin * var11 >> 16;
				var11 = var11 * yawCos - yawSin * var14 >> 16;
				var14 = var21;
				var21 = var18 * pitchCos - pitchSin * var11 >> 16;
				var11 = pitchSin * var18 + var11 * pitchCos >> 16;
				var18 = var21;
				if (var11 >= 50)
				{
					var21 = var13 * yawCos + yawSin * var16 >> 16;
					var16 = var16 * yawCos - yawSin * var13 >> 16;
					var13 = var21;
					var21 = var19 * pitchCos - pitchSin * var16 >> 16;
					var16 = pitchSin * var19 + var16 * pitchCos >> 16;
					var19 = var21;
					if (var16 >= 50)
					{
						var21 = var9 * yawCos + yawSin * var15 >> 16;
						var15 = var15 * yawCos - yawSin * var9 >> 16;
						var9 = var21;
						var21 = var20 * pitchCos - pitchSin * var15 >> 16;
						var15 = pitchSin * var20 + var15 * pitchCos >> 16;
						if (var15 >= 50)
						{
							int dy = var10 * zoom / var12 + centerX;
							int dx = var17 * zoom / var12 + centerY;
							int cy = var14 * zoom / var11 + centerX;
							int cx = var18 * zoom / var11 + centerY;
							int ay = var13 * zoom / var16 + centerX;
							int ax = var19 * zoom / var16 + centerY;
							int by = var9 * zoom / var15 + centerX;
							int bx = var21 * zoom / var15 + centerY;

							drawCallbacks.drawScenePaint(0, pitchSin, pitchCos, yawSin, yawCos,
								-cameraX2, -cameraY2, -cameraZ2,
								tile, z, x, y,
								zoom, centerX, centerY);

							if ((ay - by) * (cx - bx) - (ax - bx) * (cy - by) > 0)
							{
								if (checkClick && client.containsBounds(mouseX2, mouseY2, ax, bx, cx, ay, by, cy))
								{
									setTargetTile(x, y);

									if (mouseX2 >= client.getViewportXOffset() && mouseX2 < client.getViewportXOffset() + client.getViewportWidth() && mouseY2 >= client.getViewportYOffset() && mouseY2 < client.getViewportYOffset() + client.getViewportHeight())
									{
										hoverTile(x, y, tilePlane);
									}
								}
							}

							if ((dy - cy) * (bx - cx) - (dx - cx) * (by - cy) > 0)
							{
								if (checkClick && client.containsBounds(mouseX2, mouseY2, dx, cx, bx, dy, cy, by))
								{
									setTargetTile(x, y);

									if (mouseX2 >= client.getViewportXOffset() && mouseX2 < client.getViewportXOffset() + client.getViewportWidth() && mouseY2 >= client.getViewportYOffset() && mouseY2 < client.getViewportYOffset() + client.getViewportHeight())
									{
										hoverTile(x, y, tilePlane);
									}
								}
							}

						}
					}
				}
			}
		}
		catch (Exception ex)
		{
			client.getLogger().warn("error during underlay rendering", ex);
		}
	}

	@Copy("drawTileOverlay")
	@Replace("drawTileOverlay")
	public void copy$drawTileOverlay(SceneTileModel tile, int pitchSin, int pitchCos, int yawSin, int yawCos, int tileX, int tileY)
	{
		Tile rsTile = getTiles()[client.getPlane()][tileX][tileY];
		final boolean checkClick = client.isCheckClick();

		if (!client.isGpu())
		{
			copy$drawTileOverlay(tile, pitchSin, pitchCos, yawSin, yawCos, tileX, tileY);

			if (rl$roofRemovalMode == 0 || !checkClick || rsTile == null || rsTile.getSceneTileModel() != tile || rsTile.getPhysicalLevel() != client.getPlane())
			{
				return;
			}
		}

		final DrawCallbacks drawCallbacks = client.getDrawCallbacks();

		if (drawCallbacks == null)
		{
			return;
		}

		try
		{
			final int cameraX2 = client.getCameraX2();
			final int cameraY2 = client.getCameraY2();
			final int cameraZ2 = client.getCameraZ2();
			final int zoom = client.get3dZoom();
			final int centerX = client.getCenterX();
			final int centerY = client.getCenterY();

			drawCallbacks.drawSceneTileModel(0, pitchSin, pitchCos, yawSin, yawCos, -cameraX2, -cameraY2, -cameraZ2,
				tile, client.getPlane(), tileX, tileY,
				zoom, centerX, centerY);

			if (!checkClick)
			{
				return;
			}

			RSSceneTileModel tileModel = (RSSceneTileModel) tile;

			final int[] faceX = tileModel.getFaceX();
			final int[] faceY = tileModel.getFaceY();
			final int[] faceZ = tileModel.getFaceZ();

			final int[] vertexX = tileModel.getVertexX();
			final int[] vertexY = tileModel.getVertexY();
			final int[] vertexZ = tileModel.getVertexZ();

			final int vertexCount = vertexX.length;
			final int faceCount = faceX.length;

			final int mouseX2 = client.getMouseX2();
			final int mouseY2 = client.getMouseY2();

			for (int i = 0; i < vertexCount; ++i)
			{
				int vx = vertexX[i] - cameraX2;
				int vy = vertexY[i] - cameraY2;
				int vz = vertexZ[i] - cameraZ2;

				int rotA = vz * yawSin + vx * yawCos >> 16;
				int rotB = vz * yawCos - vx * yawSin >> 16;

				int var13 = vy * pitchCos - rotB * pitchSin >> 16;
				int var12 = vy * pitchSin + rotB * pitchCos >> 16;
				if (var12 < 50)
				{
					return;
				}

				int ax = rotA * zoom / var12 + centerX;
				int ay = var13 * zoom / var12 + centerY;

				tmpX[i] = ax;
				tmpY[i] = ay;
			}

			for (int i = 0; i < faceCount; ++i)
			{
				int va = faceX[i];
				int vb = faceY[i];
				int vc = faceZ[i];

				int x1 = tmpX[va];
				int x2 = tmpX[vb];
				int x3 = tmpX[vc];

				int y1 = tmpY[va];
				int y2 = tmpY[vb];
				int y3 = tmpY[vc];

				if ((x1 - x2) * (y3 - y2) - (y1 - y2) * (x3 - x2) > 0)
				{
					if (client.containsBounds(mouseX2, mouseY2, y1, y2, y3, x1, x2, x3))
					{
						setTargetTile(tileX, tileY);

						if (rsTile != null && tile == rsTile.getSceneTileModel() && mouseX2 >= client.getViewportXOffset() && mouseX2 < client.getViewportXOffset() + client.getViewportWidth() && mouseY2 >= client.getViewportYOffset() && mouseY2 < client.getViewportYOffset() + client.getViewportHeight())
						{
							hoverTile(tileX, tileY, rsTile.getPhysicalLevel());
						}
						break;
					}
				}
			}
		}
		catch (Exception ex)
		{
			client.getLogger().warn("error during overlay rendering", ex);
		}
	}*/

	@Inject
	@Override
	public int getDrawDistance()
	{
		return rl$drawDistance;
	}

	@Inject
	@Override
	public void setDrawDistance(int drawDistance)
	{
		rl$drawDistance = drawDistance;
	}

	@Inject
	@Override
	public void setTargetTile(int targetX, int targetY)
	{
		client.getTopLevelWorldView().getScene().setBaseX(targetX);
		client.getTopLevelWorldView().getScene().setBaseY(targetY);
	}

	@Override
	@Inject
	public void addItem(int id, int quantity, WorldPoint point)
	{
		final int sceneX = point.getX() - client.getBaseX();
		final int sceneY = point.getY() - client.getBaseY();
		final int plane = point.getPlane();

		if (sceneX < 0 || sceneY < 0 || sceneX >= 104 || sceneY >= 104)
		{
			return;
		}

		RSTileItem item = client.newTileItem();
		item.setId(id);
		item.setQuantity(quantity);
		RSNodeDeque[][][] groundItems = client.getWorldView().getGroundItems();

		if (groundItems[plane][sceneX][sceneY] == null)
		{
			groundItems[plane][sceneX][sceneY] = client.newNodeDeque();
		}

		groundItems[plane][sceneX][sceneY].addFirst(item);

		if (plane == client.getPlane())
		{
			client.updateItemPile(plane, sceneX, sceneY);
		}
	}

	@Override
	@Inject
	public void removeItem(int id, int quantity, WorldPoint point)
	{
		final int sceneX = point.getX() - client.getBaseX();
		final int sceneY = point.getY() - client.getBaseY();
		final int plane = point.getPlane();

		if (sceneX < 0 || sceneY < 0 || sceneX >= 104 || sceneY >= 104)
		{
			return;
		}

		RSNodeDeque items = client.getWorldView().getGroundItems()[plane][sceneX][sceneY];

		if (items == null)
		{
			return;
		}

		for (RSTileItem item = (RSTileItem) items.last(); item != null; item = (RSTileItem) items.previous())
		{
			if (item.getId() == id && quantity == 1)
			{
				item.unlink();
				break;
			}
		}

		if (items.last() == null)
		{
			client.getWorldView().getGroundItems()[plane][sceneX][sceneY] = null;
		}

		client.updateItemPile(plane, sceneX, sceneY);
	}

	@MethodHook(value = "addTile", end = true)
	@Inject
	public void rl$addTile(int z, int x, int y, int shape, int rotation, int texture, int heightSw, int heightNw,
						int heightNe, int heightSe, int underlaySwColor, int underlayNwColor, int underlayNeColor,
						int underlaySeColor, int overlaySwColor, int overlayNwColor, int overlayNeColor,
						int overlaySeColor, int underlayRgb, int overlayRgb)
	{
		if (shape != 0 && shape != 1)
		{
			Tile tile = getTiles()[z][x][y];
			SceneTileModel sceneTileModel = tile.getSceneTileModel();

			sceneTileModel.setUnderlaySwColor(underlaySwColor);
			sceneTileModel.setUnderlayNwColor(underlayNwColor);
			sceneTileModel.setUnderlayNeColor(underlayNeColor);
			sceneTileModel.setUnderlaySeColor(underlaySeColor);

			sceneTileModel.setOverlaySwColor(overlaySwColor);
			sceneTileModel.setOverlayNwColor(overlayNwColor);
			sceneTileModel.setOverlayNeColor(overlayNeColor);
			sceneTileModel.setOverlaySeColor(overlaySeColor);
		}
	}

	@Copy("drawTileMinimap")
	@Replace("drawTileMinimap")
	public void copy$drawTile(int[] pixels, int pixelOffset, int width, int z, int x, int y)
	{
		if (!hdMinimapEnabled)
		{
			copy$drawTile(pixels, pixelOffset, width, z, x, y);
			return;
		}
		Tile tile = getTiles()[z][x][y];
		if (tile == null)
		{
			return;
		}
		SceneTilePaint sceneTilePaint = tile.getSceneTilePaint();
		if (sceneTilePaint != null)
		{
			int rgb = sceneTilePaint.getRBG();
			if (sceneTilePaint.getSwColor() != INVALID_HSL_COLOR)
			{
				// hue and saturation
				int hs = sceneTilePaint.getSwColor() & ~0x7F;
				// I know this looks dumb (and it probably is) but I don't feel like hunting down the problem
				int seLightness = sceneTilePaint.getNwColor() & 0x7F;
				int neLightness = sceneTilePaint.getNeColor() & 0x7F;
				int southDeltaLightness = (sceneTilePaint.getSwColor() & 0x7F) - seLightness;
				int northDeltaLightness = (sceneTilePaint.getSeColor() & 0x7F) - neLightness;
				seLightness <<= 2;
				neLightness <<= 2;
				for (int i = 0; i < 4; i++)
				{
					if (sceneTilePaint.getTexture() == -1)
					{
						pixels[pixelOffset] = colorPalette[hs | seLightness >> 2];
						pixels[pixelOffset + 1] = colorPalette[hs | seLightness * 3 + neLightness >> 4];
						pixels[pixelOffset + 2] = colorPalette[hs | seLightness + neLightness >> 3];
						pixels[pixelOffset + 3] = colorPalette[hs | seLightness + neLightness * 3 >> 4];
					}
					else
					{
						int lig = 0xFF - ((seLightness >> 1) * (seLightness >> 1) >> 8);
						pixels[pixelOffset] = ((rgb & 0xFF00FF) * lig & ~0xFF00FF) + ((rgb & 0xFF00) * lig & 0xFF0000) >> 8;
						lig = 0xFF - ((seLightness * 3 + neLightness >> 3) * (seLightness * 3 + neLightness >> 3) >> 8);
						pixels[pixelOffset + 1] = ((rgb & 0xFF00FF) * lig & ~0xFF00FF) + ((rgb & 0xFF00) * lig & 0xFF0000) >> 8;
						lig = 0xFF - ((seLightness + neLightness >> 2) * (seLightness + neLightness >> 2) >> 8);
						pixels[pixelOffset + 2] = ((rgb & 0xFF00FF) * lig & ~0xFF00FF) + ((rgb & 0xFF00) * lig & 0xFF0000) >> 8;
						lig = 0xFF - ((seLightness + neLightness * 3 >> 3) * (seLightness + neLightness * 3 >> 3) >> 8);
						pixels[pixelOffset + 3] = ((rgb & 0xFF00FF) * lig & ~0xFF00FF) + ((rgb & 0xFF00) * lig & 0xFF0000) >> 8;
					}
					seLightness += southDeltaLightness;
					neLightness += northDeltaLightness;

					pixelOffset += width;
				}
			}
			else if (rgb != 0)
			{
				for (int i = 0; i < 4; i++)
				{
					pixels[pixelOffset] = rgb;
					pixels[pixelOffset + 1] = rgb;
					pixels[pixelOffset + 2] = rgb;
					pixels[pixelOffset + 3] = rgb;
					pixelOffset += width;
				}
			}
			return;
		}

		SceneTileModel sceneTileModel = tile.getSceneTileModel();
		if (sceneTileModel != null)
		{
			int shape = sceneTileModel.getShape();
			int rotation = sceneTileModel.getRotation();
			int overlayRgb = sceneTileModel.getModelOverlay();
			int underlayRgb = sceneTileModel.getModelUnderlay();
			int[] points = getTileShape2D()[shape];
			int[] indices = getTileRotation2D()[rotation];

			int shapeOffset = 0;

			if (sceneTileModel.getOverlaySwColor() != INVALID_HSL_COLOR)
			{
				// hue and saturation
				int hs = sceneTileModel.getOverlaySwColor() & ~0x7F;
				int seLightness = sceneTileModel.getOverlaySeColor() & 0x7F;
				int neLightness = sceneTileModel.getOverlayNeColor() & 0x7F;
				int southDeltaLightness = (sceneTileModel.getOverlaySwColor() & 0x7F) - seLightness;
				int northDeltaLightness = (sceneTileModel.getOverlayNwColor() & 0x7F) - neLightness;
				seLightness <<= 2;
				neLightness <<= 2;
				for (int i = 0; i < 4; i++)
				{
					if (sceneTileModel.getTriangleTextureId() == null)
					{
						if (points[indices[shapeOffset++]] != 0)
						{
							pixels[pixelOffset] = colorPalette[hs | (seLightness >> 2)];
						}
						if (points[indices[shapeOffset++]] != 0)
						{
							pixels[pixelOffset + 1] = colorPalette[hs | (seLightness * 3 + neLightness >> 4)];
						}
						if (points[indices[shapeOffset++]] != 0)
						{
							pixels[pixelOffset + 2] = colorPalette[hs | (seLightness + neLightness >> 3)];
						}
						if (points[indices[shapeOffset++]] != 0)
						{
							pixels[pixelOffset + 3] = colorPalette[hs | (seLightness + neLightness * 3 >> 4)];
						}
					}
					else
					{
						if (points[indices[shapeOffset++]] != 0)
						{
							int lig = 0xFF - ((seLightness >> 1) * (seLightness >> 1) >> 8);
							pixels[pixelOffset] = ((overlayRgb & 0xFF00FF) * lig & ~0xFF00FF) +
								((overlayRgb & 0xFF00) * lig & 0xFF0000) >> 8;
						}
						if (points[indices[shapeOffset++]] != 0)
						{
							int lig = 0xFF - ((seLightness * 3 + neLightness >> 3) *
								(seLightness * 3 + neLightness >> 3) >> 8);
							pixels[pixelOffset + 1] = ((overlayRgb & 0xFF00FF) * lig & ~0xFF00FF) +
								((overlayRgb & 0xFF00) * lig & 0xFF0000) >> 8;
						}
						if (points[indices[shapeOffset++]] != 0)
						{
							int lig = 0xFF - ((seLightness + neLightness >> 2) *
								(seLightness + neLightness >> 2) >> 8);
							pixels[pixelOffset + 2] = ((overlayRgb & 0xFF00FF) * lig & ~0xFF00FF) +
								((overlayRgb & 0xFF00) * lig & 0xFF0000) >> 8;
						}
						if (points[indices[shapeOffset++]] != 0)
						{
							int lig = 0xFF - ((seLightness + neLightness * 3 >> 3) *
								(seLightness + neLightness * 3 >> 3) >> 8);
							pixels[pixelOffset + 3] = ((overlayRgb & 0xFF00FF) * lig & ~0xFF00FF) +
								((overlayRgb & 0xFF00) * lig & 0xFF0000) >> 8;
						}
					}
					seLightness += southDeltaLightness;
					neLightness += northDeltaLightness;

					pixelOffset += width;
				}
				if (underlayRgb != 0 && sceneTileModel.getUnderlaySwColor() != INVALID_HSL_COLOR)
				{
					pixelOffset -= width << 2;
					shapeOffset -= 16;
					hs = sceneTileModel.getUnderlaySwColor() & ~0x7F;
					seLightness = sceneTileModel.getUnderlaySeColor() & 0x7F;
					neLightness = sceneTileModel.getUnderlayNeColor() & 0x7F;
					southDeltaLightness = (sceneTileModel.getUnderlaySwColor() & 0x7F) - seLightness;
					northDeltaLightness = (sceneTileModel.getUnderlayNwColor() & 0x7F) - neLightness;
					seLightness <<= 2;
					neLightness <<= 2;
					for (int i = 0; i < 4; i++)
					{
						if (points[indices[shapeOffset++]] == 0)
						{
							pixels[pixelOffset] = colorPalette[hs | (seLightness >> 2)];
						}
						if (points[indices[shapeOffset++]] == 0)
						{
							pixels[pixelOffset + 1] = colorPalette[hs | (seLightness * 3 + neLightness >> 4)];
						}
						if (points[indices[shapeOffset++]] == 0)
						{
							pixels[pixelOffset + 2] = colorPalette[hs | (seLightness + neLightness >> 3)];
						}
						if (points[indices[shapeOffset++]] == 0)
						{
							pixels[pixelOffset + 3] = colorPalette[hs | (seLightness + neLightness * 3 >> 4)];
						}
						seLightness += southDeltaLightness;
						neLightness += northDeltaLightness;

						pixelOffset += width;
					}
				}
			}
			else if (underlayRgb != 0)
			{
				for (int i = 0; i < 4; i++)
				{
					pixels[pixelOffset] = points[indices[shapeOffset++]] != 0 ? overlayRgb : underlayRgb;
					pixels[pixelOffset + 1] =
						points[indices[shapeOffset++]] != 0 ? overlayRgb : underlayRgb;
					pixels[pixelOffset + 2] =
						points[indices[shapeOffset++]] != 0 ? overlayRgb : underlayRgb;
					pixels[pixelOffset + 3] =
						points[indices[shapeOffset++]] != 0 ? overlayRgb : underlayRgb;
					pixelOffset += width;
				}
			}
			else
			{
				for (int i = 0; i < 4; i++)
				{
					if (points[indices[shapeOffset++]] != 0)
					{
						pixels[pixelOffset] = overlayRgb;
					}
					if (points[indices[shapeOffset++]] != 0)
					{
						pixels[pixelOffset + 1] = overlayRgb;
					}
					if (points[indices[shapeOffset++]] != 0)
					{
						pixels[pixelOffset + 2] = overlayRgb;
					}
					if (points[indices[shapeOffset++]] != 0)
					{
						pixels[pixelOffset + 3] = overlayRgb;
					}
					pixelOffset += width;
				}
			}
		}
	}

	@Inject
	@Override
	public int[][][] getRoofs()
	{
		return rl$tiles;
	}

	@Inject
	@Override
	public void setRoofRemovalMode(int roofRemovalMode)
	{
		rl$roofRemovalMode = roofRemovalMode;
	}

	@Inject
	@Override
	public int getRoofRemovalMode()
	{
		return rl$roofRemovalMode;
	}

	@Inject
	@Override
	public void buildRoofs()
	{
		rl$tiles = new int[4][104][104];
		final Tile[][][] tiles = getTiles();
		int var2 = 1;

		for (int plane = 0; plane < 4; ++plane)
		{
			for (int y = 0; y < 104; ++y)
			{
				for (int x = 0; x < 104; ++x)
				{
					Tile tile = tiles[plane][x][y];
					if (tile != null && rl$tiles[plane][x][y] == 0 && blocking(plane, x, y))
					{
						iterateDeque(tile, var2);
						++var2;
					}
				}
			}
		}
	}

	@Inject
	public void iterateDeque(Tile var1, int var2)
	{
		Tile[][][] tiles = getTiles();
		RSNodeDeque tilesDeque = client.getTopLevelWorldView().getScene().getTilesDeque();
		tilesDeque.addFirst((RSNode) var1);

		RSTile rsTile;
		while ((rsTile = (RSTile) tilesDeque.removeLast()) != null)
		{
			int x = rsTile.getX();
			int y = rsTile.getY();
			int plane = rsTile.getPlane();
			if (rl$tiles[plane][x][y] == 0)
			{
				if (blocking(plane, x, y))
				{
					neighbourTile(tilesDeque, tiles, plane, x - 1, y);
					neighbourTile(tilesDeque, tiles, plane, x + 1, y);
					neighbourTile(tilesDeque, tiles, plane, x, y - 1);
					neighbourTile(tilesDeque, tiles, plane, x, y + 1);
					neighbourTile(tilesDeque, tiles, plane, x - 1, y - 1);
					neighbourTile(tilesDeque, tiles, plane, x + 1, y - 1);
					neighbourTile(tilesDeque, tiles, plane, x - 1, y + 1);
					neighbourTile(tilesDeque, tiles, plane, x + 1, y + 1);
				}

				rl$tiles[plane][x][y] = var2;
			}
		}

	}

	@Inject
	public static boolean blocking(int plane, int x, int y)
	{
		return (client.getTileSettings()[plane][x][y] & 4) != 0;
	}

	@Inject
	public static void neighbourTile(RSNodeDeque rsNodeDeque, Tile[][][] tiles, int plane, int x, int y)
	{
		if (x >= 0 && x < 104 && y >= 0 && y < 104)
		{
			Tile tile = tiles[plane][x][y];
			if (tile != null)
			{
				rsNodeDeque.addFirst((RSNode) tile);
			}
		}
	}

	@Inject
	@Override
	public void hoverTile(int x, int y, int plane)
	{
		if (plane == client.getPlane() && !client.isMenuOpen())
		{
			rl$hoverX = x;
			rl$hoverY = y;
		}
	}

	@Inject
	@Override
	public short[][][] getUnderlayIds()
	{
		return rl$underlayIds;
	}

	@Inject
	@Override
	public void setUnderlayIds(short[][][] underlayIds)
	{
		rl$underlayIds = underlayIds;
	}

	@Inject
	@Override
	public short[][][] getOverlayIds()
	{
		return rl$overlayIds;
	}

	@Inject
	@Override
	public void setOverlayIds(short[][][] overlayIds)
	{
		rl$overlayIds = overlayIds;
	}

	@Inject
	@Override
	public byte[][][] getTileShapes()
	{
		return rl$tileShapes;
	}

	@Inject
	@Override
	public void setTileShapes(byte[][][] tileShapes)
	{
		rl$tileShapes = tileShapes;
	}

	@Inject
	@Override
	public void removeWallObject(WallObject wallObject)
	{
		final Tile[][][] tiles = getTiles();

		for (int y = 0; y < 104; ++y)
		{
			for (int x = 0; x < 104; ++x)
			{
				Tile tile = tiles[client.getPlane()][x][y];
				if (tile != null && tile.getWallObject() == wallObject)
				{
					tile.setWallObject(null);
				}
			}
		}
	}

	@Inject
	@Override
	public void removeDecorativeObject(DecorativeObject decorativeObject)
	{
		final Tile[][][] tiles = getTiles();

		for (int y = 0; y < 104; ++y)
		{
			for (int x = 0; x < 104; ++x)
			{
				Tile tile = tiles[client.getPlane()][x][y];
				if (tile != null && tile.getDecorativeObject() == decorativeObject)
				{
					tile.setDecorativeObject(null);
				}
			}
		}
	}

	@Inject
	@Override
	public void removeGroundObject(GroundObject groundObject)
	{
		final Tile[][][] tiles = getTiles();

		for (int y = 0; y < 104; ++y)
		{
			for (int x = 0; x < 104; ++x)
			{
				Tile tile = tiles[client.getPlane()][x][y];
				if (tile != null && tile.getGroundObject() == groundObject)
				{
					tile.setGroundObject(null);
				}
			}
		}
	}

	@Inject
	public static void renderDraw(RSProjection projection, RSRenderable renderable, int orientation, int x, int y, int z, long hash)
	{
		DrawCallbacks drawCallbacks = client.getDrawCallbacks();
		if (drawCallbacks != null)
		{
			drawCallbacks.draw(projection, client.getTopLevelWorldView().getScene(), renderable, orientation, x, y, z, hash);
		}
		else
		{
			projection.draw(renderable, orientation, x, y, z, hash);
		}
	}

	@Copy("drawEntity")
	@Replace("drawEntity")
	public boolean copy$drawEntity(int level, int x, int y, int z, int radius, Renderable renderable, int orientation, long var8, boolean drawFrontTilesFirst)
	{
		if (renderable == null)
		{
			return true;
		}
		else
		{
			if (renderable instanceof RSRuneLiteObject)
			{
				RSRuneLiteObject rSRuneLiteObject = (RSRuneLiteObject) renderable;
				radius = rSRuneLiteObject.getRadius();
				orientation = rSRuneLiteObject.getOrientation();
				drawFrontTilesFirst = rSRuneLiteObject.drawFrontTilesFirst();
			}

			int var11 = x - radius;
			int var12 = y - radius;
			int var13 = radius + x;
			int var14 = y + radius;
			if (drawFrontTilesFirst)
			{
				if (orientation > 640 && orientation < 1408)
				{
					var14 += 128;
				}

				if (orientation > 1152 && orientation < 1920)
				{
					var13 += 128;
				}

				if (orientation > 1664 || orientation < 384)
				{
					var12 -= 128;
				}

				if (orientation > 128 && orientation < 896)
				{
					var11 -= 128;
				}
			}

			var11 /= 128;
			var12 /= 128;
			var13 /= 128;
			var14 /= 128;

			return this.newGameObject(level, var11, var12, var13 - var11 + 1, var14 - var12 + 1, x, y, z, (RSRenderable) renderable, orientation, true, var8, 0);
		}
	}

	@Inject
	@MethodHook("init")
	public void init(int var1)
	{
		final DrawCallbacks drawCallbacks = client.getDrawCallbacks();
		if (drawCallbacks != null)
		{
			drawCallbacks.loadScene(this);
			drawCallbacks.swapScene(this);
		}
	}

	@Inject
	private RSTile[][][] rl$extendedTiles;

	@Inject
	private byte[][][] rl$extendedTileSettings;

	@Inject
	@MethodHook(value = "init", end = true)
	public void initEnd(int var1)
	{
		// create 4x184x184 arrays with default 4x104x104 content
		// this is an attempt to stay compatible with most (gpu) plugins
		// maybe fix this somewhere in the future whoever has time
		rl$extendedTiles = new RSTile[4][184][184];
		rl$extendedTileSettings = new byte[4][184][184];

		// copy original to extended
		for (int z = 0; z < 4; ++z)
		{
			for (int x = 0; x < 104; ++x)
			{
				for (int y = 0; y < 104; ++y)
				{
					RSTile tile = getTiles()[z][x][y];
					if (tile != null)
					{
						rl$extendedTiles[z][x][y] = tile;
						rl$extendedTileSettings[z][x][y] = client.getTileSettings()[z][x][y];
					}
				}
			}
		}
	}

	@Inject
	@Override
	public Tile[][][] getExtendedTiles()
	{
		return rl$extendedTiles;
	}

	@Inject
	@Override
	public byte[][][] getExtendedTileSettings()
	{
		return rl$extendedTileSettings;
	}

	@FieldHook("Scene_offsetOccluder")
	@Inject
	public void onDrawDistanceChanged(int idx)
	{
		client.getLogger().debug("Draw distance changed: {}", this.getOffsetOccluder());
		/*if (this.getOffsetOccluder() == 25)
		{
			this.setOffsetOccluder(90);
		}*/
	}

	@MethodHook(value = "loadRegion", end = true)
	@Inject
	public static final void loadRegion()
	{
		final WorldView worldView = client.getWorldView();
		final RSScene scene = (RSScene) worldView.getScene();
		client.getCallbacks().post(new PreMapLoad(worldView, scene));

		final DrawCallbacks drawCallbacks = client.getDrawCallbacks();
		if (drawCallbacks != null)
		{
			drawCallbacks.loadScene(scene);
			drawCallbacks.loadScene(worldView, scene);
		}
	}

	@Inject
	@Override
	public int[] getMapRegions()
	{
		return client.getMapRegions();
	}

	@Inject
	@Override
	public byte getOverrideAmount()
	{
		return getModelColorOverride().getOverrideAmount();
	}

	@Inject
	@Override
	public byte getOverrideHue()
	{
		return getModelColorOverride().getOverrideHue();
	}

	@Inject
	@Override
	public byte getOverrideSaturation()
	{
		return getModelColorOverride().getOverrideSaturation();
	}

	@Inject
	@Override
	public byte getOverrideLuminance()
	{
		return getModelColorOverride().getOverrideLuminance();
	}
}