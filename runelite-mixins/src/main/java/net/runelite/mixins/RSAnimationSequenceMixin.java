package net.runelite.mixins;

import net.runelite.api.events.AnimationChanged;
import net.runelite.api.mixins.FieldHook;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSActor;
import net.runelite.rs.api.RSAnimationSequence;
import net.runelite.rs.api.RSClient;

@Mixin(RSAnimationSequence.class)
public abstract class RSAnimationSequenceMixin implements RSAnimationSequence
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	private RSActor actor;

	@Inject
	@Override
	public RSActor getActor()
	{
		return actor;
	}

	@Inject
	@Override
	public void setActor(RSActor actor)
	{
		this.actor = actor;
	}


	@Inject
	@FieldHook("id")
	public void animationChanged(int idx)
	{
		if (actor != null)
		{
			final AnimationChanged animationChanged = new AnimationChanged();
			animationChanged.setActor(actor);
			client.getCallbacks().post(animationChanged);
		}
	}
}
