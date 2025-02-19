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
		descriptor = "Lqb;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	static final NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1055879773
	)
	static int field4637;
	@ObfuscatedName("ad")
	static final Object field4639;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque();
		ArchiveDiskActionHandler_responseQueue = new NodeDeque();
		field4637 = 0;
		field4639 = new Object();
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

					synchronized(field4639) {
						if (field4637 <= 1) {
							field4637 = 0;
							field4639.notifyAll();
							return;
						}

						field4637 = 600;
					}
				} else {
					IntProjection.method4837(100L);
					synchronized(field4639) {
						if (field4637 <= 1) {
							field4637 = 0;
							field4639.notifyAll();
							return;
						}

						--field4637;
					}
				}
			}
		} catch (Exception var13) {
			class213.RunException_sendStackTrace((String)null, var13);
		}
	}
}
