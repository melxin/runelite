package net.runelite.rs.api;

import net.runelite.api.worldmap.WorldMapData;
import net.runelite.mapping.Import;

public interface RSWorldMapArea extends WorldMapData, net.runelite.api.WorldMapData
{
	@Import("containsPosition")
	boolean surfaceContainsPosition(int x, int y);
}
