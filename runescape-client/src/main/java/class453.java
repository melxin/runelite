import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rf")
public class class453 extends RuntimeException {
	public class453(String var1, Object[] var2) {
		super(String.format(var1, var2));
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lpx;Lpx;I)V",
		garbageValue = "-347933125"
	)
	public static void method9218(AbstractArchive var0, AbstractArchive var1) {
		SpotAnimationDefinition.field2160 = var0;
		class143.SpotAnimationDefinition_modelArchive = var1;
	}
}
