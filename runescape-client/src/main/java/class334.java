import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ms")
public final class class334 {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = 8593797756653973077L
	)
	static long field3839;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = 1862171730385611819L
	)
	static long field3838;
	@ObfuscatedName("ir")
	static List field3837;
	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "Lpw;"
	)
	@Export("archive12")
	static Archive archive12;

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lre;I)Lre;",
		garbageValue = "-2123776403"
	)
	public static class452 method7060(class452 var0) {
		synchronized(class452.field5171) {
			if (class452.field5173 == 0) {
				return new class452(var0);
			} else {
				class452.field5171[--class452.field5173].method9018(var0);
				return class452.field5171[class452.field5173];
			}
		}
	}
}
