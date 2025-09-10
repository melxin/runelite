import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aw")
public class class1 implements Callable {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lwb;"
	)
	final Buffer field1;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lac;"
	)
	final class3 field4;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	final SpriteBufferProperties this$0;

	@ObfuscatedSignature(
		descriptor = "(Las;Lwb;Lac;)V"
	)
	class1(SpriteBufferProperties var1, Buffer var2, class3 var3) {
		this.this$0 = var1;
		this.field1 = var2;
		this.field4 = var3;
	}

	public Object call() {
		return this.field4.vmethod12(this.field1);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Loi;IB)V",
		garbageValue = "-15"
	)
	static void method11(Widget var0, int var1) {
		if (var0.type == 0 && var0.childIndex * -217986249 > -1) {
			if (var1 > var0.field4214) {
				var0.field4214 = var1;
			}

			if (var1 < var0.field4248) {
				var0.field4248 = var1;
			}
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lef;I)V",
		garbageValue = "-28007039"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false;
		if (var0.sound != null) {
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1);
		}

	}

	@ObfuscatedName("nd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-690163849"
	)
	static final void method10(int var0) {
		if (UrlRequester.widgetDefinition.loadInterface(var0)) {
			Widget[] var1 = UrlRequester.widgetDefinition.Widget_interfaceComponents[var0];

			for (int var2 = 0; var2 < var1.length; ++var2) {
				Widget var3 = var1[var2];
				if (var3 != null) {
					var3.modelFrame = 0;
					var3.modelFrameCycle = 0;
				}
			}

		}
	}
}
