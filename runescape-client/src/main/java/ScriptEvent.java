import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("df")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("ay")
	@Export("args")
	Object[] args;
	@ObfuscatedName("ah")
	boolean field1075;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1190012531
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1402240027
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 904758891
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1860502355
	)
	int field1081;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1432134479
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1241265743
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("au")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1852724295
	)
	int field1080;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -212291339
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;I)V",
		garbageValue = "1177676751"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1971710567"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lna;S)V",
		garbageValue = "-4216"
	)
	public void method2628(Widget var1) {
		this.widget = var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lmm;Lwr;B)Lmb;",
		garbageValue = "18"
	)
	@Export("getPacketBufferNode")
	public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2 = HttpRequestTask.method288();
		var2.clientPacket = var0;
		var2.clientPacketLength = var0.length;
		if (var2.clientPacketLength == -1) {
			var2.packetBuffer = new PacketBuffer(260);
		} else if (var2.clientPacketLength == -2) {
			var2.packetBuffer = new PacketBuffer(10000);
		} else if (var2.clientPacketLength <= 18) {
			var2.packetBuffer = new PacketBuffer(20);
		} else if (var2.clientPacketLength <= 98) {
			var2.packetBuffer = new PacketBuffer(100);
		} else {
			var2.packetBuffer = new PacketBuffer(260);
		}

		var2.packetBuffer.setIsaacCipher(var1);
		var2.packetBuffer.writeByteIsaac(var2.clientPacket.id);
		var2.index = 0;
		return var2;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1400630297"
	)
	public static void method2622(int var0) {
		if (!class333.midiRequests.isEmpty()) {
			Iterator var1 = class333.midiRequests.iterator();

			while (var1.hasNext()) {
				MidiRequest var2 = (MidiRequest)var1.next();
				if (var2 != null) {
					var2.musicTrackVolume = var0;
				}
			}

			MidiRequest var3 = (MidiRequest)class333.midiRequests.get(0);
			if (var3 != null && var3.midiPcmStream != null && var3.midiPcmStream.isReady() && !var3.field3745) {
				var3.midiPcmStream.setPcmStreamVolume(var0);
				var3.field3739 = (float)var0;
			}
		}

	}
}
