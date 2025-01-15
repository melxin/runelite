import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
public class class174 extends class150 {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1718739607
	)
	@Export("SpriteBuffer_spriteHeight")
	public static int SpriteBuffer_spriteHeight;
	@ObfuscatedName("tl")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1489707361
	)
	int field1836;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		longValue = 1584767731287262431L
	)
	long field1831;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfv;)V"
	)
	class174(class153 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "-1355269794"
	)
	void vmethod3879(Buffer var1) {
		this.field1836 = var1.readInt();
		this.field1831 = var1.readLong();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lgq;B)V",
		garbageValue = "0"
	)
	void vmethod3882(ClanSettings var1) {
		var1.method3701(this.field1836, this.field1831);
	}

	@ObfuscatedName("ay")
	public static final void method3881(long var0) {
		if (var0 > 0L) {
			if (0L == var0 % 10L) {
				class248.method5350(var0 - 1L);
				class248.method5350(1L);
			} else {
				class248.method5350(var0);
			}

		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SIII)V",
		garbageValue = "-140035932"
	)
	@Export("sortItemsByName")
	public static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			short var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					short var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			sortItemsByName(var0, var1, var2, var5 - 1);
			sortItemsByName(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1549344134"
	)
	static void method3886(String var0) {
		Login.displayName = class166.method3810(var0);
	}
}
