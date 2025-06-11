import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
public class class218 {
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1877000185
	)
	static int field2407;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	public UrlRequest field2406;
	@ObfuscatedName("aj")
	public float[] field2405;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	final class228 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lio;)V"
	)
	class218(class228 var1) {
		this.this$0 = var1;
		this.field2405 = new float[4];
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ltp;Ljava/lang/Object;IIB)V",
		garbageValue = "-95"
	)
	public static void method4698(class509 var0, Object var1, int var2, int var3) {
		class573.method10775(var0);
		if (var2 < 0) {
			var2 = 0;
		}

		int var4 = var3 + var2;
		if (var3 < 0 || var4 < 0 || var4 > var0.method9937()) {
			var4 = var0.method9937();
		}

		if (var0.field5288 == class563.field5600) {
			Arrays.fill(var0.method9965(), var2, var4, (Integer)var1);
		} else if (var0.field5288 == class563.field5594) {
			Arrays.fill(var0.method9973(), var2, var4, (Long)var1);
		} else {
			Arrays.fill(var0.method9936(), var2, var4, var1);
		}

	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ILcr;ZI)I",
		garbageValue = "2117270441"
	)
	static int method4699(int var0, Script var1, boolean var2) {
		return 2;
	}
}
