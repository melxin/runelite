package net.runelite.rs.api;

import net.runelite.api.IterableHashTable;
import net.runelite.api.NPCComposition;
import net.runelite.mapping.Import;

public interface RSNPCComposition extends NPCComposition
{
	@Import("name")
	@Override
	String getName();

	@Import("models")
	@Override
	int[] getModels();

	@Import("chatHeadModels")
	@Override
	int[] getChatheadModels();

	@Import("actions")
	@Override
	String[] getActions();

	@Import("isClipped")
	boolean isClipped();

	@Import("isFollower")
	@Override
	boolean isFollower();

	@Import("lowPriorityFollowerOps")
	boolean isLowPriorityFollowerOps();

	@Import("isInteractable")
	@Override
	boolean isInteractible();

	@Import("drawMapDot")
	@Override
	boolean isMinimapVisible();

	//@Import("isVisible")
	//@Override
	//boolean isVisible();

	@Import("id")
	@Override
	int getId();

	@Import("combatLevel")
	@Override
	int getCombatLevel();

	@Import("transforms")
	@Override
	int[] getConfigs();

	@Import("transform")
	@Override
	RSNPCComposition transform();

	@Import("size")
	@Override
	int getSize();

	@Import("recolorFrom")
	@Override
	short[] getColorToReplace();

	@Import("recolorTo")
	@Override
	short[] getColorToReplaceWith();

	@Import("retextureFrom")
	short[] getTextureToReplace();

	@Import("retextureFrom")
	void setTextureToReplace(short[] texture);

	@Import("widthScale")
	@Override
	int getWidthScale();

	@Import("heightScale")
	@Override
	int getHeightScale();

	@Import("headIconArchiveIds")
	int[] getHeadIconArchiveIds();

	@Import("headIconSpriteIndex")
	short[] getHeadIconSpriteIndexes();

	@Import("params")
	RSIterableNodeHashTable getParams();

	@Import("params")
	void setParams(IterableHashTable params);

	@Import("params")
	void setParams(RSIterableNodeHashTable params);

	@Import("footprintSize")
	@Override
	int getFootprintSize();

	@Import("stats")
	@Override
	int[] getStats();
}
