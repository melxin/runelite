import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
public class class106 {
	@ObfuscatedName("ot")
	@ObfuscatedGetter(
		intValue = 1925365391
	)
	@Export("selectedSpellFlags")
	static int selectedSpellFlags;
	@ObfuscatedName("st")
	@ObfuscatedSignature(
		descriptor = "Lgk;"
	)
	@Export("guestClanChannel")
	static ClanChannel guestClanChannel;

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "609674269"
	)
	public static String method3069(CharSequence var0) {
		int var2 = var0.length();
		char[] var3 = new char[var2];

		for (int var4 = 0; var4 < var2; ++var4) {
			var3[var4] = '*';
		}

		String var1 = new String(var3);
		return var1;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-29"
	)
	static void method3078() {
		if (!class544.clientPreferences.isTitleMusicDisabled()) {
			ArrayList var0 = new ArrayList();
			var0.add(new MusicSong(class544.archive6, "scape main", "", 255, false));
			class1.method9(var0, 0, 0, 0, 100, false);
		} else {
			UserComparator3.method3347(0, 0);
		}

	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(Lna;S)V",
		garbageValue = "-32485"
	)
	static void method3077(Widget var0) {
		var0.method7411();
		var0.method7444().method7176(new class110(var0));
		var0.method7444().method7175(new class111(var0));
	}
}
