package net.runelite.rs.api;

import net.runelite.api.MidiRequest;
import net.runelite.mapping.Import;

public interface RSMidiRequest extends MidiRequest
{
	@Import("midiPcmStream")
	RSMidiPcmStream getMidiPcmStream();

	@Import("musicTrackArchive")
	void setMusicTrackArchive(RSAbstractArchive var0);

	@Import("musicTrackGroupId")
	int getMusicTrackGroupId();

	@Import("musicTrackGroupId")
	void setMusicTrackGroupId(int var0);

	@Import("musicTrackFileId")
	int getMusicTrackFileId();

	@Import("musicTrackFileId")
	void setMusicTrackFileId(int var0);

	@Import("musicTrackFileId")
	@Override
	int getArchiveId();

	@Import("musicTrackVolume")
	void setMusicTrackVolume(int volume);

	@Import("musicTrackBoolean")
	void setMusicTrackBoolean(boolean var0);

	//@Import("pcmSampleLength")
	//void setPcmSampleLength(int var0);

	@Import("playMusicTrack")
	void playMusicTrack(RSAbstractArchive archive, int groupId, int fileId, int volume, boolean var5);
}
