import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nx")
@Implements("MidiRequest")
public class MidiRequest {
	@ObfuscatedName("qm")
	@ObfuscatedGetter(
		intValue = 2142656309
	)
	static int field3815;
	@ObfuscatedName("tu")
	@ObfuscatedSignature(
		descriptor = "Lwg;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("musicTrackArchive")
	public AbstractArchive musicTrackArchive;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1034270059
	)
	@Export("musicTrackGroupId")
	public int musicTrackGroupId;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 678027195
	)
	@Export("musicTrackFileId")
	public int musicTrackFileId;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1383913311
	)
	@Export("musicTrackVolume")
	public int musicTrackVolume;
	@ObfuscatedName("ah")
	public float field3803;
	@ObfuscatedName("ac")
	@Export("musicTrackBoolean")
	public boolean musicTrackBoolean;
	@ObfuscatedName("ao")
	public boolean field3805;
	@ObfuscatedName("af")
	public boolean field3799;
	@ObfuscatedName("aa")
	public boolean field3807;
	@ObfuscatedName("as")
	boolean field3801;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	@Export("midiPcmStream")
	public MidiPcmStream midiPcmStream;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lbi;"
	)
	public SoundCache field3810;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	public MusicTrack field3811;

	@ObfuscatedSignature(
		descriptor = "(Lpl;Ljava/lang/String;Ljava/lang/String;IZ)V"
	)
	public MidiRequest(AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
		this.musicTrackGroupId = -1;
		this.musicTrackFileId = -1;
		this.musicTrackVolume = 0;
		this.field3803 = 0.0F;
		this.musicTrackBoolean = false;
		this.field3807 = false;
		this.field3801 = false;
		this.musicTrackGroupId = var1.getGroupId(var2);
		this.musicTrackFileId = var1.getFileId(this.musicTrackGroupId, var3);
		this.playMusicTrack(var1, this.musicTrackGroupId, this.musicTrackFileId, var4, var5);
	}

	@ObfuscatedSignature(
		descriptor = "(Lpl;IIIZ)V"
	)
	public MidiRequest(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.musicTrackGroupId = -1;
		this.musicTrackFileId = -1;
		this.musicTrackVolume = 0;
		this.field3803 = 0.0F;
		this.musicTrackBoolean = false;
		this.field3807 = false;
		this.field3801 = false;
		this.playMusicTrack(var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpl;IIIZI)V",
		garbageValue = "-1361594421"
	)
	@Export("playMusicTrack")
	void playMusicTrack(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.musicTrackArchive = var1;
		this.musicTrackGroupId = var2;
		this.musicTrackFileId = var3;
		this.musicTrackVolume = var4;
		this.musicTrackBoolean = var5;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILtu;Lpn;I)V",
		garbageValue = "-1233859456"
	)
	static void method6846(int var0, ArchiveDisk var1, Archive var2) {
		byte[] var3 = null;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			for (ArchiveDiskAction var5 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var5 != null; var5 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) {
				if (var5.key == (long)var0 && var1 == var5.archiveDisk && var5.type == 0) {
					var3 = var5.data;
					break;
				}
			}
		}

		if (var3 != null) {
			var2.load(var1, var0, var3, true);
		} else {
			byte[] var4 = var1.read(var0);
			var2.load(var1, var0, var4, true);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lrp;Lrp;I)F",
		garbageValue = "1793257304"
	)
	public static final float method6843(class442 var0, class442 var1) {
		return var0.method8303(var1);
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-54"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field738 = 0L;
		if (var0 >= 2) {
			Client.isResizable = true;
		} else {
			Client.isResizable = false;
		}

		if (DynamicObject.getWindowedMode() == 1) {
			class569.client.setMaxCanvasSize(765, 503);
		} else {
			class569.client.setMaxCanvasSize(7680, 2160);
		}

		if (Client.gameState >= 25 && Client.packetWriter != null && Client.packetWriter.isaacCipher != null) {
			PacketBufferNode var1 = class272.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(DynamicObject.getWindowedMode());
			var1.packetBuffer.writeShort(GameEngine.canvasWidth);
			var1.packetBuffer.writeShort(SwapSongTask.canvasHeight);
			Client.packetWriter.addNode(var1);
		}

	}
}
