package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSNPCOverheadIcons
{
	@Import("overheadArchiveIds")
	int[] getOverheadArchiveIds();

	@Import("overheadSpriteIds")
	short[] getOverheadSpriteIds();
}
