package net.runelite.mixins;

import net.runelite.api.coords.LocalPoint;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSGraphicsObject;
import net.runelite.rs.api.RSSequenceDefinition;

@Mixin(RSGraphicsObject.class)
public abstract class RSGraphicsObjectMixin implements RSGraphicsObject
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	RSGraphicsObjectMixin()
	{
		final GraphicsObjectCreated event = new GraphicsObjectCreated(this);
		client.getCallbacks().post(event);
	}

	@Override
	@Inject
	public LocalPoint getLocation()
	{
		return new LocalPoint(this.getX(), this.getY());
	}


	/*@Copy("advance")
	@Replace("advance")
	public void copy$advance(int var1)
	{
		copy$advance(var1);

		if (this instanceof RuneLiteObject)
		{
			((RSRuneLiteObject) this).advanceRL(var1);
		}
	}


	@Copy("getModel")
	@Replace("getModel")
	public RSModel copy$getModel()
	{
		if (this instanceof RuneLiteObject)
		{
			return ((RSRuneLiteObject) this).getModelRl();
		}
		else
		{
			return copy$getModel();
		}
	}*/

	@Inject
	@Override
	public boolean finished()
	{
		return this.getAnimationSequence().getSequenceDefinition() == null;
	}

	@Inject
	@Override
	public void setFinished(boolean finished)
	{
		this.getAnimationSequence().reset();
	}


	@Inject
	@Override
	public int getAnimationFrame()
	{
		return this.getAnimationSequence().getFrame();
	}

	@Inject
	@Override
	public RSSequenceDefinition getAnimation()
	{
		return this.getAnimationSequence().getSequenceDefinition();
	}
}
