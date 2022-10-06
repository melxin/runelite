/*
 * Copyright (c) 2018, Adam <Adam@sigterm.info>
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

import java.awt.event.MouseWheelEvent;
import static net.runelite.api.Perspective.SCENE_SIZE;
import net.runelite.api.SpritePixels;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.api.mixins.Shadow;
import net.runelite.api.widgets.Widget;
import net.runelite.mapping.Export;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSMouseWheelHandler;
import net.runelite.rs.api.RSScene;
import net.runelite.rs.api.RSSpriteMask;
import net.runelite.rs.api.RSSpritePixels;
import net.runelite.rs.api.RSWidget;

@Mixin(RSClient.class)
public abstract class MinimapMixin implements RSClient
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	private static boolean rl$minimapReceivesClicks = true;

	@Copy("checkIfMinimapClicked")
	@Replace("checkIfMinimapClicked")
	public static void copy$checkIfMinimapClicked(Widget var0, int var1, int var2)
	{
		if (!rl$minimapReceivesClicks)
		{
			return;
		}

		copy$checkIfMinimapClicked(var0, var1, var2);
	}

	@Inject
	@Override
	public void setMinimapReceivesClicks(boolean minimapReceivesClicks)
	{
		rl$minimapReceivesClicks = minimapReceivesClicks;
	}

	@Inject
	@Override
	public RSSpritePixels drawInstanceMap(int z)
	{
		RSSpritePixels ourSprite = createSpritePixels(new int[512 * 512], 512, 512);
		RSSpritePixels theirSprite = getMinimapSprite();

		RSScene scene = getScene();
		int[] pixels = ourSprite.getPixels();
		byte[][][] tileSettings = getTileSettings();

		try
		{
			setMinimapSprite(ourSprite);

			int var4;
			for (int x = 1; x < SCENE_SIZE - 1; ++x)
			{
				var4 = (103 - x) * 2048 + 24628;

				for (int y = 1; y < SCENE_SIZE - 1; ++y)
				{
					if ((tileSettings[z][y][x] & 24) == 0)
					{
						scene.drawTile(pixels, var4, 512, z, y, x);
					}

					if (z < 3 && (tileSettings[z + 1][y][x] & 8) != 0)
					{
						scene.drawTile(pixels, var4, 512, z + 1, y, x);
					}

					var4 += 4;
				}
			}

			int color1 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
			int color2 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
			ourSprite.setRaster();

			for (int y = 1; y < SCENE_SIZE - 1; ++y)
			{
				for (int x = 1; x < SCENE_SIZE - 1; ++x)
				{
					if ((tileSettings[z][x][y] & 24) == 0)
					{
						drawObject(z, x, y, color1, color2);
					}

					if (z < 3 && (tileSettings[z + 1][x][y] & 8) != 0)
					{
						drawObject(z + 1, x, y, color1, color2);
					}
				}
			}
		}
		finally
		{
			getBufferProvider().setRaster();
			setMinimapSprite(theirSprite);
		}

		return ourSprite;
	}

	@Inject
	private static boolean rl$minimapZoom;

	@Inject
	private static double rl$minimapZoomValue = 4.0;

	@Inject
	@Override
	public boolean isMinimapZoom()
	{
		return rl$minimapZoom;
	}

	@Inject
	@Override
	public void setMinimapZoom(boolean minimapZoom)
	{
		rl$minimapZoom = minimapZoom;
		client.getLogger().info("Minimap zoom toggled");
	}

	@Inject
	@Override
	public double getMinimapZoom()
	{
		return rl$minimapZoomValue;
	}

	@Inject
	@Override
	public void setMinimapZoom(double minimapZoom)
	{
		rl$minimapZoomValue = minimapZoom;
	}

	//@Copy("drawMinimap")
	//@Replace("drawMinimap")
	public static void copy$drawMinimap(RSWidget var0, int x, int y, int var3)
	{
		int minimapState = client.getMinimapState();
		if (client.isMinimapZoom() && minimapState != 2 && minimapState != 5)
		{
			RSSpriteMask rSSpriteMask = var0.getSpriteMask(false);
			if (rSSpriteMask != null)
			{
				LocalPoint localPoint = client.getLocalPlayer().getLocalLocation();
				int j = client.getCameraYaw() & 0x7FF;

				try
				{
					double d1 = client.getMinimapZoom();
					double d2 = d1 / 128.0D;
					int k = Math.max(rSSpriteMask.getWidth(), rSSpriteMask.getHeight()) * 3 / 2;
					if (client.getMinimapSprite() == null || client.getMinimapSprite().getWidth() != k)
					{
						client.setMinimapSprite(client.createSpritePixels(new int[k * k], k, k));
					}

					int m = (int)((k / 2) / d2);
					int n = localPoint.getX() - m;
					int i1 = localPoint.getY() - m;
					int i2 = Math.max(0, n / 128);
					int i3 = Math.max(0, i1 / 128);
					//client.tj(client.getMinimapSprite(), d1, client.getPlane(), i2, i3, (int)((i2 * 128 - n) * d2), (int)((i3 * 128 - i1) * d2));
					client.getMinimapSprite().drawRotatedMaskedCenteredAround(x, y, rSSpriteMask.getWidth(), rSSpriteMask.getHeight(), k / 2, k / 2, j, 256, rSSpriteMask.getXStarts(), rSSpriteMask.getXWidths());
				}
				catch (Exception exception)
				{
					client.getLogger().debug("minimap", exception);
				}

				float f = (float)client.getMinimapZoom() / 128.0F;
				//client.zo(var0, x, y, f);
			}

		}
		else
		{
			copy$drawMinimap(var0, x, y, var3);
		}
	}

	@Copy("drawSpriteOnMinimap")
	@Replace("drawSpriteOnMinimap")
	public static void copy$drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, RSSpriteMask var5)
	{
		copy$drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5);
	}
}
