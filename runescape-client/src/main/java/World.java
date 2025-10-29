import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bn")
@Implements("World")
public class World {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lbn;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -858019443
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 330506487
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("aw")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("ap")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Lxm;"
	)
	@Export("titlebuttonSprite")
	static IndexedSprite titlebuttonSprite;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 789563243
	)
	@Export("id")
	int id;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -607869593
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 2054822665
	)
	@Export("population")
	int population;
	@ObfuscatedName("ai")
	@Export("host")
	String host;
	@ObfuscatedName("as")
	@Export("activity")
	String activity;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -428025341
	)
	@Export("location")
	int location;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1293839821
	)
	@Export("index")
	int index;
	@ObfuscatedName("ax")
	String field590;

	static {
		World_count = 0;
		World_listCount = 0;
		World_sortOption2 = new int[]{1, 1, 1, 1};
		World_sortOption1 = new int[]{0, 1, 2, 3};
	}

	World() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1018596310"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (class594.field5974.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1992403886"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (class594.field5982.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-351408165"
	)
	boolean method1535() {
		return (class594.field5967.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1789795895"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (class594.field5985.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1849323913"
	)
	boolean method1562() {
		return (class594.field5969.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1235012159"
	)
	boolean method1538() {
		return (class594.field5995.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "591500994"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (class594.field5991.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1943538074"
	)
	boolean method1569() {
		return (class594.field5996.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-46"
	)
	boolean method1541() {
		return (class594.field5986.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2135132969"
	)
	boolean method1577() {
		return (class594.field5989.rsOrdinal() & this.properties) != 0;
	}
}
