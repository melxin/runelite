import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ni")
public class class356 implements Comparator {
	class356() {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lnr;Lnr;I)I",
		garbageValue = "-1603958214"
	)
	int method7600(class349 var1, class349 var2) {
		return var1.field3989 - var2.field3989;
	}

	public int compare(Object var1, Object var2) {
		return this.method7600((class349)var1, (class349)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "369229713"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		class222.addChatMessage(var0, var1, var2, (String)null);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Date;",
		garbageValue = "2011786078"
	)
	static Date method7608() throws ParseException {
		SimpleDateFormat var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
		var0.setLenient(false);
		StringBuilder var1 = new StringBuilder();
		String[] var2 = Login.field694;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			String var4 = var2[var3];
			if (var4 == null) {
				WorldMapEvent.method7177("Date not valid.", "Please ensure all characters are populated.", "");
				return null;
			}

			var1.append(var4);
		}

		var1.append("12");
		return var0.parse(var1.toString());
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([II)Lut;",
		garbageValue = "1719321819"
	)
	public static DynamicArray method7604(int[] var0) {
		DynamicArray var1 = new DynamicArray(class586.field5937, true);
		var1.array = var0;
		var1.size = var0.length * -1205286309;
		var1.field5587 = var0.length;
		return var1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	static void method7610() {
		Iterator var0 = Client.worldViewManager.iterator();

		while (var0.hasNext()) {
			WorldView var1 = (WorldView)var0.next();

			for (ObjectSound var2 = (ObjectSound)var1.method2789().last(); var2 != null; var2 = (ObjectSound)var1.method2789().previous()) {
				var2.method2301();
			}
		}

	}
}
