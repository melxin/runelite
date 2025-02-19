import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("km")
@Implements("BoundaryObject")
public final class BoundaryObject {
	@ObfuscatedName("ax")
	static int[] field3005;
	@ObfuscatedName("mu")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	static Model field3009;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1560806455
	)
	@Export("z")
	int z;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1242164413
	)
	@Export("x")
	int x;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1196267489
	)
	@Export("y")
	int y;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1454268915
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 568769655
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ljc;"
	)
	@Export("renderable1")
	public TileItem renderable1;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ljc;"
	)
	@Export("renderable2")
	public TileItem renderable2;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = -1173552471521436951L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1131555259
	)
	@Export("flags")
	int flags;

	BoundaryObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I[BLtu;B)V",
		garbageValue = "17"
	)
	static void method5542(int var0, byte[] var1, ArchiveDisk var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction();
		var3.type = 0;
		var3.key = (long)var0;
		var3.data = var1;
		var3.archiveDisk = var2;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3);
		}

		synchronized(ArchiveDiskActionHandler.field4639) {
			if (ArchiveDiskActionHandler.field4637 == 0) {
				WorldMapDecoration.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
				WorldMapDecoration.ArchiveDiskActionHandler_thread.setDaemon(true);
				WorldMapDecoration.ArchiveDiskActionHandler_thread.start();
				WorldMapDecoration.ArchiveDiskActionHandler_thread.setPriority(5);
			}

			ArchiveDiskActionHandler.field4637 = 600;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Date;",
		garbageValue = "1891983204"
	)
	static Date method5543() throws ParseException {
		SimpleDateFormat var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
		var0.setLenient(false);
		StringBuilder var1 = new StringBuilder();
		String[] var2 = Login.field963;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			String var4 = var2[var3];
			if (var4 == null) {
				ObjectComposition.method4206(7);
				class401.setLoginResponseString("Date not valid.", "Please ensure all characters are populated.", "");
				return null;
			}

			var1.append(var4);
		}

		var1.append("12");
		return var0.parse(var1.toString());
	}
}
