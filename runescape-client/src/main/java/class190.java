import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hz")
public class class190 extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("field2023")
	public static EvictingDualNodeHashTable field2023;
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;

	static {
		field2023 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "-1681769584"
	)
	public static void method3884(AbstractArchive var0) {
		EnumComposition.EnumDefinition_archive = var0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Lhb;",
		garbageValue = "1789621540"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = (StructComposition)StructComposition.StructDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = StructComposition.StructDefinition_archive.takeFile(34, var0);
			var1 = new StructComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			StructComposition.StructDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
