import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vk")
public class class556 implements class466 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	WorldView field5822;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1454455535
	)
	int field5823;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 675194743
	)
	int field5824;
	@ObfuscatedName("aj")
	boolean field5825;

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lit;IS)V",
		garbageValue = "255"
	)
	public void vmethod11011(SequenceDefinition var1, int var2) {
		if (this.field5822 != null) {
			WorldView var3 = this.field5822;
			int var4 = this.field5823;
			int var5 = this.field5824;
			boolean var6 = this.field5825;
			if (class57.soundEffectCount < 50 && var1.field2473 != null && var1.field2473.containsKey(var2)) {
				ArrayList var7 = (ArrayList)var1.field2473.get(var2);
				if (!var7.isEmpty()) {
					int var8 = 0;
					int var10;
					if (var7.size() > 1) {
						int var9 = 1 + (int)(Math.random() * 100.0D);
						var10 = 0;

						for (Iterator var11 = var7.iterator(); var11.hasNext(); ++var8) {
							class210 var12 = (class210)var11.next();
							int var13 = var10;
							var10 += var12.field2299;
							if (var13 <= var9 && var9 < var10) {
								break;
							}
						}

						if (var8 >= var7.size()) {
							return;
						}
					}

					class210 var17 = (class210)var7.get(var8);
					var10 = var17.field2295 & 31;
					if ((var10 <= 0 || class154.clientPreferences.getAreaSoundEffectsVolume() != 0) && (var10 != 0 || class154.clientPreferences.getSoundEffectsVolume() != 0) && var17 != null) {
						if (var17.field2295 == 0) {
							if (var6) {
								class421.method8618(var3.id, var17.field2294, 0, 0, 0, var17.field2298, var17.field2296, 0, var1.field2493);
							}
						} else {
							int var18 = var4 - 64;
							int var19 = var18 >> 7;
							int var15 = var5 - 64;
							int var14 = var15 >> 7;
							class421.method8618(var3.id, var17.field2294, var19, var14, var17.field2295, var17.field2298, var17.field2296, 0, var1.field2493);
						}
					}
				}
			}

		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ldm;IIZI)V",
		garbageValue = "-1725303226"
	)
	public void method11014(WorldView var1, int var2, int var3, boolean var4) {
		this.field5822 = var1;
		this.field5823 = var2;
		this.field5824 = var3;
		this.field5825 = var4;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "15"
	)
	public void method11013() {
		this.field5822 = null;
	}
}
