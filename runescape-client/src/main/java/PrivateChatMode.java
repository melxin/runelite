import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wx")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lwx;"
	)
	static final PrivateChatMode field5752;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lwx;"
	)
	public static final PrivateChatMode field5751;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lwx;"
	)
	static final PrivateChatMode field5750;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -2051246067
	)
	public final int field5753;

	static {
		field5752 = new PrivateChatMode(0);
		field5751 = new PrivateChatMode(1);
		field5750 = new PrivateChatMode(2);
	}

	PrivateChatMode(int var1) {
		this.field5753 = var1;
	}
}
