import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("it")
public class class219 extends class225 {
	@ObfuscatedName("ao")
	String field2464;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	final class222 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lig;Ljava/lang/String;Ljava/lang/String;)V"
	)
	class219(class222 var1, String var2, String var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field2464 = var3;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1893694447"
	)
	public int vmethod4957() {
		return 1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1727604683"
	)
	public String vmethod4958() {
		return this.field2464;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(FFFI)Lrz;",
		garbageValue = "-278341752"
	)
	public static class442 method4844(float var0, float var1, float var2) {
		synchronized(class442.field4917) {
			if (class442.field4920 == 0) {
				return new class442(var0, var1, var2);
			} else {
				class442.field4917[--class442.field4920].method8340(var0, var1, var2);
				return class442.field4917[class442.field4920];
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1898118813"
	)
	static int method4842() {
		return class28.KeyHandler_keyCodes.length;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "81"
	)
	public static boolean method4843(int var0) {
		return (var0 >> 21 & 1) != 0;
	}

	@ObfuscatedName("nq")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "19763"
	)
	static final void method4836(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3704()) {
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
				if (var2.rank == -1) {
					PacketBufferNode var3 = FloorDecoration.getPacketBufferNode(ClientPacket.field3460, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(3 + class466.stringCp1252NullTerminatedByteSize(var2.username.getName()));
					var3.packetBuffer.writeByte(var0);
					var3.packetBuffer.writeShort(var1);
					var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName());
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}
}
