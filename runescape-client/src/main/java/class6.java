import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aj")
public enum class6 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	field18(0, 0);

	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 2114843991
	)
	final int field19;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1994086901
	)
	final int field20;

	class6(int var3, int var4) {
		this.field19 = var3;
		this.field20 = var4;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1071289392"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field20;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[Lob;",
		garbageValue = "737395523"
	)
	public static class383[] method48() {
		return new class383[]{class383.field4486, class383.field4484, class383.field4485, class383.field4488};
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ZZB)Lvy;",
		garbageValue = "-48"
	)
	static IndexedSprite method44(boolean var0, boolean var1) {
		return var0 ? (var1 ? class273.field3054 : Login.options_buttons_2Sprite) : (var1 ? class309.field3285 : class227.options_buttons_0Sprite);
	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-862075531"
	)
	static final void method47(int var0, int var1, int var2) {
		if (class403.cameraX < var0) {
			class403.cameraX = (var0 - class403.cameraX) * HttpRequest.field55 / 1000 + class403.cameraX + class53.field357;
			if (class403.cameraX > var0) {
				class403.cameraX = var0;
			}
		}

		if (class403.cameraX > var0) {
			class403.cameraX -= (class403.cameraX - var0) * HttpRequest.field55 / 1000 + class53.field357;
			if (class403.cameraX < var0) {
				class403.cameraX = var0;
			}
		}

		if (class166.cameraY < var1) {
			class166.cameraY = (var1 - class166.cameraY) * HttpRequest.field55 / 1000 + class166.cameraY + class53.field357;
			if (class166.cameraY > var1) {
				class166.cameraY = var1;
			}
		}

		if (class166.cameraY > var1) {
			class166.cameraY -= (class166.cameraY - var1) * HttpRequest.field55 / 1000 + class53.field357;
			if (class166.cameraY < var1) {
				class166.cameraY = var1;
			}
		}

		if (class328.cameraZ < var2) {
			class328.cameraZ = (var2 - class328.cameraZ) * HttpRequest.field55 / 1000 + class328.cameraZ + class53.field357;
			if (class328.cameraZ > var2) {
				class328.cameraZ = var2;
			}
		}

		if (class328.cameraZ > var2) {
			class328.cameraZ -= (class328.cameraZ - var2) * HttpRequest.field55 / 1000 + class53.field357;
			if (class328.cameraZ < var2) {
				class328.cameraZ = var2;
			}
		}

	}
}
