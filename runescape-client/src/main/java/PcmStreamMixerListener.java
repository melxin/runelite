import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
	@ObfuscatedName("ao")
	int field381;

	@ObfuscatedName("ao")
	@Export("remove2")
	abstract void remove2();

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lbs;)I"
	)
	@Export("update")
	abstract int update();
}
