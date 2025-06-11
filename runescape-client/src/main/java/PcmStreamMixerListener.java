import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
	@ObfuscatedName("ap")
	int field1425;

	@ObfuscatedName("ap")
	@Export("remove2")
	abstract void remove2();

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ldg;)I"
	)
	@Export("update")
	abstract int update();
}
