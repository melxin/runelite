package net.runelite.rs.api;

import net.runelite.api.NPC;
import net.runelite.api.NpcOverrides;
import net.runelite.mapping.Import;

public interface RSNPC extends RSActor, NPC
{
	@Import("definition")
	@Override
	RSNPCComposition getComposition();

	@Import("definition")
	void setComposition(RSNPCComposition composition);

	@Import("modelOverrides")
	@Override
	NpcOverrides getModelOverrides();

	@Import("chatheadOverrides")
	@Override
	NpcOverrides getChatheadOverrides();
}
