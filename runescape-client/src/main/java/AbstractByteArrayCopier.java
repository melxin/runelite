import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("om")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	AbstractByteArrayCopier() {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "93826609"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-223658194"
	)
	@Export("set")
	abstract void set(byte[] var1);

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(Lmb;I)V",
		garbageValue = "1730989150"
	)
	static void method8082(PacketBufferNode var0) {
		var0.packetBuffer.writeInt(Canvas.archive12.hash);
		var0.packetBuffer.writeInt(LoginPacket.field1743.hash);
		var0.packetBuffer.writeInt(MoveSpeed.archive6.hash);
		var0.packetBuffer.writeInt(class201.archive9.hash);
		var0.packetBuffer.writeIntLE(class197.field2131.hash);
		var0.packetBuffer.writeIntME(class175.field1928.hash);
		var0.packetBuffer.writeIntIME(class46.field666.hash);
		var0.packetBuffer.writeIntME(ReflectionCheck.field240.hash);
		var0.packetBuffer.writeIntME(ScriptEvent.field871.hash);
		var0.packetBuffer.writeInt(class161.archive4.hash);
		var0.packetBuffer.writeIntME(class82.field1191.hash);
		var0.packetBuffer.writeInt(class350.field3925.hash);
		var0.packetBuffer.writeIntIME(class381.field4313.hash);
		var0.packetBuffer.writeIntIME(AsyncRestClient.archive2.hash);
		var0.packetBuffer.writeIntME(MusicPatch.field3868.hash);
		var0.packetBuffer.writeIntLE(0);
	}
}
