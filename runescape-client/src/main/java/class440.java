import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qv")
public final class class440 {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -747926601
	)
	static int field5167;

	@ObfuscatedName("ol")
	@ObfuscatedSignature(
		descriptor = "(Lok;IB)Ljava/lang/String;",
		garbageValue = "0"
	)
	static String method8918(Widget var0, int var1) {
		int var3 = class338.getWidgetFlags2(var0);
		boolean var2 = (var3 >> var1 & 1) != 0;
		if (!var2 && var0.onOp == null) {
			return null;
		} else {
			return var0.actions != null && var0.actions.length > var1 && var0.actions[var1] != null && !var0.actions[var1].trim().isEmpty() ? var0.actions[var1] : null;
		}
	}
}
