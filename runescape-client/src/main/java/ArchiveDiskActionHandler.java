import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("px")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lqk;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	public static final NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("aj")
	static final Object field4691;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lqk;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	public static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1733720249
	)
	static int field4695;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lwz;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque();
		field4691 = new Object();
		ArchiveDiskActionHandler_responseQueue = new NodeDeque();
		field4695 = 0;
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

					synchronized(field4691) {
						if (field4695 <= 1) {
							field4695 = 0;
							field4691.notifyAll();
							return;
						}

						field4695 = 600;
					}
				} else {
					UserComparator8.method3393(100L);
					synchronized(field4691) {
						if (field4695 <= 1) {
							field4695 = 0;
							field4691.notifyAll();
							return;
						}

						--field4695;
					}
				}
			}
		} catch (Exception var13) {
			class569.RunException_sendStackTrace((String)null, var13);
		}
	}
}
