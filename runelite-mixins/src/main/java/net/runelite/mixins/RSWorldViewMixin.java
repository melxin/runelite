package net.runelite.mixins;

import net.runelite.api.Actor;
import net.runelite.api.IndexedObjectSet;
import net.runelite.api.NPC;
import net.runelite.api.ObjectComposition;
import net.runelite.api.Player;
import net.runelite.api.Projectile;
import net.runelite.api.WorldEntity;
import net.runelite.api.events.AmbientSoundEffectCreated;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.MethodHook;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSObjectSound;
import net.runelite.rs.api.RSScene;
import net.runelite.rs.api.RSTile;
import net.runelite.rs.api.RSWorldView;

@Mixin(RSWorldView.class)
public abstract class RSWorldViewMixin implements RSWorldView
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	@Override
	public boolean isTopLevel()
	{
		return getId() == -1;
	}

	@Inject
	@Override
	public IndexedObjectSet<? extends Player> players()
	{
		assert client.isClientThread() : "players must be called on client thread";
		return getRSPlayers();
	}

	@Inject
	@Override
	public IndexedObjectSet<? extends NPC> npcs()
	{
		assert client.isClientThread() : "npcs must be called on client thread";
		return getRSNpcs();
	}

	@Inject
	@Override
	public IndexedObjectSet<? extends WorldEntity> worldEntities()
	{
		assert client.isClientThread() : "worldEntities must be called on client thread";
		return getRSWorldEntities();
	}

	@Inject
	@Override
	public RSTile getSelectedSceneTile()
	{
		RSScene scene = this.getScene();
		int x = scene.getBaseX();
		int y = scene.getBaseY();
		return x != -1 && y != -1 ? scene.getTiles()[this.getPlane()][x][y] : null;
	}

	@Inject
	@Override
	public Projectile createProjectile(int id, int plane, int startX, int startY, int startZ, int startCycle, int endCycle, int slope, int startHeight, int endHeight, Actor target, int targetX, int targetY)
	{
		return client.createProjectile(id, plane, startX, startY, startZ, startCycle, endCycle, slope, startHeight, endHeight, target, targetX, targetY);
	}

	@Inject
	@Override
	public int[] getMapRegions()
	{
		return client.getMapRegions();
	}

	@Inject
	@MethodHook(value = "createObjectSound", end = true)
	public void onAmbientSoundEffect(int var0, int var1, int var2, ObjectComposition var3, int var4)
	{
		RSObjectSound ambientSoundEffect = (RSObjectSound) client.getAmbientSoundEffects().last();
		AmbientSoundEffectCreated ambientSoundEffectCreated = new AmbientSoundEffectCreated(ambientSoundEffect);
		client.getCallbacks().post(ambientSoundEffectCreated);
	}
}