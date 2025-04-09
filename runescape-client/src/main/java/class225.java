import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iu")
public abstract class class225 {
	@ObfuscatedName("af")
	String field2527;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	final class222 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lig;Ljava/lang/String;)V"
	)
	class225(class222 var1, String var2) {
		this.this$0 = var1;
		this.field2527 = var2;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1893694447"
	)
	public abstract int vmethod4957();

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1558945932"
	)
	public int vmethod4959() {
		return -1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1727604683"
	)
	public String vmethod4958() {
		return null;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-892102164"
	)
	public String method4969() {
		return this.field2527;
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1337795420"
	)
	public static final void method4972(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
			if (Client.rootWidgetXs[var4] + Client.rootWidgetWidths[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetHeights[var4] + Client.rootWidgetYs[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) {
				Client.field558[var4] = true;
			}
		}

	}
}
