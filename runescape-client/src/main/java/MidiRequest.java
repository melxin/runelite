import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nf")
@Implements("MidiRequest")
public class MidiRequest {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	@Export("musicTrackArchive")
	public AbstractArchive musicTrackArchive;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1778393937
	)
	@Export("musicTrackGroupId")
	public int musicTrackGroupId;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1740472291
	)
	@Export("musicTrackFileId")
	public int musicTrackFileId;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1861015
	)
	@Export("musicTrackVolume")
	public int musicTrackVolume;
	@ObfuscatedName("ae")
	public float field4046;
	@ObfuscatedName("aj")
	@Export("musicTrackBoolean")
	public boolean musicTrackBoolean;
	@ObfuscatedName("ak")
	public boolean field4044;
	@ObfuscatedName("aw")
	public boolean field4049;
	@ObfuscatedName("ap")
	public boolean field4050;
	@ObfuscatedName("ay")
	boolean field4051;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	@Export("midiPcmStream")
	public MidiPcmStream midiPcmStream;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lds;"
	)
	public SoundCache field4053;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	public MusicTrack field4054;

	@ObfuscatedSignature(
		descriptor = "(Lqm;Ljava/lang/String;Ljava/lang/String;IZ)V"
	)
	public MidiRequest(AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
		this.musicTrackGroupId = -1;
		this.musicTrackFileId = -1;
		this.musicTrackVolume = 0;
		this.field4046 = 0.0F;
		this.musicTrackBoolean = false;
		this.field4050 = false;
		this.field4051 = false;
		this.musicTrackGroupId = var1.getGroupId(var2);
		this.musicTrackFileId = var1.getFileId(this.musicTrackGroupId, var3);
		this.playMusicTrack(var1, this.musicTrackGroupId, this.musicTrackFileId, var4, var5);
	}

	@ObfuscatedSignature(
		descriptor = "(Lqm;IIIZ)V"
	)
	public MidiRequest(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.musicTrackGroupId = -1;
		this.musicTrackFileId = -1;
		this.musicTrackVolume = 0;
		this.field4046 = 0.0F;
		this.musicTrackBoolean = false;
		this.field4050 = false;
		this.field4051 = false;
		this.playMusicTrack(var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lqm;IIIZI)V",
		garbageValue = "-1177724997"
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
