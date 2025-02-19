import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cz")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	static Archive field931;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -145730583
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 325992667
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -331524495
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -386846997
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1078497283
	)
	@Export("itemId")
	int itemId;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1567231879
	)
	@Export("worldViewId")
	int worldViewId;
	@ObfuscatedName("ao")
	@Export("action")
	String action;
	@ObfuscatedName("af")
	@Export("target")
	String target;
	@ObfuscatedName("aa")
	boolean field930;

	MenuAction() {
	}

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)V",
		garbageValue = "1"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class376.widgetDefinition.loadInterface(var0)) {
			WorldViewManager.updateInterface(class376.widgetDefinition.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6);
		}
	}
}
