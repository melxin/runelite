package net.runelite.rs.api;

import net.runelite.api.IntProjection;
import net.runelite.mapping.Import;

public interface RSIntProjection extends IntProjection
{
	@Import("cameraX")
	@Override
	int getCameraX();

	@Import("cameraX")
	void setCameraX(int cameraX);

	@Import("cameraY")
	@Override
	int getCameraY();

	@Import("cameraY")
	void setCameraY(int cameraY);

	@Import("cameraZ")
	@Override
	int getCameraZ();

	@Import("cameraZ")
	void setCameraZ(int cameraZ);

	@Import("cameraPitch")
	int getCameraPitch();

	@Import("cameraPitch")
	void setCameraPitch(int cameraPitch);

	@Import("cameraYaw2")
	int getCameraYaw();

	@Import("cameraYaw2")
	void setCameraYaw(int cameraYaw);

	@Import("pitchSin")
	@Override
	float getPitchSin();

	@Import("pitchSin")
	void setPitchSin(float pitchSin);

	@Import("pitchCos")
	@Override
	float getPitchCos();

	@Import("pitchCos")
	void setPitchCos(float pitchCos);

	@Import("yawSin")
	@Override
	float getYawSin();

	@Import("yawSin")
	void setYawSin(float yawSin);

	@Import("yawCos")
	@Override
	float getYawCos();

	@Import("yawCos")
	void setYawCos(float yawCos);
}
