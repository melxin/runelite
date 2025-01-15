import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nh")
@Implements("MusicSong")
public class MusicSong {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	@Export("musicTrackArchive")
	public AbstractArchive musicTrackArchive;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1278731953
	)
	@Export("musicTrackGroupId")
	public int musicTrackGroupId;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -967350755
	)
	@Export("musicTrackFileId")
	public int musicTrackFileId;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 904938547
	)
	@Export("musicTrackVolume")
	public int musicTrackVolume;
	@ObfuscatedName("ad")
	public float field3739;
	@ObfuscatedName("an")
	@Export("musicTrackBoolean")
	public boolean musicTrackBoolean;
	@ObfuscatedName("ae")
	public boolean field3741;
	@ObfuscatedName("ax")
	public boolean field3742;
	@ObfuscatedName("at")
	public boolean field3745;
	@ObfuscatedName("ac")
	boolean field3744;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	@Export("midiPcmStream")
	public MidiPcmStream midiPcmStream;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lbs;"
	)
	public SoundCache field3746;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	public MusicTrack field3747;

	@ObfuscatedSignature(
		descriptor = "(Lpq;Ljava/lang/String;Ljava/lang/String;IZ)V"
	)
	public MusicSong(AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
		this.musicTrackGroupId = -1;
		this.musicTrackFileId = -1;
		this.musicTrackVolume = 0;
		this.field3739 = 0.0F;
		this.musicTrackBoolean = false;
		this.field3745 = false;
		this.field3744 = false;
		this.musicTrackGroupId = var1.getGroupId(var2);
		this.musicTrackFileId = var1.getFileId(this.musicTrackGroupId, var3);
		this.method6946(var1, this.musicTrackGroupId, this.musicTrackFileId, var4, var5);
	}

	@ObfuscatedSignature(
		descriptor = "(Lpq;IIIZ)V"
	)
	public MusicSong(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.musicTrackGroupId = -1;
		this.musicTrackFileId = -1;
		this.musicTrackVolume = 0;
		this.field3739 = 0.0F;
		this.musicTrackBoolean = false;
		this.field3745 = false;
		this.field3744 = false;
		this.method6946(var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lpq;IIIZI)V",
		garbageValue = "-205075161"
	)
	void method6946(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.musicTrackArchive = var1;
		this.musicTrackGroupId = var2;
		this.musicTrackFileId = var3;
		this.musicTrackVolume = var4;
		this.musicTrackBoolean = var5;
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "114"
	)
	static final int method6949(int var0) {
		return Math.min(Math.max(var0, 128), 383);
	}
}
