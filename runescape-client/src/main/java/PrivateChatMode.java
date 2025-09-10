import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("xi")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lxi;"
	)
	static final PrivateChatMode field6071;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lxi;"
	)
	public static final PrivateChatMode field6070;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lxi;"
	)
	static final PrivateChatMode field6072;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -942591207
	)
	public final int field6073;

	static {
		field6071 = new PrivateChatMode(0);
		field6070 = new PrivateChatMode(1);
		field6072 = new PrivateChatMode(2);
	}

	PrivateChatMode(int var1) {
		this.field6073 = var1;
	}
}
