import java.util.ArrayList;
import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mz")
public final class class328 {
	@ObfuscatedName("at")
	static final HashMap field3598;
	@ObfuscatedName("kb")
	@ObfuscatedGetter(
		intValue = 512496917
	)
	@Export("cameraZ")
	static int cameraZ;
	@ObfuscatedName("uj")
	@ObfuscatedGetter(
		intValue = 1175273517
	)
	static int field3599;

	static {
		field3598 = new HashMap();
		TimeZone var0;
		synchronized(field3598) {
			TimeZone var2 = (TimeZone)field3598.get("Europe/London");
			if (var2 == null) {
				var2 = TimeZone.getTimeZone("Europe/London");
				field3598.put("Europe/London", var2);
			}

			var0 = var2;
		}

		java.util.Calendar.getInstance(var0);
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1744438761"
	)
	static void method6475(int var0, int var1) {
		if (SecureUrlRequester.clientPreferences.getMusicVolume() != 0 && var0 != -1) {
			ArrayList var2 = new ArrayList();
			var2.add(new MusicSong(class419.field4733, var0, 0, SecureUrlRequester.clientPreferences.getMusicVolume(), false));
			UrlRequester.method3175(var2, 0, 0, 0, 0, true);
			Client.playingJingle = true;
		}

	}
}
