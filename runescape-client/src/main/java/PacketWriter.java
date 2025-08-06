import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("archive10")
	static Archive archive10;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1488328577
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lwj;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lxs;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lwk;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -404162649
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("ap")
	boolean field1273;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1844133741
	)
	int field1274;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -549065699
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 165364461
	)
	int field1275;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1035630723
	)
	int field1268;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	ServerPacket field1279;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	ServerPacket field1276;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	ServerPacket field1266;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
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
		this.field1273 = true;
		this.field1274 = 0;
		this.pendingWrites = 0;
		this.field1275 = 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1815498535"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear();
		this.bufferSize = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-2"
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lmb;B)V",
		garbageValue = "-9"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1);
		var1.index = var1.packetBuffer.offset;
		var1.packetBuffer.offset = 0;
		this.bufferSize += var1.index;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1758071718"
	)
	@Export("close")
	void close() {
		if (this.socket != null) {
			this.socket.close();
			this.socket = null;
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1498177759"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ltl;",
		garbageValue = "238310058"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V",
		garbageValue = "287980534"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1779220246"
	)
	public static int method2930(int var0) {
		return class334.field3744[var0];
	}
}
