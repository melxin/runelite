import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tr")
public class class507 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpe;Lpe;Lpe;I)V",
		garbageValue = "-970998134"
	)
	public static void method10288(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		UrlRequest.HitSplatDefinition_archive = var0;
		HitSplatDefinition.field2272 = var1;
		class360.HitSplatDefinition_fontsArchive = var2;
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-770680993"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = HorizontalAlignment.getPacketBufferNode(ClientPacket.RESUME_PAUSEBUTTON, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeShortAdd(var1);
		var2.packetBuffer.writeIntLE(var0);
		Client.packetWriter.addNode(var2);
	}
}
