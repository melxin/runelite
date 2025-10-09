import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qo")
@Implements("GrandExchangeEvent")
public class GrandExchangeEvent {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -2100278039
	)
	@Export("world")
	public final int world;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = 7632065372937797571L
	)
	@Export("age")
	public final long age;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	@Export("grandExchangeOffer")
	public final GrandExchangeOffer grandExchangeOffer;
	@ObfuscatedName("aj")
	@Export("offerName")
	String offerName;
	@ObfuscatedName("ah")
	@Export("previousOfferName")
	String previousOfferName;

	@ObfuscatedSignature(
		descriptor = "(Lwj;BI)V"
	)
	GrandExchangeEvent(Buffer var1, byte var2, int var3) {
		this.offerName = var1.readStringCp1252NullTerminated();
		this.previousOfferName = var1.readStringCp1252NullTerminated();
		this.world = var1.readUnsignedShort();
		this.age = var1.readLong();
		int var4 = var1.readInt();
		int var5 = var1.readInt();
		this.grandExchangeOffer = new GrandExchangeOffer();
		this.grandExchangeOffer.method8584(2);
		this.grandExchangeOffer.method8585(var2);
		this.grandExchangeOffer.unitPrice = var4;
		this.grandExchangeOffer.totalQuantity = var5;
		this.grandExchangeOffer.currentQuantity = 0;
		this.grandExchangeOffer.currentPrice = 0;
		this.grandExchangeOffer.id = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1445448445"
	)
	@Export("getOfferName")
	public String getOfferName() {
		return this.offerName;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-261236548"
	)
	@Export("getPreviousOfferName")
	public String getPreviousOfferName() {
		return this.previousOfferName;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ltl;III)V",
		garbageValue = "-1962533056"
	)
	public static void method8573(DynamicArray var0, int var1, int var2) {
		PacketBufferNode.method7052(var0, (class572)null, true);
		if (var1 != 0) {
			if (var2 >= 0 && var2 < var0.size * 479682119 && var1 >= 0 && var2 + var1 <= var0.size * 479682119) {
				if (var2 < var0.size * 479682119 - var1) {
					class167.method4091(var0, var2 + var1, var0, var2, var0.size * 479682119 - (var2 + var1));
				}

				var0.method10440(var0.size * 479682119 - var1);
			} else {
				throw new RuntimeException();
			}
		}
	}
}
