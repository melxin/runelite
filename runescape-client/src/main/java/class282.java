import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kq")
public class class282 implements Comparator {
	class282() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lkd;Lkd;I)I",
		garbageValue = "315680836"
	)
	int method6376(class275 var1, class275 var2) {
		return var1.method6239() - var2.method6239();
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.method6376((class275)var1, (class275)var2);
	}

	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-126"
	)
	static void method6383() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) {
			int var1 = var0.group;
			if (class35.widgetDefinition.loadInterface(var1)) {
				boolean var2 = true;
				Widget[] var3 = class35.widgetDefinition.Widget_interfaceComponents[var1];

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) {
					if (var3[var4] != null) {
						var2 = var3[var4].isIf3;
						break;
					}
				}

				if (!var2) {
					var4 = (int)var0.key;
					Widget var5 = class35.widgetDefinition.method7496(var4);
					if (var5 != null) {
						class154.invalidateWidget(var5);
					}
				}
			}
		}

	}
}
