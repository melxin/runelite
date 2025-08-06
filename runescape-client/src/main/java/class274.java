import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
public class class274 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	static final class274 field3161;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	static final class274 field3162;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	static final class274 field3163;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	static final class274 field3164;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	static final class274 field3166;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	static final class274 field3173;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	static final class274 field3167;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[Lkt;"
	)
	static final class274[] field3169;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 473723239
	)
	final int field3168;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -813622295
	)
	final int field3170;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 917467081
	)
	final int field3171;

	static {
		field3161 = new class274(2, 8, 8);
		field3162 = new class274(4, 16, 16);
		field3163 = new class274(1, 32, 32);
		field3164 = new class274(6, 48, 48);
		field3166 = new class274(3, 64, 64);
		field3173 = new class274(0, 96, 96);
		field3167 = new class274(5, 128, 128);
		field3169 = class82.method2747();
		Arrays.sort(field3169, new class281());
	}

	class274(int var1, int var2, int var3) {
		this.field3168 = var1;
		this.field3170 = var2;
		this.field3171 = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1722123502"
	)
	int method6200() {
		return this.field3171 * this.field3170;
	}

	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-7"
	)
	static void method6203() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) {
			int var1 = var0.group;
			if (class167.widgetDefinition.loadInterface(var1)) {
				boolean var2 = true;
				Widget[] var3 = class167.widgetDefinition.Widget_interfaceComponents[var1];

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) {
					if (var3[var4] != null) {
						var2 = var3[var4].isIf3;
						break;
					}
				}

				if (!var2) {
					var4 = (int)var0.key;
					Widget var5 = class167.widgetDefinition.method7456(var4);
					if (var5 != null) {
						ApproximateRouteStrategy.invalidateWidget(var5);
					}
				}
			}
		}

	}
}
