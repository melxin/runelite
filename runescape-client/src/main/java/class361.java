import java.util.Calendar;
import java.util.TimeZone;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("nm")
public class class361 {
	@ObfuscatedName("av")
	public static final String[][] field4066;
	@ObfuscatedName("at")
	public static final String[] field4064;
	@ObfuscatedName("ag")
	public static Calendar field4065;

	static {
		field4066 = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}, {"jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc"}, {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"}, {"jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec"}, {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic"}};
		field4064 = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
		Calendar.getInstance();
		field4065 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	}
}
