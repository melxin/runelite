import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("td")
public class class506 {
	@ObfuscatedName("an")
	static final int[] field5147;
	@ObfuscatedName("ae")
	static final int[] field5148;

	static {
		field5147 = new int[16384];
		field5148 = new int[16384];
		double var0 = 3.834951969714103E-4D;

		for (int var2 = 0; var2 < 16384; ++var2) {
			field5147[var2] = (int)(16384.0D * Math.sin((double)var2 * var0));
			field5148[var2] = (int)(16384.0D * Math.cos((double)var2 * var0));
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lwg;"
	)
	@Export("newRunException")
	public static RunException newRunException(Throwable var0, String var1) {
		RunException var2;
		if (var0 instanceof RunException) {
			var2 = (RunException)var0;
			var2.message = var2.message + ' ' + var1;
		} else {
			var2 = new RunException(var0, var1);
		}

		return var2;
	}

	@ObfuscatedName("nj")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "399679247"
	)
	static final void method9591(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3837()) {
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
				if (var2.rank == -1) {
					PacketBufferNode var3 = ScriptEvent.getPacketBufferNode(ClientPacket.CLAN_SETTINGS_ADD_BANNED_FROM_CHANNEL, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(3 + MouseRecorder.stringCp1252NullTerminatedByteSize(var2.username.getName()));
					var3.packetBuffer.writeByte(var0);
					var3.packetBuffer.writeShort(var1);
					var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName());
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}
}
