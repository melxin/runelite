import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("xs")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lxs;"
	)
	static final PrivateChatMode field5856;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lxs;"
	)
	public static final PrivateChatMode field5857;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lxs;"
	)
	static final PrivateChatMode field5855;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -2086882757
	)
	public final int field5858;

	static {
		field5856 = new PrivateChatMode(0);
		field5857 = new PrivateChatMode(1);
		field5855 = new PrivateChatMode(2);
	}

	PrivateChatMode(int var1) {
		this.field5858 = var1;
	}
}
