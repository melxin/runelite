import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("my")
public class class337 implements class332 {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	public static final class337 field3851;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	public static final class337 field3848;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	public static final class337 field3849;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	public static final class337 field3850;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	public static final class337 field3852;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	public static final class337 field3853;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	static final class337 field3854;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	public static final class337 field3855;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lmy;"
	)
	static final class337[] field3856;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -890434147
	)
	public final int field3857;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1276955637
	)
	public final int field3858;

	static {
		field3851 = new class337(14, 0);
		field3848 = new class337(15, 20);
		field3849 = new class337(16, -2);
		field3850 = new class337(18, -2);
		field3852 = new class337(19, -2);
		field3853 = new class337(21, 37);
		field3854 = new class337(27, 0);
		field3855 = new class337(32, 66);
		field3856 = new class337[33];
		class337[] var0 = class113.method3582();

		for (int var1 = 0; var1 < var0.length; ++var1) {
			field3856[var0[var1].field3857] = var0[var1];
		}

	}

	class337(int var1, int var2) {
		this.field3857 = var1;
		this.field3858 = var2;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ldd;[BIIIIB)V",
		garbageValue = "8"
	)
	static final void method7281(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5) {
		int var8;
		int var9;
		if (var0.collisionMaps != null) {
			for (int var6 = 0; var6 < 4; ++var6) {
				CollisionMap var13 = var0.collisionMaps[var6];

				for (var8 = var2; var8 < var2 + 64; ++var8) {
					for (var9 = var3; var9 < var3 + 64; ++var9) {
						if (var13.method6338(var8, var9)) {
							var13.method6355(var8, var9, 1073741824);
						}
					}
				}
			}
		}

		Buffer var12 = new Buffer(var1);

		int var7;
		int var10;
		for (var7 = 0; var7 < 4; ++var7) {
			for (var8 = 0; var8 < 64; ++var8) {
				for (var9 = 0; var9 < 64; ++var9) {
					var10 = var8 + var2;
					int var11 = var3 + var9;
					class264.loadTerrain(var0, var12, var7, var10, var11, var10 + var4, var5 + var11, 0);
				}
			}
		}

		var7 = var12.offset * 2108391709 < var12.array.length ? var12.readUnsignedByte() : 0;
		boolean var14 = (var7 & 1) != 0;
		if (var14) {
			for (var9 = 0; var9 < 64; ++var9) {
				for (var10 = 0; var10 < 64; ++var10) {
					class148.method3945(var12);
				}
			}
		}

	}
}
