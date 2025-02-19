import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
public abstract class class165 extends Node {
	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "[Lwg;"
	)
	@Export("headIconPkSprites")
	static SpritePixels[] headIconPkSprites;

	class165() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "1818142003"
	)
	abstract void vmethod3695(Buffer var1);

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgd;I)V",
		garbageValue = "488725669"
	)
	abstract void vmethod3696(ClanChannel var1);

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-419248128"
	)
	public static boolean method3638(int var0) {
		return (var0 >> 20 & 1) != 0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-52"
	)
	static final int method3642(int var0, int var1, int var2) {
		int var3 = var0 / var2;
		int var4 = var0 & var2 - 1;
		int var5 = var1 / var2;
		int var6 = var1 & var2 - 1;
		int var7 = Varcs.method3071(var3, var5);
		int var8 = Varcs.method3071(var3 + 1, var5);
		int var9 = Varcs.method3071(var3, var5 + 1);
		int var10 = Varcs.method3071(var3 + 1, var5 + 1);
		int var11 = HealthBarConfig.method2838(var7, var8, var4, var2);
		int var12 = HealthBarConfig.method2838(var9, var10, var4, var2);
		return HealthBarConfig.method2838(var11, var12, var6, var2);
	}
}
