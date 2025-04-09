import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nr")
@Implements("MidiRequest")
public class MidiRequest {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("musicTrackArchive")
	public AbstractArchive musicTrackArchive;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -652555527
	)
	@Export("musicTrackGroupId")
	public int musicTrackGroupId;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -794490939
	)
	@Export("musicTrackFileId")
	public int musicTrackFileId;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1748337339
	)
	@Export("musicTrackVolume")
	public int musicTrackVolume;
	@ObfuscatedName("as")
	public float field3815;
	@ObfuscatedName("aq")
	@Export("musicTrackBoolean")
	public boolean musicTrackBoolean;
	@ObfuscatedName("av")
	public boolean field3820;
	@ObfuscatedName("am")
	public boolean field3818;
	@ObfuscatedName("aa")
	public boolean field3819;
	@ObfuscatedName("ap")
	boolean field3814;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("midiPcmStream")
	public MidiPcmStream midiPcmStream;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lbt;"
	)
	public SoundCache field3822;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	public MusicTrack field3823;

	@ObfuscatedSignature(
		descriptor = "(Lph;Ljava/lang/String;Ljava/lang/String;IZ)V"
	)
	public MidiRequest(AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
		this.musicTrackGroupId = -1;
		this.musicTrackFileId = -1;
		this.musicTrackVolume = 0;
		this.field3815 = 0.0F;
		this.musicTrackBoolean = false;
		this.field3819 = false;
		this.field3814 = false;
		this.musicTrackGroupId = var1.getGroupId(var2);
		this.musicTrackFileId = var1.getFileId(this.musicTrackGroupId, var3);
		this.playMusicTrack(var1, this.musicTrackGroupId, this.musicTrackFileId, var4, var5);
	}

	@ObfuscatedSignature(
		descriptor = "(Lph;IIIZ)V"
	)
	public MidiRequest(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.musicTrackGroupId = -1;
		this.musicTrackFileId = -1;
		this.musicTrackVolume = 0;
		this.field3815 = 0.0F;
		this.musicTrackBoolean = false;
		this.field3819 = false;
		this.field3814 = false;
		this.playMusicTrack(var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lph;IIIZB)V",
		garbageValue = "-1"
	)
	@Export("playMusicTrack")
	void playMusicTrack(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.musicTrackArchive = var1;
		this.musicTrackGroupId = var2;
		this.musicTrackFileId = var3;
		this.musicTrackVolume = var4;
		this.musicTrackBoolean = var5;
	}
}
