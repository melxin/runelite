import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nb")
public class class342 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1028516851
	)
	int field3960;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	class107 field3959;

	@ObfuscatedSignature(
		descriptor = "(ILey;)V"
	)
	class342(int var1, class107 var2) {
		this.field3960 = var1;
		this.field3959 = var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)[Lxz;",
		garbageValue = "-50"
	)
	static PrivateChatMode[] method7334() {
		return new PrivateChatMode[]{PrivateChatMode.field6138, PrivateChatMode.field6140, PrivateChatMode.field6137};
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1398196261"
	)
	static void method7336() {
		Iterator var0 = Client.worldViewManager.iterator();

		while (var0.hasNext()) {
			WorldView var1 = (WorldView)var0.next();

			for (ObjectSound var2 = (ObjectSound)var1.method2741().last(); var2 != null; var2 = (ObjectSound)var1.method2741().previous()) {
				if (var2.obj != null) {
					var2.set();
				}
			}
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-49"
	)
	@Export("isCharPrintable")
	public static boolean isCharPrintable(char var0) {
		if (var0 >= ' ' && var0 <= '~') {
			return true;
		} else if (var0 >= 160 && var0 <= 255) {
			return true;
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376;
		}
	}
}
