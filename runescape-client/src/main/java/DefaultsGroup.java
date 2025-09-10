import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uu")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	static final DefaultsGroup field5521;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	static final DefaultsGroup field5522;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1325038255
	)
	@Export("group")
	final int group;

	static {
		field5521 = new DefaultsGroup(1);
		field5522 = new DefaultsGroup(3);
	}

	DefaultsGroup(int var1) {
		this.group = var1;
	}

	@ObfuscatedName("ps")
	@ObfuscatedSignature(
		descriptor = "(Lbk;B)V",
		garbageValue = "28"
	)
	@Export("updateLoginState")
	static void updateLoginState(LoginState var0) {
		if (class333.loginState != var0) {
			class333.loginState = var0;
		}
	}
}
