import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pw")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("ao")
	@Export("state")
	byte state;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 450065359
	)
	@Export("id")
	public int id;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1498003283
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1742110137
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1694308953
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -758131793
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	}

	@ObfuscatedSignature(
		descriptor = "(Lve;Z)V",
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1953706289"
	)
	@Export("status")
	public int status() {
		return this.state & 7;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1428100996"
	)
	void method7880(int var1) {
		this.state &= -8;
		this.state = (byte)(this.state | var1 & 7);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1613183821"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "411642647"
	)
	void method7891(int var1) {
		this.state &= -9;
		if (var1 == 1) {
			this.state = (byte)(this.state | 8);
		}

	}
}
