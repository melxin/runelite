import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ph")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("ab")
	@Export("state")
	byte state;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1520836929
	)
	@Export("id")
	public int id;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1156688627
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1463224135
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1566894201
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1316645795
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-68"
	)
	@Export("status")
	public int status() {
		return this.state & 7;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-543272797"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2063597236"
	)
	void method7834(int var1) {
		this.state &= -8;
		this.state = (byte)(this.state | var1 & 7);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1566771720"
	)
	void method7835(int var1) {
		this.state &= -9;
		if (var1 == 1) {
			this.state = (byte)(this.state | 8);
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "61067285"
	)
	public static void method7838() {
		Iterator var0 = class335.midiRequests.iterator();

		while (var0.hasNext()) {
			MidiRequest var1 = (MidiRequest)var0.next();
			if (var1 != null) {
				var1.midiPcmStream.clear();
				var1.midiPcmStream.method6619();
				var1.midiPcmStream.setPcmStreamVolume(0);
				var1.midiPcmStream.field3728 = 0;
				JagexCache.method4478(var1.musicTrackGroupId, var1.musicTrackFileId);
			}
		}

		class335.midiRequests.clear();
	}
}
