package net.runelite.mixins;

import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.MethodHook;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSWorldView;
import net.runelite.rs.api.RSWorldViewManager;

@Mixin(RSWorldViewManager.class)
public abstract class RSWorldViewManagerMixin implements RSWorldViewManager
{
	@Shadow("client")
	private static RSClient client;

	@MethodHook("removeWorldView")
	@Inject
	public void onWorldViewRemove(RSWorldView worldView)
	{
		if (worldView != null && client.getDrawCallbacks() != null)
		{
			client.getDrawCallbacks().despawnWorldView(worldView);
		}
	}
}