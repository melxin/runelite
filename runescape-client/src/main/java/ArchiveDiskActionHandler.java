import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pl")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	public static final NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("aw")
	static final Object field4903;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	public static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1118150385
	)
	static int field4901;
	@ObfuscatedName("ao")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque();
		field4903 = new Object();
		ArchiveDiskActionHandler_responseQueue = new NodeDeque();
		field4901 = 0;
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

					synchronized(field4903) {
						if (field4901 <= 1) {
							field4901 = 0;
							field4903.notifyAll();
							return;
						}

						field4901 = 600;
					}
				} else {
					class164.method4001(100L);
					synchronized(field4903) {
						if (field4901 <= 1) {
							field4901 = 0;
							field4903.notifyAll();
							return;
						}

						--field4901;
					}
				}
			}
		} catch (Exception var13) {
			class508.RunException_sendStackTrace((String)null, var13);
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ILcg;ZI)I",
		garbageValue = "-777180588"
	)
	static int method8285(int var0, Script var1, boolean var2) {
		return 2;
	}
}
