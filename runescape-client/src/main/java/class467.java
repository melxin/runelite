import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rp")
public class class467 {
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1921810474"
	)
	static void method9559() {
		Iterator var0 = Client.worldViewManager.iterator();

		while (var0.hasNext()) {
			WorldView var1 = (WorldView)var0.next();

			for (ObjectSound var2 = (ObjectSound)var1.method2684().last(); var2 != null; var2 = (ObjectSound)var1.method2684().previous()) {
				if (var2.obj != null) {
					var2.set();
				}
			}
		}

	}
}
