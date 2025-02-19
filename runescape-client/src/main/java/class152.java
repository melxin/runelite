import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
public class class152 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = -542554797265020071L
	)
	long field1738;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -2125256261
	)
	public int field1739;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lqk;"
	)
	IterableNodeDeque field1740;

	@ObfuscatedSignature(
		descriptor = "(Lvy;)V"
	)
	public class152(Buffer var1) {
		this.field1739 = -1;
		this.field1740 = new IterableNodeDeque();
		this.method3502(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "-1685629735"
	)
	void method3502(Buffer var1) {
		this.field1738 = var1.readLong();
		this.field1739 = var1.readInt();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 3) {
				var3 = new class171(this);
			} else if (var2 == 1) {
				var3 = new LoginPacket(this);
			} else if (var2 == 13) {
				var3 = new class164(this);
			} else if (var2 == 4) {
				var3 = new Sound(this);
			} else if (var2 == 6) {
				var3 = new class163(this);
			} else if (var2 == 5) {
				var3 = new class148(this);
			} else if (var2 == 2) {
				var3 = new class153(this);
			} else if (var2 == 7) {
				var3 = new class146(this);
			} else if (var2 == 14) {
				var3 = new class150(this);
			} else if (var2 == 8) {
				var3 = new class167(this);
			} else if (var2 == 9) {
				var3 = new class173(this);
			} else if (var2 == 10) {
				var3 = new class159(this);
			} else if (var2 == 11) {
				var3 = new class154(this);
			} else if (var2 == 12) {
				var3 = new class158(this);
			} else {
				if (var2 != 15) {
					throw new RuntimeException("");
				}

				var3 = new class168(this);
			}

			((class149)var3).vmethod3702(var1);
			this.field1740.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgg;S)V",
		garbageValue = "-8513"
	)
	public void method3492(ClanSettings var1) {
		if (this.field1738 == var1.field1790 && this.field1739 == var1.field1791) {
			for (class149 var2 = (class149)this.field1740.last(); var2 != null; var2 = (class149)this.field1740.previous()) {
				var2.vmethod3705(var1);
			}

			++var1.field1791;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lir;",
		garbageValue = "136513341"
	)
	public static class225 method3501() {
		return class225.field2465;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "1459962173"
	)
	public static byte[] method3494(int var0) {
		return GrandExchangeOfferWorldComparator.ByteArrayPool_getArrayBool(var0, false);
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1780899134"
	)
	static void method3503() {
		class142.compass = null;
		class158.redHintArrowSprite = null;
		WorldMapID.mapSceneSprites = null;
		class165.headIconPkSprites = null;
		WorldMapSectionType.headIconPrayerSprites = null;
		PlayerComposition.headIconHintSprites = null;
		BuddyRankComparator.mapDotSprites = null;
		class201.crossSprites = null;
		class27.field124 = null;
		ClanChannelMember.scrollBarSprites = null;
		class94.field1182 = null;
	}
}
