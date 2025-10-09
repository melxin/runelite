import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("xz")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lxz;"
	)
	static final PrivateChatMode field6137;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lxz;"
	)
	public static final PrivateChatMode field6138;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lxz;"
	)
	static final PrivateChatMode field6140;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1513779367
	)
	public final int field6139;

	static {
		field6137 = new PrivateChatMode(0);
		field6138 = new PrivateChatMode(1);
		field6140 = new PrivateChatMode(2);
	}

	PrivateChatMode(int var1) {
		this.field6139 = var1;
	}
}
