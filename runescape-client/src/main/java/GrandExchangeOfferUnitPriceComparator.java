import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pt")
@Implements("GrandExchangeOfferUnitPriceComparator")
final class GrandExchangeOfferUnitPriceComparator implements Comparator {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("InvDefinition_archive")
	static AbstractArchive InvDefinition_archive;
	@ObfuscatedName("kt")
	@ObfuscatedGetter(
		intValue = 2017961867
	)
	@Export("cameraY")
	static int cameraY;

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpx;Lpx;B)I",
		garbageValue = "-126"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.unitPrice < var2.grandExchangeOffer.unitPrice ? -1 : (var2.grandExchangeOffer.unitPrice == var1.grandExchangeOffer.unitPrice ? 0 : 1);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpl;Lpl;ZLrf;I)V",
		garbageValue = "2078923736"
	)
	public static void method7855(AbstractArchive var0, AbstractArchive var1, boolean var2, Font var3) {
		class140.ItemDefinition_archive = var0;
		HttpAuthenticationHeader.ItemDefinition_modelArchive = var1;
		AuthenticationScheme.ItemDefinition_inMembersWorld = var2;
		MouseRecorder.ItemDefinition_fileCount = class140.ItemDefinition_archive.getGroupFileCount(10);
		class329.ItemDefinition_fontPlain11 = var3;
	}
}
