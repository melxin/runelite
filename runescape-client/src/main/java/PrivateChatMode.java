import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("xy")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lxy;"
	)
	static final PrivateChatMode field6173;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lxy;"
	)
	public static final PrivateChatMode field6174;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lxy;"
	)
	static final PrivateChatMode field6175;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1408231813
	)
	public final int field6176;

	static {
		field6173 = new PrivateChatMode(0);
		field6174 = new PrivateChatMode(1);
		field6175 = new PrivateChatMode(2);
	}

	PrivateChatMode(int var1) {
		this.field6176 = var1;
	}
}
