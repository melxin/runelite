package net.runelite.rs.api;

import net.runelite.api.WorldEntity;
import net.runelite.mapping.Import;

public interface RSWorldEntity extends WorldEntity, RSCameraFocusableEntity
{
	@Import("plane")
	int getPlane();

	@Import("worldView")
	@Override
	RSWorldView getWorldView();

	@Import("worldEntityCoord")
	RSWorldEntityCoord getWorldEntityCoord();

	@Import("getProjectionCoord")
	RSProjectionCoord getProjectionCoord(int var1, int var2);
}
