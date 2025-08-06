import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nx")
@Implements("MidiRequest")
public class MidiRequest {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("musicTrackArchive")
	public AbstractArchive musicTrackArchive;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1905748077
	)
	@Export("musicTrackGroupId")
	public int musicTrackGroupId;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -25074317
	)
	@Export("musicTrackFileId")
	public int musicTrackFileId;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1622137919
	)
	@Export("musicTrackVolume")
	public int musicTrackVolume;
	@ObfuscatedName("au")
	public float field3912;
	@ObfuscatedName("as")
	@Export("musicTrackBoolean")
	public boolean musicTrackBoolean;
	@ObfuscatedName("ah")
	public boolean field3917;
	@ObfuscatedName("ap")
	public boolean field3908;
	@ObfuscatedName("am")
	public boolean field3914;
	@ObfuscatedName("aj")
	boolean field3918;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("midiPcmStream")
	public MidiPcmStream midiPcmStream;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	public SoundCache field3919;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	public MusicTrack field3920;

	@ObfuscatedSignature(
		descriptor = "(Lpx;Ljava/lang/String;Ljava/lang/String;IZ)V"
	)
	public MidiRequest(AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
		this.musicTrackGroupId = -1;
		this.musicTrackFileId = -1;
		this.musicTrackVolume = 0;
		this.field3912 = 0.0F;
		this.musicTrackBoolean = false;
		this.field3914 = false;
		this.field3918 = false;
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
		this.field3912 = 0.0F;
		this.musicTrackBoolean = false;
		this.field3914 = false;
		this.field3918 = false;
		this.playMusicTrack(var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lpx;IIIZI)V",
		garbageValue = "-1031816559"
	)
	@Export("playMusicTrack")
	void playMusicTrack(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.musicTrackArchive = var1;
		this.musicTrackGroupId = var2;
		this.musicTrackFileId = var3;
		this.musicTrackVolume = var4;
		this.musicTrackBoolean = var5;
	}

	@ObfuscatedName("oc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1224008257"
	)
	static final void method7367() {
		Iterator var0 = Client.worldViewManager.iterator();

		while (var0.hasNext()) {
			WorldView var1 = (WorldView)var0.next();

			for (int var2 = 0; var2 < Client.playerUpdateManager.playerCount; ++var2) {
				Player var3 = (Player)class7.topLevelWorldView.players.get((long)Client.playerUpdateManager.playerIndices[var2]);
				if (var3 != null) {
					var3.clearIsInFriendsChat();
				}
			}
		}

	}
}
