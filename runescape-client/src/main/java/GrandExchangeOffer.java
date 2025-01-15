import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pu")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("ay")
	@Export("state")
	byte state;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1143661643
	)
	@Export("id")
	public int id;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 708435427
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -219996791
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -2134705951
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2086438493
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	}

	@ObfuscatedSignature(
		descriptor = "(Lvy;Z)V",
		garbageValue = "0"
	)
	public GrandExchangeOffer(Buffer var1, boolean var2) {
		this.state = var1.readByte();
		this.id = var1.readUnsignedShort();
		this.unitPrice = var1.readInt();
		this.totalQuantity = var1.readInt();
		this.currentQuantity = var1.readInt();
		this.currentPrice = var1.readInt();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "305720230"
	)
	@Export("status")
	public int status() {
		return this.state & 7;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1473569240"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "854210133"
	)
	void method7918(int var1) {
		this.state &= -8;
		this.state = (byte)(this.state | var1 & 7);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-923443826"
	)
	void method7919(int var1) {
		this.state &= -9;
		if (var1 == 1) {
			this.state = (byte)(this.state | 8);
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)D",
		garbageValue = "849686759"
	)
	public static double method7927(int var0) {
		int var1 = class507.field5154[var0 & 2047];
		return (double)var1 / 65536.0D;
	}
}
