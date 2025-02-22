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
import net.runelite.rs.api.RSWorldView;

@Mixin(RSIndexedObjectSet.class)
public abstract class RSIndexedObjectSetMixin implements RSIndexedObjectSet
{
	@Shadow("client")
	private static RSClient client;

	@MethodHook("add")
	@Inject
	public void onAdd(RSIndexedObjectNode node, long idx)
	{
		if (node instanceof RSPlayer)
		{
			client.getCallbacks().postDeferred(new PlayerSpawned((Player) node));
		}
		else if (node instanceof RSNPC)
		{
			client.getCallbacks().postDeferred(new NpcSpawned((NPC) node));
		}
	}

	@MethodHook(value = "add", end = true)
	@Inject
	public void onAddEnd(RSIndexedObjectNode node, long idx)
	{
		RSWorldView wv = client.getTopLevelWorldView();
		if (wv == null)
		{
			return;
		}

		if (node instanceof RSPlayer)
		{
			wv.setCachedPlayers(wv.getPlayers());
		}
		else if (node instanceof RSNPC)
		{
			wv.setCachedNpcs(wv.getNpcs());
		}
	}
}
