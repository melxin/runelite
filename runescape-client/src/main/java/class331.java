import java.util.Arrays;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mj")
public class class331 {
	@ObfuscatedName("pr")
	static int[] field3831;

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ltl;Ljava/lang/Object;III)V",
		garbageValue = "1011600051"
	)
	public static void method7061(DynamicArray var0, Object var1, int var2, int var3) {
		PacketBufferNode.method7052(var0, (class572)null, true);
		if (var2 < 0) {
			var2 = 0;
		}

		int var4 = var3 + var2;
		if (var3 < 0 || var4 < 0 || var4 > var0.method10433()) {
			var4 = var0.method10433();
		}

		if (var0.field5571 == class572.field5879) {
			Arrays.fill(var0.method10430(), var2, var4, (Integer)var1);
		} else if (var0.field5571 == class572.field5878) {
			Arrays.fill(var0.method10431(), var2, var4, (Long)var1);
		} else {
			Arrays.fill(var0.method10428(), var2, var4, var1);
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)J",
		garbageValue = "-631696163"
	)
	public static long method7062(int var0) {
		if (var0 > 63) {
			throw new class455("Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d", new Object[]{var0});
		} else {
			return (long)Math.pow(2.0D, (double)var0) - 1L;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILok;Lok;I)Lok;",
		garbageValue = "-2045342411"
	)
	static Widget method7063(int var0, Widget var1, Widget var2) {
		int var3 = 0;
		Widget var4 = null;

		for (int var5 = var2.childIndex * -2066937045 + 1; var5 < var1.children.length; ++var5) {
			Widget var6 = var1.children[var5];
			if (var6 != null && var2.childIndex * -2066937045 == var6.field4173) {
				++var3;
				if (var0 == var3 - 1) {
					var4 = var6;
					break;
				}
			}
		}

		return var4;
	}
}
