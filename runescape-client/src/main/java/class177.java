import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gp")
final class class177 implements ThreadFactory {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	static AbstractArchive field1946;

	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS Maya Anim Load");
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1468204724"
	)
	public static int method4270() {
		return ViewportMouse.ViewportMouse_entityCount + 1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "21533"
	)
	static void method4267() {
		if (class406.loadWorlds()) {
			Login.worldSelectOpen = true;
			Login.worldSelectPage = 0;
			Login.worldSelectPagesCount = 0;
		}

	}

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "83"
	)
	static void method4269() {
		Client.menu.menuOptionsCount = 0;
		Client.isMenuOpen = false;
	}
}
