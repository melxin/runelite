import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nj")
public class class359 {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -873958935
	)
	public static int field3967;
	@ObfuscatedName("ak")
	@Export("soundSystemExecutor")
	static ScheduledExecutorService soundSystemExecutor;

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)[Los;",
		garbageValue = "856929550"
	)
	public static class381[] method7492() {
		return new class381[]{class381.USERNAME_PASSWORD, class381.field4308, class381.field4309};
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "49451840"
	)
	@Export("isAlphaNumeric")
	public static boolean isAlphaNumeric(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}
}
