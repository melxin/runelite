import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qk")
@Implements("GrandExchangeEvent")
public class GrandExchangeEvent {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1787296361
	)
	@Export("world")
	public final int world;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = 8132046234609306567L
	)
	@Export("age")
	public final long age;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lqg;"
	)
	@Export("grandExchangeOffer")
	public final GrandExchangeOffer grandExchangeOffer;
	@ObfuscatedName("an")
	@Export("offerName")
	String offerName;
	@ObfuscatedName("ae")
	@Export("previousOfferName")
	String previousOfferName;

	@ObfuscatedSignature(
		descriptor = "(Lxa;BI)V"
	)
	GrandExchangeEvent(Buffer var1, byte var2, int var3) {
		this.offerName = var1.readStringCp1252NullTerminated();
		this.previousOfferName = var1.readStringCp1252NullTerminated();
		this.world = var1.readUnsignedShort();
		this.age = var1.readLong();
		int var4 = var1.readInt();
		int var5 = var1.readInt();
		this.grandExchangeOffer = new GrandExchangeOffer();
		this.grandExchangeOffer.method8778(2);
		this.grandExchangeOffer.method8780(var2);
		this.grandExchangeOffer.unitPrice = var4;
		this.grandExchangeOffer.totalQuantity = var5;
		this.grandExchangeOffer.currentQuantity = 0;
		this.grandExchangeOffer.currentPrice = 0;
		this.grandExchangeOffer.id = var3;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-8"
	)
	@Export("getOfferName")
	public String getOfferName() {
		return this.offerName;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "65"
	)
	@Export("getPreviousOfferName")
	public String getPreviousOfferName() {
		return this.previousOfferName;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lut;II)Ljava/lang/Object;",
		garbageValue = "-2055203679"
	)
	public static Object method8775(DynamicArray var0, int var1) {
		class461.method9375(var0, (class586)null, true);
		if (var1 >= 0 && var1 < var0.size * 1583568339) {
			Object var2 = var0.method10673(var1);
			if (var1 < var0.size * 1583568339 - 1) {
				HttpResponse.method296(var0, var1 + 1, var0, var1, var0.size * 1583568339 - (var1 + 1));
			}

			var0.method10649(var0.size * 1583568339 - 1);
			return var2;
		} else {
			throw new RuntimeException();
		}
	}
}
