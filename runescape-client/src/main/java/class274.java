import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kh")
public class class274 {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -172071645
	)
	static int field3111;
	@ObfuscatedName("lt")
	@ObfuscatedGetter(
		intValue = 273449675
	)
	@Export("oculusOrbFocalPointZ")
	static int oculusOrbFocalPointZ;
	@ObfuscatedName("ab")
	final int[][] field3112;
	@ObfuscatedName("ay")
	final int[][] field3109;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -657729393
	)
	int field3106;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1076430147
	)
	int field3107;
	@ObfuscatedName("ah")
	final int[] field3105;
	@ObfuscatedName("ac")
	final int[] field3113;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -617042445
	)
	final int field3110;

	class274(int var1, int var2) {
		this.field3112 = new int[var1][var2];
		this.field3109 = new int[var1][var2];
		int var3 = var2 * var1;
		int var4 = MoveSpeed.method5791(var3 / 4);
		this.field3105 = new int[var4];
		this.field3113 = new int[var4];
		this.field3110 = var4 - 1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-15"
	)
	void method5692() {
		for (int var1 = 0; var1 < this.field3112.length; ++var1) {
			for (int var2 = 0; var2 < this.field3112[var1].length; ++var2) {
				this.field3112[var1][var2] = 0;
				this.field3109[var1][var2] = 99999999;
			}
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "3811"
	)
	void method5693(int var1, int var2) {
		this.field3106 = var1;
		this.field3107 = var2;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1807176578"
	)
	int method5694() {
		return this.field3106;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "61"
	)
	int method5695() {
		return this.field3107;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	int method5696() {
		return this.field3112.length;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1699003432"
	)
	int method5697() {
		return this.field3112[0].length;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)[[I",
		garbageValue = "0"
	)
	int[][] method5710() {
		return this.field3112;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)[[I",
		garbageValue = "1136393294"
	)
	int[][] method5714() {
		return this.field3109;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1101795363"
	)
	int[] method5731() {
		return this.field3105;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "42045895"
	)
	int[] method5703() {
		return this.field3113;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1891440778"
	)
	int method5702() {
		return this.field3110;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-750985019"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null;

		try {
			var0 = UserComparator3.getPreferencesFile("", DevicePcmPlayerProvider.field93.name, true);
			Buffer var1 = AbstractWorldMapIcon.clientPreferences.toBuffer();
			var0.write(var1.field5573, 0, var1.field5570);
		} catch (Exception var3) {
		}

		try {
			if (var0 != null) {
				var0.closeSync(true);
			}
		} catch (Exception var2) {
		}

	}
}
