import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tn")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ltn;"
	)
	static final DefaultsGroup field5242;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ltn;"
	)
	static final DefaultsGroup field5243;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -893997633
	)
	@Export("group")
	final int group;

	static {
		field5242 = new DefaultsGroup(1);
		field5243 = new DefaultsGroup(3);
	}

	DefaultsGroup(int var1) {
		this.group = var1;
	}
}
