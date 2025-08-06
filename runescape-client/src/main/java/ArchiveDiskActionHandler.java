import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pw")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	public static final NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("ab")
	static final Object field4796;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	public static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 399792067
	)
	static int field4795;
	@ObfuscatedName("ig")
	@ObfuscatedGetter(
		intValue = -607855809
	)
	@Export("foundItemIdCount")
	static int foundItemIdCount;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque();
		field4796 = new Object();
		ArchiveDiskActionHandler_responseQueue = new NodeDeque();
		field4795 = 0;
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
							var1.vmethod10593();
						}
					} else if (var1.type == 1) {
						var1.data = var1.archiveDisk.read((int)var1.key);
						synchronized(ArchiveDiskActionHandler_requestQueue) {
							ArchiveDiskActionHandler_responseQueue.addFirst(var1);
						}
					}

					synchronized(field4796) {
						if (field4795 <= 1) {
							field4795 = 0;
							field4796.notifyAll();
							return;
						}

						field4795 = 600;
					}
				} else {
					UserComparator4.method3477(100L);
					synchronized(field4796) {
						if (field4795 <= 1) {
							field4795 = 0;
							field4796.notifyAll();
							return;
						}

						--field4795;
					}
				}
			}
		} catch (Exception var13) {
			class559.RunException_sendStackTrace((String)null, var13);
		}
	}
}
