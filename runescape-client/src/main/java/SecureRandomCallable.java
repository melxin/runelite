import java.security.SecureRandom;
import java.util.concurrent.Callable;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	SecureRandomCallable() {
	}

	public Object call() {
		SecureRandom var2 = new SecureRandom();
		var2.nextInt();
		return var2;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/Object;",
		garbageValue = "46"
	)
	static Object method2082(int var0) {
		return var0 == -1 ? null : WorldMapSectionType.method6775((class574)class173.findEnumerated(class574.method11023(), var0));
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "2"
	)
	static final void method2086(int var0, int var1, int var2, int var3) {
		class352.method7390();
	}
}
