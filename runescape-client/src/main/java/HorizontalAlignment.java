import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements Enum {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	field2684(2, 0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(1, 1),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	field2677(0, 2);

	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -1612467577
	)
	static int field2685;
	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "Lrk;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;
	@ObfuscatedName("pk")
	static int[] field2679;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 103233939
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1224077425
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1746725635"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-94"
	)
	public static String method5170(String var0) {
		int var1 = var0.length();
		char[] var2 = new char[var1];
		byte var3 = 2;

		for (int var4 = 0; var4 < var1; ++var4) {
			char var5 = var0.charAt(var4);
			if (var3 == 0) {
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) {
				var5 = WorldMapSection2.method5968(var5);
			}

			if (Character.isLetter(var5)) {
				var3 = 0;
			} else if (var5 != '.' && var5 != '?' && var5 != '!') {
				if (Character.isSpaceChar(var5)) {
					if (var3 != 2) {
						var3 = 1;
					}
				} else {
					var3 = 1;
				}
			} else {
				var3 = 2;
			}

			var2[var4] = var5;
		}

		return new String(var2);
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(Ldj;B)V",
		garbageValue = "20"
	)
	static void method5169(WorldView var0) {
		if (Client.renderSelf) {
			WorldMapRectangle.addPlayerToScene(var0, Client.localPlayerIndex, false);
		}

	}
}
