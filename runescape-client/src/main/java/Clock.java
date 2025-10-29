import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jx")
@Implements("Clock")
public abstract class Clock {
	Clock() {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "796597613"
	)
	@Export("mark")
	public abstract void mark();

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "205232251"
	)
	@Export("wait")
	public abstract int wait(int var1, int var2);

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "852811176"
	)
	static final void method5247(String var0, int var1) {
		PacketBufferNode var2 = ReflectionCheck.getPacketBufferNode(ClientPacket.FRIEND_CHAT_SETRANK, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(AccessFile.stringCp1252NullTerminatedByteSize(var0) + 1);
		var2.packetBuffer.writeByteSub(var1);
		var2.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var2);
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(Ldd;ILky;B)V",
		garbageValue = "13"
	)
	static void method5250(WorldView var0, int var1, Model var2) {
		boolean var3 = true;
		float var4 = (float)Client.viewportHeight / 334.0F;
		float var5 = 4.0F * (float)Client.viewportZoom / var4;
		int var6 = Math.max(512, (int)(1400.0F - var5));
		int var7 = Client.field468;
		double var8 = (double)class66.method2206(var1) / 65536.0D;
		int var10 = var7 - (int)(var8 * (double)var6);
		int var11 = Client.field512 - (int)(DevicePcmPlayerProvider.method332(var1) * (double)var6);
		long var12 = class236.calculateTag(var0.plane, Coord.method7692(var10), Coord.method7692(var11), 5, false, -1, var0.id);
		var0.scene.drawEntity(var0.plane, var10, var11, Client.field469, 60, var2, var1, var12, false);
	}
}
