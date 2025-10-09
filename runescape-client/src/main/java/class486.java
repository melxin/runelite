import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sx")
public class class486 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lsx;"
	)
	public static final class486 field5404;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lsx;"
	)
	static final class486 field5405;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -2089863521
	)
	final int field5406;

	static {
		field5404 = new class486(1);
		field5405 = new class486(0);
	}

	class486(int var1) {
		this.field5406 = var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Ltl;",
		garbageValue = "-2056690160"
	)
	public static DynamicArray method9898(String var0, String var1) {
		if (var1 != null && !var1.isEmpty()) {
			int var2 = var1.length();
			int var3 = 1;

			int var4;
			for (var4 = 0; (var4 = var0.indexOf(var1, var4)) != -1; var4 += var2) {
				++var3;
			}

			DynamicArray var5 = new DynamicArray(class572.field5877, (Object)null, var3, var3);
			int var6 = 0;
			var4 = 0;

			for (var3 = 0; (var4 = var0.indexOf(var1, var4)) != -1; var6 = var4) {
				var5.method10428()[var3++] = var0.substring(var6, var4);
				var4 += var2;
			}

			var5.method10428()[var3] = var0.substring(var6);
			return var5;
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("pw")
	@ObfuscatedSignature(
		descriptor = "(I)Lpa;",
		garbageValue = "-690729766"
	)
	static JagNetThread method9899() {
		return BufferedNetSocket.field5515;
	}
}
