import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -630103807
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lxa;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lxo;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lxj;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 253081433
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("aw")
	boolean field1269;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1585880345
	)
	int field1270;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1338760881
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -8070575
	)
	int field1262;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1178225279
	)
	int field1273;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	ServerPacket field1272;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	ServerPacket field1275;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	ServerPacket field1267;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ltd;"
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
		this.field1269 = true;
		this.field1270 = 0;
		this.pendingWrites = 0;
		this.field1262 = 0;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "19"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear();
		this.bufferSize = 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-489061727"
	)
	@Export("flush")
	final void flush() throws IOException {
		if (this.socket != null && this.bufferSize > 0) {
			this.buffer.offset = 0;

			while (true) {
				PacketBufferNode var1 = (PacketBufferNode)this.packetBufferNodes.last();
				if (var1 == null || var1.index > this.buffer.array.length - this.buffer.offset * 2108391709) {
					this.socket.write(this.buffer.array, 0, this.buffer.offset * 2108391709);
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
		descriptor = "(Lmj;I)V",
		garbageValue = "-1771370198"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1);
		var1.index = var1.packetBuffer.offset * 2108391709;
		var1.packetBuffer.offset = 0;
		this.bufferSize += var1.index;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "26"
	)
	@Export("close")
	void close() {
		if (this.socket != null) {
			this.socket.close();
			this.socket = null;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1703255159"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Ltd;",
		garbageValue = "-918483669"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ltd;I)V",
		garbageValue = "1600971785"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1;
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(Ldd;Lci;IILlz;B)V",
		garbageValue = "51"
	)
	static final void method3054(WorldView var0, Player var1, int var2, int var3, MoveSpeed var4) {
		int var5 = var1.pathX[0];
		int var6 = var1.pathY[0];
		int var7 = var1.size * -548859904;
		CollisionMap var8 = var0.collisionMaps[var0.plane];
		if (var5 >= var7 && var5 < var8.method6330() - var7 && var6 >= var7 && var6 < var8.method6331() - var7) {
			if (var2 >= var7 && var2 < var8.method6330() - var7 && var3 >= var7 && var3 < var8.method6331() - var7) {
				class288 var9 = Client.field516;
				Client.field287.approxDestinationX = var2;
				Client.field287.approxDestinationY = var3;
				Client.field287.approxDestinationSizeY = 1;
				Client.field287.approxDestinationSizeX = 1;
				ApproximateRouteStrategy var13 = Client.field287;
				int var14 = var9.method6534(var5, var6, var7, var13, var8, true, Client.field488, Client.field557);
				if (var14 >= 1) {
					for (int var15 = 0; var15 < var14 - 1; ++var15) {
						var1.method2557(Client.field488[var15], Client.field557[var15], var4);
					}

				}
			}
		}
	}
}
