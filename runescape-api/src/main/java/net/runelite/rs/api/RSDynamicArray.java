package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSDynamicArray
{
	@Import("size")
	int getSize();

	@Import("array")
	int[] getArray();
}
