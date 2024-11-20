import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	@Export("fontBold12")
	public static Font fontBold12;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lsw;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 17610037
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lwu;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1214919447
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("au")
	boolean field1462;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1138399707
	)
	int field1455;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 2113311749
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1063772447
	)
	int field1454;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 385511225
	)
	int field1466;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	ServerPacket field1467;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	ServerPacket field1471;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	ServerPacket field1469;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque();
		this.bufferSize = 0;
		this.buffer = new Buffer(5000);
		this.packetBuffer = new PacketBuffer(40000);
		this.serverPacket = null;
		this.serverPacketLength = 0;
		this.field1462 = true;
		this.field1455 = 0;
		this.pendingWrites = 0;
		this.field1454 = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-36"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear();
		this.bufferSize = 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "125"
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lmc;I)V",
		garbageValue = "31833196"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1);
		var1.index = var1.packetBuffer.offset;
		var1.packetBuffer.offset = 0;
		this.bufferSize += var1.index;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lsw;B)V",
		garbageValue = "-63"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1111797094"
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
		descriptor = "(B)V",
		garbageValue = "16"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Lsw;",
		garbageValue = "2025294975"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(CLpw;I)C",
		garbageValue = "-1967199033"
	)
	@Export("standardizeChar")
	static char standardizeChar(char var0, Language var1) {
		if (var0 >= 192 && var0 <= 255) {
			if (var0 >= 192 && var0 <= 198) {
				return 'A';
			}

			if (var0 == 199) {
				return 'C';
			}

			if (var0 >= 200 && var0 <= 203) {
				return 'E';
			}

			if (var0 >= 204 && var0 <= 207) {
				return 'I';
			}

			if (var0 == 209 && var1 != Language.Language_ES) {
				return 'N';
			}

			if (var0 >= 210 && var0 <= 214) {
				return 'O';
			}

			if (var0 >= 217 && var0 <= 220) {
				return 'U';
			}

			if (var0 == 221) {
				return 'Y';
			}

			if (var0 == 223) {
				return 's';
			}

			if (var0 >= 224 && var0 <= 230) {
				return 'a';
			}

			if (var0 == 231) {
				return 'c';
			}

			if (var0 >= 232 && var0 <= 235) {
				return 'e';
			}

			if (var0 >= 236 && var0 <= 239) {
				return 'i';
			}

			if (var0 == 241 && var1 != Language.Language_ES) {
				return 'n';
			}

			if (var0 >= 242 && var0 <= 246) {
				return 'o';
			}

			if (var0 >= 249 && var0 <= 252) {
				return 'u';
			}

			if (var0 == 253 || var0 == 255) {
				return 'y';
			}
		}

		if (var0 == 338) {
			return 'O';
		} else if (var0 == 339) {
			return 'o';
		} else if (var0 == 376) {
			return 'Y';
		} else {
			return var0;
		}
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "952447122"
	)
	static final void method3153() {
		for (PendingSpawn var0 = (PendingSpawn)HttpRequest.topLevelWorldView.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)HttpRequest.topLevelWorldView.pendingSpawns.previous()) {
			if (var0.hitpoints == -1) {
				var0.delay = 0;
				class7.method65(HttpRequest.topLevelWorldView, var0);
			} else {
				var0.remove();
			}
		}

	}
}
