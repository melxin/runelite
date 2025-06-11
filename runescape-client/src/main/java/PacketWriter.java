import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 520261313
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lwt;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lwo;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lwx;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -59638065
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("am")
	boolean field1271;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1420789563
	)
	int field1270;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 991669831
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -755942415
	)
	int field1272;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 584269303
	)
	int field1273;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	ServerPacket field1262;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	ServerPacket field1266;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	ServerPacket field1276;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ltg;"
	)
	@Export("socket")
	AbstractSocket socket;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque();
		this.bufferSize = 0;
		this.buffer = new Buffer(5000);
		this.packetBuffer = new PacketBuffer(40000);
		this.serverPacket = null;
		this.serverPacketLength = 0;
		this.field1271 = true;
		this.field1270 = 0;
		this.pendingWrites = 0;
		this.field1272 = 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "115"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear();
		this.bufferSize = 0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1835646424"
	)
	@Export("flush")
	final void flush() throws IOException {
		if (this.socket != null && this.bufferSize > 0) {
			this.buffer.offset = 0;

			while (true) {
				PacketBufferNode var1 = (PacketBufferNode)this.packetBufferNodes.last();
				if (var1 == null || var1.index > this.buffer.array.length - this.buffer.offset) {
					this.socket.write(this.buffer.array, 0, this.buffer.offset);
					this.pendingWrites = 0;
					break;
				}

				this.buffer.writeBytes(var1.packetBuffer.array, 0, var1.index);
				this.bufferSize -= var1.index;
				var1.remove();
				var1.packetBuffer.releaseArray();
				var1.release();
			}
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lmk;B)V",
		garbageValue = "-128"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1);
		var1.index = var1.packetBuffer.offset;
		var1.packetBuffer.offset = 0;
		this.bufferSize += var1.index;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-661682300"
	)
	@Export("close")
	void close() {
		if (this.socket != null) {
			this.socket.close();
			this.socket = null;
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1652318382"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Ltg;",
		garbageValue = "28"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ltg;B)V",
		garbageValue = "1"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1;
	}

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-2138041936"
	)
	static void method2834(int var0, String var1) {
		int var2 = Client.playerUpdateManager.playerCount;
		int[] var3 = Client.playerUpdateManager.playerIndices;
		boolean var4 = false;
		Username var5 = new Username(var1, AbstractUserComparator.loginType);
		WorldView var6 = class152.localPlayer.getWorldView();
		if (var6 == null) {
			GrandExchangeOfferWorldComparator.addGameMessage(4, "", "Unable to find " + var1 + ", current world null.");
		} else {
			for (int var7 = 0; var7 < var2; ++var7) {
				Player var8 = (Player)var6.players.get((long)var3[var7]);
				if (var8 != null && var8 != class152.localPlayer && var8.username != null && var8.username.equals(var5)) {
					PacketBufferNode var9;
					if (var0 == 1) {
						var9 = class139.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeShortAddLE(var3[var7]);
						var9.packetBuffer.writeByteNeg(0);
						Client.packetWriter.addNode(var9);
					} else if (var0 == 4) {
						var9 = class139.getPacketBufferNode(ClientPacket.OPPLAYER4, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeShortAdd(var3[var7]);
						var9.packetBuffer.writeByte(0);
						Client.packetWriter.addNode(var9);
					} else if (var0 == 6) {
						var9 = class139.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeShortAddLE(var3[var7]);
						var9.packetBuffer.writeByteNeg(0);
						Client.packetWriter.addNode(var9);
					} else if (var0 == 7) {
						var9 = class139.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeShortAddLE(var3[var7]);
						var9.packetBuffer.writeByte(0);
						Client.packetWriter.addNode(var9);
					}

					var4 = true;
					break;
				}
			}

			if (!var4) {
				GrandExchangeOfferWorldComparator.addGameMessage(4, "", "Unable to find " + var1);
			}

		}
	}
}
