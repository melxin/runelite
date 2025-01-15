import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wk")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lwk;"
	)
	static final PrivateChatMode field5632;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lwk;"
	)
	public static final PrivateChatMode field5630;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lwk;"
	)
	static final PrivateChatMode field5631;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1741787281
	)
	public final int field5629;

	static {
		field5632 = new PrivateChatMode(0);
		field5630 = new PrivateChatMode(1);
		field5631 = new PrivateChatMode(2);
	}

	PrivateChatMode(int var1) {
		this.field5629 = var1;
	}
}
