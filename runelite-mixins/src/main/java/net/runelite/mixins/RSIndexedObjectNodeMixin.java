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

			client.removeCachedPlayer((RSPlayer) this);
		}
		else if (this instanceof RSNPC)
		{
			client.removeCachedNpc((RSNPC) this);
		}
	}
}
