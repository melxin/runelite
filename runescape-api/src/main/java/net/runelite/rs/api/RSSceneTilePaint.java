package net.runelite.rs.api;

import net.runelite.api.SceneTilePaint;
import net.runelite.mapping.Import;

public interface RSSceneTilePaint extends SceneTilePaint
{
	@Import("rgb")
	@Override
	int getRBG();

	@Import("rgb")
	void setRBG(int val);

	@Import("swColor")
	@Override
	int getSwColor();

	@Import("swColor")
	@Override
	void setSwColor(int val);

	@Import("seColor")
	@Override
	int getSeColor();

	@Import("seColor")
	@Override
	void setSeColor(int val);

	@Import("nwColor")
	@Override
	int getNwColor();

	@Import("nwColor")
	@Override
	void setNwColor(int val);

	@Import("neColor")
	@Override
	int getNeColor();

	@Import("neColor")
	@Override
	void setNeColor(int val);

	@Import("texture")
	@Override
	int getTexture();

	@Import("texture")
	@Override
	void setTexture(int val);

	@Import("isFlat")
	@Override
	boolean isFlat();

	@Import("isFlat")
	void setIsFlat(boolean val);
}
