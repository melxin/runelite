import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("te")
class class497 implements Comparator {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	final class498 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lth;)V"
	)
	class497(class498 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ltt;Ltt;I)I",
		garbageValue = "-1978238968"
	)
	int method10110(class499 var1, class499 var2) {
		if (var1.field5445 > var2.field5445) {
			return 1;
		} else {
			return var1.field5445 < var2.field5445 ? -1 : 0;
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method10110((class499)var1, (class499)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-247096033"
	)
	static final void method10123(int var0) {
		if (class226.widgetDefinition.loadInterface(var0)) {
			class203.drawModelComponents(class226.widgetDefinition.Widget_interfaceComponents[var0], 0, class226.widgetDefinition.Widget_interfaceComponents[var0].length - 1, -1, -1);
		}
	}
}
