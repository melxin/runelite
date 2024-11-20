import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sk")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lsk;"
	)
	static final DefaultsGroup field5098;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lsk;"
	)
	static final DefaultsGroup field5097;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 543269131
	)
	@Export("group")
	final int group;

	static {
		field5098 = new DefaultsGroup(1);
		field5097 = new DefaultsGroup(3);
	}

	DefaultsGroup(int var1) {
		this.group = var1;
	}
}
