import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tt")
@Implements("BufferedNetSocket")
public class BufferedNetSocket extends AbstractSocket {
	@ObfuscatedName("ap")
	@Export("socket")
	Socket socket;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	@Export("source")
	BufferedSource source;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ltd;"
	)
	@Export("sink")
	BufferedSink sink;

	BufferedNetSocket(Socket var1, int var2, int var3) throws IOException {
		this.socket = var1;
		this.socket.setSoTimeout(30000);
		this.socket.setTcpNoDelay(true);
		this.socket.setReceiveBufferSize(65536);
		this.socket.setSendBufferSize(65536);
		this.source = new BufferedSource(this.socket.getInputStream(), var2);
		this.sink = new BufferedSink(this.socket.getOutputStream(), var3);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-118"
	)
	@Export("isAvailable")
	public boolean isAvailable(int var1) throws IOException {
		return this.source.isAvailable(var1);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-837832776"
	)
	@Export("available")
	public int available() throws IOException {
		return this.source.available();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-122"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() throws IOException {
		return this.source.readUnsignedByte();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "-2009179957"
	)
	@Export("read")
	public int read(byte[] var1, int var2, int var3) throws IOException {
		return this.source.read(var1, var2, var3);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "50"
	)
	@Export("write")
	public void write(byte[] var1, int var2, int var3) throws IOException {
		this.sink.write(var1, var2, var3);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "797434832"
	)
	@Export("close")
	public void close() {
		this.sink.close();

		try {
			this.socket.close();
		} catch (IOException var2) {
		}

		this.source.close();
	}

	protected void finalize() {
		this.close();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ltp;B)V",
		garbageValue = "3"
	)
	public static void method9830(class509 var0) {
		class573.method10775(var0);
		int var1 = var0.method9937();
		if (var1 > 1) {
			if (var0.field5288 == class563.field5600) {
				class182.method3997(var0.method9965(), 0, var1 - 1);
			} else if (var0.field5288 == class563.field5594) {
				class177.method3966(var0.method9973(), 0, var1 - 1);
			} else {
				World.method1454(var0.method9936(), 0, var1 - 1);
			}

		}
	}
}
