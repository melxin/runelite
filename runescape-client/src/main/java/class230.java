import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("ix")
public class class230 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	static final class230 field2511;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("an")
	Map field2515;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1532250959
	)
	int field2510;

	static {
		field2511 = new class230();
	}

	class230() {
		this.field2515 = new HashMap();
		this.field2510 = 0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILes;I)V",
		garbageValue = "-467091703"
	)
	void method4847(JSONObject var1, int var2, UrlRequester var3) {
		this.field2515.clear();

		JSONObject var4;
		try {
			var4 = var1;
			this.field2510 = var2;
			var1.getLong("lastfullsyncat");
			var1.getLong("lastcardupdatedat");
		} catch (Exception var7) {
			return;
		}

		try {
			this.method4841(var4.getJSONArray("crmcomponents"), this.field2510, var3);
		} catch (Exception var6) {
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;ILes;I)V",
		garbageValue = "-350853634"
	)
	void method4841(JSONArray var1, int var2, UrlRequester var3) throws JSONException {
		if (var1 != null) {
			for (int var4 = 0; var4 < var1.length(); ++var4) {
				JSONObject var5 = var1.getJSONObject(var4);
				if (var5.getString("game").equals("osrs") && !var5.getBoolean("removed")) {
					String var6 = var5.getString("platform");
					if (!var6.equals("mobile") && !var6.equals("android") && !var6.equals("ios")) {
						class228 var7 = new class228();

						try {
							var7.method4795(var5, var2, var3);
						} catch (Exception var9) {
						}

						if (!var7.field2497.isEmpty()) {
							String var8 = var5.getString("location");
							this.field2515.put(var8, var7);
						}
					}
				}
			}

			this.field2515 = this.method4830();
			class180.method3973();
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/Map;",
		garbageValue = "78"
	)
	Map method4830() {
		HashMap var1 = new HashMap();
		ArrayList var2 = new ArrayList();
		var2.addAll(this.field2515.entrySet());
		boolean var3 = false;

		while (!var3) {
			var3 = true;

			for (int var7 = 0; var7 < var2.size() - 1; ++var7) {
				if (((class228)((Entry)var2.get(var7)).getValue()).method4799() > ((class228)((Entry)var2.get(var7 + 1)).getValue()).method4799()) {
					Entry var4 = (Entry)var2.get(var7);
					var2.set(var7, var2.get(var7 + 1));
					var2.set(var7 + 1, var4);
					var3 = false;
				}
			}
		}

		Iterator var5 = var2.iterator();

		while (var5.hasNext()) {
			Entry var6 = (Entry)var5.next();
			var1.put(var6.getKey(), var6.getValue());
		}

		return var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Lio;",
		garbageValue = "94"
	)
	class228 method4831(String var1) {
		return (class228)this.field2515.get(var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwt;Lks;III)V",
		garbageValue = "-838032069"
	)
	public static void method4832(Buffer var0, WorldEntityCoord var1, int var2, int var3) {
		var1.method6057(Coord.method7228(var2), Coord.method7228(var3));
		var1.setZ(0);
		var1.setCurrentRotationAngle(0);
		byte var4 = var0.readByte();
		if (var4 != 0) {
			int var5 = class342.method7116(var0, var4, 0);
			int var6 = class342.method7116(var0, var4, 2);
			int var7 = class342.method7116(var0, var4, 4);
			int var8 = class342.method7116(var0, var4, 6);
			var1.method6059(var5, var6, var7, var8);
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "1"
	)
	static final int method4848(int var0, int var1, int var2, int var3) {
		return var0 * var2 - var3 * var1 >> 16;
	}
}
