import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ltj;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lqk;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1354200105
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lwp;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lvu;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1683159827
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("aa")
	boolean field1489;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 969283701
	)
	int field1490;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1362019733
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 2021687653
	)
	int field1492;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1386877599
	)
	int field1493;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	ServerPacket field1491;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	ServerPacket field1495;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	ServerPacket field1481;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque();
		this.bufferSize = 0;
		this.buffer = new Buffer(5000);
		this.packetBuffer = new PacketBuffer(40000);
		this.serverPacket = null;
		this.serverPacketLength = 0;
		this.field1489 = true;
		this.field1490 = 0;
		this.pendingWrites = 0;
		this.field1492 = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2140300247"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear();
		this.bufferSize = 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-58"
	)
	@Export("flush")
	final void flush() throws IOException {
		if (this.socket != null && this.bufferSize > 0) {
			this.buffer.field5570 = 0;

			while (true) {
				PacketBufferNode var1 = (PacketBufferNode)this.packetBufferNodes.last();
				if (var1 == null || var1.index > this.buffer.field5573.length - this.buffer.field5570) {
					this.socket.write(this.buffer.field5573, 0, this.buffer.field5570);
					this.pendingWrites = 0;
					break;
				}

				this.buffer.writeBytes(var1.packetBuffer.field5573, 0, var1.index);
				this.bufferSize -= var1.index;
				var1.remove();
				var1.packetBuffer.releaseArray();
				var1.release();
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lmo;I)V",
		garbageValue = "1470343003"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1);
		var1.index = var1.packetBuffer.field5570;
		var1.packetBuffer.field5570 = 0;
		this.bufferSize += var1.index;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ltj;I)V",
		garbageValue = "-547379895"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1486509711"
	)
	@Export("close")
	void close() {
		if (this.socket != null) {
			this.socket.close();
			this.socket = null;
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "947131813"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Ltj;",
		garbageValue = "-2046923954"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lnz;I)I",
		garbageValue = "1825926250"
	)
	static int method3123(Widget var0) {
		if (var0.type != 11) {
			Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize - 1] = "";
			return 1;
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var0.method7420(var1);
			return 1;
		}
	}
}
