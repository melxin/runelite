import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("rh")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	static Model field1464;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 265792425
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lve;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lwl;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lvu;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1056703755
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("am")
	boolean field1468;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1219443125
	)
	int field1475;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 864595061
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 91682165
	)
	int field1471;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -550903583
	)
	int field1472;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	ServerPacket field1461;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	ServerPacket field1474;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	ServerPacket field1463;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ltm;"
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
		this.field1468 = true;
		this.field1475 = 0;
		this.pendingWrites = 0;
		this.field1471 = 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1076946426"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear();
		this.bufferSize = 0;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1416029166"
	)
	@Export("flush")
	final void flush() throws IOException {
		if (this.socket != null && this.bufferSize > 0) {
			this.buffer.offset = 0;

			while (true) {
				PacketBufferNode var1 = (PacketBufferNode)this.packetBufferNodes.last();
				if (var1 == null || var1.index > this.buffer.array.length - this.buffer.offset * -2066221813) {
					this.socket.write(this.buffer.array, 0, this.buffer.offset * -2066221813);
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lmr;I)V",
		garbageValue = "-296846854"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1);
		var1.index = var1.packetBuffer.offset * -2066221813;
		var1.packetBuffer.offset = 0;
		this.bufferSize += var1.index;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1464841151"
	)
	@Export("close")
	void close() {
		if (this.socket != null) {
			this.socket.close();
			this.socket = null;
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2078455341"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Ltm;",
		garbageValue = "-15"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)V",
		garbageValue = "880932167"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Ldb;",
		garbageValue = "-1656258681"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = WorldMapDecoration.archive12.takeFile(var0, 0);
			if (var2 == null) {
				return null;
			} else {
				var1 = World.newScript(var2);
				Script.Script_cached.put(var1, (long)var0);
				return var1;
			}
		}
	}
}
