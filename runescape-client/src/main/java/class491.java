import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sl")
public enum class491 implements Enum {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	field5089(0, 0),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	field5087(1, 1),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	field5088(2, 2);

	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -2128852175
	)
	final int field5086;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1464190671
	)
	final int field5090;

	class491(int var3, int var4) {
		this.field5086 = var3;
		this.field5090 = var4;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "118"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5090;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lpq;Lpq;I)V",
		garbageValue = "-1410969698"
	)
	public static void method9488(AbstractArchive var0, AbstractArchive var1) {
		SpotAnimationDefinition.SpotAnimationDefinition_archive = var0;
		SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var1;
	}
}
