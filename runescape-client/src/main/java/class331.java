import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mi")
public final class class331 {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = 8095908550807676131L
	)
	static long field3672;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = 619173060201586071L
	)
	static long field3671;
	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Lrm;",
		garbageValue = "92"
	)
	public static TransformationMatrix method6572() {
		synchronized(TransformationMatrix.field4932) {
			if (class339.field3763 == 0) {
				return new TransformationMatrix();
			} else {
				TransformationMatrix.field4932[--class339.field3763].method8485();
				return TransformationMatrix.field4932[class339.field3763];
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "1"
	)
	public static int method6571(int var0, int var1, int var2) {
		int var3 = VerticalAlignment.method5222(var2 - var1 + 1);
		var3 <<= var1;
		var0 |= var3;
		return var0;
	}
}
