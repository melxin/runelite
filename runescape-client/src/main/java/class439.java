import java.util.HashMap;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qh")
public class class439 {
	static {
		new HashMap();
	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	static void method8922() {
		if (Client.packetWriter != null && Client.packetWriter.isaacCipher != null) {
			PacketBufferNode var0 = ReflectionCheck.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, Client.packetWriter.isaacCipher);
			var0.packetBuffer.writeByte(class182.getWindowedMode());
			var0.packetBuffer.writeShort(class489.canvasWidth);
			var0.packetBuffer.writeShort(class374.canvasHeight);
			Client.packetWriter.addNode(var0);
		}
	}
}
