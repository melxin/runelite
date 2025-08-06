package net.runelite.rs.api;

import net.runelite.api.ActorSpotAnim;
import net.runelite.mapping.Import;

public interface RSActorSpotAnim extends ActorSpotAnim
{
	@Import("id")
	@Override
	int getId();

	@Import("id")
	@Override
	void setId(int id);

	@Import("height")
	@Override
	int getHeight();

	@Import("height")
	@Override
	void setHeight(int id);

	@Import("animationSequence")
	RSAnimationSequence getAnimationSequence();

	//@Import("spotAnimationFrame")
	//@Override
	//int getFrame();

	//@Import("spotAnimationFrame")
	//@Override
	//void setFrame(int id);

	//@Import("spotAnimationFrameCycle")
	//@Override
	//int getCycle();

	//@Import("spotAnimationFrameCycle")
	//@Override
	//void setCycle(int cycle);
}