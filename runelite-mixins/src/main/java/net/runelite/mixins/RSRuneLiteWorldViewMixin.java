package net.runelite.mixins;

import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSRuneLiteWorldView;

@Mixin(RSRuneLiteWorldView.class)
public abstract class RSRuneLiteWorldViewMixin implements RSRuneLiteWorldView
{
	@Shadow("client")
	private static RSClient client;
}