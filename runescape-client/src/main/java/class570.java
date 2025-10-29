import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vw")
public class class570 implements class476 {
	@ObfuscatedName("jj")
	@ObfuscatedGetter(
		intValue = 551565965
	)
	static int field5884;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	WorldView field5883;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -880777715
	)
	int field5880;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 543552489
	)
	int field5879;
	@ObfuscatedName("an")
	boolean field5882;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Liw;II)V",
		garbageValue = "-61741358"
	)
	public void vmethod11280(SequenceDefinition var1, int var2) {
		if (this.field5883 != null) {
			WorldView var3 = this.field5883;
			int var4 = this.field5880;
			int var5 = this.field5879;
			boolean var6 = this.field5882;
			if (class57.soundEffectCount < 50 && var1.field2500 != null && var1.field2500.containsKey(var2)) {
				ArrayList var7 = (ArrayList)var1.field2500.get(var2);
				if (!var7.isEmpty()) {
					int var8 = 0;
					int var10;
					if (var7.size() > 1) {
						int var9 = 1 + (int)(Math.random() * 100.0D);
						var10 = 0;

						for (Iterator var11 = var7.iterator(); var11.hasNext(); ++var8) {
							class217 var12 = (class217)var11.next();
							int var13 = var10;
							var10 += var12.field2325;
							if (var13 <= var9 && var9 < var10) {
								break;
							}
						}

						if (var8 >= var7.size()) {
							return;
						}
					}

					class217 var14 = (class217)var7.get(var8);
					var10 = var14.field2327 & 31;
					if ((var10 <= 0 || class468.clientPreferences.getAreaSoundEffectsVolume() != 0) && (var10 != 0 || class468.clientPreferences.getSoundEffectsVolume() != 0) && var14 != null) {
						if (var14.field2327 == 0) {
							if (var6) {
								GrandExchangeOffer.method8796(var3.id, var14.field2326, 0, 0, 0, var14.field2328, var14.field2331, 0, var1.field2511);
							}
						} else {
							int var15 = Coord.method7692(var4 - 64);
							int var16 = Coord.method7692(var5 - 64);
							GrandExchangeOffer.method8796(var3.id, var14.field2326, var15, var16, var14.field2327, var14.field2328, var14.field2331, 0, var1.field2511);
						}
					}
				}
			}

		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ldd;IIZI)V",
		garbageValue = "133741999"
	)
	public void method11277(WorldView var1, int var2, int var3, boolean var4) {
		this.field5883 = var1;
		this.field5880 = var2;
		this.field5879 = var3;
		this.field5882 = var4;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-93"
	)
	public void method11278() {
		this.field5883 = null;
	}
}
