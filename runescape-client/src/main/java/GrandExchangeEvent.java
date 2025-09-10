import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qi")
@Implements("GrandExchangeEvent")
public class GrandExchangeEvent {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1355047097
	)
	@Export("world")
	public final int world;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = -2009867072126087687L
	)
	@Export("age")
	public final long age;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lqt;"
	)
	@Export("grandExchangeOffer")
	public final GrandExchangeOffer grandExchangeOffer;
	@ObfuscatedName("ac")
	@Export("offerName")
	String offerName;
	@ObfuscatedName("ap")
	@Export("previousOfferName")
	String previousOfferName;

	@ObfuscatedSignature(
		descriptor = "(Lwb;BI)V"
	)
	GrandExchangeEvent(Buffer var1, byte var2, int var3) {
		this.offerName = var1.readStringCp1252NullTerminated();
		this.previousOfferName = var1.readStringCp1252NullTerminated();
		this.world = var1.readUnsignedShort();
		this.age = var1.readLong();
		int var4 = var1.readShortSmart();
		int var5 = var1.readShortSmart();
		this.grandExchangeOffer = new GrandExchangeOffer();
		this.grandExchangeOffer.method8513(2);
		this.grandExchangeOffer.method8525(var2);
		this.grandExchangeOffer.unitPrice = var4;
		this.grandExchangeOffer.totalQuantity = var5;
		this.grandExchangeOffer.currentQuantity = 0;
		this.grandExchangeOffer.currentPrice = 0;
		this.grandExchangeOffer.id = var3;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1237531853"
	)
	@Export("getOfferName")
	public String getOfferName() {
		return this.offerName;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "542971699"
	)
	@Export("getPreviousOfferName")
	public String getPreviousOfferName() {
		return this.previousOfferName;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Lxk;",
		garbageValue = "-2116850015"
	)
	@Export("FillMode_values")
	public static FillMode[] FillMode_values() {
		return new FillMode[]{FillMode.SOLID, FillMode.field6002, FillMode.field6001};
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([J[JIII)V",
		garbageValue = "-2142951697"
	)
	public static void method8509(long[] var0, long[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			long var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			long var8 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var8;
			long var10 = Long.MAX_VALUE == var6 ? 0L : 1L;

			for (int var12 = var2; var12 < var3; ++var12) {
				if (var0[var12] < ((long)var12 & var10) + var6) {
					long var13 = var0[var12];
					var0[var12] = var0[var5];
					var0[var5] = var13;
					long var15 = var1[var12];
					var1[var12] = var1[var5];
					var1[var5++] = var15;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var8;
			method8509(var0, var1, var2, var5 - 1);
			method8509(var0, var1, var5 + 1, var3);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1399594449"
	)
	public static String method8505(String var0) {
		StringBuilder var1 = new StringBuilder(var0.length());
		int var2 = 0;
		int var3 = -1;

		for (int var4 = 0; var4 < var0.length(); ++var4) {
			char var5 = var0.charAt(var4);
			if (var5 == '<') {
				var1.append(var0.substring(var2, var4));
				var3 = var4;
			} else if (var5 == '>' && var3 != -1) {
				String var6 = var0.substring(var3 + 1, var4);
				var3 = -1;
				if (var6.equals("lt")) {
					var1.append("<");
				} else if (var6.equals("gt")) {
					var1.append(">");
				} else if (var6.equals("br")) {
					var1.append("\n");
				}

				var2 = var4 + 1;
			}
		}

		if (var2 < var0.length()) {
			var1.append(var0.substring(var2, var0.length()));
		}

		return var1.toString();
	}
}
