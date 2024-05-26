package net.runelite.rs.api;

import net.runelite.api.Projection;
import net.runelite.mapping.Import;

public interface RSProjection extends Projection
{
	//float[] project(int x, int y, int z);

	@Import("draw")
	void draw(RSRenderable var1, int orientation, int x, int y, int z, long hash);
}
