package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSHintArrow
{
	@Import("targetType")
	void setTargetType(int value);

	@Import("targetType")
	int getTargetType();

	@Import("targetIndex")
	int getTargetIndex();

	@Import("targetIndex")
	void setTargetIndex(int idx);

	@Import("x")
	void setX(int value);

	@Import("x")
	int getX();

	@Import("y")
	void setY(int value);

	@Import("y")
	int getY();

	@Import("subX")
	void setOffsetX(int value);

	@Import("subY")
	void setOffsetY(int value);
}
