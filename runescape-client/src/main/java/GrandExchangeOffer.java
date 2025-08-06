import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qz")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("al")
	@Export("state")
	byte state;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1536404221
	)
	@Export("id")
	public int id;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -2120257835
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1226304121
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1948586895
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1947550601
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	}

	@ObfuscatedSignature(
		descriptor = "(Lwj;Z)V",
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1934200389"
	)
	@Export("status")
	public int status() {
		return this.state & 7;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-144099056"
	)
	void method8544(int var1) {
		this.state &= -8;
		this.state = (byte)(this.state | var1 & 7);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "866045455"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "51"
	)
	void method8548(int var1) {
		this.state &= -9;
		if (var1 == 1) {
			this.state = (byte)(this.state | 8);
		}

	}
}
