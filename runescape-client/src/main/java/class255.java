import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ji")
public class class255 {
	@ObfuscatedName("ou")
	@ObfuscatedSignature(
		descriptor = "(Lov;I)I",
		garbageValue = "1213224984"
	)
	static int method5526(Widget var0) {
		class370 var1 = (class370)Client.widgetFlags.get(((long)var0.id << 32) + (long)(var0.childIndex * -744024149));
		return var1 != null ? var1.method7725() : var0.flags;
	}
}
