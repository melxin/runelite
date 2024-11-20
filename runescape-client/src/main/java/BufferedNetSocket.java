import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sb")
@Implements("BufferedNetSocket")
public class BufferedNetSocket extends AbstractSocket {
	@ObfuscatedName("ab")
	@Export("socket")
	Socket socket;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lsn;"
	)
	@Export("source")
	BufferedSource source;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lss;"
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1341209698"
	)
	@Export("isAvailable")
	public boolean isAvailable(int var1) throws IOException {
		return this.source.isAvailable(var1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "2"
	)
	@Export("available")
	public int available() throws IOException {
		return this.source.available();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2014080520"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() throws IOException {
		return this.source.readUnsignedByte();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "-1817161468"
	)
	@Export("read")
	public int read(byte[] var1, int var2, int var3) throws IOException {
		return this.source.read(var1, var2, var3);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "1976196201"
	)
	@Export("write")
	public void write(byte[] var1, int var2, int var3) throws IOException {
		this.sink.write(var1, var2, var3);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "255"
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

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "2085662942"
	)
	static final void method9256(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var8 = var6 - 334;
		if (var8 < 0) {
			var8 = 0;
		} else if (var8 > 100) {
			var8 = 100;
		}

		int var9 = (Client.zoomWidth - Client.zoomHeight) * var8 / 100 + Client.zoomHeight;
		int var7 = var5 * var9 / 256;
		var8 = 2048 - var3 & 2047;
		var9 = 2048 - var4 & 2047;
		int var10 = 0;
		int var11 = 0;
		int var12 = var7;
		int var13;
		int var14;
		int var15;
		if (var8 != 0) {
			var13 = Rasterizer3D.Rasterizer3D_sine[var8];
			var14 = Rasterizer3D.Rasterizer3D_cosine[var8];
			var15 = var11 * var14 - var7 * var13 >> 16;
			var12 = var13 * var11 + var7 * var14 >> 16;
			var11 = var15;
		}

		if (var9 != 0) {
			var13 = Rasterizer3D.Rasterizer3D_sine[var9];
			var14 = Rasterizer3D.Rasterizer3D_cosine[var9];
			var15 = var12 * var13 + var10 * var14 >> 16;
			var12 = var14 * var12 - var13 * var10 >> 16;
			var10 = var15;
		}

		if (Client.isCameraLocked) {
			RestClientThreadFactory.field76 = var0 - var10;
			class376.field4114 = var1 - var11;
			ClanSettings.field1763 = var2 - var12;
			Language.field4677 = var3;
			class328.field3599 = var4;
		} else {
			class403.cameraX = var0 - var10;
			class166.cameraY = var1 - var11;
			class328.cameraZ = var2 - var12;
			SoundSystem.cameraPitch = var3;
			ReflectionCheck.cameraYaw = var4;
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (class443.oculusOrbFocalPointX >> 7 != AsyncHttpResponse.localPlayer.x >> 7 || AsyncRestClient.oculusOrbFocalPointY >> 7 != AsyncHttpResponse.localPlayer.y >> 7)) {
			var13 = AsyncHttpResponse.localPlayer.plane;
			var14 = (class443.oculusOrbFocalPointX >> 7) + HttpRequest.topLevelWorldView.baseX;
			var15 = (AsyncRestClient.oculusOrbFocalPointY >> 7) + HttpRequest.topLevelWorldView.baseY;
			UserComparator9.method3238(var14, var15, var13, true);
		}

	}
}
