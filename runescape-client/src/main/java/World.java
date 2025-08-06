import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bg")
@Implements("World")
public class World {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lbg;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1879435535
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 116227959
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("ap")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("am")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1429075557
	)
	@Export("id")
	int id;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -560888867
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -387466825
	)
	@Export("population")
	int population;
	@ObfuscatedName("ai")
	@Export("host")
	String host;
	@ObfuscatedName("ak")
	@Export("activity")
	String activity;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 2035366861
	)
	@Export("location")
	int location;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 2120750173
	)
	@Export("index")
	int index;
	@ObfuscatedName("ax")
	String field617;

	static {
		World_count = 0;
		World_listCount = 0;
		World_sortOption2 = new int[]{1, 1, 1, 1};
		World_sortOption1 = new int[]{0, 1, 2, 3};
	}

	World() {
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-59"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (class578.field5781.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "121"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (class578.field5767.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "14042"
	)
	boolean method1517() {
		return (class578.field5752.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1569278338"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (class578.field5753.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1231303799"
	)
	boolean method1490() {
		return (class578.field5754.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "53"
	)
	boolean method1491() {
		return (class578.field5780.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2083937041"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (class578.field5776.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1468471796"
	)
	boolean method1545() {
		return (class578.field5766.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "127"
	)
	boolean method1494() {
		return (class578.field5759.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2087555805"
	)
	boolean method1509() {
		return (class578.field5778.rsOrdinal() & this.properties) != 0;
	}
}
