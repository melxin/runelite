import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gr")
@Implements("Sound")
public class Sound extends class149 {
	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	@Export("topLevelWorldView")
	public static WorldView topLevelWorldView;
	@ObfuscatedName("ap")
	boolean field1767;
	@ObfuscatedName("aj")
	byte field1764;
	@ObfuscatedName("an")
	byte field1762;
	@ObfuscatedName("ai")
	byte field1763;
	@ObfuscatedName("al")
	byte field1761;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	final class152 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfp;)V"
	)
	Sound(class152 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "-1635342078"
	)
	void vmethod3913(Buffer var1) {
		this.field1767 = var1.readUnsignedByte() == 1;
		this.field1764 = var1.readByte();
		this.field1762 = var1.readByte();
		this.field1763 = var1.readByte();
		this.field1761 = var1.readByte();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lgu;I)V",
		garbageValue = "-1572789515"
	)
	void vmethod3914(ClanSettings var1) {
		var1.allowGuests = this.field1767;
		var1.field1800 = this.field1764;
		var1.field1806 = this.field1762;
		var1.field1789 = this.field1763;
		var1.field1792 = this.field1761;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Lhs;",
		garbageValue = "-1184987531"
	)
	public static HealthBarDefinition method3719(int var0) {
		HealthBarDefinition var1 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var0);
			var1 = new HealthBarDefinition();
			var1.field1961 = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("of")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "86"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = class139.getPacketBufferNode(ClientPacket.FRIEND_CHAT_JOIN_LEAVE, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(0);
		Client.packetWriter.addNode(var0);
	}
}
