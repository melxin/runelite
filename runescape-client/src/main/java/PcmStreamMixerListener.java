import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cq")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
	@ObfuscatedName("ab")
	int field397;

	@ObfuscatedName("ab")
	@Export("remove2")
	abstract void remove2();

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lbg;)I"
	)
	@Export("update")
	abstract int update();
}
