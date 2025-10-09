import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
	@ObfuscatedName("ab")
	int field1488;

	@ObfuscatedName("ab")
	@Export("remove2")
	abstract void remove2();

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ldv;)I"
	)
	@Export("update")
	abstract int update();
}
