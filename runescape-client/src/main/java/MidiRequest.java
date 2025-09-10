import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nx")
@Implements("MidiRequest")
public class MidiRequest {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("musicTrackArchive")
	public AbstractArchive musicTrackArchive;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1633172061
	)
	@Export("musicTrackGroupId")
	public int musicTrackGroupId;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1874982089
	)
	@Export("musicTrackFileId")
	public int musicTrackFileId;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 300103545
	)
	@Export("musicTrackVolume")
	public int musicTrackVolume;
	@ObfuscatedName("ap")
	public float field4002;
	@ObfuscatedName("aq")
	@Export("musicTrackBoolean")
	public boolean musicTrackBoolean;
	@ObfuscatedName("ao")
	public boolean field4008;
	@ObfuscatedName("as")
	public boolean field4009;
	@ObfuscatedName("al")
	public boolean field4010;
	@ObfuscatedName("au")
	boolean field4011;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	@Export("midiPcmStream")
	public MidiPcmStream midiPcmStream;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	public SoundCache field4006;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	public MusicTrack field4003;

	@ObfuscatedSignature(
		descriptor = "(Lpx;Ljava/lang/String;Ljava/lang/String;IZ)V"
	)
	public MidiRequest(AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
		this.musicTrackGroupId = -1;
		this.musicTrackFileId = -1;
		this.musicTrackVolume = 0;
		this.field4002 = 0.0F;
		this.musicTrackBoolean = false;
		this.field4010 = false;
		this.field4011 = false;
		this.musicTrackGroupId = var1.getGroupId(var2);
		this.musicTrackFileId = var1.getFileId(this.musicTrackGroupId, var3);
		this.playMusicTrack(var1, this.musicTrackGroupId, this.musicTrackFileId, var4, var5);
	}

	@ObfuscatedSignature(
		descriptor = "(Lpx;IIIZ)V"
	)
	public MidiRequest(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.musicTrackGroupId = -1;
		this.musicTrackFileId = -1;
		this.musicTrackVolume = 0;
		this.field4002 = 0.0F;
		this.musicTrackBoolean = false;
		this.field4010 = false;
		this.field4011 = false;
		this.playMusicTrack(var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lpx;IIIZI)V",
		garbageValue = "625955701"
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
