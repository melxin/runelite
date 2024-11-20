import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ob")
public enum class383 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	field4488(-1),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	field4485(0),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	field4486(1),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	field4484(2);

	@ObfuscatedName("ph")
	@ObfuscatedGetter(
		intValue = 360228785
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1405415693
	)
	final int field4487;

	class383(int var3) {
		this.field4487 = var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1071289392"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4487;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "118"
	)
	public static void method7487() {
		ByteArrayPool.field4911.clear();
		ByteArrayPool.field4911.add(100);
		ByteArrayPool.field4911.add(5000);
		ByteArrayPool.field4911.add(10000);
		ByteArrayPool.field4911.add(30000);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1841404921"
	)
	public static String method7486(String var0) {
		int var1 = var0.length();
		char[] var2 = new char[var1];
		byte var3 = 2;

		for (int var4 = 0; var4 < var1; ++var4) {
			char var5 = var0.charAt(var4);
			if (var3 == 0) {
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) {
				char var6;
				if (var5 != 181 && var5 != 402) {
					var6 = Character.toTitleCase(var5);
				} else {
					var6 = var5;
				}

				var5 = var6;
			}

			if (Character.isLetter(var5)) {
				var3 = 0;
			} else if (var5 != '.' && var5 != '?' && var5 != '!') {
				if (Character.isSpaceChar(var5)) {
					if (var3 != 2) {
						var3 = 1;
					}
				} else {
					var3 = 1;
				}
			} else {
				var3 = 2;
			}

			var2[var4] = var5;
		}

		return new String(var2);
	}
}
