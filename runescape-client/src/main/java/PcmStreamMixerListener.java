import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ev")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
	@ObfuscatedName("al")
	int field1468;

	@ObfuscatedName("al")
	@Export("remove2")
	abstract void remove2();

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lde;)I"
	)
	@Export("update")
	abstract int update();
}
