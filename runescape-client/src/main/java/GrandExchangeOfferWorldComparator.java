import java.util.Arrays;
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pl")
@Implements("GrandExchangeOfferWorldComparator")
final class GrandExchangeOfferWorldComparator implements Comparator {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lpf;Lpf;I)I",
		garbageValue = "-1768089583"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.world < var2.world ? -1 : (var2.world == var1.world ? 0 : 1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "15"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		class518.addChatMessage(var0, var1, var2, (String)null);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ltp;Ltp;I)V",
		garbageValue = "-1071324675"
	)
	public static void method8233(class509 var0, class509 var1) {
		if (var0 != null && var0.method9937() > 1) {
			class573.method10775(var0);
			if (var1 != null) {
				class573.method10775(var1);
			}

			int var2 = var0.method9937();
			if (var1 != null && var1.method9937() < var2) {
				throw new RuntimeException();
			} else {
				if (var0.field5288 == class563.field5600) {
					if (var1 == null) {
						MusicPatchPcmStream.method7142(var0.method9965(), class510.field5297, 0, var2 - 1);
					} else if (class563.field5600 == var1.field5288) {
						MusicPatchPcmStream.method7142(var0.method9965(), var1.method9965(), 0, var2 - 1);
					} else if (class563.field5594 == var1.field5288) {
						class158.method3730(var0.method9965(), var1.method9973(), 0, var2 - 1);
					} else {
						AbstractSocket.method9821(var0.method9965(), var1.method9936(), 0, var2 - 1);
					}
				} else if (var0.field5288 == class563.field5594) {
					if (var1 == null) {
						Arrays.sort(var0.method9973(), 0, var2);
					} else if (class563.field5600 == var1.field5288) {
						UrlRequester.method3350(var0.method9973(), var1.method9965(), 0, var2 - 1);
					} else if (class563.field5594 == var1.field5288) {
						ArchiveDisk.method9889(var0.method9973(), var1.method9973(), 0, var2 - 1);
					} else {
						WorldMapIcon_1.method6195(var0.method9973(), var1.method9936(), 0, var2 - 1);
					}
				} else {
					if (var0.field5288 != class563.field5595) {
						throw new RuntimeException();
					}

					if (var1 == null) {
						Arrays.sort(var0.method9936(), 0, var2);
					} else if (class563.field5600 == var1.field5288) {
						ObjectSound.quicksortStringsWithCorrespondingIntegers((String[])((String[])var0.method9936()), var1.method9965(), 0, var2 - 1);
					} else if (class563.field5594 == var1.field5288) {
						class496.method9774((String[])((String[])var0.method9936()), var1.method9973(), 0, var2 - 1);
					} else {
						class275.method6047((String[])((String[])var0.method9936()), var1.method9936(), 0, var2 - 1);
					}
				}

			}
		}
	}
}
