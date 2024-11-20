import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
public class class133 {
	@ObfuscatedName("ae")
	public static final float field1535;
	@ObfuscatedName("ao")
	public static final float field1532;

	static {
		field1535 = Math.ulp(1.0F);
		field1532 = 2.0F * field1535;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "762272001"
	)
	public static void method3282(AbstractArchive var0) {
		ParamComposition.ParamDefinition_archive = var0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1096972590"
	)
	public static void method3283() {
		VarcInt.VarcInt_cached.clear();
	}
}
