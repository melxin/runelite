import java.io.File;
import java.io.RandomAccessFile;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ac")
@Implements("RestClientThreadFactory")
public class RestClientThreadFactory implements ThreadFactory {
	@ObfuscatedName("ao")
	final ThreadGroup field60;
	@ObfuscatedName("an")
	final AtomicInteger field58;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	final AsyncRestClient this$0;

	@ObfuscatedSignature(
		descriptor = "(Laj;)V"
	)
	RestClientThreadFactory(AsyncRestClient var1) {
		this.this$0 = var1;
		this.field58 = new AtomicInteger(1);
		SecurityManager var2 = System.getSecurityManager();
		this.field60 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
	}

	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field60, var1, this.this$0.threadNamePrefix + "-rest-request-" + this.field58.getAndIncrement(), 0L);
		var2.setDaemon(true);
		var2.setPriority(5);
		return var2;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZI)V",
		garbageValue = "-1009133142"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		class131.method3265(var0, var1, "openjs", var2);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "10539"
	)
	public static void method209() {
		if (MouseHandler.MouseHandler_instance != null) {
			synchronized(MouseHandler.MouseHandler_instance) {
				MouseHandler.MouseHandler_instance = null;
			}
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;ZI)Z",
		garbageValue = "-1945821561"
	)
	static boolean method204(File var0, boolean var1) {
		try {
			RandomAccessFile var2 = new RandomAccessFile(var0, "rw");
			int var3 = var2.read();
			var2.seek(0L);
			var2.write(var3);
			var2.seek(0L);
			var2.close();
			if (var1) {
				var0.delete();
			}

			return true;
		} catch (Exception var4) {
			return false;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)[Low;",
		garbageValue = "-1409143488"
	)
	public static class377[] method208() {
		return new class377[]{class377.field4189, class377.field4186, class377.field4191};
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(Lmr;B)V",
		garbageValue = "70"
	)
	static void method207(PacketBufferNode var0) {
		var0.packetBuffer.writeIntLE(class456.field5014.hash);
		var0.packetBuffer.writeIntIME(WorldMapDecoration.archive12.hash);
		var0.packetBuffer.writeIntIME(AsyncHttpResponse.field66.hash);
		var0.packetBuffer.writeInt(class231.field2558.hash);
		var0.packetBuffer.writeInt(FloorDecoration.archive10.hash);
		var0.packetBuffer.writeIntLE(class161.archive9.hash);
		var0.packetBuffer.writeIntLE(class357.archive8.hash);
		var0.packetBuffer.writeIntIME(0);
		var0.packetBuffer.writeInt(class342.field3779.hash);
		var0.packetBuffer.writeIntLE(UserComparator6.field1532.hash);
		var0.packetBuffer.writeInt(class147.archive4.hash);
		var0.packetBuffer.writeIntLE(SongTask.field5037.hash);
		var0.packetBuffer.writeInt(class133.field1576.hash);
		var0.packetBuffer.writeIntIME(class521.archive2.hash);
		var0.packetBuffer.writeIntIME(class171.field1872.hash);
		var0.packetBuffer.writeIntME(class140.field1650.hash);
		var0.packetBuffer.writeInt(class33.field150.hash);
		var0.packetBuffer.writeIntME(class330.field3665.hash);
		var0.packetBuffer.writeIntIME(MouseHandler.archive13.hash);
		var0.packetBuffer.writeInt(class145.field1696.hash);
		var0.packetBuffer.writeIntME(HttpMethod.field39.hash);
		var0.packetBuffer.writeInt(ClientPacket.field3483.hash);
		var0.packetBuffer.writeIntME(class143.archive6.hash);
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1677915150"
	)
	static int method203(int var0, int var1) {
		int var2 = var1 - 334;
		if (var2 < 0) {
			var2 = 0;
		} else if (var2 > 100) {
			var2 = 100;
		}

		int var3 = (Client.zoomWidth - Client.zoomHeight) * var2 / 100 + Client.zoomHeight;
		return var0 * var3 / 256;
	}
}
