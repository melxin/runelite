import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wm")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lwm;"
	)
	static final PrivateChatMode field5625;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lwm;"
	)
	public static final PrivateChatMode field5624;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lwm;"
	)
	static final PrivateChatMode field5627;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 957031193
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 2055996397
	)
	public final int field5626;

	static {
		field5625 = new PrivateChatMode(0);
		field5624 = new PrivateChatMode(1);
		field5627 = new PrivateChatMode(2);
	}

	PrivateChatMode(int var1) {
		this.field5626 = var1;
	}
}
