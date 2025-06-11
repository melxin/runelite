import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
public class class203 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	static final class203 field2153;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	static final class203 field2154;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	static final class203 field2151;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	static final class203 field2152;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	static final class203 field2150;

	static {
		field2153 = new class203(0);
		field2154 = new class203(1);
		field2151 = new class203(2);
		field2152 = new class203(3);
		field2150 = new class203(4);
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "0"
	)
	class203(int var1) {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ldl;Lip;IIIZI)V",
		garbageValue = "-1728566992"
	)
	static void method4299(WorldView var0, SequenceDefinition var1, int var2, int var3, int var4, boolean var5) {
		if (class58.soundEffectCount < 50) {
			if (var1.field2349 != null && var1.field2349.containsKey(var2)) {
				ArrayList var6 = (ArrayList)var1.field2349.get(var2);
				if (!var6.isEmpty()) {
					int var7 = 0;
					int var9;
					if (var6.size() > 1) {
						int var8 = 1 + (int)(Math.random() * 100.0D);
						var9 = 0;

						for (Iterator var10 = var6.iterator(); var10.hasNext(); ++var7) {
							class209 var11 = (class209)var10.next();
							int var12 = var9;
							var9 += var11.field2205;
							if (var12 <= var8 && var8 < var9) {
								break;
							}
						}

						if (var7 >= var6.size()) {
							return;
						}
					}

					class209 var16 = (class209)var6.get(var7);
					var9 = var16.field2211 & 31;
					if ((var9 <= 0 || ClientPacket.clientPreferences.getAreaSoundEffectsVolume() != 0) && (var9 != 0 || ClientPacket.clientPreferences.getSoundEffectsVolume() != 0)) {
						if (var16 != null) {
							if (var16.field2211 == 0) {
								if (!var5) {
									return;
								}

								IntProjection.method5097(var0.id, var16.field2206, 0, 0, 0, var16.field2209, var16.field2207, 0, var1.field2357);
							} else {
								int var17 = var3 - 64;
								int var18 = var17 >> 7;
								int var14 = var4 - 64;
								int var13 = var14 >> 7;
								IntProjection.method5097(var0.id, var16.field2206, var18, var13, var16.field2211, var16.field2209, var16.field2207, 0, var1.field2357);
							}

						}
					}
				}
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "97"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0;
		if (var0 < 0 || var0 >= 65536) {
			var0 >>>= 16;
			var1 += 16;
		}

		if (var0 >= 256) {
			var0 >>>= 8;
			var1 += 8;
		}

		if (var0 >= 16) {
			var0 >>>= 4;
			var1 += 4;
		}

		if (var0 >= 4) {
			var0 >>>= 2;
			var1 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			++var1;
		}

		return var0 + var1;
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1324579474"
	)
	static void method4300() {
		if (Sound.topLevelWorldView != null) {
			Sound.topLevelWorldView.scene.method5219(ClientPacket.clientPreferences.getDrawDistance());
		}

	}
}
