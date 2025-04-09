import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
public class class163 extends class148 {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = -4047166956470377909L
	)
	long field1827;
	@ObfuscatedName("an")
	String field1822;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 768853405
	)
	int field1825;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	final class151 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfd;)V"
	)
	class163(class151 var1) {
		this.this$0 = var1;
		this.field1827 = -1L;
		this.field1822 = null;
		this.field1825 = 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lve;B)V",
		garbageValue = "53"
	)
	void vmethod3749(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			var1.offset -= 29699747;
			this.field1827 = var1.readLong();
		}

		this.field1822 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1825 = var1.readUnsignedShort();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lgw;I)V",
		garbageValue = "1984465176"
	)
	void vmethod3750(ClanSettings var1) {
		var1.method3606(this.field1827, this.field1822, this.field1825);
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "901810103"
	)
	static void method3662() {
		Client.packetWriter.clearBuffer();
		Client.packetWriter.field1471 = 0;
		Client.packetWriter.packetBuffer.offset = 0;
		Client.packetWriter.serverPacket = null;
		Client.packetWriter.field1461 = null;
		Client.packetWriter.field1474 = null;
		Client.packetWriter.field1463 = null;
		Client.packetWriter.serverPacketLength = 0;
		Client.packetWriter.field1475 = 0;
		Client.rebootTimer = 0;
		WorldMapIcon_0.method6266();
		Client.minimapState = 0;
		Client.destinationX = 0;
		class509.topLevelWorldView.method2872();
		class267.method5632();
		class325.updateGameState(30);

		for (int var0 = 0; var0 < 100; ++var0) {
			Client.validRootWidgets[var0] = true;
		}

		if (Client.packetWriter != null && Client.packetWriter.isaacCipher != null) {
			PacketBufferNode var1 = FloorDecoration.getPacketBufferNode(ClientPacket.field3391, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(class171.getWindowedMode());
			var1.packetBuffer.writeShort(GameEngine.canvasWidth);
			var1.packetBuffer.writeShort(class141.canvasHeight);
			Client.packetWriter.addNode(var1);
		}

	}
}
