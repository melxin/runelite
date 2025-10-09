import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pq")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	static final NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("at")
	static final Object field4931;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 213334649
	)
	static int field4932;
	@ObfuscatedName("ae")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque();
		field4931 = new Object();
		ArchiveDiskActionHandler_responseQueue = new NodeDeque();
		field4932 = 0;
	}

	ArchiveDiskActionHandler() {
	}

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) {
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last();
				}

				if (var1 != null) {
					if (var1.type == 0) {
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length);
						synchronized(ArchiveDiskActionHandler_requestQueue) {
							var1.remove();
						}
					} else if (var1.type == 1) {
						var1.data = var1.archiveDisk.read((int)var1.key);
						synchronized(ArchiveDiskActionHandler_requestQueue) {
							ArchiveDiskActionHandler_responseQueue.addFirst(var1);
						}
					}

					synchronized(field4931) {
						if (field4932 <= 1) {
							field4932 = 0;
							field4931.notifyAll();
							return;
						}

						field4932 = 600;
					}
				} else {
					GrandExchangeOfferOwnWorldComparator.method789(100L);
					synchronized(field4931) {
						if (field4932 <= 1) {
							field4932 = 0;
							field4931.notifyAll();
							return;
						}

						--field4932;
					}
				}
			}
		} catch (Exception var13) {
			RunException_sendStackTrace((String)null, var13);
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V",
		garbageValue = "23"
	)
	@Export("RunException_sendStackTrace")
	public static void RunException_sendStackTrace(String var0, Throwable var1) {
		if (var1 != null) {
			var1.printStackTrace();
		} else {
			try {
				String var2 = "";
				if (var1 != null) {
					Throwable var4 = var1;
					String var5;
					if (var1 instanceof RunException) {
						RunException var6 = (RunException)var1;
						var5 = var6.message + " | ";
						var4 = var6.throwable;
					} else {
						var5 = "";
					}

					StringWriter var18 = new StringWriter();
					PrintWriter var7 = new PrintWriter(var18);
					var4.printStackTrace(var7);
					var7.close();
					String var8 = var18.toString();
					BufferedReader var9 = new BufferedReader(new StringReader(var8));
					String var10 = var9.readLine();

					label62:
					while (true) {
						while (true) {
							String var11 = var9.readLine();
							if (var11 == null) {
								var5 = var5 + "| " + var10;
								var2 = var5;
								break label62;
							}

							int var12 = var11.indexOf(40);
							int var13 = var11.indexOf(41, var12 + 1);
							if (var12 >= 0 && var13 >= 0) {
								String var14 = var11.substring(var12 + 1, var13);
								int var15 = var14.indexOf(".java:");
								if (var15 >= 0) {
									var14 = var14.substring(0, var15) + var14.substring(var15 + 5);
									var5 = var5 + var14 + ' ';
									continue;
								}

								var11 = var11.substring(0, var12);
							}

							var11 = var11.trim();
							var11 = var11.substring(var11.lastIndexOf(32) + 1);
							var11 = var11.substring(var11.lastIndexOf(9) + 1);
							var5 = var5 + var11 + ' ';
						}
					}
				}

				if (var0 != null) {
					if (var1 != null) {
						var2 = var2 + " | ";
					}

					var2 = var2 + var0;
				}

				System.out.println("Error: " + var2);
				var2 = var2.replace(':', '.');
				var2 = var2.replace('@', '_');
				var2 = var2.replace('&', '_');
				var2 = var2.replace('#', '_');
				if (class612.RunException_applet == null) {
					return;
				}

				URL var3 = new URL(class612.RunException_applet, "clienterror.ws?cv=" + class32.RunException_revision + "&cs=" + RunException.field6152 + "&u=" + RunException.field6151 + "&v1=" + TaskHandler.javaVendor + "&v2=" + class107.javaVersion + "&ct=" + class40.field261 + "&e=" + var2);
				DataInputStream var17 = new DataInputStream(var3.openStream());
				var17.read();
				var17.close();
			} catch (Exception var16) {
			}

		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([FIFI)F",
		garbageValue = "730622654"
	)
	static float method8340(float[] var0, int var1, float var2) {
		float var3 = var0[var1];

		for (int var4 = var1 - 1; var4 >= 0; --var4) {
			var3 = var0[var4] + var3 * var2;
		}

		return var3;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)[Lxt;",
		garbageValue = "-555896652"
	)
	@Export("FillMode_values")
	public static FillMode[] FillMode_values() {
		return new FillMode[]{FillMode.SOLID, FillMode.field6064, FillMode.field6063};
	}
}
