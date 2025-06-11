import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
class class140 implements Callable {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	final class143 this$0;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lwt;"
	)
	final Buffer val$p;
	// $FF: synthetic field
	final int val$version;

	@ObfuscatedSignature(
		descriptor = "(Lfj;Lwt;I)V"
	)
	class140(class143 var1, Buffer var2, int var3) {
		this.this$0 = var1;
		this.val$p = var2;
		this.val$version = var3;
	}

	public Object call() {
		this.this$0.method3608(this.val$p, this.val$version);
		return null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "798264099"
	)
	static final boolean method3589() {
		return ViewportMouse.ViewportMouse_isInViewport;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-929572055"
	)
	@Export("isCharPrintable")
	public static boolean isCharPrintable(char var0) {
		if (var0 >= ' ' && var0 <= '~') {
			return true;
		} else if (var0 >= 160 && var0 <= 255) {
			return true;
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376;
		}
	}
}
