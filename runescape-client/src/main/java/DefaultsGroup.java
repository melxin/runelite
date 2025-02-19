import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tc")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ltc;"
	)
	static final DefaultsGroup field5218;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ltc;"
	)
	static final DefaultsGroup field5217;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1596976675
	)
	@Export("group")
	final int group;

	static {
		field5218 = new DefaultsGroup(1);
		field5217 = new DefaultsGroup(3);
	}

	DefaultsGroup(int var1) {
		this.group = var1;
	}
}
