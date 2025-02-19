package net.runelite.rs.api;

import net.runelite.api.IndexedObjectSet;
import net.runelite.mapping.Import;

public interface RSIndexedObjectSet extends IndexedObjectSet
{
	@Import("size")
	int getSize();

	@Import("get")
	RSIndexedObjectNode get(long index);

	@Override
	default RSIndexedObjectNode byIndex(int index)
	{
		return get(index);
	}
}
