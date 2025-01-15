import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ld")
@Implements("WorldMapSprite")
public final class WorldMapSprite {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1399333337
	)
	static int field3231;
	@ObfuscatedName("ah")
	@Export("tileColors")
	final int[] tileColors;

	WorldMapSprite() {
		this.tileColors = new int[4096];
	}

	WorldMapSprite(int[] var1) {
		this.tileColors = var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1508282537"
	)
	@Export("getTileColor")
	final int getTileColor(int var1, int var2) {
		return this.tileColors[var1 + var2 * 64];
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lpq;III)Z",
		garbageValue = "761771961"
	)
	public static boolean method6397(AbstractArchive var0, int var1, int var2) {
		byte[] var3 = var0.takeFile(var1, var2);
		if (var3 == null) {
			return false;
		} else {
			class443.SpriteBuffer_decode(var3);
			return true;
		}
	}
}
