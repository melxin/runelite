import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
	@ObfuscatedName("av")
	int field1463;

	@ObfuscatedName("av")
	@Export("remove2")
	abstract void remove2();

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ldr;)I"
	)
	@Export("update")
	abstract int update();
}
