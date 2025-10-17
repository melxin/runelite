package net.runelite.rs.api;

import net.runelite.api.CollisionData;
import net.runelite.api.WorldView;
import net.runelite.mapping.Construct;
import net.runelite.mapping.Import;

public interface RSWorldView extends WorldView
{
	@Import("id")
	@Override
	int getId();

	@Import("scene")
	@Override
	RSScene getScene();

	@Import("players")
	RSIndexedObjectSet getRSPlayers();

	@Import("playerUpdateManager")
	RSPlayerUpdateManager getPlayerUpdateManager();

	@Import("npcs")
	RSIndexedObjectSet getRSNpcs();

	//@Import("npcCount")
	//int getNpcCount();

	@Import("worldEntities")
	RSIterableNodeHashTable getRSWorldEntities();

	@Import("groundItems")
	RSNodeDeque[][][] getGroundItems();

	@Import("objectSounds")
	RSNodeDeque getObjectSounds();

	@Import("graphicsObjects")
	@Override
	RSNodeDeque getGraphicsObjects();

	@Import("collisionMaps")
	@Override
	CollisionData[] getCollisionMaps();

	@Import("plane")
	@Override
	int getPlane();

	@Import("tileLastDrawnActor")
	int[][] getOccupiedTilesTick();

	@Import("tileHeights")
	@Override
	int[][][] getTileHeights();

	@Import("tileSettings")
	@Override
	byte[][][] getTileSettings();

	@Import("sizeX")
	@Override
	int getSizeX();

	@Import("sizeY")
	@Override
	int getSizeY();

	@Import("baseX")
	@Override
	int getBaseX();

	@Import("baseY")
	@Override
	int getBaseY();

	@Import("isInInstance")
	@Override
	boolean isInstance();

	@Import("instanceChunkTemplates")
	@Override
	int[][][] getInstanceTemplateChunks();

	void setCanvasProjection(RSProjection projection);

	@Construct
	RSRuneLiteWorldView createRuneLiteWorldView(RSWorldView worldView);
}
