import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qn")
public class class427 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	static final class427 field5115;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	static final class427 field5118;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	static final class427 field5117;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	static final class427 field5116;

	static {
		field5115 = new class427();
		field5118 = new class427();
		field5117 = new class427();
		field5116 = new class427();
	}

	class427() {
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljd;IIIIFFFFIIIB)Z",
		garbageValue = "-1"
	)
	static final boolean method8691(Model var0, int var1, int var2, int var3, int var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11) {
		boolean var12 = ViewportMouse.ViewportMouse_isInViewport;
		if (!var12) {
			return false;
		} else {
			DelayFadeTask.method9712(var5, var6, var7, var8, var9, var10, var11);
			return class150.method3907(var0, var1, var2, var3, var4);
		}
	}
}
