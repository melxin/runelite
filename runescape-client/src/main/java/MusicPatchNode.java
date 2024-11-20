import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nn")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1733443127
	)
	int field3728;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("table")
	MusicPatch table;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lbi;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	MusicPatchNode2 field3714;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 554129097
	)
	int field3724;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -157475113
	)
	int field3715;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1947855899
	)
	int field3725;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 2119362803
	)
	int field3718;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1189418721
	)
	int field3719;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 552599671
	)
	int field3720;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1771579935
	)
	int field3721;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1482912289
	)
	int field3722;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -833704419
	)
	int field3723;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1022891279
	)
	int field3711;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1717740179
	)
	int field3716;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1939793429
	)
	int field3712;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1409110549
	)
	int field3727;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1081025367
	)
	int field3730;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lbe;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1483142491
	)
	int field3717;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 734712041
	)
	int field3731;

	MusicPatchNode() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-8"
	)
	void method6779() {
		this.table = null;
		this.rawSound = null;
		this.field3714 = null;
		this.stream = null;
	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1940740861"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field731 = 0L;
		if (var0 >= 2) {
			Client.isResizable = true;
		} else {
			Client.isResizable = false;
		}

		if (class93.getWindowedMode() == 1) {
			NpcOverrides.client.setMaxCanvasSize(765, 503);
		} else {
			NpcOverrides.client.setMaxCanvasSize(7680, 2160);
		}

		if (Client.gameState >= 25 && Client.packetWriter != null && Client.packetWriter.isaacCipher != null) {
			PacketBufferNode var1 = Message.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(class93.getWindowedMode());
			var1.packetBuffer.writeShort(class329.canvasWidth);
			var1.packetBuffer.writeShort(class535.canvasHeight);
			Client.packetWriter.addNode(var1);
		}

	}
}
