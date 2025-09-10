import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	@Export("loginType")
	static LoginType loginType;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -239473435
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lwb;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lxj;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lwf;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 745654293
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("as")
	boolean field1296;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 2129789557
	)
	int field1297;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -841317061
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1330573823
	)
	int field1289;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1710742239
	)
	int field1300;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	ServerPacket field1295;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	ServerPacket field1302;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	ServerPacket field1306;
	@ObfuscatedName("ae")
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
		this.field1296 = true;
		this.field1297 = 0;
		this.pendingWrites = 0;
		this.field1289 = 0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1156810850"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear();
		this.bufferSize = 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "16"
	)
	@Export("flush")
	final void flush() throws IOException {
		if (this.socket != null && this.bufferSize > 0) {
			this.buffer.offset = 0;

			while (true) {
				PacketBufferNode var1 = (PacketBufferNode)this.packetBufferNodes.last();
				if (var1 == null || var1.index > this.buffer.array.length - this.buffer.offset * 1216585693) {
					this.socket.write(this.buffer.array, 0, this.buffer.offset * 1216585693);
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lmy;S)V",
		garbageValue = "15888"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1);
		var1.index = var1.packetBuffer.offset * 1216585693;
		var1.packetBuffer.offset = 0;
		this.bufferSize += var1.index;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
	)
	@Export("close")
	void close() {
		if (this.socket != null) {
			this.socket.close();
			this.socket = null;
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "933471756"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Ltf;",
		garbageValue = "-482460285"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ltf;B)V",
		garbageValue = "36"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1;
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1875660210"
	)
	static boolean method2956() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
			while (Client.archiveLoadersDone < Client.archiveLoaders.size()) {
				ArchiveLoader var0 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone);
				if (!var0.isLoaded()) {
					return false;
				}

				++Client.archiveLoadersDone;
			}

			return true;
		} else {
			return true;
		}
	}
}
