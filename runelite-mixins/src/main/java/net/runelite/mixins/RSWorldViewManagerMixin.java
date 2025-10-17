package net.runelite.mixins;

import net.runelite.api.events.WorldViewLoaded;
import net.runelite.api.events.WorldViewUnloaded;
import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.MethodHook;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSTileRenderMode;
import net.runelite.rs.api.RSWorldView;
import net.runelite.rs.api.RSWorldViewManager;

@Mixin(RSWorldViewManager.class)
public abstract class RSWorldViewManagerMixin implements RSWorldViewManager
{
	@Shadow("client")
	private static RSClient client;

	@Copy("createWorldView2")
	@Replace("createWorldView2")
	public RSWorldView copy$onCreateWorldView2(int id, int sizeX, int sizeY, int drawDistance, RSTileRenderMode tileRenderMode)
	{
		final RSWorldView wv = copy$onCreateWorldView2(id, sizeX, sizeY, drawDistance, tileRenderMode);
		client.getCallbacks().post(new WorldViewLoaded(wv));
		return wv;

	}

	@MethodHook("removeWorldView")
	@Inject
	public void onWorldViewRemove(RSWorldView worldView)
	{
		if (worldView == null)
		{
			return;
		}

		client.getCallbacks().post(new WorldViewUnloaded(worldView));

		if (client.getDrawCallbacks() != null)
		{
			client.getDrawCallbacks().despawnWorldView(worldView);
		}
	}
}