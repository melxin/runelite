import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ol")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	static final NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1781915429
	)
	static int field4525;
	@ObfuscatedName("ae")
	static final Object field4526;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque();
		ArchiveDiskActionHandler_responseQueue = new NodeDeque();
		field4525 = 0;
		field4526 = new Object();
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

					synchronized(field4526) {
						if (field4525 <= 1) {
							field4525 = 0;
							field4526.notifyAll();
							return;
						}

						field4525 = 600;
					}
				} else {
					class188.method3857(100L);
					synchronized(field4526) {
						if (field4525 <= 1) {
							field4525 = 0;
							field4526.notifyAll();
							return;
						}

						--field4525;
					}
				}
			}
		} catch (Exception var13) {
			ArchiveLoader.RunException_sendStackTrace((String)null, var13);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZI)V",
		garbageValue = "-874772167"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var6 = (var0 + var1) / 2;
			int var7 = var0;
			World var8 = class142.World_worlds[var6];
			class142.World_worlds[var6] = class142.World_worlds[var1];
			class142.World_worlds[var1] = var8;

			for (int var9 = var0; var9 < var1; ++var9) {
				if (class230.method4564(class142.World_worlds[var9], var8, var2, var3, var4, var5) <= 0) {
					World var10 = class142.World_worlds[var9];
					class142.World_worlds[var9] = class142.World_worlds[var7];
					class142.World_worlds[var7++] = var10;
				}
			}

			class142.World_worlds[var1] = class142.World_worlds[var7];
			class142.World_worlds[var7] = var8;
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5);
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5);
		}

	}

	@ObfuscatedName("ob")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)Ljava/lang/String;",
		garbageValue = "1"
	)
	static String method7510(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://";
		if (Client.gameBuild == 1) {
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) {
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) {
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) {
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) {
			var0 = "local";
		}

		String var3 = "";
		if (class141.field1630 != null) {
			var3 = "/p=" + class141.field1630;
		}

		String var4 = "runescape.com";
		return var2 + var0 + "." + var4 + "/l=" + class276.clientLanguage + "/a=" + FriendsChat.field4989 + var3 + "/";
	}
}
