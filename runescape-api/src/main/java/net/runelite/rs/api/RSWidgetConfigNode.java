package net.runelite.rs.api;

import net.runelite.api.widgets.WidgetConfigNode;
import net.runelite.mapping.Import;

public interface RSWidgetConfigNode extends WidgetConfigNode
{
	@Import("clickMask")
	@Override
	int getClickMask();

	@Import("opMask")
	@Override
	int getOpMask();

	@Import("start")
	int getStart();

	@Import("end")
	int getEnd();

	@Import("nextWidgetConfigNode")
	RSWidgetConfigNode getNextWidgetConfigNode();
}
