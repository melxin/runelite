import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
public abstract class class148 extends Node {
	class148() {
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lve;B)V",
		garbageValue = "53"
	)
	abstract void vmethod3749(Buffer var1);

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lgw;I)V",
		garbageValue = "1984465176"
	)
	abstract void vmethod3750(ClanSettings var1);

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1156034435"
	)
	protected static final int method3469() {
		return GameEngine.keyHandler.method355();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lnh;IIIS)V",
		garbageValue = "-19585"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field4020 == null) {
			throw new RuntimeException();
		} else {
			var0.field4020[var1] = var2;
			var0.field3952[var1] = var3;
		}
	}
}
