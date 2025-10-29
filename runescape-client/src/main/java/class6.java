import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ak")
public enum class6 implements Enum {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	field14(0, 0);

	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -599765903
	)
	public final int field9;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -397915809
	)
	final int field10;

	class6(int var3, int var4) {
		this.field9 = var3;
		this.field10 = var4;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "20"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field10;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "-819950547"
	)
	public static float method44(int var0) {
		var0 &= 2047;
		return (float)((double)((float)var0 / 2048.0F) * 6.283185307179586D);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ldd;IIILoz;B)V",
		garbageValue = "-7"
	)
	static void method41(WorldView var0, int var1, int var2, int var3, SpriteMask var4) {
		for (int var5 = 0; var5 < var0.sizeX; ++var5) {
			for (int var6 = 0; var6 < var0.sizeY; ++var6) {
				NodeDeque var7 = var0.groundItems[var0.plane][var5][var6];
				if (var7 != null) {
					int var9;
					if (var0.method2791()) {
						int var13 = var5 * 4 + 2 - Client.field468 / 32;
						var9 = var6 * 4 + 2 - Client.field512 / 32;
						SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var13, var9, var3, class579.field5923[0], var4);
					} else {
						ProjectionCoord var8 = class86.method2932(var0, Coord.method7702(var5), Coord.method7702(var6));
						var9 = (int)var8.x;
						int var10 = (int)var8.y;
						var8.release();
						int var11 = var9 / 32 - Client.field468 / 32;
						int var12 = var10 / 32 - Client.field512 / 32;
						SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var11, var12, var3, class579.field5923[0], var4);
					}
				}
			}
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lut;I)J",
		garbageValue = "764544479"
	)
	public static long method43(DynamicArray var0) {
		ProjectionCoord.method9359(var0, class586.field5937);
		int[] var1 = var0.method10650();
		int var2 = var0.method10652();
		long var3 = 0L;

		for (int var5 = 0; var5 < var2; ++var5) {
			var3 += (long)var1[var5];
		}

		return var3;
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "756246269"
	)
	@Export("getUserId")
	static long getUserId() {
		return Client.userId;
	}
}
