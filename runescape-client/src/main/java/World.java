import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cw")
@Implements("World")
public class World {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1052883307
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 181984891
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("af")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("aa")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	@Export("World_request")
	static UrlRequest World_request;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -590058237
	)
	@Export("id")
	int id;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -523959329
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 604347655
	)
	@Export("population")
	int population;
	@ObfuscatedName("ak")
	@Export("host")
	String host;
	@ObfuscatedName("aj")
	@Export("activity")
	String activity;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1097775933
	)
	@Export("location")
	int location;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1062506993
	)
	@Export("index")
	int index;
	@ObfuscatedName("ag")
	String field836;

	static {
		World_count = 0;
		World_listCount = 0;
		World_sortOption2 = new int[]{1, 1, 1, 1};
		World_sortOption1 = new int[]{0, 1, 2, 3};
	}

	World() {
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "246613437"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (class563.field5538.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-264302643"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (class563.field5536.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "187636436"
	)
	boolean method1880() {
		return (class563.field5521.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "594723083"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (class563.field5549.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1836304183"
	)
	boolean method1840() {
		return (class563.field5522.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-436978703"
	)
	boolean method1838() {
		return (class563.field5529.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1246777390"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (class563.field5533.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-549315627"
	)
	boolean method1877() {
		return (class563.field5550.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	boolean method1851() {
		return (class563.field5528.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "84"
	)
	boolean method1841() {
		return (class563.field5540.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-470359150"
	)
	static int method1850(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field885 - 7.0D) * 256.0D);
	}

	@ObfuscatedName("oz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)Ljava/lang/String;",
		garbageValue = "93"
	)
	static String method1887(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://";
		if (Client.gameBuild == 1) {
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) {
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) {
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) {
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) {
			var0 = "local";
		}

		String var3 = "";
		if (Sound.field1770 != null) {
			var3 = "/p=" + Sound.field1770;
		}

		String var4 = "runescape.com";
		return var2 + var0 + "." + var4 + "/l=" + class144.clientLanguage + "/a=" + class535.field5358 + var3 + "/";
	}
}
