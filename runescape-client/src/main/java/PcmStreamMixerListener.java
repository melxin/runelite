import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
	@ObfuscatedName("ay")
	int field374;

	@ObfuscatedName("ay")
	@Export("remove2")
	abstract void remove2();

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lbp;)I"
	)
	@Export("update")
	abstract int update();
}
