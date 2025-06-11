import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pa")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("ap")
	@Export("state")
	byte state;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1452495885
	)
	@Export("id")
	public int id;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1391958347
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1599847989
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -533272101
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1416606845
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	}

	@ObfuscatedSignature(
		descriptor = "(Lwt;Z)V",
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-712850993"
	)
	@Export("status")
	public int status() {
		return this.state & 7;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "3"
	)
	void method8243(int var1) {
		this.state &= -8;
		this.state = (byte)(this.state | var1 & 7);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1178336386"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1957803218"
	)
	void method8247(int var1) {
		this.state &= -9;
		if (var1 == 1) {
			this.state = (byte)(this.state | 8);
		}

	}
}
