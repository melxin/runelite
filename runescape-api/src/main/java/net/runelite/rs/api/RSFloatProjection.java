package net.runelite.rs.api;

import net.runelite.api.FloatProjection;
import net.runelite.mapping.Import;

public interface RSFloatProjection extends FloatProjection
{
	@Import("projection")
	@Override
	float[] getProjection();
}
