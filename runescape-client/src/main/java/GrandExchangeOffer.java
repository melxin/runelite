import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qt")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("vy")
	@ObfuscatedGetter(
		intValue = 551145169
	)
	static int field5046;
	@ObfuscatedName("af")
	@Export("state")
	byte state;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -2108203757
	)
	@Export("id")
	public int id;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -137307291
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 764557899
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 746622905
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 674439313
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	}

	@ObfuscatedSignature(
		descriptor = "(Lwb;Z)V",
		garbageValue = "0"
	)
	public GrandExchangeOffer(Buffer var1, boolean var2) {
		this.state = var1.readByte();
		this.id = var1.readUnsignedShort();
		this.unitPrice = var1.readShortSmart();
		this.totalQuantity = var1.readShortSmart();
		this.currentQuantity = var1.readShortSmart();
		this.currentPrice = var1.readShortSmart();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1569431757"
	)
	@Export("status")
	public int status() {
		return this.state & 7;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "27867843"
	)
	void method8513(int var1) {
		this.state &= -8;
		this.state = (byte)(this.state | var1 & 7);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "4"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1985911132"
	)
	void method8525(int var1) {
		this.state &= -9;
		if (var1 == 1) {
			this.state = (byte)(this.state | 8);
		}

	}
}
