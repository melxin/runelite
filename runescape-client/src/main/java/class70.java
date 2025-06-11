import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
public class class70 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lce;"
	)
	static final class70 field973;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lce;"
	)
	static final class70 field978;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lce;"
	)
	static final class70 field963;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lce;"
	)
	static final class70 field979;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lce;"
	)
	static final class70 field965;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lce;"
	)
	static final class70 field966;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lce;"
	)
	static final class70 field977;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lce;"
	)
	static final class70 field968;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lce;"
	)
	static final class70 field969;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lce;"
	)
	static final class70 field970;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lce;"
	)
	static final class70 field971;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lce;"
	)
	static final class70 field972;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lce;"
	)
	static final class70 field967;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lce;"
	)
	static final class70 field974;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lce;"
	)
	static final class70 field975;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lce;"
	)
	static final class70 field961;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lce;"
	)
	static final class70 field962;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lce;"
	)
	static final class70 field964;

	static {
		field973 = new class70();
		field978 = new class70();
		field963 = new class70();
		field979 = new class70();
		field965 = new class70();
		field966 = new class70();
		field977 = new class70();
		field968 = new class70();
		field969 = new class70();
		field970 = new class70();
		field971 = new class70();
		field972 = new class70();
		field967 = new class70();
		field974 = new class70();
		field975 = new class70();
		field961 = new class70();
		field962 = new class70();
		field964 = new class70();
	}

	class70() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)[Lfo;",
		garbageValue = "1"
	)
	static class134[] method2209() {
		return new class134[]{class134.field1581, class134.field1580, class134.field1577, class134.field1578, class134.field1579};
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Lre;",
		garbageValue = "1510366248"
	)
	public static class445 method2210() {
		synchronized(class445.field4963) {
			if (GrandExchangeOfferNameComparator.field4812 == 0) {
				return new class445();
			} else {
				class445.field4963[--GrandExchangeOfferNameComparator.field4812].method8690();
				return class445.field4963[GrandExchangeOfferNameComparator.field4812];
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lbg;",
		garbageValue = "-880809566"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? class547.World_worlds[++World.World_listCount - 1] : null;
	}
}
