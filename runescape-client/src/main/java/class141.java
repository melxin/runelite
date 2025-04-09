import java.awt.Image;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fx")
class class141 implements Callable {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -45268145
	)
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("ah")
	static Image field1654;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	final class142 this$0;
	// $FF: synthetic field
	final int val$workStart;
	// $FF: synthetic field
	final int val$workEnd;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "[Lfj;"
	)
	final class134[] val$curveLoadJobs;

	@ObfuscatedSignature(
		descriptor = "(Lfy;II[Lfj;)V"
	)
	class141(class142 var1, int var2, int var3, class134[] var4) {
		this.this$0 = var1;
		this.val$workStart = var2;
		this.val$workEnd = var3;
		this.val$curveLoadJobs = var4;
	}

	public Object call() {
		for (int var1 = this.val$workStart; var1 < this.val$workEnd; ++var1) {
			this.val$curveLoadJobs[var1].call();
		}

		return null;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	public static void method3394() {
		class243.field2023.clear();
	}

	@ObfuscatedName("ob")
	@ObfuscatedSignature(
		descriptor = "(Lnh;B)Ljava/lang/String;",
		garbageValue = "-39"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (WorldMapIcon_1.Widget_unpackTargetMask(class31.getWidgetFlags(var0)) == 0) {
			return null;
		} else {
			return var0.spellActionName != null && !var0.spellActionName.trim().isEmpty() ? var0.spellActionName : null;
		}
	}
}
