/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.mixins;

import net.runelite.api.Actor;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.events.ProjectileMoved;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.MethodHook;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSProjectile;
import net.runelite.rs.api.RSWorldView;
import net.runelite.rs.api.RSWorldViewManager;

@Mixin(RSProjectile.class)
public abstract class RSProjectileMixin implements RSProjectile
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	RSProjectileMixin()
	{
		final ProjectileSpawned projectileSpawned = new ProjectileSpawned();
		projectileSpawned.setProjectile(this);
		client.getCallbacks().post(projectileSpawned);
	}

	@Inject
	@MethodHook("setDestination")
	public void projectileMoved(RSWorldViewManager var1, int var2, int var3)
	{
		if (var2 >= this.getStartCycle())
		{
			LocalPoint position = new LocalPoint(this.getTargetX(), this.getTargetY(), client.getTopLevelWorldView());
			ProjectileMoved projectileMoved = new ProjectileMoved();
			projectileMoved.setProjectile(this);
			projectileMoved.setPosition(position);
			projectileMoved.setZ(this.getEndHeight());
			client.getCallbacks().post(projectileMoved);
		}
	}

	@Inject
	@Override
	public int getRemainingCycles()
	{
		int currentGameCycle = client.getGameCycle();

		return getEndCycle() - currentGameCycle;
	}

	@Inject
	@Override
	public LocalPoint getSourcePoint()
	{
		return new LocalPoint((this.getSourceX() << 7) + 64, (this.getSourceY() << 7) + 64, client.getTopLevelWorldView());
	}

	public LocalPoint getTargetPoint()
	{
		return new LocalPoint((this.getTargetX() << 7) + 64, (this.getTargetY() << 7) + 64, client.getTopLevelWorldView());
	}

	@Inject
	@Override
	public Actor getSourceActor()
	{
		final int sourceIndex = this.getSourceIndex();
		if (sourceIndex == 0)
		{
			return null;
		}

		final RSWorldView wv = client.getTopLevelWorldView();
		if (sourceIndex > 0)
		{
			int idx = sourceIndex - 1;
			return (Actor) wv.getRSNpcs().get(idx);
		}
		else
		{
			int idx = -sourceIndex - 1;

			if (idx == client.getLocalPlayerIndex())
			{
				return client.getLocalPlayer();
			}

			return (Actor) wv.getRSPlayers().get(idx);
		}
	}


	@Inject
	@Override
	public Actor getTargetActor()
	{
		final int interactingIndex = this.getRsInteracting();
		if (interactingIndex == 0)
		{
			return null;
		}

		final RSWorldView wv = client.getTopLevelWorldView();
		if (interactingIndex > 0)
		{
			final int idx = interactingIndex - 1;
			return (Actor) wv.getRSNpcs().get(idx);
		}
		else
		{
			final int idx = -interactingIndex - 1;

			if (idx == client.getLocalPlayerIndex())
			{
				return client.getLocalPlayer();
			}

			return (Actor) wv.getRSPlayers().get(idx);
		}
	}

	@Inject
	private RSWorldView worldView;

	@Inject
	@Override
	public RSWorldView getWorldView()
	{
		return worldView;
	}

	@Inject
	@Override
	public void setWorldView(RSWorldView worldView)
	{
		this.worldView = worldView;
	}
}
