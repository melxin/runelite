import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hq")
public class class191 extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("field2026")
	public static EvictingDualNodeHashTable field2026;

	static {
		field2026 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("nu")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1431099627"
	)
	static void method4365(int var0) {
		World.tempMenuAction = new MenuAction();
		World.tempMenuAction.param0 = Client.menu.menuArguments1[var0];
		World.tempMenuAction.param1 = Client.menu.menuArguments2[var0];
		World.tempMenuAction.opcode = Client.menu.menuOpcodes[var0];
		World.tempMenuAction.identifier = Client.menu.menuIdentifiers[var0];
		World.tempMenuAction.itemId = Client.menu.menuItemIds[var0];
		World.tempMenuAction.action = Client.menu.menuActions[var0];
		World.tempMenuAction.target = Client.menu.menuTargets[var0];
		World.tempMenuAction.worldViewId = Client.menu.menuWorldViewIds[var0];
		World.tempMenuAction.field685 = Client.menu.menuShiftClick[var0];
	}
}
