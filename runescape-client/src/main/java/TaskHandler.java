import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jz")
@Implements("TaskHandler")
public class TaskHandler implements Runnable {
	@ObfuscatedName("aj")
	@Export("javaVendor")
	public static String javaVendor;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("current")
	Task current;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("task")
	Task task;
	@ObfuscatedName("aq")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("ac")
	@Export("isClosed")
	boolean isClosed;

	public TaskHandler() {
		this.current = null;
		this.task = null;
		this.isClosed = false;
		javaVendor = "Unknown";
		class107.javaVersion = "1.6";

		try {
			javaVendor = System.getProperty("java.vendor");
			class107.javaVersion = System.getProperty("java.version");
		} catch (Exception var2) {
		}

		this.isClosed = false;
		this.thread = new Thread(this);
		this.thread.setPriority(10);
		this.thread.setDaemon(true);
		this.thread.start();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-655864944"
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/lang/Object;I)Lkx;",
		garbageValue = "-687730798"
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)Lkx;",
		garbageValue = "-104"
	)
	@Export("newSocketTask")
	public final Task newSocketTask(String var1, int var2) {
		return this.newTask(1, var2, 0, var1);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;II)Lkx;",
		garbageValue = "-1128485977"
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

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(Ldm;Lcs;IILkj;I)V",
		garbageValue = "766335465"
	)
	static final void method5936(WorldView var0, Player var1, int var2, int var3, MoveSpeed var4) {
		int var5 = var1.pathX[0];
		int var6 = var1.pathY[0];
		int var7 = var1.size;
		CollisionMap var8 = var0.collisionMaps[var0.plane];
		if (var5 >= var7 && var5 < var8.method6174() - var7 && var6 >= var7 && var6 < var8.method6175() - var7) {
			if (var2 >= var7 && var2 < var8.method6174() - var7 && var3 >= var7 && var3 < var8.method6175() - var7) {
				class281 var9 = Client.field297;
				Client.field303.approxDestinationX = var2;
				Client.field303.approxDestinationY = var3;
				Client.field303.approxDestinationSizeX = 1;
				Client.field303.approxDestinationSizeY = 1;
				ApproximateRouteStrategy var13 = Client.field303;
				int var14 = var9.method6348(var5, var6, var7, var13, var8, true, Client.field578, Client.field579);
				if (var14 >= 1) {
					for (int var15 = 0; var15 < var14 - 1; ++var15) {
						var1.method2527(Client.field578[var15], Client.field579[var15], var4);
					}

				}
			}
		}
	}
}
