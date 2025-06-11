import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ly")
public class class300 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	static final class300 field3305;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	static final class300 field3302;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 2081964645
	)
	@Export("value")
	final int value;

	static {
		field3305 = new class300(0);
		field3302 = new class300(1);
	}

	class300(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1248859833"
	)
	public static int method6623(int var0) {
		return var0 >> 24 & 3;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Z",
		garbageValue = "2146925470"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		boolean var2 = false;
		boolean var3 = false;
		int var4 = 0;
		int var5 = var0.length();
		int var6 = 0;

		boolean var1;
		while (true) {
			if (var6 >= var5) {
				var1 = var3;
				break;
			}

			label83: {
				char var7 = var0.charAt(var6);
				if (var6 == 0) {
					if (var7 == '-') {
						var2 = true;
						break label83;
					}

					if (var7 == '+') {
						break label83;
					}
				}

				int var9;
				if (var7 >= '0' && var7 <= '9') {
					var9 = var7 - '0';
				} else if (var7 >= 'A' && var7 <= 'Z') {
					var9 = var7 - '7';
				} else {
					if (var7 < 'a' || var7 > 'z') {
						var1 = false;
						break;
					}

					var9 = var7 - 'W';
				}

				if (var9 >= 10) {
					var1 = false;
					break;
				}

				if (var2) {
					var9 = -var9;
				}

				int var8 = var4 * 10 + var9;
				if (var4 != var8 / 10) {
					var1 = false;
					break;
				}

				var4 = var8;
				var3 = true;
			}

			++var6;
		}

		return var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "30"
	)
	public static void method6626() {
		WorldMapRegion.WorldMapRegion_cachedSprites.clear();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "630967149"
	)
	public static void method6624() {
		synchronized(ArchiveDiskActionHandler.field4691) {
			if (ArchiveDiskActionHandler.field4695 != 0) {
				ArchiveDiskActionHandler.field4695 = 1;

				try {
					ArchiveDiskActionHandler.field4691.wait();
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
