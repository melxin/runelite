import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("nh")
@Implements("MidiRequest")
public class MidiRequest {
	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "Lct;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("musicTrackArchive")
	public AbstractArchive musicTrackArchive;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 936624059
	)
	@Export("musicTrackGroupId")
	public int musicTrackGroupId;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1342593683
	)
	@Export("musicTrackFileId")
	public int musicTrackFileId;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -119473103
	)
	@Export("musicTrackVolume")
	public int musicTrackVolume;
	@ObfuscatedName("ah")
	public float field4019;
	@ObfuscatedName("af")
	@Export("musicTrackBoolean")
	public boolean musicTrackBoolean;
	@ObfuscatedName("ae")
	public boolean field4025;
	@ObfuscatedName("aq")
	public boolean field4021;
	@ObfuscatedName("ac")
	public boolean field4023;
	@ObfuscatedName("aa")
	public boolean field4015;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("midiPcmStream")
	public MidiPcmStream midiPcmStream;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ldb;"
	)
	public SoundCache field4022;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	public MusicTrack field4027;

	@ObfuscatedSignature(
		descriptor = "(Lpe;Ljava/lang/String;Ljava/lang/String;IZ)V"
	)
	public MidiRequest(AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
		this.musicTrackGroupId = -1;
		this.musicTrackFileId = -1;
		this.musicTrackVolume = 0;
		this.field4019 = 0.0F;
		this.musicTrackBoolean = false;
		this.field4023 = false;
		this.field4015 = false;
		this.musicTrackGroupId = var1.getGroupId(var2);
		this.musicTrackFileId = var1.getFileId(this.musicTrackGroupId, var3);
		this.playMusicTrack(var1, this.musicTrackGroupId, this.musicTrackFileId, var4, var5);
	}

	@ObfuscatedSignature(
		descriptor = "(Lpe;IIIZ)V"
	)
	public MidiRequest(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.musicTrackGroupId = -1;
		this.musicTrackFileId = -1;
		this.musicTrackVolume = 0;
		this.field4019 = 0.0F;
		this.musicTrackBoolean = false;
		this.field4023 = false;
		this.field4015 = false;
		this.playMusicTrack(var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpe;IIIZI)V",
		garbageValue = "-1285704215"
	)
	@Export("playMusicTrack")
	void playMusicTrack(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.musicTrackArchive = var1;
		this.musicTrackGroupId = var2;
		this.musicTrackFileId = var3;
		this.musicTrackVolume = var4;
		this.musicTrackBoolean = var5;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1519417749"
	)
	public static void method7398() {
		PlayerComposition.PlayerAppearance_cachedModels.clear();
		PlayerComposition.field4100.clearFiles();
		PlayerComposition.field4101 = 0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;",
		garbageValue = "-61"
	)
	@Export("loadClassFromDescriptor")
	static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) {
			return Byte.TYPE;
		} else if (var0.equals("I")) {
			return Integer.TYPE;
		} else if (var0.equals("S")) {
			return Short.TYPE;
		} else if (var0.equals("J")) {
			return Long.TYPE;
		} else if (var0.equals("Z")) {
			return Boolean.TYPE;
		} else if (var0.equals("F")) {
			return Float.TYPE;
		} else if (var0.equals("D")) {
			return Double.TYPE;
		} else if (var0.equals("C")) {
			return Character.TYPE;
		} else {
			return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0);
		}
	}
}
