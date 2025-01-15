import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sj")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	static final DefaultsGroup field5098;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	static final DefaultsGroup field5097;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lbk;"
	)
	@Export("soundSystem")
	static SoundSystem soundSystem;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1386616949
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
