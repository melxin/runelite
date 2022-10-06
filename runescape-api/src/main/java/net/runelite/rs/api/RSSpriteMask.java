package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSSpriteMask
{
	@Import("contains")
	boolean contains(int paramInt1, int paramInt2);

	@Import("width")
	int getWidth();

	@Import("height")
	int getHeight();

	@Import("xStarts")
	int[] getXStarts();

	@Import("xWidths")
	int[] getXWidths();
}
