import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oc")
@Implements("Calendar")
public class Calendar {
	@ObfuscatedName("al")
	@Export("MONTH_NAMES_ENGLISH_GERMAN")
	static final String[][] MONTH_NAMES_ENGLISH_GERMAN;
	@ObfuscatedName("ab")
	@Export("DAYS_OF_THE_WEEK")
	static final String[] DAYS_OF_THE_WEEK;
	@ObfuscatedName("ac")
	@Export("Calendar_calendar")
	static java.util.Calendar Calendar_calendar;

	static {
		MONTH_NAMES_ENGLISH_GERMAN = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}, {"jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc"}, {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"}, {"jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec"}, {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic"}};
		DAYS_OF_THE_WEEK = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
		java.util.Calendar.getInstance();
		Calendar_calendar = java.util.Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZI)V",
		garbageValue = "273835134"
	)
	static void method8097(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
		class57.soundEffectIds[class57.soundEffectCount] = var0;
		class57.soundEffects[class57.soundEffectCount] = null;
		class57.soundLocations[class57.soundEffectCount] = var4 + (var3 << 8) + (var2 << 16);
		class57.field815[class57.soundEffectCount] = var1;
		class57.queuedSoundEffectLoops[class57.soundEffectCount] = var6;
		class57.queuedSoundEffectDelays[class57.soundEffectCount] = var7;
		class57.field808[class57.soundEffectCount] = var5;
		class57.field812[class57.soundEffectCount] = var8;
		++class57.soundEffectCount;
	}

	@ObfuscatedName("pe")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1525712423"
	)
	static void method8098(int var0) {
		Client.oculusOrbState = var0;
	}
}
