package net.runelite.mixins;

import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.rs.api.RSActorSpotAnim;

@Mixin(RSActorSpotAnim.class)
public abstract class RSActorSpotAnimMixin implements RSActorSpotAnim
{
	@Inject
	@Override
	public int getFrame()
	{
		return getAnimationSequence().getFrame();
	}

	@Inject
	@Override
	public void setFrame(int frame)
	{
		this.getAnimationSequence().setFrame(frame);
	}

	@Inject
	@Override
	public int getCycle()
	{
		return getAnimationSequence().getFrame();
	}

	@Inject
	@Override
	public void setCycle(int frameCycle)
	{
		this.getAnimationSequence().setFrameCycle(frameCycle);
	}
}
