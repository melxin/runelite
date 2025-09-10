import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
	@ObfuscatedName("af")
	int field1488;

	@ObfuscatedName("af")
	@Export("remove2")
	abstract void remove2();

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ldg;)I"
	)
	@Export("update")
	abstract int update();
}
