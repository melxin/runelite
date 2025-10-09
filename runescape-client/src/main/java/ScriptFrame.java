import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bo")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	public static AbstractArchive field240;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 268391931
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("ag")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("aj")
	@Export("stringLocals")
	Object[] stringLocals;

	ScriptFrame() {
		this.pc = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([Lqs;IB)Lqs;",
		garbageValue = "1"
	)
	@Export("findEnumerated")
	public static Enum findEnumerated(Enum[] var0, int var1) {
		Enum[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			Enum var4 = var2[var3];
			if (var1 == var4.rsOrdinal()) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "367984813"
	)
	public static final void method738(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
			if (Client.rootWidgetXs[var4] + Client.rootWidgetWidths[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetHeights[var4] + Client.rootWidgetYs[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) {
				Client.field539[var4] = true;
			}
		}

	}
}
