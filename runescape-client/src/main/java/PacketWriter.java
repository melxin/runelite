import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	static Archive field1291;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -2098708527
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lwj;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lxo;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lwn;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1910035737
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("aq")
	boolean field1298;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1299076225
	)
	int field1294;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1310031987
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -70182873
	)
	int field1301;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1559810541
	)
	int field1302;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	ServerPacket field1303;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	ServerPacket field1304;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	ServerPacket field1305;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
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
		this.field1298 = true;
		this.field1294 = 0;
		this.pendingWrites = 0;
		this.field1301 = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-41"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear();
		this.bufferSize = 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-59"
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lmr;I)V",
		garbageValue = "-1261823635"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1);
		var1.index = var1.packetBuffer.offset;
		var1.packetBuffer.offset = 0;
		this.bufferSize += var1.index;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-55"
	)
	@Export("close")
	void close() {
		if (this.socket != null) {
			this.socket.close();
			this.socket = null;
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "977136793"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Ltf;",
		garbageValue = "-99"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ltf;I)V",
		garbageValue = "-646554309"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Liq;",
		garbageValue = "1412262900"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = (StructComposition)StructComposition.StructDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = StructComposition.StructDefinition_archive.takeFile(34, var0);
			var1 = new StructComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			StructComposition.StructDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
