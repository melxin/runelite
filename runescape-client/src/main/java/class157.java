import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
public class class157 extends class165 {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lws;"
	)
	static IndexedSprite field1774;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1513310837
	)
	int field1773;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgl;"
	)
	final class166 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgl;)V"
	)
	class157(class166 var1) {
		this.this$0 = var1;
		this.field1773 = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "1818142003"
	)
	void vmethod3695(Buffer var1) {
		this.field1773 = var1.readUnsignedShort();
		var1.readUnsignedByte();
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgd;I)V",
		garbageValue = "488725669"
	)
	void vmethod3696(ClanChannel var1) {
		var1.removeMember(this.field1773);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "64"
	)
	public static int method3532(int var0) {
		if (var0 > 0) {
			return 1;
		} else {
			return var0 < 0 ? -1 : 0;
		}
	}

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "511090873"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = class272.getPacketBufferNode(ClientPacket.RESUME_PAUSEBUTTON, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeShortAddLE(var1);
		var2.packetBuffer.writeIntLE(var0);
		Client.packetWriter.addNode(var2);
	}
}
