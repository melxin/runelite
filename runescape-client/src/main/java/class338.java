import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ns")
public class class338 {
	@ObfuscatedName("ab")
	public static final List field3892;
	@ObfuscatedName("at")
	public static ArrayList field3900;
	@ObfuscatedName("ag")
	public static LinkedList field3893;
	@ObfuscatedName("aj")
	@Export("midiRequests")
	public static ArrayList midiRequests;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	static AbstractArchive field3895;
	@ObfuscatedName("aq")
	public static ArrayList field3891;
	@ObfuscatedName("ac")
	static ArrayList field3897;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -422679635
	)
	@Export("musicPlayerStatus")
	public static int musicPlayerStatus;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 361870235
	)
	public static int field3899;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 2021054315
	)
	public static int field3896;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1667258595
	)
	public static int field3901;

	static {
		field3892 = new ArrayList();
		field3900 = null;
		field3893 = new LinkedList();
		midiRequests = new ArrayList(3);
		field3891 = new ArrayList(3);
		field3897 = new ArrayList();
		musicPlayerStatus = 0;
		field3899 = 0;
		field3896 = 0;
		field3901 = 0;
	}

	@ObfuscatedName("oa")
	@ObfuscatedSignature(
		descriptor = "(Lok;I)I",
		garbageValue = "-2012709330"
	)
	@Export("getWidgetFlags2")
	static int getWidgetFlags2(Widget var0) {
		WidgetConfigNode var1 = (WidgetConfigNode)Client.widgetFlags.get((long)var0.id);
		int var3 = var0.childIndex * -2066937045;
		WidgetConfigNode var4 = var1;

		WidgetConfigNode var2;
		while (true) {
			if (var4 == null) {
				var2 = null;
				break;
			}

			if (var3 >= var4.start && var3 <= var4.end) {
				var2 = var4;
				break;
			}

			var4 = var4.nextWidgetConfigNode;
		}

		if (var2 != null) {
			return var2.method7507();
		} else {
			int var6 = var0.flags;
			int var5 = var6 >> 1 & 1023;
			return var5;
		}
	}
}
