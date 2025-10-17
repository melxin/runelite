package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSProjectionCoord
{
	@Import("x")
	float getX();

	@Import("z")
	float getZ();

	@Import("y")
	float getY();

	@Import("release")
	void release();
}
