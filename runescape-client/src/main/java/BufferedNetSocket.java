import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tu")
@Implements("BufferedNetSocket")
public class BufferedNetSocket extends AbstractSocket {
	@ObfuscatedName("av")
	@Export("socket")
	Socket socket;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ltg;"
	)
	@Export("source")
	BufferedSource source;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ltw;"
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-72"
	)
	@Export("isAvailable")
	public boolean isAvailable(int var1) throws IOException {
		return this.source.isAvailable(var1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1807232209"
	)
	@Export("available")
	public int available() throws IOException {
		return this.source.available();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1814158103"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() throws IOException {
		return this.source.readUnsignedByte();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "1534386910"
	)
	@Export("read")
	public int read(byte[] var1, int var2, int var3) throws IOException {
		return this.source.read(var1, var2, var3);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "154652065"
	)
	@Export("write")
	public void write(byte[] var1, int var2, int var3) throws IOException {
		this.sink.write(var1, var2, var3);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1883200549"
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ldd;IIIIILxt;Loz;I)V",
		garbageValue = "-1390648400"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(WorldView var0, int var1, int var2, int var3, int var4, int var5, SpritePixels var6, SpriteMask var7) {
		ProjectionCoord var8 = class86.method2932(var0, var1, var2);
		var1 = (int)var8.x;
		var2 = (int)var8.y;
		var8.release();
		int var9 = var1 / 32 - Client.field468 / 32;
		int var10 = var2 / 32 - Client.field512 / 32;
		int var11 = var10 * var10 + var9 * var9;
		if (var11 > 4225 && var11 < 90000) {
			int var12 = Rasterizer3D.Rasterizer3D_sine[var5];
			int var13 = Rasterizer3D.Rasterizer3D_cosine[var5];
			int var14 = var10 * var12 + var9 * var13 >> 16;
			int var15 = var13 * var10 - var9 * var12 >> 16;
			double var16 = Math.atan2((double)var14, (double)var15);
			int var18 = var7.width / 2 - 25;
			int var19 = (int)(Math.sin(var16) * (double)var18);
			int var20 = (int)(Math.cos(var16) * (double)var18);
			byte var21 = 20;
			class39.redHintArrowSprite.method12150(var19 + (var3 + var7.width / 2 - var21 / 2), var7.height / 2 + var4 - var21 / 2 - var20 - 10, var21, var21, 15, 15, var16, 256);
		} else {
			SecureRandomFuture.drawSpriteOnMinimap(var3, var4, var9, var10, var5, var6, var7);
		}

	}
}
