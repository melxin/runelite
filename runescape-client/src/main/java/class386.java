import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("of")
public enum class386 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	field4552(0, 0),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	field4553(1, 1),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("TOKEN")
	TOKEN(2, 2);

	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1595141869
	)
	final int field4554;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -2095363277
	)
	final int field4551;

	class386(int var3, int var4) {
		this.field4554 = var3;
		this.field4551 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "32"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4551;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-66"
	)
	static String method7526() {
		StringBuilder var0 = new StringBuilder();
		MoveSpeed[] var1 = MoveSpeed.field3130;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			MoveSpeed var3 = var1[var2];
			var0.append(var3.id);
			var0.append(", ");
		}

		String var4 = var0.toString();
		return var4.substring(0, var4.length() - 2);
	}
}
