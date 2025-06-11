import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lj")
@Implements("WorldMapSprite")
public final class WorldMapSprite {
	@ObfuscatedName("aj")
	@Export("tileColors")
	final int[] tileColors;

	WorldMapSprite() {
		this.tileColors = new int[4096];
	}

	WorldMapSprite(int[] var1) {
		this.tileColors = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "81"
	)
	@Export("getTileColor")
	final int getTileColor(int var1, int var2) {
		return this.tileColors[var2 * 64 + var1];
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltp;Ljava/lang/Object;III)I",
		garbageValue = "607543817"
	)
	public static int method6620(class509 var0, Object var1, int var2, int var3) {
		if (var2 < 0) {
			var2 = 0;
		}

		if (var3 < 0 || var3 > var0.method9937()) {
			var3 = var0.method9937();
		}

		int var4 = 0;
		int var6;
		if (var0.field5288 == class563.field5600) {
			int[] var5 = var0.method9965();
			var6 = (Integer)var1;

			for (int var7 = var2; var7 < var3; ++var7) {
				if (var6 == var5[var7]) {
					++var4;
				}
			}
		} else if (var0.field5288 == class563.field5594) {
			long[] var11 = var0.method9973();
			long var9 = (Long)var1;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var9 == var11[var8]) {
					++var4;
				}
			}
		} else {
			Object[] var12 = var0.method9936();

			for (var6 = var2; var6 < var3; ++var6) {
				if (var12[var6] == var1 || var12[var6] != null && var12[var6].equals(var1)) {
					++var4;
				}
			}
		}

		return var4;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "2142649332"
	)
	static void method6619(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (ClientPacket.clientPreferences.getAreaSoundEffectsVolume() != 0 && var6 > 0 && class58.soundEffectCount < 50) {
			IntProjection.method5097(class330.worldView.id, var1, var2, var3, var4, var5, var6, var7, false);
		}

	}

	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-260512572"
	)
	static final void method6621(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		ClientPacket.clientPreferences.updateSoundEffectVolume(var0);
	}
}
