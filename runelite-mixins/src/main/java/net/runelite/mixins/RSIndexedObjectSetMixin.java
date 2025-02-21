package net.runelite.mixins;

import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.events.PlayerSpawned;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.MethodHook;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSIndexedObjectNode;
import net.runelite.rs.api.RSIndexedObjectSet;
import net.runelite.rs.api.RSNPC;
import net.runelite.rs.api.RSPlayer;

@Mixin(RSIndexedObjectSet.class)
public abstract class RSIndexedObjectSetMixin implements RSIndexedObjectSet
{
	@Shadow("client")
	private static RSClient client;

	@MethodHook("add")
	@Inject
	public void onAdd(RSIndexedObjectNode node, long idx)
	{
		if (node instanceof RSNPC)
		{
			client.getCallbacks().postDeferred(new NpcSpawned((NPC) node));
		}
		else if (node instanceof RSPlayer)
		{
			client.getCallbacks().postDeferred(new PlayerSpawned((Player) node));
		}
	}
}
