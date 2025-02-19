import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jy")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -781146027
	)
	@Export("x")
	int x;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 361732789
	)
	@Export("y")
	int y;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1794956465
	)
	@Export("z")
	int z;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1010980195
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	}

	@ObfuscatedSignature(
		descriptor = "(Ljy;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x;
		this.y = var1.y;
		this.z = var1.z;
		this.magnitude = var1.magnitude;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1931190339"
	)
	public static void method5432() {
		synchronized(ArchiveDiskActionHandler.field4639) {
			if (ArchiveDiskActionHandler.field4637 != 0) {
				ArchiveDiskActionHandler.field4637 = 1;

				try {
					ArchiveDiskActionHandler.field4639.wait();
				} catch (InterruptedException var5) {
				}
			}
		}

		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.clear();
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.clear();
		}
	}
}
