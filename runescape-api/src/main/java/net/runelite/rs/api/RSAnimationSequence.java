package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSAnimationSequence
{
	@Import("id")
	int getId();

	@Import("id")
	void setId(int id);

	@Import("sequenceDefinition")
	RSSequenceDefinition getSequenceDefinition();

	@Import("frameCycle")
	int getFrameCycle();

	@Import("frameCycle")
	void setFrameCycle(int frameCycle);

	@Import("frame")
	int getFrame();

	@Import("frame")
	void setFrame(int frame);

	@Import("reset")
	void reset();

	@Import("isActive")
	boolean isActive();

	RSActor getActor();
	void setActor(RSActor actor);
}
