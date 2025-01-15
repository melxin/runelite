import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ix")
@Implements("TaskHandler")
public class TaskHandler implements Runnable {
	@ObfuscatedName("ay")
	@Export("javaVendor")
	public static String javaVendor;
	@ObfuscatedName("ah")
	@Export("javaVersion")
	public static String javaVersion;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("current")
	Task current;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("task")
	Task task;
	@ObfuscatedName("ad")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("an")
	@Export("isClosed")
	boolean isClosed;

	public TaskHandler() {
		this.current = null;
		this.task = null;
		this.isClosed = false;
		javaVendor = "Unknown";
		javaVersion = "1.6";

		try {
			javaVendor = System.getProperty("java.vendor");
			javaVersion = System.getProperty("java.version");
		} catch (Exception var2) {
		}

		this.isClosed = false;
		this.thread = new Thread(this);
		this.thread.setPriority(10);
		this.thread.setDaemon(true);
		this.thread.start();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "25896"
	)
	@Export("close")
	public final void close() {
		synchronized(this) {
			this.isClosed = true;
			this.notifyAll();
		}

		try {
			this.thread.join();
		} catch (InterruptedException var3) {
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/lang/Object;I)Liq;",
		garbageValue = "496476713"
	)
	@Export("newTask")
	final Task newTask(int var1, int var2, int var3, Object var4) {
		Task var5 = new Task();
		var5.type = var1;
		var5.intArgument = var2;
		var5.objectArgument = var4;
		synchronized(this) {
			if (this.task != null) {
				this.task.next = var5;
				this.task = var5;
			} else {
				this.task = this.current = var5;
			}

			this.notify();
			return var5;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Liq;",
		garbageValue = "-530151426"
	)
	@Export("newSocketTask")
	public final Task newSocketTask(String var1, int var2) {
		return this.newTask(1, var2, 0, var1);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;IB)Liq;",
		garbageValue = "82"
	)
	@Export("newThreadTask")
	public final Task newThreadTask(Runnable var1, int var2) {
		return this.newTask(2, var2, 0, var1);
	}

	public final void run() {
		while (true) {
			Task var1;
			synchronized(this) {
				while (true) {
					if (this.isClosed) {
						return;
					}

					if (this.current != null) {
						var1 = this.current;
						this.current = this.current.next;
						if (this.current == null) {
							this.task = null;
						}
						break;
					}

					try {
						this.wait();
					} catch (InterruptedException var8) {
					}
				}
			}

			try {
				int var5 = var1.type;
				if (var5 == 1) {
					var1.result = new Socket(InetAddress.getByName((String)var1.objectArgument), var1.intArgument);
				} else if (var5 == 2) {
					Thread var3 = new Thread((Runnable)var1.objectArgument);
					var3.setDaemon(true);
					var3.start();
					var3.setPriority(var1.intArgument);
					var1.result = var3;
				} else if (var5 == 4) {
					var1.result = new DataInputStream(((URL)var1.objectArgument).openStream());
				}

				var1.status = 1;
			} catch (ThreadDeath var6) {
				throw var6;
			} catch (Throwable var7) {
				var1.status = 2;
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "688799447"
	)
	public static void method4914() {
		synchronized(MouseHandler.MouseHandler_instance) {
			MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile;
			MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile;
			MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile;
			MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile;
			MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile;
			MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile;
			MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile;
			MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile;
			MouseHandler.MouseHandler_lastButtonVolatile = 0;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-116"
	)
	public static void method4916() {
		synchronized(ArchiveDiskActionHandler.field4530) {
			if (ArchiveDiskActionHandler.field4526 != 0) {
				ArchiveDiskActionHandler.field4526 = 1;

				try {
					ArchiveDiskActionHandler.field4530.wait();
				} catch (InterruptedException var5) {
				}
			}
		}

		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.clear();
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.clear();
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "936346055"
	)
	static int method4922(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) {
			ScriptFrame.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
			int var4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
			if (!Client.isCameraLocked) {
				Client.camAngleX = var3;
				Client.camAngleY = var4;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.camAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.camAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) {
			var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
			if (var3 < 0) {
				var3 = 0;
			}

			Client.camFollowHeight = var3;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.camFollowHeight;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "([BB)[B",
		garbageValue = "7"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		int var2 = var1.readUnsignedByte();
		int var3 = var1.readInt();
		if (var3 < 0 || AbstractArchive.field4585 != 0 && var3 > AbstractArchive.field4585) {
			throw new RuntimeException();
		} else if (var2 == 0) {
			byte[] var6 = new byte[var3];
			var1.readBytes(var6, 0, var3);
			return var6;
		} else {
			int var4 = var1.readInt();
			if (var4 >= 0 && (AbstractArchive.field4585 == 0 || var4 <= AbstractArchive.field4585)) {
				byte[] var5 = new byte[var4];
				if (var2 == 1) {
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5);
				}

				return var5;
			} else {
				throw new RuntimeException();
			}
		}
	}

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIII)I",
		garbageValue = "-1396127676"
	)
	static final int method4908(String var0, String var1, int var2, int var3, int var4, int var5, int var6) {
		return class231.insertMenuItem(var0, var1, var2, var3, var4, var5, var6, false, -1);
	}
}
