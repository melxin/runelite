import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
public enum class68 implements Enum {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lcx;"
	)
	field927(0, -1),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lcx;"
	)
	field924(1, 2),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lcx;"
	)
	field925(2, 3),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lcx;"
	)
	field926(3, 4),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lcx;"
	)
	field923(4, 5),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lcx;"
	)
	field928(5, 6),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lcx;"
	)
	field929(6, 21);

	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -948167231
	)
	final int field930;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 984254221
	)
	final int field931;

	class68(int var3, int var4) {
		this.field930 = var3;
		this.field931 = var4;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1935172756"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field931;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1422397901"
	)
	static void method2165() {
		class464.field5243 = new int[2000];
		int var0 = 0;
		int var1 = 240;

		int var3;
		for (byte var2 = 12; var0 < 16; var1 -= var2) {
			var3 = class240.method5439((double)((float)var1 / 360.0F), 0.9998999834060669D, (double)((float)var0 * 0.425F / 16.0F + 0.075F));
			class464.field5243[var0] = var3;
			++var0;
		}

		var1 = 48;

		for (int var5 = var1 / 6; var0 < class464.field5243.length; var1 -= var5) {
			var3 = var0 * 2;

			for (int var4 = class240.method5439((double)((float)var1 / 360.0F), 0.9998999834060669D, 0.5D); var0 < var3 && var0 < class464.field5243.length; ++var0) {
				class464.field5243[var0] = var4;
			}
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)[Lop;",
		garbageValue = "-9"
	)
	public static StudioGame[] method2166() {
		return new StudioGame[]{StudioGame.stellardawn, StudioGame.runescape, StudioGame.game3, StudioGame.game4, StudioGame.game5, StudioGame.oldscape};
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(Lca;I)V",
		garbageValue = "1460942413"
	)
	static void method2161(class70 var0) {
		if (Client.field401 != var0) {
			Client.field401 = var0;
		}
	}
}
