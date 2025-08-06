import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tv")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ltv;"
	)
	static final DefaultsGroup field5420;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ltv;"
	)
	static final DefaultsGroup field5419;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -202071687
	)
	@Export("group")
	final int group;

	static {
		field5420 = new DefaultsGroup(1);
		field5419 = new DefaultsGroup(3);
	}

	DefaultsGroup(int var1) {
		this.group = var1;
	}
}
