package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSWorldViewManager
{
	@Import("getWorldView")
	RSWorldView getWorldView(int var1);

	@Import("getWorldViewFromWorldPoint")
	RSWorldView getWorldViewFromWorldPoint(int x, int y);

	@Import("worldViews")
	RSIterableNodeHashTable getWorldViews();
}