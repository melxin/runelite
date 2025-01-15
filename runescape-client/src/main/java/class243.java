import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jb")
public class class243 extends DualNode {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("field2023")
	static EvictingDualNodeHashTable field2023;
	@ObfuscatedName("pm")
	@ObfuscatedGetter(
		intValue = 664650581
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;

	static {
		field2023 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lpq;Lpq;Lpq;I)V",
		garbageValue = "390023160"
	)
	public static void method5285(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		SequenceDefinition.SequenceDefinition_archive = var0;
		SequenceDefinition.SequenceDefinition_animationsArchive = var1;
		class466.SequenceDefinition_skeletonsArchive = var2;
	}
}
