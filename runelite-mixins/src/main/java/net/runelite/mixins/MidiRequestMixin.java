package net.runelite.mixins;

import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.MethodHook;
import net.runelite.api.mixins.Mixin;
import net.runelite.rs.api.RSAbstractArchive;
import net.runelite.rs.api.RSArchive;
import net.runelite.rs.api.RSMidiRequest;

@Mixin(RSMidiRequest.class)
public abstract class MidiRequestMixin implements RSMidiRequest
{
	@Inject
	public boolean isJingleArchiveId;

	@Inject
	@Override
	public boolean isJingle()
	{
		return isJingleArchiveId;
	}

	@MethodHook("playMusicTrack")
	@Inject
	public void onPlayMusicTrack(RSAbstractArchive archive, int groupId, int fileId, int volume, boolean var5)
	{
		RSArchive rsArchive = (RSArchive) archive;
		this.isJingleArchiveId = rsArchive.getIndex() == 11;
	}
}
