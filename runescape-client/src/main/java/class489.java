import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sq")
class class489 implements Comparator {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	static AbstractArchive field5355;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	final class490 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lsj;)V"
	)
	class489(class490 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lsr;Lsr;I)I",
		garbageValue = "-1797854907"
	)
	int method9807(class491 var1, class491 var2) {
		if (var1.field5365 > var2.field5365) {
			return 1;
		} else {
			return var1.field5365 < var2.field5365 ? -1 : 0;
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method9807((class491)var1, (class491)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lpx;II)Z",
		garbageValue = "138693889"
	)
	public static boolean method9813(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1);
		if (var2 == null) {
			return false;
		} else {
			class265.SpriteBuffer_decode(var2);
			return true;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)Z",
		garbageValue = "-1709547915"
	)
	static final boolean method9812(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = ViewportMouse.ViewportMouse_y + var6;
		if (var7 < var0 && var7 < var1 && var7 < var2) {
			return false;
		} else {
			var7 = ViewportMouse.ViewportMouse_y - var6;
			if (var7 > var0 && var7 > var1 && var7 > var2) {
				return false;
			} else {
				var7 = ViewportMouse.ViewportMouse_x + var6;
				if (var7 < var3 && var7 < var4 && var7 < var5) {
					return false;
				} else {
					var7 = ViewportMouse.ViewportMouse_x - var6;
					return var7 <= var3 || var7 <= var4 || var7 <= var5;
				}
			}
		}
	}
}
