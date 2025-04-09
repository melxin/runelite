import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("oc")
	@ObfuscatedGetter(
		longValue = -6633766400738132309L
	)
	static long field3104;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -989381819
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 995649721
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 2141935807
	)
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -935044599
	)
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;

	protected RouteStrategy() {
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIILkd;I)Z",
		garbageValue = "-1264400829"
	)
	@Export("hasArrived")
	protected abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1530078002"
	)
	public static int method5754(int var0) {
		return var0 + -512;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lph;IB)Lws;",
		garbageValue = "-78"
	)
	public static IndexedSprite method5757(AbstractArchive var0, int var1) {
		return !class140.method3387(var0, var1) ? null : class280.method5890();
	}

	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	static void method5755() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) {
			int var1 = var0.group;
			if (class232.widgetDefinition.loadInterface(var1)) {
				boolean var2 = true;
				Widget[] var3 = class232.widgetDefinition.Widget_interfaceComponents[var1];

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) {
					if (var3[var4] != null) {
						var2 = var3[var4].isIf3;
						break;
					}
				}

				if (!var2) {
					var4 = (int)var0.key;
					Widget var5 = class232.widgetDefinition.method6951(var4);
					if (var5 != null) {
						class139.invalidateWidget(var5);
					}
				}
			}
		}

	}

	@ObfuscatedName("ow")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2047083499"
	)
	static void method5756() {
		Renderable.clientPreferences.method2771(Client.field791);
	}
}
