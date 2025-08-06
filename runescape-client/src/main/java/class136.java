import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
public class class136 implements Callable {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	final class137 field1632;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	final class138 field1627;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	final class139 field1630;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -381907927
	)
	final int field1628;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class144 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;Lfn;Lfa;Lfw;I)V"
	)
	class136(class144 var1, class137 var2, class138 var3, class139 var4, int var5) {
		this.this$0 = var1;
		this.field1632 = var2;
		this.field1627 = var3;
		this.field1630 = var4;
		this.field1628 = var5;
	}

	public Object call() {
		this.field1632.method3651();
		class137[][] var1;
		if (this.field1627 == class138.field1663) {
			var1 = this.this$0.field1712;
		} else {
			var1 = this.this$0.field1710;
		}

		var1[this.field1628][this.field1630.method3689()] = this.field1632;
		return null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1875096266"
	)
	static final int method3648(int var0, int var1) {
		if (var0 == -1) {
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "91"
	)
	static void method3644() {
		if (Client.isSpellSelected) {
			Widget var0 = class167.widgetDefinition.getWidgetChild(class556.selectedSpellWidget, Client.selectedSpellChildIndex);
			if (var0 != null && var0.onTargetLeave != null) {
				ScriptEvent var1 = new ScriptEvent();
				var1.widget = var0;
				var1.args = var0.onTargetLeave;
				SequenceDefinition.runScriptEvent(var1);
			}

			Client.selectedSpellItemId = -1;
			Client.isSpellSelected = false;
			ApproximateRouteStrategy.invalidateWidget(var0);
		}
	}
}
