import java.nio.ByteBuffer;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nb")
@Implements("DirectByteArrayCopier")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
	@ObfuscatedName("ap")
	@Export("directBuffer")
	ByteBuffer directBuffer;

	DirectByteArrayCopier() {
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-1961071285"
	)
	@Export("get")
	byte[] get() {
		byte[] var1 = new byte[this.directBuffer.capacity()];
		this.directBuffer.position(0);
		this.directBuffer.get(var1);
		return var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "1"
	)
	@Export("set")
	void set(byte[] var1) {
		this.directBuffer = ByteBuffer.allocateDirect(var1.length);
		this.directBuffer.position(0);
		this.directBuffer.put(var1);
	}

	@ObfuscatedName("ai")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 20 & 4294967295L);
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-461915513"
	)
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1;
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)Z",
		garbageValue = "1"
	)
	static boolean method7208(int var0, int var1, int var2, int var3, int var4, int var5) {
		return ClanChannelMember.method3677(class330.worldView.plane, var0, var1, var2, var3, var4, var5);
	}
}
