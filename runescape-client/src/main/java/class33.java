import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bp")
public class class33 {
	@ObfuscatedName("ay")
	@Export("osNameLowercase")
	public static String osNameLowercase;
	@ObfuscatedName("gy")
	@ObfuscatedGetter(
		intValue = -855077085
	)
	static int field166;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1995266585
	)
	int field164;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -915202069
	)
	int field160;

	class33(int var1, int var2) {
		this.field164 = var1;
		this.field160 = var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lbt;I)Z",
		garbageValue = "-1647636092"
	)
	boolean method458(class29 var1) {
		if (var1 == null) {
			return false;
		} else {
			switch(this.field164) {
			case 1:
				return var1.vmethod5567(this.field160);
			case 2:
				return var1.vmethod5568(this.field160);
			case 3:
				return var1.vmethod5573((char)this.field160);
			case 4:
				return var1.vmethod5571(this.field160 == 1);
			default:
				return false;
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1693530572"
	)
	static final void method463(String var0) {
		PacketBufferNode var1 = Message.getPacketBufferNode(ClientPacket.FRIEND_ADDUSER, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(class164.stringCp1252NullTerminatedByteSize(var0));
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}
}
