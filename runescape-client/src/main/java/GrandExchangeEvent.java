import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pf")
@Implements("GrandExchangeEvent")
public class GrandExchangeEvent {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1449538329
	)
	@Export("world")
	public final int world;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = -749291582553735905L
	)
	@Export("age")
	public final long age;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	@Export("grandExchangeOffer")
	public final GrandExchangeOffer grandExchangeOffer;
	@ObfuscatedName("ai")
	@Export("offerName")
	String offerName;
	@ObfuscatedName("al")
	@Export("previousOfferName")
	String previousOfferName;

	@ObfuscatedSignature(
		descriptor = "(Lwt;BI)V"
	)
	GrandExchangeEvent(Buffer var1, byte var2, int var3) {
		this.offerName = var1.readStringCp1252NullTerminated();
		this.previousOfferName = var1.readStringCp1252NullTerminated();
		this.world = var1.readUnsignedShort();
		this.age = var1.readLong();
		int var4 = var1.readInt();
		int var5 = var1.readInt();
		this.grandExchangeOffer = new GrandExchangeOffer();
		this.grandExchangeOffer.method8243(2);
		this.grandExchangeOffer.method8247(var2);
		this.grandExchangeOffer.unitPrice = var4;
		this.grandExchangeOffer.totalQuantity = var5;
		this.grandExchangeOffer.currentQuantity = 0;
		this.grandExchangeOffer.currentPrice = 0;
		this.grandExchangeOffer.id = var3;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1151408813"
	)
	@Export("getOfferName")
	public String getOfferName() {
		return this.offerName;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-112"
	)
	@Export("getPreviousOfferName")
	public String getPreviousOfferName() {
		return this.previousOfferName;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lrw;",
		garbageValue = "-2092466163"
	)
	public static class446 method8240() {
		synchronized(class446.field4979) {
			if (class446.field4978 == 0) {
				return new class446();
			} else {
				class446.field4979[--class446.field4978].method8744();
				return class446.field4979[class446.field4978];
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ltp;Ltp;IIIB)V",
		garbageValue = "-20"
	)
	public static void method8241(class509 var0, class509 var1, int var2, int var3, int var4) {
		class377.method7917(var0);
		class563 var5 = var0.field5288;
		DelayFadeTask.method9245(var1, var5, true);
		int var6 = var0.method9937();
		int var7 = var1.method9937();
		if (var4 == -1) {
			var4 = var0.method9937() - var2;
		}

		if (var4 != 0 && (var1 != var0 || var3 != var2)) {
			if (var2 >= 0 && var2 + var4 <= var6 && var3 >= 0 && var3 + var4 <= var7) {
				ClanChannel.method3879(var0, var2, var1, var3, var4);
			} else {
				throw new RuntimeException();
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "228"
	)
	static final int method8235(int var0, int var1) {
		int var2 = var1 * 57 + var0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 255;
	}
}
