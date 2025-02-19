package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSWorldViewManager
{
	@Import("getWorldView")
	RSWorldView getWorldView(int var1);
}
