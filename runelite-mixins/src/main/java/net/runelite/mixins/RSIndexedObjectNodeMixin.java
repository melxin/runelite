package net.runelite.mixins;

import net.runelite.api.Player;
import net.runelite.api.events.PlayerDespawned;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.MethodHook;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSIndexedObjectNode;
import net.runelite.rs.api.RSNPC;
import net.runelite.rs.api.RSPlayer;
import net.runelite.rs.api.RSWorldView;

@Mixin(RSIndexedObjectNode.class)
public abstract class RSIndexedObjectNodeMixin implements RSIndexedObjectNode
{
	@Shadow("client")
	private static RSClient client;

	@MethodHook("detach")
	@Inject
	public void onDetach()
	{
		if (this instanceof RSPlayer)
		{
			client.getCallbacks().postDeferred(new PlayerDespawned((Player) this));
		}
	}

	@MethodHook(value = "detach", end = true)
	@Inject
	public void onDetachEnd()
	{
		RSWorldView wv = client.getTopLevelWorldView();
		if (wv == null)
		{
			return;
		}

		if (this instanceof RSPlayer)
		{
			wv.setCachedPlayers(wv.getPlayers());
		}
		else if (this instanceof RSNPC)
		{
			wv.setCachedNpcs(wv.getNpcs());
		}
	}
}
