import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oc")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	static final NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -900251729
	)
	static int field4526;
	@ObfuscatedName("ao")
	static final Object field4530;
	@ObfuscatedName("ad")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque();
		ArchiveDiskActionHandler_responseQueue = new NodeDeque();
		field4526 = 0;
		field4530 = new Object();
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

					synchronized(field4530) {
						if (field4526 <= 1) {
							field4526 = 0;
							field4530.notifyAll();
							return;
						}

						field4526 = 600;
					}
				} else {
					class174.method3881(100L);
					synchronized(field4530) {
						if (field4526 <= 1) {
							field4526 = 0;
							field4530.notifyAll();
							return;
						}

						--field4526;
					}
				}
			}
		} catch (Exception var13) {
			class255.RunException_sendStackTrace((String)null, var13);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/CharSequence;III)Ljava/lang/String;",
		garbageValue = "-1902639880"
	)
	public static String method7668(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) {
			return "";
		} else if (var2 == 1) {
			CharSequence var10 = var0[var1];
			return var10 == null ? "null" : var10.toString();
		} else {
			int var3 = var2 + var1;
			int var4 = 0;

			for (int var5 = var1; var5 < var3; ++var5) {
				CharSequence var9 = var0[var5];
				if (var9 == null) {
					var4 += 4;
				} else {
					var4 += var9.length();
				}
			}

			StringBuilder var8 = new StringBuilder(var4);

			for (int var6 = var1; var6 < var3; ++var6) {
				CharSequence var7 = var0[var6];
				if (var7 == null) {
					var8.append("null");
				} else {
					var8.append(var7);
				}
			}

			return var8.toString();
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Lvh;",
		garbageValue = "-1558697005"
	)
	public static DbTableType method7671(int var0) {
		DbTableType var1 = (DbTableType)DbTableType.DBTableType_cache.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = DbTableType.field5408.takeFile(39, var0);
			var1 = new DbTableType();
			if (var2 != null) {
				var1.method10151(new Buffer(var2));
			}

			var1.method10159();
			DbTableType.DBTableType_cache.put(var1, (long)var0);
			return var1;
		}
	}
}
