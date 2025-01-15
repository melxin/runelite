import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("World")
public class World {
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[Lcx;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -661025249
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 972925949
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("ax")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("at")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("soundEffectsArchive")
	static Archive soundEffectsArchive;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -32054383
	)
	@Export("id")
	int id;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 950082965
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -785393975
	)
	@Export("population")
	int population;
	@ObfuscatedName("af")
	@Export("host")
	String host;
	@ObfuscatedName("aa")
	@Export("activity")
	String activity;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -419021337
	)
	@Export("location")
	int location;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -384975721
	)
	@Export("index")
	int index;
	@ObfuscatedName("av")
	String field819;

	static {
		World_count = 0;
		World_listCount = 0;
		World_sortOption2 = new int[]{1, 1, 1, 1};
		World_sortOption1 = new int[]{0, 1, 2, 3};
	}

	World() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-646232155"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (class552.field5434.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1734303995"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (class552.field5442.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "848046499"
	)
	boolean method1965() {
		return (class552.field5426.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-726478743"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (class552.field5428.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-76"
	)
	boolean method1977() {
		return (class552.field5445.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	boolean method1963() {
		return (class552.field5431.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1219185298"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (class552.field5451.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "224954319"
	)
	boolean method2016() {
		return (class552.field5456.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-670579797"
	)
	boolean method1966() {
		return (class552.field5441.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "34"
	)
	boolean method1984() {
		return (class552.field5447.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-729625320"
	)
	static void method1957() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var0.stream1 != null) {
				UserList.pcmStreamMixer.removeSubStream(var0.stream1);
				var0.stream1 = null;
			}

			if (var0.stream2 != null) {
				UserList.pcmStreamMixer.removeSubStream(var0.stream2);
				var0.stream2 = null;
			}
		}

		ObjectSound.objectSounds.clear();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1610335580"
	)
	public static void method1994() {
		EnumComposition.EnumDefinition_cached.clear();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "712989272"
	)
	public static void method1960() {
		WorldMapElement.HitSplatDefinition_cached.clear();
	}
}
