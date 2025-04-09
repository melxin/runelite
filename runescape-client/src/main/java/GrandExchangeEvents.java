import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("po")
@Implements("GrandExchangeEvents")
public class GrandExchangeEvents {
	@ObfuscatedName("ao")
	@Export("GrandExchangeEvents_ageComparator")
	public static Comparator GrandExchangeEvents_ageComparator;
	@ObfuscatedName("an")
	@Export("GrandExchangeEvents_priceComparator")
	public static Comparator GrandExchangeEvents_priceComparator;
	@ObfuscatedName("ae")
	@Export("GrandExchangeEvents_nameComparator")
	public static Comparator GrandExchangeEvents_nameComparator;
	@ObfuscatedName("af")
	@Export("GrandExchangeEvents_quantityComparator")
	public static Comparator GrandExchangeEvents_quantityComparator;
	@ObfuscatedName("as")
	@Export("events")
	public final List events;

	static {
		GrandExchangeEvents_ageComparator = new GrandExchangeOfferAgeComparator();
		new GrandExchangeOfferWorldComparator();
		GrandExchangeEvents_priceComparator = new GrandExchangeOfferUnitPriceComparator();
		GrandExchangeEvents_nameComparator = new GrandExchangeOfferNameComparator();
		GrandExchangeEvents_quantityComparator = new GrandExchangeOfferTotalQuantityComparator();
	}

	@ObfuscatedSignature(
		descriptor = "(Lve;Z)V",
		garbageValue = "1"
	)
	public GrandExchangeEvents(Buffer var1, boolean var2) {
		int var3 = var1.readUnsignedShort();
		boolean var4 = var1.readUnsignedByte() == 1;
		byte var5;
		if (var4) {
			var5 = 1;
		} else {
			var5 = 0;
		}

		int var6 = var1.readUnsignedShort();
		this.events = new ArrayList(var6);

		for (int var7 = 0; var7 < var6; ++var7) {
			this.events.add(new GrandExchangeEvent(var1, var5, var3));
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;ZI)V",
		garbageValue = "-360307586"
	)
	@Export("sort")
	public void sort(Comparator var1, boolean var2) {
		if (var2) {
			Collections.sort(this.events, var1);
		} else {
			Collections.sort(this.events, Collections.reverseOrder(var1));
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lph;III)[Lwc;",
		garbageValue = "1649493608"
	)
	public static SpritePixels[] method7833(AbstractArchive var0, int var1, int var2) {
		return !class362.method7335(var0, var1, var2) ? null : class493.method9400();
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(Lkm;IIIZI)V",
		garbageValue = "1234908462"
	)
	static void method7827(SequenceDefinition var0, int var1, int var2, int var3, boolean var4) {
		if (Client.soundEffectCount < 50) {
			if (var0.field3011 != null && var0.field3011.containsKey(var1)) {
				ArrayList var5 = (ArrayList)var0.field3011.get(var1);
				if (!var5.isEmpty()) {
					int var6 = 0;
					int var8;
					if (var5.size() > 1) {
						int var7 = 1 + (int)(Math.random() * 100.0D);
						var8 = 0;

						for (Iterator var9 = var5.iterator(); var9.hasNext(); ++var6) {
							class262 var10 = (class262)var9.next();
							int var11 = var8;
							var8 += var10.field2867;
							if (var11 <= var7 && var7 < var8) {
								break;
							}
						}

						if (var6 >= var5.size()) {
							return;
						}
					}

					class262 var15 = (class262)var5.get(var6);
					var8 = var15.field2868 & 31;
					if ((var8 <= 0 || Renderable.clientPreferences.getAreaSoundEffectsVolume() != 0) && (var8 != 0 || Renderable.clientPreferences.getSoundEffectsVolume() != 0)) {
						if (var15 != null) {
							if (var15.field2868 == 0) {
								if (!var4) {
									return;
								}

								Client.soundLocations[Client.soundEffectCount] = 0;
							} else {
								int var13 = (var2 - 64) / 128;
								int var14 = (var3 - 64) / 128;
								Client.soundLocations[Client.soundEffectCount] = (var14 << 8) + (var13 << 16) + var15.field2868;
							}

							Client.soundEffectIds[Client.soundEffectCount] = var15.field2870;
							Client.queuedSoundEffectLoops[Client.soundEffectCount] = var15.field2866;
							Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0;
							Client.soundEffects[Client.soundEffectCount] = null;
							Client.field552[Client.soundEffectCount] = var15.field2869;
							++Client.soundEffectCount;
						}

					}
				}
			}
		}
	}
}
