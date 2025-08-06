import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
public class class113 {
	@ObfuscatedName("ap")
	@Export("SpriteBuffer_spritePalette")
	public static int[] SpriteBuffer_spritePalette;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ldb;"
	)
	VorbisFloor field1483;
	@ObfuscatedName("ab")
	boolean field1488;
	@ObfuscatedName("ac")
	int[] field1484;
	@ObfuscatedName("av")
	int[] field1485;
	@ObfuscatedName("au")
	boolean[] field1486;

	@ObfuscatedSignature(
		descriptor = "(Ldb;Z[I[I[Z)V"
	)
	class113(VorbisFloor var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
		this.field1483 = var1;
		this.field1488 = var2;
		this.field1484 = var3;
		this.field1485 = var4;
		this.field1486 = var5;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([FII)V",
		garbageValue = "-2140758332"
	)
	void method3384(float[] var1, int var2) {
		int var3 = this.field1483.field1304.length;
		VorbisFloor var10000 = this.field1483;
		int var4 = VorbisFloor.field1302[this.field1483.multiplier - 1];
		boolean[] var5 = this.field1486;
		this.field1486[1] = true;
		var5[0] = true;

		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		for (var6 = 2; var6 < var3; ++var6) {
			var7 = this.field1483.method2985(this.field1484, var6);
			var8 = this.field1483.method2986(this.field1484, var6);
			var9 = this.field1483.method2994(this.field1484[var7], this.field1485[var7], this.field1484[var8], this.field1485[var8], this.field1484[var6]);
			var10 = this.field1485[var6];
			int var11 = var4 - var9;
			int var13 = (var11 < var9 ? var11 : var9) << 1;
			if (var10 != 0) {
				boolean[] var14 = this.field1486;
				this.field1486[var8] = true;
				var14[var7] = true;
				this.field1486[var6] = true;
				if (var10 >= var13) {
					this.field1485[var6] = var11 > var9 ? var9 + (var10 - var9) : var11 + (var9 - var10) - 1;
				} else {
					this.field1485[var6] = (var10 & 1) != 0 ? var9 - (var10 + 1) / 2 : var10 / 2 + var9;
				}
			} else {
				this.field1486[var6] = false;
				this.field1485[var6] = var9;
			}
		}

		this.VarbisFloor_sort(0, var3 - 1);
		var6 = 0;
		var7 = this.field1483.multiplier * this.field1485[0];

		for (var8 = 1; var8 < var3; ++var8) {
			if (this.field1486[var8]) {
				var9 = this.field1484[var8];
				var10 = this.field1483.multiplier * this.field1485[var8];
				this.field1483.method2989(var6, var7, var9, var10, var1, var2);
				if (var9 >= var2) {
					return;
				}

				var6 = var9;
				var7 = var10;
			}
		}

		var10000 = this.field1483;
		float var16 = VorbisFloor.VorbisFloor_decibelStatics[var7];

		for (var9 = var6; var9 < var2; ++var9) {
			var1[var9] *= var16;
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1604326975"
	)
	boolean method3385() {
		return this.field1488;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-932990816"
	)
	@Export("VarbisFloor_sort")
	void VarbisFloor_sort(int var1, int var2) {
		if (var1 < var2) {
			int var3 = var1;
			int var4 = this.field1484[var1];
			int var5 = this.field1485[var1];
			boolean var6 = this.field1486[var1];

			for (int var7 = var1 + 1; var7 <= var2; ++var7) {
				int var8 = this.field1484[var7];
				if (var8 < var4) {
					this.field1484[var3] = var8;
					this.field1485[var3] = this.field1485[var7];
					this.field1486[var3] = this.field1486[var7];
					++var3;
					this.field1484[var7] = this.field1484[var3];
					this.field1485[var7] = this.field1485[var3];
					this.field1486[var7] = this.field1486[var3];
				}
			}

			this.field1484[var3] = var4;
			this.field1485[var3] = var5;
			this.field1486[var3] = var6;
			this.VarbisFloor_sort(var1, var3 - 1);
			this.VarbisFloor_sort(var3 + 1, var2);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/Socket;III)Ltl;",
		garbageValue = "-400544919"
	)
	public static AbstractSocket method3390(Socket var0, int var1, int var2) throws IOException {
		return new BufferedNetSocket(var0, var1, var2);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "14"
	)
	public static boolean method3399() {
		if (!class337.field3795.isEmpty()) {
			return true;
		} else {
			return !class337.midiRequests.isEmpty() && class337.midiRequests.get(0) != null && ((MidiRequest)class337.midiRequests.get(0)).midiPcmStream != null ? ((MidiRequest)class337.midiRequests.get(0)).midiPcmStream.isReady() : false;
		}
	}

	@ObfuscatedName("ou")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1397641709"
	)
	static final void method3397(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method4045()) {
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
				if (var2.rank == -1) {
					PacketBufferNode var3 = class291.getPacketBufferNode(ClientPacket.CLAN_SETTINGS_ADD_BANNED_FROM_CHANNEL, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(3 + class283.stringCp1252NullTerminatedByteSize(var2.username.getName()));
					var3.packetBuffer.writeByte(var0);
					var3.packetBuffer.writeShort(var1);
					var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName());
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}
}
