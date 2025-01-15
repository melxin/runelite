import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lsq;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1527394769
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lwr;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -554681029
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("at")
	boolean field1457;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1900238241
	)
	int field1454;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 555548547
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1785260499
	)
	int field1456;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1743314537
	)
	int field1445;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	ServerPacket field1458;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	ServerPacket field1447;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	ServerPacket field1460;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque();
		this.bufferSize = 0;
		this.buffer = new Buffer(5000);
		this.packetBuffer = new PacketBuffer(40000);
		this.serverPacket = null;
		this.serverPacketLength = 0;
		this.field1457 = true;
		this.field1454 = 0;
		this.pendingWrites = 0;
		this.field1456 = 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1444195951"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear();
		this.bufferSize = 0;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "911985798"
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lmb;I)V",
		garbageValue = "1268821956"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1);
		var1.index = var1.packetBuffer.offset;
		var1.packetBuffer.offset = 0;
		this.bufferSize += var1.index;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lsq;I)V",
		garbageValue = "375321384"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-4"
	)
	@Export("close")
	void close() {
		if (this.socket != null) {
			this.socket.close();
			this.socket = null;
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-14145"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lsq;",
		garbageValue = "-145702831"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "167109404"
	)
	public static byte[] method3251(int var0) {
		return AbstractWorldMapIcon.ByteArrayPool_getArrayBool(var0, false);
	}
}
