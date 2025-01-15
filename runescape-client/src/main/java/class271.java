import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kn")
public class class271 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	static final class271 field3016;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	static final class271 field3018;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	static final class271 field3005;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	static final class271 field3008;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	static final class271 field3017;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	static final class271 field3010;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	static final class271 field3011;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lkn;"
	)
	static final class271[] field3009;
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = 2005502141
	)
	static int field3015;
	@ObfuscatedName("wt")
	@ObfuscatedGetter(
		intValue = 1323148989
	)
	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 2136590553
	)
	final int field3012;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -609962513
	)
	final int field3013;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1500051147
	)
	final int field3014;

	static {
		field3016 = new class271(2, 8, 8);
		field3018 = new class271(6, 16, 16);
		field3005 = new class271(3, 32, 32);
		field3008 = new class271(0, 48, 48);
		field3017 = new class271(1, 64, 64);
		field3010 = new class271(5, 96, 96);
		field3011 = new class271(4, 128, 128);
		field3009 = ObjectSound.method2105();
		Arrays.sort(field3009, new class278());
	}

	class271(int var1, int var2, int var3) {
		this.field3012 = var1;
		this.field3013 = var2;
		this.field3014 = var3;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-19"
	)
	int method5832() {
		return this.field3013 * this.field3014;
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(Lkb;IIIZI)V",
		garbageValue = "2075909946"
	)
	static void method5839(SequenceDefinition var0, int var1, int var2, int var3, boolean var4) {
		if (Client.soundEffectCount < 50) {
			if (var0.field2925 != null && var0.field2925.containsKey(var1)) {
				ArrayList var5 = (ArrayList)var0.field2925.get(var1);
				if (!var5.isEmpty()) {
					int var6 = 0;
					int var8;
					if (var5.size() > 1) {
						int var7 = 1 + (int)(Math.random() * 100.0D);
						var8 = 0;

						for (Iterator var9 = var5.iterator(); var9.hasNext(); ++var6) {
							class261 var10 = (class261)var9.next();
							int var11 = var8;
							var8 += var10.field2780;
							if (var11 <= var7 && var7 < var8) {
								break;
							}
						}

						if (var6 >= var5.size()) {
							return;
						}
					}

					class261 var12 = (class261)var5.get(var6);
					var8 = var12.field2782 & 31;
					if ((var8 <= 0 || class544.clientPreferences.getAreaSoundEffectsVolume() != 0) && (var8 != 0 || class544.clientPreferences.getSoundEffectsVolume() != 0)) {
						class432.method8480(var12, var2, var3, var4);
					}
				}
			}
		}
	}
}
