import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("li")
public class class300 {
	@ObfuscatedName("uz")
	@ObfuscatedGetter(
		intValue = -998293069
	)
	static int field3420;

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILcv;B)Ldd;",
		garbageValue = "3"
	)
	public static WorldView method6916(int var0, WorldViewManager var1) {
		Iterator var2 = var1.iterator();

		WorldView var3;
		Player var4;
		do {
			if (!var2.hasNext()) {
				return var1.method2394();
			}

			var3 = (WorldView)var2.next();
			var4 = (Player)var3.players.get((long)var0);
		} while(var4 == null || var3.id == -1);

		return var3;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "169796251"
	)
	public static void method6918() {
		synchronized(ArchiveDiskActionHandler.field4962) {
			if (ArchiveDiskActionHandler.field4966 != 0) {
				ArchiveDiskActionHandler.field4966 = 1;

				try {
					ArchiveDiskActionHandler.field4962.wait();
				} catch (InterruptedException var5) {
				}
			}
		}

		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.clear();
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.clear();
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;S)[B",
		garbageValue = "-10623"
	)
	public static byte[] method6917(CharSequence var0) {
		int var1 = var0.length();
		byte[] var2 = new byte[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if ((var4 <= 0 || var4 >= 128) && (var4 < 160 || var4 > 255)) {
				if (var4 == 8364) {
					var2[var3] = -128;
				} else if (var4 == 8218) {
					var2[var3] = -126;
				} else if (var4 == 402) {
					var2[var3] = -125;
				} else if (var4 == 8222) {
					var2[var3] = -124;
				} else if (var4 == 8230) {
					var2[var3] = -123;
				} else if (var4 == 8224) {
					var2[var3] = -122;
				} else if (var4 == 8225) {
					var2[var3] = -121;
				} else if (var4 == 710) {
					var2[var3] = -120;
				} else if (var4 == 8240) {
					var2[var3] = -119;
				} else if (var4 == 352) {
					var2[var3] = -118;
				} else if (var4 == 8249) {
					var2[var3] = -117;
				} else if (var4 == 338) {
					var2[var3] = -116;
				} else if (var4 == 381) {
					var2[var3] = -114;
				} else if (var4 == 8216) {
					var2[var3] = -111;
				} else if (var4 == 8217) {
					var2[var3] = -110;
				} else if (var4 == 8220) {
					var2[var3] = -109;
				} else if (var4 == 8221) {
					var2[var3] = -108;
				} else if (var4 == 8226) {
					var2[var3] = -107;
				} else if (var4 == 8211) {
					var2[var3] = -106;
				} else if (var4 == 8212) {
					var2[var3] = -105;
				} else if (var4 == 732) {
					var2[var3] = -104;
				} else if (var4 == 8482) {
					var2[var3] = -103;
				} else if (var4 == 353) {
					var2[var3] = -102;
				} else if (var4 == 8250) {
					var2[var3] = -101;
				} else if (var4 == 339) {
					var2[var3] = -100;
				} else if (var4 == 382) {
					var2[var3] = -98;
				} else if (var4 == 376) {
					var2[var3] = -97;
				} else {
					var2[var3] = 63;
				}
			} else {
				var2[var3] = (byte)var4;
			}
		}

		return var2;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1141102591"
	)
	static void method6919() {
		Iterator var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next();
			var1.clearIsFromIgnored();
		}

	}
}
