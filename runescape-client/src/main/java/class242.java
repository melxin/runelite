import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jp")
public class class242 {
	@ObfuscatedName("vf")
	@ObfuscatedGetter(
		intValue = 1525245415
	)
	static int field2663;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lfk;"
	)
	class133[] field2661;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1493195967
	)
	int field2662;

	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V"
	)
	class242(Buffer var1, int var2) {
		this.field2661 = new class133[var2];
		this.field2662 = var1.readUnsignedByte();

		for (int var3 = 0; var3 < this.field2661.length; ++var3) {
			class133 var4 = new class133(this.field2662, var1, false);
			this.field2661[var3] = var4;
		}

		this.method5099();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2129517152"
	)
	void method5099() {
		class133[] var1 = this.field2661;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class133 var3 = var1[var2];
			if (var3.field1570 >= 0) {
				var3.field1563 = this.field2661[var3.field1570];
			}
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1540241177"
	)
	public int method5100() {
		return this.field2661.length;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lfk;",
		garbageValue = "1972423915"
	)
	class133 method5102(int var1) {
		return var1 >= this.method5100() ? null : this.field2661[var1];
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfk;",
		garbageValue = "-736628100"
	)
	class133[] method5098() {
		return this.field2661;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lfj;II)V",
		garbageValue = "1271866572"
	)
	void method5103(class143 var1, int var2) {
		this.method5110(var1, var2, (boolean[])null, false);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lfj;I[ZZB)V",
		garbageValue = "1"
	)
	void method5110(class143 var1, int var2, boolean[] var3, boolean var4) {
		int var5 = var1.method3592();
		int var6 = 0;
		class133[] var7 = this.method5098();

		for (int var8 = 0; var8 < var7.length; ++var8) {
			class133 var9 = var7[var8];
			if (var3 == null || var4 == var3[var6]) {
				var1.method3597(var2, var9, var6, var5);
			}

			++var6;
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-9"
	)
	public static boolean method5107(int var0) {
		return (var0 >> 21 & 1) != 0;
	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "266942547"
	)
	static final void method5121(boolean var0) {
		MusicPatchNode2.method6884();
		++Client.packetWriter.pendingWrites;
		if (Client.packetWriter.pendingWrites >= 50 || var0) {
			Client.packetWriter.pendingWrites = 0;
			if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) {
				PacketBufferNode var1 = class139.getPacketBufferNode(ClientPacket.NO_TIMEOUT, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var1);

				try {
					Client.packetWriter.flush();
				} catch (IOException var3) {
					Client.hadNetworkError = true;
				}
			}

		}
	}
}
