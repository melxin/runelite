/*
 * Copyright (c) 2025, Melxin <https://github.com/melxin>
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

import net.runelite.api.coords.LocalPoint;
import net.runelite.api.events.WorldEntitySpawned;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.MethodHook;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSProjectionCoord;
import net.runelite.rs.api.RSWorldEntity;
import net.runelite.rs.api.RSWorldView;

@Mixin(RSWorldEntity.class)
public abstract class RSWorldEntityMixin implements RSWorldEntity
{
	@Shadow("client")
	private static RSClient client;

	@MethodHook(value = "<init>", end = true)
	@Inject
	public void rl$init(int var1, RSWorldView worldView)
	{
		client.getCallbacks().post(new WorldEntitySpawned(this));
	}

	@Inject
	@Override
	public LocalPoint getCameraFocus()
	{
		return getLocalLocation();
	}

	@Inject
	@Override
	public LocalPoint getLocalLocation()
	{
		return new LocalPoint(this.getWorldEntityCoord().getX(), this.getWorldEntityCoord().getY(), -1);
	}

	@Inject
	@Override
	public LocalPoint transformToMainWorld(LocalPoint var1)
	{
		if (var1.getWorldView() != this.getPlane())
		{
			throw new IllegalArgumentException("LocalPoint doesn't belong to this WorldEntity");
		}
		else
		{
			final RSProjectionCoord pc = this.getProjectionCoord(var1.getX(), var1.getY());
			LocalPoint lp = new LocalPoint((int) pc.getX(), (int) pc.getY(), -1);
			pc.release();
			return lp;
		}
	}

	@Inject
	@Override
	public boolean isHiddenForOverlap()
	{
		return isDefaultScale((short) -18801);
	}

	@Inject
	public boolean isDefaultScale(short var1)
	{
		if (0.01F == this.getWorldView().getScene().getSceneScale())
		{
			if (var1 >= 196)
			{
			}
			return true;
		}
		return false;
	}
}