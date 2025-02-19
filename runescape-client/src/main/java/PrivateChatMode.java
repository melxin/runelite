import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wj")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lwj;"
	)
	static final PrivateChatMode field5724;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lwj;"
	)
	public static final PrivateChatMode field5726;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lwj;"
	)
	static final PrivateChatMode field5725;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1436750631
	)
	public final int field5727;

	static {
		field5724 = new PrivateChatMode(0);
		field5726 = new PrivateChatMode(1);
		field5725 = new PrivateChatMode(2);
	}

	PrivateChatMode(int var1) {
		this.field5727 = var1;
	}
}
