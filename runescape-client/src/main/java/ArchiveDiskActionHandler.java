import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qf")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lrt;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	public static final NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("at")
	static final Object field4962;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lrt;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	public static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -412991015
	)
	static int field4966;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque();
		field4962 = new Object();
		ArchiveDiskActionHandler_responseQueue = new NodeDeque();
		field4966 = 0;
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

					synchronized(field4962) {
						if (field4966 <= 1) {
							field4966 = 0;
							field4962.notifyAll();
							return;
						}

						field4966 = 600;
					}
				} else {
					LoginState.method841(100L);
					synchronized(field4962) {
						if (field4966 <= 1) {
							field4966 = 0;
							field4962.notifyAll();
							return;
						}

						--field4966;
					}
				}
			}
		} catch (Exception var13) {
			PlayerType.RunException_sendStackTrace((String)null, var13);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([FIFB)F",
		garbageValue = "-63"
	)
	static float method8528(float[] var0, int var1, float var2) {
		float var3 = var0[var1];

		for (int var4 = var1 - 1; var4 >= 0; --var4) {
			var3 = var0[var4] + var3 * var2;
		}

		return var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lut;Lwh;I)V",
		garbageValue = "1876499627"
	)
	static void method8530(DynamicArray var0, class586 var1) {
		class461.method9375(var0, var1, true);
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(ILcu;ZI)I",
		garbageValue = "-1929398799"
	)
	static int method8529(int var0, Script var1, boolean var2) {
		return 2;
	}
}
