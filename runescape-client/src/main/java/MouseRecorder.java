import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("ao")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("an")
	@Export("lock")
	Object lock;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1512077837
	)
	@Export("index")
	int index;
	@ObfuscatedName("af")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("as")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("aq")
	@Export("millis")
	long[] millis;

	MouseRecorder() {
		this.isRunning = true;
		this.lock = new Object();
		this.index = 0;
		this.xs = new int[500];
		this.ys = new int[500];
		this.millis = new long[500];
	}

	public void run() {
		for (; this.isRunning; WorldMapRectangle.method6331(50L)) {
			synchronized(this.lock) {
				if (this.index < 500) {
					this.xs[this.index] = MouseHandler.MouseHandler_x;
					this.ys[this.index] = MouseHandler.MouseHandler_y;
					this.millis[this.index] = MouseHandler.MouseHandler_millis;
					++this.index;
				}
			}
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/CharSequence;III)Ljava/lang/String;",
		garbageValue = "-578448993"
	)
	public static String method2482(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) {
			return "";
		} else if (var2 == 1) {
			CharSequence var10 = var0[var1];
			return var10 == null ? "null" : var10.toString();
		} else {
			int var3 = var2 + var1;
			int var4 = 0;

			for (int var5 = var1; var5 < var3; ++var5) {
				CharSequence var9 = var0[var5];
				if (var9 == null) {
					var4 += 4;
				} else {
					var4 += var9.length();
				}
			}

			StringBuilder var8 = new StringBuilder(var4);

			for (int var6 = var1; var6 < var3; ++var6) {
				CharSequence var7 = var0[var6];
				if (var7 == null) {
					var8.append("null");
				} else {
					var8.append(var7);
				}
			}

			return var8.toString();
		}
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(ILdb;ZI)I",
		garbageValue = "2135199228"
	)
	static int method2480(int var0, Script var1, boolean var2) {
		return 2;
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "673925099"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field543 = 0L;
		if (var0 >= 2) {
			Client.isResizable = true;
		} else {
			Client.isResizable = false;
		}

		if (class171.getWindowedMode() == 1) {
			SecureRandomCallable.client.setMaxCanvasSize(765, 503);
		} else {
			SecureRandomCallable.client.setMaxCanvasSize(7680, 2160);
		}

		if (Client.gameState >= 25 && Client.packetWriter != null && Client.packetWriter.isaacCipher != null) {
			PacketBufferNode var1 = FloorDecoration.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(class171.getWindowedMode());
			var1.packetBuffer.writeShort(GameEngine.canvasWidth);
			var1.packetBuffer.writeShort(class141.canvasHeight);
			Client.packetWriter.addNode(var1);
		}

	}
}
