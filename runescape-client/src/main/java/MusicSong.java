import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nk")
@Implements("MusicSong")
public class MusicSong {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("musicTrackArchive")
	public AbstractArchive musicTrackArchive;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 569126653
	)
	@Export("musicTrackGroupId")
	public int musicTrackGroupId;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1075562881
	)
	@Export("musicTrackFileId")
	public int musicTrackFileId;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -311246787
	)
	@Export("musicTrackVolume")
	public int musicTrackVolume;
	@ObfuscatedName("ao")
	public float field3739;
	@ObfuscatedName("ac")
	@Export("musicTrackBoolean")
	public boolean musicTrackBoolean;
	@ObfuscatedName("aj")
	public boolean field3741;
	@ObfuscatedName("av")
	public boolean field3743;
	@ObfuscatedName("au")
	public boolean field3742;
	@ObfuscatedName("an")
	boolean field3735;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("midiPcmStream")
	public MidiPcmStream midiPcmStream;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lbn;"
	)
	public SoundCache field3746;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	public MusicTrack field3747;

	@ObfuscatedSignature(
		descriptor = "(Lpi;Ljava/lang/String;Ljava/lang/String;IZ)V"
	)
	public MusicSong(AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
		this.musicTrackGroupId = -1;
		this.musicTrackFileId = -1;
		this.musicTrackVolume = 0;
		this.field3739 = 0.0F;
		this.musicTrackBoolean = false;
		this.field3742 = false;
		this.field3735 = false;
		this.musicTrackGroupId = var1.getGroupId(var2);
		this.musicTrackFileId = var1.getFileId(this.musicTrackGroupId, var3);
		this.method6795(var1, this.musicTrackGroupId, this.musicTrackFileId, var4, var5);
	}

	@ObfuscatedSignature(
		descriptor = "(Lpi;IIIZ)V"
	)
	public MusicSong(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.musicTrackGroupId = -1;
		this.musicTrackFileId = -1;
		this.musicTrackVolume = 0;
		this.field3739 = 0.0F;
		this.musicTrackBoolean = false;
		this.field3742 = false;
		this.field3735 = false;
		this.method6795(var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpi;IIIZI)V",
		garbageValue = "-928606288"
	)
	void method6795(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.musicTrackArchive = var1;
		this.musicTrackGroupId = var2;
		this.musicTrackFileId = var3;
		this.musicTrackVolume = var4;
		this.musicTrackBoolean = var5;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "667736452"
	)
	public static boolean method6793(int var0) {
		return (var0 >> 22 & 1) != 0;
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1711959012"
	)
	static final void method6796(boolean var0) {
		Client.authenticationScheme = Login.rememberUsername ? AuthenticationScheme.TOKEN_REMEMBER : AuthenticationScheme.TOKEN;
	}
}
