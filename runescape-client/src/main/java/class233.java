import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("il")
public class class233 extends class239 {
	@ObfuscatedName("av")
	String field2605;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	final class236 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ljk;Ljava/lang/String;Ljava/lang/String;)V"
	)
	class233(class236 var1, String var2, String var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field2605 = var3;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2141955216"
	)
	public int vmethod5235() {
		return 1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1380857227"
	)
	public String vmethod5233() {
		return this.field2605;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-9"
	)
	static void method5126() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.field977.last(); var0 != null; var0 = (ObjectSound)ObjectSound.field977.previous()) {
			var0.method2313();
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Lut;",
		garbageValue = "-979757086"
	)
	public static DynamicArray method5127(String var0, String var1) {
		if (var1 != null && !var1.isEmpty()) {
			int var2 = var1.length();
			int var3 = 1;

			int var4;
			for (var4 = 0; (var4 = var0.indexOf(var1, var4)) != -1; var4 += var2) {
				++var3;
			}

			DynamicArray var5 = new DynamicArray(class586.field5939, (Object)null, var3, var3);
			int var6 = 0;
			var4 = 0;

			for (var3 = 0; (var4 = var0.indexOf(var1, var4)) != -1; var6 = var4) {
				var5.method10681()[var3++] = var0.substring(var6, var4);
				var4 += var2;
			}

			var5.method10681()[var3] = var0.substring(var6);
			return var5;
		} else {
			throw new RuntimeException();
		}
	}
}
